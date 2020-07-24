package com.facebook.react.animated;

import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.List;
import p000X.ABP;
import p000X.C206608tl;
import p000X.C228259s1;
import p000X.C23043A0y;

public class EventAnimationDriver implements RCTEventEmitter {
    public List mEventPath;
    public ABP mValueNode;

    public void receiveEvent(int i, String str, C228259s1 r6) {
        if (r6 != null) {
            int i2 = 0;
            C23043A0y a0y = r6;
            while (i2 < this.mEventPath.size() - 1) {
                i2++;
                a0y = a0y.getMap((String) this.mEventPath.get(i2));
            }
            ABP abp = this.mValueNode;
            List list = this.mEventPath;
            abp.A01 = a0y.getDouble((String) list.get(list.size() - 1));
            return;
        }
        throw new IllegalArgumentException("Native animated events must have event data.");
    }

    public void receiveTouches(String str, C206608tl r4, C206608tl r5) {
        throw new RuntimeException("receiveTouches is not support by native animated events");
    }

    public EventAnimationDriver(List list, ABP abp) {
        this.mEventPath = list;
        this.mValueNode = abp;
    }
}
