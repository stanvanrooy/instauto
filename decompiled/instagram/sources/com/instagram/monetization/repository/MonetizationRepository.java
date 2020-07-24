package com.instagram.monetization.repository;

import com.instagram.brandedcontent.intf.response.MonetizationProductOnboardingNextStepInfo;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass25V;
import p000X.AnonymousClass2E5;
import p000X.AnonymousClass2EA;
import p000X.AnonymousClass6BY;
import p000X.AnonymousClass6BZ;
import p000X.AnonymousClass6Bb;
import p000X.AnonymousClass6Bd;
import p000X.C05210Iq;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C13150hy;
import p000X.C13460iZ;
import p000X.C143336Bc;
import p000X.C15890nh;
import p000X.C16180oA;
import p000X.C17850qu;
import p000X.C17920r1;
import p000X.C207028ua;
import p000X.C228369sq;
import p000X.C27791Jf;
import p000X.C64482rY;

public final class MonetizationRepository {
    public final C16180oA A00;
    public final AnonymousClass0C1 A01;
    public final AnonymousClass2E5 A02 = AnonymousClass2E5.A00();
    public final AnonymousClass2EA A03;

    public final C27791Jf A00() {
        C15890nh r2 = new C15890nh(this.A01);
        r2.A09 = Constants.A0N;
        r2.A0C = "business/eligibility/get_appeals_data/";
        r2.A06(AnonymousClass6BZ.class, false);
        return C64482rY.A00(r2.A03());
    }

    public final C27791Jf A01() {
        AnonymousClass2E5 r5 = this.A02;
        String string = this.A00.A00.getString("igtv_revshare_eligibility_decision", "not_eligible");
        if (string == null) {
            string = "not_eligible";
        }
        String string2 = this.A00.A00.getString("igtv_revshare_next_step", (String) null);
        ArrayList arrayList = null;
        if (string2 != null) {
            try {
                C13080hr A0A = C12890hY.A00.A0A(string2);
                A0A.A0p();
                if (A0A.A0g() == C13120hv.START_ARRAY) {
                    ArrayList arrayList2 = new ArrayList();
                    while (A0A.A0p() != C13120hv.END_ARRAY) {
                        C13080hr A0A2 = C12890hY.A00.A0A(A0A.A0t());
                        A0A2.A0p();
                        MonetizationProductOnboardingNextStepInfo parseFromJson = C228369sq.parseFromJson(A0A2);
                        if (parseFromJson != null) {
                            arrayList2.add(parseFromJson);
                        }
                    }
                    arrayList = arrayList2;
                }
            } catch (IOException unused) {
                this.A00.A00.edit().putString("igtv_revshare_next_step", (String) null).apply();
                AnonymousClass0QD.A02("com.instagram.monetization.repository.MonetizationRepository", "Error parsing MonetizationProductOnboardingNextStepInfo to JSON");
            }
        }
        r5.accept(new C207028ua(string, arrayList));
        return this.A02;
    }

    public final C27791Jf A02(C17920r1 r6) {
        String str;
        AnonymousClass2EA r4 = this.A03;
        C13150hy.A02(r6, "apiCallBack");
        try {
            str = AnonymousClass6BY.A00(new AnonymousClass6Bd(new C143336Bc(r4.A00.A04())));
            C13150hy.A01(str, "MonetizationEligibilityA…    userSession.userId)))");
        } catch (IOException unused) {
            AnonymousClass0QD.A02("MonetizationApi", "Error serializing to JSON");
            str = null;
        }
        AnonymousClass25V A002 = AnonymousClass25V.A00(C05210Iq.A02(r4.A00));
        if (str == null) {
            C13150hy.A03("queryParamsString");
        }
        A002.A03(new AnonymousClass6Bb(str));
        Integer num = Constants.ZERO;
        A002.A04(num);
        C17850qu A022 = A002.A02(num);
        A022.A00 = r6;
        C13150hy.A01(A022, "GraphQLApi.Builder\n     ….addCallback(apiCallBack)");
        return C64482rY.A00(A022);
    }

    public final void A03(List list) {
        String str;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    StringWriter stringWriter = new StringWriter();
                    C13460iZ A05 = C12890hY.A00.A05(stringWriter);
                    A05.A0S();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        MonetizationProductOnboardingNextStepInfo monetizationProductOnboardingNextStepInfo = (MonetizationProductOnboardingNextStepInfo) it.next();
                        StringWriter stringWriter2 = new StringWriter();
                        C13460iZ A052 = C12890hY.A00.A05(stringWriter2);
                        A052.A0T();
                        A052.A0F("index", monetizationProductOnboardingNextStepInfo.A00);
                        String str2 = monetizationProductOnboardingNextStepInfo.A01;
                        if (str2 != null) {
                            A052.A0H("step", str2);
                        }
                        A052.A0Q();
                        A052.close();
                        A05.A0g(stringWriter2.toString());
                    }
                    A05.A0P();
                    A05.close();
                    str = stringWriter.toString();
                    this.A00.A00.edit().putString("igtv_revshare_next_step", str).apply();
                }
            } catch (IOException unused) {
                AnonymousClass0QD.A02("com.instagram.monetization.repository.MonetizationRepository", "Error serializing MonetizationProductOnboardingNextStepInfo to JSON");
                str = null;
            }
        }
        str = null;
        this.A00.A00.edit().putString("igtv_revshare_next_step", str).apply();
    }

    public MonetizationRepository(AnonymousClass0C1 r2) {
        this.A01 = r2;
        this.A00 = C16180oA.A00(r2);
        this.A03 = new AnonymousClass2EA(r2);
    }
}
