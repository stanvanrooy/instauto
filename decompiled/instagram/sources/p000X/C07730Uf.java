package p000X;

import android.util.Pair;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Uf  reason: invalid class name and case insensitive filesystem */
public final class C07730Uf implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ C07890Uv A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;

    public C07730Uf(C07890Uv r1, Pair pair, Boolean bool, Integer num) {
        this.A01 = r1;
        this.A00 = pair;
        this.A02 = bool;
        this.A03 = num;
    }

    public final void run() {
        List list;
        try {
            Pair pair = this.A00;
            List<SubscribeTopic> list2 = null;
            if (pair != null) {
                list = (List) pair.first;
            } else {
                list = null;
            }
            if (pair != null) {
                list2 = (List) pair.second;
            }
            ArrayList arrayList = new ArrayList();
            if (list2 != null) {
                for (SubscribeTopic subscribeTopic : list2) {
                    arrayList.add(subscribeTopic.A01);
                }
            }
            byte[] convertForegroundStateWithSubscriptionToThriftPayload = this.A01.A0O.convertForegroundStateWithSubscriptionToThriftPayload((Long) null, this.A02, this.A03, list, arrayList);
            if (convertForegroundStateWithSubscriptionToThriftPayload != null && this.A01.A04("/t_fs", convertForegroundStateWithSubscriptionToThriftPayload, Constants.ONE, new C10640dd(this, list, list2)) < 0) {
            }
        } catch (C08040Vk unused) {
        }
    }
}
