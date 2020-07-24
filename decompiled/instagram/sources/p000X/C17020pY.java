package p000X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.MicroUser;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0pY  reason: invalid class name and case insensitive filesystem */
public abstract class C17020pY {
    public static volatile C17020pY A00;

    public abstract int A04();

    public abstract C17850qu A05(AnonymousClass0C1 r1);

    public abstract C17850qu A06(AnonymousClass0C1 r1, Integer num, Integer num2, boolean z, C17750qk r5);

    public abstract C17850qu A07(AnonymousClass0C1 r1, String str);

    public abstract C17850qu A08(AnonymousClass0C1 r1, List list, long j);

    public abstract C17850qu A09(AnonymousClass0C1 r1, List list, List list2);

    public abstract C17850qu A0A(String str, AnonymousClass0C1 r2);

    public abstract C17850qu A0B(Set set, Map map, AnonymousClass0C1 r3, String str);

    public abstract C37121j9 A0C(AnonymousClass0C1 r1, String str, String str2, Reel reel, int i, int i2);

    public abstract Reel A0D(AnonymousClass0C1 r1, C13300iJ r2);

    public abstract Reel A0E(AnonymousClass0C1 r1, C13300iJ r2);

    public abstract Reel A0F(AnonymousClass0C1 r1, C13300iJ r2, Long l);

    public abstract C28971Oc A0G(AnonymousClass0C1 r1, AnonymousClass0RN r2, String str);

    public abstract C64872sB A0H(AnonymousClass0C1 r1);

    public abstract AnonymousClass1WN A0I(AnonymousClass1HD r1, AnonymousClass0C1 r2, AnonymousClass1D1 r3);

    public abstract C17040pa A0J();

    public abstract C64922sG A0K();

    public abstract AnonymousClass2E0 A0L(AnonymousClass0C1 r1);

    public abstract C31591Yx A0M(AnonymousClass0C1 r1);

    public abstract C476324u A0N(Context context, AnonymousClass2E0 r2, Reel reel, AnonymousClass0C1 r4, C51472Ku r5, String str);

    public abstract C39711nM A0O(AnonymousClass0C1 r1);

    public abstract AnonymousClass5MN A0P(AnonymousClass0C1 r1);

    public abstract ReelStore A0Q(AnonymousClass0C1 r1);

    public abstract C73053Ie A0R();

    public abstract C250016x A0S(AnonymousClass0C1 r1);

    public abstract C34071dx A0T(Activity activity);

    public abstract C34071dx A0U(Activity activity, ViewGroup viewGroup, AnonymousClass0C1 r3);

    public abstract C34071dx A0V(Activity activity, AnonymousClass0C1 r2);

    public abstract C34071dx A0W(String str);

    public abstract C34091e1 A0X(Context context, AnonymousClass0C1 r2);

    public abstract void A0Y();

    public abstract void A0Z(Activity activity);

    public abstract void A0a(AnonymousClass0C1 r1, Activity activity, AnonymousClass1HD r3, AnonymousClass1NJ r4, boolean z, String str);

    public abstract void A0b(AnonymousClass0C1 r1, Activity activity, String str, AnonymousClass24Q r4, MicroUser microUser);

    public abstract void A0c(AnonymousClass0C1 r1, Reel reel, int i, AnonymousClass1OY r4);

    public abstract void A0d(AnonymousClass0C1 r1, String str, List list, C99014Pz r4);

    public abstract boolean A0e(AnonymousClass0C1 r1, C13300iJ r2);

    public abstract boolean A0f(Object obj);

    public abstract boolean A0g(Object obj);

    public static C17020pY A00() {
        C17020pY r1 = A00;
        AnonymousClass0a4.A07(r1, "Error! Trying to access ReelsPlugin without an instance!");
        return r1;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:373)
        	at java.base/java.util.ArrayList.get(ArrayList.java:425)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized p000X.C17020pY A01() {
        /*
            java.lang.Class<X.0pY> r2 = p000X.C17020pY.class
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0018 }
            X.0pY r1 = A00     // Catch:{ all -> 0x0015 }
            r0 = 0
            if (r1 == 0) goto L_0x000a
            r0 = 1
        L_0x000a:
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0012
            X.0pY r0 = A00()     // Catch:{ all -> 0x0018 }
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            monitor-exit(r2)
            return r0
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r0     // Catch:{ all -> 0x0018 }
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C17020pY.A01():X.0pY");
    }

    public static synchronized void A02(C17020pY r2) {
        synchronized (C17020pY.class) {
            if (A00 == null) {
                A00 = r2;
                A00.A0Y();
            }
        }
    }

    public static boolean A03(C476324u r1, Reel reel) {
        if (r1 == null || !r1.A04 || !r1.A08.equals(reel)) {
            return true;
        }
        return false;
    }
}
