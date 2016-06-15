package com.zzptc.niupei;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/**
 * Created by Administrator on 2016/6/14.
 */
public class LoginFragment extends Fragment {
    private FragmentManager fragmentManager;
    View view;
    ViewGroup decor;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.login_fragment,null);
        decor = (ViewGroup)getActivity().getWindow().getDecorView();
        decor.addView(view);

        FrameLayout mask = (FrameLayout)view.findViewById(R.id.maskview);
        mask.setClickable(true);
        mask.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                dismiss();
                return true;
            }
        });

        ImageButton imgbtn = (ImageButton)view.findViewById(R.id.exitbtn);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void show(FragmentManager manager){
        fragmentManager = manager;
        FragmentTransaction ft = manager.beginTransaction();
        ft.add(this, "login");
        ft.commit();
    }

    public void dismiss(){
        decor.removeView(view);
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.remove(this);
        ft.commit();
    }
}
