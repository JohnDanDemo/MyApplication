package com.whd.dan.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * @ClassName: SecondActivity
 * @Description: 类描述
 * @Author: JohnDwang
 * @E-mail: whd_tech_vip@163.com
 * @Blog: https://blog.csdn.net/WHD472099458
 * @CreateDate: 2018/11/17 21:11
 * @UpdateUser: update user
 * @UpdateDate: 2018/11/17 21:11
 * @UpdateDescription: 更新说明
 * @Version: 1.0.0
 */
public class SecondActivity extends AppCompatActivity {
    private Button btnTest;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btn=new Button(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
