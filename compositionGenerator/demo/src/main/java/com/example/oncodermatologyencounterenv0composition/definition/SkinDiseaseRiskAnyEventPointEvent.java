package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Boolean;
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
    date = "2022-05-21T16:47:30.337028+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
@OptionFor("POINT_EVENT")
public class SkinDiseaseRiskAnyEventPointEvent implements PointEventEntity, SkinDiseaseRiskAnyEventChoice {
  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event/Freckles
   */
  @Path("/data[at0003]/items[at0004]/value|defining_code")
  private FrecklesDefiningCode frecklesDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event/Tree/Freckles/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour frecklesNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event/Does the skin turn red when sunburned?
   */
  @Path("/data[at0003]/items[at0009]/value|value")
  private Boolean doesTheSkinTurnRedWhenSunburnedValue;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event/Tree/Does the skin turn red when sunburned?/null_flavour
   */
  @Path("/data[at0003]/items[at0009]/null_flavour|defining_code")
  private NullFlavour doesTheSkinTurnRedWhenSunburnedNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event/Does the skin tan in the sun?
   */
  @Path("/data[at0003]/items[at0011]/value|defining_code")
  private DoesTheSkinTanInTheSunDefiningCode doesTheSkinTanInTheSunDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event/Tree/Does the skin tan in the sun?/null_flavour
   */
  @Path("/data[at0003]/items[at0011]/null_flavour|defining_code")
  private NullFlavour doesTheSkinTanInTheSunNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event/How often do you have vacation in the south?
   */
  @Path("/data[at0003]/items[at0021]/value|defining_code")
  private HowOftenDoYouHaveVacationInTheSouthDefiningCode howOftenDoYouHaveVacationInTheSouthDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event/Tree/How often do you have vacation in the south?/null_flavour
   */
  @Path("/data[at0003]/items[at0021]/null_flavour|defining_code")
  private NullFlavour howOftenDoYouHaveVacationInTheSouthNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event/Do you use sunscreen in summer?
   */
  @Path("/data[at0003]/items[at0027]/value|value")
  private Boolean doYouUseSunscreenInSummerValue;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event/Tree/Do you use sunscreen in summer?/null_flavour
   */
  @Path("/data[at0003]/items[at0027]/null_flavour|defining_code")
  private NullFlavour doYouUseSunscreenInSummerNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event/Sport
   */
  @Path("/data[at0003]/items[at0026]/value|defining_code")
  private SportDefiningCode sportDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event/Tree/Sport/null_flavour
   */
  @Path("/data[at0003]/items[at0026]/null_flavour|defining_code")
  private NullFlavour sportNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setFrecklesDefiningCode(FrecklesDefiningCode frecklesDefiningCode) {
     this.frecklesDefiningCode = frecklesDefiningCode;
  }

  public FrecklesDefiningCode getFrecklesDefiningCode() {
     return this.frecklesDefiningCode ;
  }

  public void setFrecklesNullFlavourDefiningCode(NullFlavour frecklesNullFlavourDefiningCode) {
     this.frecklesNullFlavourDefiningCode = frecklesNullFlavourDefiningCode;
  }

  public NullFlavour getFrecklesNullFlavourDefiningCode() {
     return this.frecklesNullFlavourDefiningCode ;
  }

  public void setDoesTheSkinTurnRedWhenSunburnedValue(
      Boolean doesTheSkinTurnRedWhenSunburnedValue) {
     this.doesTheSkinTurnRedWhenSunburnedValue = doesTheSkinTurnRedWhenSunburnedValue;
  }

  public Boolean isDoesTheSkinTurnRedWhenSunburnedValue() {
     return this.doesTheSkinTurnRedWhenSunburnedValue ;
  }

  public void setDoesTheSkinTurnRedWhenSunburnedNullFlavourDefiningCode(
      NullFlavour doesTheSkinTurnRedWhenSunburnedNullFlavourDefiningCode) {
     this.doesTheSkinTurnRedWhenSunburnedNullFlavourDefiningCode = doesTheSkinTurnRedWhenSunburnedNullFlavourDefiningCode;
  }

  public NullFlavour getDoesTheSkinTurnRedWhenSunburnedNullFlavourDefiningCode() {
     return this.doesTheSkinTurnRedWhenSunburnedNullFlavourDefiningCode ;
  }

  public void setDoesTheSkinTanInTheSunDefiningCode(
      DoesTheSkinTanInTheSunDefiningCode doesTheSkinTanInTheSunDefiningCode) {
     this.doesTheSkinTanInTheSunDefiningCode = doesTheSkinTanInTheSunDefiningCode;
  }

  public DoesTheSkinTanInTheSunDefiningCode getDoesTheSkinTanInTheSunDefiningCode() {
     return this.doesTheSkinTanInTheSunDefiningCode ;
  }

  public void setDoesTheSkinTanInTheSunNullFlavourDefiningCode(
      NullFlavour doesTheSkinTanInTheSunNullFlavourDefiningCode) {
     this.doesTheSkinTanInTheSunNullFlavourDefiningCode = doesTheSkinTanInTheSunNullFlavourDefiningCode;
  }

  public NullFlavour getDoesTheSkinTanInTheSunNullFlavourDefiningCode() {
     return this.doesTheSkinTanInTheSunNullFlavourDefiningCode ;
  }

  public void setHowOftenDoYouHaveVacationInTheSouthDefiningCode(
      HowOftenDoYouHaveVacationInTheSouthDefiningCode howOftenDoYouHaveVacationInTheSouthDefiningCode) {
     this.howOftenDoYouHaveVacationInTheSouthDefiningCode = howOftenDoYouHaveVacationInTheSouthDefiningCode;
  }

  public HowOftenDoYouHaveVacationInTheSouthDefiningCode getHowOftenDoYouHaveVacationInTheSouthDefiningCode(
      ) {
     return this.howOftenDoYouHaveVacationInTheSouthDefiningCode ;
  }

  public void setHowOftenDoYouHaveVacationInTheSouthNullFlavourDefiningCode(
      NullFlavour howOftenDoYouHaveVacationInTheSouthNullFlavourDefiningCode) {
     this.howOftenDoYouHaveVacationInTheSouthNullFlavourDefiningCode = howOftenDoYouHaveVacationInTheSouthNullFlavourDefiningCode;
  }

  public NullFlavour getHowOftenDoYouHaveVacationInTheSouthNullFlavourDefiningCode() {
     return this.howOftenDoYouHaveVacationInTheSouthNullFlavourDefiningCode ;
  }

  public void setDoYouUseSunscreenInSummerValue(Boolean doYouUseSunscreenInSummerValue) {
     this.doYouUseSunscreenInSummerValue = doYouUseSunscreenInSummerValue;
  }

  public Boolean isDoYouUseSunscreenInSummerValue() {
     return this.doYouUseSunscreenInSummerValue ;
  }

  public void setDoYouUseSunscreenInSummerNullFlavourDefiningCode(
      NullFlavour doYouUseSunscreenInSummerNullFlavourDefiningCode) {
     this.doYouUseSunscreenInSummerNullFlavourDefiningCode = doYouUseSunscreenInSummerNullFlavourDefiningCode;
  }

  public NullFlavour getDoYouUseSunscreenInSummerNullFlavourDefiningCode() {
     return this.doYouUseSunscreenInSummerNullFlavourDefiningCode ;
  }

  public void setSportDefiningCode(SportDefiningCode sportDefiningCode) {
     this.sportDefiningCode = sportDefiningCode;
  }

  public SportDefiningCode getSportDefiningCode() {
     return this.sportDefiningCode ;
  }

  public void setSportNullFlavourDefiningCode(NullFlavour sportNullFlavourDefiningCode) {
     this.sportNullFlavourDefiningCode = sportNullFlavourDefiningCode;
  }

  public NullFlavour getSportNullFlavourDefiningCode() {
     return this.sportNullFlavourDefiningCode ;
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
