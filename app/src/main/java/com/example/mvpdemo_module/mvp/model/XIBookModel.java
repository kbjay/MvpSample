package com.example.mvpdemo_module.mvp.model;

import com.example.mvpdemo_module.entity.XIBookEntity;
import com.example.mvpdemo_module.mvp.model.base.IXIBookModel;

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
