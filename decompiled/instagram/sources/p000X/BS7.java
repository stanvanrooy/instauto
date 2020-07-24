package p000X;

import com.facebook.common.dextricks.DexStore;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.realtimeclient.RealtimeProtocol;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BS7 */
public final class BS7 extends C17920r1 {
    public final /* synthetic */ BSA A00;
    public final /* synthetic */ AnonymousClass275 A01;

    private void A00(BS9 bs9) {
        String str;
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("zero_carrier_signal", (AnonymousClass0RN) null);
        A002.A0G("event_type", "ping");
        BSA bsa = this.A00;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", bsa.A01);
            jSONObject.put(IgReactNavigatorModule.URL, bsa.A02);
            jSONObject.put("cooldown", bsa.A00);
            str = jSONObject.toString();
        } catch (JSONException e) {
            AnonymousClass0DB.A0M("IgZeroCarrierSignalController", e, "Ping config serialization failure");
            str = null;
        }
        A002.A0G(DexStore.CONFIG_FILENAME, str);
        A002.A0G(IgReactNavigatorModule.URL, this.A00.A02);
        if (bs9 != null) {
            A002.A0E(RealtimeProtocol.USERS_ACCOUNT_STATUS, Integer.valueOf(bs9.mStatusCode));
            A002.A0A("success", Boolean.valueOf(bs9.A01));
            A002.A0A("state_changed", Boolean.valueOf(bs9.A00));
        } else {
            String str2 = null;
            A002.A0G(RealtimeProtocol.USERS_ACCOUNT_STATUS, str2);
            A002.A0G("success", str2);
            A002.A0G("state_changed", str2);
        }
        AnonymousClass0WN.A01(this.A01.A00).BcG(A002);
        A002.A03();
    }

    public BS7(AnonymousClass275 r1, BSA bsa) {
        this.A01 = r1;
        this.A00 = bsa;
    }

    public final void onFail(C43791v5 r3) {
        int A03 = AnonymousClass0Z0.A03(-877409142);
        A00((BS9) r3.A00);
        AnonymousClass0Z0.A0A(-1510685602, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-970040107);
        BS9 bs9 = (BS9) obj;
        int A032 = AnonymousClass0Z0.A03(-1052576329);
        super.onSuccess(bs9);
        A00(bs9);
        AnonymousClass1CG r2 = this.A01.A03;
        if (r2 == null) {
            AnonymousClass0Z0.A0A(-235881528, A032);
        } else {
            if (bs9.A01 && bs9.A00) {
                r2.AEg(C193418Ps.$const$string(88), true);
            }
            AnonymousClass0Z0.A0A(-1358727160, A032);
        }
        AnonymousClass0Z0.A0A(144849575, A03);
    }
}
