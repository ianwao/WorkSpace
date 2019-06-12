package com.ianw.yubao.po;

import java.sql.Timestamp;

public class PayMessage {
    private String invId;//投保单号
    private String invNum;//互保凭证号
    private String riderId;//批单号
    private String boatId;//船名号
    private String payTypeNme;
    private String invTypeName;//互保类型名称
    private String payTypeName;//费用类型
    private String riderName;//批改类型
    private double payMoney;//应付总金额
    private double pay_claim_num;//本期应付金额
    private double paid_claim_num;//本期已付金额；
    private String payPeople;//付款人
    private String receiver;//收款人
    private java.sql.Timestamp remainDate;//本期截止日期


    public PayMessage() {
    }

    public String getPayTypeNme() {
        return payTypeNme;
    }

    public void setPayTypeNme(String payTypeNme) {
        this.payTypeNme = payTypeNme;
    }

    public String getInvId() {
        return invId;
    }

    public void setInvId(String invId) {
        this.invId = invId;
    }

    public String getInvNum() {
        return invNum;
    }

    public void setInvNum(String invNum) {
        this.invNum = invNum;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getBoatId() {
        return boatId;
    }

    public void setBoatId(String boatId) {
        this.boatId = boatId;
    }

    public String getInvTypeName() {
        return invTypeName;
    }

    public void setInvTypeName(String invTypeName) {
        this.invTypeName = invTypeName;
    }

    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(double payMoney) {
        this.payMoney = payMoney;
    }

    public double getPay_claim_num() {
        return pay_claim_num;
    }

    public void setPay_claim_num(double pay_claim_num) {
        this.pay_claim_num = pay_claim_num;
    }

    public double getPaid_claim_num() {
        return paid_claim_num;
    }

    public void setPaid_claim_num(double paid_claim_num) {
        this.paid_claim_num = paid_claim_num;
    }

    public String getPayPeople() {
        return payPeople;
    }

    public void setPayPeople(String payPeople) {
        this.payPeople = payPeople;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Timestamp getRemainDate() {
        return remainDate;
    }

    public void setRemainDate(Timestamp remainDate) {
        this.remainDate = remainDate;
    }
}
