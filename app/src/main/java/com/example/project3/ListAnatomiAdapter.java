package com.example.project3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.project3.Anatomi;
import com.example.project3.R;

import java.util.ArrayList;

public class ListAnatomiAdapter  extends RecyclerView.Adapter<ListAnatomiAdapter.ListViewHolder> {
    private ArrayList<Anatomi> listHero;
    public ListAnatomiAdapter(ArrayList<Anatomi> list) {
        this.listHero = list;
    }

    public ListAnatomiAdapter() {

    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)  {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sistem_anatomi_tubuh, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Anatomi anatomi = listHero.get(position);
        Glide.with(holder.itemView.getContext())
                .load(anatomi.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(anatomi.getName());
        holder.tvDetail.setText(anatomi.getDetail());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }



}



