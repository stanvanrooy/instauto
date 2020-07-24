package p000X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.util.Map;

/* renamed from: X.1ke  reason: invalid class name and case insensitive filesystem */
public enum C38051ke {
    ACTIVE(AppStateModule.APP_STATE_ACTIVE),
    INTERRUPTED("interrupted"),
    STOPPED("stopped"),
    HARD_STOPPED("hard_stop"),
    POST_LIVE("post_live"),
    POST_LIVE_POSTING("post_live_posting"),
    POST_LIVE_POSTING_FAILED("post_live_posting_failed"),
    POST_LIVE_POSTING_INITIATED("post_live_posting_initiated"),
    POST_LIVE_POST_REQUEST_FAILED("post_live_post_request_failed"),
    HIDDEN("hidden"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        A01 = new C38061kf();
    }

    public final boolean A00() {
        if (this == ACTIVE || this == INTERRUPTED || this == HIDDEN) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        if (this == POST_LIVE_POST_REQUEST_FAILED) {
            return true;
        }
        return false;
    }

    public final boolean A03() {
        if (this == POST_LIVE || this == POST_LIVE_POSTING || this == POST_LIVE_POSTING_FAILED || this == POST_LIVE_POSTING_INITIATED || this == POST_LIVE_POST_REQUEST_FAILED) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C38051ke(String str) {
        this.A00 = str;
    }

    public final boolean A02() {
        if (!A03() || this == POST_LIVE_POSTING_FAILED) {
            return true;
        }
        return false;
    }
}
