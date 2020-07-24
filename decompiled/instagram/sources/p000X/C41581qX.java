package p000X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.1qX  reason: invalid class name and case insensitive filesystem */
public final class C41581qX extends AnonymousClass1SZ {
    public final Context A00;
    public final AnonymousClass0RU A01;
    public final C27371Ho A02;
    public final C701435a A03;
    public final AnonymousClass0C1 A04;

    public C41581qX(C701435a r2, AnonymousClass0C1 r3, C27371Ho r4, C13740j9 r5, Context context) {
        super(r5, new AnonymousClass8TS(r3));
        this.A03 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A01 = AnonymousClass0WN.A01(r3);
        this.A00 = context;
    }

    private void A00(String str, C50282Fr r29, AnonymousClass8TW r30) {
        AnonymousClass8TW r4 = r30;
        C37141jB A022 = AnonymousClass3GV.A02(r4.A01, str, this.A02, this.A04);
        A022.A1T = r4.A00;
        C50282Fr r1 = r29;
        C37311jS.A09(A022, r1, r4, this.A03);
        if (r4.A03) {
            A022.A0H(r1.A0A.A0j);
        } else {
            AnonymousClass0C1 r10 = this.A04;
            C39941no r9 = r4.A01;
            C64982sM r8 = r4.A02;
            Context context = this.A00;
            A022.A05(C06220Of.A01(context, (float) C06220Of.A09(context)), C06220Of.A01(context, (float) C06220Of.A08(context)), C06220Of.A0B(context).density);
            C61762mM r0 = r8.A0F;
            if (((Boolean) AnonymousClass0L6.A03(r10, AnonymousClass0L7.STORIES_NEW_PORTAL_LAUNCHER, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                AnonymousClass5Q7 r02 = r8.A0E;
                if (r02 != null) {
                    Map AOo = r02.AOo();
                    if (A022.A1y == null) {
                        A022.A1y = C06270Ok.A00();
                    }
                    A022.A1y.A0C(AOo);
                }
            } else if (r0 != null) {
                AnonymousClass1NJ r12 = r9.A08;
                float A012 = C06220Of.A01(context, r0.A02);
                float A013 = C06220Of.A01(context, r0.A03);
                float A014 = C06220Of.A01(context, r0.A08);
                float A015 = C06220Of.A01(context, r0.A09);
                float A016 = C06220Of.A01(context, r0.A00);
                int i = r0.A0A;
                boolean z = r0.A0L;
                int i2 = r0.A0B;
                int i3 = r0.A0D;
                int i4 = r0.A0E;
                A022.A08(r12, A012, A013, A014, A015, A016, i, z, i2, i3, i4, r0.A0C, C06220Of.A01(context, r0.A01), C06220Of.A01(context, r0.A04), C06220Of.A01(context, r0.A07));
            }
        }
        C36901in.A09(this.A01, this.A02, r4.A01, A022.A03(), Constants.ONE);
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        A00("segment_impression", (C50282Fr) obj, (AnonymousClass8TW) obj2);
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        A00("segment_sub_impression", (C50282Fr) obj, (AnonymousClass8TW) obj2);
    }
}
