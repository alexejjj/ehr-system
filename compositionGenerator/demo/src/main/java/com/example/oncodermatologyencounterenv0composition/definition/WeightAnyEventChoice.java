package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.292446+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
public interface WeightAnyEventChoice {
  String getWeightUnits();

  void setWeightUnits(String weightUnits);

  ItemTree getStateStructure();

  void setStateStructure(ItemTree stateStructure);

  Double getWeightMagnitude();

  void setWeightMagnitude(Double weightMagnitude);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  NullFlavour getWeightNullFlavourDefiningCode();

  void setWeightNullFlavourDefiningCode(NullFlavour weightNullFlavourDefiningCode);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);
}
