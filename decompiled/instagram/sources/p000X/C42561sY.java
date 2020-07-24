package p000X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.model.mediatype.MediaType;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.PendingMedia;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.1sY  reason: invalid class name and case insensitive filesystem */
public final class C42561sY implements AnonymousClass0RN {
    public final Context A00;
    public final C42531sV A01;
    public final C42571sZ A02;
    public final C42591sb A03 = new C42591sb(this.A01);
    public final C42581sa A04 = new C42581sa();
    public final AnonymousClass0C1 A05;
    public final Map A06;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:172|173|174|(2:176|177)(1:178)) */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0270, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x035a, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x035b, code lost:
        if (r6 != false) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x035f, code lost:
        if (r2 == p000X.C42421sK.NOT_UPLOADED) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0361, code lost:
        p000X.AnonymousClass0QD.A01("MediaUploader", "Video state machine error from " + r16.A04 + " to " + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0437, code lost:
        if (r16.A0E.A02() != false) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        r16.A01(p000X.C195328Xo.A06, "Connectivity check failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x043f, code lost:
        r16.A01(p000X.C195328Xo.A0K, "Connectivity check failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0444, code lost:
        if (0 != 0) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0457, code lost:
        if (r0 == false) goto L_0x0459;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x046e, code lost:
        if (r0 <= 2) goto L_0x045a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0476, code lost:
        if (r0 <= 1) goto L_0x045a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0481, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0488, code lost:
        r0.A8w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x048b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0109, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010a, code lost:
        if (r5 != false) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010e, code lost:
        if (r2 == p000X.C42421sK.NOT_UPLOADED) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0110, code lost:
        p000X.AnonymousClass0QD.A01("MediaUploader", "Photo state machine error from " + r16.A04 + " to " + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0217, code lost:
        if (r0 != false) goto L_0x0219;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:172:0x042f */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021c A[Catch:{ Exception -> 0x037f }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0235 A[Catch:{ Exception -> 0x037f }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x025e A[Catch:{ Exception -> 0x037f }] */
    public final C195338Xp A01(PendingMedia pendingMedia, String str, C15780nW r26) {
        AnonymousClass68T A002;
        AnonymousClass68T r8;
        boolean z;
        boolean z2;
        C107404k5[] r5;
        int i;
        boolean z3;
        boolean z4;
        Context context = this.A00;
        C107404k5[] r13 = {new AnonymousClass8HF(this.A05), new C155566kc(context)};
        PendingMedia pendingMedia2 = pendingMedia;
        C195348Xq r16 = new C195348Xq(context, this.A05, pendingMedia2, this.A01, str, r26);
        this.A01.A0N(pendingMedia2);
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            if (pendingMedia2.A24.equals(r16.A0G) && pendingMedia2.A10()) {
                r16.A04(z5);
                pendingMedia2.A0R();
                C42421sK r9 = r16.A04;
                int A08 = pendingMedia2.A08();
                if (tryToBacktrack(pendingMedia2)) {
                    C42531sV r3 = r16.A0C;
                    AnonymousClass0P4 A042 = C42531sV.A04(r3, "pending_media_process", r16);
                    A042.A0G("reason", r16.A0F);
                    C42531sV.A0I(r3, A042, r16.A05);
                } else {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        A002 = A00(r13[i2], r16);
                        r8 = AnonymousClass68T.SKIP;
                        if (A002 == r8 && i3 < 2) {
                            i2 = i3;
                        } else if (A002 != r8) {
                            if (A002 == AnonymousClass68T.SUCCESS) {
                                continue;
                                z6 = true;
                            } else if (A002 == AnonymousClass68T.FAILURE) {
                            }
                        }
                    }
                    if (A002 != r8) {
                    }
                    try {
                        PendingMedia pendingMedia3 = r16.A0A;
                        MediaType mediaType = pendingMedia3.A0g;
                        switch (mediaType.ordinal()) {
                            case 0:
                                C42421sK r2 = r16.A05;
                                boolean z7 = true;
                                switch (r16.A04.ordinal()) {
                                    case 0:
                                    case 1:
                                        if (A00(new C191778Hv(), r16) != r8) {
                                            break;
                                        }
                                    case 5:
                                    case 6:
                                        if (A00(new C191698Hn(this.A00, this, this.A06, this.A01), r16) != r8) {
                                            break;
                                        }
                                }
                                break;
                            case 1:
                                C42421sK r6 = r16.A05;
                                boolean z8 = false;
                                switch (r16.A04.ordinal()) {
                                    case 0:
                                    case 1:
                                        AnonymousClass20J A0B = pendingMedia3.A0B();
                                        if (A0B == null) {
                                            A0B = C191758Ht.A00(r16.A0D, pendingMedia3.A0E(), pendingMedia3.A0r(), pendingMedia3.A0l.AKe());
                                        }
                                        boolean z9 = A0B instanceof AnonymousClass26L;
                                        if (!z9 || !((Boolean) C05680Ln.Ac8.A01(this.A05)).booleanValue()) {
                                            if (((Boolean) C05680Ln.AcA.A01(this.A05)).booleanValue()) {
                                                String str2 = (String) C05680Ln.AcB.A01(this.A05);
                                                if (!TextUtils.isEmpty(str2)) {
                                                    if (!z9) {
                                                        if (!(A0B instanceof AnonymousClass20I)) {
                                                            if (!(A0B instanceof C191788Hw)) {
                                                                z4 = false;
                                                                break;
                                                            } else {
                                                                z4 = str2.contains("segmented");
                                                                break;
                                                            }
                                                        } else {
                                                            z4 = str2.contains("streaming");
                                                            break;
                                                        }
                                                    } else {
                                                        z4 = str2.contains("progressive");
                                                        break;
                                                    }
                                                } else {
                                                    z4 = true;
                                                    break;
                                                }
                                            }
                                            if (C202058kl.A00(pendingMedia3)) {
                                                if (!pendingMedia3.A0k.A01) {
                                                    z3 = false;
                                                } else {
                                                    z3 = AnonymousClass8MK.A00(new File(pendingMedia3.A0l.A0F)).exists();
                                                }
                                                if (z3 && ((Boolean) C05680Ln.Aam.A01(this.A05)).booleanValue() && !((Boolean) C05680Ln.Aan.A01(this.A05)).booleanValue()) {
                                                }
                                            }
                                            z2 = false;
                                            if (!z2) {
                                                AnonymousClass0C1 r4 = this.A05;
                                                Context context2 = this.A00;
                                                r5 = new C107404k5[]{new C201628k4(r4, context2, this.A02, this.A01), new C191558Gx(context2)};
                                            } else {
                                                Context context3 = this.A00;
                                                C42531sV r22 = this.A01;
                                                C42571sZ r1 = this.A02;
                                                C42591sb r0 = this.A03;
                                                r5 = new C107404k5[]{new AnonymousClass8Y2(context3, r22, r1, r0), new C191558Gx(context3), new C201598k0(r16.A0B, this.A04, r0)};
                                            }
                                            i = 0;
                                            z8 = false;
                                            while (i < r5.length) {
                                                AnonymousClass68T A003 = A00(r5[i], r16);
                                                boolean z10 = false;
                                                if (A003 != r8) {
                                                    z10 = true;
                                                }
                                                z8 |= z10;
                                                if (A003 == AnonymousClass68T.FAILURE) {
                                                    break;
                                                } else {
                                                    i++;
                                                }
                                            }
                                            break;
                                        }
                                        z2 = true;
                                        if (!z2) {
                                        }
                                        i = 0;
                                        z8 = false;
                                        while (i < r5.length) {
                                        }
                                        break;
                                    case 4:
                                        if (A00(new C191768Hu(), r16) != r8) {
                                        }
                                        break;
                                    case 5:
                                    case 6:
                                        if (A00(new C191698Hn(this.A00, this, this.A06, this.A01), r16) != r8) {
                                        }
                                        break;
                                }
                                if (!z8 && r6 != C42421sK.NOT_UPLOADED) {
                                    AnonymousClass0QD.A01("MediaUploader", "Video state machine error from " + r16.A04 + " to " + r6);
                                    break;
                                }
                                break;
                            case 4:
                                C42421sK r23 = r16.A05;
                                int ordinal = r16.A04.ordinal();
                                boolean z11 = false;
                                switch (ordinal) {
                                    case 1:
                                        if (r23 == C42421sK.CONFIGURED) {
                                            for (PendingMedia A012 : Collections.unmodifiableList(r16.A0H)) {
                                                A01(A012, r16.A0F, new C15780nW(this.A00));
                                                z11 = true;
                                            }
                                            boolean z12 = true;
                                            for (PendingMedia A10 : Collections.unmodifiableList(r16.A0H)) {
                                                z12 &= !A10.A10();
                                            }
                                            if (z12) {
                                                r16.A0A.A0Z(C42421sK.UPLOADED);
                                                break;
                                            }
                                        }
                                        break;
                                    case 5:
                                        if (A00(new C191698Hn(this.A00, this, this.A06, this.A01), r16) != r8) {
                                            z11 = true;
                                            break;
                                        }
                                        break;
                                }
                                if (!z11 && r23 != C42421sK.NOT_UPLOADED) {
                                    AnonymousClass0QD.A01("MediaUploader", "Album state machine error from " + r16.A04 + " to " + r23);
                                    break;
                                }
                                break;
                            case 7:
                                C42421sK r24 = r16.A05;
                                boolean z13 = true;
                                switch (r16.A04.ordinal()) {
                                    case 0:
                                    case 1:
                                        if (A00(new C201658k7(r16.A0B), r16) != r8) {
                                            break;
                                        }
                                    case 4:
                                    case 5:
                                    case 6:
                                        if (A00(new C191698Hn(this.A00, this, this.A06, this.A01), r16) != r8) {
                                            break;
                                        }
                                }
                                break;
                            default:
                                AnonymousClass0QD.A01("MediaUploader", C06360Ot.formatString("Unknown media type: %s", mediaType));
                                break;
                        }
                    } catch (Exception e) {
                        AnonymousClass0QD.A05("tryNextStep_exception", "Something went wrong in MediaUploader", e);
                    }
                    C42421sK r25 = pendingMedia2.A0v;
                    int A082 = pendingMedia2.A08();
                    pendingMedia2.A2x = false;
                    C42531sV r52 = r16.A0C;
                    AnonymousClass0P4 A043 = C42531sV.A04(r52, "pending_media_process", r16);
                    A043.A0G("reason", r16.A0F);
                    C42531sV.A0I(r52, A043, r16.A05);
                    if (r9.A00(r25) || (r25 == C42421sK.CONFIGURING_MULTIPLE_TARGETS && A082 > A08)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        boolean A004 = r25.A00(r9);
                        C195338Xp r02 = r16.A06;
                        if (r02 != null && r02.A01.A04 && AnonymousClass0NT.A07(r16.A09)) {
                            if (r16.A06.A01.A03) {
                                if (r16.A08 == Constants.ZERO) {
                                    AnonymousClass1BZ r27 = new AnonymousClass1BZ((C25961Bb) new C25951Ba(r16.A0D));
                                    r27.A01 = Constants.A0N;
                                    r27.A02 = "http://instagram.com/p-ng";
                                    AnonymousClass1C4 A005 = r27.A00();
                                    C33861dc r28 = null;
                                    r16.A08 = Constants.A0C;
                                    C255919l r12 = new C255919l();
                                    r12.A03 = C15920nk.Other;
                                    r28 = AnonymousClass1C8.A00().A01(new AnonymousClass1C3(A005, r12.A00()), (C44061vX) null);
                                    int i4 = r28.A01;
                                    if (i4 == 200) {
                                        r16.A08 = Constants.ONE;
                                    } else {
                                        r16.A01(C195328Xo.A0K, AnonymousClass000.A0A("Connectivity check failed: ", i4, ", ", r28.A02));
                                    }
                                    if (r28.A00 != null) {
                                        r28.A00.A8w();
                                    }
                                }
                                boolean z14 = false;
                                if (r16.A08 == Constants.ONE) {
                                    z14 = true;
                                }
                            }
                            z5 = true;
                            if (A004) {
                                int i5 = r16.A00 + 1;
                                r16.A00 = i5;
                            } else {
                                int i6 = r16.A01 + 1;
                                r16.A01 = i6;
                            }
                        }
                        z5 = false;
                        if (z5) {
                            if (A004) {
                                pendingMedia2.A0M++;
                            } else {
                                pendingMedia2.A0L++;
                            }
                            z6 = true;
                        }
                    }
                }
                z5 = false;
                z6 = true;
            }
        }
        z6 = true;
        if (!z6) {
            C42421sK r03 = pendingMedia2.A0v;
            AnonymousClass0QD.A01("tryToUpload_didNothing", StringFormatUtil.formatStrLocaleSafe("serverStatus: %s targetStatus: %s allowMultipleConfigures: %s hasMultiConfigTargetsThatNeedConfiguration: %s", r03, r03, pendingMedia2.A3F, Boolean.valueOf(pendingMedia2.A2c), Boolean.valueOf(pendingMedia2.A0y())));
        }
        return r16.A06;
    }

    public final String getModuleName() {
        return "media_uploader";
    }

    private AnonymousClass68T A00(C107404k5 r18, C195348Xq r19) {
        String str;
        AnonymousClass4TR r2;
        DLogTag dLogTag = DLogTag.PENDING_MEDIA;
        C107404k5 r5 = r18;
        String name = r5.getName();
        DLog.m40d(dLogTag, "step=%s", name);
        C195348Xq r4 = r19;
        String id = r4.A0A.getId();
        C107384k3 r3 = new C107384k3(this, r5, r4);
        C13150hy.A02(name, "stepName");
        C13150hy.A02(id, "mediaId");
        C13150hy.A02(r3, "execution");
        Map map = C110804ps.A01;
        Object obj = map.get(id);
        if (obj == null) {
            obj = new ArrayList();
            map.put(id, obj);
        }
        ((List) obj).add(new AnonymousClass4M4(name, System.currentTimeMillis(), (Long) null, AnonymousClass4TR.STARTED));
        AnonymousClass68T r32 = (AnonymousClass68T) r3.call();
        C13150hy.A01(r32, "result");
        List list = (List) C110804ps.A01.get(id);
        if (list != null) {
            C13150hy.A02(list, "$this$lastIndex");
            int size = list.size() - 1;
            C13150hy.A02(list, "$this$lastIndex");
            AnonymousClass4M4 r8 = (AnonymousClass4M4) list.get(list.size() - 1);
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            int i = AnonymousClass68U.A00[r32.ordinal()];
            if (i == 1) {
                r2 = AnonymousClass4TR.SKIPPED;
            } else if (i == 2) {
                r2 = AnonymousClass4TR.SUCCEEDED;
            } else if (i == 3) {
                r2 = AnonymousClass4TR.FAILED;
            } else {
                throw new C191608Hd();
            }
            String str2 = r8.A03;
            long j = r8.A00;
            C13150hy.A02(str2, "stepName");
            C13150hy.A02(r2, "stepState");
            list.set(size, new AnonymousClass4M4(str2, j, valueOf, r2));
        }
        PendingMedia pendingMedia = r4.A0A;
        Map map2 = C110804ps.A02;
        String id2 = pendingMedia.getId();
        String name2 = pendingMedia.A0g.name();
        String name3 = pendingMedia.A0E().name();
        String str3 = pendingMedia.A1W;
        String[] strArr = new String[3];
        strArr[0] = pendingMedia.A1n;
        strArr[1] = pendingMedia.A1Z;
        ClipInfo clipInfo = pendingMedia.A0l;
        if (clipInfo != null) {
            str = clipInfo.A0F;
        } else {
            str = null;
        }
        strArr[2] = str;
        map2.put(id2, new C98554No(id2, name2, name3, str3, Arrays.asList(strArr), Arrays.asList(new String[]{pendingMedia.A1g, pendingMedia.A1t})));
        return r32;
    }

    public static boolean tryToBacktrack(PendingMedia pendingMedia) {
        C42421sK r2;
        C42421sK r4 = pendingMedia.A0v;
        C42421sK r3 = pendingMedia.A3F;
        synchronized (pendingMedia) {
            r2 = pendingMedia.A0u;
            pendingMedia.A0u = null;
        }
        if (pendingMedia.A0x() && r2 == C42421sK.NOT_UPLOADED && pendingMedia.A1t != null) {
            pendingMedia.A0g((String) null);
            pendingMedia.A0e((String) null);
            pendingMedia.A0r.A02();
            pendingMedia.A0R();
        }
        if (r2 != null || !r3.A00(r4)) {
            r3 = r2;
        }
        if (r3 == null || !r3.A00(r4)) {
            return false;
        }
        pendingMedia.A0Z(r3);
        return true;
    }

    public C42561sY(Context context, AnonymousClass0C1 r4, Map map, C42531sV r6) {
        this.A00 = context;
        this.A05 = r4;
        this.A01 = r6;
        this.A02 = C42571sZ.A00(r4, context);
        this.A06 = map;
    }
}
