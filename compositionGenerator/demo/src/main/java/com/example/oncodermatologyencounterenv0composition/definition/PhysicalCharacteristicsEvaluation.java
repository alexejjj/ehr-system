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
@Archetype("openEHR-EHR-EVALUATION.physical_characteristics.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.322008+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
public class PhysicalCharacteristicsEvaluation implements EntryEntity {
  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Physical characteristics/Hair color
   * Description: Description of the natural hair colour.
   */
  @Path("/data[at0001]/items[at0003 and name/value='Hair color']/value|value")
  private String hairColorValue;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Physical characteristics/Item tree/Hair color/null_flavour
   */
  @Path("/data[at0001]/items[at0003 and name/value='Hair color']/null_flavour|defining_code")
  private NullFlavour hairColorNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Physical characteristics/Eye color
   * Description: Description of the eye colour.
   */
  @Path("/data[at0001]/items[at0004 and name/value='Eye color']/value|value")
  private String eyeColorValue;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Physical characteristics/Item tree/Eye color/null_flavour
   */
  @Path("/data[at0001]/items[at0004 and name/value='Eye color']/null_flavour|defining_code")
  private NullFlavour eyeColorNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Physical characteristics/Skin tone
   * Description: Description of the skin tone.
   */
  @Path("/data[at0001]/items[at0005]/value|value")
  private String skinToneValue;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Physical characteristics/Item tree/Skin tone/null_flavour
   */
  @Path("/data[at0001]/items[at0005]/null_flavour|defining_code")
  private NullFlavour skinToneNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Physical characteristics/Extension
   * Description: Additional information required to extend the model with local content or to align with other reference models or formalisms.
   * Comment: For example: local information requirements; or additional metadata to align with FHIR.
   */
  @Path("/protocol[at0009]/items[at0011]")
  private List<Cluster> extension;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Physical characteristics/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Physical characteristics/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Physical characteristics/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setHairColorValue(String hairColorValue) {
     this.hairColorValue = hairColorValue;
  }

  public String getHairColorValue() {
     return this.hairColorValue ;
  }

  public void setHairColorNullFlavourDefiningCode(NullFlavour hairColorNullFlavourDefiningCode) {
     this.hairColorNullFlavourDefiningCode = hairColorNullFlavourDefiningCode;
  }

  public NullFlavour getHairColorNullFlavourDefiningCode() {
     return this.hairColorNullFlavourDefiningCode ;
  }

  public void setEyeColorValue(String eyeColorValue) {
     this.eyeColorValue = eyeColorValue;
  }

  public String getEyeColorValue() {
     return this.eyeColorValue ;
  }

  public void setEyeColorNullFlavourDefiningCode(NullFlavour eyeColorNullFlavourDefiningCode) {
     this.eyeColorNullFlavourDefiningCode = eyeColorNullFlavourDefiningCode;
  }

  public NullFlavour getEyeColorNullFlavourDefiningCode() {
     return this.eyeColorNullFlavourDefiningCode ;
  }

  public void setSkinToneValue(String skinToneValue) {
     this.skinToneValue = skinToneValue;
  }

  public String getSkinToneValue() {
     return this.skinToneValue ;
  }

  public void setSkinToneNullFlavourDefiningCode(NullFlavour skinToneNullFlavourDefiningCode) {
     this.skinToneNullFlavourDefiningCode = skinToneNullFlavourDefiningCode;
  }

  public NullFlavour getSkinToneNullFlavourDefiningCode() {
     return this.skinToneNullFlavourDefiningCode ;
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
