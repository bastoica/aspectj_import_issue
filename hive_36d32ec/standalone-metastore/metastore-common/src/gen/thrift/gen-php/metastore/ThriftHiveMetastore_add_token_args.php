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

class ThriftHiveMetastore_add_token_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'token_identifier',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'delegation_token',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var string
     */
    public $token_identifier = null;
    /**
     * @var string
     */
    public $delegation_token = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['token_identifier'])) {
                $this->token_identifier = $vals['token_identifier'];
            }
            if (isset($vals['delegation_token'])) {
                $this->delegation_token = $vals['delegation_token'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_add_token_args';
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
                        $xfer += $input->readString($this->token_identifier);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->delegation_token);
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
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_add_token_args');
        if ($this->token_identifier !== null) {
            $xfer += $output->writeFieldBegin('token_identifier', TType::STRING, 1);
            $xfer += $output->writeString($this->token_identifier);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->delegation_token !== null) {
            $xfer += $output->writeFieldBegin('delegation_token', TType::STRING, 2);
            $xfer += $output->writeString($this->delegation_token);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
