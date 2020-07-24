package p000X;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.instagram.nux.impl.OnboardingActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.0nl  reason: invalid class name and case insensitive filesystem */
public final class C15930nl extends C15940nm {
    public C53752Ue A00;

    private void A00(Context context, C06590Pq r18, boolean z, boolean z2, boolean z3, C134605oq r22, Integer num, Integer num2) {
        C128575eu r11 = new C128575eu();
        C134605oq r8 = r22;
        r11.A01 = r8;
        Integer num3 = num;
        r11.A02 = num3;
        C06590Pq r2 = r18;
        if (r2.AgN()) {
            r11.A00 = C05210Iq.A02(r2);
        }
        Context context2 = context;
        ArrayList arrayList = new ArrayList(C134625os.A00(context2, r2, r11, (C135345q4) null).A04.values());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C17850qu A002 = C134615or.A00(context2, r2, z, z2, C17200pq.A03(), z3, num2, r8, num3, arrayList);
        A002.A00 = new C134655ov(this, r11, context2, r2, elapsedRealtime);
        C12810hQ.A02(A002);
    }

    public static void A01(Context context, AnonymousClass0C1 r4) {
        Intent intent = new Intent().setClass(context, OnboardingActivity.class);
        intent.putExtra("IS_SIGN_UP_FLOW", true);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", r4.getToken());
        AnonymousClass1BH.A03(intent, context);
    }

    public final C53752Ue A03() {
        if (this.A00 == null) {
            this.A00 = new C53752Ue();
        }
        return this.A00;
    }

    public final void A04(Context context, C06590Pq r11, boolean z, boolean z2, boolean z3, C134605oq r15) {
        Context context2 = context;
        boolean z4 = z3;
        A00(context2, r11, z, z2, z4, r15, (Integer) null, Constants.ZERO);
    }

    public final void A05(Context context, C06590Pq r11, boolean z, boolean z2, boolean z3, C134605oq r15, Integer num) {
        C06590Pq r2 = r11;
        Context context2 = context;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        A00(context2, r2, z4, z5, z6, r15, num, Constants.ZERO);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r5 < r1) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        if (r5 < r1) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d9, code lost:
        if (r1 != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r1 == false) goto L_0x002f;
     */
    public final void A06(Context context, AnonymousClass0C1 r9) {
        int i;
        boolean z;
        C134865pH r1;
        boolean z2;
        boolean z3;
        boolean z4;
        C31181Wv r3 = new C31181Wv(r9);
        String string = r3.A00.A00.getString("remaining_nux_steps", (String) null);
        C135135pj r4 = null;
        if (string != null) {
            try {
                C13080hr A0A = C12890hY.A00.A0A(string);
                A0A.A0p();
                C135135pj parseFromJson = C135045pa.parseFromJson(A0A);
                boolean z5 = false;
                if (parseFromJson != null) {
                    Boolean bool = parseFromJson.A02;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        z2 = true;
                    }
                    z2 = false;
                    if (z2) {
                        int i2 = parseFromJson.A00;
                        int intValue = ((Integer) C05570Lc.A02(AnonymousClass0LZ.AAX, r3.A01)).intValue();
                        if (intValue != -1) {
                            z4 = false;
                        }
                        z4 = true;
                        if (z4 && ((Boolean) C05570Lc.A02(AnonymousClass0LZ.AAY, r3.A01)).booleanValue()) {
                            z5 = true;
                        }
                    } else {
                        int i3 = parseFromJson.A00;
                        int intValue2 = ((Integer) C05570Lc.A02(AnonymousClass0LZ.AAX, r3.A01)).intValue();
                        if (intValue2 != -1) {
                            z3 = false;
                        }
                        z3 = true;
                        if (z3 && ((Boolean) AnonymousClass0LZ.AAY.A01(r3.A01)).booleanValue()) {
                            z5 = true;
                        }
                        parseFromJson.A02 = true;
                    }
                    if (z5) {
                        parseFromJson.A00++;
                    }
                    r3.A00.A0S(C135045pa.A00(parseFromJson));
                }
                if (z5) {
                    r4 = parseFromJson;
                }
            } catch (IOException unused) {
            }
        }
        if (r4 != null) {
            C128575eu r2 = new C128575eu();
            r2.A00 = r9;
            r2.A01 = r4.A01;
            C134625os A002 = C134625os.A00(context, r9, r2, new C135265pw(this, r3));
            List list = r4.A04;
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            C134835pE r12 = new C134835pE(r2, list);
            Integer num = r4.A03;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            A002.A01 = r12;
            List A02 = r12.A02();
            if (A02 != null) {
                boolean isEmpty = A02.isEmpty();
                z = false;
            }
            z = true;
            if (!z) {
                C134635ot r22 = A002.A01;
                if (i < r22.A01.size()) {
                    r1 = (C134865pH) r22.A01.get(i);
                    r22.A00 = i;
                } else {
                    r1 = null;
                    r22.A00 = r22.A01.size();
                }
                A002.A00 = r1;
                while (true) {
                    C134865pH r13 = A002.A00;
                    if (r13 == null || !A002.A04.containsKey(r13)) {
                        break;
                    }
                    A002.A00 = A002.A01.A00();
                }
            } else {
                A002.A04();
                A002.A00 = null;
                Set<C135345q4> set = A002.A03;
                A002.A03 = new HashSet();
                for (C135345q4 B4s : set) {
                    B4s.B4s();
                }
            }
            A01(context, r9);
        }
    }

    public final void A07(Context context, AnonymousClass0C1 r9, C134605oq r10, C135345q4 r11) {
        Context context2 = context;
        C134605oq r3 = r10;
        A08(context2, r9, r3, (Integer) null, r11, Constants.ZERO);
    }

    public final void A08(Context context, AnonymousClass0C1 r14, C134605oq r15, Integer num, C135345q4 r17, Integer num2) {
        C128575eu r1 = new C128575eu();
        AnonymousClass0C1 r5 = r14;
        r1.A00 = r14;
        C134605oq r9 = r15;
        r1.A01 = r15;
        Integer num3 = num;
        r1.A02 = num3;
        Context context2 = context;
        Integer num4 = num2;
        if (num4 != Constants.ONE) {
            A00(context2, r5, false, r1.AfO(), true, r9, num3, Constants.ONE);
        }
        C134625os.A01(context.getApplicationContext(), r14, r1, r17, num4);
        A01(context, r14);
    }
}
