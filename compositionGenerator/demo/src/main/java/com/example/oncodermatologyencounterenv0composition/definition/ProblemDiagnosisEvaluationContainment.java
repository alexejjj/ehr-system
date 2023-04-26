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

public class ProblemDiagnosisEvaluationContainment extends Containment {
  public SelectAqlField<ProblemDiagnosisEvaluation> PROBLEM_DIAGNOSIS_EVALUATION = new AqlFieldImp<ProblemDiagnosisEvaluation>(ProblemDiagnosisEvaluation.class, "", "ProblemDiagnosisEvaluation", ProblemDiagnosisEvaluation.class, this);

  public SelectAqlField<NullFlavour> PROBLEM_DIAGNOSIS_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "problemDiagnosisNameNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> CLINICAL_DESCRIPTION_VALUE = new AqlFieldImp<String>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0009]/value|value", "clinicalDescriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> CLINICAL_DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0009]/null_flavour|defining_code", "clinicalDescriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_BODY_SITE = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0039]", "structuredBodySite", Cluster.class, this);

  public ListSelectAqlField<Cluster> SPECIFIC_DETAILS = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0043]", "specificDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> STATUS = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0046]", "status", Cluster.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0069]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0069]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation.class, "/protocol[at0032]/items[at0071]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ProblemDiagnosisEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ProblemDiagnosisEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ProblemDiagnosisEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<ProblemDiagnosisProblemDiagnosisNameChoice> PROBLEM_DIAGNOSIS_NAME = new AqlFieldImp<ProblemDiagnosisProblemDiagnosisNameChoice>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0002]/value", "problemDiagnosisName", ProblemDiagnosisProblemDiagnosisNameChoice.class, this);

  private ProblemDiagnosisEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.problem_diagnosis.v1");
  }

  public static ProblemDiagnosisEvaluationContainment getInstance() {
    return new ProblemDiagnosisEvaluationContainment();
  }
}
