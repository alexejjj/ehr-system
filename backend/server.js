const express = require('express');
const app = express();
const bodyParser = require('body-parser');
const cors = require('cors');
const mongoose = require('mongoose');
const jwt = require('jsonwebtoken')
const bcrypt = require('bcrypt')


const DoctorSchema = mongoose.Schema({
    firstName: String,
    lastName: String,
    email: String,
    position: String,
    password: String,
    patients: []
})

const PatientSchema = mongoose.Schema({
    firstName: String,
    lastName: String,
    birthDate: Date,
    ehrId: String
})

const Doctor = mongoose.model('Doctor', DoctorSchema)
const Patient = mongoose.model('Patient', PatientSchema)


const PORT = 4000;
const doctorRoutes = express.Router()


app.use(cors());
app.use(bodyParser.json());
app.use('/doctor', doctorRoutes)


app.get('/patients', async (req, res) => {
    const token = req.headers['x-access-token']?.split(' ')[1].split('.')[1]
    const rawPayload = Buffer.from(token, 'base64').toString()
    const userEmail = JSON.parse(rawPayload).email
    await Doctor.findOne({email: userEmail}).then(user => {
        Patient.find({_id: {$in: user.patients}}, (err, patients) => {
            res.json(patients)
        })
    })
})


app.post('/new', async (req, res) => {
    const token = req.headers['x-access-token']?.split(' ')[1].split('.')[1]
    const rawPayload = Buffer.from(token, 'base64').toString()
    const userEmail = JSON.parse(rawPayload).email
    const data = req.body
    const patient = new Patient({
        firstName: data.firstName,
        lastName: data.lastName,
        birthDate: data.birthDate,
        ehrId: data.ehr.slice(1, -1)
    })
    await patient.save()
    await Doctor.findOne({email: userEmail}).then(user => {
        user.patients.push(patient._id)
        user.save()
    })
})

app.get('/patient/:id', async (req, res) => {
    console.log(req.params.id)
    await Patient.findOne({ehrId: req.params.id}).then(patient => {
        res.json(patient)
    })
})


app.post('/register', async (req, res) => {
    const doctor = req.body
    const takenEmail = await Doctor.findOne({email: doctor.email})

    if (takenEmail) {
        res.json({message: 'Current email is already in use'})
    } else {
        doctor.password = await bcrypt.hash(req.body.password, 10)

        const newUser = new Doctor({
            firstName: doctor.firstName.toLowerCase(),
            lastName: doctor.lastName.toLowerCase(),
            email: doctor.email.toLowerCase(),
            password: doctor.password,
            position: doctor.position,
            patients: []
        })
        await newUser.save()
        res.json({message: 'User has been registered'})
    }
})


app.post('/login', (req, res) => {
    const loginUser = req.body
    console.log('Login')
    Doctor.findOne({email: loginUser.email}).then(foundUser => {
        if (!foundUser) {
            return res.json({message: 'Email or password is invalid'})
        }
        bcrypt.compare(loginUser.password, foundUser.password).then(isCorrect => {
            if (isCorrect) {
                const payload = {
                    id: foundUser._id,
                    email: foundUser.email
                }
                jwt.sign(payload, process.env.JWT_SECRET, {expiresIn: 86400}, (err, token) => {
                        if (err) {
                            return res.json({message: err})
                        }
                        return res.json({
                            message: 'Success',
                            token: 'Bearer ' + token,
                            user: {
                                firstName: foundUser.firstName,
                                lastName: foundUser.lastName,
                                email: foundUser.email,
                                patients: foundUser.patients
                            }
                        })
                    }
                )
            } else {
                return res.json({
                    message: 'Email or password is invalid'
                })
            }
        })
    })
})


app.get('/isUserAuth', verifyJWT, (req, res) => {
    console.log(req)
    res.json({isLoggedIn: true, email: req.user.email})
})


function verifyJWT(req, res, next) {
    const token = req.headers['x-access-token']?.split(' ')[1]
    if (token) {
        jwt.verify(token, process.env.JWT_SECRET, (error, decoded) => {
            if (error) {
                return res.json({
                    isLoggedIn: false,
                    message: 'Fail to authenticate'
                })
            }
            req.user = {}
            req.user.id = decoded.id
            req.user.email = decoded.email
            next()
        })
    } else {
        res.json({
            isLoggedIn: false,
            message: 'Incorrect token given'
        })
    }
}


doctorRoutes.route('/').get(function (req, res) {
    Doctor.find(function (err, users) {
        if (err) {
            console.log('err')
        } else {
            res.json(users)
        }
    })
})

doctorRoutes.route('/:id').get(function (req, res) {
    let id = req.params.id;
    Doctor.findById(id, function (err, user) {
        res.json(user)
    })
})

doctorRoutes.route('/add').post(function (req, res) {
    let user = new Doctor(req.body)
    user.save().then(user => {
        res.status(200).json({'user': 'user added successfully'});
    }).catch(err => {
        res.status(400).send('adding new user failed');
    })
})


// // mongoose.connect(`mongodb+srv://my_user:my_password@cluster0.sorgyd8.mongodb.net/openehr?retryWrites=true&w=majority`,
// mongoose.connect('mongodb+srv://my_user:my_password@medical-app-cluster0.9gsbrnz.mongodb.net/test?retryWrites=true&w=majority',
// { useUnifiedTopology: true }).catch(err => console.log(err))


// mongoose.connect('mongodb://localhost:4001/my-mongodb', {useNewUrlParser: true, useUnifiedTopology: true})
//     .then(() => {
//         console.log('Подключение к MongoDB успешно!');
//     })
//     .catch((err) => {
//         console.error('Ошибка подключения к MongoDB:', err);
//     });


// Подключение к MongoDB
mongoose.connect('mongodb://localhost:4040/alexMongo', {
    useNewUrlParser: true,
    useUnifiedTopology: true
})
    .then(() => {
        console.log('Подключение к MongoDB успешно установлено');
    })
    .catch((err) => {
        console.error('Ошибка подключения к MongoDB:', err);
    });


// const connection = mongoose.connection;
//
// connection.once('open', () => {
//     console.log("MongoDB database connection established successfully")
// })

app.listen(PORT, () => {
    console.log("Server is running on Port: " + PORT)
})
