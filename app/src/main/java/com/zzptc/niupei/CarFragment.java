package com.zzptc.niupei;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hb.views.PinnedSectionListView;

/**
 * Created by Administrator on 2016/6/14.
 */
public class CarFragment extends Fragment {
    View view;
    PinnedSectionListView listView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.car_fragment, null);
        listView = (PinnedSectionListView)view.findViewById(R.id.list);
        listView.setAdapter(new MyPinnedSectionListAdapter());

        return view;
    }

    class MyPinnedSectionListAdapter extends BaseAdapter
            implements PinnedSectionListView.PinnedSectionListAdapter {

        @Override
        public int getCount() {
            return 60;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        public int getItemViewType(int position) {
            return position % 10 == 0 ? 1 : 0;
        }

        public int getViewTypeCount() {
            return 2;
        }

        public class ViewHolder{
            TextView textLabel;
            ImageView imageView;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
//            ViewHolder viewHolder = null;
//            if (convertView == null){
//
//            }else{
//
//            }
            View view = null;
            LayoutInflater inflater = getActivity().getLayoutInflater();
            if (getItemViewType(position) == 0){
                // cell
                view = inflater.inflate(R.layout.car_listview_cell, null);
//                TextView textView = (TextView)view.findViewById(R.id.textlabel);

            }else{
                // header
                view = inflater.inflate(R.layout.car_listview_header, null);
                TextView textView = (TextView)view.findViewById(R.id.textlabel);
                char ch = (char) (position % 26 + 65);
                textView.setText("" + ch);
            }
            return view;
        }

        // We implement this method to return 'true' for all view types we want to pin
        @Override
        public boolean isItemViewTypePinned(int viewType) {
            return viewType == 1;
        }
    }
}
