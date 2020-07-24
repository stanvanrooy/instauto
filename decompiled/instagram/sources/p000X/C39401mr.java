package p000X;

/* renamed from: X.1mr  reason: invalid class name and case insensitive filesystem */
public enum C39401mr implements C33041cH {
    UNKNOWN(-1),
    MEDIA(0),
    CHANNEL(1),
    REELS(3),
    ACCOUNT_RECS_AS_NETEGO(7),
    ACCOUNT_RECS(8),
    RELATED_ITEMS(9),
    SUGGESTED_HASHTAG(11),
    LIVE_REPLAY(12),
    IGTV_TRAY(13),
    ACCOUNT_REC(14),
    IGTV_MEDIA(16),
    SHOPPING(17),
    DESTINATION_PIVOT(19),
    SHOPPING_CAROUSEL(21),
    IGTV_CHANNEL(22),
    MEDIA_LOCATION_MAP(23),
    CLIPS(24),
    BLOKS(25),
    GUIDES(26),
    GUIDES_CHANNEL(27);
    
    public final long A00;

    /* renamed from: A00 */
    public final Long getValue() {
        return Long.valueOf(this.A00);
    }

    /* access modifiers changed from: public */
    C39401mr(long j) {
        this.A00 = j;
    }
}
