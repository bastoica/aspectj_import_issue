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

class GetAllFunctionsResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'functions',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\Function',
                ),
        ),
    );

    /**
     * @var \metastore\Function[]
     */
    public $functions = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['functions'])) {
                $this->functions = $vals['functions'];
            }
        }
    }

    public function getName()
    {
        return 'GetAllFunctionsResponse';
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
                    if ($ftype == TType::LST) {
                        $this->functions = array();
                        $_size1008 = 0;
                        $_etype1011 = 0;
                        $xfer += $input->readListBegin($_etype1011, $_size1008);
                        for ($_i1012 = 0; $_i1012 < $_size1008; ++$_i1012) {
                            $elem1013 = null;
                            $elem1013 = new \metastore\Function();
                            $xfer += $elem1013->read($input);
                            $this->functions []= $elem1013;
                        }
                        $xfer += $input->readListEnd();
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
        $xfer += $output->writeStructBegin('GetAllFunctionsResponse');
        if ($this->functions !== null) {
            if (!is_array($this->functions)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('functions', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->functions));
            foreach ($this->functions as $iter1014) {
                $xfer += $iter1014->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}