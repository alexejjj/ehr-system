import React, {useState} from 'react'
import {motion, AnimateSharedLayout} from 'framer-motion'
import Chart from 'react-apexcharts'
import classes from './Card.module.css'
import {AiOutlineClose} from "react-icons/ai";


const Card = ({title, value, icon, chartType}) => {
    const [isCardOpened, setIsCardOpened] = useState(false)


    return (
        <AnimateSharedLayout>
            {
                isCardOpened ? (
                    <LargeCard title={title} setIsCardOpened={() => setIsCardOpened(false)} chartType={chartType}/>
                ) : (
                    <SmallCard title={title} icon={icon} value={value} setIsCardOpened={() => setIsCardOpened(true)}/>
                )
            }
        </AnimateSharedLayout>
    )
}


const SmallCard = ({title, value, icon, setIsCardOpened}) => {
    return (
        <motion.div layoutId="expandableCard" onClick={setIsCardOpened} className={classes.card}>
            <div className={classes.card__icon}>{icon}</div>
            <div className={classes.card__text__area}>
                <span className={classes.card__title}>{title}</span>
                <span className={classes.card__value}>{value}</span>
            </div>
        </motion.div>
    )
}


const LargeCard = ({title, value, setIsCardOpened, chartType}) => {
    const data = {
    options: {
      chart: {
        type: "area",
        height: "auto",
      },

      dropShadow: {
        enabled: false,
        enabledOnSeries: undefined,
        top: 0,
        left: 0,
        blur: 3,
        color: "#000",
        opacity: 0.35,
      },

      fill: {
        colors: ["#fff"],
        type: "gradient",
      },
      dataLabels: {
        enabled: false,
      },
      stroke: {
        curve: "smooth",
        colors: ["white"],
      },
      tooltip: {
        x: {
          format: "dd/MM/yy HH:mm",
        },
      },
      grid: {
        show: true,
      },
      xaxis: {
        type: "datetime",
        categories: [
          "2018-09-19T00:00:00.000Z",
          "2018-09-19T01:30:00.000Z",
          "2018-09-19T02:30:00.000Z",
          "2018-09-19T03:30:00.000Z",
          "2018-09-19T04:30:00.000Z",
          "2018-09-19T05:30:00.000Z",
          "2018-09-19T06:30:00.000Z",
        ],
      },
    },
  };


    return (
        <motion.div layoutId="expandableCard" className={classes.large__card}>
                <div className={classes.chart__title__area}>
                    <span className={classes.chart__title}>{title}</span>
                    <button className={classes.close__btn} onClick={setIsCardOpened}><AiOutlineClose size={20}/></button>
                </div>
                <div className={classes.chart__container}>
                    <Chart options={data.options} style={{backgroundColor: 'white'}}
                           series={[{name: "Expenses", data: [10, 25, 15, 30, 12, 15, 20]}]}
                           type={chartType}/>
                </div>
        </motion.div>
    )
}


export default Card;
