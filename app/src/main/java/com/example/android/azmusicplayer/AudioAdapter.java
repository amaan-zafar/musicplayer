package com.example.android.azmusicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.android.azmusicplayer.model.Audio;

import java.util.Collections;
import java.util.List;

public class AudioAdapter extends RecyclerView.Adapter<ViewHolder> {

    List<Audio> list;
    Context mContext;

    public AudioAdapter(List<Audio> list, Context context) {
        this.list = list;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.title.setText(list.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        //returns the number of elements the RecyclerView will display
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}

class ViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    ImageView play_pause;

    ViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
        play_pause = itemView.findViewById(R.id.play_pause);
    }
}