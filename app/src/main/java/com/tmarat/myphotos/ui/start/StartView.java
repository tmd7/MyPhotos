package com.tmarat.myphotos.ui.start;

import android.view.Menu;
import com.tmarat.myphotos.ui.start.impl.DefaultStartPresenter;

public interface StartView {
  int getLayout();

  void initView(StartActivity activity);

  void inflateOptionMenu(Menu menu);

  void setStartClickHandler(StartClickHandler handler);
}
