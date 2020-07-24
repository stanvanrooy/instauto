package com.instagram.debug.devoptions.qpl;

import com.instagram.debug.devoptions.apiperf.QplDebugData;
import com.instagram.debug.devoptions.apiperf.QplPointDebugData;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000X.AnonymousClass0I7;
import p000X.AnonymousClass0ID;
import p000X.AnonymousClass0IF;
import p000X.C05770Lw;
import p000X.C10030cY;

public class DebugHeadQplListener extends C10030cY {
    public static DebugHeadQplListener sInstance;
    public DebugQplDelegate mDelegate;
    public int mLoomTriggerMarkerId = -1;
    public final Map mQplDebugDataCache;

    public interface DebugQplDelegate {
        void initializeFromCache(Map map);

        void onLoomTriggerMarkerEnd();

        void onLoomTriggerMarkerStart();

        void reportQplEventForDebug(AnonymousClass0ID r1);

        void reportQplMarkerPointForDebug(int i, String str, String str2, long j);
    }

    public String getName() {
        return "ig_debug_head";
    }

    public static synchronized DebugHeadQplListener getInstance() {
        DebugHeadQplListener debugHeadQplListener;
        synchronized (DebugHeadQplListener.class) {
            if (sInstance == null) {
                sInstance = new DebugHeadQplListener();
            }
            debugHeadQplListener = sInstance;
        }
        return debugHeadQplListener;
    }

    public void clearCache() {
        this.mDelegate.initializeFromCache(this.mQplDebugDataCache);
        this.mQplDebugDataCache.clear();
    }

    public void onMarkerCancel(AnonymousClass0ID r4) {
        DebugQplDelegate debugQplDelegate = this.mDelegate;
        if (debugQplDelegate != null) {
            debugQplDelegate.reportQplEventForDebug(r4);
            if (this.mLoomTriggerMarkerId == r4.A04) {
                this.mDelegate.onLoomTriggerMarkerEnd();
            }
        } else if (this.mQplDebugDataCache.containsKey(Integer.valueOf(r4.A0A))) {
            QplDebugData qplDebugData = (QplDebugData) this.mQplDebugDataCache.get(Integer.valueOf(r4.A0A));
            qplDebugData.updateData(r4);
            this.mQplDebugDataCache.put(Integer.valueOf(qplDebugData.mUniqueIdentifier), qplDebugData);
        }
    }

    public void onMarkerPoint(AnonymousClass0ID r8, String str, AnonymousClass0I7 r10, long j, long j2, boolean z, int i) {
        DebugQplDelegate debugQplDelegate = this.mDelegate;
        String str2 = "";
        String str3 = str;
        long j3 = j;
        if (debugQplDelegate != null) {
            int i2 = r8.A0A;
            if (r10 != null) {
                str2 = r10.toString();
            }
            debugQplDelegate.reportQplMarkerPointForDebug(i2, str2, str3, j3);
        } else if (this.mQplDebugDataCache.containsKey(Integer.valueOf(r8.A0A))) {
            QplDebugData qplDebugData = (QplDebugData) this.mQplDebugDataCache.get(Integer.valueOf(r8.A0A));
            qplDebugData.updateData(r8);
            if (r10 != null) {
                str2 = r10.toString();
            }
            qplDebugData.addPoint(new QplPointDebugData(str2, str, j));
            this.mQplDebugDataCache.put(Integer.valueOf(qplDebugData.mUniqueIdentifier), qplDebugData);
        }
    }

    public void onMarkerStart(AnonymousClass0ID r4) {
        DebugQplDelegate debugQplDelegate = this.mDelegate;
        if (debugQplDelegate != null) {
            debugQplDelegate.reportQplEventForDebug(r4);
            if (this.mLoomTriggerMarkerId == r4.A04) {
                this.mDelegate.onLoomTriggerMarkerStart();
                return;
            }
            return;
        }
        this.mQplDebugDataCache.put(Integer.valueOf(r4.A0A), new QplDebugData(r4));
    }

    public void onMarkerStop(AnonymousClass0ID r4) {
        DebugQplDelegate debugQplDelegate = this.mDelegate;
        if (debugQplDelegate != null) {
            debugQplDelegate.reportQplEventForDebug(r4);
            if (this.mLoomTriggerMarkerId == r4.A04) {
                this.mDelegate.onLoomTriggerMarkerEnd();
            }
        } else if (this.mQplDebugDataCache.containsKey(Integer.valueOf(r4.A0A))) {
            QplDebugData qplDebugData = (QplDebugData) this.mQplDebugDataCache.get(Integer.valueOf(r4.A0A));
            qplDebugData.updateData(r4);
            this.mQplDebugDataCache.put(Integer.valueOf(qplDebugData.mUniqueIdentifier), qplDebugData);
        }
    }

    public DebugHeadQplListener() {
        Map emptyMap;
        if (C05770Lw.A00().A0L()) {
            emptyMap = new ConcurrentHashMap();
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.mQplDebugDataCache = emptyMap;
    }

    public AnonymousClass0IF getListenerMarkers() {
        if (!C05770Lw.A00().A0L()) {
            return AnonymousClass0IF.A05;
        }
        return new AnonymousClass0IF(new int[]{-1}, (int[]) null);
    }

    public void registerDelegate(DebugQplDelegate debugQplDelegate) {
        this.mDelegate = debugQplDelegate;
    }

    public void setLoomTriggerMarker(int i) {
        this.mLoomTriggerMarkerId = i;
    }
}
