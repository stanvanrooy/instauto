package p000X;

/* renamed from: X.0cX  reason: invalid class name and case insensitive filesystem */
public final class C10020cX implements AnonymousClass0UU {
    public AnonymousClass0UT A00;
    public final C10960eC A01;

    public final String AIF() {
        return "device_auth";
    }

    public final String AId() {
        return "";
    }

    public final synchronized AnonymousClass0UT AOR() {
        return this.A00;
    }

    public final synchronized boolean BsM(AnonymousClass0UT r5) {
        boolean z;
        if (!this.A00.equals(r5)) {
            C11000eG A002 = this.A01.A00(Constants.A0j).A00();
            A002.A00.putString("/settings/mqtt/id/connection_key", (String) r5.first);
            A002.A00.putString("/settings/mqtt/id/connection_secret", (String) r5.second);
            A002.A00.apply();
            this.A00 = r5;
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void clear() {
        BsM(AnonymousClass0UT.A00);
    }

    public C10020cX(C10960eC r6) {
        this.A01 = r6;
        C10980eE A002 = r6.A00(Constants.A0j);
        this.A00 = AnonymousClass0UT.A00(A002.A00.getString("/settings/mqtt/id/connection_key", ""), A002.A00.getString("/settings/mqtt/id/connection_secret", ""));
    }
}
