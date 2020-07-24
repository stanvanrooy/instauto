package p000X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.1Lw  reason: invalid class name and case insensitive filesystem */
public final class C28471Lw implements C27371Ho, C28401Lo {
    public final C28511Ma A00;
    public final AnonymousClass1MV A01;
    public final C28491Ly A02;

    public final boolean Ago() {
        return false;
    }

    public final boolean Ahq() {
        return true;
    }

    public final void BJ5(C15880ng r1, Throwable th, int i) {
    }

    public final void BJ7(C15880ng r1) {
    }

    public final void BJB() {
    }

    public final void BJK(C15880ng r1) {
    }

    public final void BJX(C15880ng r1, C28661Mp r2) {
    }

    public C28471Lw(Context context, AnonymousClass1L8 r29, AnonymousClass0C1 r30, AnonymousClass0RN r31, AnonymousClass1IE r32, AnonymousClass1I6 r33) {
        AnonymousClass0C1 r2 = r30;
        Context context2 = context;
        AnonymousClass0RN r20 = r31;
        if (((Boolean) AnonymousClass0L6.A02(r2, AnonymousClass0L7.IGTV_ADS_LAUNCHER_V2, "media_prefetch_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            this.A02 = new C28481Lx(this, context2, r32, r2, r20);
        } else {
            this.A02 = new AnonymousClass5V7();
        }
        C28491Ly r3 = this.A02;
        C28501Lz r14 = new C28501Lz(0, 0, Collections.emptyList());
        AnonymousClass1M0.A00(r2);
        AnonymousClass1M2 r11 = new AnonymousClass1M2();
        AnonymousClass1M4 r5 = new AnonymousClass1M4(r2, this);
        AnonymousClass1M6 r8 = new AnonymousClass1M6();
        AnonymousClass1MD A012 = AnonymousClass1M0.A00(r2).A01(AnonymousClass1M8.A00, r2);
        HashSet hashSet = new HashSet();
        AnonymousClass1MF r16 = AnonymousClass1MF.A00;
        AnonymousClass0a4.A06(hashSet);
        AnonymousClass1MH r6 = new AnonymousClass1MH(r2, this);
        AnonymousClass1MD r26 = A012;
        AnonymousClass1MJ r21 = new AnonymousClass1MJ(r2, r11, r5, r8, r26);
        Context context3 = context2;
        AnonymousClass1MM r212 = new AnonymousClass1MM(context3, r29, r2, r33, r26);
        AnonymousClass1MR r13 = new AnonymousClass1MR();
        AnonymousClass1MT r12 = new AnonymousClass1MT();
        AnonymousClass0a4.A06(r3);
        hashSet.add(r3);
        AnonymousClass1M0 A002 = AnonymousClass1M0.A00(r2);
        Class cls = AnonymousClass1M8.A00;
        AnonymousClass0a4.A06(r6);
        AnonymousClass0a4.A06(r21);
        AnonymousClass0a4.A06(r8);
        AnonymousClass0a4.A06(r212);
        AnonymousClass0a4.A06(A012);
        AnonymousClass0a4.A06(r11);
        AnonymousClass0a4.A06(r12);
        AnonymousClass0a4.A06(r13);
        AnonymousClass0a4.A06(r14);
        AnonymousClass0a4.A06(r16);
        AnonymousClass0a4.A06(A002);
        AnonymousClass0a4.A06(cls);
        this.A01 = new AnonymousClass1MV(r6, r21, r8, r212, A012, r11, r12, r13, r14, hashSet, r16, cls, A002);
        this.A00 = C28511Ma.A00(r20);
    }

    public final void BJS(C15880ng r5, C28661Mp r6, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass1NG A05 : r6.A01()) {
            AnonymousClass1NJ A052 = A05.A05();
            if (A052 != null && A052.A1a() && A052.A3a) {
                arrayList.add(A052.getId());
            }
        }
        C28501Lz r2 = new C28501Lz(0, 0, arrayList);
        AnonymousClass1MV r0 = this.A01;
        r0.A05.Aov(r2, r5.A00());
    }

    public final void BP6() {
        AnonymousClass1MV r0 = this.A01;
        r0.A0C.remove(this.A02);
        this.A01.A02();
    }

    public final String getModuleName() {
        return this.A00.A01();
    }
}
