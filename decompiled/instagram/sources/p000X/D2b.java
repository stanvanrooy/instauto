package p000X;

/* renamed from: X.D2b */
public enum D2b {
    SINGLE_FORMAT("sf"),
    NO_CURRENT("nc"),
    USE_DEFAULT("ud"),
    LOW_BUFFER("lb"),
    HIGH_BUFFER("hb"),
    LOW_BANDWIDTH("lbw"),
    HIGH_BANDWIDTH("hbw"),
    FORCE_CURRENT_WITH_VERY_HIGH_BUFFER("fchb"),
    TRY_LOWER_QUALITY("tlq"),
    TRY_HIGHER_QUALITY("thq"),
    HIGHER_QUALITY_CONF_BASED("hqcf"),
    ABR_UP_WATCHABLE("wat"),
    USE_CACHED("cache"),
    PRESELECTED("ps"),
    PREFETCHING("pf"),
    USE_LOWEST_WITH_NO_SUITABLE_FORMAT("ulsf"),
    CHOOSE_BASED_ON_BANDWIDTH("band"),
    FORCE_LOWEST("fl"),
    STATIC_DEFAULT("sd"),
    VERY_HIGH_BUFFER_BANDWIDTH_BOOST("vhbb"),
    SOFT_MOS("sm");
    
    public final String A00;

    /* access modifiers changed from: public */
    D2b(String str) {
        this.A00 = str;
    }
}
