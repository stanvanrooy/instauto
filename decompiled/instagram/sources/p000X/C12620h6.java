package p000X;

/* renamed from: X.0h6  reason: invalid class name and case insensitive filesystem */
public enum C12620h6 {
    LAUNCHER(false),
    NOTIFICATION_CLICKED(false),
    NOTIFICATION_CLEARED(true),
    NOTIFICATION_RECEIVED(true),
    NOTIFICATION_CHANNELS(false),
    DEEPLINK(false),
    APP_SHORTCUT(false),
    FBNS(true),
    APP_UPGRADED(true),
    SHARE_TO_FEED(false),
    ANALYTICS_UPLOAD_BATCH(true),
    ANALYTICS_UPLOAD_RETRY(true),
    COPYPASTA_UPLOAD_RETRY(true),
    UNKNOWN(false);
    
    public final boolean A00;

    /* access modifiers changed from: public */
    C12620h6(boolean z) {
        this.A00 = z;
    }

    public final String A00() {
        switch (ordinal()) {
            case 0:
                return "normal";
            case 1:
                return "push_notification";
            case 2:
                return "notification_cleared";
            case 3:
                return "push_notification_received";
            case 4:
                return "push_notification_channels";
            case 5:
                return "url_scheme";
            case 6:
                return "shortcut";
            case 7:
                return "fbns";
            case 8:
                return "app_upgraded";
            case 9:
                return "pending_action_receiver";
            case 10:
                return "share_to_feed";
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                return "analytics_upload_batch";
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                return "analytics_upload_retry";
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                return "copypasta_upload_retry";
            default:
                return "unknown";
        }
    }
}
