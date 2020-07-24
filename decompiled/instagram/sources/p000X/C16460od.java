package p000X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.p009ui.widget.slidecontentlayout.SlideContentLayout;

/* renamed from: X.0od  reason: invalid class name and case insensitive filesystem */
public final class C16460od extends C16500oh {
    public final CVK A01(AnonymousClass0C1 r8, AnonymousClass3Di r9, CVR cvr, SlideContentLayout slideContentLayout, AnonymousClass1AM r12) {
        return CVK.A00(r8, r9, cvr, slideContentLayout, r12, false, false);
    }

    public final CVK A02(AnonymousClass0C1 r8, AnonymousClass3Di r9, CVR cvr, SlideContentLayout slideContentLayout, AnonymousClass1AM r12, boolean z, boolean z2) {
        return CVK.A00(r8, r9, cvr, slideContentLayout, r12, z, z2);
    }

    public final APU A00(AnonymousClass0C1 r10, Context context, CVR cvr, AnonymousClass1AM r13) {
        AnonymousClass0C1 r4 = r10;
        if (cvr == CVR.A02) {
            return new C25011Ay3(C25012Ay4.A00(r10));
        }
        C25012Ay4 A00 = C25012Ay4.A00(r10);
        return new CH0(r4, context.getApplicationContext(), new C27534CGy(new CHB(context, r13)), A00, new CH4(false, false, (ImageUrl) null, (String) null));
    }
}
