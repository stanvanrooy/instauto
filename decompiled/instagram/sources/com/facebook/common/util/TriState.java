package com.facebook.common.util;

public enum TriState {
    YES,
    NO,
    UNSET;

    public static TriState fromDbValue(int i) {
        if (i == 1) {
            return YES;
        }
        if (i != 2) {
            return UNSET;
        }
        return NO;
    }

    public boolean isSet() {
        if (this != UNSET) {
            return true;
        }
        return false;
    }

    public Boolean asBooleanObject() {
        switch (ordinal()) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return Boolean.FALSE;
            case 2:
                return null;
            default:
                throw new IllegalStateException("Unrecognized TriState value: " + this);
        }
    }

    public int getDbValue() {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 3;
        }
    }

    public boolean asBoolean() {
        switch (ordinal()) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                throw new IllegalStateException("No boolean equivalent for UNSET");
            default:
                throw new IllegalStateException("Unrecognized TriState value: " + this);
        }
    }

    public boolean asBoolean(boolean z) {
        switch (ordinal()) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return z;
            default:
                throw new IllegalStateException("Unrecognized TriState value: " + this);
        }
    }

    public static TriState valueOf(Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    public static TriState valueOf(boolean z) {
        return z ? YES : NO;
    }
}
