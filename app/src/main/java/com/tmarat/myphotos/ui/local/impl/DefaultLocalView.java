package com.tmarat.myphotos.ui.local.impl;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.jakewharton.rxbinding2.view.RxView;
import com.tmarat.myphotos.R;
import com.tmarat.myphotos.ui.local.LocalView;
import io.reactivex.Observable;

public class DefaultLocalView implements LocalView {

  @BindView(R.id.fab) FloatingActionButton fab;
  @BindView(R.id.local_recycler_view) RecyclerView recyclerView;

  @Override public int getLayout() {
    return R.layout.fragment_local;
  }

  @Override public void initView(View v) {
    ButterKnife.bind(this, v);
  }

  @Override public Observable onClick() {
    return RxView.clicks(fab);
  }
}