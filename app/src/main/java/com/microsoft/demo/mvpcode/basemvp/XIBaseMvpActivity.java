package com.microsoft.demo.mvpcode.basemvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * mvp activity
 *
 * @param <P> mvp presenter
 */
public abstract class XIBaseMvpActivity<P extends XIBaseMvpPresenter> extends AppCompatActivity implements IXIBaseMvpView {
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
        mPresenter.bindView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.unBindView();
        }
    }

    protected abstract P createPresenter();
}
