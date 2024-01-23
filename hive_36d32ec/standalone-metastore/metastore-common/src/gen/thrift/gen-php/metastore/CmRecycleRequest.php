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

class CmRecycleRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'dataPath',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'purge',
            'isRequired' => true,
            'type' => TType::BOOL,
        ),
    );

    /**
     * @var string
     */
    public $dataPath = null;
    /**
     * @var bool
     */
    public $purge = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['dataPath'])) {
                $this->dataPath = $vals['dataPath'];
            }
            if (isset($vals['purge'])) {
                $this->purge = $vals['purge'];
            }
        }
    }

    public function getName()
    {
        return 'CmRecycleRequest';
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
                        $xfer += $input->readString($this->dataPath);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->purge);
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
        $xfer += $output->writeStructBegin('CmRecycleRequest');
        if ($this->dataPath !== null) {
            $xfer += $output->writeFieldBegin('dataPath', TType::STRING, 1);
            $xfer += $output->writeString($this->dataPath);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->purge !== null) {
            $xfer += $output->writeFieldBegin('purge', TType::BOOL, 2);
            $xfer += $output->writeBool($this->purge);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
