package p000X;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* renamed from: X.0lG  reason: invalid class name and case insensitive filesystem */
public final class C14640lG {
    public static Method A00;
    public static Method A01;
    public static Method A02;
    public static Method A03;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            Class<Trace> cls = Trace.class;
            try {
                cls.getField("TRACE_TAG_APP").getLong((Object) null);
                A02 = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                Class<String> cls2 = String.class;
                A00 = cls.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, cls2, Integer.TYPE});
                Class cls3 = Integer.TYPE;
                A01 = cls.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, cls2, cls3});
                A03 = cls.getMethod("traceCounter", new Class[]{Long.TYPE, cls2, cls3});
            } catch (Exception unused) {
            }
        }
    }
}
