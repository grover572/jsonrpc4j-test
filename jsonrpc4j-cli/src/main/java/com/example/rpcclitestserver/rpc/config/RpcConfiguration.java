package com.example.rpcclitestserver.rpc.config;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcClientProxyCreator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
public class RpcConfiguration {

    @Bean
    @ConditionalOnProperty(value={"rpc.client.url","rpc.client.basePackage"})
    public AutoJsonRpcClientProxyCreator rpcClientProxyCreator(@Value("${rpc.client.url}") String url,@Value("${rpc.client.basePackage}") String basePackage){
    	AutoJsonRpcClientProxyCreator clientProxyCreator = new AutoJsonRpcClientProxyCreator();
        // 此处可以设置公共请求头
        try{
            clientProxyCreator.setBaseUrl(new URL(url));
        }catch (Exception e){
        }
        clientProxyCreator.setScanPackage(basePackage);
        return clientProxyCreator;
    }
}
