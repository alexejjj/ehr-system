package com.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import com.example.oncodermatologyencounterenv0composition.OncoDermatologyEncounterEnV0Composition;
import com.example.oncodermatologyencounterenv0composition.definition.BordersDefiningCode;
import com.example.oncodermatologyencounterenv0composition.definition.DoesTheSkinTanInTheSunDefiningCode;
import com.example.oncodermatologyencounterenv0composition.definition.DominantColorDefiningCode;
import com.example.oncodermatologyencounterenv0composition.definition.FamilyHistoryEvaluation;
import com.example.oncodermatologyencounterenv0composition.definition.FamilyHistoryEvaluationContainment;
import com.example.oncodermatologyencounterenv0composition.definition.FamilyHistoryPerProblemCluster;
import com.example.oncodermatologyencounterenv0composition.definition.FrecklesDefiningCode;
import com.example.oncodermatologyencounterenv0composition.definition.HeightAnyEventChoice;
import com.example.oncodermatologyencounterenv0composition.definition.HeightAnyEventPointEvent;
import com.example.oncodermatologyencounterenv0composition.definition.HeightObservation;
import com.example.oncodermatologyencounterenv0composition.definition.HowOftenDoYouHaveVacationInTheSouthDefiningCode;
import com.example.oncodermatologyencounterenv0composition.definition.NevusExamEnCluster;
import com.example.oncodermatologyencounterenv0composition.definition.PhysicalCharacteristicsEvaluation;
import com.example.oncodermatologyencounterenv0composition.definition.PhysicalExaminationFindingsAnyEventChoice;
import com.example.oncodermatologyencounterenv0composition.definition.PhysicalExaminationFindingsAnyEventPointEvent;
import com.example.oncodermatologyencounterenv0composition.definition.PhysicalExaminationFindingsObservation;
import com.example.oncodermatologyencounterenv0composition.definition.ProblemDiagnosisEvaluation;
import com.example.oncodermatologyencounterenv0composition.definition.ProblemDiagnosisProblemDiagnosisNameChoice;
import com.example.oncodermatologyencounterenv0composition.definition.ProblemDiagnosisProblemDiagnosisNameDvText;
import com.example.oncodermatologyencounterenv0composition.definition.ShapeDefiningCode;
import com.example.oncodermatologyencounterenv0composition.definition.SkinDiseaseRiskAnyEventChoice;
import com.example.oncodermatologyencounterenv0composition.definition.SkinDiseaseRiskAnyEventPointEvent;
import com.example.oncodermatologyencounterenv0composition.definition.SkinDiseaseRiskObservation;
import com.example.oncodermatologyencounterenv0composition.definition.SportDefiningCode;
import com.example.oncodermatologyencounterenv0composition.definition.StoryHistoryAnyEventChoice;
import com.example.oncodermatologyencounterenv0composition.definition.StoryHistoryAnyEventPointEvent;
import com.example.oncodermatologyencounterenv0composition.definition.StoryHistoryDoYouHaveAHistoryOfPsoriasisElement;
import com.example.oncodermatologyencounterenv0composition.definition.StoryHistoryObservation;
import com.example.oncodermatologyencounterenv0composition.definition.StoryHistoryWhenDidTheLesionAppearElement;
import com.example.oncodermatologyencounterenv0composition.definition.WeightAnyEventChoice;
import com.example.oncodermatologyencounterenv0composition.definition.WeightAnyEventPointEvent;
import com.example.oncodermatologyencounterenv0composition.definition.WeightObservation;
import com.nedap.archie.openehrtestrm.Cluster;
import com.nedap.archie.rm.RMObject;
import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.History;
import com.nedap.archie.rm.datatypes.CodePhrase;
import com.nedap.archie.rm.datavalues.encapsulated.DvMultimedia;
import com.nedap.archie.rm.generic.PartyProxy;
import com.nedap.archie.rm.support.identification.TerminologyId;

import org.apache.commons.collections.map.Flat3Map;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import org.ehrbase.client.flattener.Unflattener;
import org.ehrbase.serialisation.RMDataFormat;
import org.ehrbase.serialisation.flatencoding.FlatFormat;
import org.ehrbase.serialisation.flatencoding.FlatJasonProvider;
import org.ehrbase.serialisation.flatencoding.FlatJson;
import org.ehrbase.serialisation.flatencoding.std.marshal.FlatJsonMarshaller;
import org.ehrbase.serialisation.jsonencoding.CanonicalJson;
import org.ehrbase.webtemplate.parser.AqlPath;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;
import org.joda.time.DateTimeZone;
import org.openehr.schemas.v1.HISTORY;




public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {
        LocalDateTime localDateTime = LocalDateTime.from(new Date().toInstant().atZone(ZoneId.of("UTC")));
        OncoDermatologyEncounterEnV0Composition composition = new OncoDermatologyEncounterEnV0Composition();
       
        WeightObservation weight = new WeightObservation();
        List<WeightAnyEventChoice> weightList = new ArrayList<>();
        
        WeightAnyEventPointEvent weightAnyEventPointEvent = new WeightAnyEventPointEvent();
        weightAnyEventPointEvent.setWeightMagnitude(70.2);
        weightAnyEventPointEvent.setWeightUnits("kg");
        weightAnyEventPointEvent.setTimeValue(localDateTime);
        weightList.add(weightAnyEventPointEvent);
        weight.setAnyEvent(weightList);
        weight.setLanguage(Language.EN);
        weight.setOriginValue(localDateTime);
        

        FamilyHistoryPerProblemCluster fCluster = new FamilyHistoryPerProblemCluster();
        fCluster.setCasesValue(true);
        fCluster.setDescriptionValue("Family history description");
        fCluster.setProblemDiagnosisNameValue("Diagnosis name");
        
       
        List<HeightAnyEventChoice> heightList = new ArrayList<>();
        HeightObservation height = new HeightObservation();
        HeightAnyEventPointEvent heightAnyEventPointEvent = new HeightAnyEventPointEvent();
        heightAnyEventPointEvent.setHeightMagnitude(177.4);
        heightAnyEventPointEvent.setHeightUnits("cm");
        heightAnyEventPointEvent.setTimeValue(localDateTime);
        heightList.add(heightAnyEventPointEvent);
        height.setAnyEvent(heightList);
        height.setLanguage(Language.EN);
        height.setOriginValue(localDateTime);



        
        PhysicalCharacteristicsEvaluation physicalCharacteristics = new PhysicalCharacteristicsEvaluation();
        physicalCharacteristics.setEyeColorValue("blue");
        physicalCharacteristics.setHairColorValue("black");
        physicalCharacteristics.setSkinToneValue("white");
        physicalCharacteristics.setLanguage(Language.EN);
        



        SkinDiseaseRiskObservation skinDiseaseRisk = new SkinDiseaseRiskObservation();
        skinDiseaseRisk.setLanguage(Language.EN);
        skinDiseaseRisk.setOriginValue(localDateTime);

        SkinDiseaseRiskAnyEventPointEvent skinDiseaseRiskAnyEventPointEvent = new SkinDiseaseRiskAnyEventPointEvent();
        List<SkinDiseaseRiskAnyEventChoice> skinDiseaseList = new ArrayList<>();
        skinDiseaseRiskAnyEventPointEvent.setDoYouUseSunscreenInSummerValue(true);
        skinDiseaseRiskAnyEventPointEvent.setDoesTheSkinTurnRedWhenSunburnedValue(false);
        skinDiseaseRiskAnyEventPointEvent.setDoesTheSkinTanInTheSunDefiningCode(DoesTheSkinTanInTheSunDefiningCode.FAST_AND_STRONG);
        skinDiseaseRiskAnyEventPointEvent.setFrecklesDefiningCode(FrecklesDefiningCode.MANY);
        skinDiseaseRiskAnyEventPointEvent.setHowOftenDoYouHaveVacationInTheSouthDefiningCode(HowOftenDoYouHaveVacationInTheSouthDefiningCode.N10_DAYS_PER_YEAR);
        skinDiseaseRiskAnyEventPointEvent.setSportDefiningCode(SportDefiningCode.OTHER_OUTDOOR_SPORTS);
        skinDiseaseRiskAnyEventPointEvent.setTimeValue(localDateTime);
        
        skinDiseaseList.add(skinDiseaseRiskAnyEventPointEvent);
        skinDiseaseRisk.setAnyEvent(skinDiseaseList);


        

        FamilyHistoryEvaluation familyHistoryEvaluation = new FamilyHistoryEvaluation();
        familyHistoryEvaluation.setSummaryValue("Some summary");
        familyHistoryEvaluation.setLanguage(Language.EN);

        List<FamilyHistoryPerProblemCluster> lClusters = new ArrayList<>();
        lClusters.add(fCluster);

        familyHistoryEvaluation.setPerProblem(lClusters);



        ProblemDiagnosisProblemDiagnosisNameDvText problemDiagnosisNameDvText = new ProblemDiagnosisProblemDiagnosisNameDvText();
        problemDiagnosisNameDvText.setProblemDiagnosisNameValue("Some Diagnoses");
        ProblemDiagnosisEvaluation problemDiagnosisEvaluation = new ProblemDiagnosisEvaluation();
        problemDiagnosisEvaluation.setCommentValue("Some comment");
        problemDiagnosisEvaluation.setClinicalDescriptionValue("Some clinical description");
        problemDiagnosisEvaluation.setProblemDiagnosisName(problemDiagnosisNameDvText);
        problemDiagnosisEvaluation.setLanguage(Language.EN);







        StoryHistoryObservation storyHistoryObservation = new StoryHistoryObservation();
        StoryHistoryDoYouHaveAHistoryOfPsoriasisElement element = new StoryHistoryDoYouHaveAHistoryOfPsoriasisElement();
        StoryHistoryWhenDidTheLesionAppearElement appearElement = new StoryHistoryWhenDidTheLesionAppearElement();
        StoryHistoryAnyEventPointEvent storyHistoryAnyEventPointEvent = new StoryHistoryAnyEventPointEvent();
        List<StoryHistoryWhenDidTheLesionAppearElement> appearElementsList = new ArrayList<>();
        List<StoryHistoryDoYouHaveAHistoryOfPsoriasisElement> elementsList = new ArrayList<>();
        List<StoryHistoryAnyEventChoice> lAnyEventPointEvents = new ArrayList<>();
        appearElement.setValue("Recently");
        element.setValue("Yes");
        appearElementsList.add(appearElement);
        elementsList.add(element);
        storyHistoryAnyEventPointEvent.setDoYouHaveAHistoryOfPsoriasis(elementsList);
        storyHistoryAnyEventPointEvent.setWhenDidTheLesionAppear(appearElementsList);
        lAnyEventPointEvents.add(storyHistoryAnyEventPointEvent); 
        storyHistoryObservation.setAnyEvent(lAnyEventPointEvents);
        storyHistoryObservation.setOriginValue(localDateTime);
        storyHistoryObservation.setLanguage(Language.EN);



        
        
        PhysicalExaminationFindingsObservation physicalExaminationFindings = new PhysicalExaminationFindingsObservation();
        PhysicalExaminationFindingsAnyEventPointEvent physicalExaminationFindingsAnyEventPointEvent = new PhysicalExaminationFindingsAnyEventPointEvent();
        NevusExamEnCluster cluster = new NevusExamEnCluster();
        cluster.setAreaMagnitude(10.4);
        cluster.setAreaUnits("mm2");
        cluster.setHeightXMagnitude(2.12);
        cluster.setWidthYMagnitude(3.25);
        cluster.setHeightXUnits("mm");
        cluster.setWidthYUnits("mm");
        cluster.setBordersDefiningCode(BordersDefiningCode.CLEAR);
        cluster.setDominantColorDefiningCode(DominantColorDefiningCode.GREY);
        cluster.setInclusionsValue(true);
        cluster.setShapeDefiningCode(ShapeDefiningCode.ROUND);
        cluster.setSymmetryValue(true);
        

        DvMultimedia photo = new DvMultimedia();
        CodePhrase charset = new CodePhrase();
        charset.setCodeString("");
        TerminologyId terminologyId = new TerminologyId();
        terminologyId.setValue("");
        charset.setTerminologyId(terminologyId);
    
      //  charset.setCodeString("iVBORw0KGgoAAAANSUhEUgAAB0YAAAP6CAYAAAAE9T6UAAAAinpUWHRSYXcgcHJvZmlsZSB0eXBlIGV4aWYAAHjaVY7RDcMwCET");
        photo.setCharset(charset);
        photo.setSize(100);
        photo.setMediaType(charset);
        
    
        File fi = new File("/home/vladimir/openehr/amU7Ol90nUE.jpg");
        byte[] fileContent;
        try {
            fileContent = Files.readAllBytes(fi.toPath());
            photo.setData(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        

        cluster.setPhoto(photo);


        


        
        
        physicalExaminationFindingsAnyEventPointEvent.setNevusExamEn(cluster);
        List<PhysicalExaminationFindingsAnyEventChoice> lAnyEventChoices = new ArrayList<>();
        lAnyEventChoices.add(physicalExaminationFindingsAnyEventPointEvent);
        physicalExaminationFindings.setAnyEvent(lAnyEventChoices);
        physicalExaminationFindings.setLanguage(Language.EN);
        physicalExaminationFindings.setOriginValue(localDateTime);
        physicalCharacteristics.setLanguage(Language.EN);
        
        
        
        composition.setWeight(weight);
        composition.setHeight(height);
    
        composition.setPhysicalCharacteristics(physicalCharacteristics);
        composition.setSkinDiseaseRisk(skinDiseaseRisk);

        composition.setLanguage(Language.EN);
        composition.setTerritory(Territory.RU);
        composition.setStartTimeValue(localDateTime);
        composition.setEndTimeValue(localDateTime);
        composition.setSettingDefiningCode(Setting.EMERGENCY_CARE);
         
         
        composition.setFamilyHistory(familyHistoryEvaluation);
        composition.setProblemDiagnosis(problemDiagnosisEvaluation);
        composition.setStoryHistory(storyHistoryObservation);
        composition.setPhysicalExaminationFindings(physicalExaminationFindings);
    

        TemplateProvider provider = new OncoDermatologyTemplateProvider();
        
        Unflattener unflat = new Unflattener(provider);
        RMObject rmObject = unflat.unflatten(composition);

        RMDataFormat flat = new FlatJasonProvider(provider).buildFlatJson(FlatFormat.SIM_SDT, "Onco-dermatology encounter en.v0");
    
        CanonicalJson json = new CanonicalJson();
        
        String fileName = "/home/vladimir/openehr/compositions/full_flat_composition.json";
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            
            String text = flat.marshal(rmObject);
            byte[] mybytes = text.getBytes();
            
            fos.write(mybytes);
        }
    }
}
