package p000X;

import com.facebook.proxygen.EventBase;
import com.facebook.proxygen.utils.CircularEventLog;

/* renamed from: X.0ly  reason: invalid class name and case insensitive filesystem */
public final class C14920ly {
    public static final Class A02 = C14920ly.class;
    public String A00;
    public final CircularEventLog A01;

    public C14920ly(EventBase eventBase, String str) {
        this.A01 = new CircularEventLog(eventBase, 100);
        this.A00 = str;
    }
}
