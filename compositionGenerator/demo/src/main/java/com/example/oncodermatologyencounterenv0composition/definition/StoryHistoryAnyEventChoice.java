package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.354537+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
public interface StoryHistoryAnyEventChoice {
  List<StoryHistoryWhenDidTheLesionAppearElement> getWhenDidTheLesionAppear();

  void setWhenDidTheLesionAppear(
      List<StoryHistoryWhenDidTheLesionAppearElement> whenDidTheLesionAppear);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  List<Cluster> getStructuredDetail();

  void setStructuredDetail(List<Cluster> structuredDetail);

  List<StoryHistoryDoYouHaveAHistoryOfPsoriasisElement> getDoYouHaveAHistoryOfPsoriasis();

  void setDoYouHaveAHistoryOfPsoriasis(
      List<StoryHistoryDoYouHaveAHistoryOfPsoriasisElement> doYouHaveAHistoryOfPsoriasis);
}
