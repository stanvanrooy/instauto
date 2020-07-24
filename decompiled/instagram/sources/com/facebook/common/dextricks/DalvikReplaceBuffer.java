package com.facebook.common.dextricks;

import android.os.Build;
import android.util.Log;
import p000X.AnonymousClass000;

public class DalvikReplaceBuffer {
    public static final String LOG_TAG = "DalvikReplaceBuffer";
    public static String failureReason = "";
    public static Result resultValue = Result.NOT_ATTEMPTED;

    public enum Result {
        NOT_ATTEMPTED,
        FAILURE,
        SUCCESS
    }

    public static String getFailureString() {
        if (resultValue == Result.FAILURE) {
            return failureReason;
        }
        throw new IllegalStateException("No failure string is provided when the operation did not fail.");
    }

    public static Result getResult() {
        return resultValue;
    }

    public static void replaceBuffer(DalvikLinearAllocType dalvikLinearAllocType) {
        if (resultValue != Result.NOT_ATTEMPTED) {
            Log.e(LOG_TAG, "Multiple attempts to replace the buffer detected!");
            return;
        }
        try {
            DalvikInternals.fixLinearAllocBuffer(dalvikLinearAllocType.bufferSizeBytes);
            resultValue = Result.SUCCESS;
        } catch (Throwable th) {
            resultValue = Result.FAILURE;
            failureReason = th.getMessage();
            Log.e(LOG_TAG, AnonymousClass000.A0A("Failed to replace LinearAlloc buffer (at size ", dalvikLinearAllocType.bufferSizeBytes, "). ", "Continuing with standard buffer."), th);
        }
    }

    public static boolean replaceBufferIfNecessary(DalvikLinearAllocType dalvikLinearAllocType) {
        if (Build.VERSION.SDK_INT >= 21) {
            return false;
        }
        replaceBuffer(dalvikLinearAllocType);
        return true;
    }
}
