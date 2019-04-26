package com.ccc.auimodel.dao;


import com.ccc.auimodel.pojo.BankModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Luowenlv on 2018/9/10,15:40
 */
public interface ExcelDao extends JpaRepository<BankModel,Integer> {
}
