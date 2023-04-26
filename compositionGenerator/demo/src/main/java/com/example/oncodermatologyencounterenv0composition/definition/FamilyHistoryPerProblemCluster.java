package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.358078+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
public class FamilyHistoryPerProblemCluster implements LocatableEntity {
  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/Per problem/Problem/diagnosis name
   * Description: Identification of the significant problem or diagnosis in the family overall.
   * Comment: This is the problem for which aggregated data involving all family members will be collected. Coding of the index problem with a terminology is preferred, where possible.
   */
  @Path("/items[at0029]/value|value")
  private String problemDiagnosisNameValue;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/Tree/Per problem/Problem/diagnosis name/null_flavour
   */
  @Path("/items[at0029]/null_flavour|defining_code")
  private NullFlavour problemDiagnosisNameNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/Per problem/Cases
   */
  @Path("/items[at0071 and name/value='Cases']/value|value")
  private Boolean casesValue;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/Tree/Per problem/Cases/null_flavour
   */
  @Path("/items[at0071 and name/value='Cases']/null_flavour|defining_code")
  private NullFlavour casesNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/Per problem/Description
   * Description: Narrative description about occurrence of the problem or diagnosis in family members.
   */
  @Path("/items[at0030]/value|value")
  private String descriptionValue;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/Tree/Per problem/Description/null_flavour
   */
  @Path("/items[at0030]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/Per problem/Problem details
   * Description: Structured details about the identified problem or diagnosis.
   * Comment: For example: prevalence of the problem/diagnosis in the family.
   */
  @Path("/items[at0059]")
  private List<Cluster> problemDetails;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/Per problem/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setProblemDiagnosisNameValue(String problemDiagnosisNameValue) {
     this.problemDiagnosisNameValue = problemDiagnosisNameValue;
  }

  public String getProblemDiagnosisNameValue() {
     return this.problemDiagnosisNameValue ;
  }

  public void setProblemDiagnosisNameNullFlavourDefiningCode(
      NullFlavour problemDiagnosisNameNullFlavourDefiningCode) {
     this.problemDiagnosisNameNullFlavourDefiningCode = problemDiagnosisNameNullFlavourDefiningCode;
  }

  public NullFlavour getProblemDiagnosisNameNullFlavourDefiningCode() {
     return this.problemDiagnosisNameNullFlavourDefiningCode ;
  }

  public void setCasesValue(Boolean casesValue) {
     this.casesValue = casesValue;
  }

  public Boolean isCasesValue() {
     return this.casesValue ;
  }

  public void setCasesNullFlavourDefiningCode(NullFlavour casesNullFlavourDefiningCode) {
     this.casesNullFlavourDefiningCode = casesNullFlavourDefiningCode;
  }

  public NullFlavour getCasesNullFlavourDefiningCode() {
     return this.casesNullFlavourDefiningCode ;
  }

  public void setDescriptionValue(String descriptionValue) {
     this.descriptionValue = descriptionValue;
  }

  public String getDescriptionValue() {
     return this.descriptionValue ;
  }

  public void setDescriptionNullFlavourDefiningCode(
      NullFlavour descriptionNullFlavourDefiningCode) {
     this.descriptionNullFlavourDefiningCode = descriptionNullFlavourDefiningCode;
  }

  public NullFlavour getDescriptionNullFlavourDefiningCode() {
     return this.descriptionNullFlavourDefiningCode ;
  }

  public void setProblemDetails(List<Cluster> problemDetails) {
     this.problemDetails = problemDetails;
  }

  public List<Cluster> getProblemDetails() {
     return this.problemDetails ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
