package com.example.assemblerframework.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/*
*
*
*
* */
@Component
public class DataFromGDS {
    private Map<String, String> map=new HashMap<>();
    public Map<String,String> queryfromGDS(){
        //TODO: get data from gds
        map.put("dep1","dep1");
        return map;
    }
}
