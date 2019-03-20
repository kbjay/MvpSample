package com.microsoft.demo.mvpcode.basemvp;

/**
 * mvp presenter
 *
 * @param <V> mvp view
 * @param <M> mvp model
 */
public abstract class XIBaseMvpPresenter<V extends IXIBaseMvpView, M extends IXIBaseMvpModel> {

    private V mMvpView;
    private M mModel;

    public XIBaseMvpPresenter(V view, M model) {
        mMvpView = view;
        mModel = model;
    }

    public void bindView(V view) {
        this.mMvpView = view;
    }

    public void unBindView() {
        mMvpView = null;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public M getModel() {
        return mModel;
    }
}
