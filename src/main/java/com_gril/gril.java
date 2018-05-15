package com_gril;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Long on 2018/5/15.
 */
@Entity
public class gril {

    @Id
    @GeneratedValue
    private Integer id;
    private String cupSize;
    private Integer age;

    public gril() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getAge() {
        return age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
