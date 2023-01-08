package com.example.proyekakhir;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBurgerAdapter extends RecyclerView.Adapter<ListBurgerAdapter.ListViewHolder>{
    private ArrayList<Burger> listBurger;

    private OnItemClickCallback onItemCliclCallback;

    public void setOnItemCliclCallback(OnItemClickCallback onItemClickCallback){
        this.onItemCliclCallback = onItemClickCallback;
    }



    public ListBurgerAdapter(ArrayList<Burger> list) {
        this.listBurger = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_burger, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Burger burger = listBurger.get(position);
        Glide.with(holder.itemView.getContext())
                .load(burger.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(burger.getName());
        holder.tvDetail.setText(burger.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemCliclCallback.onItemClicked(listBurger.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBurger.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_burger);
            tvName= itemview.findViewById(R.id.tv_item_name);
            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Burger data);
    }
}
