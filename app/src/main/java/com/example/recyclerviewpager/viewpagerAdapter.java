package com.example.recyclerviewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class viewpagerAdapter extends RecyclerView.Adapter<viewHolder> {
    List <itemDataModel> dataList = new ArrayList<>();
    Context ctxt;

    public viewpagerAdapter(List<itemDataModel> dataList, Context ctx) {
        this.dataList = dataList;
        ctxt=ctx;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_viewpager,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.textView.setText(dataList.get(position).dataText);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


}

class viewHolder extends RecyclerView.ViewHolder{
    TextView textView;
    public viewHolder(View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.viewPagerTextview);
    }
}
