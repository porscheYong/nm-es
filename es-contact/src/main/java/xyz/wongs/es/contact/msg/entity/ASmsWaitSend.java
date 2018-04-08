package xyz.wongs.es.contact.msg.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.util.Date;

public class ASmsWaitSend extends DataEntity<ASmsWaitSend> {


    /**
     * 构造方案，初始化短信固定内容
     * @method      ASmsWaitSend
  ASmsWaitSend      WCNGS@QQ.COM
     * @version
     * @see
     * @return
     * @exception
     * @date
     */
    public ASmsWaitSend(){
        this.srcTermid="10001";
        this.mtServType="96";
        this.sendPriority=Short.valueOf("2");
        this.feeType="00";
        this.requireApply=Short.valueOf("0");

    }



    private String mtSeq;

    private String mtServType;

    private Short sendPriority;

    private String msgContent;

    private String destTermid;

    private String srcTermid;

    private String feeUserTermid;

    private String feeType;

    private Date makeTime;

    private Short requireApply;


    public String getMtSeq() {
        return mtSeq;
    }

    public void setMtSeq(String mtSeq) {
        this.mtSeq = mtSeq == null ? null : mtSeq.trim();
    }

    public String getMtServType() {
        return mtServType;
    }

    public void setMtServType(String mtServType) {
        this.mtServType = mtServType == null ? null : mtServType.trim();
    }

    public Short getSendPriority() {
        return sendPriority;
    }

    public void setSendPriority(Short sendPriority) {
        this.sendPriority = sendPriority;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    public String getDestTermid() {
        return destTermid;
    }

    public void setDestTermid(String destTermid) {
        this.destTermid = destTermid == null ? null : destTermid.trim();
    }

    public String getSrcTermid() {
        return srcTermid;
    }

    public void setSrcTermid(String srcTermid) {
        this.srcTermid = srcTermid == null ? null : srcTermid.trim();
    }



    public String getFeeUserTermid() {
        return feeUserTermid;
    }

    public void setFeeUserTermid(String feeUserTermid) {
        this.feeUserTermid = feeUserTermid == null ? null : feeUserTermid.trim();
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    public Date getMakeTime() {
        return makeTime;
    }

    public void setMakeTime(Date makeTime) {
        this.makeTime = makeTime;
    }


    public Short getRequireApply() {
        return requireApply;
    }

    public void setRequireApply(Short requireApply) {
        this.requireApply = requireApply;
    }


    @Override
    public String toString() {
        return "ASmsWaitSend{" +
                "mtSeq='" + mtSeq + '\'' +
                ", mtServType='" + mtServType + '\'' +
                ", sendPriority=" + sendPriority +
                ", msgContent='" + msgContent + '\'' +
                ", destTermid='" + destTermid + '\'' +
                ", srcTermid='" + srcTermid + '\'' +
                ", feeUserTermid='" + feeUserTermid + '\'' +
                ", feeType='" + feeType + '\'' +
                ", makeTime=" + makeTime +
                ", requireApply=" + requireApply +
                '}';
    }
}