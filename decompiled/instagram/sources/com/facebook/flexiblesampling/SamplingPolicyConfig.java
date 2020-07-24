package com.facebook.flexiblesampling;

public interface SamplingPolicyConfig {
    String provideAppVersion();

    String provideConfigChecksum();

    String provideLoggedInUserId();
}
