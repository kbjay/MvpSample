package com.microsoft.demo.mvpcode.model.base;

import com.microsoft.demo.mvpcode.basemvp.IXIBaseMvpModel;
import com.microsoft.demo.mvpcode.entity.XIBookEntity;

/**
 * book model 接口
 */
public interface IXIBookModel extends IXIBaseMvpModel {
    XIBookEntity getBook();
}
