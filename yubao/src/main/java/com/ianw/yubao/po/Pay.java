package com.ianw.yubao.po;

public class Pay {
  private long payId;//付款id
  private String payTypeId;//付款方式
  private String invId;//保单编号
  private java.sql.Timestamp payETime;//付款截止日期
  private java.sql.Timestamp paySTime;//付款开始日期
  private double subsidies;//补助金额
  private double payMoney;//付款总金额
  private double paidMoney;//已付金额
  private double payDebt;//尚欠金额
  private PayClaim payClaim;//分期付款信息

  public Pay() {
  }

  public PayClaim getPayClaim() {
    return payClaim;
  }

  public void setPayClaim(PayClaim payClaim) {
    this.payClaim = payClaim;
  }

  public long getPayId() {
    return payId;
  }

  public void setPayId(long payId) {
    this.payId = payId;
  }


  public String getPayTypeId() {
    return payTypeId;
  }

  public void setPayTypeId(String payTypeId) {
    this.payTypeId = payTypeId;
  }

  public String getInvId() {
    return invId;
  }

  public void setInvId(String invId) {
    this.invId = invId;
  }


  public java.sql.Timestamp getPayETime() {
    return payETime;
  }

  public void setPayETime(java.sql.Timestamp payETime) {
    this.payETime = payETime;
  }


  public java.sql.Timestamp getPaySTime() {
    return paySTime;
  }

  public void setPaySTime(java.sql.Timestamp paySTime) {
    this.paySTime = paySTime;
  }


  public double getSubsidies() {
    return subsidies;
  }

  public void setSubsidies(double subsidies) {
    this.subsidies = subsidies;
  }


  public double getPayMoney() {
    return payMoney;
  }

  public void setPayMoney(double payMoney) {
    this.payMoney = payMoney;
  }


  public double getPaidMoney() {
    return paidMoney;
  }

  public void setPaidMoney(double paidMoney) {
    this.paidMoney = paidMoney;
  }


  public double getPayDebt() {
    return payDebt;
  }

  public void setPayDebt(double payDebt) {
    this.payDebt = payDebt;
  }

}
