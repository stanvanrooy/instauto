package p000X;

import android.app.Activity;
import android.view.ViewGroup;

/* renamed from: X.0xv  reason: invalid class name and case insensitive filesystem */
public final class C22150xv extends C22160xw {
    public C177517i6 A00;

    public final C177517i6 A00(Activity activity, ViewGroup viewGroup, AnonymousClass0C1 r11, C85543nY r12, AnonymousClass38E r13, boolean z, String str) {
        return new C177517i6(activity, viewGroup, r11, r12, r13, z, str);
    }

    public final void A01(Activity activity, ViewGroup viewGroup, AnonymousClass0C1 r11, C13300iJ r12, AnonymousClass38E r13, boolean z, String str) {
        C177517i6 A002 = A00(activity, viewGroup, r11, new C177567iB(this, viewGroup), r13, z, str);
        this.A00 = A002;
        A002.A03();
        viewGroup.setVisibility(0);
        this.A00.A04(r12);
    }
}
