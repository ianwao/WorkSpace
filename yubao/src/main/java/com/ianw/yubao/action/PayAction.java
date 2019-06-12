package com.ianw.yubao.action;

import com.ianw.yubao.po.Message;
import com.ianw.yubao.po.Pay;
import com.ianw.yubao.service.IPayService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@CrossOrigin
@RequestMapping("/pay")
public class PayAction {
    @Autowired
    private IPayService service;

    @RequestMapping("/add")//添加付款信息
    @ResponseBody
    public Message<Pay> addPay(Pay pay){
        return service.add(pay);
    }

    @RequestMapping("/query")//查找付款信息
    @ResponseBody
    public Message<Pay> queryByPay(Long payId){return service.queryByInvId(payId);}

    @RequestMapping("/all")//查找所有付款信息
    @ResponseBody
    public Message<Pay> query(){ return service.query(); }

}
