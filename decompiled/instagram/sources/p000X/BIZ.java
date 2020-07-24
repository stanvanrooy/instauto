package p000X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.BIZ */
public final class BIZ extends C27291Hg implements AnonymousClass19r, C25437BKa, BEH {
    public BIG A00;
    public boolean A01 = false;
    public C25436BJu A02;
    public final Activity A03;
    public final C25424BJf A04;
    public final C25413BIo A05;
    public final C25448BKr A06;
    public final String A07;
    public final String A08;

    public final void Ay0(Bundle bundle) {
    }

    public final void Ay8(int i) {
    }

    public BIZ(Activity activity, AnonymousClass0C1 r32, C25448BKr bKr, String str, String str2) {
        Activity activity2 = activity;
        this.A03 = activity2;
        this.A06 = bKr;
        this.A08 = str;
        this.A07 = str2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        C04450Ea r10 = new C04450Ea();
        C04450Ea r3 = new C04450Ea();
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        C25426BJh bJh = BJU.A00;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = activity2.getMainLooper();
        String packageName = activity2.getPackageName();
        String name = activity2.getClass().getName();
        AnonymousClass0a2.A03(this, "Listener must not be null");
        arrayList.add(this);
        AnonymousClass0a2.A03(this, "Listener must not be null");
        arrayList2.add(this);
        C25399BHx bHx = BJN.A00;
        AnonymousClass0a2.A03(bHx, "Api must not be null");
        r3.put(bHx, (Object) null);
        List A002 = bHx.A00.A00((Object) null);
        hashSet2.addAll(A002);
        hashSet.addAll(A002);
        AnonymousClass0a2.A08(!r3.isEmpty(), "must call addApi() to add at least one API");
        C25387BHd bHd = new C25387BHd(hashSet, r10, packageName, name, r3.containsKey(BJU.A01) ? (BKw) r3.get(BJU.A01) : BKw.A00);
        C25399BHx bHx2 = null;
        Map map = bHd.A04;
        C04450Ea r13 = new C04450Ea();
        C04450Ea r12 = new C04450Ea();
        ArrayList arrayList3 = new ArrayList();
        for (C25399BHx bHx3 : r3.keySet()) {
            Object obj = r3.get(bHx3);
            boolean z = map.get(bHx3) != null;
            r13.put(bHx3, Boolean.valueOf(z));
            C25418BIw bIw = new C25418BIw(bHx3, z);
            arrayList3.add(bIw);
            C25376BGp A012 = bHx3.A00().A01(activity2, mainLooper, bHd, obj, bIw, bIw);
            r12.put(bHx3.A01(), A012);
            if (A012.BYX()) {
                if (bHx2 == null) {
                    bHx2 = bHx3;
                } else {
                    String str3 = bHx3.A01;
                    String str4 = bHx2.A01;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 21 + String.valueOf(str4).length());
                    sb.append(str3);
                    sb.append(" cannot be used with ");
                    sb.append(str4);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        if (bHx2 != null) {
            AnonymousClass0a2.A0A(true, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", bHx2.A01);
            AnonymousClass0a2.A0A(hashSet.equals(hashSet2), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", bHx2.A01);
        }
        BIW biw = new BIW(activity2, new ReentrantLock(), mainLooper, bHd, googleApiAvailability, bJh, r13, arrayList, arrayList2, r12, -1, BIW.A00(r12.values(), true), arrayList3);
        Set set = BIG.A00;
        synchronized (set) {
            set.add(biw);
        }
        this.A00 = biw;
        AnonymousClass0C1 r2 = r32;
        this.A05 = ((BK6) r2.AVA(BK6.class, new BKU(r2))).A00;
        this.A04 = ((BKE) r2.AVA(BKE.class, new BKT(r2))).A00;
    }

    public final C25436BJu A00() {
        if (this.A02 == null) {
            BKZ bkz = new BKZ();
            bkz.A02 = this.A08;
            bkz.A00 = this.A07;
            bkz.A01 = AnonymousClass2ZY.A00().toString();
            this.A02 = new C25436BJu(bkz);
        }
        return this.A02;
    }

    public final void Ay4(ConnectionResult connectionResult) {
        String str;
        Integer num = Constants.A0Y;
        this.A06.AvC(num);
        C25424BJf bJf = this.A04;
        if (TextUtils.isEmpty(A00().A02)) {
            str = "surface_location_upsell_fragment";
        } else {
            str = A00().A02;
        }
        bJf.A00(str, BKk.A00(num));
        this.A05.A00(false);
    }

    public final void Ar3(int i, int i2, Intent intent) {
        Integer num;
        String str;
        super.Ar3(i, i2, intent);
        if (this.A01 && i == 5005) {
            boolean z = false;
            this.A01 = false;
            if (i2 == -1) {
                num = Constants.ZERO;
                this.A05.A01(true);
            } else {
                num = Constants.ONE;
                this.A05.A01(false);
            }
            this.A06.AvC(num);
            C25424BJf bJf = this.A04;
            if (TextUtils.isEmpty(A00().A02)) {
                str = "surface_location_upsell_fragment";
            } else {
                str = A00().A02;
            }
            bJf.A00(str, BKk.A00(num));
            C25413BIo bIo = this.A05;
            if (num == Constants.ZERO || num == Constants.A0C) {
                z = true;
            }
            bIo.A00(z);
        }
    }
}
