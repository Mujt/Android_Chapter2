package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.LinkedList;

import chapter.android.aweme.ss.com.homework.model.Message;
import chapter.android.aweme.ss.com.homework.widget.CircleImageView;

public class ImAdapter extends BaseAdapter {
    private LinkedList<Message> mData;
    private Context mContext;
    public ImAdapter(LinkedList<Message> mData,Context mContext){
        this.mData = mData;
        this.mContext= mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.message_single,viewGroup,false);
        CircleImageView circleImageView = (CircleImageView) view.findViewById(R.id.circle_view);
        ImageView robot_notice = (ImageView) view.findViewById(R.id.robot_notice);
        TextView tv_title = (TextView) view.findViewById(R.id.tv_title);
        TextView tv_description = (TextView) view.findViewById(R.id.tv_description);
        TextView tv_time = (TextView) view.findViewById(R.id.tv_time);
        //circleImageView.setImageResource(new Icon(mData.get(i).getIcon()));
        if (mData.get(i).getIcon().equals("TYPE_GAME")) {
            circleImageView.setImageResource(R.drawable.icon_micro_game_comment);
        } else if (mData.get(i).getIcon().equals("TYPE_ROBOT")) {
            circleImageView.setImageResource(R.drawable.session_robot);
        } else if (mData.get(i).getIcon().equals("TYPE_SYSTEM")) {
            circleImageView.setImageResource(R.drawable.session_system_notice);
        } else if (mData.get(i).getIcon().equals("TYPE_STRANGER")) {
            circleImageView.setImageResource(R.drawable.session_stranger);
        }
        if (mData.get(i).isOfficial()) {
            robot_notice.setImageResource(R.drawable.im_icon_notice_official);
            //robot_notice.setVisibility();
        }
        tv_title.setText(mData.get(i).getTitle());
        tv_description.setText(mData.get(i).getDescription());
        tv_time.setText(mData.get(i).getTime());
        return view;
    }
}
