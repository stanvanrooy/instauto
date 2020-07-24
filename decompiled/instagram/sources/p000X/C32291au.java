package p000X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.1au  reason: invalid class name and case insensitive filesystem */
public final class C32291au {
    public View.OnClickListener A00;
    public C26571Ea A01;

    public C32291au(ViewStub viewStub) {
        this.A01 = new C26571Ea(viewStub);
    }

    public final void A00(AnonymousClass0C1 r4, Integer num) {
        switch (num.intValue()) {
            case 0:
                this.A01.A02(0);
                C91113x1 r1 = new C91113x1(AnonymousClass0QT.A00(r4, (AnonymousClass0RN) null).A02("zero_rating_video_play_button_impression"));
                r1.A08(B5B.INTENT_PARAM_TAG, (String) null);
                r1.A01();
                this.A01.A01().setOnClickListener(this.A00);
                return;
            case 1:
                this.A01.A02(8);
                return;
            default:
                return;
        }
    }
}
