package com.example.mvpdemo_module.mvp.module.user;

import com.example.mvpdemo_module.mvp.base.XIBaseActivity;
import com.example.mvpdemo_module.entity.XIUserEntity;
import com.example.mvpdemo_module.mvp.model.base.IXIUserModel;

/**
 * 参考 book module的activity
 */
public class XIUserActivity extends XIBaseActivity<XIUserPresenter> implements IXIUserModel {
    @Override
    protected XIUserPresenter createPresenter() {
        return null;
    }

    @Override
    public XIUserEntity getUser() {
        return null;
    }
}
