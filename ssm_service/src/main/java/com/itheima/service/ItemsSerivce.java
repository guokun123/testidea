package com.itheima.service;

import com.itheima.pojo.Items;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ItemsSerivce {
    List<Items> list();
    void save(Items items);

}
