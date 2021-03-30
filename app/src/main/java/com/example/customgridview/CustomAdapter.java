package com.example.customgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] arr_img;
    String[] arr_name;
    LayoutInflater inflter;
    public CustomAdapter(Context applicationContext, int[] arr_img, String[] arr_name) {
        this.arr_img = arr_img;
        this.context = applicationContext;
        this.arr_name = arr_name;
        inflter= (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return arr_img.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflter.inflate(R.layout.gridview_layout,null);
        ImageView imageView = convertView.findViewById(R.id.imgres);
        TextView textView = convertView.findViewById(R.id.restext);
        imageView.setImageResource(arr_img[position]);
        textView.setText(arr_name[position]);
        return convertView;
    }
}
