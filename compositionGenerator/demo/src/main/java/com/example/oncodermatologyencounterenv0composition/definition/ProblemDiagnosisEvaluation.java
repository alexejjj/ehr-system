package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-EVALUATION.problem_diagnosis.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.374952+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
public class ProblemDiagnosisEvaluation implements EntryEntity {
  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/structure/Problem/Diagnosis name/null_flavour
   */
  @Path("/data[at0001]/items[at0002]/null_flavour|defining_code")
  private NullFlavour problemDiagnosisNameNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/Clinical description
   * Description: Narrative description about the problem or diagnosis.
   * Comment: Use to provide background and context, including evolution, episodes or exacerbations, progress and any other relevant details, about the problem or diagnosis.
   */
  @Path("/data[at0001]/items[at0009]/value|value")
  private String clinicalDescriptionValue;

  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/structure/Clinical description/null_flavour
   */
  @Path("/data[at0001]/items[at0009]/null_flavour|defining_code")
  private NullFlavour clinicalDescriptionNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/Structured body site
   * Description: A structured anatomical location for the problem or diagnosis.
   * Comment: Use this SLOT to insert the CLUSTER.anatomical_location or CLUSTER.relative_location archetypes if the requirements for recording the anatomical location are determined at run-time by the application or require more complex modelling such as relative locations.
   *
   * If the anatomical location is included in the Problem/diagnosis name via precoordinated codes, use of this SLOT becomes redundant.
   */
  @Path("/data[at0001]/items[at0039]")
  private List<Cluster> structuredBodySite;

  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/Specific details
   * Description: Details that are additionally required to record as unique attributes of this problem or diagnosis.
   * Comment: May include structured detail about the grading or staging of the diagnosis; diagnostic criteria, classification criteria or formal severity assessments such as Common Terminology Criteria for Adverse Events.
   */
  @Path("/data[at0001]/items[at0043]")
  private List<Cluster> specificDetails;

  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/Status
   * Description: Structured details for location-, domain-, episode- or workflow-specific aspects of the diagnostic process.
   * Comment: Use status or context qualifiers with care, as they are variably used in practice and interoperability cannot be assured unless usage is clearly defined with the community of use. For example: active status - active, inactive, resolved, in remission; evolution status - initial, interim/working, final; temporal status - current, past; episodicity status - first, new, ongoing; admission status - admission, discharge; or priority status - primary, secondary.
   */
  @Path("/data[at0001]/items[at0046]")
  private List<Cluster> status;

  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/Comment
   * Description: Additional narrative about the problem or diagnosis not captured in other fields.
   */
  @Path("/data[at0001]/items[at0069]/value|value")
  private String commentValue;

  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/structure/Comment/null_flavour
   */
  @Path("/data[at0001]/items[at0069]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0032]/items[at0071]")
  private List<Cluster> extension;

  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Onco-dermatology encounter.v0/Additional/Problem/Diagnosis/Problem/Diagnosis name
   * Description: Identification of the problem or diagnosis, by name.
   * Comment: Coding of the name of the problem or diagnosis with a terminology is preferred, where possible.
   */
  @Path("/data[at0001]/items[at0002]/value")
  @Choice
  private ProblemDiagnosisProblemDiagnosisNameChoice problemDiagnosisName;

  public void setProblemDiagnosisNameNullFlavourDefiningCode(
      NullFlavour problemDiagnosisNameNullFlavourDefiningCode) {
     this.problemDiagnosisNameNullFlavourDefiningCode = problemDiagnosisNameNullFlavourDefiningCode;
  }

  public NullFlavour getProblemDiagnosisNameNullFlavourDefiningCode() {
     return this.problemDiagnosisNameNullFlavourDefiningCode ;
  }

  public void setClinicalDescriptionValue(String clinicalDescriptionValue) {
     this.clinicalDescriptionValue = clinicalDescriptionValue;
  }

  public String getClinicalDescriptionValue() {
     return this.clinicalDescriptionValue ;
  }

  public void setClinicalDescriptionNullFlavourDefiningCode(
      NullFlavour clinicalDescriptionNullFlavourDefiningCode) {
     this.clinicalDescriptionNullFlavourDefiningCode = clinicalDescriptionNullFlavourDefiningCode;
  }

  public NullFlavour getClinicalDescriptionNullFlavourDefiningCode() {
     return this.clinicalDescriptionNullFlavourDefiningCode ;
  }

  public void setStructuredBodySite(List<Cluster> structuredBodySite) {
     this.structuredBodySite = structuredBodySite;
  }

  public List<Cluster> getStructuredBodySite() {
     return this.structuredBodySite ;
  }

  public void setSpecificDetails(List<Cluster> specificDetails) {
     this.specificDetails = specificDetails;
  }

  public List<Cluster> getSpecificDetails() {
     return this.specificDetails ;
  }

  public void setStatus(List<Cluster> status) {
     this.status = status;
  }

  public List<Cluster> getStatus() {
     return this.status ;
  }

  public void setCommentValue(String commentValue) {
     this.commentValue = commentValue;
  }

  public String getCommentValue() {
     return this.commentValue ;
  }

  public void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode) {
     this.commentNullFlavourDefiningCode = commentNullFlavourDefiningCode;
  }

  public NullFlavour getCommentNullFlavourDefiningCode() {
     return this.commentNullFlavourDefiningCode ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setProblemDiagnosisName(
      ProblemDiagnosisProblemDiagnosisNameChoice problemDiagnosisName) {
     this.problemDiagnosisName = problemDiagnosisName;
  }

  public ProblemDiagnosisProblemDiagnosisNameChoice getProblemDiagnosisName() {
     return this.problemDiagnosisName ;
  }
}
