package p000X;

import android.os.RemoteException;
import android.util.LruCache;
import com.facebook.video.heroplayer.client.WarmupPool$2;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;

/* renamed from: X.1p3  reason: invalid class name and case insensitive filesystem */
public final class C40681p3 extends LruCache {
    public final /* synthetic */ C40641oz A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40681p3(C40641oz r1, int i) {
        super(i);
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        C40691p4 r0;
        C45931yr r7 = (C45931yr) obj2;
        if (z) {
            HeroPlayerServiceApi heroPlayerServiceApi = this.A00.A02.A00.A0K;
            if (heroPlayerServiceApi == null) {
                r0 = r7.A01;
                if (r0 == null) {
                    return;
                }
            } else {
                try {
                    heroPlayerServiceApi.BaW(r7.A00, new WarmupPool$2(heroPlayerServiceApi, r7));
                    return;
                } catch (RemoteException e) {
                    C40431oe.A05("WarmupPool", e, "RemoteException when release player surface", new Object[0]);
                    r0 = r7.A01;
                    if (r0 == null) {
                        return;
                    }
                }
            }
            r0.release();
        }
    }
}
