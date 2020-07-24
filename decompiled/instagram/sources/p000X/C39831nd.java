package p000X;

import android.net.Uri;
import com.facebook.common.dextricks.DexStore;
import com.facebook.video.heroplayer.ipc.VideoPlayContextualSetting;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.instagram.video.player.hero.IgServiceResultReceiver;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1nd  reason: invalid class name and case insensitive filesystem */
public final class C39831nd {
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c7, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r7, p000X.AnonymousClass0L7.PROGRESSIVE_PREFETCH_BYTES, "avoid_ephemeral", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        if (r5 == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f4, code lost:
        if (r9 != false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0122, code lost:
        if (r0.A0D == false) goto L_0x0124;
     */
    public static void A00(C39821nc r22, AnonymousClass0C1 r23) {
        boolean z;
        boolean z2;
        int i;
        Integer num;
        boolean z3;
        AnonymousClass0C1 r7 = r23;
        C39821nc r4 = r22;
        if (!C39621nD.A01(r7)) {
            if (r4.A04.A06 != null) {
                C1894387n r3 = (C1894387n) r7.AVA(C1894387n.class, new C1894487o());
                r3.A00.ADc(new C205698rH(r3, Uri.parse(r4.A04.A06)));
            }
            C37671k2 r2 = r4.A04;
            if (r2.A03 == Constants.ONE && r2.A06() && !C40921pT.A00(r4.A05)) {
                r4.A01 = DexStore.LOAD_RESULT_WITH_VDEX_ODEX;
            }
            C39701nL r24 = C39701nL.A03;
            r24.A05(StoredPreferences.A00, r7);
            if (r4.A00() != null) {
                IgServiceResultReceiver igServiceResultReceiver = r24.A00;
                if (r4.A00() != null) {
                    String str = r4.A04.A05;
                    synchronized (igServiceResultReceiver.A02) {
                        if (!igServiceResultReceiver.A02.containsKey(str)) {
                            igServiceResultReceiver.A02.put(str, new HashSet());
                        }
                        ((Set) igServiceResultReceiver.A02.get(str)).add(r4);
                    }
                    int i2 = r4.A00;
                    if (i2 > 0) {
                        AnonymousClass0ZA.A09(igServiceResultReceiver.A01, new AnonymousClass4XM(igServiceResultReceiver, r4), (long) i2, 1927481594);
                    }
                }
            }
            int i3 = r4.A01;
            C37671k2 r0 = r4.A04;
            boolean z4 = false;
            if (r0.A03 == Constants.A0C) {
                z4 = true;
            }
            if (z4) {
                z = true;
            }
            z = false;
            boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.PROGRESSIVE_PREFETCH_BYTES, "dash_only", false, (AnonymousClass04H) null)).booleanValue();
            if (!r0.A06()) {
                z2 = true;
            }
            z2 = false;
            if (C40161oB.A00(r7).booleanValue() && !z2) {
                i = 0;
            }
            i = i3;
            if (r4.A03) {
                num = Constants.ONE;
            } else {
                num = Constants.A0C;
            }
            if (((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.DASH_STORY_ADS_WARMUP_WATERMARK, "enable_ads_request_high_priority", false, (AnonymousClass04H) null)).booleanValue() && r0.A06() && r0.A03.equals(Constants.ONE)) {
                z3 = true;
            }
            z3 = false;
            VideoPrefetchRequest videoPrefetchRequest = new VideoPrefetchRequest(C39701nL.A01(r0, (Uri) null, r4.A05), (String) null, i, -1, -1, -1, "", -1, r4.A05, C40781pF.PREFETCH, num, new VideoPlayContextualSetting(), -1, C17600qV.A01.A01(false), z3);
            AnonymousClass1YR r32 = r0.A00;
            if (r32 == null) {
                r32 = AnonymousClass1YR.Unknown;
            }
            C236811k A00 = C236411g.A00();
            if (C236811k.A00(A00)) {
                long currentMonotonicTimestampNanos = A00.A00.currentMonotonicTimestampNanos();
                HashMap hashMap = new HashMap();
                hashMap.put("VIDEO_ID", videoPrefetchRequest.A09.A0D);
                hashMap.put("URI", videoPrefetchRequest.A09.A03.toString());
                hashMap.put("CONTAINER_MODULE", videoPrefetchRequest.A0C);
                hashMap.put("QUEUE_BEHAVIOR", C41931rD.A00(videoPrefetchRequest.A0A).toUpperCase());
                hashMap.put("VIDEO_CODEC", videoPrefetchRequest.A09.A0C);
                hashMap.put("FORMAT_TYPE", videoPrefetchRequest.A09.A06.name());
                hashMap.put("VIDEO_TYPE", r32.A00);
                VideoSource videoSource = videoPrefetchRequest.A09;
                int A002 = C169107Ki.A00(videoSource.A0D);
                C237011m r9 = A00.A01;
                r9.A03(new C169087Ke(r9, A002, hashMap, currentMonotonicTimestampNanos));
                C237011m r25 = A00.A01;
                r25.A03(new C169077Kc(r25, A002, new C29619D1z(videoSource)));
            }
            C39771nW r33 = C39731nP.A0W.A07;
            r33.A00.B2S(videoPrefetchRequest);
            r33.A04.offer(videoPrefetchRequest);
            if (r33.A02.A00.A0K != null) {
                AnonymousClass0ZA.A0E(r33.A01, new C41921rC(r33), -338221613);
            }
        } else if (r4.A00() != null) {
            r4.A00().BV9(true);
        }
    }
}
