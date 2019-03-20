package com.microsoft.demo.mvpcode.model.base;

import com.microsoft.demo.mvpcode.basemvp.IXIBaseMvpModel;
import com.microsoft.demo.mvpcode.entity.XIUserEntity;

/**
 * user model 接口
 */
public interface IXIUserModel extends IXIBaseMvpModel {
    XIUserEntity getUser();
}
