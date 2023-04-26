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
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;

public class OncoDermatologyEncounterEnV0CompositionContainment extends Containment {
  public SelectAqlField<OncoDermatologyEncounterEnV0Composition> ONCO_DERMATOLOGY_ENCOUNTER_EN_V0_COMPOSITION = new AqlFieldImp<OncoDermatologyEncounterEnV0Composition>(OncoDermatologyEncounterEnV0Composition.class, "", "OncoDermatologyEncounterEnV0Composition", OncoDermatologyEncounterEnV0Composition.class, this);

  public SelectAqlField<Category> CATEGORY_DEFINING_CODE = new AqlFieldImp<Category>(OncoDermatologyEncounterEnV0Composition.class, "/category|defining_code", "categoryDefiningCode", Category.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(OncoDermatologyEncounterEnV0Composition.class, "/context/other_context[at0001]/items[at0002]", "extension", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(OncoDermatologyEncounterEnV0Composition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(OncoDermatologyEncounterEnV0Composition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(OncoDermatologyEncounterEnV0Composition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(OncoDermatologyEncounterEnV0Composition.class, "/context/location", "location", String.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(OncoDermatologyEncounterEnV0Composition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<Setting> SETTING_DEFINING_CODE = new AqlFieldImp<Setting>(OncoDermatologyEncounterEnV0Composition.class, "/context/setting|defining_code", "settingDefiningCode", Setting.class, this);

  public SelectAqlField<WeightObservation> WEIGHT = new AqlFieldImp<WeightObservation>(OncoDermatologyEncounterEnV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.body_weight.v2]", "weight", WeightObservation.class, this);

  public SelectAqlField<HeightObservation> HEIGHT = new AqlFieldImp<HeightObservation>(OncoDermatologyEncounterEnV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.height.v2]", "height", HeightObservation.class, this);

  public SelectAqlField<PhysicalCharacteristicsEvaluation> PHYSICAL_CHARACTERISTICS = new AqlFieldImp<PhysicalCharacteristicsEvaluation>(OncoDermatologyEncounterEnV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.physical_characteristics.v0]", "physicalCharacteristics", PhysicalCharacteristicsEvaluation.class, this);

  public SelectAqlField<SkinDiseaseRiskObservation> SKIN_DISEASE_RISK = new AqlFieldImp<SkinDiseaseRiskObservation>(OncoDermatologyEncounterEnV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.skin_oncology_risk_en.v0]", "skinDiseaseRisk", SkinDiseaseRiskObservation.class, this);

  public SelectAqlField<StoryHistoryObservation> STORY_HISTORY = new AqlFieldImp<StoryHistoryObservation>(OncoDermatologyEncounterEnV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.story.v1]", "storyHistory", StoryHistoryObservation.class, this);

  public SelectAqlField<FamilyHistoryEvaluation> FAMILY_HISTORY = new AqlFieldImp<FamilyHistoryEvaluation>(OncoDermatologyEncounterEnV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.family_history.v2]", "familyHistory", FamilyHistoryEvaluation.class, this);

  public SelectAqlField<PhysicalExaminationFindingsObservation> PHYSICAL_EXAMINATION_FINDINGS = new AqlFieldImp<PhysicalExaminationFindingsObservation>(OncoDermatologyEncounterEnV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.exam.v1]", "physicalExaminationFindings", PhysicalExaminationFindingsObservation.class, this);

  public SelectAqlField<ProblemDiagnosisEvaluation> PROBLEM_DIAGNOSIS = new AqlFieldImp<ProblemDiagnosisEvaluation>(OncoDermatologyEncounterEnV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]", "problemDiagnosis", ProblemDiagnosisEvaluation.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(OncoDermatologyEncounterEnV0Composition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(OncoDermatologyEncounterEnV0Composition.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(OncoDermatologyEncounterEnV0Composition.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(OncoDermatologyEncounterEnV0Composition.class, "/territory", "territory", Territory.class, this);

  private OncoDermatologyEncounterEnV0CompositionContainment() {
    super("openEHR-EHR-COMPOSITION.encounter.v1");
  }

  public static OncoDermatologyEncounterEnV0CompositionContainment getInstance() {
    return new OncoDermatologyEncounterEnV0CompositionContainment();
  }
}
