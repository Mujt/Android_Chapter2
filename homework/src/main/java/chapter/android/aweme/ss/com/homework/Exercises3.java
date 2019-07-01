package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

import chapter.android.aweme.ss.com.homework.model.Message;
import chapter.android.aweme.ss.com.homework.model.PullParser;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity {
    private ListView noticeList;
    private Context mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        noticeList = (ListView) findViewById(R.id.noticelist);
        List<Message> temp = null;
        mContext = Exercises3.this;
        try {
            temp = PullParser.getMessage(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LinkedList<Message> mData = new LinkedList();
        for (int i = 0;i < temp.size();i++) {
            mData.addLast(temp.get(i));
        }
        ImAdapter imAdapter = new ImAdapter(mData,mContext);
        noticeList.setAdapter(imAdapter);
        registerForContextMenu(noticeList);
    }

}
