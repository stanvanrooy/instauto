package p000X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.model.direct.DirectThreadKey;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* renamed from: X.0tA  reason: invalid class name and case insensitive filesystem */
public final class C19250tA {
    public static C19240t9 A07;
    public static C05110Id A08;
    public final AnonymousClass0OT A00;
    public final C65922ud A01;
    public final AnonymousClass0C1 A02;
    public final C23300zv A03;
    public final C19260tB A04;
    public final C19240t9 A05;
    public volatile boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0092, code lost:
        if (r2.A03(r4, p000X.C64832s7.A02(r2.A08(), p000X.AnonymousClass000.A0J("thread_id=='", r4.AY5(), "'")), r5) > 0) goto L_0x0094;
     */
    public static void A02(C19250tA r13, C59892iy r14, int i, ByteArrayOutputStream byteArrayOutputStream) {
        AnonymousClass2YG r8;
        List A032;
        String str;
        synchronized (r14) {
            C58742gS A033 = r14.A05.clone();
            C60072jH A012 = A033.A01();
            List list = r14.A07;
            C59982j8 r1 = C59982j8.A00;
            AnonymousClass2YH r2 = new AnonymousClass2YH(r1, r1.A00, i, 0);
            C59972j7 r12 = C59962j6.A00;
            C60072jH A034 = C60082jI.A03(list, A012, r2, r12);
            List A042 = C60082jI.A04(r14.A07, A034, r12);
            C60072jH A022 = A033.A02();
            synchronized (r14) {
                A032 = C05970Ne.A03(C60082jI.A04(r14.A07, A022, C59962j6.A00), r14.A03);
            }
            C59982j8 r3 = C59982j8.A00;
            AnonymousClass2YH r22 = new AnonymousClass2YH(r3, r3.A01, 0, i);
            C59972j7 r0 = C59962j6.A00;
            C60072jH A035 = C60082jI.A03(A032, A022, r22, r0);
            List A043 = C05970Ne.A04(A042, C60082jI.A04(A032, A035, r0), C59962j6.A04);
            C59892iy.A03(A033, A034, A042);
            C59892iy.A04(A033, A035, A043);
            r8 = new AnonymousClass2YG(A033, A043);
        }
        C58742gS r4 = r8.A00;
        List<C58012fA> list2 = r8.A01;
        C19250tA r6 = r13;
        C64822s6 A002 = C64822s6.A00(r13.A02);
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        if (r4.AY5() != null) {
        }
        List AQ1 = r4.AQ1();
        if (AQ1 == null || AQ1.isEmpty()) {
            str = null;
        } else {
            str = C06360Ot.A04(",", DirectThreadKey.A00(AQ1));
        }
        if (A002.A03(r4, C64832s7.A02(A002.A08(), AnonymousClass000.A0P("(recipient_ids=='", str, "' AND ", "thread_id", " IS NULL", ")")), byteArrayOutputStream2) == 0) {
            A002.A0D(r4, byteArrayOutputStream2);
        }
        DirectThreadKey AOO = r4.AOO();
        C57972f6 A003 = C57972f6.A00(r6.A02);
        for (C58012fA r02 : list2) {
            r02.A0N(AOO);
            A003.A0D(r02, byteArrayOutputStream2);
        }
    }

    public static void A01(C19250tA r2) {
        C64822s6 A002 = C64822s6.A00(r2.A02);
        A002.A04(A002.A08());
        C57972f6 A003 = C57972f6.A00(r2.A02);
        A003.A04(A003.A08());
        AnonymousClass0C1 r22 = r2.A02;
        C57992f8 r1 = (C57992f8) r22.AVA(C57992f8.class, new C58652gJ(r22));
        r1.A04(r1.A08());
    }

    /* JADX WARNING: type inference failed for: r0v84, types: [X.0pf] */
    /* JADX WARNING: type inference failed for: r0v88 */
    /* JADX WARNING: type inference failed for: r16v3, types: [X.0tp] */
    /* JADX WARNING: type inference failed for: r16v4, types: [X.0tV] */
    /* JADX WARNING: type inference failed for: r16v5, types: [X.0tl] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02ac A[Catch:{ SQLiteException | IllegalStateException -> 0x0320, all -> 0x0332, all -> 0x0346 }] */
    public final synchronized void A04() {
        /*
            r24 = this;
            r3 = r24
            monitor-enter(r3)
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ all -> 0x0352 }
            if (r0 == 0) goto L_0x000f
            java.lang.String r1 = "DirectSQLiteDiskIO.maybeRetrieveInboxFromDiskSync"
            r0 = -1919992674(0xffffffff8d8f3c9e, float:-8.8276485E-31)
            p000X.AnonymousClass0ZB.A01(r1, r0)     // Catch:{ all -> 0x0352 }
        L_0x000f:
            boolean r0 = p000X.C64452rV.A03()     // Catch:{ all -> 0x0346 }
            if (r0 != 0) goto L_0x033a
            boolean r0 = r3.A06     // Catch:{ all -> 0x0346 }
            if (r0 != 0) goto L_0x033a
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0346 }
            X.2rV r0 = p000X.C64452rV.A00()     // Catch:{ all -> 0x0346 }
            android.database.sqlite.SQLiteDatabase r4 = r0.A05()     // Catch:{ all -> 0x0346 }
            if (r4 != 0) goto L_0x0032
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ all -> 0x0352 }
            if (r0 == 0) goto L_0x0344
            r0 = 1116948197(0x429346e5, float:73.638466)
            p000X.AnonymousClass0ZB.A00(r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0344
        L_0x0032:
            r0 = 2027026374(0x78d1f7c6, float:3.4069234E34)
            p000X.AnonymousClass0ZG.A01(r4, r0)     // Catch:{ all -> 0x0346 }
            X.0C1 r0 = r3.A02     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            X.2s6 r7 = p000X.C64822s6.A00(r0)     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            r2 = 0
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            if (r0 == 0) goto L_0x004b
            r1 = -1413115892(0xffffffffabc5900c, float:-1.4037673E-12)
            java.lang.String r0 = "DirectThreadSQLiteTable.getThreadSummaries"
            p000X.AnonymousClass0ZB.A01(r0, r1)     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
        L_0x004b:
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x0309 }
            java.lang.String r0 = r7.A08()     // Catch:{ all -> 0x0309 }
            r6[r2] = r0     // Catch:{ all -> 0x0309 }
            r5 = 1
            java.lang.String r1 = "is_permitted=="
            java.lang.String r0 = "1"
            java.lang.String r0 = p000X.AnonymousClass000.A0E(r1, r0)     // Catch:{ all -> 0x0309 }
            r6[r5] = r0     // Catch:{ all -> 0x0309 }
            java.lang.String r1 = p000X.C64832s7.A02(r6)     // Catch:{ all -> 0x0309 }
            r0 = 0
            java.util.List r6 = r7.A0B(r1, r0)     // Catch:{ all -> 0x0309 }
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            if (r0 == 0) goto L_0x0072
            r0 = -1749870456(0xffffffff97b31888, float:-1.1573796E-24)
            p000X.AnonymousClass0ZB.A00(r0)     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
        L_0x0072:
            X.0C1 r0 = r3.A02     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            X.2f6 r5 = p000X.C57972f6.A00(r0)     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ all -> 0x02fd }
            if (r0 == 0) goto L_0x0084
            java.lang.String r1 = "DirectMessageSQLiteTable.getAllMessagesSortedByThread"
            r0 = -883681420(0xffffffffcb541774, float:-1.3899636E7)
            p000X.AnonymousClass0ZB.A01(r1, r0)     // Catch:{ all -> 0x02fd }
        L_0x0084:
            java.lang.String r1 = r5.A08()     // Catch:{ all -> 0x02fd }
            java.lang.String r0 = "thread_id ASC"
            java.util.List r10 = r5.A0B(r1, r0)     // Catch:{ all -> 0x02fd }
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            if (r0 == 0) goto L_0x0099
            r0 = -210807955(0xfffffffff36f536d, float:-1.896135E31)
            p000X.AnonymousClass0ZB.A00(r0)     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
        L_0x0099:
            X.0C1 r5 = r3.A02     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            java.lang.Class<X.2f9> r1 = p000X.C58002f9.class
            X.2iv r0 = new X.2iv     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            r0.<init>(r5)     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            X.0Po r5 = r5.AVA(r1, r0)     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            X.2f9 r5 = (p000X.C58002f9) r5     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            if (r0 == 0) goto L_0x00b4
            r1 = 194830876(0xb9ce21c, float:6.0429226E-32)
            java.lang.String r0 = "DirectMutationSQLiteTable.getAllMutations"
            p000X.AnonymousClass0ZB.A01(r0, r1)     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
        L_0x00b4:
            java.lang.String r1 = r5.A08()     // Catch:{ all -> 0x02fb }
            r0 = 0
            java.util.List r15 = r5.A0B(r1, r0)     // Catch:{ all -> 0x02fb }
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            if (r0 == 0) goto L_0x00c7
            r0 = 1493483907(0x5904c183, float:2.33546658E15)
            p000X.AnonymousClass0ZB.A00(r0)     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
        L_0x00c7:
            r4.setTransactionSuccessful()     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            A00(r4)     // Catch:{ all -> 0x0346 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0346 }
            int r0 = r6.size()     // Catch:{ all -> 0x0346 }
            r1.<init>(r0)     // Catch:{ all -> 0x0346 }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x0346 }
        L_0x00da:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x0346 }
            X.2gS r4 = (p000X.C58742gS) r4     // Catch:{ all -> 0x0346 }
            com.instagram.model.direct.DirectThreadKey r0 = r4.AOO()     // Catch:{ all -> 0x0346 }
            r1.put(r0, r4)     // Catch:{ all -> 0x0346 }
            goto L_0x00da
        L_0x00ee:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0346 }
            r8.<init>()     // Catch:{ all -> 0x0346 }
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0346 }
            r7 = 0
            r6 = 1
            if (r0 != 0) goto L_0x020d
            int r5 = r10.size()     // Catch:{ all -> 0x0346 }
            r14 = 0
        L_0x0100:
            if (r2 >= r5) goto L_0x020c
            java.lang.Object r9 = r10.get(r2)     // Catch:{ all -> 0x0346 }
            X.2fA r9 = (p000X.C58012fA) r9     // Catch:{ all -> 0x0346 }
            com.instagram.model.direct.DirectThreadKey r4 = r9.A0c     // Catch:{ all -> 0x0346 }
            r9.A0N(r7)     // Catch:{ all -> 0x0346 }
            java.lang.Integer r0 = r9.A0i     // Catch:{ all -> 0x0346 }
            boolean r0 = p000X.C59882ix.A01(r0)     // Catch:{ all -> 0x0346 }
            if (r0 != 0) goto L_0x011a
            r8.add(r9)     // Catch:{ all -> 0x0346 }
            goto L_0x01d5
        L_0x011a:
            X.0C1 r13 = r3.A02     // Catch:{ all -> 0x0346 }
            X.2fB r11 = r9.A0d     // Catch:{ all -> 0x0346 }
            X.2fB r0 = p000X.C58022fB.TEXT     // Catch:{ all -> 0x0346 }
            if (r11 == r0) goto L_0x012b
            X.2fB r0 = p000X.C58022fB.LINK     // Catch:{ all -> 0x0346 }
            if (r11 == r0) goto L_0x012b
            X.2fB r12 = p000X.C58022fB.LIKE     // Catch:{ all -> 0x0346 }
            r0 = 0
            if (r11 != r12) goto L_0x012c
        L_0x012b:
            r0 = 1
        L_0x012c:
            if (r0 == 0) goto L_0x01a9
            int r0 = r11.ordinal()     // Catch:{ all -> 0x0346 }
            switch(r0) {
                case 1: goto L_0x016b;
                case 8: goto L_0x018d;
                case 15: goto L_0x0149;
                default: goto L_0x0135;
            }     // Catch:{ all -> 0x0346 }
        L_0x0135:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0346 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = "Invalid content type: "
            r1.<init>(r0)     // Catch:{ all -> 0x0346 }
            r1.append(r11)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0346 }
            r2.<init>(r0)     // Catch:{ all -> 0x0346 }
            throw r2     // Catch:{ all -> 0x0346 }
        L_0x0149:
            X.0tl r0 = new X.0tl     // Catch:{ all -> 0x0346 }
            java.lang.Class<X.0tl> r11 = p000X.C19610tl.class
            X.3LQ r17 = p000X.AnonymousClass3JW.A00(r13, r11, r7)     // Catch:{ all -> 0x0346 }
            java.lang.String r19 = r9.A0G()     // Catch:{ all -> 0x0346 }
            java.lang.Object r11 = r9.mContent     // Catch:{ all -> 0x0346 }
            X.2cE r11 = (p000X.AnonymousClass2cE) r11     // Catch:{ all -> 0x0346 }
            java.lang.Long r12 = r9.A0k     // Catch:{ all -> 0x0346 }
            long r22 = r9.A07()     // Catch:{ all -> 0x0346 }
            r18 = r4
            r20 = r11
            r21 = r12
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0346 }
            goto L_0x01aa
        L_0x016b:
            X.0tV r0 = new X.0tV     // Catch:{ all -> 0x0346 }
            java.lang.Class<X.0tV> r11 = p000X.C19450tV.class
            X.3LQ r17 = p000X.AnonymousClass3JW.A00(r13, r11, r7)     // Catch:{ all -> 0x0346 }
            java.lang.String r19 = r9.A0G()     // Catch:{ all -> 0x0346 }
            java.lang.Object r11 = r9.mContent     // Catch:{ all -> 0x0346 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0346 }
            java.lang.Long r12 = r9.A0k     // Catch:{ all -> 0x0346 }
            long r22 = r9.A07()     // Catch:{ all -> 0x0346 }
            r18 = r4
            r20 = r11
            r21 = r12
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0346 }
            goto L_0x01aa
        L_0x018d:
            X.0tp r0 = new X.0tp     // Catch:{ all -> 0x0346 }
            java.lang.Class<X.0tp> r11 = p000X.C19650tp.class
            X.3LQ r17 = p000X.AnonymousClass3JW.A00(r13, r11, r7)     // Catch:{ all -> 0x0346 }
            java.lang.String r19 = r9.A0G()     // Catch:{ all -> 0x0346 }
            java.lang.Long r11 = r9.A0k     // Catch:{ all -> 0x0346 }
            long r21 = r9.A07()     // Catch:{ all -> 0x0346 }
            r18 = r4
            r20 = r11
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0346 }
            goto L_0x01aa
        L_0x01a9:
            r0 = r7
        L_0x01aa:
            if (r0 == 0) goto L_0x01cf
            java.lang.String r12 = r0.A01()     // Catch:{ all -> 0x0346 }
            X.0QT r11 = p000X.AnonymousClass0QT.A00(r13, r7)     // Catch:{ all -> 0x0346 }
            java.lang.String r9 = "direct_mutation_migration"
            X.0mJ r9 = r11.A02(r9)     // Catch:{ all -> 0x0346 }
            X.3xE r11 = new X.3xE     // Catch:{ all -> 0x0346 }
            r11.<init>(r9)     // Catch:{ all -> 0x0346 }
            java.lang.String r9 = "mutation_type"
            r11.A08(r9, r12)     // Catch:{ all -> 0x0346 }
            r11.A01()     // Catch:{ all -> 0x0346 }
            X.0qA r9 = p000X.C17390qA.A00(r13)     // Catch:{ all -> 0x0346 }
            r9.A0F(r0)     // Catch:{ all -> 0x0346 }
            goto L_0x01d1
        L_0x01cf:
            r0 = 0
            goto L_0x01d2
        L_0x01d1:
            r0 = 1
        L_0x01d2:
            if (r0 == 0) goto L_0x01d5
            r14 = 1
        L_0x01d5:
            int r9 = r5 + -1
            r0 = r7
            if (r2 >= r9) goto L_0x01e4
            int r0 = r2 + 1
            java.lang.Object r0 = r10.get(r0)     // Catch:{ all -> 0x0346 }
            X.2fA r0 = (p000X.C58012fA) r0     // Catch:{ all -> 0x0346 }
            com.instagram.model.direct.DirectThreadKey r0 = r0.A0c     // Catch:{ all -> 0x0346 }
        L_0x01e4:
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0346 }
            if (r0 != 0) goto L_0x0208
            java.lang.Object r12 = r1.get(r4)     // Catch:{ all -> 0x0346 }
            X.2gS r12 = (p000X.C58742gS) r12     // Catch:{ all -> 0x0346 }
            if (r12 == 0) goto L_0x0205
            X.2iy r11 = new X.2iy     // Catch:{ all -> 0x0346 }
            X.0C1 r0 = r3.A02     // Catch:{ all -> 0x0346 }
            r11.<init>(r0, r12, r8)     // Catch:{ all -> 0x0346 }
            X.2ud r9 = r3.A01     // Catch:{ all -> 0x0346 }
            com.instagram.model.direct.DirectThreadKey r0 = r12.AOO()     // Catch:{ all -> 0x0346 }
            r9.A0J(r0, r11)     // Catch:{ all -> 0x0346 }
            r1.remove(r4)     // Catch:{ all -> 0x0346 }
        L_0x0205:
            r8.clear()     // Catch:{ all -> 0x0346 }
        L_0x0208:
            int r2 = r2 + 1
            goto L_0x0100
        L_0x020c:
            r2 = r14
        L_0x020d:
            java.util.Collection r0 = r1.values()     // Catch:{ all -> 0x0346 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0346 }
        L_0x0215:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x0232
            java.lang.Object r5 = r8.next()     // Catch:{ all -> 0x0346 }
            X.2gS r5 = (p000X.C58742gS) r5     // Catch:{ all -> 0x0346 }
            X.2iy r4 = new X.2iy     // Catch:{ all -> 0x0346 }
            X.0C1 r0 = r3.A02     // Catch:{ all -> 0x0346 }
            r4.<init>(r0, r5, r7)     // Catch:{ all -> 0x0346 }
            X.2ud r1 = r3.A01     // Catch:{ all -> 0x0346 }
            com.instagram.model.direct.DirectThreadKey r0 = r5.AOO()     // Catch:{ all -> 0x0346 }
            r1.A0J(r0, r4)     // Catch:{ all -> 0x0346 }
            goto L_0x0215
        L_0x0232:
            X.2ud r7 = r3.A01     // Catch:{ all -> 0x0346 }
            monitor-enter(r7)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = "DirectThreadStore.scheduleFirstCalculateUnseenCount"
            r7.A01 = r0     // Catch:{ all -> 0x0337 }
            X.0O3 r5 = p000X.AnonymousClass0O3.A00()     // Catch:{ all -> 0x0337 }
            X.2gI r4 = new X.2gI     // Catch:{ all -> 0x0337 }
            r4.<init>(r7)     // Catch:{ all -> 0x0337 }
            r0 = 0
            r5.A01(r4, r0)     // Catch:{ all -> 0x0337 }
            monitor-exit(r7)     // Catch:{ all -> 0x0346 }
            X.2ud r7 = r3.A01     // Catch:{ all -> 0x0346 }
            X.0C1 r4 = r3.A02     // Catch:{ all -> 0x0346 }
            java.lang.Class<X.2f8> r1 = p000X.C57992f8.class
            X.2gJ r0 = new X.2gJ     // Catch:{ all -> 0x0346 }
            r0.<init>(r4)     // Catch:{ all -> 0x0346 }
            X.0Po r5 = r4.AVA(r1, r0)     // Catch:{ all -> 0x0346 }
            X.2f8 r5 = (p000X.C57992f8) r5     // Catch:{ all -> 0x0346 }
            java.lang.String r1 = r5.A08()     // Catch:{ all -> 0x0346 }
            r0 = 0
            java.util.List r4 = r5.A0B(r1, r0)     // Catch:{ all -> 0x0346 }
            int r0 = r4.size()     // Catch:{ all -> 0x0346 }
            if (r0 <= r6) goto L_0x0277
            java.lang.String r1 = "Session table can only contain one row per user. size: "
            int r0 = r4.size()     // Catch:{ all -> 0x0346 }
            java.lang.String r1 = p000X.AnonymousClass000.A05(r1, r0)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = "DirectSessionSQLiteTable"
            p000X.AnonymousClass0QD.A02(r0, r1)     // Catch:{ all -> 0x0346 }
        L_0x0277:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0346 }
            if (r0 != 0) goto L_0x029d
            r0 = 0
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x0346 }
            X.2uj r0 = (p000X.C65982uj) r0     // Catch:{ all -> 0x0346 }
        L_0x0284:
            X.0C1 r1 = r3.A02     // Catch:{ all -> 0x0346 }
            java.util.List r5 = p000X.C65962uh.A00(r1)     // Catch:{ all -> 0x0346 }
            int r4 = r0.A01     // Catch:{ all -> 0x0346 }
            r1 = 4
            if (r4 != r1) goto L_0x02a9
            java.util.List r1 = r0.A07     // Catch:{ all -> 0x0346 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x0346 }
            boolean r4 = p000X.AnonymousClass17M.A00(r1, r5)     // Catch:{ all -> 0x0346 }
            r1 = 1
            if (r4 != 0) goto L_0x02aa
            goto L_0x02a9
        L_0x029d:
            X.0C1 r0 = r5.A00     // Catch:{ all -> 0x0346 }
            java.util.List r1 = p000X.C65962uh.A00(r0)     // Catch:{ all -> 0x0346 }
            X.2uj r0 = new X.2uj     // Catch:{ all -> 0x0346 }
            r0.<init>(r1)     // Catch:{ all -> 0x0346 }
            goto L_0x0284
        L_0x02a9:
            r1 = 0
        L_0x02aa:
            if (r1 != 0) goto L_0x02b1
            X.2uj r0 = new X.2uj     // Catch:{ all -> 0x0346 }
            r0.<init>(r5)     // Catch:{ all -> 0x0346 }
        L_0x02b1:
            monitor-enter(r7)     // Catch:{ all -> 0x0346 }
            X.2uj r0 = r0.clone()     // Catch:{ all -> 0x0337 }
            r7.A00 = r0     // Catch:{ all -> 0x0337 }
            monitor-exit(r7)     // Catch:{ all -> 0x0346 }
            java.util.Iterator r4 = r15.iterator()     // Catch:{ all -> 0x0346 }
        L_0x02bd:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x02d7
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0346 }
            X.0pf r1 = (p000X.C17090pf) r1     // Catch:{ all -> 0x0346 }
            X.0tB r0 = r3.A04     // Catch:{ all -> 0x0346 }
            X.0IT r0 = r0.A00     // Catch:{ all -> 0x0346 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0346 }
            X.0qA r0 = (p000X.C17390qA) r0     // Catch:{ all -> 0x0346 }
            r0.A0F(r1)     // Catch:{ all -> 0x0346 }
            goto L_0x02bd
        L_0x02d7:
            if (r2 == 0) goto L_0x02dc
            r3.A03()     // Catch:{ all -> 0x0346 }
        L_0x02dc:
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0346 }
            r3.A06 = r6     // Catch:{ all -> 0x0346 }
            X.0zv r1 = r3.A03     // Catch:{ all -> 0x0346 }
            X.2yn r0 = new X.2yn     // Catch:{ all -> 0x0346 }
            r0.<init>()     // Catch:{ all -> 0x0346 }
            r1.BXT(r0)     // Catch:{ all -> 0x0346 }
            X.2ud r0 = r3.A01     // Catch:{ all -> 0x0346 }
            r0.A0I()     // Catch:{ all -> 0x0346 }
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ all -> 0x0352 }
            if (r0 == 0) goto L_0x0344
            r0 = -1485181794(0xffffffffa779ec9e, float:-3.4683962E-15)
            p000X.AnonymousClass0ZB.A00(r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0344
        L_0x02fb:
            r1 = move-exception
            goto L_0x0315
        L_0x02fd:
            r1 = move-exception
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            if (r0 == 0) goto L_0x031f
            r0 = -416425124(0xffffffffe72ddb5c, float:-8.210159E23)
            p000X.AnonymousClass0ZB.A00(r0)     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            goto L_0x031f
        L_0x0309:
            r1 = move-exception
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            if (r0 == 0) goto L_0x031f
            r0 = -165536766(0xfffffffff6221c02, float:-8.2199234E32)
            p000X.AnonymousClass0ZB.A00(r0)     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            goto L_0x031f
        L_0x0315:
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
            if (r0 == 0) goto L_0x031f
            r0 = 1811820960(0x6bfe31a0, float:6.14603E26)
            p000X.AnonymousClass0ZB.A00(r0)     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
        L_0x031f:
            throw r1     // Catch:{ SQLiteException | IllegalStateException -> 0x0320 }
        L_0x0320:
            r0 = move-exception
            p000X.C64452rV.A02(r0)     // Catch:{ all -> 0x0332 }
            A00(r4)     // Catch:{ all -> 0x0346 }
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ all -> 0x0352 }
            if (r0 == 0) goto L_0x0344
            r0 = 318645853(0x12fe265d, float:1.6039111E-27)
            p000X.AnonymousClass0ZB.A00(r0)     // Catch:{ all -> 0x0352 }
            goto L_0x0344
        L_0x0332:
            r0 = move-exception
            A00(r4)     // Catch:{ all -> 0x0346 }
            goto L_0x0339
        L_0x0337:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0346 }
        L_0x0339:
            throw r0     // Catch:{ all -> 0x0346 }
        L_0x033a:
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ all -> 0x0352 }
            if (r0 == 0) goto L_0x0344
            r0 = 2890575(0x2c1b4f, float:4.050558E-39)
            p000X.AnonymousClass0ZB.A00(r0)     // Catch:{ all -> 0x0352 }
        L_0x0344:
            monitor-exit(r3)
            return
        L_0x0346:
            r1 = move-exception
            boolean r0 = p000X.C06530Pk.A00     // Catch:{ all -> 0x0352 }
            if (r0 == 0) goto L_0x0351
            r0 = 1878442405(0x6ff6c1a5, float:1.5273483E29)
            p000X.AnonymousClass0ZB.A00(r0)     // Catch:{ all -> 0x0352 }
        L_0x0351:
            throw r1     // Catch:{ all -> 0x0352 }
        L_0x0352:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C19250tA.A04():void");
    }

    public C19250tA(AnonymousClass0C1 r2, AnonymousClass0OT r3, C65922ud r4, C19240t9 r5, C19260tB r6) {
        this.A02 = r2;
        this.A03 = C23300zv.A00(r2);
        this.A01 = r4;
        this.A05 = r5;
        this.A04 = r6;
        this.A00 = r3;
    }

    public static void A00(SQLiteDatabase sQLiteDatabase) {
        try {
            AnonymousClass0ZG.A02(sQLiteDatabase, 1864673247);
        } catch (SQLiteException | IllegalStateException e) {
            C64452rV.A02(e);
        } catch (Throwable th) {
            if (C64452rV.A03()) {
                C64452rV.A01();
            }
            throw th;
        }
        if (C64452rV.A03()) {
            C64452rV.A01();
        }
    }

    public final void A03() {
        C65982uj A022;
        SystemClock.uptimeMillis();
        SQLiteDatabase A052 = C64452rV.A00().A05();
        if (A052 != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            AnonymousClass0ZG.A01(A052, -1302868137);
            try {
                A01(this);
                C65922ud r1 = this.A01;
                synchronized (r1) {
                    try {
                        A022 = r1.A00.clone();
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                int i = 0;
                for (C58742gS AOO : this.A01.A0H()) {
                    C59892iy A0G = this.A01.A0G(AOO.AOO());
                    if (A0G != null) {
                        int i2 = 20;
                        if (i >= 20) {
                            i2 = 3;
                        }
                        A02(this, A0G, i2, byteArrayOutputStream);
                        i++;
                    }
                }
                AnonymousClass0C1 r2 = this.A02;
                C57992f8 r9 = (C57992f8) r2.AVA(C57992f8.class, new C58652gJ(r2));
                SQLiteDatabase A042 = C64452rV.A00().A04();
                if (A042 != null) {
                    synchronized (r9.A01) {
                        try {
                            String A0A = r9.A0A();
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            ContentValues contentValues = new ContentValues(3);
                            contentValues.put(MemoryDumpUploadJob.EXTRA_USER_ID, r9.A00.A04());
                            contentValues.put("value", r9.A0E(A022, byteArrayOutputStream2));
                            AnonymousClass0ZG.A00(-1779352897);
                            A042.replace(A0A, (String) null, contentValues);
                            AnonymousClass0ZG.A00(1659532258);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
                A052.setTransactionSuccessful();
            } catch (SQLiteException | IllegalStateException e) {
                C64452rV.A02(e);
            } catch (Throwable th3) {
                A00(A052);
                throw th3;
            }
            A00(A052);
            SystemClock.uptimeMillis();
        }
    }
}
