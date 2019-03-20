package com.microsoft.demo.mvpcode.module.user;

import com.microsoft.demo.mvpcode.basemvp.XIBaseMvpActivity;
import com.microsoft.demo.mvpcode.entity.XIUserEntity;
import com.microsoft.demo.mvpcode.model.base.IXIUserModel;

/**
 * 参考 book module的activity
 */
public class XIUserActivity extends XIBaseMvpActivity<XIUserPresenter> implements IXIUserModel {
    @Override
    protected XIUserPresenter createPresenter() {
        return null;
    }

    @Override
    public XIUserEntity getUser() {
        return null;
    }
}
