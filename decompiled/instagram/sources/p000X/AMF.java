package p000X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.C0003R;
import java.util.HashMap;

/* renamed from: X.AMF */
public final class AMF implements C23513APj, C23381AKg, C23389AKo {
    public int A00;
    public AMH A01;
    public ALB A02;
    public C23467ANo A03;
    public C23467ANo A04;
    public String A05;
    public HashMap A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Handler A0A;
    public final ViewGroup A0B;
    public final C27341Hl A0C;
    public final AnonymousClass0C1 A0D;
    public final AnonymousClass79M A0E;
    public final AKU A0F;
    public final AK9 A0G;
    public final AMD A0H;
    public final C23442AMp A0I = new C23451AMy(this);
    public final C30484Dd9 A0J = new C23477ANz(this);
    public final AND A0K = new C23437AMk(this);
    public final C23430AMd A0L = new C23475ANx(this);

    public final void AxN(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0056, code lost:
        if (r37 != false) goto L_0x0058;
     */
    public AMF(ViewGroup viewGroup, C27341Hl r29, AnonymousClass0C1 r30, C13300iJ r31, boolean z, AnonymousClass3Dj r33, AKU aku, AnonymousClass79M r35, boolean z2, boolean z3) {
        C27341Hl r5 = r29;
        this.A0C = r5;
        AnonymousClass0C1 r6 = r30;
        this.A0D = r6;
        ViewGroup viewGroup2 = viewGroup;
        this.A0B = viewGroup2;
        AKU aku2 = aku;
        this.A0F = aku2;
        AnonymousClass79M r0 = r35;
        this.A0E = r0;
        boolean z4 = z2;
        this.A07 = z4;
        AK8 ak8 = new AK8();
        ak8.A00 = this;
        AnonymousClass3Dj r8 = r33;
        C13300iJ r3 = r31;
        this.A0G = new AK9(r3, viewGroup2, r5, r6, ak8, r8, this, this, aku2, z4);
        boolean z5 = this.A0F.A06(1) ? true : z5;
        z5 = false;
        this.A0H = AMD.A00(viewGroup2, r5, r6, r3, this.A0G, r8, aku2, new C23444AMr(true, true, z, false, z5, z3 ^ true, true), C0003R.layout.iglive_broadcaster_buttons_container, (C23334AIl) null, this.A07);
        this.A0G.A01 = r0;
        this.A0A = new Handler(Looper.getMainLooper());
        AMD amd = this.A0H;
        amd.A0K.A03 = this.A0L;
        amd.A06 = this.A0I;
        amd.A0H.A00 = this.A0J;
        amd.A07 = this.A0K;
        if (this.A0F.A06(1)) {
            C27341Hl r02 = this.A0C;
            this.A01 = new AMH(r02.getContext(), this.A0D, AnonymousClass1L8.A00(r02), this);
        }
    }

    public final void A00() {
        if (this.A09) {
            C23346AIx aIx = this.A0G.A07;
            AKZ akz = aIx.A01;
            if (akz != null) {
                aIx.A03(akz);
            }
            aIx.A01 = null;
            View view = this.A0H.A0K.A05.A04;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public final void A01() {
        if (this.A09) {
            this.A0H.A05();
            this.A09 = false;
            AnonymousClass0ZA.A07(this.A0A, (Object) null);
            AMH amh = this.A01;
            if (amh != null && amh.A04) {
                amh.A04 = false;
                AnonymousClass0ZA.A07(amh.A03, (Object) null);
                amh.A03 = null;
            }
        }
    }

    public final void A02(boolean z) {
        AMD amd = this.A0H;
        EditText editText = amd.A0K.A07.A06;
        String trim = editText.getText().toString().trim();
        editText.clearFocus();
        editText.setText(trim);
        View view = amd.A0K.A07.A04;
        float f = 0.4f;
        if (z) {
            f = 1.0f;
        }
        view.setAlpha(f);
        View view2 = amd.A0K.A05.A02;
        if (view2 != null) {
            view2.setEnabled(z);
        }
    }

    public final void Acc() {
        this.A0H.A03();
    }

    public final void AxF(AKO ako) {
        C23467ANo aNo = this.A03;
        if (aNo != null) {
            aNo.A08(ako);
        }
    }

    public final void AxQ(String str) {
        C23467ANo aNo = this.A03;
        if (aNo != null) {
            AMD amd = aNo.A09.A0H;
            C23393AKs aKs = amd.A0H;
            AnonymousClass0P4 A002 = aKs.A00("wave", amd.A0G.getId(), amd.A09);
            A002.A0G(AnonymousClass0C5.$const$string(378), str);
            AnonymousClass0WN.A01(aKs.A02).BcG(A002);
        }
    }

    public final void B8f(int i) {
        this.A0H.A06(i);
    }

    public final boolean BKI() {
        return this.A0H.A0K();
    }

    public final boolean BKJ() {
        return this.A0H.A0L();
    }

    public final boolean BKK() {
        return this.A0H.A0M();
    }

    public final void BU5() {
        C23467ANo aNo = this.A03;
        if (aNo != null) {
            aNo.A0E.A04(Constants.ZERO, aNo.A05.A0B);
            AnonymousClass79M r2 = aNo.A05.A0b;
            AnonymousClass0WN.A01(r2.A0N).BcG(AnonymousClass79M.A00(r2, Constants.A0B));
        }
    }

    public final void Blq(boolean z) {
        this.A0H.A0J(z, true);
    }
}
