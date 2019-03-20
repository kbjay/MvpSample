package com.microsoft.demo.mvpcode.basemvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * mvp fragment
 *
 * @param <P> mvp presenter
 */
public abstract class XIBaseMvpFragment<P extends XIBaseMvpPresenter> extends Fragment implements IXIBaseMvpView {
    public P mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (mPresenter == null) {
            mPresenter = createPresenter();
        }
        if (mPresenter == null) {
            throw new NullPointerException("presenter can not be null");
        }

        mPresenter.bindView(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.unBindView();
        }
    }

    protected abstract P createPresenter();
}
