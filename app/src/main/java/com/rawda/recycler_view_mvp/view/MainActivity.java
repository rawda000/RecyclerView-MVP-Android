package com.rawda.recycler_view_mvp.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rawda.recycler_view_mvp.R;
import com.rawda.recycler_view_mvp.model.MainContract;
import com.rawda.recycler_view_mvp.model.MyModel;
import com.rawda.recycler_view_mvp.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private MainPresenter presenter;
    private List<MyModel> models = new ArrayList<>();
    private RecyclerView recyclerView;
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.main_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MainAdapter(this, models);
        recyclerView.setAdapter(adapter);
        presenter = new MainPresenter(this);
        presenter.initData();
    }

    @Override
    public void addData() {
        adapter.add(new MyModel("Fatma"));
        adapter.add(new MyModel("Diaa"));
        adapter.add(new MyModel("Omar"));
        adapter.notifyDataSetChanged();
    }
}
