package com.facebook.react.bridge;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000X.A3L;
import p000X.AnonymousClass90K;
import p000X.AnonymousClass90M;

public class ReactMarker {
    public static final List sFabricMarkerListeners = new CopyOnWriteArrayList();
    public static final List sListeners = new CopyOnWriteArrayList();

    public static void addFabricListener(AnonymousClass90M r1) {
        if (!sFabricMarkerListeners.contains(r1)) {
            sFabricMarkerListeners.add(r1);
        }
    }

    public static void addListener(AnonymousClass90K r1) {
        if (!sListeners.contains(r1)) {
            sListeners.add(r1);
        }
    }

    public static void clearFabricMarkerListeners() {
        sFabricMarkerListeners.clear();
    }

    public static void clearMarkerListeners() {
        sListeners.clear();
    }

    public static void removeFabricListener(AnonymousClass90M r1) {
        sFabricMarkerListeners.remove(r1);
    }

    public static void removeListener(AnonymousClass90K r1) {
        sListeners.remove(r1);
    }

    public static void logFabricMarker(A3L a3l, String str, int i) {
        logFabricMarker(a3l, str, i, -1);
    }

    public static void logFabricMarker(A3L a3l, String str, int i, long j) {
        Iterator it = sFabricMarkerListeners.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public static void logMarker(A3L a3l) {
        logMarker(a3l, (String) null, 0);
    }

    public static void logMarker(A3L a3l, int i) {
        logMarker(a3l, (String) null, i);
    }

    public static void logMarker(A3L a3l, String str) {
        logMarker(a3l, str, 0);
    }

    public static void logMarker(A3L a3l, String str, int i) {
        logFabricMarker(a3l, str, i);
        for (AnonymousClass90K AmK : sListeners) {
            AmK.AmK(a3l, str, i);
        }
    }

    public static void logMarker(String str) {
        logMarker(str, (String) null, 0);
    }

    public static void logMarker(String str, int i) {
        logMarker(str, (String) null, i);
    }

    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    public static void logMarker(String str, String str2, int i) {
        logMarker(A3L.valueOf(str), str2, i);
    }
}
