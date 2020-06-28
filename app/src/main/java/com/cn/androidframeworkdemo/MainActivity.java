package com.cn.androidframeworkdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.cn.androidframeworkdemo.databinding.ActivityMainBinding;
import com.cn.androidframeworkdemo.mvc.MvcActivity;

public class MainActivity extends AppCompatActivity {
public  String TAG="MainActivityTag";
public  Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainBinding.setEventable(new Eventable());
        mainBinding.setEvnetBus(this);
        Log.i(TAG,"test");

    }

  //
    public void onclick(View view) {
        Log.i(TAG,"跳转"+view.getTag()+"页面");
    }

    public class Eventable{
        public void onClick(View view) {
            //处理的点击事件
            Log.i(TAG,"跳转"+view.getTag()+"页面");
            intent=new Intent(MainActivity.this,MvcActivity.class);
            startActivity(intent);
        }
    }





}