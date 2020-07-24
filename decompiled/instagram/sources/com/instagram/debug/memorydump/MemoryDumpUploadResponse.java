package com.instagram.debug.memorydump;

import p000X.C28701Mt;

public class MemoryDumpUploadResponse extends C28701Mt {
    public boolean success;

    public boolean isOk() {
        if (!super.isOk() || !this.success) {
            return false;
        }
        return true;
    }
}
