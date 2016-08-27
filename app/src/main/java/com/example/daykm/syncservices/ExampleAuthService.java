package com.example.daykm.syncservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.example.daykm.syncservices.authenticator.ExampleAuthenticator;

public class ExampleAuthService extends Service {

    private ExampleAuthenticator auth;

    @Override
    public void onCreate() {
        auth = new ExampleAuthenticator(this);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return auth.getIBinder();
    }
}
