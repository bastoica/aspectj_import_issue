/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class SerDeInfo implements org.apache.thrift.TBase<SerDeInfo, SerDeInfo._Fields>, java.io.Serializable, Cloneable, Comparable<SerDeInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SerDeInfo");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SERIALIZATION_LIB_FIELD_DESC = new org.apache.thrift.protocol.TField("serializationLib", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PARAMETERS_FIELD_DESC = new org.apache.thrift.protocol.TField("parameters", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField SERIALIZER_CLASS_FIELD_DESC = new org.apache.thrift.protocol.TField("serializerClass", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField DESERIALIZER_CLASS_FIELD_DESC = new org.apache.thrift.protocol.TField("deserializerClass", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField SERDE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("serdeType", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SerDeInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SerDeInfoTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String name; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String serializationLib; // required
  private @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> parameters; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String description; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String serializerClass; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String deserializerClass; // optional
  private @org.apache.thrift.annotation.Nullable SerdeType serdeType; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    SERIALIZATION_LIB((short)2, "serializationLib"),
    PARAMETERS((short)3, "parameters"),
    DESCRIPTION((short)4, "description"),
    SERIALIZER_CLASS((short)5, "serializerClass"),
    DESERIALIZER_CLASS((short)6, "deserializerClass"),
    /**
     * 
     * @see SerdeType
     */
    SERDE_TYPE((short)7, "serdeType");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // SERIALIZATION_LIB
          return SERIALIZATION_LIB;
        case 3: // PARAMETERS
          return PARAMETERS;
        case 4: // DESCRIPTION
          return DESCRIPTION;
        case 5: // SERIALIZER_CLASS
          return SERIALIZER_CLASS;
        case 6: // DESERIALIZER_CLASS
          return DESERIALIZER_CLASS;
        case 7: // SERDE_TYPE
          return SERDE_TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.DESCRIPTION,_Fields.SERIALIZER_CLASS,_Fields.DESERIALIZER_CLASS,_Fields.SERDE_TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERIALIZATION_LIB, new org.apache.thrift.meta_data.FieldMetaData("serializationLib", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAMETERS, new org.apache.thrift.meta_data.FieldMetaData("parameters", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERIALIZER_CLASS, new org.apache.thrift.meta_data.FieldMetaData("serializerClass", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESERIALIZER_CLASS, new org.apache.thrift.meta_data.FieldMetaData("deserializerClass", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERDE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("serdeType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SerdeType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SerDeInfo.class, metaDataMap);
  }

  public SerDeInfo() {
  }

  public SerDeInfo(
    java.lang.String name,
    java.lang.String serializationLib,
    java.util.Map<java.lang.String,java.lang.String> parameters)
  {
    this();
    this.name = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(name);
    this.serializationLib = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(serializationLib);
    this.parameters = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(parameters);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SerDeInfo(SerDeInfo other) {
    if (other.isSetName()) {
      this.name = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(other.name);
    }
    if (other.isSetSerializationLib()) {
      this.serializationLib = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(other.serializationLib);
    }
    if (other.isSetParameters()) {
      java.util.Map<java.lang.String,java.lang.String> __this__parameters = new java.util.HashMap<java.lang.String,java.lang.String>(other.parameters);
      this.parameters = __this__parameters;
    }
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    if (other.isSetSerializerClass()) {
      this.serializerClass = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(other.serializerClass);
    }
    if (other.isSetDeserializerClass()) {
      this.deserializerClass = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(other.deserializerClass);
    }
    if (other.isSetSerdeType()) {
      this.serdeType = other.serdeType;
    }
  }

  public SerDeInfo deepCopy() {
    return new SerDeInfo(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.serializationLib = null;
    this.parameters = null;
    this.description = null;
    this.serializerClass = null;
    this.deserializerClass = null;
    this.serdeType = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public void setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(name);
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSerializationLib() {
    return this.serializationLib;
  }

  public void setSerializationLib(@org.apache.thrift.annotation.Nullable java.lang.String serializationLib) {
    this.serializationLib = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(serializationLib);
  }

  public void unsetSerializationLib() {
    this.serializationLib = null;
  }

  /** Returns true if field serializationLib is set (has been assigned a value) and false otherwise */
  public boolean isSetSerializationLib() {
    return this.serializationLib != null;
  }

  public void setSerializationLibIsSet(boolean value) {
    if (!value) {
      this.serializationLib = null;
    }
  }

  public int getParametersSize() {
    return (this.parameters == null) ? 0 : this.parameters.size();
  }

  public void putToParameters(java.lang.String key, java.lang.String val) {
    if (this.parameters == null) {
      this.parameters = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.parameters.put(org.apache.hadoop.hive.metastore.utils.StringUtils.intern(key), org.apache.hadoop.hive.metastore.utils.StringUtils.intern(val));
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,java.lang.String> getParameters() {
    return this.parameters;
  }

  public void setParameters(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.lang.String> parameters) {
    this.parameters = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(parameters);
  }

  public void unsetParameters() {
    this.parameters = null;
  }

  /** Returns true if field parameters is set (has been assigned a value) and false otherwise */
  public boolean isSetParameters() {
    return this.parameters != null;
  }

  public void setParametersIsSet(boolean value) {
    if (!value) {
      this.parameters = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDescription() {
    return this.description;
  }

  public void setDescription(@org.apache.thrift.annotation.Nullable java.lang.String description) {
    this.description = description;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSerializerClass() {
    return this.serializerClass;
  }

  public void setSerializerClass(@org.apache.thrift.annotation.Nullable java.lang.String serializerClass) {
    this.serializerClass = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(serializerClass);
  }

  public void unsetSerializerClass() {
    this.serializerClass = null;
  }

  /** Returns true if field serializerClass is set (has been assigned a value) and false otherwise */
  public boolean isSetSerializerClass() {
    return this.serializerClass != null;
  }

  public void setSerializerClassIsSet(boolean value) {
    if (!value) {
      this.serializerClass = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDeserializerClass() {
    return this.deserializerClass;
  }

  public void setDeserializerClass(@org.apache.thrift.annotation.Nullable java.lang.String deserializerClass) {
    this.deserializerClass = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(deserializerClass);
  }

  public void unsetDeserializerClass() {
    this.deserializerClass = null;
  }

  /** Returns true if field deserializerClass is set (has been assigned a value) and false otherwise */
  public boolean isSetDeserializerClass() {
    return this.deserializerClass != null;
  }

  public void setDeserializerClassIsSet(boolean value) {
    if (!value) {
      this.deserializerClass = null;
    }
  }

  /**
   * 
   * @see SerdeType
   */
  @org.apache.thrift.annotation.Nullable
  public SerdeType getSerdeType() {
    return this.serdeType;
  }

  /**
   * 
   * @see SerdeType
   */
  public void setSerdeType(@org.apache.thrift.annotation.Nullable SerdeType serdeType) {
    this.serdeType = serdeType;
  }

  public void unsetSerdeType() {
    this.serdeType = null;
  }

  /** Returns true if field serdeType is set (has been assigned a value) and false otherwise */
  public boolean isSetSerdeType() {
    return this.serdeType != null;
  }

  public void setSerdeTypeIsSet(boolean value) {
    if (!value) {
      this.serdeType = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case SERIALIZATION_LIB:
      if (value == null) {
        unsetSerializationLib();
      } else {
        setSerializationLib((java.lang.String)value);
      }
      break;

    case PARAMETERS:
      if (value == null) {
        unsetParameters();
      } else {
        setParameters((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((java.lang.String)value);
      }
      break;

    case SERIALIZER_CLASS:
      if (value == null) {
        unsetSerializerClass();
      } else {
        setSerializerClass((java.lang.String)value);
      }
      break;

    case DESERIALIZER_CLASS:
      if (value == null) {
        unsetDeserializerClass();
      } else {
        setDeserializerClass((java.lang.String)value);
      }
      break;

    case SERDE_TYPE:
      if (value == null) {
        unsetSerdeType();
      } else {
        setSerdeType((SerdeType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case SERIALIZATION_LIB:
      return getSerializationLib();

    case PARAMETERS:
      return getParameters();

    case DESCRIPTION:
      return getDescription();

    case SERIALIZER_CLASS:
      return getSerializerClass();

    case DESERIALIZER_CLASS:
      return getDeserializerClass();

    case SERDE_TYPE:
      return getSerdeType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case SERIALIZATION_LIB:
      return isSetSerializationLib();
    case PARAMETERS:
      return isSetParameters();
    case DESCRIPTION:
      return isSetDescription();
    case SERIALIZER_CLASS:
      return isSetSerializerClass();
    case DESERIALIZER_CLASS:
      return isSetDeserializerClass();
    case SERDE_TYPE:
      return isSetSerdeType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof SerDeInfo)
      return this.equals((SerDeInfo)that);
    return false;
  }

  public boolean equals(SerDeInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_serializationLib = true && this.isSetSerializationLib();
    boolean that_present_serializationLib = true && that.isSetSerializationLib();
    if (this_present_serializationLib || that_present_serializationLib) {
      if (!(this_present_serializationLib && that_present_serializationLib))
        return false;
      if (!this.serializationLib.equals(that.serializationLib))
        return false;
    }

    boolean this_present_parameters = true && this.isSetParameters();
    boolean that_present_parameters = true && that.isSetParameters();
    if (this_present_parameters || that_present_parameters) {
      if (!(this_present_parameters && that_present_parameters))
        return false;
      if (!this.parameters.equals(that.parameters))
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_serializerClass = true && this.isSetSerializerClass();
    boolean that_present_serializerClass = true && that.isSetSerializerClass();
    if (this_present_serializerClass || that_present_serializerClass) {
      if (!(this_present_serializerClass && that_present_serializerClass))
        return false;
      if (!this.serializerClass.equals(that.serializerClass))
        return false;
    }

    boolean this_present_deserializerClass = true && this.isSetDeserializerClass();
    boolean that_present_deserializerClass = true && that.isSetDeserializerClass();
    if (this_present_deserializerClass || that_present_deserializerClass) {
      if (!(this_present_deserializerClass && that_present_deserializerClass))
        return false;
      if (!this.deserializerClass.equals(that.deserializerClass))
        return false;
    }

    boolean this_present_serdeType = true && this.isSetSerdeType();
    boolean that_present_serdeType = true && that.isSetSerdeType();
    if (this_present_serdeType || that_present_serdeType) {
      if (!(this_present_serdeType && that_present_serdeType))
        return false;
      if (!this.serdeType.equals(that.serdeType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetSerializationLib()) ? 131071 : 524287);
    if (isSetSerializationLib())
      hashCode = hashCode * 8191 + serializationLib.hashCode();

    hashCode = hashCode * 8191 + ((isSetParameters()) ? 131071 : 524287);
    if (isSetParameters())
      hashCode = hashCode * 8191 + parameters.hashCode();

    hashCode = hashCode * 8191 + ((isSetDescription()) ? 131071 : 524287);
    if (isSetDescription())
      hashCode = hashCode * 8191 + description.hashCode();

    hashCode = hashCode * 8191 + ((isSetSerializerClass()) ? 131071 : 524287);
    if (isSetSerializerClass())
      hashCode = hashCode * 8191 + serializerClass.hashCode();

    hashCode = hashCode * 8191 + ((isSetDeserializerClass()) ? 131071 : 524287);
    if (isSetDeserializerClass())
      hashCode = hashCode * 8191 + deserializerClass.hashCode();

    hashCode = hashCode * 8191 + ((isSetSerdeType()) ? 131071 : 524287);
    if (isSetSerdeType())
      hashCode = hashCode * 8191 + serdeType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(SerDeInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSerializationLib(), other.isSetSerializationLib());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSerializationLib()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serializationLib, other.serializationLib);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetParameters(), other.isSetParameters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParameters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parameters, other.parameters);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDescription(), other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSerializerClass(), other.isSetSerializerClass());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSerializerClass()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serializerClass, other.serializerClass);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDeserializerClass(), other.isSetDeserializerClass());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeserializerClass()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deserializerClass, other.deserializerClass);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSerdeType(), other.isSetSerdeType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSerdeType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serdeType, other.serdeType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SerDeInfo(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("serializationLib:");
    if (this.serializationLib == null) {
      sb.append("null");
    } else {
      sb.append(this.serializationLib);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("parameters:");
    if (this.parameters == null) {
      sb.append("null");
    } else {
      sb.append(this.parameters);
    }
    first = false;
    if (isSetDescription()) {
      if (!first) sb.append(", ");
      sb.append("description:");
      if (this.description == null) {
        sb.append("null");
      } else {
        sb.append(this.description);
      }
      first = false;
    }
    if (isSetSerializerClass()) {
      if (!first) sb.append(", ");
      sb.append("serializerClass:");
      if (this.serializerClass == null) {
        sb.append("null");
      } else {
        sb.append(this.serializerClass);
      }
      first = false;
    }
    if (isSetDeserializerClass()) {
      if (!first) sb.append(", ");
      sb.append("deserializerClass:");
      if (this.deserializerClass == null) {
        sb.append("null");
      } else {
        sb.append(this.deserializerClass);
      }
      first = false;
    }
    if (isSetSerdeType()) {
      if (!first) sb.append(", ");
      sb.append("serdeType:");
      if (this.serdeType == null) {
        sb.append("null");
      } else {
        sb.append(this.serdeType);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SerDeInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SerDeInfoStandardScheme getScheme() {
      return new SerDeInfoStandardScheme();
    }
  }

  private static class SerDeInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<SerDeInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SerDeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(iprot.readString());
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SERIALIZATION_LIB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serializationLib = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(iprot.readString());
              struct.setSerializationLibIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARAMETERS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map216 = iprot.readMapBegin();
                struct.parameters = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map216.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key217;
                @org.apache.thrift.annotation.Nullable java.lang.String _val218;
                for (int _i219 = 0; _i219 < _map216.size; ++_i219)
                {
                  _key217 = iprot.readString();
                  _val218 = iprot.readString();
                  struct.parameters.put(_key217, _val218);
                }
                iprot.readMapEnd();
              }
              struct.parameters = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(struct.parameters); struct.setParametersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SERIALIZER_CLASS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serializerClass = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(iprot.readString());
              struct.setSerializerClassIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DESERIALIZER_CLASS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.deserializerClass = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(iprot.readString());
              struct.setDeserializerClassIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SERDE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.serdeType = org.apache.hadoop.hive.metastore.api.SerdeType.findByValue(iprot.readI32());
              struct.setSerdeTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SerDeInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.serializationLib != null) {
        oprot.writeFieldBegin(SERIALIZATION_LIB_FIELD_DESC);
        oprot.writeString(struct.serializationLib);
        oprot.writeFieldEnd();
      }
      if (struct.parameters != null) {
        oprot.writeFieldBegin(PARAMETERS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.parameters.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter220 : struct.parameters.entrySet())
          {
            oprot.writeString(_iter220.getKey());
            oprot.writeString(_iter220.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.description != null) {
        if (struct.isSetDescription()) {
          oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.description);
          oprot.writeFieldEnd();
        }
      }
      if (struct.serializerClass != null) {
        if (struct.isSetSerializerClass()) {
          oprot.writeFieldBegin(SERIALIZER_CLASS_FIELD_DESC);
          oprot.writeString(struct.serializerClass);
          oprot.writeFieldEnd();
        }
      }
      if (struct.deserializerClass != null) {
        if (struct.isSetDeserializerClass()) {
          oprot.writeFieldBegin(DESERIALIZER_CLASS_FIELD_DESC);
          oprot.writeString(struct.deserializerClass);
          oprot.writeFieldEnd();
        }
      }
      if (struct.serdeType != null) {
        if (struct.isSetSerdeType()) {
          oprot.writeFieldBegin(SERDE_TYPE_FIELD_DESC);
          oprot.writeI32(struct.serdeType.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SerDeInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SerDeInfoTupleScheme getScheme() {
      return new SerDeInfoTupleScheme();
    }
  }

  private static class SerDeInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<SerDeInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SerDeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetSerializationLib()) {
        optionals.set(1);
      }
      if (struct.isSetParameters()) {
        optionals.set(2);
      }
      if (struct.isSetDescription()) {
        optionals.set(3);
      }
      if (struct.isSetSerializerClass()) {
        optionals.set(4);
      }
      if (struct.isSetDeserializerClass()) {
        optionals.set(5);
      }
      if (struct.isSetSerdeType()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetSerializationLib()) {
        oprot.writeString(struct.serializationLib);
      }
      if (struct.isSetParameters()) {
        {
          oprot.writeI32(struct.parameters.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter221 : struct.parameters.entrySet())
          {
            oprot.writeString(_iter221.getKey());
            oprot.writeString(_iter221.getValue());
          }
        }
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
      if (struct.isSetSerializerClass()) {
        oprot.writeString(struct.serializerClass);
      }
      if (struct.isSetDeserializerClass()) {
        oprot.writeString(struct.deserializerClass);
      }
      if (struct.isSetSerdeType()) {
        oprot.writeI32(struct.serdeType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SerDeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.name = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(iprot.readString());
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.serializationLib = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(iprot.readString());
        struct.setSerializationLibIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map222 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING); 
          struct.parameters = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map222.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key223;
          @org.apache.thrift.annotation.Nullable java.lang.String _val224;
          for (int _i225 = 0; _i225 < _map222.size; ++_i225)
          {
            _key223 = iprot.readString();
            _val224 = iprot.readString();
            struct.parameters.put(_key223, _val224);
          }
        }
        struct.parameters = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(struct.parameters); struct.setParametersIsSet(true);
      }
      if (incoming.get(3)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
      if (incoming.get(4)) {
        struct.serializerClass = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(iprot.readString());
        struct.setSerializerClassIsSet(true);
      }
      if (incoming.get(5)) {
        struct.deserializerClass = org.apache.hadoop.hive.metastore.utils.StringUtils.intern(iprot.readString());
        struct.setDeserializerClassIsSet(true);
      }
      if (incoming.get(6)) {
        struct.serdeType = org.apache.hadoop.hive.metastore.api.SerdeType.findByValue(iprot.readI32());
        struct.setSerdeTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

