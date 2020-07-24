package p000X;

/* renamed from: X.0or  reason: invalid class name and case insensitive filesystem */
public enum C16600or {
    PUSH_NOTIFICATION("video_call_push_notification"),
    MISSED_CALL_NOTIFICATION("video_call_missed_call_notification"),
    RING_SCREEN("video_call_ring_screen"),
    END_SCREEN("video_call_end_screen"),
    DIRECT_THREAD("video_call_direct_thread"),
    DIRECT_INBOX_RECIPIENTS_PICKER("video_call_direct_inbox_recipients_picker"),
    DIRECT_INBOX_THREAD("video_call_direct_inbox_thread"),
    DIRECT_ACTION_LOG("video_call_direct_action_log"),
    THREADS_APP_PUSH_NOTIFICATION("threads_app_video_call_push_notification"),
    THREADS_APP_MISSED_CALL_NOTIFICATION("threads_app_video_call_missed_call_notification"),
    THREADS_APP_THREAD("threads_app_video_call_thread"),
    THREADS_APP_INBOX_ROW("threads_app_video_call_inbox_row"),
    THREADS_APP_ACTION_LOG("threads_app_action_log");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C16600or(String str) {
        this.A00 = str;
    }
}
