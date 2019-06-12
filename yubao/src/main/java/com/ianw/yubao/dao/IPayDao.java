package com.ianw.yubao.dao;

import com.ianw.yubao.po.Pay;
import com.ianw.yubao.po.PayClaim;
import com.ianw.yubao.po.PayMessage;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IPayDao {

    @Results(id = "payMap",value = {
            @Result(property = "payId",column = "pay_id"),
            @Result(property = "payTypeId",column = "pay_type_id"),
            @Result(property = "invId",column = "inv_id"),
            @Result(property = "payETime",column = "pay_e_date"),
            @Result(property = "paySTime",column = "pay_s_date"),
            @Result(property = "subsidies",column = "subsidies"),
            @Result(property = "payMoney",column = "pay_money"),
            @Result(property = "paidMoney",column = "paid_money"),
            @Result(property = "payDebt",column = "pay_debt"),
    })
    @Select("select pay_id,pay_type_id,inv_id,pay_e_time,pay_s_time,subsidies,pay_money from t_pay;")
    List<Pay> query();


    //插入收款信息
    @Insert("insert into t_pay_claim(inv_id,stage_id,pay_date,record_date,pay_people,receiver,remain_date) " +
            "VALUES(#{invId},#{stageNum},#{payDate},#{recordDate},#{payPeople},#{receiver},#{remainDate});")
    int add(Pay pay);

    //根据收款信息里的单证id查找分期付款的信息
    @Results(id = "payClaim",value = {
            @Result(property = "riderId",column = "rider_id"),
            @Result(property = "invId",column = "inv_id"),
            @Result(property = "stageNum",column = "stage_num"),
            @Result(property = "payDate",column = "pay_date"),
            @Result(property = "recordDate",column = "recore_date"),
            @Result(property = "payPeople",column = "pay_people"),
            @Result(property = "receiver",column = "receiver"),
            @Result(property = "remainDate",column = "remain_date")
    })
    @Select("select rider_id,inv_id,stage_num,pay_date,record_date,pay_people,receiver,remain_date" +
            "from t_pay_claim where inv_id=#{invId}")
    List<PayClaim> queryClaimByInvId(String invId);

    @ResultMap({"payMap","payClaim"})
    @Select("select rider_id,pay_id,pay_date,record_date,pay_people,receiver,remain_date from t_pay_claim where pay_id=#{payId};")
    List<Pay> queryByInvId(Long payId);











}
