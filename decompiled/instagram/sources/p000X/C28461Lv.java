package p000X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Lv  reason: invalid class name and case insensitive filesystem */
public final class C28461Lv implements C28401Lo {
    public final Context A00;
    public final C27371Ho A01;
    public final AnonymousClass0C1 A02;

    public final void BJ5(C15880ng r1, Throwable th, int i) {
    }

    public final void BJ7(C15880ng r1) {
    }

    public final void BJB() {
    }

    public final void BJK(C15880ng r1) {
    }

    public final void BJS(C15880ng r1, C28661Mp r2, boolean z) {
    }

    public final void BP6() {
    }

    public C28461Lv(Context context, AnonymousClass0C1 r2, C27371Ho r3) {
        this.A00 = context;
        this.A02 = r2;
        this.A01 = r3;
    }

    public final void BJX(C15880ng r13, C28661Mp r14) {
        boolean z;
        String str;
        C43411uN r9;
        C43411uN r2;
        String str2;
        AnonymousClass1UP A002;
        Iterator it = r14.A01().iterator();
        AnonymousClass1NJ r10 = null;
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass1NG r1 = (AnonymousClass1NG) it.next();
            if (r1.A0H == C29261Pf.MEDIA) {
                AnonymousClass1NJ A05 = r1.A05();
                if (A05 != null) {
                    if (A05.Aho()) {
                        AnonymousClass0RU A012 = AnonymousClass0WN.A01(this.A02);
                        C27371Ho r5 = this.A01;
                        C37111j8 r7 = new C37111j8(this.A02, A05);
                        r7.A00 = A05.A06();
                        C36901in.A0D(A012, "delivery", r5, A05, r7, (Integer) null);
                        Context context = this.A00;
                        if (!(context == null || (A002 = C37201jH.A00(A05, 0, context)) == null)) {
                            AnonymousClass1UR r22 = A002.A00;
                            if (r22 == AnonymousClass1UR.AD_DESTINATION_CANVAS) {
                                AnonymousClass2CP r3 = new AnonymousClass2CP(A002.A03, C30671Ut.A02(this.A02, A05));
                                r3.A00 = C06220Of.A08(this.A00);
                                r3.A01 = C06220Of.A09(this.A00);
                                r3.A03 = this.A02;
                                new AnonymousClass2CQ(r3).A00();
                            } else if (r22 == AnonymousClass1UR.AD_DESTINATION_LEAD_AD) {
                                AnonymousClass25N r32 = new AnonymousClass25N(A002.A05, this.A02);
                                r32.A01 = A05.AYw();
                                AnonymousClass25P.A00(new AnonymousClass25O(r32));
                            }
                        }
                        AnonymousClass0C1 r23 = this.A02;
                        C27371Ho r52 = this.A01;
                        if (C36791ic.A00(r23).A04(A05)) {
                            str2 = "INSTAGRAM_MEDIA_WAS_HIDDEN";
                        } else if (C17050pb.A06(A05)) {
                            str2 = "already_installed";
                        } else {
                            str2 = null;
                        }
                        boolean z2 = false;
                        if (str2 != null) {
                            z2 = true;
                        }
                        if (z2) {
                            AnonymousClass0RU A013 = AnonymousClass0WN.A01(r23);
                            C37111j8 r92 = new C37111j8(r23, A05);
                            r92.A00 = A05.A06();
                            C36901in.A0B(A013, r52, A05, str2, (List) null, r92);
                        }
                        if (r10 == null && r13.A00()) {
                            r10 = A05;
                        }
                    }
                }
            }
            AnonymousClass1NK r93 = r1.A0G;
            if (r93 instanceof C36321hr) {
                AnonymousClass0C1 r4 = this.A02;
                C27371Ho r72 = this.A01;
                String str3 = r13.A06;
                C29261Pf r8 = r1.A0H;
                C29261Pf r53 = C29261Pf.SUGGESTED_PRODUCERS;
                String str4 = null;
                if ((r8 == r53 || r8 == C29261Pf.SUGGESTED_PRODUCERS_V2) && (r2 = (C43411uN) r93) != null) {
                    if (r2.A0F != null) {
                        str4 = "preview";
                    } else if (r2.A0G != null) {
                        str4 = "profile";
                    }
                }
                if ((r8 == r53 || r8 == C29261Pf.SUGGESTED_PRODUCERS_V2) && (r9 = (C43411uN) r93) != null) {
                    str = r9.A08;
                } else {
                    str = null;
                }
                C06270Ok A003 = C06270Ok.A00();
                if (str != null) {
                    A003.A09("insertion_context", str);
                }
                if (str4 != null) {
                    A003.A09("format", str4);
                }
                C36321hr r24 = (C36321hr) r1.A0G;
                C37141jB A014 = C36901in.A01("instagram_netego_delivery", r72, (C37121j9) null);
                A014.A4c = str3;
                A014.A3y = r24.getId();
                A014.A40 = r24.AYw();
                A014.A07(A003);
                A014.A41 = r24.ALf().toString();
                A014.A3n = r1.A0X;
                C36901in.A03(AnonymousClass0WN.A01(r4), A014.A03(), Constants.ONE);
            }
        }
        if (r10 != null) {
            C16180oA A004 = C16180oA.A00(this.A02);
            String id = r10.getId();
            if (id.equals(A004.A00.getString("current_ad_id", (String) null)) && A004.A00.getBoolean("has_seen_current_ad", true)) {
                z = true;
            }
            A004.A00.edit().putString("current_ad_id", id).putBoolean("has_seen_current_ad", z).apply();
        }
    }
}
