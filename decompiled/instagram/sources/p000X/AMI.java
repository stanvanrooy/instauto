package p000X;

import android.view.ViewGroup;
import com.facebook.C0003R;

/* renamed from: X.AMI */
public final class AMI implements C23513APj, C23389AKo {
    public String A00;
    public final AnonymousClass0C1 A01;
    public final ANI A02;
    public final AMD A03;
    public final AK9 A04;
    public final C30484Dd9 A05 = new AMK(this);
    public final AND A06 = new C23449AMw(this);
    public final C23430AMd A07 = new AO3(this);

    public AMI(ViewGroup viewGroup, C27341Hl r27, AnonymousClass0C1 r28, C13300iJ r29, boolean z, ANI ani, AnonymousClass3Dj r32, C23381AKg aKg, AKU aku) {
        AnonymousClass0C1 r4 = r28;
        this.A01 = r4;
        this.A02 = ani;
        AnonymousClass3Dj r6 = r32;
        ViewGroup viewGroup2 = viewGroup;
        AKU aku2 = aku;
        C27341Hl r3 = r27;
        C13300iJ r1 = r29;
        AK9 ak9 = new AK9(r1, viewGroup2, r3, r4, new AK8(), r6, aKg, this, aku2, false);
        this.A04 = ak9;
        AMD A002 = AMD.A00(viewGroup2, r3, r4, r1, ak9, r6, aku2, new C23444AMr(false, true, z, false, false, false, false), C0003R.layout.iglive_broadcaster_buttons_container, (C23334AIl) null, false);
        this.A03 = A002;
        A002.A0K.A03 = this.A07;
        A002.A0H.A00 = this.A05;
        A002.A07 = this.A06;
    }

    public final void Acc() {
        this.A03.A03();
    }

    public final void AxN(boolean z) {
        this.A03.A0D(z);
    }

    public final void B8f(int i) {
        this.A03.A06(i);
    }

    public final boolean BKI() {
        return this.A03.A0K();
    }

    public final boolean BKJ() {
        return this.A03.A0L();
    }

    public final boolean BKK() {
        return this.A03.A0M();
    }

    public final void Blq(boolean z) {
        this.A03.A0J(z, true);
    }
}
