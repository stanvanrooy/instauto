package com.instagram.debug.devoptions.eventvisualizer;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0RZ;
import p000X.AnonymousClass0ZA;
import p000X.C12670hC;
import p000X.C241613n;
import p000X.C28261La;

public class EventVisualizerLogger implements AnonymousClass0RZ {
    public static EventVisualizerLogger sInstance;
    public final C241613n mBuffer = new C241613n(200);
    public final C241613n mData = new C241613n(200);
    public final C28261La mFilterPredicate = new C28261La() {
        public boolean apply(EventData eventData) {
            if (eventData == null) {
                return false;
            }
            if (!EventVisualizerLogger.this.mFilters.isEmpty()) {
                Iterator it = EventVisualizerLogger.this.mFilters.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!eventData.mName.contains(str)) {
                        if (eventData.mDebugString.contains(str)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }
    };
    public final ArrayList mFilters = new ArrayList();
    public EventDataListener mListener;
    public final Handler mUiThreadHandler = new Handler(Looper.getMainLooper());

    public interface EventDataListener {
        void onNewEventsAdded(EventData eventData);
    }

    public class EventData {
        public final String mDebugString;
        public final String mName;

        public EventData(String str, String str2) {
            this.mName = str;
            this.mDebugString = str2;
        }

        public String getDebugString() {
            return this.mDebugString;
        }

        public String getName() {
            return this.mName;
        }
    }

    public static EventVisualizerLogger getInstance() {
        if (sInstance == null) {
            sInstance = new EventVisualizerLogger();
        }
        return sInstance;
    }

    public void onDebugEventReceived(AnonymousClass0P4 r5) {
        final EventData eventData = new EventData(r5.A04, r5.BrO().A00);
        AnonymousClass0ZA.A0E(this.mUiThreadHandler, new Runnable() {
            public void run() {
                EventVisualizerLogger.this.mData.A05(eventData);
                EventVisualizerLogger.this.mBuffer.A05(eventData);
                if (EventVisualizerLogger.this.mListener != null) {
                    while (!EventVisualizerLogger.this.mBuffer.A06()) {
                        EventData eventData = (EventData) EventVisualizerLogger.this.mBuffer.A01();
                        if (EventVisualizerLogger.this.mFilterPredicate.apply(eventData)) {
                            EventVisualizerLogger.this.mListener.onNewEventsAdded(eventData);
                        }
                    }
                }
            }
        }, -1163048426);
    }

    public void requestFilteredData() {
        C12670hC.A02();
        Iterator it = this.mData.A03().iterator();
        while (it.hasNext()) {
            EventData eventData = (EventData) it.next();
            if (this.mFilterPredicate.apply(eventData)) {
                EventDataListener eventDataListener = this.mListener;
                if (eventDataListener != null) {
                    eventDataListener.onNewEventsAdded(eventData);
                } else {
                    throw new RuntimeException("EventDataListener is null");
                }
            }
        }
    }

    public void setBufferListener(EventDataListener eventDataListener) {
        this.mListener = eventDataListener;
    }

    public void updateFilters(List list) {
        C12670hC.A02();
        this.mFilters.clear();
        this.mFilters.addAll(list);
    }
}
