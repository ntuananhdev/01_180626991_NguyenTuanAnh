package com.example.a01_180626991_nguyentuananh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    Context context;
    private int layout;
    private ArrayList<Poular> listPoular;

    public ListAdapter(Context context, int layout, ArrayList<Poular> listPoular) {
        this.context = context;
        this.layout = layout;
        this.listPoular = listPoular;
    }

    @Override
    public int getCount() {
        return listPoular.size();
    }

    @Override
    public Object getItem(int position) {
        return listPoular.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(layout,null);

        ImageView imagesPoular = convertView.findViewById(R.id.imgPoularC);
        TextView tvName = convertView.findViewById(R.id.tvNameC);
        TextView tvPrice = convertView.findViewById(R.id.tvPriceC);

        Poular poular = listPoular.get(position);
        imagesPoular.setImageResource(poular.getImagesPoular());
        tvName.setText(poular.getNamePoular());
        tvPrice.setText(poular.getPricePoular());

        return convertView;
    }
}
