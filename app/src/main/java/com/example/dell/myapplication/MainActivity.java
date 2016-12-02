package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dell.myapplication.view.MyRelativeLayoutyoutyout;

public class MainActivity extends AppCompatActivity {

    private TextView mTv;
    private MyRelativeLayoutyoutyout mRl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv=(TextView)findViewById(R.id.textView);
        mRl= (MyRelativeLayoutyoutyout) findViewById(R.id.rl_main);

    }

    private void setRv(){
       mRl.setListner(new MyRelativeLayoutyoutyout.Listner() {
           @Override
           public void onTonchEvent(MotionEvent event) {
               Log.d("TAG", "onTonchEvent: ");
           }
       });

        mTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "onClick: ");
            }
        });
    }

}
