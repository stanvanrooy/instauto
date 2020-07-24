package p000X;

import com.instagram.react.modules.product.IgReactGeoGatingModule;

/* renamed from: X.1fw  reason: invalid class name and case insensitive filesystem */
public final class C35181fw implements C35191fx {
    public AnonymousClass0RN A00;
    public C27391Hq A01;
    public AnonymousClass0C1 A02;

    public final void BL9(long j) {
        String str;
        String APo = this.A01.APo();
        if (APo != null) {
            C92293yv r2 = new C92293yv(AnonymousClass0QT.A00(this.A02, this.A00).A02("instagram_media_screenshot"));
            r2.A07("mediaid", Long.valueOf(Long.parseLong(APo.split("_")[0])));
            if (1 - this.A01.APs().intValue() != 0) {
                str = IgReactGeoGatingModule.SETTING_TYPE_FEED;
            } else {
                str = "reel";
            }
            r2.A08("media_source", str);
            r2.A01();
        }
    }

    public C35181fw(C27391Hq r1, AnonymousClass0C1 r2, AnonymousClass0RN r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }
}
