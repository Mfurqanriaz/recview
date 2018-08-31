package com.aku.isd.recview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgramingViewHolder> {


    private String[] data;

    public ProgrammingAdapter(String[] languages) {
        this.data = languages;
    }


    @NonNull
    @Override
    public ProgramingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,parent, false);
        return new ProgramingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramingViewHolder programingViewHolder, int position) {
        String title = data[position];
        programingViewHolder.txtTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgramingViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView txtTitle;
        public ProgramingViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            txtTitle = itemView.findViewById(R.id.txtTitle);
        }
    }


}
