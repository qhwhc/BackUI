package com.ccc.auimodel.service.impl;

import com.ccc.auimodel.dao.WebMenuRepository;
import com.ccc.auimodel.pojo.WebMenu;
import com.ccc.auimodel.service.WebMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
@Service
public class WebMenuServiceImpl implements WebMenuService {
    @Autowired
    WebMenuRepository webMenuRepository;

    @Override
    public List<WebMenu> findAll() {
        return webMenuRepository.findAll();
    }
}
