package com.facebook.react.modules.bundleloader;

import com.facebook.fbreact.specs.NativeDevSplitBundleLoaderSpec;
import com.facebook.react.module.annotations.ReactModule;
import p000X.A44;
import p000X.C2102594w;
import p000X.C228089rf;

@ReactModule(name = "DevSplitBundleLoader")
public class NativeDevSplitBundleLoaderModule extends NativeDevSplitBundleLoaderSpec {
    public static final String NAME = "DevSplitBundleLoader";
    public static final String REJECTION_CODE = "E_BUNDLE_LOAD_ERROR";
    public final C228089rf mDevSupportManager;

    public String getName() {
        return NAME;
    }

    public NativeDevSplitBundleLoaderModule(A44 a44, C228089rf r2) {
        super(a44);
        this.mDevSupportManager = r2;
    }

    public void loadBundle(String str, C2102594w r2) {
    }
}
