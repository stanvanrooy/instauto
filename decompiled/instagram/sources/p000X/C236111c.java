package p000X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* renamed from: X.11c  reason: invalid class name and case insensitive filesystem */
public final class C236111c extends C235510v implements AnonymousClass0C2 {
    public static C236111c A00(AnonymousClass0C1 r3) {
        Class<C236111c> cls = C236111c.class;
        C236111c r1 = (C236111c) r3.AV9(cls);
        if (r1 != null) {
            return r1;
        }
        C236111c r12 = new C236111c(r3, new C236211e());
        r3.BYi(cls, r12);
        return r12;
    }

    public final void A05(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher A00 = C39011mD.A00(str);
            ArrayList arrayList = new ArrayList();
            while (A00.find()) {
                String group = A00.group(1);
                arrayList.add(group.substring(1, group.length()));
            }
            SharedPreferences.Editor edit = this.A00.edit();
            for (Object next : arrayList) {
                try {
                    C235710x r0 = this.A01;
                    edit.putString(r0.AOC(next), r0.BfP(next));
                    C235510v.A01(this, next);
                } catch (IOException unused) {
                }
            }
            edit.apply();
        }
    }

    public final void onUserSessionStart(boolean z) {
        int A03 = AnonymousClass0Z0.A03(-1436076836);
        C05700Lp.A00().ADc(new C236311f(this));
        AnonymousClass0Z0.A0A(305883153, A03);
    }

    public C236111c(AnonymousClass0C1 r1, C235710x r2) {
        super(r1, r2);
    }
}
