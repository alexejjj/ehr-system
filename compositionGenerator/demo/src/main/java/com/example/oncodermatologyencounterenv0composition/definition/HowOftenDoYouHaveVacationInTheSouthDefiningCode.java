package com.example.oncodermatologyencounterenv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum HowOftenDoYouHaveVacationInTheSouthDefiningCode implements EnumValueSet {
  MORE_THAN20_DAYS_PER_YEAR("more than 20 days per year", "", "local", "at0024"),

  N10_DAYS_PER_YEAR("10 days per year", "", "local", "at0022"),

  N20_DAYS_PER_YEAR("20 days per year", "", "local", "at0023"),

  NEVER("never", "", "local", "at0025");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  HowOftenDoYouHaveVacationInTheSouthDefiningCode(String value, String description,
      String terminologyId, String code) {
    this.value = value;
    this.description = description;
    this.terminologyId = terminologyId;
    this.code = code;
  }

  public String getValue() {
     return this.value ;
  }

  public String getDescription() {
     return this.description ;
  }

  public String getTerminologyId() {
     return this.terminologyId ;
  }

  public String getCode() {
     return this.code ;
  }
}
