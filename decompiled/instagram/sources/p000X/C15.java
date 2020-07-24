package p000X;

/* renamed from: X.C15 */
public enum C15 implements C3Y {
    WRAP_ROOT_VALUE(false),
    INDENT_OUTPUT(false),
    FAIL_ON_EMPTY_BEANS(true),
    WRAP_EXCEPTIONS(true),
    CLOSE_CLOSEABLE(false),
    FLUSH_AFTER_WRITE_VALUE(true),
    WRITE_DATES_AS_TIMESTAMPS(true),
    WRITE_DATE_KEYS_AS_TIMESTAMPS(false),
    WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS(false),
    WRITE_ENUMS_USING_TO_STRING(false),
    WRITE_ENUMS_USING_INDEX(false),
    WRITE_NULL_MAP_VALUES(true),
    WRITE_EMPTY_JSON_ARRAYS(true),
    WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    ORDER_MAP_ENTRIES_BY_KEYS(false);
    
    public final boolean A00;

    /* access modifiers changed from: public */
    C15(boolean z) {
        this.A00 = z;
    }

    public final boolean AD9() {
        return this.A00;
    }

    public final int APU() {
        return 1 << ordinal();
    }
}
