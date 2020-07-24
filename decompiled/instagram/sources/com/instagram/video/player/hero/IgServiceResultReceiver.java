package com.instagram.video.player.hero;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.video.heroplayer.ipc.HttpTransferEndEvent;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.PrefetchTaskQueueCompleteEvent;
import com.facebook.video.heroplayer.ipc.PrefetchTaskQueueExitEvent;
import com.facebook.video.heroplayer.ipc.PrefetchTaskQueueStartEvent;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p000X.Constants;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass7KX;
import p000X.AnonymousClass7KY;
import p000X.C120125Dh;
import p000X.C169057Ka;
import p000X.C169077Kc;
import p000X.C169107Ki;
import p000X.C236411g;
import p000X.C236811k;
import p000X.C237011m;
import p000X.C27379CAy;
import p000X.C29075CrS;
import p000X.C29592D0x;
import p000X.C29599D1e;
import p000X.C29600D1f;
import p000X.C39681nJ;
import p000X.C39751nS;
import p000X.C39821nc;
import p000X.C40581ot;
import p000X.C41961rG;
import p000X.C41991rK;
import p000X.C43711ux;
import p000X.C43721uy;
import p000X.C44191vk;
import p000X.C45571y9;
import p000X.C45581yA;
import p000X.C45731yP;
import p000X.C55132a7;
import p000X.C60202jU;
import p000X.C60212jV;
import p000X.C60222jW;
import p000X.C60232jX;
import p000X.CB3;
import p000X.D1s;

public class IgServiceResultReceiver extends ResultReceiver {
    public C27379CAy A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final Map A02 = new HashMap();
    public final CopyOnWriteArraySet A03 = new CopyOnWriteArraySet();

    public IgServiceResultReceiver() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d2, code lost:
        if (r1 == false) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b4, code lost:
        r3.A01.A02(r2.A09, p000X.C43721uy.A03(r1), p000X.AnonymousClass7KX.A00(r1, r0), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017a, code lost:
        if (r1 == false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0282, code lost:
        if (r6 == p000X.C43721uy.A00(p000X.Constants.A0j)) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02a0, code lost:
        if (r1 == false) goto L_0x02a2;
     */
    public final void onReceiveResult(int i, Bundle bundle) {
        VideoSource videoSource;
        VideoSource videoSource2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Set<C39821nc> set;
        Set<C39821nc> set2;
        long j;
        C236811k r3;
        VideoPrefetchRequest videoPrefetchRequest;
        Integer num;
        AnonymousClass7KX r0;
        int i2 = i;
        if (C39751nS.A01.get(i2) != null) {
            C41961rG r8 = (C41961rG) bundle.getSerializable("ServiceEvent");
            int ordinal = ((C39751nS) C39751nS.A01.get(i2)).ordinal();
            switch (ordinal) {
                case 0:
                case 2:
                case 4:
                case 10:
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                    Iterator it = this.A03.iterator();
                    while (it.hasNext()) {
                        C45731yP r32 = (C45731yP) it.next();
                        switch (ordinal) {
                            case 0:
                                D1s d1s = (D1s) r8;
                                switch (d1s.A00.intValue()) {
                                    case 0:
                                        C29599D1e d1e = (C29599D1e) d1s;
                                        C29075CrS crS = r32.A09;
                                        if (!(crS == null || (videoSource = r32.A06) == null || !d1e.A00.equals(videoSource.A0D))) {
                                            crS.A01 = d1e.A00;
                                            break;
                                        }
                                    case 1:
                                        C29600D1f d1f = (C29600D1f) d1s;
                                        C29075CrS crS2 = r32.A09;
                                        if (!(crS2 == null || (videoSource2 = r32.A06) == null || !d1f.A00.equals(videoSource2.A0D))) {
                                            crS2.A00 += (long) d1f.A00;
                                            break;
                                        }
                                    default:
                                        continue;
                                }
                            case 2:
                                C60202jU r02 = (C60202jU) r8;
                                C40581ot r2 = r32.A07;
                                if (r2 != null) {
                                    String str = r02.A02;
                                    int i3 = r02.A01;
                                    r2.A02 = str;
                                    if (str == null) {
                                        i3 = -1;
                                    }
                                    r2.A00 = i3;
                                    break;
                                } else {
                                    continue;
                                }
                            case 4:
                                HttpTransferEndEvent httpTransferEndEvent = (HttpTransferEndEvent) r8;
                                String str2 = httpTransferEndEvent.A0l;
                                int i4 = httpTransferEndEvent.A07;
                                if (i4 != C43721uy.A00(Constants.ONE)) {
                                    z = false;
                                    break;
                                }
                                z = true;
                                if (!httpTransferEndEvent.A0v && z && httpTransferEndEvent.A08 == 1) {
                                    C43711ux r6 = httpTransferEndEvent.A0U;
                                    C45581yA r4 = r32.A0D;
                                    if (r4 != null) {
                                        VideoSource videoSource3 = r32.A06;
                                        if (videoSource3 != null) {
                                            boolean equals = str2.equals(videoSource3.A0D);
                                            z3 = true;
                                            break;
                                        }
                                        z3 = false;
                                        if (z3) {
                                            r4.BUu(r32, r6.equals(C43711ux.CACHED));
                                        }
                                    }
                                }
                                synchronized (r32.A0L) {
                                    try {
                                        if (r32.A0L.size() > 3) {
                                            r32.A0L.remove(0);
                                        }
                                        r32.A0L.add(httpTransferEndEvent);
                                    } catch (Throwable th) {
                                        while (true) {
                                            th = th;
                                            break;
                                        }
                                    }
                                }
                                String str3 = httpTransferEndEvent.A0l;
                                VideoSource videoSource4 = r32.A06;
                                if (videoSource4 != null) {
                                    boolean equals2 = str3.equals(videoSource4.A0D);
                                    z2 = true;
                                    break;
                                }
                                z2 = false;
                                if (z2) {
                                    r32.A0O = httpTransferEndEvent.A0N;
                                    C45581yA r5 = r32.A0D;
                                    if (r5 != null && httpTransferEndEvent.A07 == C43721uy.A00(Constants.A0C) && httpTransferEndEvent.A0M == 0) {
                                        r5.AsU();
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            case 10:
                                C41991rK r22 = (C41991rK) r8;
                                String str4 = r22.A03;
                                VideoSource videoSource5 = r32.A06;
                                if (videoSource5 != null) {
                                    boolean equals3 = str4.equals(videoSource5.A0D);
                                    z4 = true;
                                    break;
                                }
                                z4 = false;
                                if (z4) {
                                    C45731yP.A03(r32, r22.A02, r22.A01);
                                    break;
                                } else {
                                    continue;
                                }
                            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                                C60212jV r13 = (C60212jV) r8;
                                C45571y9 r12 = r32.A09;
                                if (r12 != null) {
                                    ParcelableFormat[] parcelableFormatArr = r13.A0Y;
                                    int length = parcelableFormatArr.length;
                                    C60232jX[] r17 = new C60232jX[length];
                                    for (int i5 = 0; i5 < length; i5++) {
                                        ParcelableFormat parcelableFormat = parcelableFormatArr[i5];
                                        String str5 = parcelableFormat.A0B;
                                        int i6 = parcelableFormat.A03;
                                        String str6 = parcelableFormat.A0A;
                                        r17[i5] = new C60232jX(str5, i6, str6, parcelableFormat.A05, parcelableFormat.A04, parcelableFormat.A08, parcelableFormat.A09, parcelableFormat.A0H, parcelableFormat.A0I, parcelableFormat.A0F, parcelableFormat.A0E);
                                    }
                                    long j2 = r13.A0F;
                                    boolean z5 = r13.A0V;
                                    r12.Aqh(new C60222jW(j2, z5, r13.A0S, r13.A0C, r13.A0G, r13.A0B, r13.A0E, r13.A0D, r13.A09, r13.A04, r13.A0K, r13.A07, r13.A0Q, r13.A0O, r13.A02, r13.A0H, r17, r13.A0M, r13.A03, r13.A0I, r13.A0N, r13.A0T, r13.A0W, r13.A0U, r13.A01, r13.A0A, r13.A06, r13.A00, r13.A0R, r13.A0L, r13.A0X));
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                    return;
                case 1:
                    C44191vk r82 = (C44191vk) r8;
                    synchronized (this.A02) {
                        try {
                            set = (Set) this.A02.remove(r82.A00);
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    if (set != null) {
                        for (C39821nc A002 : set) {
                            boolean z6 = r82.A01;
                            C39681nJ A003 = A002.A00();
                            if (A003 != null) {
                                A003.BV9(z6);
                            }
                        }
                        return;
                    }
                    return;
                case 16:
                    C55132a7 r83 = (C55132a7) r8;
                    C236811k A004 = C236411g.A00();
                    String str7 = r83.A00;
                    if (C236811k.A00(A004)) {
                        long currentMonotonicTimestampNanos = A004.A00.currentMonotonicTimestampNanos();
                        C237011m r10 = A004.A01;
                        r10.A03(new C169057Ka(r10, C169107Ki.A00(str7), 4, currentMonotonicTimestampNanos));
                    }
                    synchronized (this.A02) {
                        try {
                            set2 = (Set) this.A02.remove(r83.A00);
                        } catch (Throwable th3) {
                            while (true) {
                                th = th3;
                                break;
                            }
                        }
                    }
                    if (set2 != null) {
                        boolean z7 = r83.A01;
                        for (C39821nc A005 : set2) {
                            C39681nJ A006 = A005.A00();
                            if (A006 != null) {
                                A006.BV8(z7);
                            }
                        }
                        return;
                    }
                    return;
                case 27:
                    C29592D0x d0x = (C29592D0x) r8;
                    C27379CAy cAy = this.A00;
                    if (cAy != null) {
                        AnonymousClass0ZA.A0E(cAy.A01, new CB3(cAy, d0x), 990731315);
                        return;
                    }
                    return;
                case 28:
                    r3 = C236411g.A00();
                    videoPrefetchRequest = ((PrefetchTaskQueueStartEvent) r8).A00;
                    if (C236811k.A00(r3)) {
                        j = r3.A00.currentMonotonicTimestampNanos();
                        num = C43721uy.A01(videoPrefetchRequest.A03);
                        r0 = AnonymousClass7KX.DID_ENTER_TASK_QUEUE;
                        break;
                    } else {
                        return;
                    }
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                    r3 = C236411g.A00();
                    videoPrefetchRequest = ((PrefetchTaskQueueExitEvent) r8).A00;
                    if (C236811k.A00(r3)) {
                        j = r3.A00.currentMonotonicTimestampNanos();
                        num = C43721uy.A01(videoPrefetchRequest.A03);
                        r0 = AnonymousClass7KX.DID_EXIT_TASK_QUEUE;
                        break;
                    } else {
                        return;
                    }
                case 30:
                    C236811k A007 = C236411g.A00();
                    VideoPrefetchRequest videoPrefetchRequest2 = ((PrefetchTaskQueueCompleteEvent) r8).A00;
                    if (C236811k.A00(A007)) {
                        long currentMonotonicTimestampNanos2 = A007.A00.currentMonotonicTimestampNanos();
                        Integer A012 = C43721uy.A01(videoPrefetchRequest2.A03);
                        AnonymousClass7KX A008 = AnonymousClass7KX.A00(A012, AnonymousClass7KX.SUCCESS);
                        VideoSource videoSource6 = videoPrefetchRequest2.A09;
                        int A009 = C169107Ki.A00(videoSource6.A0D);
                        A007.A01.A02(videoSource6, C43721uy.A03(A012), A008, currentMonotonicTimestampNanos2);
                        C237011m r23 = A007.A01;
                        r23.A03(new C169077Kc(r23, A009, new AnonymousClass7KY(A007, A009, currentMonotonicTimestampNanos2)));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            throw new IllegalArgumentException("Invalid EventType value");
        }
        throw th;
    }
}
