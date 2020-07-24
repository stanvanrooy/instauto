package p000X;

import com.facebook.proxygen.HTTPRequestError;
import com.facebook.proxygen.HTTPResponseHandler;
import com.facebook.proxygen.ReadBuffer;
import com.facebook.proxygen.RequestStats;
import com.facebook.proxygen.RequestStatsObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* renamed from: X.1Cl  reason: invalid class name and case insensitive filesystem */
public final class C26271Cl implements HTTPResponseHandler {
    public C33861dc A00;
    public C45341xi A01;
    public C26281Cm A02;
    public Map A03;
    public final C14410kR A04;
    public final RequestStatsObserver A05;
    public final AnonymousClass1C4 A06;
    public final C26251Cj A07;
    public final Object A08 = new Object();
    public final ReadBuffer A09;
    public volatile Integer A0A = Constants.ZERO;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private void A00(com.facebook.proxygen.HTTPRequestError r50) {
        /*
            r49 = this;
            r9 = r49
            X.1C4 r0 = r9.A06
            java.lang.String r1 = "ta_enabled"
            java.util.Map r0 = r0.A06
            java.lang.Object r1 = r0.get(r1)
            r13 = 1
            r0 = 0
            if (r1 == 0) goto L_0x0012
            r0 = 1
        L_0x0012:
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            X.1C4 r0 = r9.A06
            java.lang.String r1 = "request_name"
            java.util.Map r0 = r0.A06
            java.lang.Object r7 = r0.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x0026
            java.lang.String r7 = "UNKNOWN"
        L_0x0026:
            com.facebook.proxygen.RequestStatsObserver r0 = r9.A05
            com.facebook.proxygen.RequestStats r8 = r0.getRequestStats()
            if (r8 != 0) goto L_0x003b
            java.lang.Class<X.1CU> r2 = p000X.AnonymousClass1CU.class
            monitor-enter(r2)
            X.1CU r1 = p000X.AnonymousClass1CU.A04     // Catch:{ all -> 0x0191 }
            int r0 = r1.A00     // Catch:{ all -> 0x0191 }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x0191 }
            goto L_0x018c
        L_0x003b:
            com.facebook.proxygen.TraceEvent[] r10 = r8.mEvents
            int r5 = r10.length
            r2 = 0
            r11 = 0
            r4 = 0
        L_0x0043:
            if (r4 >= r5) goto L_0x00b8
            r6 = r10[r4]
            java.lang.String r1 = r6.mName
            java.lang.String r0 = "TotalRequest"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a9
            long r4 = r6.mStart
            long r0 = r6.mEnd
        L_0x0055:
            if (r13 == 0) goto L_0x0059
            r11 = r4
            r2 = r0
        L_0x0059:
            X.1C4 r0 = r9.A06
            java.lang.String r1 = "enqueue_time"
            java.util.Map r0 = r0.A06
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x00a6
            java.lang.Long r0 = (java.lang.Long) r0
            long r16 = r0.longValue()
        L_0x006b:
            com.facebook.proxygen.HTTPFlowStats r6 = r8.getFlowStats()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            X.1C4 r0 = r9.A06
            java.util.List r0 = r0.A05
            java.util.Iterator r13 = r0.iterator()
            r4 = 0
        L_0x007d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r10 = r13.next()
            X.0pp r10 = (p000X.C17190pp) r10
            java.lang.String r1 = r10.A00
            java.lang.String r0 = "Range"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0096
            java.lang.String r4 = r10.A01
            goto L_0x007d
        L_0x0096:
            java.util.Map r0 = p000X.AnonymousClass1CU.A05
            boolean r0 = r0.containsValue(r1)
            if (r0 == 0) goto L_0x007d
            java.lang.String r1 = r10.A00
            java.lang.String r0 = r10.A01
            r5.put(r1, r0)
            goto L_0x007d
        L_0x00a6:
            r16 = 0
            goto L_0x006b
        L_0x00a9:
            java.lang.String r0 = "HTTPRequestExchange"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b5
            long r11 = r6.mStart
            long r2 = r6.mEnd
        L_0x00b5:
            int r4 = r4 + 1
            goto L_0x0043
        L_0x00b8:
            r4 = 0
            r0 = 0
            r13 = 0
            goto L_0x0055
        L_0x00be:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r4, r5)
            java.lang.Object r5 = r0.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r10 = r0.second
            java.util.Map r10 = (java.util.Map) r10
            r4 = 0
            java.util.Map r13 = r8.getFlowTimeData()
            if (r5 != 0) goto L_0x00e1
            java.lang.String r1 = "range_request"
            boolean r0 = r13.containsKey(r1)
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r5 = r13.get(r1)
            java.lang.String r5 = (java.lang.String) r5
        L_0x00e1:
            java.lang.String r1 = "uri"
            boolean r0 = r13.containsKey(r1)
            if (r0 == 0) goto L_0x0164
            java.lang.Object r8 = r13.get(r1)
            java.lang.String r8 = (java.lang.String) r8
        L_0x00f0:
            r0 = r50
            if (r50 == 0) goto L_0x0155
            java.lang.String r4 = r0.mErrMsg
        L_0x00f6:
            X.3zh r15 = new X.3zh
            long r0 = r6.mRequestSendTime
            r47 = r0
            long r0 = r6.mTimeToFirstByte
            r45 = r0
            long r0 = r6.mTimeToLastByte
            r26 = r0
            long r2 = r2 - r16
            X.1C4 r0 = r9.A06
            int r0 = r0.A00
            long r0 = (long) r0
            r30 = r0
            int r0 = r6.mLocalPort
            r22 = r0
            int r0 = r6.mReqHeaderCompBytes
            r21 = r0
            int r0 = r6.mReqBodyBytes
            r20 = r0
            int r0 = r6.mRspHeaderCompBytes
            r19 = r0
            int r0 = r6.mRspBodyCompBytes
            r18 = r0
            boolean r0 = r6.mNewConnection
            r9 = r0
            long r13 = r6.mFirstByteFlushed
            long r0 = r6.mLastByteFlushed
            r24 = r26
            r26 = r2
            r28 = r30
            r30 = r4
            r31 = r22
            r32 = r8
            r33 = r7
            r34 = r5
            r35 = r21
            r36 = r20
            r37 = r19
            r38 = r18
            r39 = r9
            r40 = r10
            r41 = r13
            r43 = r0
            r18 = r11
            r20 = r47
            r22 = r45
            r15.<init>(r16, r18, r20, r22, r24, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43)
            java.lang.Class<X.1CU> r2 = p000X.AnonymousClass1CU.class
            monitor-enter(r2)
            goto L_0x0167
        L_0x0155:
            java.lang.String r1 = "error_description"
            boolean r0 = r13.containsKey(r1)
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r4 = r13.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x00f6
        L_0x0164:
            java.lang.String r8 = "UNKNOWN_URI"
            goto L_0x00f0
        L_0x0167:
            X.1CU r0 = p000X.AnonymousClass1CU.A04     // Catch:{ all -> 0x0191 }
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x0191 }
            r0.add(r15)     // Catch:{ all -> 0x0191 }
            monitor-enter(r2)     // Catch:{ all -> 0x0191 }
            X.1CU r0 = p000X.AnonymousClass1CU.A04     // Catch:{ all -> 0x018e }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A03     // Catch:{ all -> 0x018e }
            boolean r0 = r0.get()     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x018b
            X.1CU r0 = p000X.AnonymousClass1CU.A04     // Catch:{ all -> 0x018e }
            java.util.List r0 = r0.A02     // Catch:{ all -> 0x018e }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x018e }
        L_0x0181:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x018b
            r1.next()     // Catch:{ all -> 0x018e }
            goto L_0x0181
        L_0x018b:
            monitor-exit(r2)     // Catch:{ all -> 0x0191 }
        L_0x018c:
            monitor-exit(r2)
            return
        L_0x018e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0191 }
            throw r0     // Catch:{ all -> 0x0191 }
        L_0x0191:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C26271Cl.A00(com.facebook.proxygen.HTTPRequestError):void");
    }

    private void A01(Integer... numArr) {
        boolean z = false;
        if (this.A0A != Constants.A0Y) {
            z = true;
        }
        AnonymousClass0a4.A0C(z, "LigerIGResponseHandler.verifyState: read state shouldn't be ERROR");
        boolean z2 = false;
        for (Integer num : numArr) {
            boolean z3 = false;
            if (this.A0A == num) {
                z3 = true;
            }
            z2 |= z3;
        }
        AnonymousClass0a4.A0C(z2, AnonymousClass000.A0E("LigerIGResponseHandler.verifyState: invalid state. Curr read = ", C35931hA.A00(this.A0A)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0089, code lost:
        if (r10 == 304) goto L_0x008b;
     */
    public final void onResponse(int i, String str, Header[] headerArr) {
        Object obj;
        boolean z;
        String str2 = str;
        C12670hC.A01();
        synchronized (this.A08) {
            try {
                Integer num = Constants.ZERO;
                A01(num);
                if (str == null) {
                    str2 = "empty";
                }
                AnonymousClass1C4 r8 = this.A06;
                Map map = this.A03;
                C26281Cm r7 = this.A02;
                ArrayList arrayList = new ArrayList();
                long j = -1;
                for (Header header : headerArr) {
                    String name = header.getName();
                    String value = header.getValue();
                    arrayList.add(new C17190pp(name, value));
                    if (map != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (map.containsKey(name)) {
                            arrayList2.addAll((Collection) map.get(name));
                        }
                        arrayList2.add(value);
                        map.put(name, arrayList2);
                    }
                    if (name.equalsIgnoreCase("Content-Length")) {
                        j = Long.parseLong(value.trim());
                    }
                }
                int i2 = i;
                C33861dc r6 = new C33861dc(i2, str2, arrayList);
                if (r8.A03 != num && ((100 > i2 || i2 >= 200) && i2 != 204)) {
                    z = true;
                }
                z = false;
                if (z) {
                    r6.A00 = new C35941hB(r7, j);
                }
                this.A00 = r6;
                this.A0A = Constants.ONE;
                obj = this.A08;
            } catch (Throwable th) {
                this.A08.notifyAll();
                throw th;
            }
            obj.notifyAll();
        }
    }

    public C26271Cl(AnonymousClass1C4 r3, ReadBuffer readBuffer, RequestStatsObserver requestStatsObserver, C26251Cj r6, C14410kR r7) {
        AnonymousClass0a4.A0C(true, "LigerIGResponseHandler ctor: buffer shouldn't be null");
        this.A06 = r3;
        this.A09 = readBuffer;
        this.A05 = requestStatsObserver;
        this.A07 = r6;
        this.A02 = new C26281Cm(readBuffer);
        this.A03 = new HashMap();
        this.A04 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        p000X.AnonymousClass0QD.A09("error_on_body", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final void onBody() {
        C12670hC.A01();
        AnonymousClass0a4.A07(this.A02, "LigerIGResponseHandler.handleBody: mBufferInputStream is null");
        Integer num = Constants.A0C;
        A01(Constants.ONE, num);
        C26281Cm r1 = this.A02;
        synchronized (r1) {
            r1.notifyAll();
        }
        this.A0A = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (p000X.C14410kR.A00(r5, r5.A01) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        if (p000X.C14410kR.A00(r5, r5.A00) == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c5, code lost:
        p000X.AnonymousClass0QD.A09("error_on_eom", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final void onEOM() {
        boolean z;
        boolean z2;
        BBV bbv;
        BBV bbv2;
        C12670hC.A01();
        this.A07.A00 = "done";
        AnonymousClass0a4.A07(this.A02, "LigerIGResponseHandler.handleEOM: mBufferInputStream is null");
        A01(Constants.ONE, Constants.A0C);
        this.A0A = Constants.A0N;
        C26281Cm r1 = this.A02;
        synchronized (r1) {
            r1.notifyAll();
        }
        RequestStats requestStats = this.A05.getRequestStats();
        if (requestStats != null) {
            this.A07.A00(requestStats);
        }
        A00((HTTPRequestError) null);
        C14410kR r5 = this.A04;
        if (r5 != null) {
            boolean A002 = C14410kR.A00(r5, r5.A03);
            if (!A002) {
                z = true;
            }
            z = false;
            if (A002 || z) {
                if (z) {
                    bbv2 = new BBS(r5.A01, r5.A05, r5.A04);
                } else {
                    bbv2 = new BBR(r5.A03, r5.A05, r5.A04);
                }
                AnonymousClass0Z9.A01(bbv2.A01, new BBW(bbv2), -889347344);
            }
            boolean A003 = C14410kR.A00(r5, r5.A02);
            if (!A003) {
                z2 = true;
            }
            z2 = false;
            if (A003 || z2) {
                if (z2) {
                    bbv = new BBT(r5.A00, r5.A05, r5.A04, r5.A06);
                } else {
                    bbv = new BBU(r5.A02, r5.A05, r5.A04, r5.A06);
                }
                AnonymousClass0Z9.A01(bbv.A01, new BBW(bbv), -889347344);
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onError(com.facebook.proxygen.HTTPRequestError r5) {
        /*
            r4 = this;
            p000X.C12670hC.A01()
            java.lang.Object r2 = r4.A08
            monitor-enter(r2)
            if (r5 != 0) goto L_0x0013
            com.facebook.proxygen.HTTPRequestError r5 = new com.facebook.proxygen.HTTPRequestError     // Catch:{ all -> 0x0052 }
            com.facebook.proxygen.HTTPRequestError$HTTPRequestStage r3 = com.facebook.proxygen.HTTPRequestError.HTTPRequestStage.Unknown     // Catch:{ all -> 0x0052 }
            com.facebook.proxygen.HTTPRequestError$ProxygenError r1 = com.facebook.proxygen.HTTPRequestError.ProxygenError.Unknown     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "Error is null"
            r5.<init>(r0, r3, r1)     // Catch:{ all -> 0x0052 }
        L_0x0013:
            com.facebook.proxygen.HTTPRequestError$ProxygenError r1 = r5.mErrCode     // Catch:{ all -> 0x0052 }
            com.facebook.proxygen.HTTPRequestError$ProxygenError r0 = com.facebook.proxygen.HTTPRequestError.ProxygenError.Canceled     // Catch:{ all -> 0x0052 }
            if (r1 != r0) goto L_0x003d
            X.1Cj r1 = r4.A07     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "cancelled"
            r1.A00 = r0     // Catch:{ all -> 0x0052 }
        L_0x001f:
            com.facebook.proxygen.RequestStatsObserver r0 = r4.A05     // Catch:{ all -> 0x0052 }
            com.facebook.proxygen.RequestStats r1 = r0.getRequestStats()     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x002c
            X.1Cj r0 = r4.A07     // Catch:{ all -> 0x0052 }
            r0.A00(r1)     // Catch:{ all -> 0x0052 }
        L_0x002c:
            java.lang.Integer r0 = p000X.Constants.A0Y     // Catch:{ all -> 0x0052 }
            r4.A0A = r0     // Catch:{ all -> 0x0052 }
            X.1xi r0 = new X.1xi     // Catch:{ all -> 0x0052 }
            r0.<init>(r5)     // Catch:{ all -> 0x0052 }
            r4.A01 = r0     // Catch:{ all -> 0x0052 }
            X.1Cm r1 = r4.A02     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x004e
            monitor-enter(r1)     // Catch:{ all -> 0x0052 }
            goto L_0x0044
        L_0x003d:
            X.1Cj r1 = r4.A07     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "error"
            r1.A00 = r0     // Catch:{ all -> 0x0052 }
            goto L_0x001f
        L_0x0044:
            r1.A00 = r0     // Catch:{ all -> 0x004a }
            r1.notifyAll()     // Catch:{ all -> 0x004a }
            goto L_0x004d
        L_0x004a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x004d:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
        L_0x004e:
            r4.A00(r5)     // Catch:{ all -> 0x0052 }
            goto L_0x005b
        L_0x0052:
            r1 = move-exception
            java.lang.String r0 = "error_on_error"
            p000X.AnonymousClass0QD.A09(r0, r1)     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r4.A08     // Catch:{ all -> 0x0069 }
            goto L_0x005d
        L_0x005b:
            java.lang.Object r0 = r4.A08     // Catch:{ all -> 0x0069 }
        L_0x005d:
            r0.notifyAll()     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            return
        L_0x0062:
            r1 = move-exception
            java.lang.Object r0 = r4.A08     // Catch:{ all -> 0x0069 }
            r0.notifyAll()     // Catch:{ all -> 0x0069 }
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C26271Cl.onError(com.facebook.proxygen.HTTPRequestError):void");
    }
}
