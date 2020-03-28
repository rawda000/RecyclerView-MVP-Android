package com.rawda.recycler_view_mvp.presenter;

import com.rawda.recycler_view_mvp.model.MainContract;
import com.rawda.recycler_view_mvp.model.MyModel;

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View view;

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void initData() {
        view.addData();
    }
}
