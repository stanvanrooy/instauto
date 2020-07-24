package p000X;

/* renamed from: X.0dy  reason: invalid class name and case insensitive filesystem */
public enum C10850dy implements C07580Tq {
    ServiceName("sn", r2),
    ClientCoreName("cn", r2),
    NotificationStoreName("nsn", r2),
    Country("ct", r2),
    NetworkType("nt", r2),
    NetworkSubtype("ns", r2),
    AppState("as", r2),
    ScreenState("ss", r2),
    YearClass("yc", r2),
    MqttGKs("gk", r2),
    MqttFlags("f", r2),
    IsEmployee("e", r2),
    ValidCompatibleApps("va", r2),
    EnabledCompatibleApps("ea", r2),
    RegisteredApps("ra", r2);
    
    public final Class A00;
    public final String A01;

    public final String AOP() {
        return this.A01;
    }

    public final Class AZs() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C10850dy(String str, Class cls) {
        this.A01 = str;
        this.A00 = cls;
    }
}
