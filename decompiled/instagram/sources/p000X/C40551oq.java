package p000X;

/* renamed from: X.1oq  reason: invalid class name and case insensitive filesystem */
public final class C40551oq extends C40361oX implements C40391oa {
    public AnonymousClass1NJ A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final long A00() {
        C39401mr r0;
        if (this.A01 == Constants.ONE) {
            r0 = C39401mr.CHANNEL;
        } else {
            r0 = C39401mr.MEDIA;
        }
        return r0.getValue().longValue();
    }

    public final AnonymousClass1NJ APe() {
        return this.A00;
    }

    public final boolean AeL() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ Object Apn(AnonymousClass1NJ r9) {
        return new C40551oq(this.A00, r9.getId(), r9, this.A01, this.A03, this.A02, this.A04);
    }

    public final void Bbr(AnonymousClass1NJ r4) {
        boolean z = false;
        if (this.A01 != Constants.ZERO) {
            z = true;
        }
        AnonymousClass0a4.A0A(z);
        this.A00 = r4;
    }

    public final boolean Bqw() {
        if (this.A01 == Constants.ONE) {
            return true;
        }
        return false;
    }

    public C40551oq(C40331oU r1, String str, AnonymousClass1NJ r3, Integer num, String str2, String str3, boolean z) {
        super(str, r1);
        this.A00 = r3;
        this.A01 = num;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = z;
    }

    public final String getId() {
        return getKey();
    }
}
