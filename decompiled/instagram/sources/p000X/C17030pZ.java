package p000X;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.MicroUser;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0pZ  reason: invalid class name and case insensitive filesystem */
public final class C17030pZ extends C17020pY {
    public final C17040pa A00;

    public final C17850qu A07(AnonymousClass0C1 r5, String str) {
        String A05 = C06360Ot.formatString("feed/user/%s/story_and_info/", str);
        C15890nh r1 = new C15890nh(r5);
        r1.A09 = Constants.A0N;
        r1.A0C = A05;
        r1.A06(AnonymousClass8LY.class, false);
        return r1.A03();
    }

    public final void A0a(AnonymousClass0C1 r9, Activity activity, AnonymousClass1HD r11, AnonymousClass1NJ r12, boolean z, String str) {
        AnonymousClass0C1 r2 = r9;
        AnonymousClass4JZ.A00(activity, C65302ss.A01(r12), new C1187057o(r2, activity, r11, r12, z, str));
    }

    public final int A04() {
        return C27141Gq.A01;
    }

    public final C17850qu A05(AnonymousClass0C1 r4) {
        C15890nh r2 = new C15890nh(r4);
        r2.A09 = Constants.A0N;
        r2.A0C = "users/reel_settings/";
        r2.A06(C76763Xe.class, false);
        return r2.A03();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b4, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A03(r7, r2, "viewer_tray_is_viewer_tray_enabled_for_non_modal", false, (p000X.AnonymousClass04H) null)).booleanValue() != false) goto L_0x01b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02b1  */
    public final C17850qu A06(AnonymousClass0C1 r14, Integer num, Integer num2, boolean z, C17750qk r18) {
        boolean z2;
        C05770Lw A002;
        C16230oG r0;
        Location lastLocation;
        boolean z3;
        ArrayList<Reel> arrayList;
        C15890nh r4 = new C15890nh(r14, 197);
        r4.A09 = Constants.ONE;
        r4.A0C = "feed/reels_tray/";
        r4.A06 = new C22930zG(C22960zJ.class, new AnonymousClass0IZ(r14));
        r4.A0B = "feed/reels_tray/_v1";
        r4.A08 = num;
        C17750qk r02 = r18;
        if (r18 != null) {
            r4.A04 = r02;
        }
        r4.A09("reason", C22980zL.A00(num2));
        r4.A09("timezone_offset", Long.toString(C15960no.A00().longValue()));
        boolean z4 = z;
        if (z) {
            r4.A09("bg", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            r4.A0A = Constants.ZERO;
        }
        C23000zN.A05(r4, r14, z4);
        if (((Boolean) AnonymousClass0L6.A02(r14, AnonymousClass0L7.STORIES_SEND_CLIENT_REELS_ON_TRAY_FETCH, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            List A0M = ReelStore.A02(r14).A0M(false);
            int intValue = ((Integer) AnonymousClass0L6.A02(r14, AnonymousClass0L7.STORIES_SEND_CLIENT_REELS_ON_TRAY_FETCH, "num_reels_to_send", 10, (AnonymousClass04H) null)).intValue();
            if (!A0M.isEmpty()) {
                arrayList = new ArrayList<>();
                Iterator it = A0M.iterator();
                while (it.hasNext() && arrayList.size() < intValue) {
                    Reel reel = (Reel) it.next();
                    if (!reel.A0x && !reel.A0m(r14) && reel.A0i(r14)) {
                        arrayList.add(reel);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                try {
                    StringWriter stringWriter = new StringWriter();
                    C13460iZ A05 = C12890hY.A00.A05(stringWriter);
                    A05.A0S();
                    for (Reel reel2 : arrayList) {
                        A05.A0T();
                        A05.A0H("reel_id", reel2.getId());
                        A05.A0G("timestamp", reel2.A03);
                        AnonymousClass0L7 r8 = AnonymousClass0L7.STORIES_SEND_CLIENT_REELS_ON_TRAY_FETCH;
                        if (((Boolean) AnonymousClass0L6.A02(r14, r8, "send_materialized_media_only", false, (AnonymousClass04H) null)).booleanValue()) {
                            A05.A0F("media_count", reel2.A0J(r14).size());
                        } else if (((Boolean) AnonymousClass0L6.A02(r14, r8, "send_materialized_media_ids", false, (AnonymousClass04H) null)).booleanValue()) {
                            ArrayList arrayList2 = new ArrayList();
                            for (C39941no r03 : reel2.A0J(r14)) {
                                AnonymousClass1NJ r04 = r03.A08;
                                if (r04 != null) {
                                    arrayList2.add(r04.getId());
                                }
                            }
                            A05.A0H("media_ids", C23000zN.A04(arrayList2));
                        } else {
                            Integer num3 = reel2.A0R;
                            if (num3 != null) {
                                A05.A0F("media_count", num3.intValue());
                            }
                        }
                        A05.A0Q();
                    }
                    A05.A0P();
                    A05.close();
                    r4.A09("latest_preloaded_reel_ids", stringWriter.toString());
                } catch (IOException unused) {
                    AnonymousClass0QD.A01("ReelApiUtil.createReelsTrayRequestTask", "IOException");
                }
            }
        }
        C23020zP A003 = C23020zP.A00(r14);
        if (!A003.A03() && !A003.A04()) {
            AnonymousClass0C1 r7 = A003.A06;
            AnonymousClass0L7 r2 = AnonymousClass0L7.STORIES_TRAY_RANKING_EXPERIMENTS;
            if (!((Boolean) AnonymousClass0L6.A03(r7, r2, "viewer_tray_is_viewer_tray_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                z3 = false;
            }
            z3 = true;
            if (!z3) {
                z2 = ((Boolean) AnonymousClass0L6.A02(A003.A06, AnonymousClass0L7.STORIES_TRAY_PAGINATION, "tray_pagination_is_enabled", false, (AnonymousClass04H) null)).booleanValue();
                if (z2) {
                    r4.A09("page_size", String.valueOf((Integer) AnonymousClass0L6.A02(r14, AnonymousClass0L7.STORIES_TRAY_PAGINATION, "tray_pagination_first_page_size", 25, (AnonymousClass04H) null)));
                }
                if (!(!((Boolean) AnonymousClass0L6.A02(r14, AnonymousClass0L7.LOCATION_IN_REELS_TRAY_REQUEST, "is_enabled", false, (AnonymousClass04H) null)).booleanValue() || (r0 = C16230oG.A00) == null || (lastLocation = r0.getLastLocation(r14)) == null)) {
                    r4.A09("lat", Double.toString(lastLocation.getLatitude()));
                    r4.A09("lng", Double.toString(lastLocation.getLongitude()));
                }
                A002 = C05770Lw.A00();
                if (A002.A0J()) {
                    r4.A09("tray_injection", "enabled");
                    if (A002.A00.getBoolean("force_new_nux_reel", false)) {
                        r4.A09("inject_nux", "true");
                    }
                    if (A002.A00.getBoolean("force_mock_post_live_reel", false)) {
                        r4.A09("inject_post_live", "true");
                    }
                    if (A002.A00.getBoolean("force_mock_close_friends_reel", false)) {
                        r4.A09("inject_bestie_reel", "true");
                    }
                    if (A002.A00.getBoolean("force_mock_empty_reel", false)) {
                        r4.A09("inject_empty_reel", "true");
                    }
                    if (A002.A00.getBoolean("force_mock_large_reel", false)) {
                        r4.A09("inject_large_reel", "true");
                    }
                    if (A002.A00.getBoolean("force_mock_many_large_reels", false)) {
                        r4.A09("inject_many_large_reels", "true");
                    }
                }
                Pair A004 = C23040zR.A00(r14);
                r4.A0A((String) A004.first, (String) A004.second);
                if (((Boolean) AnonymousClass0L6.A02(r14, AnonymousClass0L7.REPLAY_SAFE, "reel_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    r4.A0H = true;
                }
                return r4.A03();
            }
        }
        z2 = false;
        if (z2) {
        }
        r4.A09("lat", Double.toString(lastLocation.getLatitude()));
        r4.A09("lng", Double.toString(lastLocation.getLongitude()));
        A002 = C05770Lw.A00();
        if (A002.A0J()) {
        }
        Pair A0042 = C23040zR.A00(r14);
        r4.A0A((String) A0042.first, (String) A0042.second);
        if (((Boolean) AnonymousClass0L6.A02(r14, AnonymousClass0L7.REPLAY_SAFE, "reel_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
        }
        return r4.A03();
    }

    public final C17850qu A08(AnonymousClass0C1 r5, List list, long j) {
        C15890nh r3 = new C15890nh(r5);
        r3.A09 = Constants.ONE;
        r3.A0C = "feed/reels_tray/";
        r3.A06 = new C22930zG(C22960zJ.class, new AnonymousClass0IZ(r5));
        C23000zN.A05(r3, r5, false);
        r3.A09("reason", C22980zL.A00(Constants.A0Y));
        r3.A09("current_highest_ranked_position", String.valueOf(j));
        r3.A09("reel_ids_to_fetch", C23000zN.A04(list));
        return r3.A03();
    }

    public final C17850qu A09(AnonymousClass0C1 r4, List list, List list2) {
        C15890nh r2 = new C15890nh(r4);
        r2.A09 = Constants.ONE;
        r2.A0C = "feed/get_latest_reel_media/";
        r2.A06(AnonymousClass4Px.class, false);
        r2.A09("user_ids", C23000zN.A04(list));
        r2.A09("thread_ids", C23000zN.A04(list2));
        return r2.A03();
    }

    public final C17850qu A0A(String str, AnonymousClass0C1 r7) {
        Integer num = Constants.ZERO;
        String A05 = C06360Ot.formatString("feed/user/%s/story/", str);
        C15890nh r2 = new C15890nh(r7);
        r2.A09 = Constants.A0N;
        r2.A0C = A05;
        r2.A08 = num;
        r2.A06(C51842Mi.class, false);
        if (num != num) {
            r2.A0B = AnonymousClass000.A0J(A05, "_", "v1");
        }
        Pair A002 = C23040zR.A00(r7);
        r2.A0A((String) A002.first, (String) A002.second);
        return r2.A03();
    }

    public final C37121j9 A0C(AnonymousClass0C1 r8, String str, String str2, Reel reel, int i, int i2) {
        return new C66312vH(r8, str, str2, reel, i, i2);
    }

    public final C28971Oc A0G(AnonymousClass0C1 r2, AnonymousClass0RN r3, String str) {
        C28961Ob r0 = new C28961Ob();
        r0.A01 = r2;
        r0.A00 = r3;
        r0.A02 = str;
        return r0.A00();
    }

    public final C64872sB A0H(AnonymousClass0C1 r2) {
        return new C64862sA(r2);
    }

    public final AnonymousClass1WN A0I(AnonymousClass1HD r2, AnonymousClass0C1 r3, AnonymousClass1D1 r4) {
        return new AnonymousClass1WN(r3, r2, r4);
    }

    public final C17040pa A0J() {
        return this.A00;
    }

    public final C64922sG A0K() {
        return new C64912sF();
    }

    public final C476324u A0N(Context context, AnonymousClass2E0 r9, Reel reel, AnonymousClass0C1 r11, C51472Ku r12, String str) {
        return new C476324u(context, r9, reel, r11, r12, str);
    }

    public final C39711nM A0O(AnonymousClass0C1 r3) {
        return (C39711nM) r3.AVA(C39711nM.class, new C39721nN());
    }

    public final AnonymousClass5MN A0P(AnonymousClass0C1 r3) {
        return (AnonymousClass5MN) r3.AVA(AnonymousClass5MN.class, new AnonymousClass5MO());
    }

    public final C73053Ie A0R() {
        C73053Ie r0;
        synchronized (C73053Ie.class) {
            if (C73053Ie.A01 == null) {
                C73053Ie.A01 = new C73053Ie();
            }
            r0 = C73053Ie.A01;
        }
        return r0;
    }

    public final C34071dx A0U(Activity activity, ViewGroup viewGroup, AnonymousClass0C1 r4) {
        if (viewGroup == null) {
            return A0V(activity, r4);
        }
        return C34071dx.A07(activity, viewGroup, r4);
    }

    public final C34071dx A0W(String str) {
        return (C34071dx) C34071dx.A0w.get(str);
    }

    public final C34091e1 A0X(Context context, AnonymousClass0C1 r3) {
        if (C34091e1.A04 == null) {
            C34091e1 r0 = new C34091e1(context, r3);
            C34091e1.A04 = r0;
            context.registerComponentCallbacks(r0);
        }
        return C34091e1.A04;
    }

    public final void A0Y() {
        try {
            ArrayList<C17220ps> arrayList = new ArrayList<>();
            arrayList.add(new C17220ps(new C17060pc("reels_send_chat_sticker_join_request", C17080pe.A02, new C17150pl(new C17130pj()), new AnonymousClass09F(new C17170pn("reels_send_chat_sticker_join_request")))));
            C17060pc r5 = new C17060pc("reels_send_poll_vote", C17240pu.A06, new C17150pl(new C17260pw()), new AnonymousClass09F(new C17170pn("reels_send_poll_vote")));
            r5.A04 = new C17270px();
            arrayList.add(new C17220ps(r5));
            C17060pc r52 = new C17060pc("reels_send_question_text_response", C17280py.A05, new C17150pl(new C17310q1()), new AnonymousClass09F(new C17170pn("reels_send_question_text_response")));
            r52.A02 = C17320q2.A00;
            C17060pc r53 = new C17060pc("reels_send_question_music_response", C17330q4.A05, new C17150pl(new C17350q6()), new AnonymousClass09F(new C17170pn("reels_send_question_music_response")));
            r53.A02 = C17320q2.A00;
            arrayList.addAll(Arrays.asList(new C17220ps[]{new C17220ps(r52), new C17220ps(r53)}));
            arrayList.add(new C17220ps(new C17060pc("reels_send_group_poll_vote", C17360q7.A03, new C17150pl(new C17380q9()), new AnonymousClass09F(new C17170pn("reels_send_group_poll_vote")))));
            for (C17220ps A01 : arrayList) {
                C17390qA.A01(A01);
            }
        } catch (C45391xn e) {
            AnonymousClass0DB.A0I("ReelsPluginImpl", "initialized more than once", e);
        }
    }

    public final void A0Z(Activity activity) {
        int i = C34581ey.A00;
        if (i != -1) {
            C27141Gq.A01(activity, i);
            C27141Gq.A01(activity, C34581ey.A00);
        }
    }

    public final void A0b(AnonymousClass0C1 r5, Activity activity, String str, AnonymousClass24Q r8, MicroUser microUser) {
        Bundle bundle = new Bundle();
        try {
            StringWriter stringWriter = new StringWriter();
            C13460iZ A05 = C12890hY.A00.A05(stringWriter);
            AnonymousClass24P.A00(A05, r8);
            A05.close();
            bundle.putString("ReelCountdownShareConstants.ARGUMENTS_KEY_COUNTDOWN_STICKER_MODEL_JSON", stringWriter.toString());
            bundle.putString("ReelCountdownShareConstants.ARGUMENTS_KEY_CAMERA_ENTRY_POINT", str);
            if (microUser != null) {
                bundle.putString("ReelCountdownShareConstants.ARGUMENTS_KEY_COUNTDOWN_STICKER_CREATOR_USER_ID", microUser.A03);
            }
            C59032gv.A00(r5, TransparentModalActivity.class, "reel_countdown_reshare", bundle, activity).A06(activity);
        } catch (IOException unused) {
            AnonymousClass0QD.A02("ReelCountdownShareHelper", "Could not parse json CountdownStickerModel for countdown re-share.");
        }
    }

    public C17030pZ(C17040pa r1) {
        this.A00 = r1;
    }

    public final C17850qu A0B(Set set, Map map, AnonymousClass0C1 r4, String str) {
        return C23000zN.A03(set, map, r4, str);
    }

    public final Reel A0D(AnonymousClass0C1 r2, C13300iJ r3) {
        return C38271l0.A02(r2, r3);
    }

    public final Reel A0E(AnonymousClass0C1 r2, C13300iJ r3) {
        return C38271l0.A01(r2, r3);
    }

    public final Reel A0F(AnonymousClass0C1 r7, C13300iJ r8, Long l) {
        if (!C38271l0.A09(r7, r8) || l == null || Reel.A06(l) || C35891h6.A00(r7).A02(r8.getId()) >= l.longValue()) {
            return null;
        }
        return ReelStore.A02(r7).A0I(r8.getId(), new C249816v(r8), false);
    }

    public final AnonymousClass2E0 A0L(AnonymousClass0C1 r2) {
        return AnonymousClass2E0.A00(r2);
    }

    public final C31591Yx A0M(AnonymousClass0C1 r2) {
        return C31591Yx.A00(r2);
    }

    public final ReelStore A0Q(AnonymousClass0C1 r2) {
        return ReelStore.A02(r2);
    }

    public final C250016x A0S(AnonymousClass0C1 r2) {
        return C250016x.A01(r2);
    }

    public final C34071dx A0T(Activity activity) {
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        return (C34071dx) ((ViewGroup) activity.findViewById(16908290)).getTag(C0003R.C0005id.reel_viewer_animator);
    }

    public final C34071dx A0V(Activity activity, AnonymousClass0C1 r3) {
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        return C34071dx.A07(activity, (ViewGroup) activity.findViewById(16908290), r3);
    }

    public final void A0d(AnonymousClass0C1 r5, String str, List list, C99014Pz r8) {
        ReelStore A02 = ReelStore.A02(r5);
        String str2 = r8.A02;
        C38271l0.A06(r5, A02.A0I(str2, new C51242Jv(AnonymousClass000.A0E("group:", str2), str, list), false), r8.A00, r8.A01, (Long) null);
    }

    public final boolean A0e(AnonymousClass0C1 r3, C13300iJ r4) {
        if (C38271l0.A01(r3, r4) != null) {
            return true;
        }
        return false;
    }

    public final boolean A0f(Object obj) {
        return obj instanceof C35551gY;
    }

    public final boolean A0g(Object obj) {
        return obj instanceof AnonymousClass1ZO;
    }

    public final void A0c(AnonymousClass0C1 r1, Reel reel, int i, AnonymousClass1OY r4) {
        C50272Fq.A01(r1, reel, i, r4);
    }
}
