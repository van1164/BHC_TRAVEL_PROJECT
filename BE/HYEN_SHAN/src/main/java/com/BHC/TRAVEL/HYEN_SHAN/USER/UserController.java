package com.BHC.TRAVEL.HYEN_SHAN.USER;

import com.BHC.TRAVEL.HYEN_SHAN.USER.MODEL.USER;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    MongoTemplate mongoTemplate;
    ObjectMapper objectMapper = new ObjectMapper();
    @ResponseBody
    @GetMapping("test")
    public HashMap<String,HashMap> mapping_Test(){
        HashMap<String,HashMap> test = new HashMap<>();
        HashMap<String,String> UserProperty = new HashMap<>();
        USER user = USER.builder().ID("van133").password("ttink1245!").nickname("샨").build();
        mongoTemplate.insert(user);
        UserProperty.put("sdf","sdf");
        System.out.println("TEST");
        test.put("Sdfsdf",UserProperty);
        return test;
    }

}


