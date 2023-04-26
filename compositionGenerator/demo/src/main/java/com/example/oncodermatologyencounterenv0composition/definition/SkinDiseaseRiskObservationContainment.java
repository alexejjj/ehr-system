package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
import com.nedap.archie.rm.generic.PartyProxy;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

public class SkinDiseaseRiskObservationContainment extends Containment {
  public SelectAqlField<SkinDiseaseRiskObservation> SKIN_DISEASE_RISK_OBSERVATION = new AqlFieldImp<SkinDiseaseRiskObservation>(SkinDiseaseRiskObservation.class, "", "SkinDiseaseRiskObservation", SkinDiseaseRiskObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(SkinDiseaseRiskObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<ItemTree> ITEM_TREE = new AqlFieldImp<ItemTree>(SkinDiseaseRiskObservation.class, "/protocol[at0020]", "itemTree", ItemTree.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(SkinDiseaseRiskObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(SkinDiseaseRiskObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(SkinDiseaseRiskObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<SkinDiseaseRiskAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<SkinDiseaseRiskAnyEventChoice>(SkinDiseaseRiskObservation.class, "/data[at0001]/events[at0002]", "anyEvent", SkinDiseaseRiskAnyEventChoice.class, this);

  private SkinDiseaseRiskObservationContainment() {
    super("openEHR-EHR-OBSERVATION.skin_oncology_risk_en.v0");
  }

  public static SkinDiseaseRiskObservationContainment getInstance() {
    return new SkinDiseaseRiskObservationContainment();
  }
}
