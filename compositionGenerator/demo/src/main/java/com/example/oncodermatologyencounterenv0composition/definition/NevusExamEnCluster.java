package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datavalues.encapsulated.DvMultimedia;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.nevus_exam_en.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.364158+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
public class NevusExamEnCluster implements LocatableEntity {
  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/nevus_exam_en/Height (X)
   */
  @Path("/items[at0001]/value|magnitude")
  private Double heightXMagnitude;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/nevus_exam_en/Height (X)
   */
  @Path("/items[at0001]/value|units")
  private String heightXUnits;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/Tree/nevus_exam_en/Height (X)/null_flavour
   */
  @Path("/items[at0001]/null_flavour|defining_code")
  private NullFlavour heightXNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/nevus_exam_en/Width (Y)
   */
  @Path("/items[at0002]/value|magnitude")
  private Double widthYMagnitude;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/nevus_exam_en/Width (Y)
   */
  @Path("/items[at0002]/value|units")
  private String widthYUnits;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/Tree/nevus_exam_en/Width (Y)/null_flavour
   */
  @Path("/items[at0002]/null_flavour|defining_code")
  private NullFlavour widthYNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/nevus_exam_en/Area
   */
  @Path("/items[at0003]/value|magnitude")
  private Double areaMagnitude;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/nevus_exam_en/Area
   */
  @Path("/items[at0003]/value|units")
  private String areaUnits;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/Tree/nevus_exam_en/Area/null_flavour
   */
  @Path("/items[at0003]/null_flavour|defining_code")
  private NullFlavour areaNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/nevus_exam_en/Borders
   */
  @Path("/items[at0004]/value|defining_code")
  private BordersDefiningCode bordersDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/Tree/nevus_exam_en/Borders/null_flavour
   */
  @Path("/items[at0004]/null_flavour|defining_code")
  private NullFlavour bordersNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/nevus_exam_en/Dominant color
   */
  @Path("/items[at0005]/value|defining_code")
  private DominantColorDefiningCode dominantColorDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/Tree/nevus_exam_en/Dominant color/null_flavour
   */
  @Path("/items[at0005]/null_flavour|defining_code")
  private NullFlavour dominantColorNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/nevus_exam_en/Shape
   */
  @Path("/items[at0006]/value|defining_code")
  private ShapeDefiningCode shapeDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/Tree/nevus_exam_en/Shape/null_flavour
   */
  @Path("/items[at0006]/null_flavour|defining_code")
  private NullFlavour shapeNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/nevus_exam_en/Inclusions
   */
  @Path("/items[at0009]/value|value")
  private Boolean inclusionsValue;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/Tree/nevus_exam_en/Inclusions/null_flavour
   */
  @Path("/items[at0009]/null_flavour|defining_code")
  private NullFlavour inclusionsNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/nevus_exam_en/Symmetry
   */
  @Path("/items[at0010]/value|value")
  private Boolean symmetryValue;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/Tree/nevus_exam_en/Symmetry/null_flavour
   */
  @Path("/items[at0010]/null_flavour|defining_code")
  private NullFlavour symmetryNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/nevus_exam_en/Photo
   */
  @Path("/items[at0011]/value")
  private DvMultimedia photo;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/Tree/nevus_exam_en/Photo/null_flavour
   */
  @Path("/items[at0011]/null_flavour|defining_code")
  private NullFlavour photoNullFlavourDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Nevus/Physical examination findings/Any event/nevus_exam_en/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setHeightXMagnitude(Double heightXMagnitude) {
     this.heightXMagnitude = heightXMagnitude;
  }

  public Double getHeightXMagnitude() {
     return this.heightXMagnitude ;
  }

  public void setHeightXUnits(String heightXUnits) {
     this.heightXUnits = heightXUnits;
  }

  public String getHeightXUnits() {
     return this.heightXUnits ;
  }

  public void setHeightXNullFlavourDefiningCode(NullFlavour heightXNullFlavourDefiningCode) {
     this.heightXNullFlavourDefiningCode = heightXNullFlavourDefiningCode;
  }

  public NullFlavour getHeightXNullFlavourDefiningCode() {
     return this.heightXNullFlavourDefiningCode ;
  }

  public void setWidthYMagnitude(Double widthYMagnitude) {
     this.widthYMagnitude = widthYMagnitude;
  }

  public Double getWidthYMagnitude() {
     return this.widthYMagnitude ;
  }

  public void setWidthYUnits(String widthYUnits) {
     this.widthYUnits = widthYUnits;
  }

  public String getWidthYUnits() {
     return this.widthYUnits ;
  }

  public void setWidthYNullFlavourDefiningCode(NullFlavour widthYNullFlavourDefiningCode) {
     this.widthYNullFlavourDefiningCode = widthYNullFlavourDefiningCode;
  }

  public NullFlavour getWidthYNullFlavourDefiningCode() {
     return this.widthYNullFlavourDefiningCode ;
  }

  public void setAreaMagnitude(Double areaMagnitude) {
     this.areaMagnitude = areaMagnitude;
  }

  public Double getAreaMagnitude() {
     return this.areaMagnitude ;
  }

  public void setAreaUnits(String areaUnits) {
     this.areaUnits = areaUnits;
  }

  public String getAreaUnits() {
     return this.areaUnits ;
  }

  public void setAreaNullFlavourDefiningCode(NullFlavour areaNullFlavourDefiningCode) {
     this.areaNullFlavourDefiningCode = areaNullFlavourDefiningCode;
  }

  public NullFlavour getAreaNullFlavourDefiningCode() {
     return this.areaNullFlavourDefiningCode ;
  }

  public void setBordersDefiningCode(BordersDefiningCode bordersDefiningCode) {
     this.bordersDefiningCode = bordersDefiningCode;
  }

  public BordersDefiningCode getBordersDefiningCode() {
     return this.bordersDefiningCode ;
  }

  public void setBordersNullFlavourDefiningCode(NullFlavour bordersNullFlavourDefiningCode) {
     this.bordersNullFlavourDefiningCode = bordersNullFlavourDefiningCode;
  }

  public NullFlavour getBordersNullFlavourDefiningCode() {
     return this.bordersNullFlavourDefiningCode ;
  }

  public void setDominantColorDefiningCode(DominantColorDefiningCode dominantColorDefiningCode) {
     this.dominantColorDefiningCode = dominantColorDefiningCode;
  }

  public DominantColorDefiningCode getDominantColorDefiningCode() {
     return this.dominantColorDefiningCode ;
  }

  public void setDominantColorNullFlavourDefiningCode(
      NullFlavour dominantColorNullFlavourDefiningCode) {
     this.dominantColorNullFlavourDefiningCode = dominantColorNullFlavourDefiningCode;
  }

  public NullFlavour getDominantColorNullFlavourDefiningCode() {
     return this.dominantColorNullFlavourDefiningCode ;
  }

  public void setShapeDefiningCode(ShapeDefiningCode shapeDefiningCode) {
     this.shapeDefiningCode = shapeDefiningCode;
  }

  public ShapeDefiningCode getShapeDefiningCode() {
     return this.shapeDefiningCode ;
  }

  public void setShapeNullFlavourDefiningCode(NullFlavour shapeNullFlavourDefiningCode) {
     this.shapeNullFlavourDefiningCode = shapeNullFlavourDefiningCode;
  }

  public NullFlavour getShapeNullFlavourDefiningCode() {
     return this.shapeNullFlavourDefiningCode ;
  }

  public void setInclusionsValue(Boolean inclusionsValue) {
     this.inclusionsValue = inclusionsValue;
  }

  public Boolean isInclusionsValue() {
     return this.inclusionsValue ;
  }

  public void setInclusionsNullFlavourDefiningCode(NullFlavour inclusionsNullFlavourDefiningCode) {
     this.inclusionsNullFlavourDefiningCode = inclusionsNullFlavourDefiningCode;
  }

  public NullFlavour getInclusionsNullFlavourDefiningCode() {
     return this.inclusionsNullFlavourDefiningCode ;
  }

  public void setSymmetryValue(Boolean symmetryValue) {
     this.symmetryValue = symmetryValue;
  }

  public Boolean isSymmetryValue() {
     return this.symmetryValue ;
  }

  public void setSymmetryNullFlavourDefiningCode(NullFlavour symmetryNullFlavourDefiningCode) {
     this.symmetryNullFlavourDefiningCode = symmetryNullFlavourDefiningCode;
  }

  public NullFlavour getSymmetryNullFlavourDefiningCode() {
     return this.symmetryNullFlavourDefiningCode ;
  }

  public void setPhoto(DvMultimedia photo) {
     this.photo = photo;
  }

  public DvMultimedia getPhoto() {
     return this.photo ;
  }

  public void setPhotoNullFlavourDefiningCode(NullFlavour photoNullFlavourDefiningCode) {
     this.photoNullFlavourDefiningCode = photoNullFlavourDefiningCode;
  }

  public NullFlavour getPhotoNullFlavourDefiningCode() {
     return this.photoNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
