package p000X;

import android.content.Context;
import android.os.Looper;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.debug.memorydump.MemoryDumpCreator;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.0bB  reason: invalid class name and case insensitive filesystem */
public final class C09300bB extends C09790c1 {
    public final Context A00;

    public C09300bB(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static void A00(C09300bB r9) {
        AnonymousClass0QT A002;
        C06590Pq A01 = AnonymousClass0J1.A01(r9);
        boolean AgN = A01.AgN();
        boolean z = false;
        if (AgN) {
            AnonymousClass0C1 A02 = C05210Iq.A02(A01);
            AnonymousClass0GK.A01(r9.A00, A02.A04());
            ReelStore A0Q = C17020pY.A00().A0Q(A02);
            if (!(A0Q.A00 == null && A0Q.A03 == null)) {
                A0Q.A0N();
            }
            AnonymousClass173 r2 = new AnonymousClass173(A0Q);
            A0Q.A00 = r2;
            A0Q.A07.A02(AnonymousClass14J.class, r2);
            ReelStore.A03(A0Q, A0Q.A0A.A06);
            A0Q.A03 = new AnonymousClass17O(A0Q);
            AnonymousClass14Q A022 = AnonymousClass14Q.A02(A0Q.A0A);
            AnonymousClass17O r1 = A0Q.A03;
            synchronized (A022) {
                if (!A022.A0P.contains(r1)) {
                    A022.A0P.add(r1);
                }
            }
            AnonymousClass14Q.A02(A0Q.A0A).A0N(new AnonymousClass17P(A0Q));
            AnonymousClass0aF r12 = new AnonymousClass0aF(r9, A02);
            if (Looper.myLooper() != null) {
                r12.run();
            } else {
                C12670hC.A04(r12);
            }
            AnonymousClass17R A003 = AnonymousClass17R.A00();
            A003.A01 = true;
            A003.A00 = "REQUEST";
            AnonymousClass00B.A01.A0M(25624577, 500);
            AnonymousClass0ZA.A07(A003.A02, (Object) null);
            C15730nR A004 = C15730nR.A00();
            AnonymousClass0L7 r6 = AnonymousClass0L7.PHOTOS_QPL_CONFIG;
            if (((Boolean) AnonymousClass0L6.A02(A02, r6, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                z = true;
            }
            A004.A03(z, ((Integer) AnonymousClass0L6.A02(A02, r6, "sampling_rate", 100, (AnonymousClass04H) null)).intValue());
            MemoryDumpCreator.maybeUpdateUserId(A02.A04());
            PendingMediaStoreSerializer.A00(A02).A03(new AnonymousClass0aD(r9, A02));
            AnonymousClass17T r22 = new AnonymousClass17T(A02);
            synchronized (AnonymousClass17U.class) {
                if (AnonymousClass17U.A07 != r22) {
                    AnonymousClass17U.A07 = r22;
                }
            }
            AnonymousClass17X.A00 = new AnonymousClass17V(A02);
        } else {
            AnonymousClass0GK.A01(r9.A00, "0");
            AnonymousClass17R A005 = AnonymousClass17R.A00();
            A005.A01 = false;
            A005.A00 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            AnonymousClass00B.A01.A0M(25624577, 1);
            AnonymousClass0ZA.A07(A005.A02, (Object) null);
            C15730nR.A00().A03(false, 1);
        }
        AnonymousClass0RU A012 = AnonymousClass0WN.A01(A01);
        AnonymousClass0SR r13 = AnonymousClass0SS.A00;
        synchronized (r13) {
            r13.A00 = A012;
        }
        Class<AnonymousClass17Y> cls = AnonymousClass17Y.class;
        synchronized (cls) {
            AnonymousClass17Y r0 = AnonymousClass17Y.A06;
            if (r0 != null) {
                r0.A03.A01 = A012;
            }
        }
        synchronized (cls) {
            A002 = AnonymousClass0QT.A00(A01, new AnonymousClass17Z());
        }
        AnonymousClass17Y.A01(A002);
        C14820ln.A02.A00 = A012;
        C12600h4 A006 = C12600h4.A00();
        Boolean valueOf = Boolean.valueOf(AgN);
        AnonymousClass0h8 r14 = A006.A00;
        if (r14 != null) {
            r14.A06 = valueOf.booleanValue();
        }
        AnonymousClass0Q7.A03();
        AnonymousClass0Q7.A07 = A01;
        AnonymousClass0Q7 r02 = AnonymousClass0Q7.A06;
        if (r02 != null) {
            r02.A0E(A01);
        }
    }

    public final void A07() {
        int A03 = AnonymousClass0Z0.A03(-1488318517);
        A00(this);
        C11130eT.A00().A02(AnonymousClass0J3.class, new AnonymousClass0aC(this));
        AnonymousClass0Z0.A0A(1747337206, A03);
    }
}
