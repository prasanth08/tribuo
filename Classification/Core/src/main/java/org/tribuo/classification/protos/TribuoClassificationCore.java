// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-classification-core.proto

package org.tribuo.classification.protos;

public final class TribuoClassificationCore {
  private TribuoClassificationCore() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_classification_LabelProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_classification_LabelProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_classification_MutableLabelInfoProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_classification_MutableLabelInfoProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_classification_ImmutableLabelInfoProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_classification_ImmutableLabelInfoProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_classification_DummyClassifierModelProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_classification_DummyClassifierModelProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_classification_LabelFeatureExtractorProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_classification_LabelFeatureExtractorProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_classification_DefaultFeatureExtractorProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_classification_DefaultFeatureExtractorProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tribuo_classification_ViterbiModelProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tribuo_classification_ViterbiModelProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n tribuo-classification-core.proto\022\025trib" +
      "uo.classification\032\031google/protobuf/any.p" +
      "roto\032\021tribuo-core.proto\"*\n\nLabelProto\022\r\n" +
      "\005label\030\001 \001(\t\022\r\n\005score\030\002 \001(\001\"K\n\025MutableLa" +
      "belInfoProto\022\r\n\005label\030\001 \003(\t\022\r\n\005count\030\002 \003" +
      "(\003\022\024\n\014unknownCount\030\003 \001(\005\"Y\n\027ImmutableLab" +
      "elInfoProto\022\r\n\005label\030\001 \003(\t\022\r\n\005count\030\002 \003(" +
      "\003\022\n\n\002id\030\003 \003(\005\022\024\n\014unknownCount\030\004 \001(\005\"\253\001\n\031" +
      "DummyClassifierModelProto\022-\n\010metadata\030\001 " +
      "\001(\0132\033.tribuo.core.ModelDataProto\022\022\n\ndumm" +
      "y_type\030\002 \001(\t\0220\n\016constant_label\030\003 \001(\0132\030.t" +
      "ribuo.core.OutputProto\022\013\n\003cdf\030\004 \003(\001\022\014\n\004s" +
      "eed\030\005 \001(\003\"p\n\032LabelFeatureExtractorProto\022" +
      "\017\n\007version\030\001 \001(\005\022\022\n\nclass_name\030\002 \001(\t\022-\n\017" +
      "serialized_data\030\003 \001(\0132\024.google.protobuf." +
      "Any\"\225\001\n\034DefaultFeatureExtractorProto\022\033\n\023" +
      "most_recent_outcome\030\001 \001(\005\022\034\n\024least_recen" +
      "t_outcome\030\002 \001(\005\022\022\n\nuse_bigram\030\003 \001(\010\022\023\n\013u" +
      "se_trigram\030\004 \001(\010\022\021\n\tuse_4gram\030\005 \001(\010\"\355\001\n\021" +
      "ViterbiModelProto\022-\n\010metadata\030\001 \001(\0132\033.tr" +
      "ibuo.core.ModelDataProto\022&\n\005model\030\002 \001(\0132" +
      "\027.tribuo.core.ModelProto\022R\n\027label_featur" +
      "e_extractor\030\003 \001(\01321.tribuo.classificatio" +
      "n.LabelFeatureExtractorProto\022\022\n\nstack_si" +
      "ze\030\004 \001(\005\022\031\n\021score_aggregation\030\005 \001(\tB$\n o" +
      "rg.tribuo.classification.protosP\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          org.tribuo.protos.core.TribuoCore.getDescriptor(),
        });
    internal_static_tribuo_classification_LabelProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tribuo_classification_LabelProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_classification_LabelProto_descriptor,
        new java.lang.String[] { "Label", "Score", });
    internal_static_tribuo_classification_MutableLabelInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tribuo_classification_MutableLabelInfoProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_classification_MutableLabelInfoProto_descriptor,
        new java.lang.String[] { "Label", "Count", "UnknownCount", });
    internal_static_tribuo_classification_ImmutableLabelInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tribuo_classification_ImmutableLabelInfoProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_classification_ImmutableLabelInfoProto_descriptor,
        new java.lang.String[] { "Label", "Count", "Id", "UnknownCount", });
    internal_static_tribuo_classification_DummyClassifierModelProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tribuo_classification_DummyClassifierModelProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_classification_DummyClassifierModelProto_descriptor,
        new java.lang.String[] { "Metadata", "DummyType", "ConstantLabel", "Cdf", "Seed", });
    internal_static_tribuo_classification_LabelFeatureExtractorProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tribuo_classification_LabelFeatureExtractorProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_classification_LabelFeatureExtractorProto_descriptor,
        new java.lang.String[] { "Version", "ClassName", "SerializedData", });
    internal_static_tribuo_classification_DefaultFeatureExtractorProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tribuo_classification_DefaultFeatureExtractorProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_classification_DefaultFeatureExtractorProto_descriptor,
        new java.lang.String[] { "MostRecentOutcome", "LeastRecentOutcome", "UseBigram", "UseTrigram", "Use4Gram", });
    internal_static_tribuo_classification_ViterbiModelProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tribuo_classification_ViterbiModelProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tribuo_classification_ViterbiModelProto_descriptor,
        new java.lang.String[] { "Metadata", "Model", "LabelFeatureExtractor", "StackSize", "ScoreAggregation", });
    com.google.protobuf.AnyProto.getDescriptor();
    org.tribuo.protos.core.TribuoCore.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}