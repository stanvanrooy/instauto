package p000X;

import android.content.Context;
import android.os.Handler;
import com.instagram.model.mediatype.MediaType;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.0qw  reason: invalid class name and case insensitive filesystem */
public final class C17870qw implements C06570Po {
    public static boolean A0F;
    public static final List A0G = new ArrayList(2);
    public PendingMediaStore A00;
    public PendingMediaStoreSerializer A01;
    public AnonymousClass0C1 A02;
    public Set A03 = new CopyOnWriteArraySet();
    public AnonymousClass0NZ A04;
    public C43681ut A05;
    public C43681ut A06;
    public final Context A07;
    public final C42561sY A08;
    public final C42531sV A09;
    public final List A0A = new LinkedList();
    public final Map A0B = new HashMap();
    public final Handler A0C;
    public final C06180Ob A0D = C06190Oc.A00;
    public final ExecutorService A0E = Executors.newSingleThreadExecutor();

    public static void A03(PendingMedia pendingMedia) {
        synchronized (pendingMedia) {
            if (pendingMedia.A0M(C23150ze.class).isEmpty()) {
                pendingMedia.A0b(new C23150ze());
            }
        }
    }

    public static synchronized void A05(C17870qw r2) {
        synchronized (r2) {
            C43681ut r1 = new C43681ut(r2.A02);
            r2.A05 = r1;
            r2.A06 = r1;
        }
    }

    public static void A08(C17870qw r5, C106884jF r6) {
        synchronized (r5) {
            PendingMedia pendingMedia = r6.A03;
            pendingMedia.A3H = true;
            PendingMedia.A06(pendingMedia);
            r5.A0A.add(r6);
        }
        AnonymousClass0L6.A02(r5.A02, AnonymousClass0L7.INGESTION_KEEPALIVE, "enable_foreground_service", false, (AnonymousClass04H) null);
        r5.A0B.put(r6.A03.A1h, AnonymousClass0Z9.A01(r5.A0E, r6, -802409434));
    }

    public static void A09(C17870qw r15, String str, boolean z) {
        long j;
        C17870qw r7 = r15;
        PendingMediaStore pendingMediaStore = r15.A00;
        ArrayList<PendingMedia> arrayList = new ArrayList<>(pendingMediaStore.A02.size());
        for (PendingMedia pendingMedia : pendingMediaStore.A02.values()) {
            if (pendingMedia.A0z() && pendingMedia.A0v != pendingMedia.A3F) {
                if (pendingMedia.A3F == C42421sK.CONFIGURED || pendingMedia.A3F == C42421sK.UPLOADED) {
                    arrayList.add(pendingMedia);
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        C15780nW r10 = new C15780nW(r7.A07);
        int size = arrayList.size();
        boolean z2 = false;
        boolean z3 = false;
        long j2 = 0;
        for (PendingMedia pendingMedia2 : arrayList) {
            r7.A0B(pendingMedia2);
            synchronized (pendingMedia2) {
                j = pendingMedia2.A0W;
            }
            if ((j <= currentTimeMillis || (z && pendingMedia2.A3J)) && A0A(r7)) {
                boolean z4 = false;
                if (r10.A04(pendingMedia2.A2e)) {
                    z4 = true;
                }
                if (z4) {
                    pendingMedia2.A0O();
                    C42531sV r6 = r7.A09;
                    AnonymousClass0P4 A012 = C42531sV.A01(r6, "pending_media_auto_retry", (AnonymousClass0RN) null, pendingMedia2);
                    C42531sV.A0B(A012, pendingMedia2);
                    String str2 = str;
                    A012.A0G("attempt_source", str2);
                    A012.A0G("reason", str2);
                    C42531sV.A0I(r6, A012, pendingMedia2.A3F);
                    A08(r7, A02(r7, 0, pendingMedia2, AnonymousClass000.A0E("AutoRetry:", str2)));
                    z2 = true;
                }
            }
            if (j >= currentTimeMillis && (j2 == 0 || j < j2)) {
                z3 = !pendingMedia2.A3J;
                j2 = j;
            }
        }
        if (z2) {
            r7.A01.A01();
        }
        if (size <= 0 && A0A(r7)) {
            C43511uX.A00(r7.A07, r7.A02);
        } else if (j2 > currentTimeMillis) {
            C43511uX.A02(r7.A07, r7.A02, j2, z3);
        } else {
            C43511uX.A01(r7.A07, r7.A02);
        }
    }

    public static synchronized boolean A0A(C17870qw r1) {
        boolean isEmpty;
        synchronized (r1) {
            isEmpty = r1.A0A.isEmpty();
        }
        return isEmpty;
    }

    public final void A0C(PendingMedia pendingMedia) {
        pendingMedia.A0k(true);
        this.A01.A01();
    }

    public final boolean A0L() {
        boolean z;
        synchronized (this) {
            z = false;
            if (!this.A0A.isEmpty()) {
                z = true;
            }
        }
        return z;
    }

    public static synchronized C17870qw A00(Context context, AnonymousClass0C1 r3) {
        C17870qw A012;
        synchronized (C17870qw.class) {
            A012 = A01(context, r3, "app start");
        }
        return A012;
    }

    public static synchronized C17870qw A01(Context context, AnonymousClass0C1 r5, String str) {
        C17870qw r0;
        Class<C17870qw> cls = C17870qw.class;
        synchronized (cls) {
            if (r5.AV9(cls) == null) {
                C17870qw r2 = new C17870qw(context.getApplicationContext(), r5);
                r5.BYi(cls, r2);
                PendingMediaStoreSerializer.A00(r5).A03(new C42611sd(r5, r2, str));
                A09(r2, "user changed", false);
            }
            r0 = (C17870qw) r5.AV9(cls);
        }
        return r0;
    }

    public static C106884jF A02(C17870qw r8, int i, PendingMedia pendingMedia, String str) {
        return new C106884jF(r8.A07, r8.A00, r8.A08, i, pendingMedia, str, r8, r8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r3.A0E() == com.instagram.pendingmedia.model.constants.ShareType.A0H) goto L_0x0015;
     */
    public static void A04(PendingMedia pendingMedia) {
        boolean z;
        if (!pendingMedia.A2v && pendingMedia.A0E() != ShareType.DIRECT_SHARE) {
            z = false;
        }
        z = true;
        pendingMedia.A3G = z;
    }

    public final C43681ut A0B(PendingMedia pendingMedia) {
        if (this.A05 == null || this.A06 == null) {
            A05(this);
        }
        if (pendingMedia.A2v || pendingMedia.A0E() == ShareType.DIRECT_SHARE) {
            return this.A05;
        }
        return this.A06;
    }

    public final void A0D(PendingMedia pendingMedia) {
        this.A00.A0B(MediaType.PHOTO);
        this.A00.A0D(pendingMedia.A1h, pendingMedia);
        this.A01.A01();
    }

    public final void A0E(PendingMedia pendingMedia) {
        this.A00.A0B(MediaType.VIDEO);
        this.A00.A0D(pendingMedia.A1h, pendingMedia);
        this.A01.A01();
    }

    public final void A0G(PendingMedia pendingMedia, AnonymousClass0RN r9) {
        pendingMedia.A0K++;
        C42531sV r4 = this.A09;
        AnonymousClass0P4 A012 = C42531sV.A01(r4, "pending_media_cancel_click", r9, pendingMedia);
        C42531sV.A0B(A012, pendingMedia);
        C42531sV.A0C(A012, pendingMedia);
        if (pendingMedia.A2e) {
            A012.A0G("wifi_only", "true");
        }
        String str = pendingMedia.A1j;
        if (str != null) {
            A012.A0G("reason", str);
        }
        C42531sV.A0I(r4, A012, pendingMedia.A3F);
        C42291s7 r6 = pendingMedia.A0n;
        for (Integer intValue : r6.A00()) {
            int intValue2 = intValue.intValue();
            AnonymousClass0P4 A022 = C42531sV.A02(r4, "ig_media_publish_user_abandon", pendingMedia);
            C42531sV.A0E(pendingMedia, A022);
            String str2 = pendingMedia.A1j;
            if (str2 == null) {
                str2 = "unknown";
            }
            A022.A0G("reason", str2);
            Integer valueOf = Integer.valueOf(intValue2);
            A022.A0E("publish_id", valueOf);
            C42531sV.A0H(r4, A022);
            r6.A01.add(valueOf);
        }
        AnonymousClass00B.A01.markerEnd(51052545, pendingMedia.A24.hashCode(), 477);
        AnonymousClass8YE.A00(r4.A00).A00.A5H(AnonymousClass8YE.A01, (long) Objects.hashCode(pendingMedia.A24), "user_abandon");
        pendingMedia.A3F = C42421sK.NOT_UPLOADED;
        A07(this, A02(this, 1, pendingMedia, "user cancel"));
    }

    public final void A0K(String str, AnonymousClass0RN r4) {
        PendingMedia A042 = this.A00.A04(str);
        if (A042 == null) {
            AnonymousClass0QD.A01("PendingMediaManager_cancelUpload_notFound", AnonymousClass000.A0E("Can't find the media in store with key=", str));
        } else {
            A0G(A042, r4);
        }
    }

    public final boolean A0M(String str, AnonymousClass0RN r4) {
        PendingMedia A042 = this.A00.A04(str);
        if (A042 == null) {
            AnonymousClass0QD.A01("PendingMediaManager_manualUploadRetry_notFound", AnonymousClass000.A0E("Can't find the media in store with key=", str));
            return false;
        }
        A0H(A042, r4);
        return true;
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0NZ r1 = this.A04;
        if (r1 != null) {
            AnonymousClass0KT.A08.remove(r1);
        }
    }

    public C17870qw(Context context, AnonymousClass0C1 r6) {
        this.A07 = context;
        this.A02 = r6;
        this.A09 = new C42531sV(context, r6);
        C04450Ea r3 = new C04450Ea();
        for (C17840qt AIc : A0G) {
            r3.A0A(AIc.AIc());
        }
        this.A08 = new C42561sY(context, this.A02, r3, this.A09);
        this.A0C = new Handler(this.A07.getMainLooper());
        C42601sc r1 = new C42601sc(this);
        this.A04 = r1;
        AnonymousClass0KT.A08.add(r1);
        this.A00 = PendingMediaStore.A01(this.A02);
        this.A01 = PendingMediaStoreSerializer.A00(this.A02);
    }

    public static void A06(C17870qw r3, PendingMedia pendingMedia) {
        for (String A042 : pendingMedia.A0K()) {
            PendingMedia A043 = r3.A00.A04(A042);
            A043.A1q = null;
            A043.A0k(false);
            A043.A2t = false;
        }
    }

    public static void A07(C17870qw r2, C106884jF r3) {
        A08(r2, r3);
        r2.A0B(r3.A03);
        C43511uX.A01(r2.A07, r2.A02);
    }

    public final void A0F(PendingMedia pendingMedia) {
        A04(pendingMedia);
        pendingMedia.A3F = C42421sK.UPLOADED;
        pendingMedia.A0a(C42421sK.NOT_UPLOADED);
        A0B(pendingMedia).A00(pendingMedia);
        A07(this, A02(this, 0, pendingMedia, "pre-upload"));
    }

    public final void A0H(PendingMedia pendingMedia, AnonymousClass0RN r5) {
        pendingMedia.A0P();
        C42531sV r2 = this.A09;
        AnonymousClass0P4 A012 = C42531sV.A01(r2, "pending_media_retry_click", r5, pendingMedia);
        C42531sV.A0B(A012, pendingMedia);
        C42531sV.A0I(r2, A012, pendingMedia.A3F);
        A0B(pendingMedia).A00(pendingMedia);
        this.A01.A01();
        A07(this, A02(this, 0, pendingMedia, "manual retry"));
    }

    public final void A0I(PendingMedia pendingMedia, C23160zf r14) {
        int i;
        boolean z = false;
        if (pendingMedia.A0E() != ShareType.UNKNOWN) {
            z = true;
        }
        AnonymousClass0a4.A0B(z, "Cannot post media without a valid share type");
        if (r14 != null) {
            int i2 = 1;
            for (C23160zf AX9 : pendingMedia.A2T) {
                i2 = Math.max(i2, AX9.AX9() + 1);
            }
            r14.Bkp(i2);
        }
        if (!pendingMedia.A0E().A01) {
            A0F = true;
        }
        A04(pendingMedia);
        pendingMedia.A3F = C42421sK.CONFIGURED;
        if (pendingMedia.A2u) {
            pendingMedia.A0Z(C42421sK.NOT_UPLOADED);
        }
        if (pendingMedia.A0q()) {
            for (PendingMedia pendingMedia2 : pendingMedia.A0J()) {
                pendingMedia2.A3F = C42421sK.UPLOADED;
            }
        }
        this.A09.A0Q(pendingMedia, r14);
        C42531sV r11 = this.A09;
        AnonymousClass0P4 A022 = C42531sV.A02(r11, "ig_media_publish_invoke", pendingMedia);
        A022.A0G("session_id", C42531sV.A06(pendingMedia));
        A022.A0G("ingest_surface", C42531sV.A07(pendingMedia));
        A022.A0G("target_surface", C42531sV.A08(pendingMedia));
        A022.A0A("is_carousel_item", Boolean.valueOf(pendingMedia.A0q()));
        C42291s7 r2 = pendingMedia.A0n;
        synchronized (r2) {
            i = r2.A00;
            r2.A00 = i + 1;
        }
        Integer valueOf = Integer.valueOf(i);
        A022.A0E("publish_id", valueOf);
        synchronized (r2) {
            r2.A02.add(valueOf);
        }
        C42531sV.A0H(r11, A022);
        AnonymousClass00B r3 = AnonymousClass00B.A01;
        int hashCode = pendingMedia.A24.hashCode();
        r3.markerStart(51052545, hashCode);
        r3.markerAnnotate(51052545, hashCode, "session_id", C42531sV.A06(pendingMedia));
        r3.markerAnnotate(51052545, hashCode, "ingest_surface", C42531sV.A07(pendingMedia));
        r3.markerAnnotate(51052545, hashCode, "target_surface", C42531sV.A08(pendingMedia));
        r3.markerAnnotate(51052545, hashCode, "is_carousel_item", pendingMedia.A0q());
        r3.markerAnnotate(51052545, hashCode, "publish_id", i);
        pendingMedia.A0X = System.currentTimeMillis();
        A0B(pendingMedia).A00(pendingMedia);
        A07(this, A02(this, 0, pendingMedia, "user post"));
        this.A01.A01();
        C42531sV r22 = this.A09;
        C42531sV.A0I(r22, C42531sV.A01(r22, "pending_media_post", (AnonymousClass0RN) null, pendingMedia), pendingMedia.A3F);
    }

    public final void A0J(C106884jF r5, PendingMedia pendingMedia) {
        pendingMedia.A0R();
        synchronized (this) {
            this.A0A.remove(r5);
            this.A0B.remove(pendingMedia.A1h);
            boolean z = false;
            boolean z2 = false;
            for (C106884jF r0 : this.A0A) {
                if (pendingMedia == r0.A03) {
                    z2 = true;
                }
            }
            pendingMedia.A3H = z2;
            PendingMedia.A06(pendingMedia);
            A0B(pendingMedia);
            if (this.A0A.isEmpty()) {
                if (pendingMedia.A0v == pendingMedia.A3F) {
                    z = true;
                }
                AnonymousClass0ZA.A0E(this.A0C, new C106304iI(this, z), 403528042);
            }
        }
        AnonymousClass0ZA.A0E(this.A0C, new C106854jC(this, pendingMedia), 1550943206);
    }
}
