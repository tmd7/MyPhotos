package com.tmarat.myphotos.ui.local;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tmarat.myphotos.R;
public class LocalFragment extends Fragment {

  LocalView view;
  LocalPresenter presenter;

  @Override public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(view.getLayout(), container, false);
  }

  @Override public void onViewCreated(@NonNull View v, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(v, savedInstanceState);
    view.initView(v);
    presenter.onViewInitialised();
  }
}
