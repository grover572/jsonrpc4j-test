package com.example.rpcclitestserver;

import com.alibaba.fastjson.JSON;
import com.example.rpcclitestserver.entity.CheckLineBackup;
import com.example.rpcclitestserver.rpc.inter.DBBackupRpcService;
import com.example.rpcclitestserver.utils.ApplicationUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class RpcCliTestServerApplicationTests {

	@Test
	void request() {

		DBBackupRpcService dbBackupRpcService = ApplicationUtils.getBean(DBBackupRpcService.class);
		CheckLineBackup lineBackup = new CheckLineBackup();
		lineBackup.setStorePath("/");
		lineBackup.setAccount("root");
		lineBackup.setPassword("asdsdfw");
		lineBackup.setStoreServerAddr("sdagre");
		HashMap<String,String> check = dbBackupRpcService.check(lineBackup);
		System.out.println(JSON.toJSONString(check));

	}

}
