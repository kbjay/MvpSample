package com.example.mvpdemo_module.mvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * mvp activity
 *
 * @param <P> mvp presenter
 */
public abstract class XIBaseActivity<P extends XIBasePresenter> extends AppCompatActivity implements IXIBaseView {
    public P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
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
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            getLifecycle().removeObserver(mPresenter);
            mPresenter.unBindView();
        }
    }

    protected abstract P createPresenter();
}
