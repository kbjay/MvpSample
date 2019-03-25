package com.example.mvpdemo_module.mvp.module.book;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mvpdemo_module.R;
import com.example.mvpdemo_module.entity.XIBookEntity;
import com.example.mvpdemo_module.mvp.base.XIBaseActivity;
import com.example.mvpdemo_module.mvp.model.XIBookModel;
import com.example.mvpdemo_module.mvp.module.book.base.IXIBookModuleView;

public class XIBookActivity extends XIBaseActivity<XIBookPresenter> implements IXIBookModuleView {

    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        mTv = findViewById(R.id.tv_test);
        findViewById(R.id.bt_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.getUser();
            }
        });
    }

    @Override
    protected XIBookPresenter createPresenter() {
        return new XIBookPresenter(this, new XIBookModel());
    }

    @Override
    public void onGetBookSuccess(XIBookEntity entity) {
        mTv.setText(entity.name);
    }
}
