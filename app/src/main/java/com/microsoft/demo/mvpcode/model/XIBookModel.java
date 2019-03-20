package com.microsoft.demo.mvpcode.model;

import com.microsoft.demo.mvpcode.entity.XIBookEntity;
import com.microsoft.demo.mvpcode.model.base.IXIBookModel;

/**
 * book model
 */
public class XIBookModel implements IXIBookModel {
    @Override
    public XIBookEntity getBook() {
        //实际开发中应该是从net或者本地去取数据
        return new XIBookEntity(1L, "kb_jay");
    }
}
