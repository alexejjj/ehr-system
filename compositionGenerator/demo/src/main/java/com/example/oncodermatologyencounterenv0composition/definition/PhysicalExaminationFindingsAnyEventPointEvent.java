package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.PointEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.371120+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
@OptionFor("POINT_EVENT")
public class PhysicalExaminationFindingsAnyEventPointEvent implements PointEventEntity, PhysicalExaminationFindingsAnyEventChoice {
  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/nevus_exam_en
   * Description: nevus_exam_en
   */
  @Path("/data[at0003]/items[openEHR-EHR-CLUSTER.nevus_exam_en.v0]")
  private NevusExamEnCluster nevusExamEn;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/Position
   * Description: The body position of the subject during the examination.
   */
  @Path("/state[at0009]/items[at0013]/value|value")
  private String positionValue;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/Tree/Position/null_flavour
   */
  @Path("/state[at0009]/items[at0013]/null_flavour|defining_code")
  private NullFlavour positionNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setNevusExamEn(NevusExamEnCluster nevusExamEn) {
     this.nevusExamEn = nevusExamEn;
  }

  public NevusExamEnCluster getNevusExamEn() {
     return this.nevusExamEn ;
  }

  public void setPositionValue(String positionValue) {
     this.positionValue = positionValue;
  }

  public String getPositionValue() {
     return this.positionValue ;
  }

  public void setPositionNullFlavourDefiningCode(NullFlavour positionNullFlavourDefiningCode) {
     this.positionNullFlavourDefiningCode = positionNullFlavourDefiningCode;
  }

  public NullFlavour getPositionNullFlavourDefiningCode() {
     return this.positionNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }
}
