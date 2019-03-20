package com.microsoft.demo.mvpcode.module.user;

import com.microsoft.demo.mvpcode.basemvp.XIBaseMvpPresenter;
import com.microsoft.demo.mvpcode.model.XIUserModel;
import com.microsoft.demo.mvpcode.module.user.base.IXIUserModuleView;

/**
 * 参考book module的presenter
 */
public class XIUserPresenter extends XIBaseMvpPresenter<IXIUserModuleView, XIUserModel> {
    public XIUserPresenter(IXIUserModuleView view, XIUserModel model) {
        super(view, model);
    }
}
