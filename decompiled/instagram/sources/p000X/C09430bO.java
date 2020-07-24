package p000X;

import android.content.Context;

/* renamed from: X.0bO  reason: invalid class name and case insensitive filesystem */
public final class C09430bO {
    public static C16590oq A00(Context context) {
        AnonymousClass0L7 r2 = AnonymousClass0L7.IGVC_RSYS_STACK;
        if (((Boolean) C05640Lj.A00(r2, "enabled", false)).booleanValue()) {
            return new C24453Anw(context);
        }
        return new C16570oo(context, ((Boolean) C05640Lj.A00(r2, "multiuser_support_enabled", true)).booleanValue());
    }
}
