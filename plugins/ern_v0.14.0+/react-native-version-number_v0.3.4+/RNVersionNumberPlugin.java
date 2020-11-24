package com.walmartlabs.ern.container.plugins;

import android.app.Application;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.facebook.react.ReactInstanceManagerBuilder;
import com.facebook.react.ReactPackage;
import com.apsl.versionnumber.RNVersionNumberPackage;

public class RNVersionNumberPlugin implements ReactPlugin {
    public ReactPackage hook(@NonNull Application application,
                      @Nullable ReactPluginConfig config) {
        return new RNVersionNumberPackage();
    }
}
