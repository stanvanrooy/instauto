package p000X;

/* renamed from: X.0Ve  reason: invalid class name and case insensitive filesystem */
public enum C07980Ve {
    ACKNOWLEDGED_DELIVERY(0),
    PROCESSING_LASTACTIVE_PRESENCEINFO(1),
    EXACT_KEEPALIVE(2),
    REQUIRES_JSON_UNICODE_ESCAPES(3),
    DELTA_SENT_MESSAGE_ENABLED(4),
    USE_ENUM_TOPIC(5),
    SUPPRESS_GETDIFF_IN_CONNECT(6),
    USE_THRIFT_FOR_INBOX(7),
    USE_SEND_PINGRESP(8),
    REQUIRE_REPLAY_PROTECTION(9),
    DATA_SAVING_MODE(10),
    TYPING_OFF_WHEN_SENDING_MESSAGE(11),
    PERMISSION_USER_AUTH_CODE(12),
    FBNS_EXPLICIT_DELIVERY_ACK(13);
    
    public final byte A00;

    /* access modifiers changed from: public */
    C07980Ve(int i) {
        boolean z = true;
        C07410Sz.A01(true);
        C07410Sz.A01(i >= 64 ? false : z);
        this.A00 = (byte) i;
    }
}
