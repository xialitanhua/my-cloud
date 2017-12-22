package org.my.cloud.cunsumer.controller;

import com.netflix.discovery.DiscoveryClient;
import org.my.cloud.cunsumer.contract.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/12/20.
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloRemote HelloRemote;
    @Autowired
    org.springframework.cloud.client.discovery.DiscoveryClient discoveryClient;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        discoveryClient.getServices();
        return HelloRemote.index(name);
    }

}
