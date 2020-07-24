package p000X;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0xr  reason: invalid class name and case insensitive filesystem */
public final class C22110xr extends C22120xs {
    public final C220999fd A02() {
        return new C220999fd();
    }

    public final void A07(AnonymousClass0C1 r5, C226809pT r6) {
        AnonymousClass4C2 r3 = new AnonymousClass4C2(r5);
        C15890nh r2 = new C15890nh(r5);
        r2.A09 = Constants.ONE;
        r2.A0C = "fbsearch/clear_search_history/";
        r2.A09("type", C226809pT.A00(r6));
        r2.A06(AnonymousClass1N4.class, false);
        C17850qu A03 = r2.A03();
        A03.A00 = r3;
        C12810hQ.A02(A03);
    }

    public final void A03(AnonymousClass0C1 r3) {
        AnonymousClass5JH A00 = AnonymousClass5JH.A00(r3);
        synchronized (A00) {
            A00.A00.A03();
        }
    }

    public final void A04(AnonymousClass0C1 r2) {
        C28285CeR.A00(r2).A00.A03();
    }

    public final void A05(AnonymousClass0C1 r3) {
        C1665878q A00 = C1665878q.A00(r3);
        if (A00.A03) {
            A00.A00.A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0087, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6.A00.A03();
     */
    public final void A06(AnonymousClass0C1 r10) {
        C1665878q.A00(r10).A01.A01();
        if (!C28432Cgo.A01) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            long j = C28432Cgo.A00;
            if (j == -1 || currentThreadTimeMillis < j || currentThreadTimeMillis - j > 86400000) {
                C28432Cgo.A01 = true;
                C15890nh r2 = new C15890nh(r10);
                r2.A09 = Constants.A0N;
                r2.A0C = "fbsearch/recent_searches/";
                r2.A06(C28260Ce1.class, false);
                C17850qu A03 = r2.A03();
                A03.A00 = new C28243Cdk(r10);
                C12810hQ.A02(A03);
            }
        }
        if (((Boolean) AnonymousClass0L6.A03(r10, AnonymousClass0L7.CAMERA_ANDROID_GALLERY_SEARCH, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C28289CeV A00 = C28289CeV.A00(r10);
            synchronized (A00) {
                List A01 = A00.A01();
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = A01.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (currentTimeMillis - ((C28085Cb9) it.next()).A02 > 86400000) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        long j2 = C16180oA.A00(r10).A00.getLong("recent_items_last_sycned_timestamp_ms", 0);
        long currentTimeMillis2 = System.currentTimeMillis();
        if (j2 != 0 && currentTimeMillis2 - j2 > 86400000) {
            C16180oA.A00(r10).A07();
            C16180oA.A00(r10).A08();
            C16180oA.A00(r10).A0A();
            C16180oA.A00(r10).A00.edit().remove("recent_keyword_searches_with_ts").apply();
        }
    }

    public final void A08(AnonymousClass0C1 r2, C226809pT r3) {
        switch (r3.ordinal()) {
            case 0:
                C1665878q.A00(r2).A02();
                return;
            case 1:
                C1665878q.A00(r2).A02.A00();
                return;
            default:
                return;
        }
    }
}
