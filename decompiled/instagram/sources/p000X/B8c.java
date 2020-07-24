package p000X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.B8c */
public final class B8c {
    public static final B8Y A00;
    public static final B8Y A01;
    public static final C25216B8b A02 = new C25216B8b("Xo8WBi6jzSxKDVR4drqm84yr9iU", "-sYXRdwJA3hvue3mKpYrOZ9zSPC7b4mbgzJmdZEDO5w");

    public static boolean A00(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            return A01.A07(B8Y.A00(applicationInfo.uid, context), context) || A00.A07(B8Y.A00(applicationInfo.uid, context), context);
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(B91.A05);
        hashSet.add(B91.A08);
        hashSet.add(B91.A0N);
        hashSet.add(B91.A0t);
        A01 = B8Z.A01(Collections.unmodifiableSet(hashSet));
        HashSet hashSet2 = new HashSet();
        hashSet2.add(B91.A0q);
        hashSet2.add(B91.A0r);
        HashSet hashSet3 = new HashSet();
        hashSet3.add("com.facebook.study");
        hashSet3.add("com.facebook.viewpoints");
        A00 = B8Z.A02(Collections.unmodifiableSet(hashSet2), Collections.unmodifiableSet(hashSet3));
    }
}
