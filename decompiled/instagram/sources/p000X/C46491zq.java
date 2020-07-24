package p000X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: X.1zq  reason: invalid class name and case insensitive filesystem */
public final class C46491zq {
    public static C46491zq A02;
    public Handler A00 = new Handler(Looper.getMainLooper());
    public final HashMap A01 = new HashMap();

    public final void A00(C36841ih r4) {
        int hashCode = r4.hashCode();
        HashMap hashMap = this.A01;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) hashMap.get(valueOf);
        if (runnable != null) {
            AnonymousClass0ZA.A08(this.A00, runnable);
            this.A01.remove(valueOf);
        }
    }
}
