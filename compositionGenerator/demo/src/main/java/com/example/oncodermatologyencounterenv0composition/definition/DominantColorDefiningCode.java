package com.example.oncodermatologyencounterenv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum DominantColorDefiningCode implements EnumValueSet {
  GREY("grey", "", "local", "at0018"),

  BLUE("blue", "", "local", "at0019"),

  BEIGE("beige", "", "local", "at0015"),

  RED("red", "", "local", "at0014"),

  BLACK("black", "", "local", "at0017"),

  BROWN("brown", "", "local", "at0016");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  DominantColorDefiningCode(String value, String description, String terminologyId, String code) {
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
