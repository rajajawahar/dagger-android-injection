package iammert.com.dagger_android_injection.ui.login;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import iammert.com.dagger_android_injection.data.ApiService;

/**
 * Created by rajajawahar on 23/12/17.
 */

@Module public abstract class LoginActivityModule {

  @Provides static LoginPresenter createLoginPresenter(LoginView loginView, ApiService apiService) {
    return new LoginPresenter(loginView, apiService);
  }

  @Binds abstract LoginView createLoginView(LoginActivity loginActivity);
}
