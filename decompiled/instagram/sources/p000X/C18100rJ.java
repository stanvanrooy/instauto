package p000X;

import android.content.Context;
import com.instagram.model.mediatype.MediaType;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0rJ  reason: invalid class name and case insensitive filesystem */
public final class C18100rJ extends C18110rK {
    public static MediaType A01(C105884ha r3) {
        if (r3 == null) {
            return null;
        }
        C106554ih r0 = (C106554ih) C106394iR.A02(r3, "media.metadata", C247315u.class);
        if (r0 != null) {
            return r0.A01;
        }
        C246115i r1 = (C246115i) C106394iR.A00(r3, "media.type", C246115i.class);
        if (r1 != null) {
            return (MediaType) r1.A00(MediaType.class);
        }
        AnonymousClass0QD.A01("null_media_type", "Can't happen: null media type");
        return null;
    }

    public static AnonymousClass15Y A00(C105804hS r6, AnonymousClass15G r7) {
        int i;
        AnonymousClass15G r5 = (AnonymousClass15G) r6.A02.get("media.ingestComplete");
        int i2 = 0;
        if (r5 == null) {
            AnonymousClass0QD.A01("media_txn_no_ingest_complete_op", "No ingest complete operation found");
        } else {
            ArrayList<AnonymousClass15G> arrayList = new ArrayList<>();
            for (C105794hR r1 : r6.A03) {
                if (r5.equals(r1.A00)) {
                    arrayList.add(r1.A01);
                }
            }
            for (AnonymousClass15G r12 : arrayList) {
                if ((r12 instanceof AnonymousClass15Y) && (i = ((AnonymousClass15Y) r12).A00) > i2) {
                    i2 = i;
                }
            }
            i2++;
        }
        AnonymousClass15Y r0 = new AnonymousClass15Y(i2);
        r6.A02(r7, r0);
        return r0;
    }

    public static String A02(C105814hT r3) {
        C246115i r1;
        C105884ha r32 = r3.A02;
        if (r32 == null || r32 == null || (r1 = (C246115i) C106394iR.A00(r32, "common.shareType", C246115i.class)) == null) {
            return null;
        }
        return C42531sV.A09((ShareType) r1.A00(ShareType.class));
    }

    public final C106554ih A04(C105814hT r4) {
        C105884ha r2 = r4.A02;
        if (r2 == null) {
            return null;
        }
        return (C106554ih) C106394iR.A02(r2, "media.metadata", C247315u.class);
    }

    public final AnonymousClass43I A05(Context context, C105804hS r5) {
        AnonymousClass15G r0 = (AnonymousClass15G) r5.A02.get("media.ingestComplete");
        AnonymousClass0a4.A06(r0);
        return new AnonymousClass43I(r5.A09, A00(r5, r0).A00);
    }

    public final C105774hP A06(C105774hP r8, ShareType shareType, MediaType mediaType, float f) {
        C105884ha r0 = r8.A01;
        ArrayList arrayList = new ArrayList();
        C105884ha r6 = r0;
        if (r0 != null) {
            for (String str : r0.A02()) {
                for (Object r1 : r6.A03(str)) {
                    arrayList.add(new C108044lA(str, r1));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C108044lA r12 = (C108044lA) it.next();
            if (r12.A06.equals("common.shareType")) {
                arrayList2.add(r12);
            }
        }
        arrayList.removeAll(arrayList2);
        arrayList.add(new C108044lA("common.shareType", new C246115i(shareType)));
        arrayList.add(new C108044lA("media.type", new C246115i(mediaType)));
        arrayList.add(new C108044lA("media.metadata", new C247315u(new C106554ih(mediaType, f))));
        r8.A01 = new AnonymousClass4l0(arrayList);
        return r8;
    }

    public final C105774hP A07(C105774hP r2, AnonymousClass15G r3) {
        r2.A03(r3, "media.ingestComplete");
        return r2;
    }

    public final C105774hP A08(C105774hP r2, AnonymousClass15G r3) {
        r2.A03(r3, "media.postRender");
        return r2;
    }

    public final C105804hS A09(Context context, C105804hS r13, AnonymousClass15G r14, String str) {
        C246115i r1;
        AnonymousClass15G r12 = (AnonymousClass15G) r13.A02.get("media.ingestComplete");
        AnonymousClass0a4.A06(r12);
        MediaType A01 = A01(r13.A01);
        AnonymousClass15Y A00 = A00(r13, r12);
        r13.A02(r12, r14);
        r13.A02(A00, r14);
        String str2 = null;
        C42531sV r2 = new C42531sV(context, r13.A08);
        C105884ha r0 = r13.A01;
        C105884ha r3 = r0;
        if (!(r0 == null || (r1 = (C246115i) C106394iR.A00(r3, "common.shareType", C246115i.class)) == null)) {
            str2 = C42531sV.A09((ShareType) r1.A00(ShareType.class));
        }
        String str3 = r13.A09;
        int i = A00.A00;
        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_media_publish_invoke", (AnonymousClass0RN) null);
        C42531sV.A0J(r2, A002, str3, i, A01, str2, str2, false);
        C42531sV.A0H(r2, A002);
        return r13;
    }

    public final String A0A(AnonymousClass14Q r2, AnonymousClass43I r3) {
        C105814hT A0K = r2.A0K(r3.A01);
        if (A0K == null) {
            return null;
        }
        return A02(A0K);
    }

    public final void A0C(Context context, AnonymousClass0C1 r12, C105814hT r13, AnonymousClass43I r14, String str) {
        if (r13 != null) {
            String A02 = A02(r13);
            MediaType A01 = A01(r13.A02);
            C42531sV r2 = new C42531sV(context, r12);
            String str2 = r13.A04;
            int i = r14.A00;
            AnonymousClass0P4 A00 = AnonymousClass0P4.A00("ig_media_publish_invoke", (AnonymousClass0RN) null);
            C42531sV.A0J(r2, A00, str2, i, A01, A02, str, false);
            C42531sV.A0H(r2, A00);
        }
    }

    public final void A0D(C106264iC r12, C105814hT r13, C105884ha r14, String str) {
        Object A00 = C106394iR.A00(r14, "media.publishId", Integer.class);
        if (A00 == null) {
            A00 = -1;
        }
        int intValue = ((Integer) A00).intValue();
        String A02 = A02(r13);
        MediaType A01 = A01(r14);
        if (intValue != -1 && A01 != null) {
            String str2 = r13.A04;
            C42531sV r2 = new C42531sV(r12.A02, r12.A04);
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_media_publish_success", (AnonymousClass0RN) null);
            C42531sV.A0J(r2, A002, str2, intValue, A01, A02, A02, false);
            C42531sV.A0H(r2, A002);
        }
    }

    public final void A0B(Context context, AnonymousClass0C1 r13, AnonymousClass43K r14, String str) {
        AnonymousClass43I ATJ = r14.ATJ();
        if (ATJ != null) {
            String str2 = ATJ.A01;
            int i = ATJ.A00;
            MediaType APx = r14.APx();
            String ANX = r14.ANX();
            C42531sV r2 = new C42531sV(context, r13);
            AnonymousClass0P4 A00 = AnonymousClass0P4.A00("ig_media_publish_success", (AnonymousClass0RN) null);
            C42531sV.A0J(r2, A00, str2, i, APx, ANX, ANX, false);
            C42531sV.A0H(r2, A00);
        }
    }
}
