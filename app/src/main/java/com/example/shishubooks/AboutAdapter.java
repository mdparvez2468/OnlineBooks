package com.example.shishubooks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutAdapter extends BaseAdapter {
    int[] imgs;
    String[] names;
    String[] IDs;
    String[] section;
    String[] dpt;
    Context context;
    private LayoutInflater layoutInflater;

    public AboutAdapter(Context context,String[] names,String[] IDs,String[] section,String[] dpt,int[] imgs){
        this.context = context;
        this.names = names;
        this.IDs = IDs;
        this.section = section;
        this.dpt = dpt;
        this.imgs = imgs;
    }
    @Override
    public int getCount() {

        return names.length;
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
        if (convertView==null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.singleperson,parent,false);
        }
        TextView names = convertView.findViewById(R.id.dname);
        TextView ids = convertView.findViewById(R.id.did);
        TextView section = convertView.findViewById(R.id.dsec);
        TextView dept = convertView.findViewById(R.id.ddpt);
        ImageView img = convertView.findViewById(R.id.dimg);


        names.setText(this.names[position]);
        ids.setText(this.IDs[position]);
        section.setText(this.section[position]);
        dept.setText(this.dpt[position]);
        img.setImageResource(this.imgs[position]);
        return convertView;
    }
}
