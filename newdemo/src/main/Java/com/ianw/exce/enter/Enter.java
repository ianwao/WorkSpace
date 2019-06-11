package com.ianw.exce.enter;

import com.ianw.exce.service.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Enter {
    public static void main(String[] args)  {
        ApplicationContext comtext=new ClassPathXmlApplicationContext("spring.xml");
        Hello he= (Hello) comtext.getBean("hello");
        he.show();
       /* Collection<String> coll = new ArrayList<String>();
         coll.add("abc1");
          coll.add("abc2");
          coll.add("abc3");
          coll.add("abc4");*/
 //迭代器,对集合ArrayList中的元素进行取出

//调用集合的方法iterator()获取出,Iterator接口的实现类的对象
   /*    Iterator<String> it = coll.iterator();*/
//接口实现类对象,调用方法hasNext()判断集合中是否有元素
 //boolean b = it.hasNext();
//System.out.println(b);
 //接口的实现类对象,调用方法next()取出集合中的元素
   //String s = it.next();
   //System.out.println(s);

//迭代是反复内容,使用循环实现,循环的条件,集合中没元素, hasNext()返回了false
/* while(it.hasNext()){
 String s = it.next();
 System.out.println(s);
}*/
        /*for (Iterator<String> it2 = coll.iterator(); it2.hasNext();  ) {
            System.out.println(it2.next());
        }*/

        /*
         *  定义方法,可以同时迭代2个集合
         *  参数: 怎么实现 , 不能写ArrayList,也不能写HashSet
         *  参数: 共同实现的接口Collection
         *  泛型的通配,匹配所有的数据类型  ?
         */
    }
/*
    public static void iterator(Collection<?> coll){
        Iterator<?> it = coll.iterator();
        while(it.hasNext()){
         //it.next()获取的对象,什么类型
            System.out.println(it.next());
        }
    }*/
}
