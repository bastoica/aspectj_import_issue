/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class RenamePartitionRequest implements org.apache.thrift.TBase<RenamePartitionRequest, RenamePartitionRequest._Fields>, java.io.Serializable, Cloneable, Comparable<RenamePartitionRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RenamePartitionRequest");

  private static final org.apache.thrift.protocol.TField CAT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("catName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tableName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PART_VALS_FIELD_DESC = new org.apache.thrift.protocol.TField("partVals", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField NEW_PART_FIELD_DESC = new org.apache.thrift.protocol.TField("newPart", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField VALID_WRITE_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("validWriteIdList", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField TXN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("txnId", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField CLONE_PART_FIELD_DESC = new org.apache.thrift.protocol.TField("clonePart", org.apache.thrift.protocol.TType.BOOL, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RenamePartitionRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RenamePartitionRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String catName; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String dbName; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String tableName; // required
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> partVals; // required
  private @org.apache.thrift.annotation.Nullable Partition newPart; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String validWriteIdList; // optional
  private long txnId; // optional
  private boolean clonePart; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CAT_NAME((short)1, "catName"),
    DB_NAME((short)2, "dbName"),
    TABLE_NAME((short)3, "tableName"),
    PART_VALS((short)4, "partVals"),
    NEW_PART((short)5, "newPart"),
    VALID_WRITE_ID_LIST((short)6, "validWriteIdList"),
    TXN_ID((short)7, "txnId"),
    CLONE_PART((short)8, "clonePart");

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
        case 1: // CAT_NAME
          return CAT_NAME;
        case 2: // DB_NAME
          return DB_NAME;
        case 3: // TABLE_NAME
          return TABLE_NAME;
        case 4: // PART_VALS
          return PART_VALS;
        case 5: // NEW_PART
          return NEW_PART;
        case 6: // VALID_WRITE_ID_LIST
          return VALID_WRITE_ID_LIST;
        case 7: // TXN_ID
          return TXN_ID;
        case 8: // CLONE_PART
          return CLONE_PART;
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
  private static final int __TXNID_ISSET_ID = 0;
  private static final int __CLONEPART_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CAT_NAME,_Fields.VALID_WRITE_ID_LIST,_Fields.TXN_ID,_Fields.CLONE_PART};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CAT_NAME, new org.apache.thrift.meta_data.FieldMetaData("catName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("tableName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PART_VALS, new org.apache.thrift.meta_data.FieldMetaData("partVals", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.NEW_PART, new org.apache.thrift.meta_data.FieldMetaData("newPart", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Partition.class)));
    tmpMap.put(_Fields.VALID_WRITE_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("validWriteIdList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TXN_ID, new org.apache.thrift.meta_data.FieldMetaData("txnId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CLONE_PART, new org.apache.thrift.meta_data.FieldMetaData("clonePart", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RenamePartitionRequest.class, metaDataMap);
  }

  public RenamePartitionRequest() {
  }

  public RenamePartitionRequest(
    java.lang.String dbName,
    java.lang.String tableName,
    java.util.List<java.lang.String> partVals,
    Partition newPart)
  {
    this();
    this.dbName = dbName;
    this.tableName = tableName;
    this.partVals = partVals;
    this.newPart = newPart;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RenamePartitionRequest(RenamePartitionRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCatName()) {
      this.catName = other.catName;
    }
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetPartVals()) {
      java.util.List<java.lang.String> __this__partVals = new java.util.ArrayList<java.lang.String>(other.partVals);
      this.partVals = __this__partVals;
    }
    if (other.isSetNewPart()) {
      this.newPart = new Partition(other.newPart);
    }
    if (other.isSetValidWriteIdList()) {
      this.validWriteIdList = other.validWriteIdList;
    }
    this.txnId = other.txnId;
    this.clonePart = other.clonePart;
  }

  public RenamePartitionRequest deepCopy() {
    return new RenamePartitionRequest(this);
  }

  @Override
  public void clear() {
    this.catName = null;
    this.dbName = null;
    this.tableName = null;
    this.partVals = null;
    this.newPart = null;
    this.validWriteIdList = null;
    setTxnIdIsSet(false);
    this.txnId = 0;
    setClonePartIsSet(false);
    this.clonePart = false;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCatName() {
    return this.catName;
  }

  public void setCatName(@org.apache.thrift.annotation.Nullable java.lang.String catName) {
    this.catName = catName;
  }

  public void unsetCatName() {
    this.catName = null;
  }

  /** Returns true if field catName is set (has been assigned a value) and false otherwise */
  public boolean isSetCatName() {
    return this.catName != null;
  }

  public void setCatNameIsSet(boolean value) {
    if (!value) {
      this.catName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDbName() {
    return this.dbName;
  }

  public void setDbName(@org.apache.thrift.annotation.Nullable java.lang.String dbName) {
    this.dbName = dbName;
  }

  public void unsetDbName() {
    this.dbName = null;
  }

  /** Returns true if field dbName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.dbName != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.dbName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTableName() {
    return this.tableName;
  }

  public void setTableName(@org.apache.thrift.annotation.Nullable java.lang.String tableName) {
    this.tableName = tableName;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  public int getPartValsSize() {
    return (this.partVals == null) ? 0 : this.partVals.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getPartValsIterator() {
    return (this.partVals == null) ? null : this.partVals.iterator();
  }

  public void addToPartVals(java.lang.String elem) {
    if (this.partVals == null) {
      this.partVals = new java.util.ArrayList<java.lang.String>();
    }
    this.partVals.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getPartVals() {
    return this.partVals;
  }

  public void setPartVals(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> partVals) {
    this.partVals = partVals;
  }

  public void unsetPartVals() {
    this.partVals = null;
  }

  /** Returns true if field partVals is set (has been assigned a value) and false otherwise */
  public boolean isSetPartVals() {
    return this.partVals != null;
  }

  public void setPartValsIsSet(boolean value) {
    if (!value) {
      this.partVals = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public Partition getNewPart() {
    return this.newPart;
  }

  public void setNewPart(@org.apache.thrift.annotation.Nullable Partition newPart) {
    this.newPart = newPart;
  }

  public void unsetNewPart() {
    this.newPart = null;
  }

  /** Returns true if field newPart is set (has been assigned a value) and false otherwise */
  public boolean isSetNewPart() {
    return this.newPart != null;
  }

  public void setNewPartIsSet(boolean value) {
    if (!value) {
      this.newPart = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getValidWriteIdList() {
    return this.validWriteIdList;
  }

  public void setValidWriteIdList(@org.apache.thrift.annotation.Nullable java.lang.String validWriteIdList) {
    this.validWriteIdList = validWriteIdList;
  }

  public void unsetValidWriteIdList() {
    this.validWriteIdList = null;
  }

  /** Returns true if field validWriteIdList is set (has been assigned a value) and false otherwise */
  public boolean isSetValidWriteIdList() {
    return this.validWriteIdList != null;
  }

  public void setValidWriteIdListIsSet(boolean value) {
    if (!value) {
      this.validWriteIdList = null;
    }
  }

  public long getTxnId() {
    return this.txnId;
  }

  public void setTxnId(long txnId) {
    this.txnId = txnId;
    setTxnIdIsSet(true);
  }

  public void unsetTxnId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  /** Returns true if field txnId is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  public void setTxnIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TXNID_ISSET_ID, value);
  }

  public boolean isClonePart() {
    return this.clonePart;
  }

  public void setClonePart(boolean clonePart) {
    this.clonePart = clonePart;
    setClonePartIsSet(true);
  }

  public void unsetClonePart() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CLONEPART_ISSET_ID);
  }

  /** Returns true if field clonePart is set (has been assigned a value) and false otherwise */
  public boolean isSetClonePart() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CLONEPART_ISSET_ID);
  }

  public void setClonePartIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CLONEPART_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CAT_NAME:
      if (value == null) {
        unsetCatName();
      } else {
        setCatName((java.lang.String)value);
      }
      break;

    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((java.lang.String)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((java.lang.String)value);
      }
      break;

    case PART_VALS:
      if (value == null) {
        unsetPartVals();
      } else {
        setPartVals((java.util.List<java.lang.String>)value);
      }
      break;

    case NEW_PART:
      if (value == null) {
        unsetNewPart();
      } else {
        setNewPart((Partition)value);
      }
      break;

    case VALID_WRITE_ID_LIST:
      if (value == null) {
        unsetValidWriteIdList();
      } else {
        setValidWriteIdList((java.lang.String)value);
      }
      break;

    case TXN_ID:
      if (value == null) {
        unsetTxnId();
      } else {
        setTxnId((java.lang.Long)value);
      }
      break;

    case CLONE_PART:
      if (value == null) {
        unsetClonePart();
      } else {
        setClonePart((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CAT_NAME:
      return getCatName();

    case DB_NAME:
      return getDbName();

    case TABLE_NAME:
      return getTableName();

    case PART_VALS:
      return getPartVals();

    case NEW_PART:
      return getNewPart();

    case VALID_WRITE_ID_LIST:
      return getValidWriteIdList();

    case TXN_ID:
      return getTxnId();

    case CLONE_PART:
      return isClonePart();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CAT_NAME:
      return isSetCatName();
    case DB_NAME:
      return isSetDbName();
    case TABLE_NAME:
      return isSetTableName();
    case PART_VALS:
      return isSetPartVals();
    case NEW_PART:
      return isSetNewPart();
    case VALID_WRITE_ID_LIST:
      return isSetValidWriteIdList();
    case TXN_ID:
      return isSetTxnId();
    case CLONE_PART:
      return isSetClonePart();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof RenamePartitionRequest)
      return this.equals((RenamePartitionRequest)that);
    return false;
  }

  public boolean equals(RenamePartitionRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_catName = true && this.isSetCatName();
    boolean that_present_catName = true && that.isSetCatName();
    if (this_present_catName || that_present_catName) {
      if (!(this_present_catName && that_present_catName))
        return false;
      if (!this.catName.equals(that.catName))
        return false;
    }

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_partVals = true && this.isSetPartVals();
    boolean that_present_partVals = true && that.isSetPartVals();
    if (this_present_partVals || that_present_partVals) {
      if (!(this_present_partVals && that_present_partVals))
        return false;
      if (!this.partVals.equals(that.partVals))
        return false;
    }

    boolean this_present_newPart = true && this.isSetNewPart();
    boolean that_present_newPart = true && that.isSetNewPart();
    if (this_present_newPart || that_present_newPart) {
      if (!(this_present_newPart && that_present_newPart))
        return false;
      if (!this.newPart.equals(that.newPart))
        return false;
    }

    boolean this_present_validWriteIdList = true && this.isSetValidWriteIdList();
    boolean that_present_validWriteIdList = true && that.isSetValidWriteIdList();
    if (this_present_validWriteIdList || that_present_validWriteIdList) {
      if (!(this_present_validWriteIdList && that_present_validWriteIdList))
        return false;
      if (!this.validWriteIdList.equals(that.validWriteIdList))
        return false;
    }

    boolean this_present_txnId = true && this.isSetTxnId();
    boolean that_present_txnId = true && that.isSetTxnId();
    if (this_present_txnId || that_present_txnId) {
      if (!(this_present_txnId && that_present_txnId))
        return false;
      if (this.txnId != that.txnId)
        return false;
    }

    boolean this_present_clonePart = true && this.isSetClonePart();
    boolean that_present_clonePart = true && that.isSetClonePart();
    if (this_present_clonePart || that_present_clonePart) {
      if (!(this_present_clonePart && that_present_clonePart))
        return false;
      if (this.clonePart != that.clonePart)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCatName()) ? 131071 : 524287);
    if (isSetCatName())
      hashCode = hashCode * 8191 + catName.hashCode();

    hashCode = hashCode * 8191 + ((isSetDbName()) ? 131071 : 524287);
    if (isSetDbName())
      hashCode = hashCode * 8191 + dbName.hashCode();

    hashCode = hashCode * 8191 + ((isSetTableName()) ? 131071 : 524287);
    if (isSetTableName())
      hashCode = hashCode * 8191 + tableName.hashCode();

    hashCode = hashCode * 8191 + ((isSetPartVals()) ? 131071 : 524287);
    if (isSetPartVals())
      hashCode = hashCode * 8191 + partVals.hashCode();

    hashCode = hashCode * 8191 + ((isSetNewPart()) ? 131071 : 524287);
    if (isSetNewPart())
      hashCode = hashCode * 8191 + newPart.hashCode();

    hashCode = hashCode * 8191 + ((isSetValidWriteIdList()) ? 131071 : 524287);
    if (isSetValidWriteIdList())
      hashCode = hashCode * 8191 + validWriteIdList.hashCode();

    hashCode = hashCode * 8191 + ((isSetTxnId()) ? 131071 : 524287);
    if (isSetTxnId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(txnId);

    hashCode = hashCode * 8191 + ((isSetClonePart()) ? 131071 : 524287);
    if (isSetClonePart())
      hashCode = hashCode * 8191 + ((clonePart) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(RenamePartitionRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetCatName(), other.isSetCatName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catName, other.catName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDbName(), other.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbName, other.dbName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTableName(), other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartVals(), other.isSetPartVals());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartVals()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partVals, other.partVals);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNewPart(), other.isSetNewPart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewPart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.newPart, other.newPart);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetValidWriteIdList(), other.isSetValidWriteIdList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValidWriteIdList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.validWriteIdList, other.validWriteIdList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTxnId(), other.isSetTxnId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txnId, other.txnId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetClonePart(), other.isSetClonePart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClonePart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clonePart, other.clonePart);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RenamePartitionRequest(");
    boolean first = true;

    if (isSetCatName()) {
      sb.append("catName:");
      if (this.catName == null) {
        sb.append("null");
      } else {
        sb.append(this.catName);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("dbName:");
    if (this.dbName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tableName:");
    if (this.tableName == null) {
      sb.append("null");
    } else {
      sb.append(this.tableName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("partVals:");
    if (this.partVals == null) {
      sb.append("null");
    } else {
      sb.append(this.partVals);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("newPart:");
    if (this.newPart == null) {
      sb.append("null");
    } else {
      sb.append(this.newPart);
    }
    first = false;
    if (isSetValidWriteIdList()) {
      if (!first) sb.append(", ");
      sb.append("validWriteIdList:");
      if (this.validWriteIdList == null) {
        sb.append("null");
      } else {
        sb.append(this.validWriteIdList);
      }
      first = false;
    }
    if (isSetTxnId()) {
      if (!first) sb.append(", ");
      sb.append("txnId:");
      sb.append(this.txnId);
      first = false;
    }
    if (isSetClonePart()) {
      if (!first) sb.append(", ");
      sb.append("clonePart:");
      sb.append(this.clonePart);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDbName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dbName' is unset! Struct:" + toString());
    }

    if (!isSetTableName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tableName' is unset! Struct:" + toString());
    }

    if (!isSetPartVals()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partVals' is unset! Struct:" + toString());
    }

    if (!isSetNewPart()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'newPart' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (newPart != null) {
      newPart.validate();
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RenamePartitionRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RenamePartitionRequestStandardScheme getScheme() {
      return new RenamePartitionRequestStandardScheme();
    }
  }

  private static class RenamePartitionRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<RenamePartitionRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RenamePartitionRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CAT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catName = iprot.readString();
              struct.setCatNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PART_VALS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list1392 = iprot.readListBegin();
                struct.partVals = new java.util.ArrayList<java.lang.String>(_list1392.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1393;
                for (int _i1394 = 0; _i1394 < _list1392.size; ++_i1394)
                {
                  _elem1393 = iprot.readString();
                  struct.partVals.add(_elem1393);
                }
                iprot.readListEnd();
              }
              struct.setPartValsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NEW_PART
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.newPart = new Partition();
              struct.newPart.read(iprot);
              struct.setNewPartIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // VALID_WRITE_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.validWriteIdList = iprot.readString();
              struct.setValidWriteIdListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TXN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txnId = iprot.readI64();
              struct.setTxnIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // CLONE_PART
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.clonePart = iprot.readBool();
              struct.setClonePartIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RenamePartitionRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.catName != null) {
        if (struct.isSetCatName()) {
          oprot.writeFieldBegin(CAT_NAME_FIELD_DESC);
          oprot.writeString(struct.catName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.dbName != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.dbName);
        oprot.writeFieldEnd();
      }
      if (struct.tableName != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.tableName);
        oprot.writeFieldEnd();
      }
      if (struct.partVals != null) {
        oprot.writeFieldBegin(PART_VALS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.partVals.size()));
          for (java.lang.String _iter1395 : struct.partVals)
          {
            oprot.writeString(_iter1395);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.newPart != null) {
        oprot.writeFieldBegin(NEW_PART_FIELD_DESC);
        struct.newPart.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.validWriteIdList != null) {
        if (struct.isSetValidWriteIdList()) {
          oprot.writeFieldBegin(VALID_WRITE_ID_LIST_FIELD_DESC);
          oprot.writeString(struct.validWriteIdList);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTxnId()) {
        oprot.writeFieldBegin(TXN_ID_FIELD_DESC);
        oprot.writeI64(struct.txnId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetClonePart()) {
        oprot.writeFieldBegin(CLONE_PART_FIELD_DESC);
        oprot.writeBool(struct.clonePart);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RenamePartitionRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RenamePartitionRequestTupleScheme getScheme() {
      return new RenamePartitionRequestTupleScheme();
    }
  }

  private static class RenamePartitionRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<RenamePartitionRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RenamePartitionRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.dbName);
      oprot.writeString(struct.tableName);
      {
        oprot.writeI32(struct.partVals.size());
        for (java.lang.String _iter1396 : struct.partVals)
        {
          oprot.writeString(_iter1396);
        }
      }
      struct.newPart.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCatName()) {
        optionals.set(0);
      }
      if (struct.isSetValidWriteIdList()) {
        optionals.set(1);
      }
      if (struct.isSetTxnId()) {
        optionals.set(2);
      }
      if (struct.isSetClonePart()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetCatName()) {
        oprot.writeString(struct.catName);
      }
      if (struct.isSetValidWriteIdList()) {
        oprot.writeString(struct.validWriteIdList);
      }
      if (struct.isSetTxnId()) {
        oprot.writeI64(struct.txnId);
      }
      if (struct.isSetClonePart()) {
        oprot.writeBool(struct.clonePart);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RenamePartitionRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.dbName = iprot.readString();
      struct.setDbNameIsSet(true);
      struct.tableName = iprot.readString();
      struct.setTableNameIsSet(true);
      {
        org.apache.thrift.protocol.TList _list1397 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
        struct.partVals = new java.util.ArrayList<java.lang.String>(_list1397.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _elem1398;
        for (int _i1399 = 0; _i1399 < _list1397.size; ++_i1399)
        {
          _elem1398 = iprot.readString();
          struct.partVals.add(_elem1398);
        }
      }
      struct.setPartValsIsSet(true);
      struct.newPart = new Partition();
      struct.newPart.read(iprot);
      struct.setNewPartIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.catName = iprot.readString();
        struct.setCatNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.validWriteIdList = iprot.readString();
        struct.setValidWriteIdListIsSet(true);
      }
      if (incoming.get(2)) {
        struct.txnId = iprot.readI64();
        struct.setTxnIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.clonePart = iprot.readBool();
        struct.setClonePartIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

