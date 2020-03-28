package com.rawda.recycler_view_mvp.model;

import java.util.List;

public class MainContract {
    public interface Model {

    }

    public interface View {
        void addData();
    }

    public interface Presenter {
        void initData();
    }
}
