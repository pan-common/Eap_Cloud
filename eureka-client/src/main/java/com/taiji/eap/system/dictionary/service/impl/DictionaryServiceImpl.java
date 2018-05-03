package com.taiji.eap.system.dictionary.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.taiji.eap.system.dictionary.service.DictionaryService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author 潘宏智
 * @date
 */
@Service
public class DictionaryServiceImpl implements DictionaryService{

    @Value("${server.port}")
    private String port;

    @HystrixCommand(fallbackMethod = "hiError")
    @Override
    public String hiService(String name) {
        return "hi "+name+",i am from port:" +port;
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
