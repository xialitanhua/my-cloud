package org.my.cloud.cunsumer.contract;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/12/20.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String index(@RequestParam(value = "name") String name) {
        return "dashboard：hello" + name + ", this message send failed ";
    }
}
