package com.cn.androidframeworkdemo.mvc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.cn.androidframeworkdemo.R;
import com.cn.androidframeworkdemo.databinding.ActivityMainBinding;
import com.cn.androidframeworkdemo.databinding.ActivityMvcBinding;
import com.cn.androidframeworkdemo.mvc.bean.Person;
import com.cn.androidframeworkdemo.mvc.model.ResultInterf;
import com.cn.androidframeworkdemo.mvc.model.YeWuModel;
import com.cn.androidframeworkdemo.mvc.model.YewuModelImpl;

public class MvcActivity extends AppCompatActivity implements ResultInterf {
private Person person;
private YewuModelImpl yewuModel;
private  String TAG="MvcActivityTag";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMvcBinding  activityMvcBinding=DataBindingUtil.setContentView(this,R.layout.activity_mvc);
        activityMvcBinding.setMvcEventBus(new MvcEventBus());//
        person=new Person("陈骥","1.68","29");
        yewuModel=new YewuModelImpl();
    }

    public class MvcEventBus{
        public  void onClick(View view){
            switch ((String)view.getTag()){
                case "add":
                    yewuModel.add(person, (ResultInterf) this);
                    break;
                case "delete":
                    yewuModel.delete(person, (ResultInterf) this);
                    break;
                case "update":
                    yewuModel.update(person, (ResultInterf) this);
                    break;
                case "edit_query":
                    yewuModel.query(person, (ResultInterf) this);
                    break;
            }
        }

    }

    @Override
    public void onSuccess(Object object) {
       Log.i(TAG, (String) object);
    }

    @Override
    public void onFailure(Object object) {
    }

}