package com.instagram.debug.log;

import com.instagram.debug.log.tags.DLogTag;
import p000X.C05770Lw;
import p000X.C11180eY;

public class DLog {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;

    public class NewLogEvent implements C11180eY {
        public final int logLevel;
        public final DLogTag logTag;
        public final String message;

        public NewLogEvent(DLogTag dLogTag, int i, String str) {
            this.logTag = dLogTag;
            this.logLevel = i;
            this.message = str;
        }
    }

    public static void sendLogLineToOverlay(NewLogEvent newLogEvent) {
        String str;
        try {
            Class<?> cls = Class.forName("com.instagram.debug.devoptions.DebugOverlayController");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
            if (newLogEvent.logLevel == 3) {
                str = "logDebugMessage";
            } else {
                str = "logErrorMessage";
            }
            cls.getMethod(str, new Class[]{DLogTag.class, String.class}).invoke(invoke, new Object[]{newLogEvent.logTag, newLogEvent.message});
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static void m40d(DLogTag dLogTag, String str, Object... objArr) {
        sendLogLine(dLogTag, 3, String.format(str, objArr));
    }

    /* renamed from: e */
    public static void m41e(DLogTag dLogTag, String str, Object... objArr) {
        sendLogLine(dLogTag, 6, String.format(str, objArr));
    }

    public static void sendLogLine(DLogTag dLogTag, int i, String str) {
        C05770Lw.A00();
        C05770Lw.A00();
    }

    public static boolean shouldLogEvent(DLogTag dLogTag) {
        C05770Lw.A00();
        return false;
    }
}
