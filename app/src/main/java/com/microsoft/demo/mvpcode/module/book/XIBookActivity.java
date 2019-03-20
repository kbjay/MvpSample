package com.microsoft.demo.mvpcode.module.book;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.microsoft.demo.mvpcode.R;
import com.microsoft.demo.mvpcode.basemvp.XIBaseMvpActivity;
import com.microsoft.demo.mvpcode.entity.XIBookEntity;
import com.microsoft.demo.mvpcode.model.XIBookModel;
import com.microsoft.demo.mvpcode.module.book.base.IXIBookModuleView;

public class XIBookActivity extends XIBaseMvpActivity<XIBookPresenter> implements IXIBookModuleView {

    private TextView mTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initViews();
    }

    @Override
    protected XIBookPresenter createPresenter() {
        return new XIBookPresenter(this, new XIBookModel());
    }

    private void initViews() {
        mTv = findViewById(R.id.tv_test);
        findViewById(R.id.bt_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.getUser();
            }
        });
    }

    @Override
    public void onGetBookSuccess(XIBookEntity entity) {
        mTv.setText(entity.id + "->" + entity.name);
    }
}
