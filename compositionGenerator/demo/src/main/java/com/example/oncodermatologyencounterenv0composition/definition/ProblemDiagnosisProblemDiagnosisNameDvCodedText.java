package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.datavalues.DvCodedText;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.377649+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisProblemDiagnosisNameDvCodedText implements RMEntity, ProblemDiagnosisProblemDiagnosisNameChoice {
  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/Problem/Diagnosis name/Problem/Diagnosis name
   * Description: Identification of the problem or diagnosis, by name.
   * Comment: Coding of the name of the problem or diagnosis with a terminology is preferred, where possible.
   */
  @Path("")
  private DvCodedText problemDiagnosisName;

  public void setProblemDiagnosisName(DvCodedText problemDiagnosisName) {
     this.problemDiagnosisName = problemDiagnosisName;
  }

  public DvCodedText getProblemDiagnosisName() {
     return this.problemDiagnosisName ;
  }
}
