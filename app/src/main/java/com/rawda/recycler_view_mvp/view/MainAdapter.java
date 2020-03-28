package com.rawda.recycler_view_mvp.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rawda.recycler_view_mvp.R;
import com.rawda.recycler_view_mvp.model.MyModel;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyHolder> {
    private Context mContext;
    private List<MyModel> models;

    public MainAdapter(Context mContext, List<MyModel> models) {
        this.mContext = mContext;
        this.models = models;
    }

    @NonNull
    @Override
    public MainAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MainAdapter.MyHolder(LayoutInflater.from(mContext).inflate(R.layout.row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.MyHolder holder, int position) {
        MyModel model = models.get(position);
        holder.textView.setText(model.getMyStr());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
    public void add(MyModel model){
        models.add(model);
    }
    public class MyHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}
