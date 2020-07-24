package p000X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1Jf  reason: invalid class name and case insensitive filesystem */
public class C27791Jf {
    public final C27821Ji A00;

    public static C27791Jf A01() {
        return new C27791Jf(AnonymousClass1J9.A00(AnonymousClass1K9.A00));
    }

    public static C27791Jf A02(C27791Jf r5, C27791Jf r6, C29069CrM crM) {
        C27821Ji r52 = r5.A00;
        C27821Ji r4 = r6.A00;
        C29068CrL crL = new C29068CrL(crM);
        AnonymousClass1J6.A01(r52, "source1 is null");
        AnonymousClass1J6.A01(r4, "source2 is null");
        AnonymousClass1J6.A01(crL, "f is null");
        return new C27791Jf(C27821Ji.A00(new C29067CrK(crL), C27861Jm.A00, r52, r4));
    }

    public static C27791Jf A03(C27791Jf r5, C27791Jf r6, C29069CrM crM) {
        C27821Ji r52 = r5.A00;
        C27821Ji r4 = r6.A00;
        C29068CrL crL = new C29068CrL(crM);
        AnonymousClass1J6.A01(r52, "source1 is null");
        AnonymousClass1J6.A01(r4, "source2 is null");
        AnonymousClass1J6.A01(crL, "f is null");
        return new C27791Jf(C27821Ji.A01(new C29067CrK(crL), C27861Jm.A00, r52, r4));
    }

    public static C27791Jf A04(C27791Jf r6, C27791Jf r7, C27791Jf r8, CLU clu) {
        C27821Ji r62 = r6.A00;
        C27821Ji r5 = r7.A00;
        C27821Ji r4 = r8.A00;
        CLS cls = new CLS(clu);
        AnonymousClass1J6.A01(r62, "source1 is null");
        AnonymousClass1J6.A01(r5, "source2 is null");
        AnonymousClass1J6.A01(r4, "source3 is null");
        AnonymousClass1J6.A01(cls, "f is null");
        return new C27791Jf(C27821Ji.A00(new CL8(cls), C27861Jm.A00, r62, r5, r4));
    }

    public static C27791Jf A05(C27791Jf r7, C27791Jf r8, C27791Jf r9, C27791Jf r10, C25010Ay2 ay2) {
        C27821Ji r72 = r7.A00;
        C27821Ji r6 = r8.A00;
        C27821Ji r5 = r9.A00;
        C27821Ji r4 = r10.A00;
        C25009Ay1 ay1 = new C25009Ay1(ay2);
        AnonymousClass1J6.A01(r72, "source1 is null");
        AnonymousClass1J6.A01(r6, "source2 is null");
        AnonymousClass1J6.A01(r5, "source3 is null");
        AnonymousClass1J6.A01(r4, "source4 is null");
        AnonymousClass1J6.A01(ay1, "f is null");
        return new C27791Jf(C27821Ji.A00(new C25008Ay0(ay1), C27861Jm.A00, r72, r6, r5, r4));
    }

    public static C27791Jf A06(C64502ra r2) {
        C64512rb r1 = new C64512rb(r2);
        AnonymousClass1J6.A01(r1, "source is null");
        return new C27791Jf(AnonymousClass1J9.A00(new AnonymousClass1KA(r1)));
    }

    public final C27791Jf A08() {
        C27821Ji r4 = this.A00;
        AnonymousClass1J6.A00(1, "bufferSize");
        DRW drw = new DRW();
        AtomicReference atomicReference = new AtomicReference();
        return new C27791Jf(AnonymousClass1J9.A00(new DR6(new AnonymousClass1K1(new C30110DQs(atomicReference, drw), r4, atomicReference, drw), DRU.A04)));
    }

    public final C27791Jf A09() {
        C27821Ji r4 = this.A00;
        C64602rk r2 = DRU.A08;
        AnonymousClass1J6.A01(r2, "keySelector is null");
        return new C27791Jf(AnonymousClass1J9.A00(new DR1(r4, r2, AnonymousClass1J6.A00)));
    }

    public final C27791Jf A0A() {
        return new C27791Jf(AnonymousClass1J9.A00(new AnonymousClass1KC(this.A00)));
    }

    public final C27791Jf A0B(long j, TimeUnit timeUnit, AnonymousClass1J1 r12) {
        AnonymousClass1J3 r7 = r12.A00;
        AnonymousClass1J6.A01(timeUnit, "unit is null");
        AnonymousClass1J6.A01(r7, "scheduler is null");
        return new C27791Jf(AnonymousClass1J9.A00(new AnonymousClass1KB(this.A00, j, timeUnit, r7)));
    }

    public final C27791Jf A0C(C64582ri r4) {
        return new C27791Jf(this.A00.A02(new C24710AsD(r4)));
    }

    public final C27791Jf A0D(C64582ri r5) {
        C27821Ji r3 = this.A00;
        C64592rj r1 = new C64592rj(r5);
        AnonymousClass1J6.A01(r1, "mapper is null");
        return new C27791Jf(AnonymousClass1J9.A00(new C64612rl(r3, r1)));
    }

    public final C27791Jf A0E(C64582ri r6) {
        C27821Ji r0;
        C27821Ji r4 = this.A00;
        C24711AsE asE = new C24711AsE(r6);
        int i = C27861Jm.A00;
        AnonymousClass1J6.A01(asE, "mapper is null");
        AnonymousClass1J6.A00(i, "bufferSize");
        if (r4 instanceof AnonymousClass1K4) {
            Object call = ((AnonymousClass1K4) r4).call();
            if (call == null) {
                r0 = AnonymousClass1K9.A00;
            } else {
                r0 = new AnonymousClass1K0(call, asE);
            }
        } else {
            r0 = new AnonymousClass1KD(r4, asE, i);
        }
        return new C27791Jf(AnonymousClass1J9.A00(r0));
    }

    public final C27791Jf A0F(C64542re r5) {
        C27821Ji r3 = this.A00;
        C64552rf r1 = new C64552rf(r5);
        AnonymousClass1J6.A01(r1, "predicate is null");
        return new C27791Jf(AnonymousClass1J9.A00(new C64562rg(r3, r1)));
    }

    public final C27791Jf A0G(AnonymousClass1J1 r5) {
        C27821Ji r3 = this.A00;
        AnonymousClass1J3 r2 = r5.A00;
        int i = C27861Jm.A00;
        AnonymousClass1J6.A01(r2, "scheduler is null");
        AnonymousClass1J6.A00(i, "bufferSize");
        return new C27791Jf(AnonymousClass1J9.A00(new C27871Jn(r3, r2, i)));
    }

    public final C27791Jf A0H(Object obj) {
        C27821Ji r3 = this.A00;
        AnonymousClass1J6.A01(obj, "item is null");
        AnonymousClass1J6.A01(obj, "The item is null");
        C27831Jj[] r2 = {AnonymousClass1J9.A00(new AnonymousClass1K3(obj)), r3};
        AnonymousClass1J6.A01(r2, "items is null");
        return new C27791Jf(AnonymousClass1J9.A00(new C30106DQo(AnonymousClass1J9.A00(new AnonymousClass1K8(r2)), DRU.A08, C27861Jm.A00, Constants.ONE)));
    }

    public C27791Jf(C27821Ji r1) {
        this.A00 = r1;
    }
}
