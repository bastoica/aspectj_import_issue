<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class ThriftHiveMetastore_update_creation_metadata_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'catName',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'dbname',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'tbl_name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'creation_metadata',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\CreationMetadata',
        ),
    );

    /**
     * @var string
     */
    public $catName = null;
    /**
     * @var string
     */
    public $dbname = null;
    /**
     * @var string
     */
    public $tbl_name = null;
    /**
     * @var \metastore\CreationMetadata
     */
    public $creation_metadata = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['catName'])) {
                $this->catName = $vals['catName'];
            }
            if (isset($vals['dbname'])) {
                $this->dbname = $vals['dbname'];
            }
            if (isset($vals['tbl_name'])) {
                $this->tbl_name = $vals['tbl_name'];
            }
            if (isset($vals['creation_metadata'])) {
                $this->creation_metadata = $vals['creation_metadata'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_update_creation_metadata_args';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->catName);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->dbname);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->tbl_name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRUCT) {
                        $this->creation_metadata = new \metastore\CreationMetadata();
                        $xfer += $this->creation_metadata->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_update_creation_metadata_args');
        if ($this->catName !== null) {
            $xfer += $output->writeFieldBegin('catName', TType::STRING, 1);
            $xfer += $output->writeString($this->catName);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->dbname !== null) {
            $xfer += $output->writeFieldBegin('dbname', TType::STRING, 2);
            $xfer += $output->writeString($this->dbname);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->tbl_name !== null) {
            $xfer += $output->writeFieldBegin('tbl_name', TType::STRING, 3);
            $xfer += $output->writeString($this->tbl_name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->creation_metadata !== null) {
            if (!is_object($this->creation_metadata)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('creation_metadata', TType::STRUCT, 4);
            $xfer += $this->creation_metadata->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
