package p000X;

import com.facebook.flipper.core.StateSummary;
import java.util.Set;

/* renamed from: X.ALY */
public final class ALY {
    public C27781Je A00;
    public C27781Je A01;
    public C27781Je A02;
    public C27781Je A03;
    public String A04;
    public Set A05;
    public Set A06;
    public final C23401ALa A07;
    public final AnonymousClass0C1 A08;

    public /* synthetic */ ALY(AnonymousClass0C1 r4, C27791Jf r5) {
        C23401ALa aLa = new C23401ALa(r4);
        C27691Iv A002 = C27691Iv.A00();
        C13150hy.A01(A002, StateSummary.$const$string(0));
        C13150hy.A02(r4, "userSession");
        C13150hy.A02(r5, StateSummary.$const$string(5));
        C13150hy.A02(aLa, "rtcApi");
        C13150hy.A02(A002, "uiSubscriber");
        this.A08 = r4;
        this.A07 = aLa;
        C219359cu r0 = C219359cu.A00;
        this.A06 = r0;
        this.A05 = r0;
        AnonymousClass2E5 A003 = AnonymousClass2E5.A00();
        C13150hy.A01(A003, "BehaviorRelay.create()");
        this.A00 = A003;
        AnonymousClass2E5 A004 = AnonymousClass2E5.A00();
        C13150hy.A01(A004, "BehaviorRelay.create()");
        this.A02 = A004;
        C27771Jd A005 = C27771Jd.A00();
        C13150hy.A01(A005, "PublishRelay.create()");
        this.A03 = A005;
        C27771Jd A006 = C27771Jd.A00();
        C13150hy.A01(A006, "PublishRelay.create()");
        this.A01 = A006;
        A002.A02(r5.A0D(ALZ.A00).A09(), new ALX(this));
    }
}
