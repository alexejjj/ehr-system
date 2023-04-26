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

public class StoryHistoryObservationContainment extends Containment {
  public SelectAqlField<StoryHistoryObservation> STORY_HISTORY_OBSERVATION = new AqlFieldImp<StoryHistoryObservation>(StoryHistoryObservation.class, "", "StoryHistoryObservation", StoryHistoryObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(StoryHistoryObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(StoryHistoryObservation.class, "/protocol[at0007]/items[at0008]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(StoryHistoryObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(StoryHistoryObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(StoryHistoryObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<StoryHistoryAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<StoryHistoryAnyEventChoice>(StoryHistoryObservation.class, "/data[at0001]/events[at0002]", "anyEvent", StoryHistoryAnyEventChoice.class, this);

  private StoryHistoryObservationContainment() {
    super("openEHR-EHR-OBSERVATION.story.v1");
  }

  public static StoryHistoryObservationContainment getInstance() {
    return new StoryHistoryObservationContainment();
  }
}
