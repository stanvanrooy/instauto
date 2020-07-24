package p000X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0nD  reason: invalid class name and case insensitive filesystem */
public final class C15590nD {
    public final SharedPreferences A00;
    public final AnonymousClass0C1 A01;

    public C15590nD(Context context, AnonymousClass0C1 r5) {
        this.A01 = r5;
        this.A00 = context.getSharedPreferences(AnonymousClass000.A0J(r5.A04(), "_", "ViewStateModStore"), 0);
    }
}
