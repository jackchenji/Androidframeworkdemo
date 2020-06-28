package com.cn.androidframeworkdemo.mvc.model;

import android.util.Log;

import com.cn.androidframeworkdemo.mvc.bean.Person;

/**
 * author by chenji on 2020-06-27
 * 逻辑业务处理类
 */
 public class YewuModelImpl implements YeWuModel {


    @Override
    public void add(Person person, ResultInterf resultInterf) {
       Log.i("test", "test");
  //   resultInterf.onSuccess("测试成功");
    }

    @Override
    public void delete(Person person, ResultInterf resultInterf) {

    }

    @Override
    public void update(Person person, ResultInterf resultInterf) {

    }

    @Override
    public void query(Person person, ResultInterf resultInterf) {

    }
}
