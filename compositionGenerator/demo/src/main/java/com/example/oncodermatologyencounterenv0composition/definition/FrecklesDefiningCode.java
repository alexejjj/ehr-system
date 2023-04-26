package com.example.oncodermatologyencounterenv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum FrecklesDefiningCode implements EnumValueSet {
  SPORADIC("sporadic", "", "local", "at0007"),

  NO("no", "", "local", "at0008"),

  MODERATE_AMOUNT("moderate amount", "", "local", "at0006"),

  MANY("many", "", "local", "at0005");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  FrecklesDefiningCode(String value, String description, String terminologyId, String code) {
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
