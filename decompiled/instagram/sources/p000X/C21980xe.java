package p000X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* renamed from: X.0xe  reason: invalid class name and case insensitive filesystem */
public abstract class C21980xe {
    public static C21970xd A00;

    public abstract C21980xe A02(Uri uri);

    public abstract C21980xe A03(Bundle bundle);

    public abstract C21980xe A04(String str);

    public abstract C21980xe A05(String str);

    public abstract C21980xe A06(String str);

    public abstract C21980xe A07(List list);

    public abstract C21980xe A08(boolean z);

    public abstract C21980xe A09(boolean z);

    public abstract C21980xe A0A(boolean z);

    public abstract C21980xe A0B(int[] iArr);

    public abstract void A0C();

    public static C21980xe A00(Activity activity, AnonymousClass0C1 r3, String str, AnonymousClass0RN r5) {
        boolean z = false;
        if (A00 != null) {
            z = true;
        }
        AnonymousClass0a4.A0C(z, "Must call setInstanceSupplier first");
        return new C138535vQ(activity, r3, str, r5);
    }
}
