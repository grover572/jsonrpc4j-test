package com.status.rpc.rpc.service.impl;

import com.googlecode.jsonrpc4j.JsonRpcMethod;
import com.googlecode.jsonrpc4j.JsonRpcService;
import com.status.rpc.entity.CheckLineBackup;

import java.util.HashMap;

@JsonRpcService("jsonrpc")
public interface BookRpcService {
	 @JsonRpcMethod(value = "CheckSftp")
	 HashMap<String,String> check(CheckLineBackup checkLineBackup);
}
