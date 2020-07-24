package p000X;

import android.widget.RadioGroup;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.Iterator;

/* renamed from: X.BYB */
public final class BYB implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ BYA A00;

    public BYB(BYA bya) {
        this.A00 = bya;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        BYC byc;
        int i2;
        BYA bya = this.A00;
        String valueOf = String.valueOf(i);
        Iterator it = bya.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                BYC byc2 = (BYC) it.next();
                if (byc2.A00.equals(valueOf)) {
                    i2 = byc2.A01;
                    break;
                }
            } else {
                if (C17440qF.A00(bya.getContext())) {
                    byc = BYC.A04;
                } else {
                    byc = BYC.A05;
                }
                i2 = byc.A01;
            }
        }
        IgFragmentActivity igFragmentActivity = (IgFragmentActivity) this.A00.getActivity();
        C05760Lv.A01.A00.edit().putInt("dark_mode_toggle_setting", i2).apply();
        int i3 = C25731Aa.A00;
        C25731Aa.A08(i2);
        if (i2 == -1) {
            int i4 = 1;
            if (C15330mi.A00().getInt("KEY_CONFIG_CURRENT_SYSTEM_UI_MODE", -1) == 32) {
                i4 = 2;
            }
            if (i3 != i4) {
                igFragmentActivity.recreate();
            }
        }
    }
}
