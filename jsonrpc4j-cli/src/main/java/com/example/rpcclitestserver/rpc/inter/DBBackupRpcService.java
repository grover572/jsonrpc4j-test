package com.example.rpcclitestserver.rpc.inter;

import com.example.rpcclitestserver.entity.CheckLineBackup;
import com.googlecode.jsonrpc4j.JsonRpcMethod;
import com.googlecode.jsonrpc4j.JsonRpcService;

import java.util.HashMap;

@JsonRpcService("jsonrpc")
public interface DBBackupRpcService {

	 @JsonRpcMethod(value = "CheckSftp") // rpc方法名
	 HashMap<String,String> check(CheckLineBackup checkLineBackup);


	/**
	 * 最终json rpc的请求是
	 * POST rpc:client:url + @JsonRpcService().value  = http://localhost:4000/jsonrpc
	 * {
	 *     "method":@JsonRpcMethod().value
	 *     "param":{ @JsonRpcMethod() param }
	 *     "id":"45682321"
	 *     "jsonrpc":"2.0"
	 * }
	 */
}
