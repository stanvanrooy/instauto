package p000X;

import android.content.Context;
import android.widget.Adapter;
import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.CXA */
public final class CXA extends C29581Ql {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C150406c2 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CXA(C150406c2 r2, Context context) {
        super(3);
        this.A01 = r2;
        this.A00 = context;
    }

    public final void A03(Adapter adapter, int i) {
        AnonymousClass1ZD r2;
        ImageInfo imageInfo;
        C27942CXe cXe;
        C27920CWi cWi = (C27920CWi) adapter.getItem(i);
        switch (cWi.AZB().ordinal()) {
            case 2:
                r2 = this.A01.A01;
                cXe = (C27942CXe) cWi;
                break;
            case 3:
                r2 = this.A01.A01;
                imageInfo = ((CXF) cWi).A00;
                break;
            case 7:
                cXe = (C27942CXe) ((C27944CXg) cWi).A00.A00(0);
                r2 = this.A01.A01;
                break;
            default:
                return;
        }
        imageInfo = cXe.A00;
        r2.A01(imageInfo.A03(this.A00));
    }
}
