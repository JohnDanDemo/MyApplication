package com.whd.dan.myapplication

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import com.wonium.extension.utils.StringUtil

import kotlinx.android.synthetic.main.activity_main.*
/**
 * @ClassName:
 * @Description: 类描述
 * @Author: JohnDwang
 * @E-mail: whd_tech_vip@163.com
 * @Blog: https://blog.csdn.net/WHD472099458
 * @CreateDate: 2018/11/17 20:43
 * @UpdateUser: update user
 * @UpdateDate: 2018/11/17 20:43
 * @UpdateDescription: 更新说明
 * @Version: 1.0.0
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        StringUtil.INSTANCE.formatInt(1)
        StringUtil.INSTANCE.isEmpty("whd")
        StringUtil.INSTANCE.isEmpty("HHHH")
        StringUtil.INSTANCE.isEmpty("HHHH")
        StringUtil.INSTANCE.isEmpty("HHHH")
        StringUtil.INSTANCE.isEmpty("whd")
        StringUtil.INSTANCE.isEmpty("whd")
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
