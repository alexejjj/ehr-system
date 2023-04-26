package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.372587+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
public interface PhysicalExaminationFindingsAnyEventChoice {
  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  String getPositionValue();

  void setPositionValue(String positionValue);

  NevusExamEnCluster getNevusExamEn();

  void setNevusExamEn(NevusExamEnCluster nevusExamEn);

  NullFlavour getPositionNullFlavourDefiningCode();

  void setPositionNullFlavourDefiningCode(NullFlavour positionNullFlavourDefiningCode);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);
}
