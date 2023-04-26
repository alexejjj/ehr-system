package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class PhysicalCharacteristicsEvaluationContainment extends Containment {
  public SelectAqlField<PhysicalCharacteristicsEvaluation> PHYSICAL_CHARACTERISTICS_EVALUATION = new AqlFieldImp<PhysicalCharacteristicsEvaluation>(PhysicalCharacteristicsEvaluation.class, "", "PhysicalCharacteristicsEvaluation", PhysicalCharacteristicsEvaluation.class, this);

  public SelectAqlField<String> HAIR_COLOR_VALUE = new AqlFieldImp<String>(PhysicalCharacteristicsEvaluation.class, "/data[at0001]/items[at0003]/value|value", "hairColorValue", String.class, this);

  public SelectAqlField<NullFlavour> HAIR_COLOR_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PhysicalCharacteristicsEvaluation.class, "/data[at0001]/items[at0003]/null_flavour|defining_code", "hairColorNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> EYE_COLOR_VALUE = new AqlFieldImp<String>(PhysicalCharacteristicsEvaluation.class, "/data[at0001]/items[at0004]/value|value", "eyeColorValue", String.class, this);

  public SelectAqlField<NullFlavour> EYE_COLOR_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PhysicalCharacteristicsEvaluation.class, "/data[at0001]/items[at0004]/null_flavour|defining_code", "eyeColorNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> SKIN_TONE_VALUE = new AqlFieldImp<String>(PhysicalCharacteristicsEvaluation.class, "/data[at0001]/items[at0005]/value|value", "skinToneValue", String.class, this);

  public SelectAqlField<NullFlavour> SKIN_TONE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PhysicalCharacteristicsEvaluation.class, "/data[at0001]/items[at0005]/null_flavour|defining_code", "skinToneNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(PhysicalCharacteristicsEvaluation.class, "/protocol[at0009]/items[at0011]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(PhysicalCharacteristicsEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(PhysicalCharacteristicsEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(PhysicalCharacteristicsEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private PhysicalCharacteristicsEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.physical_characteristics.v0");
  }

  public static PhysicalCharacteristicsEvaluationContainment getInstance() {
    return new PhysicalCharacteristicsEvaluationContainment();
  }
}
