package com.instagram.react.perf;

import com.facebook.react.uimanager.ViewGroupManager;
import p000X.A2B;
import p000X.A3H;
import p000X.C06590Pq;
import p000X.C23053A3d;

public class IgReactPerformanceLoggerFlagManager extends ViewGroupManager {
    public static final String REACT_CLASS = "ReactPerformanceLoggerFlag";
    public final A3H mReactPerformanceFlagListener;
    public final C06590Pq mSession;

    public String getName() {
        return REACT_CLASS;
    }

    public IgReactPerformanceLoggerFlagManager(A3H a3h, C06590Pq r2) {
        this.mReactPerformanceFlagListener = a3h;
        this.mSession = r2;
    }

    public A2B createViewInstance(C23053A3d a3d) {
        return new A2B(a3d, this.mSession, this.mReactPerformanceFlagListener);
    }
}
