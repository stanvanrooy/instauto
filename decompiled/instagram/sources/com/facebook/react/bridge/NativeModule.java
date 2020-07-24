package com.facebook.react.bridge;

public interface NativeModule {
    boolean canOverrideExistingModule();

    String getName();

    void initialize();

    void onCatalystInstanceDestroy();
}
