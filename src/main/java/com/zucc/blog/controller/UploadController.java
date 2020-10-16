package com.zucc.blog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {
    private  static final Logger LOGGER = LoggerFactory.getLogger(UploadController.class);

    @GetMapping("/upload")
    public  String upload(){
        return "upload";
    }

    @PostMapping("/upload")
    @ResponseBody
    public  String upload(@RequestParam("file") MultipartFile file){
        if(file.isEmpty()) {
            return "500";
        }

        String fileName = file.getOriginalFilename();
        String filePath = "F:\\test\\test1";
//        String filetran = filePath+fileName;
        File dest = new File(filePath,fileName);
        try {
            file.transferTo(dest);
//            String base64String = MainController.file2Str(filetran);
            LOGGER.info("上传成功");
            LOGGER.info(String.valueOf(dest));
            return "200";

        }catch (IOException e) {
            LOGGER.error(e.toString(), e);
        }
        return "500";
    }

}

