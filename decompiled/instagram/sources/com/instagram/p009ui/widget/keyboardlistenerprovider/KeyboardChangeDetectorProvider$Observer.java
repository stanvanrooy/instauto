package com.instagram.p009ui.widget.keyboardlistenerprovider;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.OnLifecycleEvent;
import p000X.AIM;
import p000X.AnonymousClass1AD;
import p000X.C1662977d;
import p000X.C27491Ib;

/* renamed from: com.instagram.ui.widget.keyboardlistenerprovider.KeyboardChangeDetectorProvider$Observer */
public class KeyboardChangeDetectorProvider$Observer implements AnonymousClass1AD {
    public final ComponentActivity A00;

    @OnLifecycleEvent(C1662977d.ON_DESTROY)
    public void onDestroy() {
        AIM aim = (AIM) C27491Ib.A00.remove(this.A00);
        if (aim != null) {
            aim.A02();
        }
        this.A00.getLifecycle().A07(this);
    }

    public KeyboardChangeDetectorProvider$Observer(ComponentActivity componentActivity) {
        this.A00 = componentActivity;
    }
}
