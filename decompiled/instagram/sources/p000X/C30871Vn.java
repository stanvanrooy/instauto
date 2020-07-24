package p000X;

import java.util.ArrayList;

/* renamed from: X.1Vn  reason: invalid class name and case insensitive filesystem */
public final class C30871Vn implements C11200ea {
    public final /* synthetic */ C30841Vk A00;

    public C30871Vn(C30841Vk r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0Z0.A03(-1567861314);
        C34041du r6 = (C34041du) obj;
        int A032 = AnonymousClass0Z0.A03(1209313556);
        C36841ih APu = this.A00.A02.APu(r6.A00);
        switch (APu.A0D.ordinal()) {
            case 0:
                C29191Oy r2 = this.A00.A03;
                if (((String) r2.A02.get(r6.A00.A0K.AS8())) != null) {
                    APu.A0D = C36881il.Translated;
                } else {
                    AnonymousClass1NJ r0 = r6.A00;
                    ArrayList arrayList = new ArrayList();
                    AnonymousClass1NV A06 = r0.A3k.A06(r0.A0K);
                    if (A06 != null) {
                        for (instagramComment r1 : A06.A00) {
                            if (r1.A0f) {
                                arrayList.add(r1.AS8());
                            }
                        }
                    }
                    C30841Vk r02 = this.A00;
                    C12830hS r9 = (C12830hS) r02.A00;
                    C15890nh r22 = new C15890nh(r02.A04);
                    r22.A09 = Constants.A0N;
                    r22.A0C = "language/bulk_translate/";
                    r22.A06(C124925Ww.class, false);
                    if (!arrayList.isEmpty()) {
                        r22.A09("comment_ids", C36681iR.A00(',').A03(arrayList));
                    }
                    C17850qu A033 = r22.A03();
                    A033.A00 = new C124905Wu(this.A00, APu, r6.A00);
                    r9.schedule(A033);
                }
                C30841Vk r03 = this.A00;
                AnonymousClass0C1 r92 = r03.A04;
                AnonymousClass1I6 r11 = r03.A05;
                AnonymousClass1NJ r12 = r6.A00;
                C27371Ho r13 = r03.A01;
                int AHt = APu.AHt();
                if (APu.A0R()) {
                    i = APu.getPosition();
                } else {
                    i = -1;
                }
                C36901in.A0L(r92, "see_translation", r11, r12, r13, AHt, Integer.valueOf(i), (Integer) null);
                break;
            case 1:
                APu.A0D = C36881il.Original;
                break;
        }
        this.A00.A02.AqE(r6.A00);
        AnonymousClass0Z0.A0A(-1113727110, A032);
        AnonymousClass0Z0.A0A(-56026922, A03);
    }
}
