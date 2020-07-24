package com.facebook.common.classmarkers;

import android.util.Log;

public final class ClassMarkerLoader {
    public static final String TAG = "ClassMarkerLoader";

    public static void loadClass(String str) {
        try {
            Class.forName(str);
            String.format("Class %s was loaded", new Object[]{str});
        } catch (ClassNotFoundException e) {
            Log.e(TAG, String.format("Class %s not found", new Object[]{str}), e);
        }
    }

    public static void loadColdStartClassPreloadingStartMarker() {
        loadClass("com.facebook.common.classmarkers.ColdStartClassPreloadingMarkerStart");
    }

    public static void loadColdStartDDRunMarker() {
        loadClass("com.facebook.common.classmarkers.IsColdStartDDRun");
    }

    public static void loadColdStartTTIRunMarker() {
        loadClass("com.facebook.common.classmarkers.IsColdStartTTIRun");
    }

    public static void loadIsBackgroundRestartFinishMarker() {
        loadClass("com.facebook.common.classmarkers.IsBackgroundRestartFinish");
    }

    public static void loadIsClassPreloadRunMarker() {
        loadClass("com.facebook.common.classmarkers.IsClassPreloadRun");
    }

    public static void loadIsColdStartRunMarker() {
        loadClass("com.facebook.common.classmarkers.IsColdStartRun");
    }

    public static void loadIsMessengerStartToInboxFinishMarker() {
        loadClass("com.facebook.common.classmarkers.IsMessengerStartToInboxFinish");
    }

    public static void loadIsMessengerStartupBeginMarker() {
        loadClass("com.facebook.common.classmarkers.IsMessengerStartupBegin");
    }

    public static void loadIsNotColdStartRunMarker() {
        loadClass("com.facebook.common.classmarkers.IsNotColdStartRun");
    }

    public static void loadLiteLoginMessageSentMarker() {
        loadClass("com.facebook.common.classmarkers.LiteLoginMessageSent");
    }

    public static void loadLiteSessionMessageReceived() {
        loadClass("com.facebook.common.classmarkers.LiteSessionMessageReceived");
    }

    public static void loadMessengerStartToThreadFinishMarker() {
        loadClass("com.facebook.common.classmarkers.IsMessengerStartToThreadFinish");
    }

    public static void loadMessengerThreadListToThreadViewEndMarker() {
        loadClass("com.facebook.common.classmarkers.IsMessengerThreadListToThreadViewEnd");
    }

    public static void loadMessengerThreadListToThreadViewNotPreloadedMarker() {
        loadClass("com.facebook.common.classmarkers.IsMessengerThreadListToThreadViewNotPreloaded");
    }

    public static void loadMessengerThreadListToThreadViewPreLoadedMarker() {
        loadClass("com.facebook.common.classmarkers.IsMessengerThreadListToThreadViewPreLoaded");
    }

    public static void loadMessengerThreadListToThreadViewPreRenderedMarker() {
        loadClass("com.facebook.common.classmarkers.IsMessengerThreadListToThreadViewPreRendered");
    }

    public static void loadMessengerThreadListToThreadViewStartMarker() {
        loadClass("com.facebook.common.classmarkers.IsMessengerThreadListToThreadViewStart");
    }

    public static void loadMessengerWarmStartupBeginMarker() {
        loadClass("com.facebook.common.classmarkers.IsMessengerWarmStartBegin");
    }

    public static void loadStoriesColdStartTTIRunMarker() {
        loadClass("com.facebook.common.classmarkers.IsStoriesColdStartTTIRun");
    }
}
