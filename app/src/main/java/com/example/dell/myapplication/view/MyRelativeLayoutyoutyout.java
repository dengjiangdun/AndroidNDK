package com.example.dell.myapplication.view;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by DELL on 2016/10/28.
 */

 public  class MyRelativeLayoutyoutyout extends RelativeLayout {
    public MyRelativeLayoutyoutyout(Context context) {
        super(context);
    }
    private  Listner mListner;
    public  void setListner(Listner listner){
        mListner=listner;
    }


    @Override

    public boolean dispatchTouchEvent(MotionEvent ev) {
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mListner.onTonchEvent(event);
        return super.onTouchEvent(event);

    }


    public  interface  Listner{
       public void onTonchEvent(MotionEvent event);
    }

}
