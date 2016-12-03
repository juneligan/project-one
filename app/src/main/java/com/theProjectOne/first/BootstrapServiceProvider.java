package com.theProjectOne.first;

import android.accounts.AccountsException;
import android.app.Activity;

import com.theProjectOne.first.core.BootstrapService;

import java.io.IOException;

public interface BootstrapServiceProvider {
    BootstrapService getService(Activity activity) throws IOException, AccountsException;
}
