package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsSerivce itemsSerivce;
    //定义方法 查找所有
    @RequestMapping("/list")
    public String list(Model model){
        List<Items> list = itemsSerivce.list();
        model.addAttribute("items",list);
        return "items";
    }

    //定义方法,添加联系人
    @RequestMapping("/save")
    public String save(Items items){
        itemsSerivce.save(items);
        System.out.println("保存成功");
        return "redirect:/items/list";
    }
}
