package p000X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0cy  reason: invalid class name and case insensitive filesystem */
public class C10290cy implements AnonymousClass0WZ {
    public byte[] convertForegroundStateWithSubscriptionToThriftPayload(Long l, Boolean bool, Integer num, List list, List list2) {
        return null;
    }

    public List getConnectSubscribeTopics(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SubscribeTopic subscribeTopic = (SubscribeTopic) it.next();
            if (((Integer) AnonymousClass0TB.A01.get(subscribeTopic.A01)) != null) {
                arrayList.add(subscribeTopic);
            }
        }
        return arrayList;
    }

    public int handleConnectMessage(DataOutputStream dataOutputStream, C10350dA r14) {
        Long valueOf;
        AnonymousClass0W2 r2 = r14.A00;
        AnonymousClass0W1 A03 = r14.A03();
        C08190Vz A02 = r14.A02();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        AnonymousClass0TD r4 = new AnonymousClass0TD(byteArrayOutputStream);
        AnonymousClass0W0 r7 = A02.A01;
        AnonymousClass0WA r10 = new AnonymousClass0WA(Constants.ZERO);
        r10.A02(AnonymousClass0W8.A0P, r7.A0C);
        r10.A02(AnonymousClass0W8.A0O, r7.A0J);
        r10.A02(AnonymousClass0W8.A01, r7.A08);
        r10.A02(AnonymousClass0W8.A09, r7.A0A);
        r10.A02(AnonymousClass0W8.A0L, Integer.valueOf(r7.A00));
        r10.A02(AnonymousClass0W8.A0J, r7.A04);
        r10.A02(AnonymousClass0W8.A0G, r7.A02);
        r10.A02(AnonymousClass0W8.A07, r7.A0H);
        r10.A02(AnonymousClass0W8.A0E, r7.A03);
        r10.A02(AnonymousClass0W8.A0I, r7.A07);
        r10.A02(AnonymousClass0W8.A0H, r7.A06);
        r10.A02(AnonymousClass0W8.A03, r7.A0B);
        r10.A02(AnonymousClass0W8.A02, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (String str : r7.A0K) {
            Integer num = (Integer) AnonymousClass0TB.A01.get(str);
            if (num != null) {
                arrayList.add(num);
            }
        }
        r10.A02(AnonymousClass0W8.A0N, arrayList);
        r10.A02(AnonymousClass0W8.A05, r7.A0E);
        AnonymousClass0TF r3 = AnonymousClass0W8.A00;
        String str2 = r7.A0D;
        if (str2 == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(str2));
        }
        r10.A02(r3, valueOf);
        r10.A02(AnonymousClass0W8.A0K, (Object) null);
        r10.A02(AnonymousClass0W8.A06, (Object) null);
        r10.A02(AnonymousClass0W8.A0M, r7.A0G);
        r10.A02(AnonymousClass0W8.A08, r7.A0I);
        r10.A02(AnonymousClass0W8.A04, r7.A05);
        r10.A02(AnonymousClass0W8.A0F, r7.A09);
        AnonymousClass0WA r32 = new AnonymousClass0WA(Constants.A0Y);
        r32.A02(AnonymousClass0W8.A0U, A02.A02);
        r32.A02(AnonymousClass0W8.A0b, A02.A05);
        r32.A02(AnonymousClass0W8.A0a, A02.A04);
        r32.A02(AnonymousClass0W8.A0V, r10);
        r32.A02(AnonymousClass0W8.A0Y, A02.A03);
        r32.A02(AnonymousClass0W8.A0X, (Object) null);
        r32.A02(AnonymousClass0W8.A0Z, (Object) null);
        r32.A02(AnonymousClass0W8.A0W, (Object) null);
        r32.A02(AnonymousClass0W8.A0c, (Object) null);
        r32.A02(AnonymousClass0W8.A0T, r7.A0L);
        r32.A01(r4);
        byte[] A00 = C09070Zz.A00(byteArrayOutputStream.toByteArray());
        int length = A00.length;
        int i = length + 12;
        dataOutputStream.writeByte(AnonymousClass0WT.A01(r2));
        int A022 = AnonymousClass0WT.A02(dataOutputStream, i) + 1;
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(6);
        dataOutputStream.writeByte(77);
        dataOutputStream.writeByte(81);
        dataOutputStream.writeByte(84);
        dataOutputStream.writeByte(84);
        dataOutputStream.writeByte(111);
        dataOutputStream.writeByte(84);
        dataOutputStream.write(A03.A01);
        dataOutputStream.write(AnonymousClass0WT.A00(A03));
        dataOutputStream.writeShort(A03.A00);
        dataOutputStream.write(A00, 0, length);
        dataOutputStream.flush();
        return A022 + i;
    }
}
