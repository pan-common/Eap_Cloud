package com.taiji.eap.fallback;

import com.taiji.eap.feign.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author 潘宏智
 * @date
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "对不起"+name;
    }
}
