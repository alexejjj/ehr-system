package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datavalues.encapsulated.DvMultimedia;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class NevusExamEnClusterContainment extends Containment {
  public SelectAqlField<NevusExamEnCluster> NEVUS_EXAM_EN_CLUSTER = new AqlFieldImp<NevusExamEnCluster>(NevusExamEnCluster.class, "", "NevusExamEnCluster", NevusExamEnCluster.class, this);

  public SelectAqlField<Double> HEIGHT_X_MAGNITUDE = new AqlFieldImp<Double>(NevusExamEnCluster.class, "/items[at0001]/value|magnitude", "heightXMagnitude", Double.class, this);

  public SelectAqlField<String> HEIGHT_X_UNITS = new AqlFieldImp<String>(NevusExamEnCluster.class, "/items[at0001]/value|units", "heightXUnits", String.class, this);

  public SelectAqlField<NullFlavour> HEIGHT_X_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(NevusExamEnCluster.class, "/items[at0001]/null_flavour|defining_code", "heightXNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Double> WIDTH_Y_MAGNITUDE = new AqlFieldImp<Double>(NevusExamEnCluster.class, "/items[at0002]/value|magnitude", "widthYMagnitude", Double.class, this);

  public SelectAqlField<String> WIDTH_Y_UNITS = new AqlFieldImp<String>(NevusExamEnCluster.class, "/items[at0002]/value|units", "widthYUnits", String.class, this);

  public SelectAqlField<NullFlavour> WIDTH_Y_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(NevusExamEnCluster.class, "/items[at0002]/null_flavour|defining_code", "widthYNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Double> AREA_MAGNITUDE = new AqlFieldImp<Double>(NevusExamEnCluster.class, "/items[at0003]/value|magnitude", "areaMagnitude", Double.class, this);

  public SelectAqlField<String> AREA_UNITS = new AqlFieldImp<String>(NevusExamEnCluster.class, "/items[at0003]/value|units", "areaUnits", String.class, this);

  public SelectAqlField<NullFlavour> AREA_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(NevusExamEnCluster.class, "/items[at0003]/null_flavour|defining_code", "areaNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<BordersDefiningCode> BORDERS_DEFINING_CODE = new AqlFieldImp<BordersDefiningCode>(NevusExamEnCluster.class, "/items[at0004]/value|defining_code", "bordersDefiningCode", BordersDefiningCode.class, this);

  public SelectAqlField<NullFlavour> BORDERS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(NevusExamEnCluster.class, "/items[at0004]/null_flavour|defining_code", "bordersNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<DominantColorDefiningCode> DOMINANT_COLOR_DEFINING_CODE = new AqlFieldImp<DominantColorDefiningCode>(NevusExamEnCluster.class, "/items[at0005]/value|defining_code", "dominantColorDefiningCode", DominantColorDefiningCode.class, this);

  public SelectAqlField<NullFlavour> DOMINANT_COLOR_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(NevusExamEnCluster.class, "/items[at0005]/null_flavour|defining_code", "dominantColorNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<ShapeDefiningCode> SHAPE_DEFINING_CODE = new AqlFieldImp<ShapeDefiningCode>(NevusExamEnCluster.class, "/items[at0006]/value|defining_code", "shapeDefiningCode", ShapeDefiningCode.class, this);

  public SelectAqlField<NullFlavour> SHAPE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(NevusExamEnCluster.class, "/items[at0006]/null_flavour|defining_code", "shapeNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Boolean> INCLUSIONS_VALUE = new AqlFieldImp<Boolean>(NevusExamEnCluster.class, "/items[at0009]/value|value", "inclusionsValue", Boolean.class, this);

  public SelectAqlField<NullFlavour> INCLUSIONS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(NevusExamEnCluster.class, "/items[at0009]/null_flavour|defining_code", "inclusionsNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Boolean> SYMMETRY_VALUE = new AqlFieldImp<Boolean>(NevusExamEnCluster.class, "/items[at0010]/value|value", "symmetryValue", Boolean.class, this);

  public SelectAqlField<NullFlavour> SYMMETRY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(NevusExamEnCluster.class, "/items[at0010]/null_flavour|defining_code", "symmetryNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<DvMultimedia> PHOTO = new AqlFieldImp<DvMultimedia>(NevusExamEnCluster.class, "/items[at0011]/value", "photo", DvMultimedia.class, this);

  public SelectAqlField<NullFlavour> PHOTO_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(NevusExamEnCluster.class, "/items[at0011]/null_flavour|defining_code", "photoNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(NevusExamEnCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private NevusExamEnClusterContainment() {
    super("openEHR-EHR-CLUSTER.nevus_exam_en.v0");
  }

  public static NevusExamEnClusterContainment getInstance() {
    return new NevusExamEnClusterContainment();
  }
}
