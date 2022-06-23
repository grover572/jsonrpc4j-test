package com.example.rpcclitestserver;

import com.alibaba.fastjson.JSON;
import com.example.rpcclitestserver.entity.CheckLineBackup;
import com.example.rpcclitestserver.rpc.inter.DBBackupRpcService;
import com.example.rpcclitestserver.utils.ApplicationUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.util.HashMap;

@SpringBootApplication
public class RpcCliTestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpcCliTestServerApplication.class, args);
	}

	@Bean
	@Order(Ordered.HIGHEST_PRECEDENCE)
	public CommandLineRunner runner(){
		return ags->{

		};
	}

}
