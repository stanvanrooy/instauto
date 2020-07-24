package p000X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: X.0v8  reason: invalid class name and case insensitive filesystem */
public final class C20460v8 implements C19490tZ, C20360uy, C20370uz {
    public static final ShareType A05 = ShareType.DIRECT_STORY_SHARE;
    public static final C05110Id A06 = new C20470vA();
    public final C92803zk A00;
    public final C92803zk A01;
    public final C92803zk A02;
    public final C65882uZ A03;
    public final AnonymousClass0C1 A04;

    private void A00(C20440v6 r19, String str, AnonymousClass43K r21, boolean z, String str2, C160436su r24, Long l, Long l2, C185767we r27, List list, C107694kY r29, C73233Ja r30, boolean z2) {
        long j;
        long j2;
        C73233Ja r10 = r30;
        try {
            C104614fW r6 = new C104614fW(this, r21);
            AnonymousClass0C1 r9 = this.A04;
            C20440v6 r1 = r19;
            String A052 = r1.A05();
            String str3 = r1.A03;
            boolean z3 = r1.A02.A03;
            if (l != null) {
                j = l.longValue();
            } else {
                j = r1.A01;
            }
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = TimeUnit.MILLISECONDS.toSeconds(r1.A01);
            }
            boolean z4 = z;
            String str4 = str;
            C15890nh A002 = C160416ss.A00(C160566t8.A0B, r9, str4, z4, str2, C05860Mt.A00(StoredPreferences.A00));
            A002.A06(C106724iy.class, false);
            C160416ss.A08(r9, A002, r24, z4, j);
            A002.A09("client_context", A052);
            if (str3 != null) {
                A002.A09("mutation_token", str3);
            }
            if (z3) {
                A002.A09("sampled", "true");
            }
            if (z2) {
                C185727wa.A02(A002, ShareType.DIRECT_STORY_SHARE_DRAFT);
            } else {
                C185727wa.A02(A002, A05);
            }
            C185727wa.A04(r9, A002, j2, r27);
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str5 = ((DirectThreadKey) it.next()).A00;
                if (str5 != null) {
                    jSONArray.put(str5);
                }
            }
            A002.A3u("thread_ids", jSONArray.toString());
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                DirectThreadKey directThreadKey = (DirectThreadKey) it2.next();
                if (directThreadKey.A00 == null) {
                    List list2 = directThreadKey.A01;
                    AnonymousClass0a4.A06(list2);
                    arrayList.add('[' + C36681iR.A00(',').A03(list2) + ']');
                }
            }
            A002.A3u("recipient_users", '[' + C36681iR.A00(',').A03(arrayList) + ']');
            C107694kY r12 = r29;
            String str6 = r12.A02;
            String str7 = r12.A00;
            String str8 = r12.A01;
            String str9 = str6;
            if (str6 == null) {
                str9 = "replayable";
            }
            A002.A3u("view_mode", str9);
            if (str7 != null) {
                A002.A3u("reply_type", str7);
            }
            if (str8 != null) {
                A002.A3u("reply_to_media_id", str8);
            }
            C17850qu A032 = A002.A03();
            A032.A00 = new AnonymousClass4T2(this.A04, r10, r6);
            C12810hQ.A02(A032);
        } catch (IOException e) {
            AnonymousClass3LX.A0D(r10.ALa(), Constants.ZERO);
            r10.BCO(AnonymousClass4R2.A02(e));
        }
    }

    public final /* bridge */ /* synthetic */ void A9J(C19410tR r16, C104664fb r17, C73233Ja r18) {
        C160436su r7;
        C185767we r10;
        C20440v6 r2 = (C20440v6) r16;
        C104664fb r4 = r17;
        String str = r4.A00;
        String A002 = r2.A00.A00();
        boolean z = false;
        if (A002 != null) {
            z = true;
        }
        if (z) {
            r7 = r2.A02;
            AnonymousClass0a4.A06(r7);
        } else {
            r7 = null;
        }
        AnonymousClass0a4.A06(r7);
        C160436su r72 = r7;
        boolean z2 = false;
        if (A002 != null) {
            z2 = true;
        }
        if (z2) {
            r10 = r2.A01;
            AnonymousClass0a4.A06(r10);
        } else {
            r10 = null;
        }
        AnonymousClass0a4.A06(r10);
        List A062 = r2.A06();
        C107694kY A07 = r2.A07();
        AnonymousClass0a4.A06(A07);
        A00(r2, str, r4, false, (String) null, r72, (Long) null, (Long) null, r10, A062, A07, r18, false);
    }

    public final /* bridge */ /* synthetic */ void A9K(C19410tR r16, C104674fc r17, C73233Ja r18) {
        C160436su r7;
        C185767we r10;
        C20440v6 r2 = (C20440v6) r16;
        C104674fc r4 = r17;
        String str = r4.A00;
        String str2 = r4.A01;
        String A002 = r2.A00.A00();
        boolean z = false;
        if (A002 != null) {
            z = true;
        }
        if (z) {
            r7 = r2.A02;
            AnonymousClass0a4.A06(r7);
        } else {
            r7 = null;
        }
        AnonymousClass0a4.A06(r7);
        C160436su r72 = r7;
        boolean z2 = false;
        if (A002 != null) {
            z2 = true;
        }
        if (z2) {
            r10 = r2.A01;
            AnonymousClass0a4.A06(r10);
        } else {
            r10 = null;
        }
        AnonymousClass0a4.A06(r10);
        List A062 = r2.A06();
        C107694kY A07 = r2.A07();
        AnonymousClass0a4.A06(A07);
        A00(r2, str, r4, true, str2, r72, (Long) null, (Long) null, r10, A062, A07, r18, false);
    }

    public final /* bridge */ /* synthetic */ void A9L(C19410tR r18, PendingMedia pendingMedia, C73233Ja r20) {
        C20440v6 r4 = (C20440v6) r18;
        List A062 = r4.A06();
        C107694kY A07 = r4.A07();
        PendingMedia pendingMedia2 = pendingMedia;
        if (A07 == null) {
            AnonymousClass4S9 r0 = pendingMedia2.A0m;
            if (r0 != null) {
                A07 = new C107694kY(r0.A00, r0.A01, (String) null);
            } else {
                A07 = new C107694kY();
            }
        }
        A00(r4, pendingMedia2.A24, (AnonymousClass43K) null, pendingMedia2.A0x(), pendingMedia2.A27, C185537wE.A00(pendingMedia2), Long.valueOf(pendingMedia2.A0a), Long.valueOf(pendingMedia2.A0Z), C185727wa.A00(pendingMedia2), A062, A07, r20, false);
    }

    public final /* bridge */ /* synthetic */ void A9O(C19410tR r18, PendingMedia pendingMedia, C73233Ja r20) {
        C20440v6 r4 = (C20440v6) r18;
        List A062 = r4.A06();
        C107694kY A07 = r4.A07();
        PendingMedia pendingMedia2 = pendingMedia;
        if (A07 == null) {
            AnonymousClass4S9 r0 = pendingMedia2.A0m;
            if (r0 != null) {
                A07 = new C107694kY(r0.A00, r0.A01, (String) null);
            } else {
                A07 = new C107694kY();
            }
        }
        A00(r4, pendingMedia2.A24, (AnonymousClass43K) null, pendingMedia2.A0x(), pendingMedia2.A27, C185537wE.A00(pendingMedia2), Long.valueOf(pendingMedia2.A0a), Long.valueOf(pendingMedia2.A0Z), C185727wa.A00(pendingMedia2), A062, A07, r20, true);
    }

    public final /* bridge */ /* synthetic */ boolean AiL(C17090pf r2) {
        return AnonymousClass2n2.A00(this.A03, (C20440v6) r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r0 != null) goto L_0x0011;
     */
    public final /* bridge */ /* synthetic */ void BfK(C17090pf r16, C06270Ok r17, C73233Ja r18) {
        boolean z;
        C20440v6 r13 = (C20440v6) r16;
        C98724Oo r1 = r13.A00;
        if (r1.A04 == null) {
            String A002 = r1.A00();
            z = false;
        }
        z = true;
        AnonymousClass0a4.A0C(z, "ConfigureMedia mutation lacks primary key for underlying infra");
        C98724Oo r12 = r13.A00;
        C06270Ok r2 = r17;
        C73233Ja r11 = r18;
        if (r12.A04 != null) {
            ((PendingMediaStoreSerializer) this.A01.get()).A03(new C102854cE((PendingMediaStore) this.A00.get(), r13.A00.A04, r11, this, r13, ((Boolean) AnonymousClass0L6.A02(this.A04, AnonymousClass0L7.THREADS_DIRECT_ANDROID_PARALLEL_CONFIGURE_PRIMING, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()));
        } else if (r12.A00() != null) {
            C98724Oo r0 = r13.A00;
            ((AnonymousClass14Q) this.A02.get()).A0N(new C100164Uo(r0.A00(), r11, r0.A01, this, r13));
        } else {
            throw new IllegalStateException("Mutation nas neither transaction id nor pendingmedia key");
        }
        AnonymousClass3LX.A0C(r2, Constants.A0C);
    }

    public C20460v8(AnonymousClass0C1 r1, C65882uZ r2, C92803zk r3, C92803zk r4, C92803zk r5) {
        this.A04 = r1;
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }
}
