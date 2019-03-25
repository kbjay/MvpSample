package com.example.mvpdemo_module.mvp.model.base;

import com.example.mvpdemo_module.mvp.base.IXIBaseModel;
import com.example.mvpdemo_module.entity.XIUserEntity;

/**
 * user model 接口
 */
public interface IXIUserModel extends IXIBaseModel {
    XIUserEntity getUser();
}
