package p000X;

import android.content.Context;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0zi  reason: invalid class name and case insensitive filesystem */
public final class C23190zi implements C23160zf {
    public static final C17120pi A02 = new C23200zj();
    public int A00;
    public boolean A01;

    public final boolean AfP() {
        return false;
    }

    public final boolean AfQ() {
        return false;
    }

    public final boolean Apg(AnonymousClass0C1 r2, PendingMedia pendingMedia) {
        return true;
    }

    public final String getTypeName() {
        return "FollowersShareTarget";
    }

    public final AnonymousClass1C3 A6x(Context context, AnonymousClass0C1 r20, Object obj, long j, String str, String str2, String str3, boolean z, String str4, ShareType shareType, String str5) {
        C160566t8 r11;
        AnonymousClass4UR r2 = (AnonymousClass4UR) obj;
        if (r2.A01.A0q()) {
            r11 = C160566t8.SIDECAR;
        } else {
            r11 = C160566t8.FEED;
        }
        boolean z2 = z;
        AnonymousClass0C1 r12 = r20;
        String str6 = str;
        C15890nh A002 = C160416ss.A00(r11, r12, str6, z2, str4, C05860Mt.A00(context));
        C160416ss.A08(r12, A002, C185537wE.A00(r2.A01), z2, j);
        PendingMedia pendingMedia = r2.A01;
        C160416ss.A07(r12, A002, new C160486sz(pendingMedia), pendingMedia.A0q());
        String A04 = r12.A04();
        HashMap hashMap = C185537wE.A00(r2.A01).A0G;
        if (hashMap != null) {
            if (hashMap.containsKey(A04)) {
                try {
                    A002.A3u("xsharing_nonces", new JSONObject().put(A04, hashMap.get(A04)).toString());
                } catch (JSONException unused) {
                    AnonymousClass0QD.A01(C160416ss.A00.getName(), AnonymousClass000.A0E("Error creating nonce pair string for user: ", A04));
                }
                A002.A3u("upload_user_id", str2);
            }
            A002.A3u("multi_sharing", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        String str7 = str3;
        C160416ss.A06(r12, A002, new C160486sz(r2.A01), str7);
        PendingMedia pendingMedia2 = r2.A01;
        if (pendingMedia2.A0q()) {
            List<PendingMedia> A0J = pendingMedia2.A0J();
            ArrayList<C98734Op> arrayList = new ArrayList<>(A0J.size());
            for (PendingMedia r1 : A0J) {
                arrayList.add(new C98734Op(r1));
            }
            A002.A3u("client_sidecar_id", str6);
            StringWriter stringWriter = new StringWriter();
            C13460iZ A05 = C12890hY.A00.A05(stringWriter);
            A05.A0S();
            for (C98734Op r8 : arrayList) {
                A05.A0T();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                C106804j6 r13 = new C106804j6(hashMap2, hashMap3);
                PendingMedia pendingMedia3 = r8.A00;
                String str8 = pendingMedia3.A24;
                boolean A0x = pendingMedia3.A0x();
                String str9 = pendingMedia3.A27;
                r13.A3u("upload_id", str8);
                if (A0x) {
                    r13.A3u("video_result", str9);
                }
                PendingMedia pendingMedia4 = r8.A00;
                C160416ss.A08(r12, r13, C185537wE.A00(pendingMedia4), pendingMedia4.A0x(), pendingMedia4.A0a);
                PendingMedia pendingMedia5 = r8.A00;
                C160486sz r14 = new C160486sz(pendingMedia5);
                C160416ss.A07(r12, r13, r14, pendingMedia5.A0q());
                C160416ss.A06(r12, r13, r14, str7);
                for (Map.Entry entry : hashMap2.entrySet()) {
                    Object value = entry.getValue();
                    A05.A0d((String) entry.getKey());
                    A05.A0M(value);
                }
                for (Map.Entry entry2 : hashMap3.entrySet()) {
                    Object value2 = entry2.getValue();
                    A05.A0d((String) entry2.getKey());
                    A05.A0M(value2);
                }
                A05.A0Q();
            }
            A05.A0P();
            A05.close();
            A002.A4F("children_metadata", stringWriter.toString());
        }
        if (((Boolean) AnonymousClass0L6.A02(r12, AnonymousClass0L7.GEO_GATING, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() && C16180oA.A00(r12).A0o(IgReactGeoGatingModule.SETTING_TYPE_FEED)) {
            C160416ss.A05(A002, new C160496t0(C16180oA.A00(r12).A06(IgReactGeoGatingModule.SETTING_TYPE_FEED)));
        }
        return A002.A04();
    }

    public final /* bridge */ /* synthetic */ Object A73(PendingMedia pendingMedia) {
        return new AnonymousClass4UR(this, pendingMedia);
    }

    public final ShareType AVv() {
        return ShareType.FOLLOWERS_SHARE;
    }

    public final int AX9() {
        return this.A00;
    }

    public final boolean Aem() {
        return this.A01;
    }

    public final AnonymousClass1NJ BPV(AnonymousClass0C1 r2, PendingMedia pendingMedia, C28691Ms r4, Context context) {
        return ((C158786qC) r4).A00;
    }

    public final C28691Ms BWq(AnonymousClass0C1 r2, C33861dc r3) {
        return (C28691Ms) new C158736q7(this, r2).then(r3);
    }

    public final void BXX(AnonymousClass0C1 r8, PendingMedia pendingMedia, C155546ka r10) {
        AnonymousClass1NJ r6 = pendingMedia.A0d;
        if (pendingMedia.A0q()) {
            List A0J = pendingMedia.A0J();
            if (A0J.size() != r6.A07()) {
                AnonymousClass0QD.A01("carousel_upload_size_mismatch", C06360Ot.formatString("pending media count:%d, uploaded media count:%d", Integer.valueOf(A0J.size()), Integer.valueOf(r6.A07())));
            }
            for (int i = 0; i < r6.A07(); i++) {
                r10.A01((PendingMedia) A0J.get(i), r6.A0P(i), false);
            }
        } else {
            r10.A01(pendingMedia, r6, false);
        }
        C13300iJ A0c = r6.A0c(r8);
        A0c.A0E();
        if (A0c.A1k.intValue() == 1) {
            C13510ie.A00(r8).A03(A0c);
        } else {
            A0c.A0F(r8);
        }
        C23300zv.A00(r8).BXT(new C31091Wk(pendingMedia));
        r10.A00(pendingMedia);
    }

    public final void Bgg(boolean z) {
        this.A01 = z;
    }

    public final void Bkp(int i) {
        this.A00 = i;
    }
}
