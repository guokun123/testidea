package com.itheima.dao;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DaoTest {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        ItemsDao itemsDao =  (ItemsDao)ap.getBean("itemsDao");
        List<Items> list = itemsDao.list();
        for (Items items : list) {
            System.out.println(items);
        }

    }
}

