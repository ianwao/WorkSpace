package com.ianw.yubao.service.impl;

import com.ianw.yubao.dao.IPayDao;
import com.ianw.yubao.po.Message;
import com.ianw.yubao.po.Pay;
import com.ianw.yubao.po.PayMessage;
import com.ianw.yubao.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.w3c.dom.Entity;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PayService implements IPayService {
    @Autowired
    private IPayDao dao;
    private Message<Pay> message;

    //插入收款信息
    @Override
    public Message<Pay> add(Pay pay) {
        message=new Message<>();
        int rs=dao.add(pay);
        if(rs>0){
            message.setFlag(true);message.setMsg("数据存储成功");message.setData(pay);
        }else {
            message.setFlag(false);message.setMsg("数据存储失败");
        }
        return message;

    }
    //根据收款信息查询分期付款的信息
    @Override
    public Message<Pay> queryByInvId(Long payId) {
        message=new Message<Pay>();
        List<Pay> list=dao.queryByInvId(payId);
        if(!list.isEmpty()){
            message.setFlag(true);message.setMsg("查询成功");message.setDatalist(list);
        }else{
            message.setFlag(false);message.setMsg("未找到相关信息");
        }
        return message;
    }
    @Override
    public Message<Pay> query() {
        message=new Message<>();
        List<Pay> list=dao.query();
        if(list!=null){
            message.setFlag(true);message.setMsg("success");message.setDatalist(list);
        }else{
            message.setFlag(false);message.setMsg("error");
        }
        return message;
    }
}
