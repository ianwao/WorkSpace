package com.ianw.yubao.po;

public class PayType {
    private int payTypeId;//付款类型编号
    private String payTypeName;//付款类型名称

    public PayType() {
    }

    public int getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(int payTypeId) {
        this.payTypeId = payTypeId;
    }

    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName;
    }
}
