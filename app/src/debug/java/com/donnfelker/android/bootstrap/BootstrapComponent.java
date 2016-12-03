package com.theProjectOne.first;

import com.theProjectOne.first.authenticator.BootstrapAuthenticatorActivity;
import com.theProjectOne.first.core.TimerService;
import com.theProjectOne.first.ui.BootstrapActivity;
import com.theProjectOne.first.ui.BootstrapFragmentActivity;
import com.theProjectOne.first.ui.BootstrapTimerActivity;
import com.theProjectOne.first.ui.CheckInsListFragment;
import com.theProjectOne.first.ui.MainActivity;
import com.theProjectOne.first.ui.NavigationDrawerFragment;
import com.theProjectOne.first.ui.NewsActivity;
import com.theProjectOne.first.ui.NewsListFragment;
import com.theProjectOne.first.ui.UserActivity;
import com.theProjectOne.first.ui.UserListFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AndroidModule.class,
                BootstrapModule.class
        }
)
public interface BootstrapComponent {

    void inject(BootstrapApplication target);

    void inject(BootstrapAuthenticatorActivity target);

    void inject(BootstrapTimerActivity target);

    void inject(MainActivity target);

    void inject(CheckInsListFragment target);

    void inject(NavigationDrawerFragment target);

    void inject(NewsActivity target);

    void inject(NewsListFragment target);

    void inject(UserActivity target);

    void inject(UserListFragment target);

    void inject(TimerService target);

    void inject(BootstrapFragmentActivity target);
    void inject(BootstrapActivity target);


}
