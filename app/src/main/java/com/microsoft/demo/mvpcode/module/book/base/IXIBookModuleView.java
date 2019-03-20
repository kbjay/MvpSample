package com.microsoft.demo.mvpcode.module.book.base;

import com.microsoft.demo.mvpcode.basemvp.IXIBaseMvpView;
import com.microsoft.demo.mvpcode.entity.XIBookEntity;

/**
 * book module 的 view 接口
 */
public interface IXIBookModuleView extends IXIBaseMvpView {
    /**
     * 从model中获取数据成功
     *
     * @param entity
     */
    void onGetBookSuccess(XIBookEntity entity);
}
