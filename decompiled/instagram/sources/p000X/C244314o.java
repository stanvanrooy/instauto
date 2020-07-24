package p000X;

import android.content.ContentValues;
import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.14o  reason: invalid class name and case insensitive filesystem */
public final class C244314o implements C244414p {
    public static final Class A08 = C244314o.class;
    public boolean A00;
    public final AnonymousClass0OT A01;
    public final C244514q A02 = new C244514q();
    public final C243014b A03;
    public final C243114c A04;
    public final AnonymousClass14W A05;
    public final Context A06;
    public final C244214n A07;

    public static void A03(String str, AnonymousClass16T r6) {
        r6.ABb("edges", "txn_id = ?", new String[]{str});
        r6.ABb("arguments", "txn_id = ?", new String[]{str});
        r6.ABb("transactions", "txn_id = ?", new String[]{str});
        r6.ABb("operation_tags", "txn_id = ?", new String[]{str});
    }

    public final synchronized void ABc(String str) {
        if (this.A02.AF4(str) != null) {
            this.A02.ABc(str);
            this.A04.A01.A00.remove(str);
            this.A01.ADc(new C108144lL(this, str));
        }
    }

    public final synchronized void Ad8() {
        if (!this.A00) {
            this.A00 = true;
            this.A01.ADc(new AnonymousClass16S(this));
        }
    }

    public static void A00(C244314o r17, AnonymousClass16T r18, C105814hT r19, AnonymousClass4WK r20) {
        C244314o r8;
        C105814hT r6 = r19;
        AnonymousClass0a4.A09(r6.A09);
        Set set = r6.A07;
        AnonymousClass16T r7 = r18;
        A03(r6.A04, r7);
        ContentValues contentValues = new ContentValues();
        HashSet<AnonymousClass15G> hashSet = new HashSet<>();
        contentValues.put("txn_id", r6.A04);
        Iterator it = set.iterator();
        while (true) {
            r8 = r17;
            if (!it.hasNext()) {
                break;
            }
            C105794hR r4 = (C105794hR) it.next();
            hashSet.add(r4.A00);
            hashSet.add(r4.A01);
            long A012 = r8.A03.A01(r7, r6.A04, r4.A00);
            long A013 = r8.A03.A01(r7, r6.A04, r4.A01);
            contentValues.put("prev_operation_id", Long.valueOf(A012));
            contentValues.put("succ_operation_id", Long.valueOf(A013));
            r7.Adh("edges", 0, contentValues);
        }
        hashSet.add(r6.A00);
        long A014 = r8.A03.A01(r7, r6.A04, r6.A00);
        contentValues.put("prev_operation_id", (String) null);
        contentValues.put("succ_operation_id", Long.valueOf(A014));
        r7.Adh("edges", 0, contentValues);
        ContentValues contentValues2 = new ContentValues();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (AnonymousClass15G r12 : hashSet) {
            C105884ha A022 = r6.A02(r12);
            if (A022 != null) {
                contentValues2.put("operation_id", Long.valueOf(r8.A03.A01(r7, r6.A04, r12)));
                contentValues2.put("txn_id", r6.A04);
                contentValues2.put("data", AnonymousClass4l0.A00(A022).A04(byteArrayOutputStream));
                r7.Adh("arguments", 0, contentValues2);
            }
        }
        if (r6.A02 != null) {
            contentValues2.clear();
            contentValues2.put("operation_id", r6.A04);
            contentValues2.put("txn_id", r6.A04);
            contentValues2.put("data", AnonymousClass4l0.A00(r6.A02).A04(byteArrayOutputStream));
            r7.Adh("arguments", 0, contentValues2);
        }
        A02(r20, r7);
        ContentValues contentValues3 = new ContentValues(2);
        contentValues3.put("txn_id", r6.A04);
        for (Map.Entry entry : r6.A06.entrySet()) {
            contentValues3.put("operation_id", Long.valueOf(r8.A03.A01(r7, r6.A04, (AnonymousClass15G) entry.getValue())));
            contentValues3.put(B5B.INTENT_PARAM_TAG, (String) entry.getKey());
            r7.Adh("operation_tags", 0, contentValues3);
        }
    }

    public static void A02(AnonymousClass4WK r3, AnonymousClass16T r4) {
        byte[] bArr;
        ContentValues contentValues = new ContentValues();
        contentValues.put("txn_id", r3.A08);
        contentValues.put(MemoryDumpUploadJob.EXTRA_USER_ID, r3.A07.A04());
        contentValues.put("immediate_retry_count", Integer.valueOf(r3.A02));
        contentValues.put(TraceFieldType.RetryCount, Integer.valueOf(r3.A03));
        contentValues.put("submission_time_ms", Long.valueOf(r3.A04));
        contentValues.put(B5B.INTENT_PARAM_TAG, r3.A09);
        contentValues.put("timeout_secs", Long.valueOf(r3.A05));
        contentValues.put("last_submission_time_ms", Long.valueOf(r3.A01));
        contentValues.put("resubmission_count", Integer.valueOf(r3.A00));
        C105884ha r0 = r3.A06;
        if (r0 != null) {
            bArr = AnonymousClass4l0.A00(r0).A04(new ByteArrayOutputStream());
        } else {
            bArr = null;
        }
        contentValues.put("client_data", bArr);
        r4.Adh("transactions", 0, contentValues);
    }

    public final C105814hT AF4(String str) {
        return this.A02.AF4(str);
    }

    public final long AKL() {
        return this.A06.getDatabasePath(this.A05.A03.A02).length();
    }

    public final AnonymousClass4WK AQF(String str) {
        return this.A02.AQF(str);
    }

    public final Collection AYx() {
        return this.A02.AYx();
    }

    public final Collection AYy(String str) {
        return this.A02.AYy(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        return true;
     */
    public final boolean BYh(String str, C105884ha r14, long j, C105814hT r17) {
        synchronized (this.A02) {
            C105814hT r11 = r17;
            if (!this.A02.BYh(str, r14, j, r11)) {
                return false;
            }
            AnonymousClass4WK AQF = this.A02.AQF(r11.A04);
            AnonymousClass0a4.A07(AQF, "Invariant violated: txn put, but no metadata");
            if (r11.A09) {
                this.A01.ADc(new C108114lI(this, r11, AQF));
            }
        }
    }

    public final AnonymousClass4WK BsJ(C105824hU r4, AnonymousClass4WK r5) {
        AnonymousClass4WK BsJ;
        AnonymousClass0a4.A09(r4.A00.A09);
        synchronized (this.A02) {
            BsJ = this.A02.BsJ(r4, r5);
        }
        this.A01.ADc(new C108094lG(this, r4, BsJ));
        return BsJ;
    }

    public final void Bso(AnonymousClass4WK r3) {
        this.A02.Bso(r3);
        this.A01.ADc(new C108134lK(this, r3));
    }

    public C244314o(Context context, AnonymousClass0OT r3, AnonymousClass14W r4, C243014b r5, C243114c r6, C244214n r7) {
        this.A06 = context.getApplicationContext();
        this.A05 = r4;
        this.A01 = r3;
        this.A04 = r6;
        this.A07 = r7;
        this.A03 = r5;
    }

    public static void A01(C244314o r3, String str, AnonymousClass16T r5) {
        A03(str, r5);
        C244214n r1 = r3.A07;
        synchronized (r1) {
            C244214n.A00(r1, r1.A05, str).clear();
        }
        r5.ABb("intermediate_data", "txn_id = ?", new String[]{str});
        r5.ABb("operations", "txn_id = ?", new String[]{str});
        r5.ABb("results", "txn_id = ?", new String[]{str});
    }
}
