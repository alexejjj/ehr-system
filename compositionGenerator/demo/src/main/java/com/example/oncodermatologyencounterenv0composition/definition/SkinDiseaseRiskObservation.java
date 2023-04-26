package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
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
@Archetype("openEHR-EHR-OBSERVATION.skin_oncology_risk_en.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.325329+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
public class SkinDiseaseRiskObservation implements EntryEntity {
  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Item tree
   * Description: @ internal @
   */
  @Path("/protocol[at0020]")
  private ItemTree itemTree;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Onco-dermatology encounter.v0/Health and lifestyle/Skin disease risk/Any event
   */
  @Path("/data[at0001]/events[at0002]")
  @Choice
  private List<SkinDiseaseRiskAnyEventChoice> anyEvent;

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setItemTree(ItemTree itemTree) {
     this.itemTree = itemTree;
  }

  public ItemTree getItemTree() {
     return this.itemTree ;
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

  public void setAnyEvent(List<SkinDiseaseRiskAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<SkinDiseaseRiskAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
