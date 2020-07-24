package p000X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.LinkedHashSet;

/* renamed from: X.1p5  reason: invalid class name and case insensitive filesystem */
public final class C40701p5 {
    public static final LinkedHashSet A00 = new LinkedHashSet();
    public static volatile HeroPlayerSetting A01 = HeroPlayerSetting.A1t;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (A00.size() >= r1.A0I) goto L_0x0014;
     */
    public static void A00(C40691p4 r3) {
        boolean z;
        if (r3 != null) {
            HeroPlayerSetting heroPlayerSetting = A01;
            if (heroPlayerSetting.A17) {
                z = true;
            }
            z = false;
            if (z) {
                A00.add(r3);
            } else {
                r3.release();
            }
        }
    }
}
