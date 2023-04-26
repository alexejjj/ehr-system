package com.example.oncodermatologyencounterenv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum SportDefiningCode implements EnumValueSet {
  SKIING("skiing", "", "local", "at0028"),

  RACE_WALKING("race walking", "", "local", "at0030"),

  ROWING("rowing", "", "local", "at0033"),

  CLIMBING("climbing", "", "local", "at0034"),

  KAYAKING("kayaking", "", "local", "at0038"),

  SKATING("skating", "", "local", "at0029"),

  OTHER_OUTDOOR_SPORTS("other outdoor sports", "", "local", "at0035"),

  HIKING("hiking", "", "local", "at0037"),

  RUNNING("running", "", "local", "at0031"),

  RIDING_A_BIKE("riding a bike", "", "local", "at0032");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  SportDefiningCode(String value, String description, String terminologyId, String code) {
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
