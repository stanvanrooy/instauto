package p000X;

import android.graphics.Bitmap;
import android.os.Build;
import com.instagram.common.graphics.IgBitmapReferenceFactory;

/* renamed from: X.1v0  reason: invalid class name and case insensitive filesystem */
public final class C43741v0 extends C252618c {
    public final double A00;
    public final C252618c A01;
    public final C252618c A02;
    public final C252117x A03;
    public final boolean A04;

    public final C36491i8 A00(int i, byte[] bArr, int i2, float f, int i3, boolean z) {
        boolean z2;
        C252618c r3;
        synchronized (C252117x.class) {
            z2 = C252117x.A01;
        }
        boolean z3 = true;
        if (z2) {
            if (!this.A04) {
                z3 = true ^ this.A03.A08();
            } else if (!this.A03.A09(this.A00) || this.A03.A08()) {
                z3 = false;
            }
        }
        byte[] bArr2 = bArr;
        int i4 = i;
        int i5 = i2;
        float f2 = f;
        boolean z4 = z;
        int i6 = i3;
        if (z3) {
            r3 = this.A02;
        } else {
            r3 = this.A01;
        }
        return r3.A00(i4, bArr2, i5, f2, i6, z4);
    }

    public C43741v0(AnonymousClass188 r7) {
        C252618c r5;
        if (IgBitmapReferenceFactory.isIgBitmapReferenceSupported()) {
            r5 = new C43751v1();
        } else {
            try {
                r5 = new C43801v6(r7, Bitmap.class.getMethod("createAshmemBitmap", (Class[]) null));
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
        C252518b r4 = new C252518b(r7);
        C252117x A022 = C252117x.A02();
        boolean z = Build.VERSION.SDK_INT >= 24;
        this.A02 = r5;
        this.A01 = r4;
        this.A04 = z;
        this.A00 = 0.35d;
        this.A03 = A022;
    }
}
