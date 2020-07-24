package p000X;

import android.app.Activity;
import android.content.Intent;
import com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity;

/* renamed from: X.0me  reason: invalid class name and case insensitive filesystem */
public final class C15290me implements AnonymousClass0QB {
    public final C14330kH A00;

    public final void Aqy(Activity activity) {
    }

    public final void Ar1(Activity activity) {
    }

    public final void Ar2(Activity activity) {
    }

    public final void Ar6(Activity activity) {
    }

    public C15290me(C14330kH r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r2 == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (p000X.AnonymousClass1B9.class.isAssignableFrom(r5.getClass()) == false) goto L_0x001c;
     */
    public final void Aqz(Activity activity) {
        boolean z;
        boolean z2;
        if (activity.getResources() instanceof C14790lj) {
            this.A00.A04();
            if (activity != null) {
                z = true;
            }
            z = false;
            if (!z) {
                C14330kH r3 = this.A00;
                if (r3.A09) {
                    boolean A002 = r3.A03.A00(r3.A02());
                    z2 = false;
                    if (r3.A06.get() != null) {
                        z2 = true;
                    }
                }
                z2 = true;
                if (!z2) {
                    Intent intent = new Intent(activity, WaitingForStringsActivity.class);
                    intent.putExtra("return_intent", activity.getIntent());
                    AnonymousClass1BH.A03(intent, activity);
                    activity.finish();
                }
            }
        }
    }
}
