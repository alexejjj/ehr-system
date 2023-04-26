package com.example.oncodermatologyencounterenv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum BordersDefiningCode implements EnumValueSet {
  UNCLEAR("unclear", "", "local", "at0013"),

  CLEAR("clear", "", "local", "at0012");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  BordersDefiningCode(String value, String description, String terminologyId, String code) {
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
