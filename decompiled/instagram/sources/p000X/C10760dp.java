package p000X;

/* renamed from: X.0dp  reason: invalid class name and case insensitive filesystem */
public enum C10760dp implements C07580Tq {
    MqttDurationMs("m", r11),
    MqttTotalDurationMs("mt", r11),
    NetworkDurationMs("n", r11),
    NetworkTotalDurationMs("nt", r11),
    ServiceDurationMs("s", r11),
    MessageSendSuccess("ss", r11),
    ForegroundPing("fp", r11),
    BackgroundPing("bp", r11),
    PublishReceived("pr", r11),
    FbnsNotificationReceived("fnr", r11),
    FbnsLiteNotificationReceived("flnr", r11),
    FbnsLiteNotificationDeliveryRetried("fldr", r11);
    
    public final Class A00;
    public final String A01;

    public final String AOP() {
        return this.A01;
    }

    public final Class AZs() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C10760dp(String str, Class cls) {
        this.A01 = str;
        this.A00 = cls;
    }
}
