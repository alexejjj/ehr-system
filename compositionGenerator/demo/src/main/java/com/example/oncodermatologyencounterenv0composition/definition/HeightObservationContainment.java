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

public class HeightObservationContainment extends Containment {
  public SelectAqlField<HeightObservation> HEIGHT_OBSERVATION = new AqlFieldImp<HeightObservation>(HeightObservation.class, "", "HeightObservation", HeightObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(HeightObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<Cluster> DEVICE = new AqlFieldImp<Cluster>(HeightObservation.class, "/protocol[at0007]/items[at0011]", "device", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(HeightObservation.class, "/protocol[at0007]/items[at0022]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(HeightObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(HeightObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(HeightObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<HeightAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<HeightAnyEventChoice>(HeightObservation.class, "/data[at0001]/events[at0002]", "anyEvent", HeightAnyEventChoice.class, this);

  private HeightObservationContainment() {
    super("openEHR-EHR-OBSERVATION.height.v2");
  }

  public static HeightObservationContainment getInstance() {
    return new HeightObservationContainment();
  }
}
