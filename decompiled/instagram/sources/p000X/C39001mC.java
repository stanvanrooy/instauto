package p000X;

import android.content.Context;
import android.widget.ImageView;

/* renamed from: X.1mC  reason: invalid class name and case insensitive filesystem */
public final class C39001mC {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r1.A1L() == false) goto L_0x002a;
     */
    public static void A00(C32251aq r4, AnonymousClass1NJ r5, C36841ih r6, C27371Ho r7, C30451Tw r8, AnonymousClass0C1 r9, Context context) {
        boolean z;
        C36841ih r0 = r4.A04;
        int i = 0;
        if (!(r0 == null || r0 == r6)) {
            r0.A0C(r4, false);
        }
        r4.A04 = r6;
        r4.A02 = r5;
        AnonymousClass1NJ r1 = r5;
        if (r5.A1W()) {
            r1 = r5.A0P(r6.AHt());
        }
        if (r1.AiO()) {
            z = true;
        }
        z = false;
        if (!z) {
            C06220Of.A0F(r4.A03);
        } else if (AnonymousClass23U.A00(r5, r6, context, r9).first != null) {
            r6.A0B(r4, false);
            C32251aq.A00(r4).setOnClickListener(new AnonymousClass2E4(r9, r6, r8, r5));
            ImageView A00 = C32251aq.A00(r4);
            if (!r6.A0z) {
                i = 8;
            }
            A00.setVisibility(i);
        }
        C32991cC A002 = C32991cC.A00(r9);
        A002.A07(r4.A03, C33051cI.WAM_ENTRY_POINT);
        A002.A04(r4.A03, new C38231kw(r5, r9, r7, new C39021mE(r5, context, r6)));
    }
}
