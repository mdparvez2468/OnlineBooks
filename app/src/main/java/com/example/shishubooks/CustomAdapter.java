package com.example.shishubooks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] bookspic;
    String[] booksname;
    private LayoutInflater inflater;

    public CustomAdapter(Context context,String[] booksname,int[] bookspic){
        this.booksname = booksname;
        this.bookspic = bookspic;
        this.context = context;
    }

    @Override
    public int getCount() {
        return booksname.length;
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
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           convertView = inflater.inflate(R.layout.classonebooks_layout,parent,false);
        }
       ImageView imageView = convertView.findViewById(R.id.classonebook);
        TextView textView = convertView.findViewById(R.id.classoneboookname);
        imageView.setImageResource(bookspic[position]);
        textView.setText(booksname[position]);
        return convertView;
    }
}
