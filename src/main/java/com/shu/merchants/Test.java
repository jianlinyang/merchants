package com.shu.merchants;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang
 * @date 2019/6/10 11:16
 */
@RestController
public class Test {
    @GetMapping("index")
    public String say(){
        return "hello";
    }
}
