package com.instagram.react.views.clockview;

import com.facebook.react.uimanager.SimpleViewManager;
import p000X.C174077cA;
import p000X.C23053A3d;

public class ReactClockManager extends SimpleViewManager {
    public static final String REACT_CLASS = "AndroidClock";

    public String getName() {
        return REACT_CLASS;
    }

    public C174077cA createViewInstance(C23053A3d a3d) {
        C174077cA r1 = new C174077cA(a3d);
        r1.A01.cancel();
        r1.A01.start();
        return r1;
    }
}
