package com.example.fitnetic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import java.util.List;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private List<ListData>listData;


    public MyAdapter(List<ListData> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_data,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListData ld=listData.get(position);
        holder.txtname.setText(ld.getName());
        holder.txtmovie.setText(ld.getDescription());
        String images=(ld.getImage());
        Picasso.get().load(images).into(holder.txtimage);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtname,txtmovie;
        private ImageView txtimage;
        public ViewHolder(View itemView) {
            super(itemView);
            txtname=(TextView)itemView.findViewById(R.id.nametxt);
            txtmovie=(TextView)itemView.findViewById(R.id.movietxt);
            txtimage=(ImageView) itemView.findViewById(R.id.txtimages);
        }
    }
}