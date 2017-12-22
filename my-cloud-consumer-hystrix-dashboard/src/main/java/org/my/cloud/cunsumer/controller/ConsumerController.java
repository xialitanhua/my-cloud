package org.my.cloud.cunsumer.controller;

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

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return HelloRemote.index(name);
    }

}
