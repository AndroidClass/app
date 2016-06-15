package com.zzptc.niupei;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2016/6/6.
 */
public class MainFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, null);
        String json = "{\"name\":\"hh\",\"passwd\":\"123\",\"token\":\"fjkdsfjkdsa\"}";
//        Gson gson = new Gson();
//        user my = gson.fromJson(json, user.class);
//        Log.e("json","passwd:" + my.getPasswd());
//        Log.e("json",gson.toJson(my));

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    URL url = new URL("http://hh2.io");
//                    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
//                    InputStream inputStream = connection.getInputStream();
//                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//                    StringBuilder builder = new StringBuilder();
//                    String line;
//                    while((line = reader.readLine()) != null){
//                        builder.append(line + "\n");
//                    }
//                    Gson gson = new Gson();
//                    user my = gson.fromJson(builder.toString(), user.class);
//                    Log.e("hh2.io", "name:" + my.getName() + ", token:" + my.getToken());
//                } catch (MalformedURLException e) {
//                    e.printStackTrace();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();


        return view;
//        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
