package com.example.oncodermatologyencounterenv0composition.definition;

import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.377257+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class ProblemDiagnosisProblemDiagnosisNameDvText implements RMEntity, ProblemDiagnosisProblemDiagnosisNameChoice {
  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/Problem/Diagnosis name/Problem/Diagnosis name
   * Description: Identification of the problem or diagnosis, by name.
   * Comment: Coding of the name of the problem or diagnosis with a terminology is preferred, where possible.
   */
  @Path("|value")
  private String problemDiagnosisNameValue;

  public void setProblemDiagnosisNameValue(String problemDiagnosisNameValue) {
     this.problemDiagnosisNameValue = problemDiagnosisNameValue;
  }

  public String getProblemDiagnosisNameValue() {
     return this.problemDiagnosisNameValue ;
  }
}
