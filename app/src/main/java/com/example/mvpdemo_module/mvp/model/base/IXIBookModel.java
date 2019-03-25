package com.example.mvpdemo_module.mvp.model.base;

import com.example.mvpdemo_module.mvp.base.IXIBaseModel;
import com.example.mvpdemo_module.entity.XIBookEntity;

/**
 * book model 接口
 */
public interface IXIBookModel extends IXIBaseModel {
    XIBookEntity getBook();
}
