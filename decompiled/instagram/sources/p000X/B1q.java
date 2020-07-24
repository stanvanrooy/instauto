package p000X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.B1q */
public enum B1q {
    WEBSITE_URL("website_url"),
    API_ENDPOINT("api_endpoint"),
    SOURCE("source"),
    ERROR_CODE(TraceFieldType.ErrorCode),
    APP_ID("app_id"),
    AUTOFILL_FIELDS_REQUESTED("autofill_fields_requested"),
    AUTOFILL_FIELDS_FILLED("autofill_fields_filled"),
    CALLBACK_RESULT("callback_result"),
    SURFACE("surface"),
    PIXEL_EVENT_NAME("pixel_event_name"),
    PIXEL_EVENT_PIXEL_ID("pixel_event_pixel_id"),
    BUSINESS_ID(AnonymousClass0C5.$const$string(199));
    
    public final String A00;

    /* access modifiers changed from: public */
    B1q(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }
}
