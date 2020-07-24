package p000X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.0v6  reason: invalid class name and case insensitive filesystem */
public final class C20440v6 extends C19410tR {
    public static final C17120pi A06 = new C20450v7();
    public C98724Oo A00;
    public C185767we A01;
    public C160436su A02;
    public String A03;
    public String A04;
    public String A05;

    public final String A01() {
        return "configure_visual_message";
    }

    public final C58022fB A03() {
        return C58022fB.EXPIRING_MEDIA;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A00;
    }

    public final C107694kY A07() {
        boolean z = false;
        if (this.A00.A00() != null) {
            z = true;
        }
        if (z) {
            return new C107694kY(this.A05, this.A03, this.A04);
        }
        String str = this.A05;
        if (str == null && this.A03 == null && this.A04 == null) {
            return null;
        }
        return new C107694kY(str, this.A03, this.A04);
    }

    public C20440v6() {
    }

    public C20440v6(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, C98724Oo r9, C160436su r10, C185767we r11, C107694kY r12, long j, Long l) {
        super(r7, directThreadKey, l, j);
        AnonymousClass0a4.A07(r9.A00(), "Invalid DirectPendingVisualMedia object with null PublisherTxnId");
        this.A00 = r9;
        this.A02 = r10;
        this.A01 = r11;
        this.A05 = r12.A02;
        this.A03 = r12.A00;
        this.A04 = r12.A01;
    }

    public C20440v6(AnonymousClass3LQ r7, List list, C98724Oo r9, C107694kY r10, long j, Long l) {
        super(r7, list, l, j);
        AnonymousClass0a4.A07(r9.A04, "Invalid DirectPendingVisualMedia object with null PendingMediaKey");
        this.A00 = r9;
        this.A05 = r10.A02;
        this.A03 = r10.A00;
        this.A04 = r10.A01;
    }
}
