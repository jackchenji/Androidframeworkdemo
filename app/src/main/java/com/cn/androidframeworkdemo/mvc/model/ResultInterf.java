package com.cn.androidframeworkdemo.mvc.model;

/**
 * author by chenji on 2020-06-27
 */
public   interface ResultInterf {  //数据库操作接口
  void onSuccess(Object object);
  void onFailure(Object object);
}
