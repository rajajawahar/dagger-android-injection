package iammert.com.dagger_android_injection.ui.login;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import dagger.android.support.DaggerAppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import iammert.com.dagger_android_injection.R;
import javax.inject.Inject;

import static android.Manifest.permission.READ_CONTACTS;

public class LoginActivity extends DaggerAppCompatActivity implements LoginView {

  @Inject LoginPresenter loginPresenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    loginPresenter.testCall();
  }

  @Override public void showLoading() {
    Toast.makeText(this, "Show Loading", Toast.LENGTH_SHORT).show();
  }

  @Override public void hideLoading() {

  }

  @Override public void navigateToHome() {

  }
}

