package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
import java.lang.Double;
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
    date = "2022-05-21T16:47:30.312942+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
@OptionFor("INTERVAL_EVENT")
public class HeightAnyEventIntervalEvent implements IntervalEventEntity, HeightAnyEventChoice {
  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Height/Any event/Height
   * Description: The length of the body from crown of head to sole of foot.
   */
  @Path("/data[at0003]/items[at0004 and name/value='Height']/value|magnitude")
  private Double heightMagnitude;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Height/Any event/Height
   * Description: The length of the body from crown of head to sole of foot.
   */
  @Path("/data[at0003]/items[at0004 and name/value='Height']/value|units")
  private String heightUnits;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Height/Any event/Simple/Height/null_flavour
   */
  @Path("/data[at0003]/items[at0004 and name/value='Height']/null_flavour|defining_code")
  private NullFlavour heightNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Height/Any event/Tree
   * Description: @ internal @
   */
  @Path("/state[at0013]")
  private ItemTree tree;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Height/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Height/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Height/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Height/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Height/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  public void setHeightMagnitude(Double heightMagnitude) {
     this.heightMagnitude = heightMagnitude;
  }

  public Double getHeightMagnitude() {
     return this.heightMagnitude ;
  }

  public void setHeightUnits(String heightUnits) {
     this.heightUnits = heightUnits;
  }

  public String getHeightUnits() {
     return this.heightUnits ;
  }

  public void setHeightNullFlavourDefiningCode(NullFlavour heightNullFlavourDefiningCode) {
     this.heightNullFlavourDefiningCode = heightNullFlavourDefiningCode;
  }

  public NullFlavour getHeightNullFlavourDefiningCode() {
     return this.heightNullFlavourDefiningCode ;
  }

  public void setTree(ItemTree tree) {
     this.tree = tree;
  }

  public ItemTree getTree() {
     return this.tree ;
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
