/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class ScheduledQueryKey implements org.apache.thrift.TBase<ScheduledQueryKey, ScheduledQueryKey._Fields>, java.io.Serializable, Cloneable, Comparable<ScheduledQueryKey> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ScheduledQueryKey");

  private static final org.apache.thrift.protocol.TField SCHEDULE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("scheduleName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CLUSTER_NAMESPACE_FIELD_DESC = new org.apache.thrift.protocol.TField("clusterNamespace", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ScheduledQueryKeyStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ScheduledQueryKeyTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String scheduleName; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String clusterNamespace; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCHEDULE_NAME((short)1, "scheduleName"),
    CLUSTER_NAMESPACE((short)2, "clusterNamespace");

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
        case 1: // SCHEDULE_NAME
          return SCHEDULE_NAME;
        case 2: // CLUSTER_NAMESPACE
          return CLUSTER_NAMESPACE;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCHEDULE_NAME, new org.apache.thrift.meta_data.FieldMetaData("scheduleName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLUSTER_NAMESPACE, new org.apache.thrift.meta_data.FieldMetaData("clusterNamespace", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ScheduledQueryKey.class, metaDataMap);
  }

  public ScheduledQueryKey() {
  }

  public ScheduledQueryKey(
    java.lang.String scheduleName,
    java.lang.String clusterNamespace)
  {
    this();
    this.scheduleName = scheduleName;
    this.clusterNamespace = clusterNamespace;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ScheduledQueryKey(ScheduledQueryKey other) {
    if (other.isSetScheduleName()) {
      this.scheduleName = other.scheduleName;
    }
    if (other.isSetClusterNamespace()) {
      this.clusterNamespace = other.clusterNamespace;
    }
  }

  public ScheduledQueryKey deepCopy() {
    return new ScheduledQueryKey(this);
  }

  @Override
  public void clear() {
    this.scheduleName = null;
    this.clusterNamespace = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getScheduleName() {
    return this.scheduleName;
  }

  public void setScheduleName(@org.apache.thrift.annotation.Nullable java.lang.String scheduleName) {
    this.scheduleName = scheduleName;
  }

  public void unsetScheduleName() {
    this.scheduleName = null;
  }

  /** Returns true if field scheduleName is set (has been assigned a value) and false otherwise */
  public boolean isSetScheduleName() {
    return this.scheduleName != null;
  }

  public void setScheduleNameIsSet(boolean value) {
    if (!value) {
      this.scheduleName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getClusterNamespace() {
    return this.clusterNamespace;
  }

  public void setClusterNamespace(@org.apache.thrift.annotation.Nullable java.lang.String clusterNamespace) {
    this.clusterNamespace = clusterNamespace;
  }

  public void unsetClusterNamespace() {
    this.clusterNamespace = null;
  }

  /** Returns true if field clusterNamespace is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterNamespace() {
    return this.clusterNamespace != null;
  }

  public void setClusterNamespaceIsSet(boolean value) {
    if (!value) {
      this.clusterNamespace = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SCHEDULE_NAME:
      if (value == null) {
        unsetScheduleName();
      } else {
        setScheduleName((java.lang.String)value);
      }
      break;

    case CLUSTER_NAMESPACE:
      if (value == null) {
        unsetClusterNamespace();
      } else {
        setClusterNamespace((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SCHEDULE_NAME:
      return getScheduleName();

    case CLUSTER_NAMESPACE:
      return getClusterNamespace();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SCHEDULE_NAME:
      return isSetScheduleName();
    case CLUSTER_NAMESPACE:
      return isSetClusterNamespace();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ScheduledQueryKey)
      return this.equals((ScheduledQueryKey)that);
    return false;
  }

  public boolean equals(ScheduledQueryKey that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_scheduleName = true && this.isSetScheduleName();
    boolean that_present_scheduleName = true && that.isSetScheduleName();
    if (this_present_scheduleName || that_present_scheduleName) {
      if (!(this_present_scheduleName && that_present_scheduleName))
        return false;
      if (!this.scheduleName.equals(that.scheduleName))
        return false;
    }

    boolean this_present_clusterNamespace = true && this.isSetClusterNamespace();
    boolean that_present_clusterNamespace = true && that.isSetClusterNamespace();
    if (this_present_clusterNamespace || that_present_clusterNamespace) {
      if (!(this_present_clusterNamespace && that_present_clusterNamespace))
        return false;
      if (!this.clusterNamespace.equals(that.clusterNamespace))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetScheduleName()) ? 131071 : 524287);
    if (isSetScheduleName())
      hashCode = hashCode * 8191 + scheduleName.hashCode();

    hashCode = hashCode * 8191 + ((isSetClusterNamespace()) ? 131071 : 524287);
    if (isSetClusterNamespace())
      hashCode = hashCode * 8191 + clusterNamespace.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ScheduledQueryKey other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetScheduleName(), other.isSetScheduleName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScheduleName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scheduleName, other.scheduleName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetClusterNamespace(), other.isSetClusterNamespace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterNamespace()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clusterNamespace, other.clusterNamespace);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ScheduledQueryKey(");
    boolean first = true;

    sb.append("scheduleName:");
    if (this.scheduleName == null) {
      sb.append("null");
    } else {
      sb.append(this.scheduleName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("clusterNamespace:");
    if (this.clusterNamespace == null) {
      sb.append("null");
    } else {
      sb.append(this.clusterNamespace);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetScheduleName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'scheduleName' is unset! Struct:" + toString());
    }

    if (!isSetClusterNamespace()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'clusterNamespace' is unset! Struct:" + toString());
    }

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

  private static class ScheduledQueryKeyStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ScheduledQueryKeyStandardScheme getScheme() {
      return new ScheduledQueryKeyStandardScheme();
    }
  }

  private static class ScheduledQueryKeyStandardScheme extends org.apache.thrift.scheme.StandardScheme<ScheduledQueryKey> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ScheduledQueryKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCHEDULE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.scheduleName = iprot.readString();
              struct.setScheduleNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CLUSTER_NAMESPACE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.clusterNamespace = iprot.readString();
              struct.setClusterNamespaceIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ScheduledQueryKey struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.scheduleName != null) {
        oprot.writeFieldBegin(SCHEDULE_NAME_FIELD_DESC);
        oprot.writeString(struct.scheduleName);
        oprot.writeFieldEnd();
      }
      if (struct.clusterNamespace != null) {
        oprot.writeFieldBegin(CLUSTER_NAMESPACE_FIELD_DESC);
        oprot.writeString(struct.clusterNamespace);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ScheduledQueryKeyTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ScheduledQueryKeyTupleScheme getScheme() {
      return new ScheduledQueryKeyTupleScheme();
    }
  }

  private static class ScheduledQueryKeyTupleScheme extends org.apache.thrift.scheme.TupleScheme<ScheduledQueryKey> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ScheduledQueryKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.scheduleName);
      oprot.writeString(struct.clusterNamespace);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ScheduledQueryKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.scheduleName = iprot.readString();
      struct.setScheduleNameIsSet(true);
      struct.clusterNamespace = iprot.readString();
      struct.setClusterNamespaceIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
