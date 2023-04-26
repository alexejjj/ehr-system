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
    date = "2022-05-21T16:47:30.317628+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
public interface HeightAnyEventChoice {
  Double getHeightMagnitude();

  void setHeightMagnitude(Double heightMagnitude);

  ItemTree getTree();

  void setTree(ItemTree tree);

  NullFlavour getHeightNullFlavourDefiningCode();

  void setHeightNullFlavourDefiningCode(NullFlavour heightNullFlavourDefiningCode);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  String getHeightUnits();

  void setHeightUnits(String heightUnits);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);
}
