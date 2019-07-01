package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 * 07-01 23:43:13.862 17297-17297/chapter.android.aweme.ss.com.homework.new I/System.out: onCreate
 * 07-01 23:43:13.862 17297-17297/chapter.android.aweme.ss.com.homework.new I/System.out: onStart
 * 07-01 23:43:17.541 17297-17297/chapter.android.aweme.ss.com.homework.new I/System.out: onPause
 * 07-01 23:43:18.005 17297-17297/chapter.android.aweme.ss.com.homework.new I/System.out: onStop
 * 07-01 23:43:18.005 17297-17297/chapter.android.aweme.ss.com.homework.new I/System.out: onDestory
 */
public class Exercises1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestory");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause");
    }
}
