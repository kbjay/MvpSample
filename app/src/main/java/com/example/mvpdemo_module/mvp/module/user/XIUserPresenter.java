package com.example.mvpdemo_module.mvp.module.user;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;

import com.example.mvpdemo_module.mvp.base.XIBasePresenter;
import com.example.mvpdemo_module.mvp.model.XIUserModel;
import com.example.mvpdemo_module.mvp.module.user.base.IXIUserModuleView;

/**
 * 参考book module的presenter
 */
public class XIUserPresenter extends XIBasePresenter<IXIUserModuleView, XIUserModel> {
    public XIUserPresenter(IXIUserModuleView view, XIUserModel model) {
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
}
