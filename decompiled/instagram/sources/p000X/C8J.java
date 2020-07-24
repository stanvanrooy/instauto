package p000X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.C8J */
public final class C8J {
    public final AnonymousClass0C1 A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final void A00(Object obj) {
        for (WeakReference weakReference : this.A05) {
            C27319C8o c8o = (C27319C8o) weakReference.get();
            if (c8o != null) {
                c8o.BPi(obj);
            }
        }
    }

    public final void A01(Throwable th) {
        for (WeakReference weakReference : this.A05) {
            C27319C8o c8o = (C27319C8o) weakReference.get();
            if (c8o != null) {
                c8o.B2m(th);
            }
        }
    }

    public C8J(AnonymousClass0C1 r5, long j, long j2, String str, C27319C8o c8o) {
        this.A00 = r5;
        String A042 = r5.A04();
        Integer num = Constants.A15;
        this.A04 = AnonymousClass000.A0E(AGL.A00(num), A042);
        this.A02 = "";
        this.A01 = num;
        this.A05 = new ArrayList();
        this.A03 = C06360Ot.formatString("{\"since\":%d,\"until\":%d,\"insights_timeframe\":\"%s\",\"queryParams\":{\"access_token\":\"\",\"id\":\"%s\"}}", Long.valueOf(j), Long.valueOf(j2), str, A042);
        if (c8o != null) {
            this.A05.add(new WeakReference(c8o));
        }
    }

    public C8J(AnonymousClass0C1 r20, Integer num, int i, String str, C26808Bst bst, Integer num2, Integer num3, String str2, String str3, String str4, C27319C8o c8o) {
        Object[] objArr;
        String str5;
        AnonymousClass0C1 r0 = r20;
        this.A00 = r0;
        String A042 = r0.A04();
        this.A04 = AnonymousClass000.A0E(AGL.A00(num), A042);
        this.A02 = "";
        this.A01 = Constants.A0Y;
        this.A05 = new ArrayList();
        String str6 = str2;
        String str7 = null;
        String str8 = str;
        if (str3 == null || str4 == null) {
            objArr = new Object[9];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = 15;
            objArr[2] = str != null ? AnonymousClass000.A0J("\"", str8, "\"") : str7;
            objArr[3] = bst.name();
            objArr[4] = C8c.A01(num2);
            objArr[5] = C26809Bsu.A02(num3);
            objArr[6] = str2;
            objArr[7] = Boolean.valueOf(C27296C7m.A00(Constants.ONE).equals(str6));
            objArr[8] = A042;
            str5 = "{\"IgInsightsGridMediaImage_SIZE\":%d,\"count\":%d,\"cursor\":%s,\"dataOrdering\":\"%s\",\"postType\":\"%s\",\"timeframe\":\"%s\",\"search_base\":\"%s\",\"is_user\":\"%s\",\"queryParams\":{\"access_token\":\"\",\"id\":\"%s\"}}";
        } else {
            objArr = new Object[11];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = 15;
            objArr[2] = str != null ? AnonymousClass000.A0J("\"", str8, "\"") : str7;
            objArr[3] = bst.name();
            objArr[4] = C8c.A01(num2);
            objArr[5] = C26809Bsu.A02(num3);
            objArr[6] = str2;
            objArr[7] = str3;
            objArr[8] = str4;
            objArr[9] = Boolean.valueOf(C27296C7m.A00(Constants.ONE).equals(str6));
            objArr[10] = A042;
            str5 = "{\"IgInsightsGridMediaImage_SIZE\":%d,\"count\":%d,\"cursor\":%s,\"dataOrdering\":\"%s\",\"postType\":\"%s\",\"timeframe\":\"%s\",\"search_base\":\"%s\",\"promoteEligibility\":\"%s\",\"trackingCondition\":\"%s\",\"is_user\":\"%s\",\"queryParams\":{\"access_token\":\"\",\"id\":\"%s\"}}";
        }
        this.A03 = C06360Ot.formatString(str5, objArr);
        C27319C8o c8o2 = c8o;
        if (c8o != null) {
            this.A05.add(new WeakReference(c8o2));
        }
    }

    public C8J(AnonymousClass0C1 r16, Integer num, String str, Integer num2, String str2, String str3, String str4, C27319C8o c8o) {
        Object[] objArr;
        String str5;
        AnonymousClass0C1 r0 = r16;
        this.A00 = r0;
        String A042 = r0.A04();
        this.A04 = AnonymousClass000.A0E(AGL.A00(num), A042);
        this.A02 = "";
        this.A01 = Constants.A0j;
        this.A05 = new ArrayList();
        String str6 = null;
        String str7 = str4;
        String str8 = str;
        if (str2 == null || str3 == null) {
            objArr = new Object[6];
            objArr[0] = 15;
            objArr[1] = str != null ? AnonymousClass000.A0J("\"", str8, "\"") : str6;
            objArr[2] = C26809Bsu.A02(num2);
            objArr[3] = str4;
            objArr[4] = Boolean.valueOf(C27296C7m.A00(Constants.ONE).equals(str7));
            objArr[5] = A042;
            str5 = "{\"count\":%d,\"cursor\":%s,\"timeframe\":\"%s\",\"search_base\":\"%s\",\"is_user\":\"%s\",\"queryParams\":{\"access_token\":\"\",\"id\":\"%s\"}}";
        } else {
            objArr = new Object[8];
            objArr[0] = 15;
            objArr[1] = str != null ? AnonymousClass000.A0J("\"", str8, "\"") : str6;
            objArr[2] = C26809Bsu.A02(num2);
            objArr[3] = str4;
            objArr[4] = str2;
            objArr[5] = str3;
            objArr[6] = Boolean.valueOf(C27296C7m.A00(Constants.ONE).equals(str7));
            objArr[7] = A042;
            str5 = "{\"count\":%d,\"cursor\":%s,\"timeframe\":\"%s\",\"searchBase\":\"%s\",\"promoteEligibility\":\"%s\",\"trackingCondition\":\"%s\",\"is_user\":\"%s\",\"queryParams\":{\"access_token\":\"\",\"id\":\"%s\"}}";
        }
        this.A03 = C06360Ot.formatString(str5, objArr);
        C27319C8o c8o2 = c8o;
        if (c8o != null) {
            this.A05.add(new WeakReference(c8o2));
        }
    }

    public C8J(AnonymousClass0C1 r6, Integer num, boolean z, boolean z2, boolean z3, C27319C8o c8o) {
        this.A00 = r6;
        String A042 = r6.A04();
        this.A04 = AnonymousClass000.A0E(AGL.A00(num), A042);
        this.A02 = "";
        this.A01 = num;
        this.A03 = C06360Ot.formatString("{\"IgInsightsGridMediaImage_SIZE\":%d,\"activityTab\":\"%s\",\"audienceTab\":\"%s\",\"contentTab\":\"%s\",\"query_params\":{\"access_token\":\"%s\",\"id\":\"%s\"}}", 360, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), "", A042);
        ArrayList arrayList = new ArrayList();
        this.A05 = arrayList;
        if (c8o != null) {
            arrayList.add(new WeakReference(c8o));
        }
    }

    public C8J(AnonymousClass0C1 r5, String str, Integer num, C27319C8o c8o) {
        Object[] objArr;
        String str2;
        this.A00 = r5;
        this.A04 = AnonymousClass000.A0E(AGL.A00(num), str);
        this.A02 = str;
        this.A01 = num;
        if (num == Constants.A0N) {
            objArr = new Object[]{str};
            str2 = "{\"query_params\":{\"id\":\"%s\"}}";
        } else {
            objArr = new Object[]{"", str};
            str2 = "{\"query_params\":{\"access_token\":\"%s\",\"id\":\"%s\"}}";
        }
        this.A03 = C06360Ot.formatString(str2, objArr);
        ArrayList arrayList = new ArrayList();
        this.A05 = arrayList;
        if (c8o != null) {
            arrayList.add(new WeakReference(c8o));
        }
    }

    public C8J(AnonymousClass0C1 r4, String str, Integer num, String str2, C27319C8o c8o) {
        String str3;
        this.A00 = r4;
        this.A04 = AnonymousClass000.A0E(AGL.A00(num), str);
        this.A02 = str;
        this.A01 = num;
        Object[] objArr = new Object[2];
        if (str2 != null) {
            str3 = AnonymousClass000.A0J("\"", str2, "\"");
        } else {
            str3 = null;
        }
        objArr[0] = str3;
        objArr[1] = str;
        this.A03 = C06360Ot.formatString("{\"cursor\":%s,\"query_params\":{\"id\":\"%s\"}}", objArr);
        ArrayList arrayList = new ArrayList();
        this.A05 = arrayList;
        if (c8o != null) {
            arrayList.add(new WeakReference(c8o));
        }
    }

    public C8J(AnonymousClass0C1 r6, String str, Integer num, String str2, String str3, C27319C8o c8o) {
        this.A00 = r6;
        this.A04 = AnonymousClass000.A0E(AGL.A00(num), str);
        this.A02 = str;
        this.A01 = num;
        Object[] objArr = new Object[3];
        objArr[0] = str2 != null ? AnonymousClass000.A0J("\"", str2, "\"") : null;
        objArr[1] = AnonymousClass000.A0J("\"", "15", "\"");
        objArr[2] = str;
        this.A03 = C06360Ot.formatString("{\"cursor\":%s,\"limit\":%s,\"query_params\":{\"id\":\"%s\"}}", objArr);
        ArrayList arrayList = new ArrayList();
        this.A05 = arrayList;
        if (c8o != null) {
            arrayList.add(new WeakReference(c8o));
        }
    }
}
