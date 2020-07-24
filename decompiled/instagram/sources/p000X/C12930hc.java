package p000X;

/* renamed from: X.0hc  reason: invalid class name and case insensitive filesystem */
public enum C12930hc {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    WRITE_NUMBERS_AS_STRINGS(false),
    FLUSH_PASSED_TO_STREAM(true),
    ESCAPE_NON_ASCII(false);
    
    public final int A00;
    public final boolean A01;

    /* access modifiers changed from: public */
    C12930hc(boolean z) {
        this.A00 = 1 << ordinal();
        this.A01 = z;
    }
}
