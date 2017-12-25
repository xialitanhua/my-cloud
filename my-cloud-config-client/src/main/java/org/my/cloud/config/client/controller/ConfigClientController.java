package org.my.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaoxiao on 2017/12/25.
 */

@RestController
public class ConfigClientController {

    @Value("${profile}")
    private String profile;

    @RequestMapping("/config/client")
    public String getClientConfigActivity(){
        return profile;
    }
}
