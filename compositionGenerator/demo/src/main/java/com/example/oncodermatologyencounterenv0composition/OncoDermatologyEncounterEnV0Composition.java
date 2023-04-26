package com.example.oncodermatologyencounterenv0composition;

import com.example.oncodermatologyencounterenv0composition.definition.FamilyHistoryEvaluation;
import com.example.oncodermatologyencounterenv0composition.definition.HeightObservation;
import com.example.oncodermatologyencounterenv0composition.definition.PhysicalCharacteristicsEvaluation;
import com.example.oncodermatologyencounterenv0composition.definition.PhysicalExaminationFindingsObservation;
import com.example.oncodermatologyencounterenv0composition.definition.ProblemDiagnosisEvaluation;
import com.example.oncodermatologyencounterenv0composition.definition.SkinDiseaseRiskObservation;
import com.example.oncodermatologyencounterenv0composition.definition.StoryHistoryObservation;
import com.example.oncodermatologyencounterenv0composition.definition.WeightObservation;
import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Id;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.annotations.Template;
import org.ehrbase.client.classgenerator.interfaces.CompositionEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import org.ehrbase.client.openehrclient.VersionUid;

@Entity
@Archetype("openEHR-EHR-COMPOSITION.encounter.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.259338+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
@Template("Onco-dermatology encounter en.v0")
public class OncoDermatologyEncounterEnV0Composition implements CompositionEntity {
  /**
   * Path: Onco-dermatology encounter.v0/category
   */
  @Path("/category|defining_code")
  private Category categoryDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/context/Extension
   * Description: Additional information required to capture local context or to align with other reference models/formalisms.
   * Comment: e.g. Local hospital departmental infomation or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/context/other_context[at0001]/items[at0002]")
  private List<Cluster> extension;

  /**
   * Path: Onco-dermatology encounter.v0/context/start_time
   */
  @Path("/context/start_time|value")
  private TemporalAccessor startTimeValue;

  /**
   * Path: Onco-dermatology encounter.v0/context/participations
   */
  @Path("/context/participations")
  private List<Participation> participations;

  /**
   * Path: Onco-dermatology encounter.v0/context/end_time
   */
  @Path("/context/end_time|value")
  private TemporalAccessor endTimeValue;

  /**
   * Path: Onco-dermatology encounter.v0/context/location
   */
  @Path("/context/location")
  private String location;

  /**
   * Path: Onco-dermatology encounter.v0/context/health_care_facility
   */
  @Path("/context/health_care_facility")
  private PartyIdentified healthCareFacility;

  /**
   * Path: Onco-dermatology encounter.v0/context/setting
   */
  @Path("/context/setting|defining_code")
  private Setting settingDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Weight
   * Description: Measurement of the body weight of an individual.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Health and lifestyle']/items[openEHR-EHR-OBSERVATION.body_weight.v2 and name/value='Weight']")
  private WeightObservation weight;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Height
   * Description: Height, or body length, is measured from crown of head to sole of foot.
   * Comment: Height is measured with the individual in a standing position and body length in a recumbent position.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Health and lifestyle']/items[openEHR-EHR-OBSERVATION.height.v2 and name/value='Height']")
  private HeightObservation height;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Physical characteristics
   * Description: Enduring physical characteristics of an individual.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Health and lifestyle']/items[openEHR-EHR-EVALUATION.physical_characteristics.v0]")
  private PhysicalCharacteristicsEvaluation physicalCharacteristics;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk
   * Description: skin oncology risk
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Health and lifestyle']/items[openEHR-EHR-OBSERVATION.skin_oncology_risk_en.v0 and name/value='Skin disease risk']")
  private SkinDiseaseRiskObservation skinDiseaseRisk;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Story/History
   * Description: The subjective clinical history of the subject of care as recorded directly by the subject, or reported to a clinician by the subject or a carer.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Anamnesis']/items[openEHR-EHR-OBSERVATION.story.v1]")
  private StoryHistoryObservation storyHistory;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history
   * Description: Summary information about the significant health-related problems found in family members.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Anamnesis']/items[openEHR-EHR-EVALUATION.family_history.v2]")
  private FamilyHistoryEvaluation familyHistory;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings
   * Description: Findings observed during the physical examination of a subject of care.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Nevus']/items[openEHR-EHR-OBSERVATION.exam.v1]")
  private PhysicalExaminationFindingsObservation physicalExaminationFindings;

  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis
   * Description: Details about a single identified health condition, injury, disability or any other issue which impacts on the physical, mental and/or social well-being of an individual.
   * Comment: Clear delineation between the scope of a problem versus a diagnosis is not easy to achieve in practice. For the purposes of clinical documentation with this archetype, problem and diagnosis are regarded as a continuum, with increasing levels of detail and supportive evidence usually providing weight towards the label of 'diagnosis'.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Additional']/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]")
  private ProblemDiagnosisEvaluation problemDiagnosis;

  /**
   * Path: Onco-dermatology encounter.v0/composer
   */
  @Path("/composer")
  private PartyProxy composer;

  /**
   * Path: Onco-dermatology encounter.v0/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Onco-dermatology encounter.v0/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Onco-dermatology encounter.v0/territory
   */
  @Path("/territory")
  private Territory territory;

  @Id
  private VersionUid versionUid;

  public void setCategoryDefiningCode(Category categoryDefiningCode) {
     this.categoryDefiningCode = categoryDefiningCode;
  }

  public Category getCategoryDefiningCode() {
     return this.categoryDefiningCode ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setStartTimeValue(TemporalAccessor startTimeValue) {
     this.startTimeValue = startTimeValue;
  }

  public TemporalAccessor getStartTimeValue() {
     return this.startTimeValue ;
  }

  public void setParticipations(List<Participation> participations) {
     this.participations = participations;
  }

  public List<Participation> getParticipations() {
     return this.participations ;
  }

  public void setEndTimeValue(TemporalAccessor endTimeValue) {
     this.endTimeValue = endTimeValue;
  }

  public TemporalAccessor getEndTimeValue() {
     return this.endTimeValue ;
  }

  public void setLocation(String location) {
     this.location = location;
  }

  public String getLocation() {
     return this.location ;
  }

  public void setHealthCareFacility(PartyIdentified healthCareFacility) {
     this.healthCareFacility = healthCareFacility;
  }

  public PartyIdentified getHealthCareFacility() {
     return this.healthCareFacility ;
  }

  public void setSettingDefiningCode(Setting settingDefiningCode) {
     this.settingDefiningCode = settingDefiningCode;
  }

  public Setting getSettingDefiningCode() {
     return this.settingDefiningCode ;
  }

  public void setWeight(WeightObservation weight) {
     this.weight = weight;
  }

  public WeightObservation getWeight() {
     return this.weight ;
  }

  public void setHeight(HeightObservation height) {
     this.height = height;
  }

  public HeightObservation getHeight() {
     return this.height ;
  }

  public void setPhysicalCharacteristics(
      PhysicalCharacteristicsEvaluation physicalCharacteristics) {
     this.physicalCharacteristics = physicalCharacteristics;
  }

  public PhysicalCharacteristicsEvaluation getPhysicalCharacteristics() {
     return this.physicalCharacteristics ;
  }

  public void setSkinDiseaseRisk(SkinDiseaseRiskObservation skinDiseaseRisk) {
     this.skinDiseaseRisk = skinDiseaseRisk;
  }

  public SkinDiseaseRiskObservation getSkinDiseaseRisk() {
     return this.skinDiseaseRisk ;
  }

  public void setStoryHistory(StoryHistoryObservation storyHistory) {
     this.storyHistory = storyHistory;
  }

  public StoryHistoryObservation getStoryHistory() {
     return this.storyHistory ;
  }

  public void setFamilyHistory(FamilyHistoryEvaluation familyHistory) {
     this.familyHistory = familyHistory;
  }

  public FamilyHistoryEvaluation getFamilyHistory() {
     return this.familyHistory ;
  }

  public void setPhysicalExaminationFindings(
      PhysicalExaminationFindingsObservation physicalExaminationFindings) {
     this.physicalExaminationFindings = physicalExaminationFindings;
  }

  public PhysicalExaminationFindingsObservation getPhysicalExaminationFindings() {
     return this.physicalExaminationFindings ;
  }

  public void setProblemDiagnosis(ProblemDiagnosisEvaluation problemDiagnosis) {
     this.problemDiagnosis = problemDiagnosis;
  }

  public ProblemDiagnosisEvaluation getProblemDiagnosis() {
     return this.problemDiagnosis ;
  }

  public void setComposer(PartyProxy composer) {
     this.composer = composer;
  }

  public PartyProxy getComposer() {
     return this.composer ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTerritory(Territory territory) {
     this.territory = territory;
  }

  public Territory getTerritory() {
     return this.territory ;
  }

  public VersionUid getVersionUid() {
     return this.versionUid ;
  }

  public void setVersionUid(VersionUid versionUid) {
     this.versionUid = versionUid;
  }
}
