package com.tmarat.myphotos.ui.start;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import com.tmarat.myphotos.App;
import javax.inject.Inject;

public class StartActivity extends AppCompatActivity {

  @Inject StartView view;
  @Inject StartPresenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ((App)getApplication())
        .plusStartActivityComponent(this)
        .inject(this);

    setContentView(view.getLayout());
  }

  @Override public void onContentChanged() {
    super.onContentChanged();
    view.initView(this);
    presenter.onViewInitialized();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    view.inflateOptionMenu(menu);
    return true;
  }



  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    //todo if need
    return super.onOptionsItemSelected(item);
  }
}
