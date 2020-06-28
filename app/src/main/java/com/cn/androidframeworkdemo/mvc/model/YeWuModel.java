package com.cn.androidframeworkdemo.mvc.model;

import com.cn.androidframeworkdemo.mvc.bean.Person;

/**
 * author by chenji on 2020-06-27
 */
 public interface YeWuModel {
  void add(Person person,ResultInterf resultInterf);
  void delete(Person person,ResultInterf resultInterf);
  void update(Person person,ResultInterf resultInterf);
  void query(Person person,ResultInterf resultInterf);
 }
