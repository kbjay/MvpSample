package com.example.mvpdemo_module.mvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * mvp fragment
 *
 * @param <P> mvp presenter
 */
public abstract class XIBaseFragment<P extends XIBasePresenter> extends Fragment implements IXIBaseView {
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
        getLifecycle().addObserver(mPresenter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            getLifecycle().removeObserver(mPresenter);
            mPresenter.unBindView();
        }
    }

    protected abstract P createPresenter();
}
