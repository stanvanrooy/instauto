package p000X;

/* renamed from: X.1Vk  reason: invalid class name and case insensitive filesystem */
public final class C30841Vk extends C27291Hg {
    public final AnonymousClass1HD A00;
    public final C27371Ho A01;
    public final AnonymousClass1PM A02;
    public final C29191Oy A03;
    public final AnonymousClass0C1 A04;
    public final AnonymousClass1I6 A05;
    public final C23300zv A06;
    public final C11200ea A07 = new C30851Vl(this);
    public final C11200ea A08 = new C30861Vm(this);
    public final C11200ea A09 = new C30881Vo(this);
    public final C11200ea A0A = new C30871Vn(this);

    public static void A00(C30841Vk r11, AnonymousClass1NJ r12, Integer num) {
        String str;
        int i;
        AnonymousClass1NJ r6 = r12;
        C36841ih APu = r11.A02.APu(r12);
        Integer num2 = Constants.ZERO;
        boolean z = false;
        if (num == num2) {
            z = true;
        }
        APu.A0j = z;
        AnonymousClass0C1 r3 = r11.A04;
        if (num == num2) {
            str = "caption_more_click";
        } else {
            str = "caption_less_click";
        }
        C27371Ho r7 = r11.A01;
        int AHt = APu.AHt();
        if (APu.A0R()) {
            i = APu.getPosition();
        } else {
            i = -1;
        }
        C36901in.A0L(r3, str, (AnonymousClass1I6) null, r6, r7, AHt, Integer.valueOf(i), (Integer) null);
        r11.A02.AqE(r12);
    }

    public final void BE0() {
        C23300zv r2 = this.A06;
        r2.A03(C34021ds.class, this.A08);
        r2.A03(C34031dt.class, this.A07);
        r2.A03(C34041du.class, this.A0A);
        r2.A03(C34051dv.class, this.A09);
    }

    public final void BJx() {
        C23300zv r2 = this.A06;
        r2.A02(C34021ds.class, this.A08);
        r2.A02(C34031dt.class, this.A07);
        r2.A02(C34041du.class, this.A0A);
        r2.A02(C34051dv.class, this.A09);
    }

    public C30841Vk(AnonymousClass0C1 r2, AnonymousClass1PM r3, AnonymousClass1HD r4, C27371Ho r5, C29191Oy r6, AnonymousClass1I6 r7) {
        this.A04 = r2;
        this.A06 = C23300zv.A00(r2);
        this.A02 = r3;
        this.A00 = r4;
        this.A01 = r5;
        this.A03 = r6;
        this.A05 = r7;
    }
}
