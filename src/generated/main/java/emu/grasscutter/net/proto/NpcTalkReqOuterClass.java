// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NpcTalkReq.proto

package emu.grasscutter.net.proto;

public final class NpcTalkReqOuterClass {
  private NpcTalkReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NpcTalkReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NpcTalkReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 8;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 npc_entity_id = 9;</code>
     * @return The npcEntityId.
     */
    int getNpcEntityId();

    /**
     * <code>uint32 talk_id = 7;</code>
     * @return The talkId.
     */
    int getTalkId();
  }
  /**
   * <pre>
   * CmdId: 572
   * EnetChannelId: 0
   * EnetIsReliable: false
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code NpcTalkReq}
   */
  public static final class NpcTalkReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NpcTalkReq)
      NpcTalkReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NpcTalkReq.newBuilder() to construct.
    private NpcTalkReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NpcTalkReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NpcTalkReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NpcTalkReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 56: {

              talkId_ = input.readUInt32();
              break;
            }
            case 64: {

              entityId_ = input.readUInt32();
              break;
            }
            case 72: {

              npcEntityId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.NpcTalkReqOuterClass.internal_static_NpcTalkReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NpcTalkReqOuterClass.internal_static_NpcTalkReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq.class, emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 8;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 8;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int NPC_ENTITY_ID_FIELD_NUMBER = 9;
    private int npcEntityId_;
    /**
     * <code>uint32 npc_entity_id = 9;</code>
     * @return The npcEntityId.
     */
    @java.lang.Override
    public int getNpcEntityId() {
      return npcEntityId_;
    }

    public static final int TALK_ID_FIELD_NUMBER = 7;
    private int talkId_;
    /**
     * <code>uint32 talk_id = 7;</code>
     * @return The talkId.
     */
    @java.lang.Override
    public int getTalkId() {
      return talkId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (talkId_ != 0) {
        output.writeUInt32(7, talkId_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(8, entityId_);
      }
      if (npcEntityId_ != 0) {
        output.writeUInt32(9, npcEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (talkId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, talkId_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, entityId_);
      }
      if (npcEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, npcEntityId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq other = (emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getNpcEntityId()
          != other.getNpcEntityId()) return false;
      if (getTalkId()
          != other.getTalkId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + NPC_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNpcEntityId();
      hash = (37 * hash) + TALK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTalkId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 572
     * EnetChannelId: 0
     * EnetIsReliable: false
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code NpcTalkReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NpcTalkReq)
        emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NpcTalkReqOuterClass.internal_static_NpcTalkReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NpcTalkReqOuterClass.internal_static_NpcTalkReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq.class, emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        entityId_ = 0;

        npcEntityId_ = 0;

        talkId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NpcTalkReqOuterClass.internal_static_NpcTalkReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq build() {
        emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq buildPartial() {
        emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq result = new emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq(this);
        result.entityId_ = entityId_;
        result.npcEntityId_ = npcEntityId_;
        result.talkId_ = talkId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq) {
          return mergeFrom((emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq other) {
        if (other == emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getNpcEntityId() != 0) {
          setNpcEntityId(other.getNpcEntityId());
        }
        if (other.getTalkId() != 0) {
          setTalkId(other.getTalkId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 8;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 8;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int npcEntityId_ ;
      /**
       * <code>uint32 npc_entity_id = 9;</code>
       * @return The npcEntityId.
       */
      @java.lang.Override
      public int getNpcEntityId() {
        return npcEntityId_;
      }
      /**
       * <code>uint32 npc_entity_id = 9;</code>
       * @param value The npcEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setNpcEntityId(int value) {
        
        npcEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 npc_entity_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearNpcEntityId() {
        
        npcEntityId_ = 0;
        onChanged();
        return this;
      }

      private int talkId_ ;
      /**
       * <code>uint32 talk_id = 7;</code>
       * @return The talkId.
       */
      @java.lang.Override
      public int getTalkId() {
        return talkId_;
      }
      /**
       * <code>uint32 talk_id = 7;</code>
       * @param value The talkId to set.
       * @return This builder for chaining.
       */
      public Builder setTalkId(int value) {
        
        talkId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 talk_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearTalkId() {
        
        talkId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:NpcTalkReq)
    }

    // @@protoc_insertion_point(class_scope:NpcTalkReq)
    private static final emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq();
    }

    public static emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NpcTalkReq>
        PARSER = new com.google.protobuf.AbstractParser<NpcTalkReq>() {
      @java.lang.Override
      public NpcTalkReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NpcTalkReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NpcTalkReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NpcTalkReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NpcTalkReqOuterClass.NpcTalkReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NpcTalkReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NpcTalkReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020NpcTalkReq.proto\"G\n\nNpcTalkReq\022\021\n\tenti" +
      "ty_id\030\010 \001(\r\022\025\n\rnpc_entity_id\030\t \001(\r\022\017\n\007ta" +
      "lk_id\030\007 \001(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NpcTalkReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NpcTalkReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NpcTalkReq_descriptor,
        new java.lang.String[] { "EntityId", "NpcEntityId", "TalkId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}