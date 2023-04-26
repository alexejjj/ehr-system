package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Boolean;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.341111+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
public interface SkinDiseaseRiskAnyEventChoice {
  DoesTheSkinTanInTheSunDefiningCode getDoesTheSkinTanInTheSunDefiningCode();

  void setDoesTheSkinTanInTheSunDefiningCode(
      DoesTheSkinTanInTheSunDefiningCode doesTheSkinTanInTheSunDefiningCode);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  NullFlavour getFrecklesNullFlavourDefiningCode();

  void setFrecklesNullFlavourDefiningCode(NullFlavour frecklesNullFlavourDefiningCode);

  NullFlavour getHowOftenDoYouHaveVacationInTheSouthNullFlavourDefiningCode();

  void setHowOftenDoYouHaveVacationInTheSouthNullFlavourDefiningCode(
      NullFlavour howOftenDoYouHaveVacationInTheSouthNullFlavourDefiningCode);

  NullFlavour getDoesTheSkinTurnRedWhenSunburnedNullFlavourDefiningCode();

  void setDoesTheSkinTurnRedWhenSunburnedNullFlavourDefiningCode(
      NullFlavour doesTheSkinTurnRedWhenSunburnedNullFlavourDefiningCode);

  NullFlavour getSportNullFlavourDefiningCode();

  void setSportNullFlavourDefiningCode(NullFlavour sportNullFlavourDefiningCode);

  Boolean isDoesTheSkinTurnRedWhenSunburnedValue();

  void setDoesTheSkinTurnRedWhenSunburnedValue(Boolean doesTheSkinTurnRedWhenSunburnedValue);

  SportDefiningCode getSportDefiningCode();

  void setSportDefiningCode(SportDefiningCode sportDefiningCode);

  Boolean isDoYouUseSunscreenInSummerValue();

  void setDoYouUseSunscreenInSummerValue(Boolean doYouUseSunscreenInSummerValue);

  FrecklesDefiningCode getFrecklesDefiningCode();

  void setFrecklesDefiningCode(FrecklesDefiningCode frecklesDefiningCode);

  NullFlavour getDoesTheSkinTanInTheSunNullFlavourDefiningCode();

  void setDoesTheSkinTanInTheSunNullFlavourDefiningCode(
      NullFlavour doesTheSkinTanInTheSunNullFlavourDefiningCode);

  HowOftenDoYouHaveVacationInTheSouthDefiningCode getHowOftenDoYouHaveVacationInTheSouthDefiningCode(
      );

  void setHowOftenDoYouHaveVacationInTheSouthDefiningCode(
      HowOftenDoYouHaveVacationInTheSouthDefiningCode howOftenDoYouHaveVacationInTheSouthDefiningCode);

  NullFlavour getDoYouUseSunscreenInSummerNullFlavourDefiningCode();

  void setDoYouUseSunscreenInSummerNullFlavourDefiningCode(
      NullFlavour doYouUseSunscreenInSummerNullFlavourDefiningCode);
}
