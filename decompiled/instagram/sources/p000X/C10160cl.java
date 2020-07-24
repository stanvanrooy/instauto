package p000X;

import android.content.Context;
import android.content.Intent;
import org.json.JSONObject;

/* renamed from: X.0cl  reason: invalid class name and case insensitive filesystem */
public final class C10160cl extends C07630Tv {
    public final Context A00;
    public volatile C07650Tx A01 = new C07650Tx(new JSONObject());

    public final C07650Tx A00() {
        return this.A01;
    }

    public final void A01() {
        JSONObject jSONObject = new JSONObject();
        A03(jSONObject);
        this.A01 = new C07650Tx(jSONObject);
    }

    public final void A02() {
        this.A00.sendBroadcast(new Intent("com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED").setPackage(this.A00.getPackageName()));
    }

    public C10160cl(Context context) {
        this.A00 = context;
    }
}
