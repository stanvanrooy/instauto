package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.1gy  reason: invalid class name and case insensitive filesystem */
public final class C35811gy implements C35821gz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C31581Yw A02;
    public final /* synthetic */ C35601gd A03;
    public final /* synthetic */ AnonymousClass1OX A04;
    public final /* synthetic */ AnonymousClass0C1 A05;
    public final /* synthetic */ List A06;

    public C35811gy(C31581Yw r1, AnonymousClass0C1 r2, AnonymousClass1OX r3, int i, List list, C35601gd r6, Context context) {
        this.A02 = r1;
        this.A05 = r2;
        this.A04 = r3;
        this.A00 = i;
        this.A06 = list;
        this.A03 = r6;
        this.A01 = context;
    }

    public final void BHe(String str) {
        this.A04.BHb(str, (C39941no) null, this.A00, this.A06);
    }

    public final void BHm(String str) {
        SharedPreferences sharedPreferences;
        String str2;
        Integer num;
        Integer num2;
        boolean A0W = this.A02.A04.A0W();
        String str3 = str;
        if (C50252Fo.A01(this.A05)) {
            C152326fC r4 = new C152326fC(this, str3);
            AnonymousClass0C1 r2 = this.A05;
            Context context = this.A01;
            if (A0W) {
                num2 = Constants.A0C;
            } else {
                num2 = Constants.ZERO;
            }
            C50252Fo.A00(r2, context, r4, num2);
        } else if ((!A0W || C50262Fp.A00(this.A05, Constants.A0C)) && (A0W || C50262Fp.A00(this.A05, Constants.ZERO))) {
            C16180oA A002 = C16180oA.A00(this.A05);
            if (A0W) {
                sharedPreferences = A002.A00;
                str2 = "zero_rating_live_nux_count";
            } else {
                sharedPreferences = A002.A00;
                str2 = "zero_rating_story_nux_count";
            }
            int i = sharedPreferences.getInt(str2, 0);
            AnonymousClass1CK AYV = AnonymousClass1CF.A00(this.A05).AYV();
            C152316fB r13 = new C152316fB(this, A0W, A002, i, str3);
            Context context2 = this.A01;
            AnonymousClass0C1 r7 = this.A05;
            C31581Yw r1 = this.A02;
            ImageUrl A0A = r1.A04.A0A();
            Boolean valueOf = Boolean.valueOf(r1.A05(r7));
            if (A0W) {
                num = Constants.A0C;
            } else {
                num = Constants.ZERO;
            }
            C119355Ad.A00(context2, r7, A0A, valueOf, r13, num, AYV);
        } else {
            this.A04.BHY(str3, (C39941no) null, this.A00, this.A06, this.A03, (String) null, (Integer) null);
        }
    }
}
