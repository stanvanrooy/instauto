package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1Dc  reason: invalid class name and case insensitive filesystem */
public final class C26391Dc {
    public float A00;
    public float A01;
    public String A02 = NetInfoModule.CONNECTION_TYPE_NONE;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass1DI A05;
    public final List A06 = new CopyOnWriteArrayList();

    public final void A00(C27131Gp r3) {
        this.A06.add(new WeakReference(r3));
    }

    public final void A01(C27131Gp r4) {
        for (WeakReference weakReference : this.A06) {
            C27131Gp r0 = (C27131Gp) weakReference.get();
            if (r0 == null || r0 == r4) {
                this.A06.remove(weakReference);
            }
        }
    }

    public final void A02(String str) {
        if (str == null) {
            AnonymousClass0QD.A01("SwipeNavigationState", "triggerAction is null");
        }
        if (str == null) {
            str = NetInfoModule.CONNECTION_TYPE_NONE;
        }
        this.A02 = str;
    }

    public C26391Dc(AnonymousClass1DI r2) {
        this.A05 = r2;
    }
}
