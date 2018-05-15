package com_gril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Long on 2018/5/15.
 */
@RestController //@RestController注解是它继承自@Controller注解,自带requestBody注解
public class HelloControl {

    @Autowired
    private grilProperties grilProperties;

    //@RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    @GetMapping("/hello/{id}")
    public String say(@PathVariable("id")Integer id) {
        return "id:"+id;
       // return grilProperties.getCupSize()+grilProperties.getAge();
    }
}
