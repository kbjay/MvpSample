package com.microsoft.demo.mvpcode.module.book;

import com.microsoft.demo.mvpcode.basemvp.XIBaseMvpPresenter;
import com.microsoft.demo.mvpcode.entity.XIBookEntity;
import com.microsoft.demo.mvpcode.model.XIBookModel;
import com.microsoft.demo.mvpcode.module.book.base.IXIBookModuleView;

public class XIBookPresenter extends XIBaseMvpPresenter<IXIBookModuleView, XIBookModel> {

    public XIBookPresenter(IXIBookModuleView view, XIBookModel model) {
        super(view, model);
    }

    public void getUser() {
        XIBookEntity book = getModel().getBook();
        getMvpView().onGetBookSuccess(book);
    }
}
