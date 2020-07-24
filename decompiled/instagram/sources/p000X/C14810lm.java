package p000X;

/* renamed from: X.0lm  reason: invalid class name and case insensitive filesystem */
public final class C14810lm {
    public final int A00 = 3;
    public final boolean A01;

    public C14810lm(boolean z) {
        this.A01 = z;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01dc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e2 A[Catch:{ IOException -> 0x033b, 1xi -> 0x033d }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ea A[Catch:{ IOException -> 0x033b, 1xi -> 0x033d }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f2 A[Catch:{ IOException -> 0x033b, 1xi -> 0x033d }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01fa A[Catch:{ IOException -> 0x033b, 1xi -> 0x033d }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0207 A[Catch:{ IOException -> 0x033b, 1xi -> 0x033d }, LOOP:2: B:71:0x0201->B:73:0x0207, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x021e A[Catch:{ IOException -> 0x033b, 1xi -> 0x033d }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x022d A[Catch:{ IOException -> 0x033b, 1xi -> 0x033d }] */
    public final p000X.C33861dc A00(p000X.C14430kT r22, p000X.AnonymousClass1C3 r23) {
        /*
            r21 = this;
            r3 = 0
            r2 = 0
        L_0x0002:
            r5 = 1
            int r2 = r2 + r5
            r6 = r23
            r20 = r21
            r0 = r20
            boolean r0 = r0.A01     // Catch:{ 1xi -> 0x033d }
            if (r0 == 0) goto L_0x0026
            X.19m r0 = r6.A03     // Catch:{ 1xi -> 0x033d }
            X.0nk r1 = r0.A05     // Catch:{ 1xi -> 0x033d }
            X.0nk r0 = p000X.C15920nk.API     // Catch:{ 1xi -> 0x033d }
            if (r1 != r0) goto L_0x0026
            if (r2 <= r5) goto L_0x0026
            X.1C4 r0 = r6.A02     // Catch:{ 1xi -> 0x033d }
            java.lang.String r4 = "X-Tigon-Is-Retry"
            r0.A00(r4)     // Catch:{ 1xi -> 0x033d }
            X.1C4 r1 = r6.A02     // Catch:{ 1xi -> 0x033d }
            java.lang.String r0 = "True"
            r1.A01(r4, r0)     // Catch:{ 1xi -> 0x033d }
        L_0x0026:
            java.lang.String r9 = "Connection"
            java.lang.String r11 = "Accept-Language"
            java.lang.String r12 = "User-Agent"
            X.1C4 r8 = r6.A02     // Catch:{ 1xi -> 0x033d }
            p000X.C12670hC.A01()     // Catch:{ 1xi -> 0x033d }
            java.net.URI r0 = r8.A04     // Catch:{ 1xi -> 0x033d }
            r0.getHost()     // Catch:{ 1xi -> 0x033d }
            com.facebook.proxygen.NativeReadBuffer r13 = new com.facebook.proxygen.NativeReadBuffer     // Catch:{ 1xi -> 0x033d }
            r13.<init>()     // Catch:{ 1xi -> 0x033d }
            r13.init()     // Catch:{ 1xi -> 0x033d }
            com.facebook.proxygen.TraceEventObserver[] r1 = new com.facebook.proxygen.TraceEventObserver[r5]     // Catch:{ 1xi -> 0x033d }
            com.facebook.proxygen.RequestStatsObserver r17 = new com.facebook.proxygen.RequestStatsObserver     // Catch:{ 1xi -> 0x033d }
            r17.<init>()     // Catch:{ 1xi -> 0x033d }
            r0 = 0
            r1[r0] = r17     // Catch:{ 1xi -> 0x033d }
            X.1Ch r14 = new X.1Ch     // Catch:{ 1xi -> 0x033d }
            int r0 = p000X.C14430kT.A0P     // Catch:{ 1xi -> 0x033d }
            r14.<init>(r0)     // Catch:{ 1xi -> 0x033d }
            com.facebook.proxygen.TraceEventContext r10 = new com.facebook.proxygen.TraceEventContext     // Catch:{ 1xi -> 0x033d }
            r10.<init>(r1, r14)     // Catch:{ 1xi -> 0x033d }
            X.1Cj r1 = new X.1Cj     // Catch:{ 1xi -> 0x033d }
            X.19m r0 = r6.A03     // Catch:{ 1xi -> 0x033d }
            X.0nk r7 = r0.A05     // Catch:{ 1xi -> 0x033d }
            X.1Ck r4 = new X.1Ck     // Catch:{ 1xi -> 0x033d }
            r5 = r22
            X.0ln r0 = r5.A08     // Catch:{ 1xi -> 0x033d }
            r4.<init>(r14, r0)     // Catch:{ 1xi -> 0x033d }
            X.0m8 r0 = r5.A00     // Catch:{ 1xi -> 0x033d }
            r1.<init>(r7, r4, r0)     // Catch:{ 1xi -> 0x033d }
            X.1Cl r7 = new X.1Cl     // Catch:{ 1xi -> 0x033d }
            X.0kR r0 = r5.A07     // Catch:{ 1xi -> 0x033d }
            r16 = r13
            r18 = r1
            r19 = r0
            r14 = r7
            r15 = r8
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ 1xi -> 0x033d }
            com.facebook.proxygen.HTTPRequestHandler r4 = new com.facebook.proxygen.HTTPRequestHandler     // Catch:{ 1xi -> 0x033d }
            r4.<init>()     // Catch:{ 1xi -> 0x033d }
            com.facebook.proxygen.JniHandler r1 = new com.facebook.proxygen.JniHandler     // Catch:{ 1xi -> 0x033d }
            r1.<init>(r4, r7)     // Catch:{ 1xi -> 0x033d }
            com.facebook.proxygen.HTTPClient r0 = p000X.C14430kT.A0Q     // Catch:{ IOException -> 0x033b }
            r0.make(r1, r13, r10)     // Catch:{ IOException -> 0x033b }
            boolean r0 = p000X.AnonymousClass1CU.A00()     // Catch:{ IOException -> 0x033b }
            if (r0 == 0) goto L_0x00a3
            java.lang.String r10 = "ta_enabled"
            java.lang.String r1 = "true"
            java.util.Map r0 = r8.A06     // Catch:{ IOException -> 0x033b }
            r0.put(r10, r1)     // Catch:{ IOException -> 0x033b }
            java.lang.String r10 = "request_name"
            X.19m r0 = r6.A03     // Catch:{ IOException -> 0x033b }
            java.lang.String r1 = r0.A08     // Catch:{ IOException -> 0x033b }
            java.util.Map r0 = r8.A06     // Catch:{ IOException -> 0x033b }
            r0.put(r10, r1)     // Catch:{ IOException -> 0x033b }
        L_0x00a3:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ IOException -> 0x033b }
            r10.<init>()     // Catch:{ IOException -> 0x033b }
            java.util.List r0 = r8.A05     // Catch:{ IOException -> 0x033b }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ IOException -> 0x033b }
            r13 = 0
            r1 = r13
        L_0x00b0:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x033b }
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r14 = r16.next()     // Catch:{ IOException -> 0x033b }
            X.0pp r14 = (p000X.C17190pp) r14     // Catch:{ IOException -> 0x033b }
            java.lang.String r15 = r14.A00     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = "x-fb-client-cdn-log-transid"
            boolean r0 = r15.equals(r0)     // Catch:{ IOException -> 0x033b }
            if (r0 == 0) goto L_0x00c9
            r13 = r14
            goto L_0x00b0
        L_0x00c9:
            java.lang.String r0 = "x-fb-client-cdn-log-clientid"
            boolean r0 = r15.equals(r0)     // Catch:{ IOException -> 0x033b }
            if (r0 == 0) goto L_0x00d4
            r1 = r14
            goto L_0x00b0
        L_0x00d4:
            java.util.Map r0 = p000X.AnonymousClass1CU.A05     // Catch:{ IOException -> 0x033b }
            boolean r0 = r0.containsValue(r15)     // Catch:{ IOException -> 0x033b }
            if (r0 != 0) goto L_0x00b0
            r10.add(r14)     // Catch:{ IOException -> 0x033b }
            goto L_0x00b0
        L_0x00e0:
            boolean r0 = p000X.AnonymousClass1CU.A00()     // Catch:{ IOException -> 0x033b }
            if (r0 == 0) goto L_0x0176
            X.0pp r13 = new X.0pp     // Catch:{ IOException -> 0x033b }
            java.lang.String r1 = "x-fb-client-cdn-log-transid"
            int r0 = r8.A00     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ IOException -> 0x033b }
            r13.<init>(r1, r0)     // Catch:{ IOException -> 0x033b }
            r10.add(r13)     // Catch:{ IOException -> 0x033b }
            X.0pp r13 = new X.0pp     // Catch:{ IOException -> 0x033b }
            java.lang.String r1 = "x-fb-client-cdn-log-clientid"
            X.0cF r0 = p000X.C09870cF.A00()     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = r0.A09()     // Catch:{ IOException -> 0x033b }
            r13.<init>(r1, r0)     // Catch:{ IOException -> 0x033b }
            r10.add(r13)     // Catch:{ IOException -> 0x033b }
            X.0pp r13 = new X.0pp     // Catch:{ IOException -> 0x033b }
            java.lang.String r16 = "x-fb-product-log"
            int r0 = r8.A00     // Catch:{ IOException -> 0x033b }
            java.lang.String r15 = java.lang.Integer.toString(r0)     // Catch:{ IOException -> 0x033b }
            X.0cF r0 = p000X.C09870cF.A00()     // Catch:{ IOException -> 0x033b }
            java.lang.String r14 = r0.A09()     // Catch:{ IOException -> 0x033b }
            java.lang.String r1 = "transient_analysis_ig4a"
            java.lang.String r0 = ":"
            java.lang.String r1 = p000X.AnonymousClass000.A0O(r1, r0, r15, r0, r14)     // Catch:{ IOException -> 0x033b }
            r0 = r16
            r13.<init>(r0, r1)     // Catch:{ IOException -> 0x033b }
            r10.add(r13)     // Catch:{ IOException -> 0x033b }
        L_0x012e:
            boolean r0 = r8.A02(r12)     // Catch:{ IOException -> 0x033b }
            if (r0 != 0) goto L_0x013e
            X.0pp r1 = new X.0pp     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = r5.A0B     // Catch:{ IOException -> 0x033b }
            r1.<init>(r12, r0)     // Catch:{ IOException -> 0x033b }
            r10.add(r1)     // Catch:{ IOException -> 0x033b }
        L_0x013e:
            boolean r0 = r8.A02(r11)     // Catch:{ IOException -> 0x033b }
            if (r0 != 0) goto L_0x0150
            X.0pp r1 = new X.0pp     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = p000X.C05940Nb.A00()     // Catch:{ IOException -> 0x033b }
            r1.<init>(r11, r0)     // Catch:{ IOException -> 0x033b }
            r10.add(r1)     // Catch:{ IOException -> 0x033b }
        L_0x0150:
            boolean r0 = r8.A02(r9)     // Catch:{ IOException -> 0x033b }
            if (r0 != 0) goto L_0x0160
            X.0pp r1 = new X.0pp     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = "Keep-Alive"
            r1.<init>(r9, r0)     // Catch:{ IOException -> 0x033b }
            r10.add(r1)     // Catch:{ IOException -> 0x033b }
        L_0x0160:
            X.1Bb r1 = r8.A01     // Catch:{ IOException -> 0x033b }
            if (r1 == 0) goto L_0x0169
            java.net.URI r0 = r8.A04     // Catch:{ IOException -> 0x033b }
            r1.A01(r0, r10)     // Catch:{ IOException -> 0x033b }
        L_0x0169:
            X.1Cq r0 = new X.1Cq     // Catch:{ IOException -> 0x033b }
            r0.<init>(r5, r4)     // Catch:{ IOException -> 0x033b }
            r6.A01(r0)     // Catch:{ IOException -> 0x033b }
            boolean r0 = p000X.AnonymousClass0DB.A0S()     // Catch:{ IOException -> 0x033b }
            goto L_0x0181
        L_0x0176:
            if (r13 == 0) goto L_0x017b
            r10.add(r13)     // Catch:{ IOException -> 0x033b }
        L_0x017b:
            if (r1 == 0) goto L_0x012e
            r10.add(r1)     // Catch:{ IOException -> 0x033b }
            goto L_0x012e
        L_0x0181:
            java.lang.String r11 = "Accept-Encoding"
            if (r0 == 0) goto L_0x01ba
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x033b }
            r5.<init>(r10)     // Catch:{ IOException -> 0x033b }
            X.0pp r9 = new X.0pp     // Catch:{ IOException -> 0x033b }
            java.lang.String r1 = "Host"
            java.net.URI r0 = r8.A04     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = r0.getHost()     // Catch:{ IOException -> 0x033b }
            r9.<init>(r1, r0)     // Catch:{ IOException -> 0x033b }
            r5.add(r9)     // Catch:{ IOException -> 0x033b }
            X.0pp r1 = new X.0pp     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = "gzip,deflate"
            r1.<init>(r11, r0)     // Catch:{ IOException -> 0x033b }
            r5.add(r1)     // Catch:{ IOException -> 0x033b }
            java.lang.Integer r0 = r8.A03     // Catch:{ IOException -> 0x033b }
            p000X.C36831ig.A00(r0)     // Catch:{ IOException -> 0x033b }
            int r0 = r5.size()     // Catch:{ IOException -> 0x033b }
            X.0pp[] r0 = new p000X.C17190pp[r0]     // Catch:{ IOException -> 0x033b }
            java.lang.Object[] r1 = r5.toArray(r0)     // Catch:{ IOException -> 0x033b }
            X.0pp[] r1 = (p000X.C17190pp[]) r1     // Catch:{ IOException -> 0x033b }
            X.1Bv r0 = r8.A02     // Catch:{ IOException -> 0x033b }
            p000X.AnonymousClass2AQ.A00(r1, r0)     // Catch:{ IOException -> 0x033b }
        L_0x01ba:
            java.lang.Integer r5 = r8.A03     // Catch:{ IOException -> 0x033b }
            java.lang.Integer r0 = p000X.Constants.A0N     // Catch:{ IOException -> 0x033b }
            r11 = 0
            if (r5 == r0) goto L_0x01c6
            java.lang.Integer r0 = p000X.Constants.ZERO     // Catch:{ IOException -> 0x033b }
            r1 = 0
            if (r5 != r0) goto L_0x01c7
        L_0x01c6:
            r1 = 1
        L_0x01c7:
            boolean r0 = r8.A07     // Catch:{ IOException -> 0x033b }
            if (r0 != 0) goto L_0x01d4
            if (r1 == 0) goto L_0x01d2
            X.1Bv r0 = r8.A02     // Catch:{ IOException -> 0x033b }
            if (r0 != 0) goto L_0x01d2
            goto L_0x01d4
        L_0x01d2:
            r12 = 0
            goto L_0x01d5
        L_0x01d4:
            r12 = 1
        L_0x01d5:
            int r0 = r5.intValue()     // Catch:{ IOException -> 0x033b }
            switch(r0) {
                case 0: goto L_0x01fa;
                case 1: goto L_0x01ea;
                case 2: goto L_0x01dc;
                case 3: goto L_0x01f2;
                case 4: goto L_0x01e2;
                default: goto L_0x01dc;
            }     // Catch:{ IOException -> 0x033b }
        L_0x01dc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ IOException -> 0x033b }
            r0.<init>()     // Catch:{ IOException -> 0x033b }
            throw r0     // Catch:{ IOException -> 0x033b }
        L_0x01e2:
            org.apache.http.client.methods.HttpDelete r5 = new org.apache.http.client.methods.HttpDelete     // Catch:{ IOException -> 0x033b }
            java.net.URI r0 = r8.A04     // Catch:{ IOException -> 0x033b }
            r5.<init>(r0)     // Catch:{ IOException -> 0x033b }
            goto L_0x0201
        L_0x01ea:
            org.apache.http.client.methods.HttpPost r5 = new org.apache.http.client.methods.HttpPost     // Catch:{ IOException -> 0x033b }
            java.net.URI r0 = r8.A04     // Catch:{ IOException -> 0x033b }
            r5.<init>(r0)     // Catch:{ IOException -> 0x033b }
            goto L_0x0201
        L_0x01f2:
            org.apache.http.client.methods.HttpGet r5 = new org.apache.http.client.methods.HttpGet     // Catch:{ IOException -> 0x033b }
            java.net.URI r0 = r8.A04     // Catch:{ IOException -> 0x033b }
            r5.<init>(r0)     // Catch:{ IOException -> 0x033b }
            goto L_0x0201
        L_0x01fa:
            org.apache.http.client.methods.HttpHead r5 = new org.apache.http.client.methods.HttpHead     // Catch:{ IOException -> 0x033b }
            java.net.URI r0 = r8.A04     // Catch:{ IOException -> 0x033b }
            r5.<init>(r0)     // Catch:{ IOException -> 0x033b }
        L_0x0201:
            int r0 = r10.size()     // Catch:{ IOException -> 0x033b }
            if (r11 >= r0) goto L_0x021c
            java.lang.Object r0 = r10.get(r11)     // Catch:{ IOException -> 0x033b }
            X.0pp r0 = (p000X.C17190pp) r0     // Catch:{ IOException -> 0x033b }
            org.apache.http.message.BasicHeader r9 = new org.apache.http.message.BasicHeader     // Catch:{ IOException -> 0x033b }
            java.lang.String r1 = r0.A00     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = r0.A01     // Catch:{ IOException -> 0x033b }
            r9.<init>(r1, r0)     // Catch:{ IOException -> 0x033b }
            r5.addHeader(r9)     // Catch:{ IOException -> 0x033b }
            int r11 = r11 + 1
            goto L_0x0201
        L_0x021c:
            if (r12 == 0) goto L_0x0229
            org.apache.http.params.HttpParams r9 = r5.getParams()     // Catch:{ IOException -> 0x033b }
            java.lang.String r1 = "replay_safe"
            r0 = 1
            r9.setBooleanParameter(r1, r0)     // Catch:{ IOException -> 0x033b }
        L_0x0229:
            X.1Bv r0 = r8.A02     // Catch:{ IOException -> 0x033b }
            if (r0 == 0) goto L_0x02bd
            r11 = r5
            org.apache.http.HttpEntityEnclosingRequest r11 = (org.apache.http.HttpEntityEnclosingRequest) r11     // Catch:{ IOException -> 0x033b }
            org.apache.http.entity.InputStreamEntity r10 = new org.apache.http.entity.InputStreamEntity     // Catch:{ IOException -> 0x033b }
            java.io.InputStream r9 = r0.BWa()     // Catch:{ IOException -> 0x033b }
            X.1Bv r0 = r8.A02     // Catch:{ IOException -> 0x033b }
            long r0 = r0.getContentLength()     // Catch:{ IOException -> 0x033b }
            r10.<init>(r9, r0)     // Catch:{ IOException -> 0x033b }
            r11.setEntity(r10)     // Catch:{ IOException -> 0x033b }
            X.1Bv r0 = r8.A02     // Catch:{ IOException -> 0x033b }
            X.0pp r0 = r0.AIn()     // Catch:{ IOException -> 0x033b }
            java.lang.String r1 = r0.A00     // Catch:{ IOException -> 0x033b }
            X.1Bv r0 = r8.A02     // Catch:{ IOException -> 0x033b }
            X.0pp r0 = r0.AIn()     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = r0.A01     // Catch:{ IOException -> 0x033b }
            r5.addHeader(r1, r0)     // Catch:{ IOException -> 0x033b }
            X.1Bv r0 = r8.A02     // Catch:{ IOException -> 0x033b }
            X.0pp r0 = r0.AIj()     // Catch:{ IOException -> 0x033b }
            if (r0 == 0) goto L_0x0264
            java.lang.String r1 = r0.A00     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = r0.A01     // Catch:{ IOException -> 0x033b }
            r5.addHeader(r1, r0)     // Catch:{ IOException -> 0x033b }
        L_0x0264:
            X.1Bv r0 = r8.A02     // Catch:{ IOException -> 0x033b }
            long r0 = r0.getContentLength()     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x033b }
            java.lang.String r10 = "Content-Length"
            r5.addHeader(r10, r0)     // Catch:{ IOException -> 0x033b }
            X.1Bv r0 = r8.A02     // Catch:{ IOException -> 0x033b }
            long r13 = r0.getContentLength()     // Catch:{ IOException -> 0x033b }
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x02bd
            java.lang.Integer r1 = r8.A03     // Catch:{ IOException -> 0x033b }
            java.lang.Integer r0 = p000X.Constants.ONE     // Catch:{ IOException -> 0x033b }
            if (r1 != r0) goto L_0x02ba
            java.net.URI r0 = r8.A04     // Catch:{ IOException -> 0x033b }
            java.lang.String r1 = r0.toString()     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = "phase=transfer"
            boolean r0 = r1.contains(r0)     // Catch:{ IOException -> 0x033b }
            if (r0 == 0) goto L_0x02ba
            X.1Bv r1 = r8.A02     // Catch:{ IOException -> 0x033b }
            if (r1 == 0) goto L_0x02ba
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = "class:"
            r9.<init>(r0)     // Catch:{ IOException -> 0x033b }
            java.lang.Class r0 = r1.getClass()     // Catch:{ IOException -> 0x033b }
            r9.append(r0)     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = " len:"
            r9.append(r0)     // Catch:{ IOException -> 0x033b }
            long r0 = r1.getContentLength()     // Catch:{ IOException -> 0x033b }
            r9.append(r0)     // Catch:{ IOException -> 0x033b }
            java.lang.String r1 = r9.toString()     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = "igtv_header_missing_content_length"
            p000X.AnonymousClass0QD.A01(r0, r1)     // Catch:{ IOException -> 0x033b }
        L_0x02ba:
            r5.removeHeaders(r10)     // Catch:{ IOException -> 0x033b }
        L_0x02bd:
            r4.executeWithDefragmentation(r5)     // Catch:{ IOException -> 0x033b }
            java.lang.Object r9 = r7.A08     // Catch:{ IOException -> 0x033b }
            monitor-enter(r9)     // Catch:{ IOException -> 0x033b }
        L_0x02c3:
            java.lang.Integer r1 = r7.A0A     // Catch:{ all -> 0x0316 }
            java.lang.Integer r0 = p000X.Constants.ONE     // Catch:{ all -> 0x0316 }
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x0316 }
            if (r0 >= 0) goto L_0x02d6
            java.lang.Object r4 = r7.A08     // Catch:{ InterruptedException -> 0x02c3 }
            r0 = 60000(0xea60, double:2.9644E-319)
            r4.wait(r0)     // Catch:{ InterruptedException -> 0x02c3 }
            goto L_0x02c3
        L_0x02d6:
            monitor-exit(r9)     // Catch:{ all -> 0x0316 }
            X.1xi r0 = r7.A01     // Catch:{ IOException -> 0x033b }
            if (r0 != 0) goto L_0x0315
            X.1dc r1 = r7.A00     // Catch:{ IOException -> 0x033b }
            if (r1 == 0) goto L_0x030b
            java.lang.String r0 = r1.A02     // Catch:{ IOException -> 0x033b }
            if (r0 == 0) goto L_0x030b
            java.lang.String r0 = "LigerIgResponseHandler.getResponse: mResponse is null"
            p000X.AnonymousClass0a4.A07(r1, r0)     // Catch:{ IOException -> 0x033b }
            X.1dc r5 = r7.A00     // Catch:{ IOException -> 0x033b }
            X.1Bb r4 = r8.A01     // Catch:{ IOException -> 0x033b }
            if (r4 == 0) goto L_0x02f9
            java.net.URI r1 = r8.A04     // Catch:{ IOException -> 0x033b }
            java.util.Map r0 = r7.A03     // Catch:{ IOException -> 0x033b }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ IOException -> 0x033b }
            r4.A02(r1, r0)     // Catch:{ IOException -> 0x033b }
        L_0x02f9:
            boolean r0 = p000X.AnonymousClass0DB.A0S()     // Catch:{ IOException -> 0x033b }
            r3 = r5
            int r1 = r5.A01     // Catch:{ 1xi -> 0x033d }
            r0 = 408(0x198, float:5.72E-43)
            if (r1 != r0) goto L_0x0370
            X.1C4 r0 = r6.A02     // Catch:{ 1xi -> 0x033d }
            boolean r0 = r0.A08     // Catch:{ 1xi -> 0x033d }
            if (r0 != 0) goto L_0x036a
            goto L_0x0371
        L_0x030b:
            if (r1 != 0) goto L_0x0319
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x033b }
            r1.<init>()     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = "null response received at: "
            goto L_0x0320
        L_0x0315:
            throw r0     // Catch:{ IOException -> 0x033b }
        L_0x0316:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0316 }
            goto L_0x0337
        L_0x0319:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x033b }
            r1.<init>()     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = "null response status line received: "
        L_0x0320:
            r1.append(r0)     // Catch:{ IOException -> 0x033b }
            java.lang.Integer r0 = r7.A0A     // Catch:{ IOException -> 0x033b }
            if (r0 == 0) goto L_0x0338
            java.lang.String r0 = p000X.C35931hA.A00(r0)     // Catch:{ IOException -> 0x033b }
        L_0x032b:
            r1.append(r0)     // Catch:{ IOException -> 0x033b }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x033b }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x033b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x033b }
        L_0x0337:
            throw r1     // Catch:{ IOException -> 0x033b }
        L_0x0338:
            java.lang.String r0 = "null"
            goto L_0x032b
        L_0x033b:
            r0 = move-exception
            throw r0     // Catch:{ 1xi -> 0x033d }
        L_0x033d:
            r5 = move-exception
            com.facebook.proxygen.HTTPRequestError r0 = r5.A00
            com.facebook.proxygen.HTTPRequestError$HTTPRequestStage r4 = r0.mErrStage
            com.facebook.proxygen.HTTPRequestError$HTTPRequestStage r0 = com.facebook.proxygen.HTTPRequestError.HTTPRequestStage.ProcessRequest
            if (r4 == r0) goto L_0x035b
            com.facebook.proxygen.HTTPRequestError$HTTPRequestStage r0 = com.facebook.proxygen.HTTPRequestError.HTTPRequestStage.DNSResolution
            if (r4 == r0) goto L_0x035b
            com.facebook.proxygen.HTTPRequestError$HTTPRequestStage r0 = com.facebook.proxygen.HTTPRequestError.HTTPRequestStage.TCPConnection
            if (r4 == r0) goto L_0x035b
            com.facebook.proxygen.HTTPRequestError$HTTPRequestStage r0 = com.facebook.proxygen.HTTPRequestError.HTTPRequestStage.TLSSetup
            if (r4 == r0) goto L_0x035b
            com.facebook.proxygen.HTTPRequestError$HTTPRequestStage r0 = com.facebook.proxygen.HTTPRequestError.HTTPRequestStage.ZeroRttSent
            if (r4 == r0) goto L_0x035b
            com.facebook.proxygen.HTTPRequestError$HTTPRequestStage r1 = com.facebook.proxygen.HTTPRequestError.HTTPRequestStage.SendRequest
            r0 = 0
            if (r4 != r1) goto L_0x035c
        L_0x035b:
            r0 = 1
        L_0x035c:
            if (r0 == 0) goto L_0x0372
            X.1C4 r0 = r6.A02
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0372
            r0 = r20
            int r0 = r0.A00
            if (r2 >= r0) goto L_0x0372
        L_0x036a:
            r0 = r20
            int r0 = r0.A00
            if (r2 < r0) goto L_0x0002
        L_0x0370:
            return r3
        L_0x0371:
            return r5
        L_0x0372:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C14810lm.A00(X.0kT, X.1C3):X.1dc");
    }
}
