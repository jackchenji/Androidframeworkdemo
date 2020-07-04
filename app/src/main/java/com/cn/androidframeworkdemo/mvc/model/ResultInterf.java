package com.cn.androidframeworkdemo.mvc.model;

/**
 * author by chenji on 2020-06-27
 */
public   interface ResultInterf {  //数据库操作接口
  void onAddSuccess(Object object);  //数据库增加成功
  void onDeleteSuccess(Object object); //数据库删除成功
  void onQuerySuccess(Object object);  //数据库查询成功
  void onModifySuccess(Object object);  //数据库修改成功
  void onFailure(Object object);       //失败
}
