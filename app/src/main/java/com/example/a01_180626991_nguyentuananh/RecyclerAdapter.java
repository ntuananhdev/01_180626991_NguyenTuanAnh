package com.example.a01_180626991_nguyentuananh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.PoularViewHolder> {
    private ArrayList<Poular> listPoular;
    private onClickListener listener;

    public RecyclerAdapter(ArrayList<Poular> listPoular) {
        this.listPoular = listPoular;
    }

    public interface onClickListener{
        void onItemClick(int position);
    }
    public void setOnItemClick(onClickListener mListener){
        this.listener = mListener;
    }


    @NonNull
    @Override
    public PoularViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        PoularViewHolder pvh = new PoularViewHolder(v,listener);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull PoularViewHolder holder, int position) {
        Poular poular = listPoular.get(position);

        holder.imagesPoular.setImageResource(poular.getImagesPoular());
        holder.tvNamePoular.setText(poular.getNamePoular());
        holder.tvPricePoular.setText(poular.getPricePoular());

    }

    @Override
    public int getItemCount() {
        return listPoular.size();
    }

    public class PoularViewHolder extends RecyclerView.ViewHolder{
        private ImageView imagesPoular;
        private TextView tvPricePoular;
        private TextView tvNamePoular;

        public PoularViewHolder(@NonNull View itemView, onClickListener listener) {
            super(itemView);

            imagesPoular = itemView.findViewById(R.id.imgPoularA);
            tvNamePoular = itemView.findViewById(R.id.tvNameA);
            tvPricePoular = itemView.findViewById(R.id.tvPriceA);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
