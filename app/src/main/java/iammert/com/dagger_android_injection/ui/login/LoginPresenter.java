package iammert.com.dagger_android_injection.ui.login;

import iammert.com.dagger_android_injection.data.ApiService;
import javax.inject.Inject;

/**
 * Created by rajajawahar on 23/12/17.
 */

public class LoginPresenter {

  private LoginView loginView;
  private ApiService apiService;

  @Inject public LoginPresenter(LoginView loginView, ApiService apiService) {
    this.loginView = loginView;
    this.apiService = apiService;
  }

  public void testCall() {
    System.out.print("Raja Mohamed");
    loginView.showLoading();
  }
}
