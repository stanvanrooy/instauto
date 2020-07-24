package p000X;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.1Ln  reason: invalid class name and case insensitive filesystem */
public final class C28391Ln implements C28401Lo {
    public final Set A00;

    public final void BJ5(C15880ng r3, Throwable th, int i) {
        for (C28401Lo BJ5 : this.A00) {
            BJ5.BJ5(r3, th, i);
        }
    }

    public final void BJ7(C15880ng r3) {
        for (C28401Lo BJ7 : this.A00) {
            BJ7.BJ7(r3);
        }
    }

    public final void BJB() {
        for (C28401Lo BJB : this.A00) {
            BJB.BJB();
        }
    }

    public final void BJK(C15880ng r3) {
        for (C28401Lo BJK : this.A00) {
            BJK.BJK(r3);
        }
    }

    public final void BJS(C15880ng r3, C28661Mp r4, boolean z) {
        for (C28401Lo BJS : this.A00) {
            BJS.BJS(r3, r4, z);
        }
    }

    public final void BJX(C15880ng r3, C28661Mp r4) {
        for (C28401Lo BJX : this.A00) {
            BJX.BJX(r3, r4);
        }
    }

    public final void BP6() {
        for (C28401Lo BP6 : this.A00) {
            BP6.BP6();
        }
    }

    public C28391Ln(AnonymousClass0C1 r11, C27641Iq r12, Context context, AnonymousClass1L8 r14, C27371Ho r15, AnonymousClass1IE r16, AnonymousClass1I6 r17) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A00 = linkedHashSet;
        linkedHashSet.add(new AnonymousClass1Lp());
        AnonymousClass0C1 r6 = r11;
        this.A00.add(new C28411Lq(r11, new C11060eM(), r12));
        this.A00.add(new C28421Lr(r12));
        this.A00.add(new C28431Ls(AnonymousClass00B.A01));
        Class<AnonymousClass13M> cls = AnonymousClass13M.class;
        AnonymousClass13M r3 = (AnonymousClass13M) r11.AV9(cls);
        if (r3 == null) {
            r3 = new AnonymousClass13M(r11);
            r11.BYi(cls, r3);
        }
        this.A00.add(new C28441Lt(C06190Oc.A00, r3));
        this.A00.add(new C28451Lu(r11));
        Context context2 = context;
        C27371Ho r7 = r15;
        this.A00.add(new C28461Lv(context, r11, r15));
        if (((Boolean) AnonymousClass0L6.A02(r11, AnonymousClass0L7.IGTV_ADS_LAUNCHER_V2, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            this.A00.add(new C28471Lw(context2, r14, r6, r7, r16, r17));
        }
    }
}
