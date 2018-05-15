package com_gril;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Long on 2018/5/15.
 */
@Component //注入配置 注解
@ConfigurationProperties(prefix = "girl")//配置文件的信息匹配到实体  前缀
public class grilProperties {

    private String cupSize;
    private Integer age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
