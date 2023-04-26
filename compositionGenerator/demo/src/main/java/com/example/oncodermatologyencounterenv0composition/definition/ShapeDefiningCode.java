package com.example.oncodermatologyencounterenv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ShapeDefiningCode implements EnumValueSet {
  OVAL("oval", "", "local", "at0020"),

  ROUND("round", "", "local", "at0021"),

  IRREGULAR("irregular", "", "local", "at0022");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ShapeDefiningCode(String value, String description, String terminologyId, String code) {
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
