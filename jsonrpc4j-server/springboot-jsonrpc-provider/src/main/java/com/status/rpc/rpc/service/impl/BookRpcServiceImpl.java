package com.status.rpc.rpc.service.impl;

import com.status.rpc.entity.CheckLineBackup;
import org.springframework.stereotype.Service;
import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@AutoJsonRpcServiceImpl
@Service
@Slf4j
public class BookRpcServiceImpl implements BookRpcService{

    @Override
    public HashMap<String,String> check(CheckLineBackup checkLineBackup) {
        log.info(checkLineBackup.toString());
        HashMap<String, String> map = new HashMap<>();
        map.put("data","hello json-rpc 😀");
        return map;
    }

}
