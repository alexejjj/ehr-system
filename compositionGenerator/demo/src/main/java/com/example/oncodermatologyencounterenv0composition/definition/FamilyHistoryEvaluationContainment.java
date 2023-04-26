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

public class FamilyHistoryEvaluationContainment extends Containment {
  public SelectAqlField<FamilyHistoryEvaluation> FAMILY_HISTORY_EVALUATION = new AqlFieldImp<FamilyHistoryEvaluation>(FamilyHistoryEvaluation.class, "", "FamilyHistoryEvaluation", FamilyHistoryEvaluation.class, this);

  public SelectAqlField<String> SUMMARY_VALUE = new AqlFieldImp<String>(FamilyHistoryEvaluation.class, "/data[at0001]/items[at0002]/value|value", "summaryValue", String.class, this);

  public SelectAqlField<NullFlavour> SUMMARY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(FamilyHistoryEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "summaryNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<FamilyHistoryPerProblemCluster> PER_PROBLEM = new ListAqlFieldImp<FamilyHistoryPerProblemCluster>(FamilyHistoryEvaluation.class, "/data[at0001]/items[at0028]", "perProblem", FamilyHistoryPerProblemCluster.class, this);

  public ListSelectAqlField<Cluster> MULTIMEDIA = new ListAqlFieldImp<Cluster>(FamilyHistoryEvaluation.class, "/data[at0001]/items[at0053]", "multimedia", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(FamilyHistoryEvaluation.class, "/protocol[at0025]/items[at0045]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(FamilyHistoryEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(FamilyHistoryEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(FamilyHistoryEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private FamilyHistoryEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.family_history.v2");
  }

  public static FamilyHistoryEvaluationContainment getInstance() {
    return new FamilyHistoryEvaluationContainment();
  }
}
