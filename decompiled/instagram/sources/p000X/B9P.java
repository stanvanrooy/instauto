package p000X;

/* renamed from: X.B9P */
public enum B9P {
    ERROR_INVALID_ARGUMENT(-1, IllegalArgumentException.class),
    ERROR_RESOURCE_EXHAUSTED(-11, B9X.class),
    UNAVAILABLE_ARCORE_NOT_INSTALLED(-100, B9j.class),
    UNAVAILABLE_DEVICE_NOT_COMPATIBLE(-101, C25235B9h.class),
    UNAVAILABLE_APK_TOO_OLD(-103, C25237B9k.class),
    UNAVAILABLE_SDK_TOO_OLD(-104, C25236B9i.class),
    UNAVAILABLE_USER_DECLINED_INSTALLATION(-105, C25234B9f.class);
    
    public final int A00;
    public final Class A01;
    public final String A02;

    /* access modifiers changed from: public */
    B9P(int i, Class cls) {
        this(r7, r8, i, cls, (String) null);
    }

    /* access modifiers changed from: public */
    B9P(int i, Class cls, String str) {
        this.A00 = i;
        this.A01 = cls;
        this.A02 = str;
    }
}
