package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

public class WeightObservationContainment extends Containment {
  public SelectAqlField<WeightObservation> WEIGHT_OBSERVATION = new AqlFieldImp<WeightObservation>(WeightObservation.class, "", "WeightObservation", WeightObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(WeightObservation.class, "/data[at0002]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<Cluster> DEVICE = new AqlFieldImp<Cluster>(WeightObservation.class, "/protocol[at0015]/items[at0020]", "device", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(WeightObservation.class, "/protocol[at0015]/items[at0027]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(WeightObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(WeightObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(WeightObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<WeightAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<WeightAnyEventChoice>(WeightObservation.class, "/data[at0002]/events[at0003]", "anyEvent", WeightAnyEventChoice.class, this);

  private WeightObservationContainment() {
    super("openEHR-EHR-OBSERVATION.body_weight.v2");
  }

  public static WeightObservationContainment getInstance() {
    return new WeightObservationContainment();
  }
}
