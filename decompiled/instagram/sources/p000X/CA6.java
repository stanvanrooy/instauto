package p000X;

import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;

/* renamed from: X.CA6 */
public final class CA6 implements View.OnTouchListener {
    public final /* synthetic */ CA8 A00;
    public final /* synthetic */ CA7 A01;

    public CA6(CA8 ca8, CA7 ca7) {
        this.A00 = ca8;
        this.A01 = ca7;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        CA9 ca9 = this.A00.A00.A00;
        AnonymousClass11J.A00(ca9);
        AnonymousClass1NJ r6 = this.A01.A00;
        C27334C9f c9f = ca9.A01;
        AnonymousClass0a4.A06(c9f);
        String A0u = r6.A0u();
        AnonymousClass0C1 r5 = c9f.A07;
        String str = c9f.A08;
        HashMap hashMap = new HashMap();
        hashMap.put("m_pk", A0u);
        AnonymousClass0P4 A002 = AnonymousClass2VV.A00(Constants.A05);
        A002.A0G("component", "media_thumbnail_cell");
        C06270Ok A003 = C06270Ok.A00();
        A003.A0C(hashMap);
        A002.A08("configurations", A003);
        C25749BXt.A00(A002, str, r5);
        return ca9.A06.BS6(view, motionEvent, r6, 0);
    }
}
