package p000X;

import com.facebook.rti.push.service.FbnsService;
import java.util.UUID;

/* renamed from: X.0ca  reason: invalid class name and case insensitive filesystem */
public final class C10050ca implements AnonymousClass0V0 {
    public AnonymousClass0UV A00;
    public C10960eC A01;
    public final FbnsService A02;

    public final String AG2() {
        return "567310203415052";
    }

    public final String AG3() {
        return "MQTT";
    }

    public final synchronized String AKC() {
        return (String) this.A00.first;
    }

    public final synchronized String AKE() {
        return (String) this.A00.second;
    }

    public final synchronized boolean BsN(AnonymousClass0UV r6) {
        boolean z;
        if (!this.A00.equals(r6)) {
            C11000eG A002 = this.A01.A00(Constants.A0j).A00();
            A002.A00.putString("/settings/mqtt/id/mqtt_device_id", (String) r6.first);
            A002.A00.putString("/settings/mqtt/id/mqtt_device_secret", (String) r6.second);
            A002.A00.putLong("/settings/mqtt/id/timestamp", r6.A00);
            A002.A00.apply();
            this.A00 = r6;
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public C10050ca(FbnsService fbnsService, C10960eC r11) {
        this.A02 = fbnsService;
        this.A01 = r11;
        C10980eE A002 = r11.A00(Constants.A0j);
        AnonymousClass0UV r7 = new AnonymousClass0UV(A002.A00.getString("/settings/mqtt/id/mqtt_device_id", ""), A002.A00.getString("/settings/mqtt/id/mqtt_device_secret", ""), A002.A00.getLong("/settings/mqtt/id/timestamp", Long.MAX_VALUE));
        this.A00 = r7;
        String str = (String) r7.first;
        if ((str == null || str.equals("")) && AnonymousClass0UP.A01(this.A02.getPackageName())) {
            BsN(new AnonymousClass0UV(UUID.randomUUID().toString(), "", System.currentTimeMillis()));
        }
    }
}
