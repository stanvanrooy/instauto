package com.facebook.profilo.logger.api;

import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;
import p000X.C09680bp;

public final class ProfiloLogger {
    public static volatile boolean sHasProfilo;

    public static int classLoadEnd(Class cls) {
        if (!sHasProfilo || !TraceEvents.isEnabled(C09680bp.A02)) {
            return -1;
        }
        int i = C09680bp.A02;
        if (!ClassId.sInitialized) {
            return -1;
        }
        return Logger.writeStandardEntry(i, 6, 81, 0, 0, 0, 0, ClassId.getClassId(cls));
    }

    public static int classLoadFailed() {
        if (!sHasProfilo || !TraceEvents.isEnabled(C09680bp.A02)) {
            return -1;
        }
        int i = C09680bp.A02;
        if (!ClassId.sInitialized) {
            return -1;
        }
        return Logger.writeStandardEntry(i, 6, 82, 0, 0, 0, 0, 0);
    }

    public static int classLoadStart() {
        if (!sHasProfilo || !TraceEvents.isEnabled(C09680bp.A02)) {
            return -1;
        }
        int i = C09680bp.A02;
        if (!ClassId.sInitialized) {
            return -1;
        }
        return Logger.writeStandardEntry(i, 6, 80, 0, 0, 0, 0, 0);
    }

    public static int writeLigerMetadata(int i, String str, String str2) {
        if (!sHasProfilo) {
            return -1;
        }
        if (str != null) {
            i = Logger.writeBytesEntry(C09680bp.A05, 0, 56, i, str);
        }
        return Logger.writeBytesEntry(C09680bp.A05, 0, 57, i, str2);
    }
}
