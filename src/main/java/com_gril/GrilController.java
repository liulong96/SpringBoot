package com_gril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Long on 2018/5/15.
 */
@RestController
public class GrilController {

    @Autowired
    private GrilDao grilDao;

    //查寻列表所有
    @GetMapping(value = "/getList")
    public List<gril> grilList() {
        return grilDao.findAll();
    }

    //添加一个
    @PostMapping(value = "/grils")
    public gril grilAdd(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age) {
        gril g = new gril();
        g.setAge(age);
        g.setCupSize(cupSize);
        return grilDao.save(g);
    }
}
