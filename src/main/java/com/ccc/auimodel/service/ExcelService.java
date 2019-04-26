package com.ccc.auimodel.service;


import com.ccc.auimodel.common.util.ReturnInfoUtil;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Luowenlv on 2018/9/10,15:29
 */
public interface ExcelService {
    public ReturnInfoUtil getExcelInfo(String fileName, MultipartFile file) throws Exception;
}
