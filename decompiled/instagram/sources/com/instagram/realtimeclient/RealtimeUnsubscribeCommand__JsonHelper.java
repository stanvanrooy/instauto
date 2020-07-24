package com.instagram.realtimeclient;

import java.io.StringWriter;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C13460iZ;

public final class RealtimeUnsubscribeCommand__JsonHelper {
    public static boolean processSingleField(RealtimeUnsubscribeCommand realtimeUnsubscribeCommand, String str, C13080hr r6) {
        String str2 = null;
        if ("command".equals(str)) {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            realtimeUnsubscribeCommand.command = str2;
            return true;
        } else if (!"topic".equals(str)) {
            return false;
        } else {
            if (r6.A0g() != C13120hv.VALUE_NULL) {
                str2 = r6.A0t();
            }
            realtimeUnsubscribeCommand.topic = str2;
            return true;
        }
    }

    public static RealtimeUnsubscribeCommand parseFromJson(C13080hr r3) {
        RealtimeUnsubscribeCommand realtimeUnsubscribeCommand = new RealtimeUnsubscribeCommand();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(realtimeUnsubscribeCommand, A0i, r3);
            r3.A0f();
        }
        return realtimeUnsubscribeCommand;
    }

    public static RealtimeUnsubscribeCommand parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }

    public static String serializeToJson(RealtimeUnsubscribeCommand realtimeUnsubscribeCommand) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        serializeToJson(A05, realtimeUnsubscribeCommand, true);
        A05.close();
        return stringWriter.toString();
    }

    public static void serializeToJson(C13460iZ r2, RealtimeUnsubscribeCommand realtimeUnsubscribeCommand, boolean z) {
        if (z) {
            r2.A0T();
        }
        String str = realtimeUnsubscribeCommand.command;
        if (str != null) {
            r2.A0H("command", str);
        }
        String str2 = realtimeUnsubscribeCommand.topic;
        if (str2 != null) {
            r2.A0H("topic", str2);
        }
        if (z) {
            r2.A0Q();
        }
    }
}
