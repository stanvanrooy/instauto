package p000X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.instagram.reels.viewer.common.ReelViewGroup;

/* renamed from: X.1fa  reason: invalid class name and case insensitive filesystem */
public final class C34961fa {
    public View A00;
    public View A01;
    public final Context A02;
    public final ViewStub A03 = ((ViewStub) A01(this).findViewById(C0003R.C0005id.drops_reminder_product_sticker_button_view));
    public final ViewStub A04;
    public final ReelViewGroup A05;
    public final AnonymousClass0C1 A06;

    public static View A00(C34961fa r1) {
        if (r1.A00 == null) {
            r1.A00 = r1.A03.inflate();
        }
        return r1.A00;
    }

    public static View A01(C34961fa r1) {
        if (r1.A01 == null) {
            r1.A01 = r1.A04.inflate();
        }
        return r1.A01;
    }

    public C34961fa(ViewStub viewStub, ReelViewGroup reelViewGroup, AnonymousClass0C1 r5) {
        this.A02 = reelViewGroup.getContext();
        this.A06 = r5;
        this.A05 = reelViewGroup;
        this.A04 = viewStub;
    }
}
