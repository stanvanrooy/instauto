package p000X;

import android.content.Context;
import com.instagram.model.mediatype.MediaType;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0rL  reason: invalid class name and case insensitive filesystem */
public final class C18120rL extends C18130rM {
    public final C18110rK A00;
    public final C18140rN A01;

    public final C105814hT A01(Context context, AnonymousClass0C1 r18, C107684kX r19) {
        C107684kX r2 = r19;
        int i = r2.A00;
        ShareType shareType = r2.A02.A02;
        AnonymousClass0a4.A07(shareType, "Share type missing");
        AnonymousClass0C1 r11 = r18;
        C105814hT A05 = A05(context, r11, r2.A02, C191758Ht.A00(r11, shareType, false, i), (ClipInfo) null, r2.A01.A00());
        AnonymousClass15U r5 = new AnonymousClass15U();
        r5.A01 = "convertPhotoToVideo";
        r5.A00 = i;
        C247715y r7 = new C247715y();
        r7.A00 = "calculatePdqHash";
        AnonymousClass16K r10 = new AnonymousClass16K(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C108044lA("common.imageInfo", r2.A01));
        AnonymousClass4l0 r3 = new AnonymousClass4l0(arrayList);
        C105774hP r4 = new C105774hP(r10, r11);
        r4.A02(r10, r7, r5);
        r4.A01(r5, A05.A00);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(A05.A00);
        C105884ha r0 = A05.A02;
        if (r0 != null) {
            ArrayList arrayList3 = new ArrayList();
            C105884ha r12 = r0;
            if (r0 != null) {
                for (String str : r0.A02()) {
                    for (Object r1 : r12.A03(str)) {
                        arrayList3.add(new C108044lA(str, r1));
                    }
                }
            }
            C105884ha r122 = r4.A01;
            if (r122 != null) {
                for (String str2 : r122.A02()) {
                    for (Object r13 : r122.A03(str2)) {
                        arrayList3.add(new C108044lA(str2, r13));
                    }
                }
            }
            r4.A01 = new AnonymousClass4l0(arrayList3);
        }
        while (!arrayList2.isEmpty()) {
            AnonymousClass15G r112 = (AnonymousClass15G) arrayList2.remove(0);
            C105884ha A02 = A05.A02(r112);
            if (A02 != null) {
                r4.A02.put(r112, A02);
            }
            List<AnonymousClass15G> A04 = A05.A04(r112);
            for (AnonymousClass15G r02 : A04) {
                r4.A01(r112, r02);
                arrayList2.add(r02);
            }
            A04.isEmpty();
        }
        for (Map.Entry entry : A05.A06.entrySet()) {
            r4.A03((AnonymousClass15G) entry.getValue(), (String) entry.getKey());
        }
        r4.A06 &= A05.A09;
        r4.A02.put(r5, r3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new C108044lA("common.originalImageFilePath", r2.A03));
        r4.A02.put(r7, new AnonymousClass4l0(arrayList4));
        String[] strArr = {"renderVideo", "uploadVideo", "uploadCoverPhoto", "renderCoverPhoto", "finishEndpoint"};
        for (int i2 = 0; i2 < 5; i2++) {
            AnonymousClass15G A012 = A05.A01(strArr[i2]);
            if (A012 != null) {
                r4.A01(r5, A012);
            }
        }
        return r4.A00();
    }

    public final C105814hT A02(Context context, AnonymousClass0C1 r10, C104754fk r11) {
        ClipInfo clipInfo = r11.A01;
        AnonymousClass0a4.A07(clipInfo, "Source video missing");
        ShareType shareType = r11.A00.A02;
        AnonymousClass0a4.A07(shareType, "Share type missing");
        C104764fl r4 = r11.A00;
        AnonymousClass20J A002 = C191758Ht.A00(r10, shareType, false, clipInfo.AKe());
        ClipInfo clipInfo2 = r11.A01;
        return A05(context, r10, r4, A002, clipInfo2, clipInfo2.A02);
    }

    public final String A03(Map map, C105814hT r6) {
        AnonymousClass4l0 r2;
        C105884ha r3 = r6.A02;
        AnonymousClass0a4.A06(r3);
        C246715o r1 = new C246715o(new C156116lc());
        Object A002 = C106394iR.A00(r3, "common.renderEffects", C246715o.class);
        if (A002 == null) {
            A002 = r1;
        }
        C156146lf r0 = ((C246715o) A002).A01;
        if (r0 == null || !r0.A02) {
            AnonymousClass15G A012 = r6.A01("renderVideo");
            AnonymousClass0a4.A06(A012);
            C106364iO r02 = (C106364iO) map.get(A012);
            if (!(r02 == null || (r2 = r02.A01) == null)) {
                return (String) C106394iR.A00(r2, "media.renderedFilepath", String.class);
            }
        }
        return null;
    }

    public final String A04(Map map, C105814hT r6) {
        C106364iO r0;
        AnonymousClass4l0 r02;
        C105884ha r03 = r6.A02;
        AnonymousClass0a4.A06(r03);
        Class<String> cls = String.class;
        String str = (String) C106394iR.A00(r03, "common.coverImagePath", cls);
        if (str != null) {
            return str;
        }
        AnonymousClass15G A012 = r6.A01("renderCoverPhoto");
        if (A012 == null || (r0 = (C106364iO) map.get(A012)) == null || (r02 = r0.A01) == null) {
            return null;
        }
        return (String) C106394iR.A00(r02, "common.coverImagePath", cls);
    }

    public final C105814hT A05(Context context, AnonymousClass0C1 r13, C104764fl r14, AnonymousClass20J r15, ClipInfo clipInfo, float f) {
        AnonymousClass15W r8 = new AnonymousClass15W(MediaType.VIDEO);
        AnonymousClass15M r5 = AnonymousClass15M.A01;
        AnonymousClass15Q r1 = new AnonymousClass15Q(C18140rN.A00(r13));
        AnonymousClass15K r7 = AnonymousClass15K.A01;
        AnonymousClass15O r6 = new AnonymousClass15O(C18140rN.A00(r13));
        C105774hP r3 = new C105774hP(r8, r13);
        r3.A02(r8, r5, r1);
        r3.A03(r1, "uploadVideo");
        if (r14.A04 != null) {
            r3.A02(r8, r6, new AnonymousClass15G[0]);
            r3.A03(r6, "uploadCoverPhoto");
        } else {
            r3.A02(r5, r7, r6);
            r3.A03(r7, "renderCoverPhoto");
            r3.A03(r6, "uploadCoverPhoto");
        }
        boolean A002 = C18140rN.A00(r13);
        AnonymousClass15S r4 = new AnonymousClass15S();
        r4.A00 = "finish";
        r4.A01 = A002;
        r3.A01(r1, r4);
        r3.A01(r6, r4);
        r3.A03(r4, "finishEndpoint");
        r3.A03(r5, "renderVideo");
        C245515a r2 = new C245515a("reportSSIM");
        r3.A01(r5, r2);
        r3.A01(r4, r2);
        r3.A03(r2, "reportQuality");
        String l = Long.toString(System.currentTimeMillis());
        String str = r14.A03;
        if (str == null) {
            str = C13920jT.A00("capture_flow_v2").A05();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C108044lA("common.uploadId", l));
        arrayList.add(new C108044lA("common.captureWaterfallId", str));
        arrayList.add(new C108044lA("common.ingestionStrategy", new C246515m(r15)));
        ClipInfo clipInfo2 = clipInfo;
        String str2 = r14.A04;
        boolean z = r14.A06;
        boolean z2 = r14.A05;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C108044lA("common.isAudioMuted", Boolean.valueOf(z2)));
        arrayList2.add(new C108044lA("common.isForReel", Boolean.valueOf(z)));
        arrayList2.add(new C108044lA("common.sourceType", Integer.valueOf(r14.A00)));
        if (clipInfo != null) {
            arrayList2.add(new C108044lA("common.inputVideo", new AnonymousClass15c(clipInfo2)));
        }
        C246715o r52 = r14.A01;
        if (r52 != null) {
            arrayList2.add(new C108044lA("common.renderEffects", r52));
        }
        if (str2 != null) {
            arrayList2.add(new C108044lA("common.coverImagePath", str2));
        }
        AnonymousClass4l0 r82 = new AnonymousClass4l0(arrayList2);
        for (String str3 : r82.A02()) {
            for (Object r22 : r82.A03(str3)) {
                arrayList.add(new C108044lA(str3, r22));
            }
        }
        r3.A01 = new AnonymousClass4l0(arrayList);
        r3.A00 = new C106234i9(this, context, r13);
        ShareType shareType = r14.A02;
        AnonymousClass0a4.A07(shareType, "Share type missing");
        this.A00.A07(r3, r4);
        this.A00.A08(r3, r1);
        this.A00.A06(r3, shareType, MediaType.VIDEO, f);
        return r3.A00();
    }

    public C18120rL() {
        C18110rK A03 = C18110rK.A03();
        C18140rN r0 = new C18140rN();
        this.A00 = A03;
        this.A01 = r0;
    }

    public C18120rL(C18110rK r2) {
        C18140rN r0 = new C18140rN();
        this.A00 = r2;
        this.A01 = r0;
    }
}
