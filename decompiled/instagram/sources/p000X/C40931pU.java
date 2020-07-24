package p000X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.Set;

/* renamed from: X.1pU  reason: invalid class name and case insensitive filesystem */
public final class C40931pU implements AnonymousClass18C {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ C40911pS A01;
    public final /* synthetic */ C31591Yx A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Set A05;
    public final /* synthetic */ Set A06;
    public final /* synthetic */ boolean A07;

    public final void B72(AnonymousClass1GK r1, int i) {
    }

    public C40931pU(C31591Yx r1, String str, ImageUrl imageUrl, Set set, C40911pS r5, Set set2, boolean z, String str2) {
        this.A02 = r1;
        this.A03 = str;
        this.A00 = imageUrl;
        this.A05 = set;
        this.A01 = r5;
        this.A06 = set2;
        this.A07 = z;
        this.A04 = str2;
    }

    public final void AtI(AnonymousClass1GK r6, C36591iI r7) {
        this.A05.remove(this.A00);
        C31591Yx.A02(this.A02, this.A01, this.A03, this.A06, this.A05);
        if (this.A07) {
            this.A02.A06(new C41891r6(this));
        }
    }

    public final void B70(AnonymousClass1GK r6) {
        this.A05.remove(this.A00);
        C31591Yx.A02(this.A02, this.A01, this.A03, this.A06, this.A05);
        if (this.A07) {
            this.A02.A06(new AnonymousClass89K(this));
        }
    }
}
