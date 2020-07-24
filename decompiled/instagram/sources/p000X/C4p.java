package p000X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: X.C4p */
public final class C4p extends AnonymousClass28Z {
    public C41841r1 A00;
    public final /* synthetic */ C27243C4q A01;

    public C4p(C27243C4q c4q) {
        this.A01 = c4q;
    }

    public final /* bridge */ /* synthetic */ Object A05(Object[] objArr) {
        C41841r1 A002;
        Bitmap decodeFile = BitmapFactory.decodeFile(this.A01.A01);
        C27243C4q c4q = this.A01;
        if (decodeFile == null) {
            C5Z c5z = (C5Z) c4q.A00.get();
            if (c5z != null) {
                c4q.requireActivity().runOnUiThread(new C5W(c4q, c5z));
                c5z.BK1();
            }
            A002 = null;
        } else {
            A002 = C87083q9.A00(c4q.getResources(), decodeFile);
            A002.A09.setAntiAlias(true);
            A002.invalidateSelf();
            A002.A02(((float) decodeFile.getWidth()) * 0.03f);
        }
        this.A00 = A002;
        return null;
    }

    public final /* bridge */ /* synthetic */ void A07(Object obj) {
        this.A01.A00.setImageDrawable(this.A00);
    }
}
