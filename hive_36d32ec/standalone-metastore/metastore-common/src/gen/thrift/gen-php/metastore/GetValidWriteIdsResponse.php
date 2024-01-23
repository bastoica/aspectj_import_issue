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

class GetValidWriteIdsResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'tblValidWriteIds',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\TableValidWriteIds',
                ),
        ),
    );

    /**
     * @var \metastore\TableValidWriteIds[]
     */
    public $tblValidWriteIds = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['tblValidWriteIds'])) {
                $this->tblValidWriteIds = $vals['tblValidWriteIds'];
            }
        }
    }

    public function getName()
    {
        return 'GetValidWriteIdsResponse';
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
                        $this->tblValidWriteIds = array();
                        $_size744 = 0;
                        $_etype747 = 0;
                        $xfer += $input->readListBegin($_etype747, $_size744);
                        for ($_i748 = 0; $_i748 < $_size744; ++$_i748) {
                            $elem749 = null;
                            $elem749 = new \metastore\TableValidWriteIds();
                            $xfer += $elem749->read($input);
                            $this->tblValidWriteIds []= $elem749;
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
        $xfer += $output->writeStructBegin('GetValidWriteIdsResponse');
        if ($this->tblValidWriteIds !== null) {
            if (!is_array($this->tblValidWriteIds)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('tblValidWriteIds', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->tblValidWriteIds));
            foreach ($this->tblValidWriteIds as $iter750) {
                $xfer += $iter750->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
