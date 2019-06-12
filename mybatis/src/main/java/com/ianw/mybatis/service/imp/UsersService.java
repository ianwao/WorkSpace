package com.ianw.mybatis.service.imp;

import com.ianw.mybatis.po.Message;
import com.ianw.mybatis.po.Users;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UsersService implements com.ianw.mybatis.service.UsersService {
    @Override
    public int add(Users user) {
       /* Message<Users> message=new Message<>();

        //SqlSession session =new SqlSessionFactoryBuilder().build();
        int rs= session.insert("com.ianw.mybatis.dao.userMapping.addUser",user);
       session.commit();
 	   session.close();
 	   return rs;*/
    }



}
