package p000X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Uv  reason: invalid class name and case insensitive filesystem */
public final class C30691Uv {
    public int A00;
    public AnonymousClass1LO A01;
    public AnonymousClass1US A02;
    public C28051Kf A03;
    public AnonymousClass1S3 A04;
    public C30281Tf A05;
    public AnonymousClass1U2 A06;
    public AnonymousClass30N A07;
    public C30701Uw A08;
    public AnonymousClass1RA A09;
    public AnonymousClass1RD A0A;
    public AnonymousClass1RJ A0B;
    public AnonymousClass1ST A0C;
    public C29881Rq A0D;
    public C29791Rg A0E;
    public AnonymousClass1I6 A0F;
    public C29851Rn A0G;
    public String A0H;
    public List A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = true;
    public AnonymousClass0C1 A0M;
    public C13300iJ A0N;
    public final Context A0O;
    public final AnonymousClass1HD A0P;
    public final AnonymousClass1AM A0Q;
    public final AnonymousClass1PK A0R;
    public final C27371Ho A0S;

    public final AnonymousClass1VH A00() {
        AnonymousClass1LO r14;
        AnonymousClass1LO r11;
        String str;
        C256419q r1 = null;
        if (this.A0B == null) {
            Context context = this.A0O;
            AnonymousClass0C1 r5 = this.A0M;
            C27371Ho r6 = this.A0S;
            AnonymousClass1PK r7 = this.A0R;
            AnonymousClass1I6 r2 = this.A0F;
            if (r2 != null) {
                str = r2.AVo();
            } else {
                str = null;
            }
            this.A0B = new AnonymousClass1RJ(context, r5, r6, r7, str);
        }
        if (this.A0E == null) {
            this.A0E = new C29791Rg(this.A0M, this.A0P.getActivity(), this.A0R, this.A0S);
        }
        if (this.A0G == null) {
            this.A0G = new C29851Rn(this.A0P.getActivity(), this.A0M, this.A0R, this.A0B);
        }
        if (this.A04 == null) {
            Context context2 = this.A0O;
            AnonymousClass0C1 r8 = this.A0M;
            C27371Ho r9 = this.A0S;
            AnonymousClass1PK r10 = this.A0R;
            if (this.A0J) {
                r11 = null;
            } else {
                r11 = this.A01;
            }
            this.A04 = new AnonymousClass1S3(this.A0P, this.A0S, this.A0R, new AnonymousClass1S2(context2, r8, r9, (AnonymousClass1PL) r10, r11, this.A0F));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.A04);
        List<AnonymousClass1S4> list = this.A0I;
        if (list != null) {
            for (AnonymousClass1S4 add : list) {
                arrayList.add(add);
            }
        }
        AnonymousClass1LO r4 = this.A01;
        if (r4 != null) {
            ((AnonymousClass1HH) this.A0P).registerLifecycleListener(r4);
        }
        if (this.A0A == null) {
            this.A0A = new AnonymousClass1RD(this.A0P.getActivity(), new AnonymousClass1RH(this.A0M));
        }
        if (this.A0D == null) {
            AnonymousClass1HD r42 = this.A0P;
            if (!(r42 instanceof C26301Cs) || ((C26301Cs) r42).AXg() != 0) {
                this.A0D = new C68072yO();
            } else {
                AnonymousClass1HD r52 = this.A0P;
                this.A0D = new C29871Rp(r52, (AnonymousClass1D7) ((AnonymousClass1HJ) r52).getRootActivity(), this.A0M);
            }
        }
        if (this.A06 == null) {
            this.A06 = new AnonymousClass1UV(this.A0P, this.A0Q, this.A0F, this.A0S, this.A0M, this.A0D);
        }
        if (this.A02 == null) {
            this.A02 = new AnonymousClass1US(this.A0P.getActivity(), this.A0M);
        }
        if (this.A05 == null) {
            if (this.A03 == null || this.A0C == null) {
                AnonymousClass1HD r53 = this.A0P;
                C28051Kf A002 = C28021Kc.A00();
                ((AnonymousClass1HH) r53).registerLifecycleListener(new AnonymousClass9j9(A002, r53));
                this.A03 = A002;
                Context context3 = this.A0O;
                AnonymousClass1HH r62 = (AnonymousClass1HH) this.A0P;
                AnonymousClass0C1 r54 = this.A0M;
                C27371Ho r112 = this.A0S;
                AnonymousClass1I6 r102 = this.A0F;
                C17070pd r13 = C17070pd.NOT_SET;
                if (this.A0J) {
                    r14 = this.A01;
                } else {
                    r14 = null;
                }
                this.A0C = new AnonymousClass1ST(r54, r62, A002, AnonymousClass1SU.A00(context3, r54, r102, r112, new C29951Rx(r54, r102), r13, r14));
            }
            AnonymousClass1HD r41 = this.A0P;
            AnonymousClass1AM r40 = this.A0Q;
            C27371Ho r39 = this.A0S;
            AnonymousClass1PK r38 = this.A0R;
            AnonymousClass1RJ r37 = this.A0B;
            AnonymousClass1S3 r18 = this.A04;
            AnonymousClass1RA r17 = this.A09;
            C29791Rg r16 = this.A0E;
            AnonymousClass0C1 r12 = this.A0M;
            AnonymousClass1I6 r15 = this.A0F;
            AnonymousClass1LO r142 = this.A01;
            C29851Rn r113 = this.A0G;
            AnonymousClass1HD r143 = r41;
            AnonymousClass1AM r152 = r40;
            C27371Ho r162 = r39;
            AnonymousClass1PK r172 = r38;
            AnonymousClass1RJ r182 = r37;
            this.A05 = new C30271Te(r143, r152, r162, r172, r182, r18, r17, r16, r12, r15, r142, r113, this.A0A, this.A06, this.A02, C29181Ox.A00(this.A0O, r12), this.A0K, this.A07, this.A03, this.A0C, (String) null, this.A0H, (AnonymousClass1LY) null);
        }
        if (this.A0L) {
            int i = this.A00;
            if (i > 0) {
                r1 = new C256419q(this.A0P.getActivity(), this.A0M, this.A0S, i);
            } else {
                r1 = new C256419q(this.A0P.getActivity(), this.A0M, this.A0S);
            }
        }
        AnonymousClass0C1 r114 = this.A0M;
        AnonymousClass1HD r122 = this.A0P;
        AnonymousClass1PK r132 = this.A0R;
        C27371Ho r144 = this.A0S;
        return new AnonymousClass1VH(r114, r122, r132, r144, this.A0B, this.A04, arrayList, this.A09, this.A0E, this.A0G, this.A0D, this.A08, this.A05, r144, C29191Oy.A02(r114), r1, this.A0F);
    }

    public C30691Uv(Context context, AnonymousClass1HD r3, AnonymousClass1AM r4, AnonymousClass1PK r5, C27371Ho r6, AnonymousClass0C1 r7) {
        this.A0O = context;
        this.A0P = r3;
        this.A0Q = r4;
        this.A0R = r5;
        this.A0S = r6;
        this.A0M = r7;
        this.A0N = r7.A06;
    }
}
