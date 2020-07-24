package p000X;

import android.content.IntentSender;
import android.text.TextUtils;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: X.BIb */
public final class BIb implements C25388BHf {
    public final /* synthetic */ BIZ A00;

    public BIb(BIZ biz) {
        this.A00 = biz;
    }

    public final /* bridge */ /* synthetic */ void BJo(C138515vO r6) {
        Integer num;
        String str;
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) r6;
        int i = locationSettingsResult.AWn().A00;
        boolean z = true;
        if (i == 0) {
            this.A00.A00.A0B();
            num = Constants.A0C;
        } else if (i != 6) {
            this.A00.A00.A0B();
            num = Constants.A0N;
        } else {
            try {
                this.A00.A00.A0B();
                BIZ biz = this.A00;
                biz.A01 = true;
                locationSettingsResult.AWn().A00(biz.A03, 5005);
                return;
            } catch (IntentSender.SendIntentException e) {
                AnonymousClass0DB.A0M("GooglePlayLocationSettingsControllerImpl", e, "Error starting google play services location dialog");
                num = Constants.A0Y;
            }
        }
        this.A00.A06.AvC(num);
        BIZ biz2 = this.A00;
        C25424BJf bJf = biz2.A04;
        if (TextUtils.isEmpty(biz2.A00().A02)) {
            str = "surface_location_upsell_fragment";
        } else {
            str = this.A00.A00().A02;
        }
        bJf.A00(str, BKk.A00(num));
        C25413BIo bIo = this.A00.A05;
        if (!(num == Constants.ZERO || num == Constants.A0C)) {
            z = false;
        }
        bIo.A00(z);
    }
}
