package com.tmarat.myphotos.ui.local;

import android.view.View;
import io.reactivex.Observable;

public interface LocalView {
  void initView(View v);

  int getLayout();

  Observable onClick();
}
