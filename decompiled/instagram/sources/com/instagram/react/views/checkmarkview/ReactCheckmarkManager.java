package com.instagram.react.views.checkmarkview;

import android.util.AttributeSet;
import com.facebook.react.uimanager.SimpleViewManager;
import p000X.AnonymousClass2Z4;
import p000X.C23053A3d;

public class ReactCheckmarkManager extends SimpleViewManager {
    public static final String REACT_CLASS = "AndroidCheckmark";

    public String getName() {
        return REACT_CLASS;
    }

    public AnonymousClass2Z4 createViewInstance(C23053A3d a3d) {
        AnonymousClass2Z4 r2 = new AnonymousClass2Z4(a3d, (AttributeSet) null, 0);
        r2.A02.cancel();
        r2.A02.start();
        return r2;
    }
}
