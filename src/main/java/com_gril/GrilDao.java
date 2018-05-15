package com_gril;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Long on 2018/5/15.
 */
public interface GrilDao extends JpaRepository<gril,Integer>{

    //通过年龄查询
    public List<gril> findByAge(Integer age);

}
