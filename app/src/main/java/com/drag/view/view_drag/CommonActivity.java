package com.drag.view.view_drag;

import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

public class CommonActivity extends FragmentActivity {

      private FrameLayout mframe;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        mframe=findViewById(R.id.my_frame);

        TryFragment tryFragment= new TryFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.my_frame, tryFragment, "tag").commitAllowingStateLoss();
        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mframe.bringToFront();
            }
        },1000);

    }


    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }
    @Override
    public void onBackPressed(){
        finish();
    }

}