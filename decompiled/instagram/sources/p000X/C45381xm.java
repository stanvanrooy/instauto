package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.IOException;

/* renamed from: X.1xm  reason: invalid class name and case insensitive filesystem */
public final class C45381xm extends IOException {
    public final String A00;

    public C45381xm(C17190pp r3, String str) {
        super(StringFormatUtil.formatStrLocaleSafe("Expected 'Content-Type: %s' but got '%s'", "application/json", r3));
        this.A00 = str;
    }
}
