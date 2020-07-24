package p000X;

import android.widget.RadioGroup;

/* renamed from: X.BYG */
public final class BYG implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ BYK A00;

    public BYG(BYK byk) {
        this.A00 = byk;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        Integer num;
        if (i == 0) {
            num = Constants.ZERO;
        } else if (i == 1) {
            num = Constants.ONE;
        } else {
            return;
        }
        BYK byk = this.A00;
        AnonymousClass0C1 r0 = byk.A02;
        String A002 = BYM.A00(num);
        C15890nh r2 = new C15890nh(r0);
        r2.A09 = Constants.ONE;
        r2.A0C = "users/set_message_settings/";
        r2.A09("group_message_setting", A002);
        r2.A06(BYJ.class, false);
        C17850qu A03 = r2.A03();
        A03.A00 = new BYI(byk, num);
        byk.A03.schedule(A03);
    }
}
