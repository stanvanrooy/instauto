package p000X;

import com.instagram.reels.store.ReelStore;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1u5  reason: invalid class name and case insensitive filesystem */
public final class C43251u5 extends C17920r1 {
    public AnonymousClass12K A00;
    public final C43221u2 A01;
    public final AnonymousClass0C1 A02;
    public final Set A03;

    public C43251u5(AnonymousClass0C1 r1, Set set, C43221u2 r3, AnonymousClass12K r4) {
        this.A02 = r1;
        this.A03 = set;
        this.A01 = r3;
        this.A00 = r4;
    }

    public final void onFail(C43791v5 r4) {
        int A032 = AnonymousClass0Z0.A03(-927218446);
        this.A01.A01(this.A03);
        AnonymousClass0Z0.A0A(-1355240751, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        if (p000X.AnonymousClass17M.A00(r0.A06, r7.A01(r0).AZf()) == false) goto L_0x005c;
     */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        boolean z;
        int A032 = AnonymousClass0Z0.A03(387716781);
        C470121x r10 = (C470121x) obj;
        int A033 = AnonymousClass0Z0.A03(1099468416);
        HashMap hashMap = r10.A05;
        HashMap hashMap2 = new HashMap();
        for (String str2 : hashMap.keySet()) {
            C33971dn r7 = (C33971dn) hashMap.get(str2);
            if (r7 != null) {
                if (r7.A01(this.A02) != null && r7.A01(this.A02).AZG() == Constants.ONE) {
                    AnonymousClass0C1 r0 = this.A02;
                    z = true;
                }
                z = false;
                hashMap2.put(str2, ReelStore.A02(this.A02).A0F(r7, z));
            }
        }
        hashMap2.keySet();
        this.A01.A00(hashMap2);
        HashSet hashSet = new HashSet(this.A03);
        hashSet.removeAll(hashMap2.keySet());
        if (!hashSet.isEmpty()) {
            this.A01.A01(hashSet);
        }
        AX3 ax3 = r10.A00;
        if (ax3 == null) {
            str = null;
        } else {
            str = ax3.A00;
        }
        if (str == null) {
            str = (String) AnonymousClass0L6.A02(this.A02, AnonymousClass0L7.BD_PD_LAUNCHER, "test_ch", "{}", (AnonymousClass04H) null);
        }
        AnonymousClass12K r02 = this.A00;
        if (!(r02 == null || str == null)) {
            r02.A01(str);
        }
        AnonymousClass0Z0.A0A(-2058007612, A033);
        AnonymousClass0Z0.A0A(-821274313, A032);
    }
}
