package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Long;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.IntervalEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.MathFunction;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.363775+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
@OptionFor("INTERVAL_EVENT")
public class PhysicalExaminationFindingsAnyEventIntervalEvent implements IntervalEventEntity, PhysicalExaminationFindingsAnyEventChoice {
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

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

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

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }

  public void setMathFunctionDefiningCode(MathFunction mathFunctionDefiningCode) {
     this.mathFunctionDefiningCode = mathFunctionDefiningCode;
  }

  public MathFunction getMathFunctionDefiningCode() {
     return this.mathFunctionDefiningCode ;
  }

  public void setSampleCount(Long sampleCount) {
     this.sampleCount = sampleCount;
  }

  public Long getSampleCount() {
     return this.sampleCount ;
  }
}
