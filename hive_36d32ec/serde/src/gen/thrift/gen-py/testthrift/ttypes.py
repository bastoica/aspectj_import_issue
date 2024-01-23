#
# Autogenerated by Thrift Compiler (0.16.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py
#

from thrift.Thrift import TType, TMessageType, TFrozenDict, TException, TApplicationException
from thrift.protocol.TProtocol import TProtocolException
from thrift.TRecursive import fix_spec

import sys

from thrift.transport import TTransport
all_structs = []


class InnerStruct(object):
    """
    Attributes:
     - field0

    """


    def __init__(self, field0=None,):
        self.field0 = field0

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, [self.__class__, self.thrift_spec])
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.I32:
                    self.field0 = iprot.readI32()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, [self.__class__, self.thrift_spec]))
            return
        oprot.writeStructBegin('InnerStruct')
        if self.field0 is not None:
            oprot.writeFieldBegin('field0', TType.I32, 1)
            oprot.writeI32(self.field0)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class ThriftTestObj(object):
    """
    Attributes:
     - field1
     - field2
     - field3

    """


    def __init__(self, field1=None, field2=None, field3=None,):
        self.field1 = field1
        self.field2 = field2
        self.field3 = field3

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, [self.__class__, self.thrift_spec])
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.I32:
                    self.field1 = iprot.readI32()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.STRING:
                    self.field2 = iprot.readString().decode('utf-8', errors='replace') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 3:
                if ftype == TType.LIST:
                    self.field3 = []
                    (_etype3, _size0) = iprot.readListBegin()
                    for _i4 in range(_size0):
                        _elem5 = InnerStruct()
                        _elem5.read(iprot)
                        self.field3.append(_elem5)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, [self.__class__, self.thrift_spec]))
            return
        oprot.writeStructBegin('ThriftTestObj')
        if self.field1 is not None:
            oprot.writeFieldBegin('field1', TType.I32, 1)
            oprot.writeI32(self.field1)
            oprot.writeFieldEnd()
        if self.field2 is not None:
            oprot.writeFieldBegin('field2', TType.STRING, 2)
            oprot.writeString(self.field2.encode('utf-8') if sys.version_info[0] == 2 else self.field2)
            oprot.writeFieldEnd()
        if self.field3 is not None:
            oprot.writeFieldBegin('field3', TType.LIST, 3)
            oprot.writeListBegin(TType.STRUCT, len(self.field3))
            for iter6 in self.field3:
                iter6.write(oprot)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)
all_structs.append(InnerStruct)
InnerStruct.thrift_spec = (
    None,  # 0
    (1, TType.I32, 'field0', None, None, ),  # 1
)
all_structs.append(ThriftTestObj)
ThriftTestObj.thrift_spec = (
    None,  # 0
    (1, TType.I32, 'field1', None, None, ),  # 1
    (2, TType.STRING, 'field2', 'UTF8', None, ),  # 2
    (3, TType.LIST, 'field3', (TType.STRUCT, [InnerStruct, None], False), None, ),  # 3
)
fix_spec(all_structs)
del all_structs