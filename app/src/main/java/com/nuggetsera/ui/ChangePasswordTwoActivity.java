package com.nuggetsera.ui;

/*
 *  @项目名：  NuggetsEra 
 *  @包名：    com.nuggetsera.ui
 *  @文件名:   ChangePasswordTwoActivity
 *  @创建者:   Administrator
 *  @创建时间:  2018/8/16 18:12
 *  @描述：    修改密码第二个页面
 */

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.nuggetsera.R;
import com.nuggetsera.widget.FixedEdit;
import com.nuggetsera.widget.TitleView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

class ChangePasswordTwoActivity
        extends BaseActivity
{


    @BindView(R.id.title)
    TitleView mTitle;
    @BindView(R.id.et_new_password)
    FixedEdit mEtNewPassword;
    @BindView(R.id.et_ensure_new_password)
    FixedEdit mEtEnsureNewPassword;
    @BindView(R.id.btn_ensure)
    Button    mBtnEnsure;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_change_password_two;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }


    @Override
    protected void init() {
        super.init();

        //设置返回按钮
        setReturnBtn();

        //设置两个editText的内容
        setEditText();

    }

    private void setReturnBtn() {
        mTitle.getLlReturn().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTo(ChangePasswordActivity.class);
            }
        });
    }

    private void setEditText() {

        EditText etFixed = mEtNewPassword.getEtFixed(); //新密码框

        EditText etEnsureFixed = mEtEnsureNewPassword.getEtFixed(); //确定密码框
        mEtEnsureNewPassword.getTvFixed().setText("确认新密码");
        etEnsureFixed.setHint("再次输入新密码");

    }

    @OnClick(R.id.btn_ensure)
    public void onViewClicked() {
        goTo(LoginActivity.class);
    }


}
