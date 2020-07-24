package p000X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.BHD */
public abstract class BHD extends C25371BGk implements BHU {
    public static final C25426BJh A00;
    public static final C25443BKj A01;
    public static final C25399BHx A02;

    static {
        C25443BKj bKj = new C25443BKj();
        A01 = bKj;
        BHI bhi = new BHI();
        A00 = bhi;
        A02 = new C25399BHx("SmsRetriever.API", bhi, bKj);
    }

    public BHD(Context context) {
        super(context, A02, new BH9());
    }

    public C60302jg A02() {
        C25365BGd bGd = (C25365BGd) this;
        BGS bgs = new BGS();
        B57 b57 = new B57();
        C25368BGg bGg = bGd.A05;
        BGY bgy = new BGY(bgs, b57, bGd.A06);
        Handler handler = bGg.A03;
        AnonymousClass0ZA.A0D(handler, handler.obtainMessage(4, new C25367BGf(bgy, bGg.A09.get(), bGd)));
        return b57.A00;
    }
}
