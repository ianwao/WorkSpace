package com.ianw.yubao.po;

import java.util.List;

public class Message<E> {
    private boolean flag;
    private String msg;
    private E data;
    private List<E> datalist;
    public Message() {
    }
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public List<E> getDatalist() {
        return datalist;
    }

    public void setDatalist(List<E> datalist) {
        this.datalist = datalist;
    }
}
