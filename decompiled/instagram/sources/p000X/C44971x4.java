package p000X;

import android.content.Context;
import android.os.DVFSHelper;
import com.samsung.android.os.SemPerfManager;

/* renamed from: X.1x4  reason: invalid class name and case insensitive filesystem */
public final class C44971x4 {
    public static C12430gj A00(Context context) {
        boolean z;
        boolean z2;
        C12430gj A02 = C45251xX.A02(context);
        if (A02 != null) {
            return A02;
        }
        Class<SemPerfManager> cls = SemPerfManager.class;
        try {
            cls.toString();
            Class cls2 = Boolean.TYPE;
            if (!C44941x1.A01(cls, "onScrollEvent", cls2)) {
                z = false;
            } else {
                C30526DeA.A00 = C44941x1.A01(cls, "onSmoothScrollEvent", cls2);
                z = true;
            }
        } catch (Error | Exception unused) {
            z = false;
        }
        if (z) {
            return new C30526DeA();
        }
        Class<DVFSHelper> cls3 = DVFSHelper.class;
        try {
            cls3.toString();
            Class cls4 = Boolean.TYPE;
            if (!C44941x1.A01(cls3, "onScrollEvent", cls4)) {
                z2 = false;
            } else {
                C30525De9.A00 = C44941x1.A01(cls3, "onSmoothScrollEvent", cls4);
                z2 = true;
            }
        } catch (Error | Exception unused2) {
            z2 = false;
        }
        if (z2) {
            return new C30525De9();
        }
        return null;
    }
}
