package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

@Entity
@Archetype("openEHR-EHR-OBSERVATION.exam.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.361334+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
public class PhysicalExaminationFindingsObservation implements EntryEntity {
  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Device Details
   * Description: Details about any device used during the physical examination.
   */
  @Path("/protocol[at0007]/items[at0010]")
  private List<Cluster> deviceDetails;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: e.g. Local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0007]/items[at0012]")
  private List<Cluster> extension;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0001]/events[at0002]")
  @Choice
  private List<PhysicalExaminationFindingsAnyEventChoice> anyEvent;

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setDeviceDetails(List<Cluster> deviceDetails) {
     this.deviceDetails = deviceDetails;
  }

  public List<Cluster> getDeviceDetails() {
     return this.deviceDetails ;
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

  public void setAnyEvent(List<PhysicalExaminationFindingsAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<PhysicalExaminationFindingsAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
