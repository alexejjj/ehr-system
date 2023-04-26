package com.example.oncodermatologyencounterenv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum DoesTheSkinTanInTheSunDefiningCode implements EnumValueSet {
  SOMETIMES("sometimes", "", "local", "at0014"),

  MODERATE("moderate", "", "local", "at0013"),

  RARELY("rarely", "", "local", "at0015"),

  NO("no", "", "local", "at0016"),

  FAST_AND_STRONG("fast and strong", "", "local", "at0012");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  DoesTheSkinTanInTheSunDefiningCode(String value, String description, String terminologyId,
      String code) {
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
