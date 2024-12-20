// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuoteMessage.proto

package com.bizzan.bitrade.netty;

public final class QuoteMessage {
    private static final com.google.protobuf.Descriptors.Descriptor INTERNAL_STATIC_TUTORIAL_SIMPLERESPONSE_DESCRIPTOR;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable INTERNAL_STATIC_TUTORIAL_SIMPLERESPONSE_FIELDACCESSORTABLE;
    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        String[] descriptorData = {"\n\022QuoteMessage.proto\022\010tutorial\"/\n\016Simple"
                + "Response\022\014\n\004code\030\001 \001(\005\022\017\n\007message\030\002 \001(\tB"
                + "/\n\037com.spark.bitrade.nettyB\014Quot" + "eMessageb\006proto3"};
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            @Override
            public com.google.protobuf.ExtensionRegistry assignDescriptors(
                    com.google.protobuf.Descriptors.FileDescriptor root) {
                descriptor = root;
                return null;
            }
        };
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
                new com.google.protobuf.Descriptors.FileDescriptor[]{}, assigner);
        INTERNAL_STATIC_TUTORIAL_SIMPLERESPONSE_DESCRIPTOR = getDescriptor().getMessageTypes().get(0);
        INTERNAL_STATIC_TUTORIAL_SIMPLERESPONSE_FIELDACCESSORTABLE = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                INTERNAL_STATIC_TUTORIAL_SIMPLERESPONSE_DESCRIPTOR, new String[]{"Code", "Message",});
    }

    private QuoteMessage() {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public interface SimpleResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:tutorial.SimpleResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 code = 1;</code>
         */
        int getCode();

        /**
         * <code>string message = 2;</code>
         */
        String getMessage();

        /**
         * <code>string message = 2;</code>
         */
        com.google.protobuf.ByteString getMessageBytes();
    }

    /**
     * <pre>
     * [END java_declaration]
     * 消息传输包
     * </pre>
     * <p>
     * Protobuf type {@code tutorial.SimpleResponse}
     */
    public static final class SimpleResponse extends com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:tutorial.SimpleResponse)
            SimpleResponseOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0L;
        // @@protoc_insertion_point(class_scope:tutorial.SimpleResponse)
        private static final SimpleResponse DEFAULT_INSTANCE;
        private static final com.google.protobuf.Parser<SimpleResponse> PARSER = new com.google.protobuf.AbstractParser<SimpleResponse>() {
            @Override
            public SimpleResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                                   com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new SimpleResponse(input, extensionRegistry);
            }
        };

        static {
            DEFAULT_INSTANCE = new SimpleResponse();
        }

        private int code;
        private volatile Object message;
        private byte memoizedIsInitialized = -1;

        // Use SimpleResponse.newBuilder() to construct.
        private SimpleResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private SimpleResponse() {
            code = 0;
            message = "";
        }

        private SimpleResponse(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutableBitField0 = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {

                            code = input.readInt32();
                            break;
                        }
                        case 18: {
                            String s = input.readStringRequireUtf8();

                            message = s;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return QuoteMessage.INTERNAL_STATIC_TUTORIAL_SIMPLERESPONSE_DESCRIPTOR;
        }

        public static SimpleResponse parseFrom(java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static SimpleResponse parseFrom(java.nio.ByteBuffer data,
                                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static SimpleResponse parseFrom(com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static SimpleResponse parseFrom(com.google.protobuf.ByteString data,
                                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static SimpleResponse parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static SimpleResponse parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static SimpleResponse parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static SimpleResponse parseFrom(java.io.InputStream input,
                                               com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static SimpleResponse parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static SimpleResponse parseDelimitedFrom(java.io.InputStream input,
                                                        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
                    extensionRegistry);
        }

        public static SimpleResponse parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static SimpleResponse parseFrom(com.google.protobuf.CodedInputStream input,
                                               com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(SimpleResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static SimpleResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<SimpleResponse> parser() {
            return PARSER;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return QuoteMessage.INTERNAL_STATIC_TUTORIAL_SIMPLERESPONSE_FIELDACCESSORTABLE
                    .ensureFieldAccessorsInitialized(SimpleResponse.class, Builder.class);
        }

        /**
         * <code>int32 code = 1;</code>
         */
        @Override
        public int getCode() {
            return code;
        }

        /**
         * <code>string message = 2;</code>
         */
        @Override
        public String getMessage() {
            Object ref = message;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                message = s;
                return s;
            }
        }

        /**
         * <code>string message = 2;</code>
         */
        @Override
        public com.google.protobuf.ByteString getMessageBytes() {
            Object ref = message;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                message = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        @Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }

            memoizedIsInitialized = 1;
            return true;
        }

        @Override
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (code != 0) {
                output.writeInt32(1, code);
            }
            if (!getMessageBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message);
            }
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) {
                return size;
            }

            size = 0;
            if (code != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, code);
            }
            if (!getMessageBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message);
            }
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SimpleResponse)) {
                return super.equals(obj);
            }
            SimpleResponse other = (SimpleResponse) obj;

            boolean result = true;
            result = result && (getCode() == other.getCode());
            result = result && getMessage().equals(other.getMessage());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + CODE_FIELD_NUMBER;
            hash = (53 * hash) + getCode();
            hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
            hash = (53 * hash) + getMessage().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        @Override
        public com.google.protobuf.Parser<SimpleResponse> getParserForType() {
            return PARSER;
        }

        @Override
        public SimpleResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        /**
         * <pre>
         * [END java_declaration]
         * 消息传输包
         * </pre>
         * <p>
         * Protobuf type {@code tutorial.SimpleResponse}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:tutorial.SimpleResponse)
                SimpleResponseOrBuilder {
            private int code;
            private Object message_ = "";

            // Construct using
            // com.bizzan.bitrade.netty.QuoteMessage.SimpleResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return QuoteMessage.INTERNAL_STATIC_TUTORIAL_SIMPLERESPONSE_DESCRIPTOR;
            }

            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return QuoteMessage.INTERNAL_STATIC_TUTORIAL_SIMPLERESPONSE_FIELDACCESSORTABLE
                        .ensureFieldAccessorsInitialized(SimpleResponse.class, Builder.class);
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                }
            }

            @Override
            public Builder clear() {
                super.clear();
                code = 0;

                message_ = "";

                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return QuoteMessage.INTERNAL_STATIC_TUTORIAL_SIMPLERESPONSE_DESCRIPTOR;
            }

            @Override
            public SimpleResponse getDefaultInstanceForType() {
                return SimpleResponse.getDefaultInstance();
            }

            @Override
            public SimpleResponse build() {
                SimpleResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public SimpleResponse buildPartial() {
                SimpleResponse result = new SimpleResponse(this);
                result.code = code;
                result.message = message_;
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override
            public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            @Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            @Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            @Override
            public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                            Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            @Override
            public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SimpleResponse) {
                    return mergeFrom((SimpleResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(SimpleResponse other) {
                if (other == SimpleResponse.getDefaultInstance()) {
                    return this;
                }
                if (other.getCode() != 0) {
                    setCode(other.getCode());
                }
                if (!other.getMessage().isEmpty()) {
                    message_ = other.message;
                    onChanged();
                }
                onChanged();
                return this;
            }

            @Override
            public final boolean isInitialized() {
                return true;
            }

            @Override
            public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                                     com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
                SimpleResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SimpleResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            /**
             * <code>int32 code = 1;</code>
             */
            @Override
            public int getCode() {
                return code;
            }

            /**
             * <code>int32 code = 1;</code>
             */
            public Builder setCode(int value) {

                code = value;
                onChanged();
                return this;
            }

            /**
             * <code>int32 code = 1;</code>
             */
            public Builder clearCode() {

                code = 0;
                onChanged();
                return this;
            }

            /**
             * <code>string message = 2;</code>
             */
            @Override
            public String getMessage() {
                Object ref = message_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    message_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string message = 2;</code>
             */
            public Builder setMessage(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                message_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string message = 2;</code>
             */
            @Override
            public com.google.protobuf.ByteString getMessageBytes() {
                Object ref = message_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                    message_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string message = 2;</code>
             */
            public Builder setMessageBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                message_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string message = 2;</code>
             */
            public Builder clearMessage() {

                message_ = getDefaultInstance().getMessage();
                onChanged();
                return this;
            }

            @Override
            public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            @Override
            public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            // @@protoc_insertion_point(builder_scope:tutorial.SimpleResponse)
        }

    }

    // @@protoc_insertion_point(outer_class_scope)
}
