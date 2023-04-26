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
    date = "2022-05-21T16:47:30.285563+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
@OptionFor("INTERVAL_EVENT")
public class WeightAnyEventIntervalEvent implements IntervalEventEntity, WeightAnyEventChoice {
  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Weight/Any event/Weight
   * Description: The weight of the individual.
   */
  @Path("/data[at0001]/items[at0004]/value|magnitude")
  private Double weightMagnitude;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Weight/Any event/Weight
   * Description: The weight of the individual.
   */
  @Path("/data[at0001]/items[at0004]/value|units")
  private String weightUnits;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Weight/Any event/Simple/Weight/null_flavour
   */
  @Path("/data[at0001]/items[at0004]/null_flavour|defining_code")
  private NullFlavour weightNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Weight/Any event/state structure
   * Description: @ internal @
   */
  @Path("/state[at0008]")
  private ItemTree stateStructure;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Weight/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Weight/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Weight/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Weight/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Weight/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  public void setWeightMagnitude(Double weightMagnitude) {
     this.weightMagnitude = weightMagnitude;
  }

  public Double getWeightMagnitude() {
     return this.weightMagnitude ;
  }

  public void setWeightUnits(String weightUnits) {
     this.weightUnits = weightUnits;
  }

  public String getWeightUnits() {
     return this.weightUnits ;
  }

  public void setWeightNullFlavourDefiningCode(NullFlavour weightNullFlavourDefiningCode) {
     this.weightNullFlavourDefiningCode = weightNullFlavourDefiningCode;
  }

  public NullFlavour getWeightNullFlavourDefiningCode() {
     return this.weightNullFlavourDefiningCode ;
  }

  public void setStateStructure(ItemTree stateStructure) {
     this.stateStructure = stateStructure;
  }

  public ItemTree getStateStructure() {
     return this.stateStructure ;
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
