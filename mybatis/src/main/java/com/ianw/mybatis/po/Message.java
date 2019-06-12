package com.ianw.mybatis.po;

import java.util.List;

public class Message<E> {
    private boolean flag;
    private String msg;
    private E date;
    private List<E> list;

    public Message() {
    }

    @Override
    public String toString() {
        return "Message{" +
                "flag=" + flag +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                ", list=" + list +
                '}';
    }

    public Message(boolean flag, String msg, E date, List<E> list) {
        this.flag = flag;
        this.msg = msg;
        this.date = date;
        this.list = list;
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

    public E getDate() {
        return date;
    }

    public void setDate(E date) {
        this.date = date;
    }

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }
}
