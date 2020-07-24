package p000X;

import androidx.activity.ComponentActivity;
import com.instagram.p009ui.widget.keyboardlistenerprovider.KeyboardChangeDetectorProvider$Observer;
import java.util.HashMap;

/* renamed from: X.1Ib  reason: invalid class name and case insensitive filesystem */
public final class C27491Ib {
    public static final HashMap A00 = new HashMap();

    public static C27511Id A00(ComponentActivity componentActivity) {
        if (!((Boolean) C05640Lj.A00(AnonymousClass0L7.ENABLE_KEYBOARDLISTENER_REDESIGN, "enable_v2", false)).booleanValue()) {
            return new C27501Ic();
        }
        if (!A00.containsKey(componentActivity)) {
            A00.put(componentActivity, new AIM());
            componentActivity.getLifecycle().A06(new KeyboardChangeDetectorProvider$Observer(componentActivity));
        }
        return (C27511Id) A00.get(componentActivity);
    }
}
