package com.example.foodadmin.Fragments;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodadmin.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class NewOrderAdapter extends RecyclerView.Adapter<NewOrderAdapter.Adapte> {
    List<ModelRecyclerNewOreder> list;

    public NewOrderAdapter(List<ModelRecyclerNewOreder> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Adapte onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_new_order,parent,false);

       return new Adapte(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapte holder, int position) {

        holder.txtcustomername.setText(String.valueOf(list.get(position).getName()));

        holder.customerdp.setImageResource(list.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Adapte extends RecyclerView.ViewHolder {

        TextView txtcustomername;
        CircleImageView customerdp;

        public Adapte(@NonNull View itemView) {
            super(itemView);

            txtcustomername=itemView.findViewById(R.id.txtcustomername);
            customerdp=itemView.findViewById(R.id.customerdp);
        }
    }
}
