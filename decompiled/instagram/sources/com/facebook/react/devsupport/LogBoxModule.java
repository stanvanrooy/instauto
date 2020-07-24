package com.facebook.react.devsupport;

import android.view.View;
import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.module.annotations.ReactModule;
import p000X.A44;
import p000X.A5Q;
import p000X.A5S;
import p000X.A5T;
import p000X.A5V;
import p000X.A5W;
import p000X.C228039ra;
import p000X.C228089rf;

@ReactModule(name = "LogBox")
public class LogBoxModule extends NativeLogBoxSpec {
    public static final String NAME = "LogBox";
    public final C228089rf mDevSupportManager;
    public A5V mLogBoxDialog;
    public View mReactRootView;

    public String getName() {
        return NAME;
    }

    public void hide() {
        C228039ra.A01(new A5T(this));
    }

    public void onCatalystInstanceDestroy() {
        C228039ra.A01(new A5W(this));
    }

    public void show() {
        if (this.mReactRootView != null) {
            C228039ra.A01(new A5S(this));
        }
    }

    public LogBoxModule(A44 a44, C228089rf r3) {
        super(a44);
        this.mDevSupportManager = r3;
        C228039ra.A01(new A5Q(this));
    }
}
