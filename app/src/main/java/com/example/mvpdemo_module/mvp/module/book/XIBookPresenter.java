package com.example.mvpdemo_module.mvp.module.book;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.util.Log;

import com.example.mvpdemo_module.mvp.base.XIBasePresenter;
import com.example.mvpdemo_module.entity.XIBookEntity;
import com.example.mvpdemo_module.mvp.model.XIBookModel;
import com.example.mvpdemo_module.mvp.module.book.base.IXIBookModuleView;

public class XIBookPresenter extends XIBasePresenter<IXIBookModuleView, XIBookModel> {

    public XIBookPresenter(IXIBookModuleView view, XIBookModel model) {
        super(view, model);
    }

    @Override
    protected void onCreate(LifecycleOwner owner) {
    }

    @Override
    protected void onDestroy(LifecycleOwner owner) {

    }

    @Override
    protected void onLifecycleChanged(LifecycleOwner owner, Lifecycle.Event event) {
    }

    public void getUser() {
        XIBookEntity book = getModel().getBook();
        getMvpView().onGetBookSuccess(book);
    }


}
