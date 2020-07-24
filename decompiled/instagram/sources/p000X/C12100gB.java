package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.forker.Process;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0gB  reason: invalid class name and case insensitive filesystem */
public abstract class C12100gB extends C12110gC implements C12120gD {
    public C12250gR A00;
    public int[] A01 = new int[0];
    public final Context A02;
    public final Handler A03;
    public final C12140gF A04;
    public final C12350gb A05;
    public final C12200gL A06;
    public final C12230gP A07;
    public volatile boolean A08 = false;
    public volatile boolean A09 = false;

    public abstract long A03();

    public AnonymousClass291 A05() {
        return null;
    }

    public abstract void A06();

    public boolean A09() {
        return false;
    }

    public boolean A0A() {
        return false;
    }

    public abstract boolean A0B();

    public abstract boolean A0C();

    public boolean A0D(int i) {
        return true;
    }

    public final void A5F() {
        C12230gP.A06 = false;
    }

    public final void A5G() {
        C12230gP.A06 = true;
    }

    public final C12230gP A04(int i) {
        C12230gP r0 = (C12230gP) this.A01.get(i);
        if (r0 == null) {
            return this.A07;
        }
        return r0;
    }

    public final void A07(int i, C12470gn r4) {
        C12200gL r1 = this.A06;
        synchronized (r1) {
            r1.A00.put(i, r4);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:102|103) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f5, code lost:
        r0 = r21;
        r2 = (java.util.List) r0.get(r6);
        r2.add(r12);
        r0.put(r6, r2);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0207, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r21 = new android.util.SparseArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0211, code lost:
        r0 = new android.util.SparseArray(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03e8, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03ea, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x059e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00db, code lost:
        r2 = r10.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e1, code lost:
        if (p000X.C12350gb.A00(r2) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e3, code lost:
        r2.A01(r2.A00, (java.lang.Short) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e9, code lost:
        r20 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ed, code lost:
        if (r10.A08 != false) goto L_0x05a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ef, code lost:
        monitor-enter(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f2, code lost:
        if (r10.A08 != false) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f4, code lost:
        r5 = r10.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fa, code lost:
        if (p000X.C12350gb.A00(r5) != false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fc, code lost:
        r4 = new p000X.AnonymousClass29A(20, (java.lang.Integer) null, false);
        r4.A02("event", p000X.AnonymousClass29B.A00(20));
        r5.A04 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        r22 = A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0114, code lost:
        if (r22 == null) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r4 = r10.A05;
        r3 = new p000X.AnonymousClass29A(1, (java.lang.Integer) null, false);
        r3.A02("event", "init_from_data_readers");
        r4.A03 = r3;
        r2 = r22.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012d, code lost:
        if (r2 == null) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0135, code lost:
        if (r2.equals("EMPTY") != false) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013d, code lost:
        if (r2.equals("") != false) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0146, code lost:
        if (r2.equals("{}") != false) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0148, code lost:
        r21 = new android.util.SparseArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r11 = new org.json.JSONObject(r2);
        r9 = p000X.AnonymousClass299.A01();
        r8 = r9.length;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0158, code lost:
        if (r7 >= r8) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015a, code lost:
        r6 = r9[r7];
        r2 = p000X.AnonymousClass299.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0164, code lost:
        if (r11.optJSONArray(r2) == null) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0166, code lost:
        r5 = r11.getJSONArray(r2);
        r4 = r5.length();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016f, code lost:
        if (r3 >= r4) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0171, code lost:
        r15 = r5.optJSONObject(r3);
        r12 = new p000X.C51552Ld();
        r0 = r15.optString("osVersion", "null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0186, code lost:
        if (r0.equals("null") != false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0188, code lost:
        r12.A05 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x018a, code lost:
        r0 = r15.optString("deviceModel", "null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0194, code lost:
        if (r0.equals("null") != false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0196, code lost:
        r12.A04 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0198, code lost:
        r0 = r15.optString("deviceBrand", "null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a2, code lost:
        if (r0.equals("null") != false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a4, code lost:
        r12.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a6, code lost:
        r0 = r15.optString("deviceChipset", "null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b0, code lost:
        if (r0.equals("null") != false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b2, code lost:
        r12.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01b4, code lost:
        r2 = r15.optString("appVersion", "null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01be, code lost:
        if (r2.equals("null") != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c0, code lost:
        r12.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01cc, code lost:
        if (r15.optString("appId", "null").equals("null") != false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ce, code lost:
        r12.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d0, code lost:
        r2 = r15.optString("yearClass", "null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01db, code lost:
        if (r2.equals("null") != false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01dd, code lost:
        r12.A06 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e5, code lost:
        if (r21.get(r6) != null) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e7, code lost:
        r21.put(r6, new java.util.ArrayList());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x020b */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03ea A[ExcHandler: 1ww (e X.1ww), Splitter:B:196:0x03bc] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0412 A[Catch:{ all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0522 A[Catch:{ all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x052d A[Catch:{ all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x052e A[Catch:{ all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x056b A[Catch:{ all -> 0x059e }, LOOP:10: B:293:0x0569->B:294:0x056b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0583 A[Catch:{ all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x058e A[Catch:{ all -> 0x059e }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x05e3 A[Catch:{ Exception -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x05f2 A[Catch:{ Exception -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x04ee A[SYNTHETIC] */
    public final void A08(Context context, C12170gI r29) {
        int i;
        int[] iArr;
        Context context2;
        ArrayList arrayList;
        C12350gb r2;
        AnonymousClass291 A052;
        int size;
        int i2;
        QuickPerformanceLogger A022;
        C12350gb r4;
        SparseArray sparseArray;
        int i3;
        int i4;
        int i5;
        boolean z;
        List list;
        boolean z2;
        C44891ww r22;
        int i6;
        JSONObject jSONObject;
        String A012;
        String str;
        JSONArray optJSONArray;
        int i7;
        if (!this.A09 && A0B()) {
            if (A0A()) {
                this.A02.A00 = true;
            }
            synchronized (this) {
                if (!this.A09) {
                    C12350gb r5 = this.A05;
                    if (!C12350gb.A00(r5)) {
                        AnonymousClass29A r42 = new AnonymousClass29A(5, (Integer) null, false);
                        r42.A02("event", AnonymousClass29B.A00(5));
                        r5.A02 = r42;
                    }
                    this.A09 = true;
                    this.A00.A04 = A09();
                    C12350gb r52 = this.A05;
                    if (!C12350gb.A00(r52)) {
                        AnonymousClass29A r43 = new AnonymousClass29A(15, (Integer) null, false);
                        r43.A02("event", AnonymousClass29B.A00(15));
                        r52.A00 = r43;
                    }
                    C12200gL r3 = this.A06;
                    synchronized (r3) {
                        try {
                            int size2 = r3.A00.size();
                            i = size2;
                            iArr = new int[size2];
                            for (int i8 = 0; i8 < size2; i8++) {
                                iArr[i8] = r3.A00.keyAt(i8);
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    int i9 = 0;
                    while (true) {
                        context2 = context;
                        if (i9 >= i) {
                            break;
                        }
                        int i10 = iArr[i9];
                        String A002 = AnonymousClass299.A00(i10);
                        if (!A0D(i10)) {
                            C12200gL r1 = this.A06;
                            synchronized (r1) {
                                try {
                                    r1.A00.remove(i10);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        } else {
                            C12350gb r11 = this.A05;
                            AnonymousClass29A r9 = new AnonymousClass29A(10, (Integer) null, false);
                            r9.A02("booster", A002);
                            r9.A02("event", AnonymousClass29B.A00(10));
                            r11.A01 = r9;
                            try {
                                C12470gn A003 = this.A06.A00(i10);
                                if (A003 != null) {
                                    A003.A03(context2);
                                    C12350gb r23 = this.A05;
                                    r23.A01(r23.A01, (Short) null);
                                }
                            } catch (Exception e) {
                                C12350gb r24 = this.A05;
                                r24.A01(r24.A01, 87);
                                this.A00.A03(i10, e);
                            }
                        }
                        i9++;
                    }
                }
            }
            return;
        }
        return;
        this.A00 = new C12250gR(this.A02, sparseArray, Long.toString(A03()));
        C51772Mb r53 = null;
        boolean z3 = false;
        try {
            C12200gL r25 = this.A06;
            String str2 = A052.A01;
            if (str2 == null || str2.equals("EMPTY") || str2.equals("") || str2.equals("{}")) {
                r53 = new C51772Mb(new SparseArray(0), 0);
            } else {
                AnonymousClass2MY r112 = new AnonymousClass2MY(r25);
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList2 = new ArrayList();
                JSONObject jSONObject2 = new JSONObject(str2);
                boolean z4 = false;
                int i11 = 1;
                if (jSONObject2.has("config_v2") && (optJSONArray = jSONObject2.optJSONArray("config_v2")) != null && optJSONArray.length() > 0) {
                    sparseArray2 = new SparseArray();
                    try {
                        int length = optJSONArray.length();
                        for (i7 = 0; i7 < length; i7++) {
                            JSONObject jSONObject3 = optJSONArray.getJSONObject(i7);
                            JSONArray jSONArray = optJSONArray.getJSONObject(i7).getJSONArray("markers");
                            try {
                                int length2 = jSONArray.length();
                                for (int i12 = 0; i12 < length2; i12++) {
                                    AnonymousClass299 A004 = AnonymousClass2MY.A00(r112, jSONArray.getInt(i12), jSONObject3);
                                    if (A004 != null) {
                                        int i13 = A004.A04;
                                        if (sparseArray2.get(i13) == null) {
                                            sparseArray2.put(i13, new ArrayList());
                                        }
                                        ((List) sparseArray2.get(i13)).add(A004);
                                    }
                                }
                            } catch (Exception e2) {
                                arrayList2.add(new C44891ww(AnonymousClass2MY.A01(jSONObject3, e2), 1));
                            }
                        }
                        z4 = true;
                    } catch (Exception e3) {
                        r22 = new C44891ww(e3.getMessage(), 2);
                        throw r22;
                    }
                }
                if (!z4) {
                    sparseArray2 = new SparseArray();
                    try {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("actions");
                        int length3 = jSONArray2.length();
                        for (i6 = 0; i6 < length3; i6++) {
                            try {
                                jSONObject = jSONArray2.getJSONObject(i6);
                                AnonymousClass299 A005 = AnonymousClass2MY.A00(r112, jSONObject.getJSONObject("trigger").getJSONObject("qpl").getInt("markerId"), jSONObject.getJSONObject("type"));
                                if (A005 != null) {
                                    int i14 = A005.A04;
                                    SparseArray sparseArray3 = sparseArray2;
                                    int i15 = i14;
                                    if (sparseArray3.get(i15) == null) {
                                        sparseArray3.put(i15, new ArrayList());
                                    }
                                    ((List) sparseArray2.get(i14)).add(A005);
                                }
                            } catch (Exception e4) {
                                JSONObject optJSONObject = jSONObject.optJSONObject("type");
                                if (optJSONObject == null) {
                                    if (e4.getMessage() != null) {
                                        str = e4.getMessage();
                                    } else {
                                        str = "Unknown Error";
                                    }
                                    A012 = AnonymousClass000.A0E("Unknown Optimization: ", str);
                                } else {
                                    A012 = AnonymousClass2MY.A01(optJSONObject, e4);
                                }
                                throw new C44891ww(A012, 1);
                            } catch (C44891ww e5) {
                                arrayList2.add(e5);
                            }
                        }
                    } catch (Exception e6) {
                        r22 = new C44891ww(e6.getMessage(), 1);
                        throw r22;
                    }
                }
                if (z4) {
                    i11 = 2;
                }
                C51772Mb r26 = new C51772Mb(sparseArray2, i11);
                r26.A02.addAll(arrayList2);
                r53 = r26;
            }
            i3 = r53.A01.size();
            try {
                i4 = r53.A02.size();
                try {
                    i5 = r53.A00;
                    if (i3 > 0 || (i3 == 0 && i4 == 0)) {
                        z3 = true;
                    }
                    C12210gM r7 = this.A02;
                    String str3 = A052.A01;
                    AnonymousClass29A r6 = new AnonymousClass29A(50, (Integer) null, false);
                    r6.A02("event", AnonymousClass29B.A00(50));
                    r6.A02("raw_optimization_json", str3);
                    r7.AlA(r6);
                } catch (C44891ww e7) {
                } catch (Exception e8) {
                    e = e8;
                    this.A00.A00.Bp7("MobileBoost", "InvalidConfigurationWithException", e);
                    if (r53 != null) {
                    }
                    C12350gb r27 = this.A05;
                    int size3 = sparseArray.size();
                    AnonymousClass29A r44 = r27.A03;
                    r44.A01("optimizations_count", (long) i3);
                    r44.A01("blacklists_count", (long) size3);
                    r44.A01("errors_count", (long) i4);
                    if (i5 > 0) {
                    }
                    if (!z3) {
                    }
                    C12350gb r45 = this.A05;
                    AnonymousClass29A r32 = new AnonymousClass29A(1, (Integer) null, false);
                    r32.A02("event", "init_from_optimizations");
                    r45.A05 = r32;
                    A06();
                    C12350gb r28 = this.A05;
                    r28.A01(r28.A05, (Short) null);
                    size = this.A01.size();
                    this.A01 = new int[size];
                    while (i2 < size) {
                    }
                    this.A08 = true;
                    A022 = this.A04.A02();
                    if (A022 != null) {
                    }
                    r4 = this.A05;
                    if (!C12350gb.A00(r4)) {
                    }
                    AnonymousClass0ZA.A0E(this.A03, new C51782Mc(this), 418810106);
                    A01(this);
                    arrayList = new ArrayList();
                    C12170gI r210 = r29;
                    r210.ACs(context2, this, this.A04.A00);
                    arrayList.add(r210);
                    C12230gP.A09 = true;
                    arrayList.add(new C51792Md());
                    arrayList.add(this);
                    if (C51802Me.A02 == null) {
                    }
                    r2 = this.A05;
                    if (!C12350gb.A00(r2)) {
                    }
                    return;
                }
            } catch (C44891ww e9) {
                e = e9;
                i4 = 0;
                i5 = e.A00;
                this.A00.A00.Bp7("MobileBoost", "InvalidConfigurationWithException", e);
                if (r53 != null) {
                }
                C12350gb r272 = this.A05;
                int size32 = sparseArray.size();
                AnonymousClass29A r442 = r272.A03;
                r442.A01("optimizations_count", (long) i3);
                r442.A01("blacklists_count", (long) size32);
                r442.A01("errors_count", (long) i4);
                if (i5 > 0) {
                }
                if (!z3) {
                }
                C12350gb r452 = this.A05;
                AnonymousClass29A r322 = new AnonymousClass29A(1, (Integer) null, false);
                r322.A02("event", "init_from_optimizations");
                r452.A05 = r322;
                A06();
                C12350gb r282 = this.A05;
                r282.A01(r282.A05, (Short) null);
                size = this.A01.size();
                this.A01 = new int[size];
                while (i2 < size) {
                }
                this.A08 = true;
                A022 = this.A04.A02();
                if (A022 != null) {
                }
                r4 = this.A05;
                if (!C12350gb.A00(r4)) {
                }
                AnonymousClass0ZA.A0E(this.A03, new C51782Mc(this), 418810106);
                A01(this);
                arrayList = new ArrayList();
                C12170gI r2102 = r29;
                r2102.ACs(context2, this, this.A04.A00);
                arrayList.add(r2102);
                C12230gP.A09 = true;
                arrayList.add(new C51792Md());
                arrayList.add(this);
                if (C51802Me.A02 == null) {
                }
                r2 = this.A05;
                if (!C12350gb.A00(r2)) {
                }
                return;
            } catch (Exception e10) {
                e = e10;
                i4 = 0;
                i5 = 0;
                this.A00.A00.Bp7("MobileBoost", "InvalidConfigurationWithException", e);
                if (r53 != null) {
                }
                C12350gb r2722 = this.A05;
                int size322 = sparseArray.size();
                AnonymousClass29A r4422 = r2722.A03;
                r4422.A01("optimizations_count", (long) i3);
                r4422.A01("blacklists_count", (long) size322);
                r4422.A01("errors_count", (long) i4);
                if (i5 > 0) {
                }
                if (!z3) {
                }
                C12350gb r4522 = this.A05;
                AnonymousClass29A r3222 = new AnonymousClass29A(1, (Integer) null, false);
                r3222.A02("event", "init_from_optimizations");
                r4522.A05 = r3222;
                A06();
                C12350gb r2822 = this.A05;
                r2822.A01(r2822.A05, (Short) null);
                size = this.A01.size();
                this.A01 = new int[size];
                while (i2 < size) {
                }
                this.A08 = true;
                A022 = this.A04.A02();
                if (A022 != null) {
                }
                r4 = this.A05;
                if (!C12350gb.A00(r4)) {
                }
                AnonymousClass0ZA.A0E(this.A03, new C51782Mc(this), 418810106);
                A01(this);
                arrayList = new ArrayList();
                C12170gI r21022 = r29;
                r21022.ACs(context2, this, this.A04.A00);
                arrayList.add(r21022);
                C12230gP.A09 = true;
                arrayList.add(new C51792Md());
                arrayList.add(this);
                if (C51802Me.A02 == null) {
                }
                r2 = this.A05;
                if (!C12350gb.A00(r2)) {
                }
                return;
            }
        } catch (JSONException e11) {
            throw new C44901wx(e11.getMessage());
        } catch (C44891ww e12) {
            e = e12;
            i3 = 0;
            i4 = 0;
            i5 = e.A00;
            this.A00.A00.Bp7("MobileBoost", "InvalidConfigurationWithException", e);
            if (r53 != null) {
                for (C44901wx Bp7 : r53.A02) {
                    this.A00.A00.Bp7("MobileBoost", "InvalidConfigurationWithException", Bp7);
                }
                if (i3 > 0) {
                    SparseArray sparseArray4 = r53.A01;
                    for (int i16 : AnonymousClass299.A01()) {
                        C12250gR r0 = this.A00;
                        C12250gR r18 = r0;
                        if (r0.A07.size() != 0 && (list = (List) r18.A07.get(i16)) != null && !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C51552Ld r16 = (C51552Ld) it.next();
                                C12250gR r02 = r18;
                                String str4 = r02.A05;
                                String str5 = r02.A04;
                                String str6 = r02.A02;
                                String str7 = r02.A03;
                                String str8 = r02.A01;
                                String str9 = r02.A00;
                                String str10 = r02.A06;
                                String str11 = r16.A05;
                                if (str11 == null || str11.equals(str4)) {
                                    String str12 = r16.A04;
                                    if (str12 == null || str12.equals(str5)) {
                                        String str13 = r16.A02;
                                        if (str13 == null || str13.equals(str6)) {
                                            String str14 = r16.A03;
                                            if (str14 == null || str14.equals(str7)) {
                                                String str15 = r16.A00;
                                                if (str15 == null || str15.equals(str9)) {
                                                    String str16 = r16.A06;
                                                    if (str16 == null || str16.equals(str10)) {
                                                        String str17 = r16.A01;
                                                        if (str17 == null || str17.startsWith(str8) || str17.compareTo(str8) >= 0) {
                                                            z2 = true;
                                                            continue;
                                                            if (z2) {
                                                                z = true;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                z2 = false;
                                continue;
                                if (z2) {
                                }
                            }
                            if (!z && A0D(i16)) {
                                A02(i16, (List) sparseArray4.get(i16));
                            }
                        }
                        z = false;
                        A02(i16, (List) sparseArray4.get(i16));
                    }
                }
            }
            C12350gb r27222 = this.A05;
            int size3222 = sparseArray.size();
            AnonymousClass29A r44222 = r27222.A03;
            r44222.A01("optimizations_count", (long) i3);
            r44222.A01("blacklists_count", (long) size3222);
            r44222.A01("errors_count", (long) i4);
            if (i5 > 0) {
                r27222.A03.A01("version", (long) i5);
            }
            if (!z3) {
                r27222.A01(r27222.A03, 87);
            } else {
                r27222.A01(r27222.A03, (Short) null);
            }
            C12350gb r45222 = this.A05;
            AnonymousClass29A r32222 = new AnonymousClass29A(1, (Integer) null, false);
            r32222.A02("event", "init_from_optimizations");
            r45222.A05 = r32222;
            A06();
            C12350gb r28222 = this.A05;
            r28222.A01(r28222.A05, (Short) null);
            size = this.A01.size();
            this.A01 = new int[size];
            for (i2 = 0; i2 < size; i2++) {
                this.A01[i2] = this.A01.keyAt(i2);
            }
            this.A08 = true;
            A022 = this.A04.A02();
            if (A022 != null) {
                A022.updateListenerMarkers();
            }
            r4 = this.A05;
            if (!C12350gb.A00(r4)) {
                r4.A04.A01("markers_count", (long) size);
                r4.A01(r4.A04, (Short) null);
            }
            AnonymousClass0ZA.A0E(this.A03, new C51782Mc(this), 418810106);
            A01(this);
            arrayList = new ArrayList();
            C12170gI r210222 = r29;
            if (r29 != null && A0C()) {
                r210222.ACs(context2, this, this.A04.A00);
                arrayList.add(r210222);
                C12230gP.A09 = true;
            }
            arrayList.add(new C51792Md());
            arrayList.add(this);
            if (C51802Me.A02 == null) {
                C51802Me.A02 = new C51802Me(context2, arrayList);
            }
            r2 = this.A05;
            if (!C12350gb.A00(r2)) {
                r2.A01(r2.A02, (Short) null);
            }
            return;
        } catch (Exception e13) {
            e = e13;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            this.A00.A00.Bp7("MobileBoost", "InvalidConfigurationWithException", e);
            if (r53 != null) {
            }
            C12350gb r272222 = this.A05;
            int size32222 = sparseArray.size();
            AnonymousClass29A r442222 = r272222.A03;
            r442222.A01("optimizations_count", (long) i3);
            r442222.A01("blacklists_count", (long) size32222);
            r442222.A01("errors_count", (long) i4);
            if (i5 > 0) {
            }
            if (!z3) {
            }
            C12350gb r452222 = this.A05;
            AnonymousClass29A r322222 = new AnonymousClass29A(1, (Integer) null, false);
            r322222.A02("event", "init_from_optimizations");
            r452222.A05 = r322222;
            A06();
            C12350gb r282222 = this.A05;
            r282222.A01(r282222.A05, (Short) null);
            size = this.A01.size();
            this.A01 = new int[size];
            while (i2 < size) {
            }
            this.A08 = true;
            A022 = this.A04.A02();
            if (A022 != null) {
            }
            r4 = this.A05;
            if (!C12350gb.A00(r4)) {
            }
            AnonymousClass0ZA.A0E(this.A03, new C51782Mc(this), 418810106);
            A01(this);
            arrayList = new ArrayList();
            C12170gI r2102222 = r29;
            r2102222.ACs(context2, this, this.A04.A00);
            arrayList.add(r2102222);
            C12230gP.A09 = true;
            arrayList.add(new C51792Md());
            arrayList.add(this);
            if (C51802Me.A02 == null) {
            }
            r2 = this.A05;
            if (!C12350gb.A00(r2)) {
            }
            return;
        }
        if (r53 != null) {
        }
        C12350gb r2722222 = this.A05;
        int size322222 = sparseArray.size();
        AnonymousClass29A r4422222 = r2722222.A03;
        r4422222.A01("optimizations_count", (long) i3);
        r4422222.A01("blacklists_count", (long) size322222);
        r4422222.A01("errors_count", (long) i4);
        if (i5 > 0) {
        }
        if (!z3) {
        }
        C12350gb r4522222 = this.A05;
        AnonymousClass29A r3222222 = new AnonymousClass29A(1, (Integer) null, false);
        r3222222.A02("event", "init_from_optimizations");
        r4522222.A05 = r3222222;
        A06();
        C12350gb r2822222 = this.A05;
        r2822222.A01(r2822222.A05, (Short) null);
        size = this.A01.size();
        this.A01 = new int[size];
        while (i2 < size) {
        }
        this.A08 = true;
        A022 = this.A04.A02();
        if (A022 != null) {
        }
        r4 = this.A05;
        if (!C12350gb.A00(r4)) {
        }
        AnonymousClass0ZA.A0E(this.A03, new C51782Mc(this), 418810106);
        A01(this);
        arrayList = new ArrayList();
        C12170gI r21022222 = r29;
        r21022222.ACs(context2, this, this.A04.A00);
        arrayList.add(r21022222);
        C12230gP.A09 = true;
        arrayList.add(new C51792Md());
        arrayList.add(this);
        if (C51802Me.A02 == null) {
        }
        r2 = this.A05;
        if (!C12350gb.A00(r2)) {
        }
        return;
    }

    public C12100gB(Context context, C12140gF r9) {
        this.A02 = context.getApplicationContext();
        this.A04 = r9;
        C12230gP.A07 = this;
        C12210gM A002 = C12210gM.A00();
        C12190gK A012 = r9.A01();
        if (C12240gQ.A01 == null) {
            C12240gQ.A01 = new C12240gQ(A002);
        }
        this.A07 = new C12230gP(Process.WAIT_RESULT_TIMEOUT, A012, C12240gQ.A01);
        this.A06 = C12200gL.A01;
        this.A00 = new C12250gR(context, new SparseArray(), (String) null);
        this.A03 = new Handler(this.A04.A00.getLooper());
        this.A00 = r9.A01();
        Looper looper = this.A04.A00.getLooper();
        C12190gK r4 = this.A00;
        synchronized (C12330gZ.class) {
            if (C12330gZ.A01 == null) {
                C12210gM A003 = C12210gM.A00();
                if (C12240gQ.A01 == null) {
                    C12240gQ.A01 = new C12240gQ(A003);
                }
                C12330gZ.A01 = new C12330gZ(looper, r4, C12240gQ.A01);
            }
        }
        this.A05 = new C12350gb(A002, this.A00);
    }

    public static void A01(C12100gB r6) {
        if (r6.A0A()) {
            C12210gM r5 = r6.A02;
            r5.A02.add(new Dj2(C12200gL.A01.A00(1), C12210gM.A00(), r6.A04.A01()));
        }
    }
}
