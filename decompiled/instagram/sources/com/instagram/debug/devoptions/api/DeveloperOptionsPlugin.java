package com.instagram.debug.devoptions.api;

import p000X.AnonymousClass1HD;

public abstract class DeveloperOptionsPlugin {
    public static DeveloperOptionsPlugin sInstance;

    public abstract AnonymousClass1HD getDeveloperOptionsFragment();

    public abstract AnonymousClass1HD getInjectedMediaToolFragment();

    public abstract AnonymousClass1HD getStoriesExperimentSwitcherToolFragment();

    public abstract AnonymousClass1HD getStoryToolbarSwitcherFragment();

    public static DeveloperOptionsPlugin getInstance() {
        return sInstance;
    }

    public static void setInstance(DeveloperOptionsPlugin developerOptionsPlugin) {
        sInstance = developerOptionsPlugin;
    }
}
