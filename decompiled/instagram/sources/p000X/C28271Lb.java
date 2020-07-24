package p000X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.1Lb  reason: invalid class name and case insensitive filesystem */
public final class C28271Lb implements C28261La {
    public long A00;

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        AnonymousClass1NG r8 = (AnonymousClass1NG) obj;
        if (r8 == null || r8.A0H != C29261Pf.MEDIA) {
            return false;
        }
        if (r8.A04().A0k().longValue() + this.A00 > TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
            return true;
        }
        return false;
    }

    public C28271Lb(long j) {
        this.A00 = j;
    }
}
