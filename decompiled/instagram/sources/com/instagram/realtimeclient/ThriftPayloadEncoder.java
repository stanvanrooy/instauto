package com.instagram.realtimeclient;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p000X.AnonymousClass0TB;
import p000X.C10290cy;
import p000X.C205528r0;
import p000X.C59042gw;
import p000X.C59052gx;
import p000X.C59072gz;
import p000X.C59102h2;
import p000X.C59112h3;
import p000X.C62712oF;

public class ThriftPayloadEncoder extends C10290cy {
    public static C59072gz buildForegroundState(Long l, Boolean bool, Integer num, List list, List list2) {
        LinkedList linkedList;
        LinkedList linkedList2;
        LinkedList linkedList3;
        LinkedList linkedList4 = null;
        if (list != null) {
            Iterator it = list.iterator();
            linkedList2 = null;
            linkedList = null;
            while (it.hasNext()) {
                SubscribeTopic subscribeTopic = (SubscribeTopic) it.next();
                Integer num2 = (Integer) AnonymousClass0TB.A01.get(subscribeTopic.A01);
                if (num2 != null) {
                    if (linkedList2 == null) {
                        linkedList2 = new LinkedList();
                    }
                    linkedList2.add(num2);
                } else {
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                    }
                    linkedList.add(new C205528r0(subscribeTopic.A01, Integer.valueOf(subscribeTopic.A00)));
                }
            }
        } else {
            linkedList2 = null;
            linkedList = null;
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            linkedList3 = null;
            while (it2.hasNext()) {
                String str = (String) it2.next();
                Integer num3 = (Integer) AnonymousClass0TB.A01.get(str);
                if (num3 != null) {
                    if (linkedList4 == null) {
                        linkedList4 = new LinkedList();
                    }
                    linkedList4.add(num3);
                } else {
                    if (linkedList3 == null) {
                        linkedList3 = new LinkedList();
                    }
                    linkedList3.add(str);
                }
            }
        } else {
            linkedList3 = null;
        }
        return new C59072gz(bool, num, linkedList2, linkedList, linkedList4, linkedList3, l);
    }

    public byte[] convertForegroundStateWithSubscriptionToThriftPayload(Long l, Boolean bool, Integer num, List list, List list2) {
        C59042gw r4 = new C59042gw(new C59052gx());
        C59072gz buildForegroundState = buildForegroundState(l, bool, num, list, list2);
        C59102h2 r3 = new C59102h2((String) null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            r3.BuO(r4.A00.ATG(new C59112h3(byteArrayOutputStream)));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            buildForegroundState.BuO(r4.A00.ATG(new C59112h3(byteArrayOutputStream2)));
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            int length = byteArray.length;
            int length2 = byteArray2.length;
            byte[] copyOf = Arrays.copyOf(byteArray, length + length2);
            System.arraycopy(byteArray2, 0, copyOf, length, length2);
            return copyOf;
        } catch (C62712oF unused) {
            return null;
        }
    }
}
