package com.instagram.debug.memorydump;

import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13120hv;

public final class MemoryDumpUploadResponse__JsonHelper {
    public static boolean processSingleField(MemoryDumpUploadResponse memoryDumpUploadResponse, String str, C13080hr r3) {
        if (!"success".equals(str)) {
            return false;
        }
        memoryDumpUploadResponse.success = r3.A0O();
        return true;
    }

    public static MemoryDumpUploadResponse parseFromJson(C13080hr r3) {
        MemoryDumpUploadResponse memoryDumpUploadResponse = new MemoryDumpUploadResponse();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            processSingleField(memoryDumpUploadResponse, A0i, r3);
            r3.A0f();
        }
        return memoryDumpUploadResponse;
    }

    public static MemoryDumpUploadResponse parseFromJson(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return parseFromJson(A0A);
    }
}
