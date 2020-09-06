package com.chrome.my;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Random;

public class Language extends RecyclerView.Adapter<Language.MyViewHolder> {
    List languageList;
    public Language(List languageList) {
        this.languageList=languageList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int i) {
        languageNameList data= (languageNameList) languageList.get(i);
        holder.name1.setText(data.name1);
        holder.name2.setText(data.name2);
    }



    @Override
    public int getItemCount() {
        return languageList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name1,name2;
        LinearLayout parent;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            name1=itemView.findViewById(R.id.name1);
            name2=itemView.findViewById(R.id.name2);
        }
    }
}
