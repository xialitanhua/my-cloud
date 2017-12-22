package org.my.cloud.cunsumer.contract;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/12/20.
 */
@FeignClient(name = "my-cloud-producer") /*name:远程服务名，及spring.application.name配置的名称*/
public interface HelloRemote {

    /**
     * 此方法和远程服务中controller中的方法名和参数必须保持一致
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello")
    public String index(@RequestParam(value = "name") String name);
}
