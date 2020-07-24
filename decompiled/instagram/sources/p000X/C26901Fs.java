package p000X;

import android.os.Build;

/* renamed from: X.1Fs  reason: invalid class name and case insensitive filesystem */
public final class C26901Fs {
    public final AnonymousClass0C1 A00;
    public final Integer A01;

    public static C26921Fu A00(AnonymousClass0C1 r5, Integer num) {
        C26901Fs r4 = new C26901Fs(r5, num);
        boolean z = C16180oA.A00(r4.A00).A00.getBoolean("render_blur_icons", true);
        if (r4.A01.intValue() != 0 || C26911Ft.A00()) {
            return new C26921Fu(false, false, z);
        }
        if (C26911Ft.A00 == null) {
            C26911Ft.A00 = Boolean.valueOf(Build.MODEL.startsWith("LG-E61"));
        }
        if (C26911Ft.A00.booleanValue()) {
            return new C26921Fu(true, false, z);
        }
        return new C26921Fu(true, true, z);
    }

    public C26901Fs(AnonymousClass0C1 r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }
}
