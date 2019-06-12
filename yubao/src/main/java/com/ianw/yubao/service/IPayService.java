package com.ianw.yubao.service;

import com.ianw.yubao.po.Message;
import com.ianw.yubao.po.Pay;
import com.ianw.yubao.po.PayClaim;
import com.ianw.yubao.po.PayMessage;

import java.util.List;

public interface IPayService {

    Message<Pay> add(Pay pay);

    Message<Pay> queryByInvId(Long payId);

    Message<Pay> query();
}
