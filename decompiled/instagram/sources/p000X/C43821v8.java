package p000X;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

/* renamed from: X.1v8  reason: invalid class name and case insensitive filesystem */
public final class C43821v8 extends AnonymousClass1GM {
    public final /* synthetic */ C43801v6 A00;
    public final /* synthetic */ WeakReference A01;

    public final void A01() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43821v8(C43801v6 r7, int i, int i2, int i3, int i4, float f, WeakReference weakReference) {
        super(i, i2, i3, i4, f);
        this.A00 = r7;
        this.A01 = weakReference;
    }

    public final Bitmap A00() {
        return (Bitmap) this.A01.get();
    }
}
