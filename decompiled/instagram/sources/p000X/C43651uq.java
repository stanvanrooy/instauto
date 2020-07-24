package p000X;

import com.facebook.common.time.RealtimeSinceBootClock;

/* renamed from: X.1uq  reason: invalid class name and case insensitive filesystem */
public final class C43651uq {
    public long A00;
    public String A01;
    public String A02;
    public String A03;

    public final String A00() {
        String str;
        String str2;
        String A002 = C107244jp.A00(Constants.A0N);
        String str3 = this.A02;
        if (A002.equals(str3) || C107244jp.A00(Constants.A0Y).equals(str3)) {
            str = this.A03;
            str2 = "request-";
        } else if (C107244jp.A00(Constants.A0j).equals(str3) || C107244jp.A00(Constants.A0u).equals(str3)) {
            str = this.A03;
            str2 = "block-";
        } else if (C107244jp.A00(Constants.A12).equals(str3)) {
            str = this.A03;
            str2 = "remove-";
        } else {
            str = this.A03;
            str2 = "follow-";
        }
        return AnonymousClass000.A0E(str2, str);
    }

    public C43651uq() {
    }

    public C43651uq(String str, String str2, String str3) {
        this.A00 = RealtimeSinceBootClock.A00.now();
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
