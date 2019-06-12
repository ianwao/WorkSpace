package com.ianw.yubao.po;


public class PayClaim {

  private long riderId;//批单号
  private long payId;//保单编号
  private double pay_claim_num;//本期应付金额
  private double paid_claim_num;//本期已付金额；
  private java.sql.Timestamp payDate;//付款日期
  private java.sql.Timestamp recordDate;//记录日期
  private String payPeople;//付款人
  private String receiver;//收款人
  private java.sql.Timestamp remainDate;//本期截止日期

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

  public long getRiderId() {
    return riderId;
  }

  public void setRiderId(long riderId) {
    this.riderId = riderId;
  }


  public long getPayId() {
    return payId;
  }

  public void setPayId(long payId) {
    this.payId = payId;
  }

  public java.sql.Timestamp getPayDate() {
    return payDate;
  }

  public void setPayDate(java.sql.Timestamp payDate) {
    this.payDate = payDate;
  }


  public java.sql.Timestamp getRecordDate() {
    return recordDate;
  }

  public void setRecordDate(java.sql.Timestamp recordDate) {
    this.recordDate = recordDate;
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


  public java.sql.Timestamp getRemainDate() {
    return remainDate;
  }

  public void setRemainDate(java.sql.Timestamp remainDate) {
    this.remainDate = remainDate;
  }

}
