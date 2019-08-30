package com.example.foodadmin.Fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodadmin.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PastOrderAdapter extends RecyclerView.Adapter<PastOrderAdapter.VpAdapter> {
    List<ModelRecyclerNewOreder> list;

    public PastOrderAdapter(List<ModelRecyclerNewOreder> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public VpAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_past_order,parent,false);
        return new VpAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VpAdapter holder, int position) {
        holder.txtoncustomername.setText(String.valueOf(list.get(position).getName()));

        holder.oncustomerdp.setImageResource(list.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class VpAdapter extends RecyclerView.ViewHolder {
        TextView txtoncustomername;
        CircleImageView oncustomerdp;
        public VpAdapter(@NonNull View itemView) {
            super(itemView);

            txtoncustomername=itemView.findViewById(R.id.txtoncustomername);
            oncustomerdp=itemView.findViewById(R.id.oncustomerdp);
        }
    }
}
