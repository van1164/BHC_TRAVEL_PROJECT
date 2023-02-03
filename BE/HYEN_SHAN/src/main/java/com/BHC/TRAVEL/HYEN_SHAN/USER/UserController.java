package com.BHC.TRAVEL.HYEN_SHAN.USER;

import com.BHC.TRAVEL.HYEN_SHAN.USER.MODEL.USER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/User")
public class UserController {
    @ResponseBody
    @GetMapping("test")
    public HashMap<String,HashMap> mapping_Test(){
        HashMap<String,HashMap> test = new HashMap<>();
        HashMap<String,String> UserProperty = new HashMap<>();
        UserProperty.put("ID","TEST");
        test.put("USER_property",UserProperty);
        return test;
    }

}
