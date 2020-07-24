package p000X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.notifications.push.IgPushRegistrationService;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.0oy  reason: invalid class name and case insensitive filesystem */
public final class C16670oy {
    public static C16670oy A03;
    public static final HashMap A04 = new HashMap();
    public final C16620ot A00;
    public final C92803zk A01;
    public final C33251cc A02;

    public final void A08(Intent intent, PushChannelType pushChannelType, String str) {
        C42861tN A002;
        C42861tN r2 = null;
        if (!(intent == null || !intent.hasExtra("data") || (A002 = C42861tN.A00(intent.getStringExtra("data"), str)) == null)) {
            if (A002.A03 == null) {
                String stringExtra = intent.getStringExtra("collapse_key");
                if (stringExtra == null) {
                    stringExtra = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                }
                A002.A03 = stringExtra;
            }
            r2 = A002;
        }
        A09(r2, intent.getStringExtra("message_type"), pushChannelType);
    }

    private Intent A00(Context context, String str, String str2, PushChannelType pushChannelType, int i, boolean z) {
        Intent intent = new Intent(context, IgPushRegistrationService.class);
        intent.putExtra("PushRegistrationService.GUID", C05860Mt.A02.A05(context));
        intent.putExtra("PushRegistrationService.DEVICE_TOKEN", str);
        intent.putExtra("PushRegistrationService.PUSH_DEVICE_TYPE", pushChannelType);
        intent.putExtra("PushRegistrationService.PUSH_CHANNEL_TYPE", pushChannelType.A01);
        intent.putExtra("PushRegistrationService.IS_MAIN_PUSH_CHANNEL", z);
        intent.putExtra("PushRegistrationService.PUSH_DEVICE_SUB_TYPE", i);
        intent.putExtra("PushRegistrationService.USER_ID", str2);
        C06590Pq A012 = AnonymousClass0J1.A01(this);
        Iterable arrayList = new ArrayList();
        if (A012.AgN()) {
            arrayList = C05210Iq.A02(A012).A05.A04((String) null);
        }
        intent.putExtra("PushRegistrationService.LOGGED_IN_USERS", C36681iR.A00(',').A03(arrayList));
        return intent;
    }

    public static C16670oy A01() {
        if (A03 == null) {
            A03 = new C16670oy(C33251cc.A01(), C16620ot.A01(), new C33271ce());
        }
        return A03;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004a  */
    public static void A02(C16670oy r11, C16660ox r12, String str, C42861tN r14, C06590Pq r15, Runnable runnable) {
        String str2;
        String str3;
        boolean z;
        Context context = StoredPreferences.A00;
        C06590Pq r6 = r15;
        C254518v.A0I(context, r15, C254518v.A0P(context, r15));
        String AHu = r12.AHu();
        C42861tN r9 = r14;
        String str4 = str;
        C33211cY r1 = new C33211cY(AHu, str, r14.A08);
        AnonymousClass0P4 A002 = C49452Ch.A00(r14, "notification_suppressed");
        if (RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(AHu)) {
            str2 = AnonymousClass3LJ.A00(str);
        } else {
            str2 = null;
        }
        Context context2 = StoredPreferences.A00;
        Integer A022 = C254518v.A02(context2, C254518v.A04(context2, AHu, r14.A0B, r14.A03, str2), r14.A0C, r15);
        boolean z2 = true;
        if (A022 == Constants.ONE) {
            str3 = "app notification disabled";
        } else if (A022 == Constants.A0N) {
            str3 = "notification channel disabled";
        } else {
            String str5 = r14.A0B;
            if ("force_logout_login_help".equals(str5)) {
                z2 = !AnonymousClass5EG.A01(r15);
                if (z2) {
                    A002.A0G("reason", "no room left");
                    A002.A0A("multitap_enabled", (Boolean) C05640Lj.A01(AnonymousClass0L7.MULTI_TAP_LOGIN_NEW, "enabled", false));
                }
            } else {
                if (!"ig_shopping_drops".equals(str5)) {
                    boolean AgN = r15.AgN();
                    if (AgN && C23300zv.A00(r15).A04(r1)) {
                        str3 = "handled";
                    } else if ("silent_push".equals(r14.A0B)) {
                        str3 = "silent push";
                    } else if (TextUtils.isEmpty(r14.A09)) {
                        str3 = "empty message";
                    } else if (!AgN) {
                        str3 = "no authenticated session";
                    }
                }
                z2 = false;
            }
            Runnable runnable2 = runnable;
            if (!z2) {
                AnonymousClass0WN.A01(r15).BcG(A002);
                if (runnable != null) {
                    runnable2.run();
                }
                z = true;
            } else {
                r11.A00.A02(r6, AHu, str4, r9, runnable2);
                z = false;
            }
            r12.BDA(r14, str, C05210Iq.A03(r15), z);
        }
        A002.A0G("reason", str3);
        Runnable runnable22 = runnable;
        if (!z2) {
        }
        r12.BDA(r14, str, C05210Iq.A03(r15), z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r6.size() > 2) goto L_0x0015;
     */
    public static void A03(C16670oy r5, List list) {
        boolean z;
        AnonymousClass1A3.A01.A00();
        if (list.size() >= 1) {
            z = true;
        }
        z = false;
        AnonymousClass0a4.A09(z);
        String str = (String) list.get(0);
        if (list.size() == 2) {
            r5.A00.A04(str, (String) list.get(1));
            return;
        }
        C16620ot r3 = r5.A00;
        C16710p2 A002 = C16620ot.A00(r3, str);
        if (A002 != null) {
            r3.A00.ADc(new C24488AoV(r3, A002));
        }
    }

    public static void A04(String str, C16660ox r2) {
        A04.put(str, r2);
    }

    public final void A05() {
        C16620ot r2 = this.A00;
        r2.A00.ADc(new C24486AoT(r2));
        AnonymousClass0QA.A00.A01(this.A02);
        C33251cc.A08 = null;
        C41951rF.A00().BA0();
        A03 = null;
    }

    public final void A07(Context context, String str, PushChannelType pushChannelType, int i, boolean z) {
        LinkedList<Intent> linkedList = new LinkedList<>();
        C06590Pq A012 = AnonymousClass0J1.A01(this);
        String str2 = str;
        Context context2 = context;
        PushChannelType pushChannelType2 = pushChannelType;
        boolean z2 = z;
        int i2 = i;
        linkedList.add(A00(context2, str2, C05210Iq.A05(A012), pushChannelType2, i2, z2));
        if (A012.AgN()) {
            C239512q A0I = ImmutableList.A09(((C60482jy) C05210Iq.A02(A012).AVA(C60482jy.class, new C60492jz())).A00).iterator();
            while (A0I.hasNext()) {
                linkedList.add(A00(context2, str2, (String) A0I.next(), pushChannelType2, i2, z2));
            }
        }
        for (Intent enqueueWork : linkedList) {
            try {
                AnonymousClass00Y.enqueueWork(context, IgPushRegistrationService.class, 2, enqueueWork);
            } catch (IllegalArgumentException e) {
                if (e.getMessage().startsWith("No such service ComponentInfo")) {
                    AnonymousClass0QD.A07("PushNotificationManager_no_such_service", "Got no such service error", e);
                } else {
                    throw e;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0153, code lost:
        if (r0.isEmpty() != false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0157, code lost:
        if (r1 == false) goto L_0x0159;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    public final void A09(C42861tN r23, String str, PushChannelType pushChannelType) {
        boolean z;
        boolean add;
        boolean z2;
        boolean z3;
        C16660ox r0;
        C42861tN r6 = r23;
        AnonymousClass1A3.A01.A00();
        AnonymousClass0P4 A002 = C49452Ch.A00(r6, "push_notification_received");
        A002.A0G("push_channel_type", pushChannelType.name());
        if (r23 == null) {
            A002.A0G("bad_payload", AnonymousClass000.A0E("empty notification : ", str));
        } else if (r6.A09 == null) {
            A002.A0G("bad_payload", "missing message");
        }
        C42861tN r3 = null;
        if (((Boolean) C05640Lj.A00(AnonymousClass0L7.OS_VERSION_BLOCKING_CONFIG, "is_enabled", false)).booleanValue()) {
            A002.A0G("suppressed_reason", "os_version_blocking");
            r6 = null;
        }
        C06590Pq A012 = AnonymousClass0J1.A01(this);
        if (r6 != null) {
            if (C49462Ci.A00.contains(r6.A0B)) {
                A002.A0A("logged_out", true);
                if (C05210Iq.A00(A012).Ady(r6.A08)) {
                    A002.A0G("notification_suppressed", "already_logged_in");
                    if (r3 != null) {
                        String str2 = r3.A0B;
                        String str3 = str2;
                        if (str2 != null && (str3.equals("ig_shopping_drops") || str3.equals("ig_shopping_drops_collection"))) {
                            z = true;
                            if (z) {
                                C06270Ok A003 = C06270Ok.A00();
                                A003.A09("landing_path", r3.A06);
                                A002.A08("extra_data", A003);
                            }
                            if (!(r3 == null || (r0 = (C16660ox) A04.get(r3.A03)) == null)) {
                                r0.A35(r3, A002);
                            }
                            AnonymousClass0WN.A01(A012).BcG(A002);
                            if (r3 == null) {
                                String str4 = r3.A0C;
                                C49482Ck r1 = (C49482Ck) this.A01.get();
                                synchronized (r1) {
                                    C49482Ck.A00(r1);
                                    add = r1.A02.add(str4);
                                }
                                if (add) {
                                    AnonymousClass2G6 r4 = new AnonymousClass2G6(this, r1, str4);
                                    String str5 = r3.A03;
                                    C06590Pq A013 = AnonymousClass0J1.A01(this);
                                    AnonymousClass0C1 A032 = C05210Iq.A03(A013);
                                    C16660ox r11 = (C16660ox) A04.get(str5);
                                    if (r11 == null) {
                                        r11 = (C16660ox) A04.get(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                                        AnonymousClass0a4.A06(r11);
                                    }
                                    String AZM = r11.AZM(r3);
                                    if (r11 instanceof C19140sz) {
                                        String str6 = r3.A0D;
                                        if (str6 != null) {
                                            z3 = true;
                                        }
                                        z3 = false;
                                        z2 = true;
                                    }
                                    z2 = false;
                                    if (z2 || r11.BnE(r3, AZM, A032)) {
                                        C16620ot r2 = this.A00;
                                        String str7 = AZM;
                                        C16710p2 A004 = C16620ot.A00(r2, r11.AHu());
                                        if (A004 != null) {
                                            r2.A00.ADc(new C24485AoS(r2, A004, A013, str7, r3, r4));
                                        }
                                        r11.BD9(r3, AZM, A032);
                                    } else {
                                        r11.BnF(r3, AZM, A013, new AnonymousClass2G7(this, r11, r3, A032, AZM, A013, r4));
                                    }
                                    if (A012.AgN() && !r3.A08.equals(C05210Iq.A02(A012).A04())) {
                                        C11130eT.A01.BXT(new C33591dA());
                                        return;
                                    }
                                    return;
                                }
                                AnonymousClass0WN.A01(A012).BcG(C49452Ch.A00(r3, "duplicate_dropped"));
                                return;
                            }
                            return;
                        }
                    }
                    z = false;
                    if (z) {
                    }
                    r0.A35(r3, A002);
                    AnonymousClass0WN.A01(A012).BcG(A002);
                    if (r3 == null) {
                    }
                }
            } else {
                String str8 = r6.A08;
                if (!str8.equals(C05210Iq.A05(A012)) && A012.AgN() && !C05210Iq.A02(A012).A05.A04((String) null).contains(str8)) {
                    A002.A0A("mismatch", true);
                    if (r3 != null) {
                    }
                    z = false;
                    if (z) {
                    }
                    r0.A35(r3, A002);
                    AnonymousClass0WN.A01(A012).BcG(A002);
                    if (r3 == null) {
                    }
                }
            }
        }
        r3 = r6;
        if (r3 != null) {
        }
        z = false;
        if (z) {
        }
        r0.A35(r3, A002);
        AnonymousClass0WN.A01(A012).BcG(A002);
        if (r3 == null) {
        }
    }

    public C16670oy(C33251cc r2, C16620ot r3, AnonymousClass0IT r4) {
        this.A02 = r2;
        AnonymousClass0QA.A00.A00(r2);
        this.A00 = r3;
        this.A01 = AnonymousClass8AL.A00(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0071, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A00(r9, p000X.AnonymousClass0L7.ON_NOTIFICATION_CLEARED_ASYNC, "enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() != false) goto L_0x0073;
     */
    public final void A06(Context context, C06590Pq r9, Intent intent) {
        boolean z;
        Uri data = intent.getData();
        AnonymousClass0a4.A09("ig".equals(data.getScheme()));
        AnonymousClass0a4.A09("notif".equals(data.getAuthority()));
        String stringExtra = intent.getStringExtra("push_id");
        String stringExtra2 = intent.getStringExtra("push_category");
        AnonymousClass0P4 A012 = C49452Ch.A01("notification_dismissed", intent.getStringExtra("landing_path"));
        if (stringExtra != null) {
            A012.A0G("pi", stringExtra);
            A012.A0I("push_ids", Collections.singletonList(stringExtra));
        }
        if (stringExtra2 != null) {
            A012.A0G("push_category", stringExtra2);
        }
        AnonymousClass0WN.A01(r9).BcG(A012);
        List<String> pathSegments = data.getPathSegments();
        if (!C06080Nr.A09(context)) {
            z = false;
        }
        z = true;
        if (z) {
            C05700Lp.A00().ADc(new C91673xv(this, pathSegments));
        } else {
            A03(this, pathSegments);
        }
    }
}
