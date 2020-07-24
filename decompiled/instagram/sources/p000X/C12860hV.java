package p000X;

import android.content.Context;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0hV  reason: invalid class name and case insensitive filesystem */
public final class C12860hV {
    public final void A00(Context context) {
        AnonymousClass2OA r2 = new AnonymousClass2OA(context);
        r2.A07(C0003R.string.unable_to_add_account);
        r2.A0U(false);
        r2.A06(AnonymousClass5EG.A00());
        r2.A0A(C0003R.string.f118ok, new C126215b3(this));
        r2.A03().show();
    }

    public final void A01(AnonymousClass0C1 r5, Context context, boolean z) {
        String str;
        String str2;
        Iterator it = new ArrayList(C16860pH.A00).iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            C16850pG r1 = (C16850pG) it.next();
            if (!r1.Ae0(context, r5)) {
                str = r1.AFL(context, r5, z);
                break;
            }
        }
        Iterator it2 = new ArrayList(C16860pH.A00).iterator();
        while (true) {
            if (!it2.hasNext()) {
                str2 = null;
                break;
            }
            C16850pG r12 = (C16850pG) it2.next();
            if (!r12.Ae0(context, r5)) {
                str2 = r12.AFK(context, r5, z);
                break;
            }
        }
        AnonymousClass2OA r2 = new AnonymousClass2OA(context);
        AnonymousClass0a4.A06(str);
        r2.A03 = str;
        AnonymousClass0a4.A06(str2);
        r2.A0M(str2);
        r2.A0U(false);
        r2.A0A(C0003R.string.f118ok, new C126205b2(this));
        r2.A03().show();
    }
}
