package com.ccc.auimodel;

import com.ccc.auimodel.dao.WebMenuRepository;
import com.ccc.auimodel.pojo.WebMenu;
import com.ccc.auimodel.service.WebMenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuimodelApplicationTests {
    @Autowired
    private WebMenuRepository webMenuRepository;

    @Autowired
    private WebMenuService webMenuService;
    @Test
    public void contextLoads() {
    }

    @Test
    public void addMenu(){
        WebMenu webMenu = new WebMenu();
        webMenu.setId("1");
        webMenu.setShowName("TestMenu");
        webMenu.setHref("index");
        webMenu.setParams("jumpto=chipYield");
        webMenu.setIron("<i class=\"fa fa-rocket\"></i>");
        webMenuRepository.save(webMenu);
    }

    @Test
    public void testMenu(){
        System.out.println(webMenuService.findAll());
    }

    @Test
    public void  testDelete(){
        webMenuRepository.delete(new WebMenu().setId("1"));
    }
}
