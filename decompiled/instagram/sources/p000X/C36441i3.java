package p000X;

import android.graphics.Bitmap;
import java.util.Set;

/* renamed from: X.1i3  reason: invalid class name and case insensitive filesystem */
public final class C36441i3 implements Runnable {
    public final /* synthetic */ AnonymousClass1GP A00;

    public C36441i3(AnonymousClass1GP r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
        if (r1.A02.booleanValue() == false) goto L_0x003c;
     */
    public final void run() {
        int i;
        boolean z;
        int i2;
        int i3;
        Bitmap bitmap;
        AnonymousClass1GP r2 = this.A00;
        r2.A08.A01 = true;
        AnonymousClass18Q r4 = r2.A0T.A0B.A05.A0D;
        String str = r2.A0E.A00;
        AnonymousClass1GR r22 = r2.A0F;
        if (r22.A00 == Integer.MAX_VALUE) {
            i = 1;
        } else {
            i = r22.A00;
        }
        AnonymousClass1GP r1 = this.A00;
        C35441gN r0 = r1.A08;
        byte[] bArr = r0.A02;
        int i4 = r0.A00;
        float A07 = r1.A07();
        AnonymousClass1GP r02 = this.A00;
        int i5 = r02.A03;
        AnonymousClass1GR r12 = r02.A0F;
        if (r12.A02 != null) {
            z = true;
        }
        z = false;
        AnonymousClass1GP r13 = this.A00;
        String str2 = r13.A0H;
        String str3 = r13.A0E.A03;
        boolean z2 = false;
        if (r13.A02 > 0) {
            z2 = true;
        }
        C36531iC A08 = r4.A08(str, i, bArr, i4, A07, i5, z, str2, str3, !z2);
        if (A08 != null) {
            AnonymousClass1GP r23 = this.A00;
            r23.A06 = A08.A01;
            r23.A0C = true;
            C15130mO r3 = r23.A0T.A0B.A02;
            if (r3 != null) {
                String A03 = AnonymousClass12C.A03(r23.A0E);
                AnonymousClass1GP r03 = this.A00;
                r3.A02(A03, 1, r03.A00, r03.A0H, (long) r03.A08.A00);
            }
        }
        AnonymousClass12C r04 = this.A00.A0T;
        r04.A00 = null;
        if (r04.A09 != null) {
            int i6 = 0;
            if (A08 == null || (bitmap = A08.A01) == null) {
                i2 = 0;
                i3 = 0;
            } else {
                i6 = bitmap.getWidth();
                i3 = A08.A01.getHeight();
                i2 = A08.A01.getByteCount();
            }
            AnonymousClass1GP r24 = this.A00;
            r24.A0T.A09.Ale(r24.A0E.A03);
            AnonymousClass1GP r25 = this.A00;
            r25.A0T.A09.Alc(r25.A0E.A03, i6, i3, i2);
        }
        AnonymousClass1GP r26 = this.A00;
        AnonymousClass1GP.A06(r26, (Set) null, r26.A0A, "SUCCESS");
        AnonymousClass12C.A04(this.A00.A0T);
    }
}
