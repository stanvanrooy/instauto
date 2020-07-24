package p000X;

/* renamed from: X.C1A */
public enum C1A implements C3Y {
    USE_ANNOTATIONS(true),
    AUTO_DETECT_CREATORS(true),
    AUTO_DETECT_FIELDS(true),
    AUTO_DETECT_GETTERS(true),
    AUTO_DETECT_IS_GETTERS(true),
    AUTO_DETECT_SETTERS(true),
    REQUIRE_SETTERS_FOR_GETTERS(false),
    USE_GETTERS_AS_SETTERS(true),
    CAN_OVERRIDE_ACCESS_MODIFIERS(true),
    INFER_PROPERTY_MUTATORS(true),
    ALLOW_FINAL_FIELDS_AS_MUTATORS(true),
    USE_STATIC_TYPING(false),
    DEFAULT_VIEW_INCLUSION(true),
    SORT_PROPERTIES_ALPHABETICALLY(false),
    USE_WRAPPER_NAME_AS_PROPERTY_NAME(false);
    
    public final boolean A00;

    /* access modifiers changed from: public */
    C1A(boolean z) {
        this.A00 = z;
    }

    public final boolean AD9() {
        return this.A00;
    }

    public final int APU() {
        return 1 << ordinal();
    }
}
