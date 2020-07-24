package com.facebook.debug.tracer;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.systrace.Systrace;
import java.util.IllegalFormatException;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0DY;
import p000X.AnonymousClass0LV;

public final class Tracer {
    public static AnonymousClass0LV A00 = new AnonymousClass0LV();
    public static final ThreadLocal A01 = new AnonymousClass0DY();

    public static void A00(String str, int i, Object obj, Object obj2, Object obj3) {
        if (Systrace.A08(32)) {
            if (i == 0) {
                str = StringFormatUtil.formatStrLocaleSafe(str);
            } else if (i == 1) {
                str = StringFormatUtil.formatStrLocaleSafe(str, obj);
            } else if (i == 2) {
                str = StringFormatUtil.formatStrLocaleSafe(str, obj, obj2);
            } else if (i == 3) {
                str = StringFormatUtil.formatStrLocaleSafe(str, obj, obj2, obj3);
            } else if (i != 4) {
                try {
                    str = StringFormatUtil.formatStrLocaleSafe(str, (Object[]) null);
                } catch (IllegalFormatException e) {
                    AnonymousClass0DB.A0I("Tracer", "Bad format string", e);
                }
            } else {
                str = StringFormatUtil.formatStrLocaleSafe(str, obj, obj2, obj3, (Object) null);
            }
            Systrace.A00(32, str);
        }
    }
}
