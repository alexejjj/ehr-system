package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-EVALUATION.family_history.v2")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.357337+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
public class FamilyHistoryEvaluation implements EntryEntity {
  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/Summary
   * Description: Narrative overview about problems, diagnoses, psychosocial, environmental and genetic markers that have been identified in family members.
   * Comment: This field can be used to record a summary or the conclusion of all the findings, for unstructured family history information recorded in clinical records, or to import textual data from existing/legacy clinical systems.
   */
  @Path("/data[at0001]/items[at0002]/value|value")
  private String summaryValue;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/Tree/Summary/null_flavour
   */
  @Path("/data[at0001]/items[at0002]/null_flavour|defining_code")
  private NullFlavour summaryNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/Per problem
   * Description: Details about the presence of a specific problem or diagnosis in family members.
   * Comment: If the problem has a genetic predisposition within families, then only genetic relatives should be considered as part of this data. If the problem has psychosocial or environmental effects then non-genetic family members may also be included.
   */
  @Path("/data[at0001]/items[at0028]")
  private List<FamilyHistoryPerProblemCluster> perProblem;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/Multimedia
   * Description: Multimedia representation of the family history.
   * Comment: For example: a pedigree chart.
   */
  @Path("/data[at0001]/items[at0053]")
  private List<Cluster> multimedia;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0025]/items[at0045]")
  private List<Cluster> extension;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Family history/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setSummaryValue(String summaryValue) {
     this.summaryValue = summaryValue;
  }

  public String getSummaryValue() {
     return this.summaryValue ;
  }

  public void setSummaryNullFlavourDefiningCode(NullFlavour summaryNullFlavourDefiningCode) {
     this.summaryNullFlavourDefiningCode = summaryNullFlavourDefiningCode;
  }

  public NullFlavour getSummaryNullFlavourDefiningCode() {
     return this.summaryNullFlavourDefiningCode ;
  }

  public void setPerProblem(List<FamilyHistoryPerProblemCluster> perProblem) {
     this.perProblem = perProblem;
  }

  public List<FamilyHistoryPerProblemCluster> getPerProblem() {
     return this.perProblem ;
  }

  public void setMultimedia(List<Cluster> multimedia) {
     this.multimedia = multimedia;
  }

  public List<Cluster> getMultimedia() {
     return this.multimedia ;
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
}
