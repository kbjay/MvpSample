package com.example.mvpdemo_module.mvp.module.book.base;

import com.example.mvpdemo_module.mvp.base.IXIBaseView;
import com.example.mvpdemo_module.entity.XIBookEntity;

/**
 * book module 的 view 接口
 */
public interface IXIBookModuleView extends IXIBaseView {
    /**
     * 从model中获取数据成功
     *
     * @param entity
     */
    void onGetBookSuccess(XIBookEntity entity);
}
