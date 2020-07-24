package com.facebook.cameracore.ardelivery.xplatcache;

public enum ARDFileInMemoryStatus {
    IN_CACHE,
    NOT_IN_CACHE,
    MAYBE;

    public static ARDFileInMemoryStatus fromOrdinal(int i) {
        if (i == 0) {
            return IN_CACHE;
        }
        if (i == 1 || i != 2) {
            return NOT_IN_CACHE;
        }
        return MAYBE;
    }
}
