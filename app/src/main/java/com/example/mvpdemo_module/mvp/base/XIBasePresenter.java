package com.example.mvpdemo_module.mvp.base;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;

/**
 * mvp presenter
 *
 * @param <V> mvp view
 * @param <M> mvp model
 */
public abstract class XIBasePresenter<V extends IXIBaseView, M extends IXIBaseModel> implements LifecycleObserver {

    private V mMvpView;
    private M mModel;

    public XIBasePresenter(V view, M model) {
        mMvpView = view;
        mModel = model;
    }

    protected void unBindView() {
        mMvpView = null;
    }

    protected V getMvpView() {
        return mMvpView;
    }

    protected M getModel() {
        return mModel;
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    protected abstract void onCreate(LifecycleOwner owner);
    /**
     * 释放资源，处理内存泄漏问题
     * @param owner
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    protected abstract void onDestroy(LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    protected abstract void onLifecycleChanged(LifecycleOwner owner, Lifecycle.Event event);
}
