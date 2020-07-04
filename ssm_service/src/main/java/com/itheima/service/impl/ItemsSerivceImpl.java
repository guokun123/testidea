package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsSerivceImpl implements ItemsSerivce {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public List<Items> list() {
        return itemsDao.list();
    }

    @Override
    public void save(Items items) {
        itemsDao.save(items);
    }
}
