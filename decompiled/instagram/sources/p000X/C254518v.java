package p000X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.C0003R;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.List;
import java.util.Map;

/* renamed from: X.18v  reason: invalid class name and case insensitive filesystem */
public final class C254518v {
    public static final C254618w A00 = new C254618w(new C254718x());

    public static void A0D(Context context, NotificationManager notificationManager, Uri uri) {
        Context context2 = context;
        A0N("ig_threads_app_auto_status", "THREADSAPP", context.getResources().getString(C0003R.string.notif_channel_threads_app_auto_status), 2, 0, false, false, (Uri) null, 0, notificationManager);
        A0N("ig_threads_app", "THREADSAPP", context2.getResources().getString(C0003R.string.notif_channel_threads_app_notif), 4, C019000b.A00(context2, C0003R.color.blueteal_5), true, false, uri, 0, notificationManager);
    }

    public static boolean A0O(NotificationChannel notificationChannel) {
        return (notificationChannel == null || notificationChannel.getImportance() == 0) ? false : true;
    }

    public static NotificationChannel A00(Context context, String str) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            return notificationManager.getNotificationChannel(str);
        }
        AnonymousClass0QD.A01("NotificationChannelsHelper", "Unable to fetch the Notification Manager Service");
        return null;
    }

    public static Boolean A01(Context context, String str) {
        boolean A0O;
        if (Build.VERSION.SDK_INT < 26) {
            A0O = C06100Nt.A01(context);
        } else if (!C06100Nt.A01(context)) {
            A0O = false;
        } else {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                AnonymousClass0QD.A01("NotificationChannelsHelper", "Unable to fetch the Notification Manager Service");
                return null;
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
            if (notificationChannel == null) {
                return null;
            }
            A0O = A0O(notificationChannel);
        }
        return Boolean.valueOf(A0O);
    }

    public static Integer A02(Context context, String str, String str2, C06590Pq r7) {
        if (Build.VERSION.SDK_INT < 26) {
            return Constants.ZERO;
        }
        Integer num = Constants.A0C;
        if (!C06100Nt.A01(context)) {
            C54012Vk r1 = new C54012Vk(AnonymousClass0QT.A00(r7, A00.A00).A02("unable_to_notify_on_disabled_notifications"));
            r1.A08("pi", str2);
            r1.A01();
            return Constants.ONE;
        }
        NotificationChannel A002 = A00(context, str);
        if (A002 == null) {
            AnonymousClass0QD.A01("NotificationChannelsHelper", AnonymousClass000.A0E("Unable to fetch channel for channel id: ", str));
            return num;
        } else if (!A0O(A002)) {
            C54022Vl r2 = new C54022Vl(AnonymousClass0QT.A00(r7, A00.A00).A02("unable_to_notify_on_disabled_channel"));
            r2.A08("channel_id", str);
            r2.A08("pi", str2);
            r2.A01();
            return Constants.A0N;
        } else {
            AnonymousClass2G8 r22 = new AnonymousClass2G8(AnonymousClass0QT.A00(r7, A00.A00).A02("notification_created_successfully"));
            r22.A08("channel_id", str);
            r22.A08("pi", str2);
            r22.A01();
            return num;
        }
    }

    public static String A03(Context context, NotificationManager notificationManager, boolean z) {
        if (z) {
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup("IGTV", context.getString(C0003R.string.notif_group_igtv)));
            return "IGTV";
        }
        notificationManager.createNotificationChannelGroup(new NotificationChannelGroup("IG", context.getString(C0003R.string.notif_group_ig)));
        return "IG";
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v27 */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: type inference failed for: r1v38 */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r1v40 */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* JADX WARNING: type inference failed for: r1v43 */
    /* JADX WARNING: type inference failed for: r1v44 */
    /* JADX WARNING: type inference failed for: r1v45 */
    /* JADX WARNING: type inference failed for: r1v46 */
    /* JADX WARNING: type inference failed for: r1v47 */
    /* JADX WARNING: type inference failed for: r1v48 */
    /* JADX WARNING: type inference failed for: r1v49 */
    /* JADX WARNING: type inference failed for: r1v50 */
    /* JADX WARNING: type inference failed for: r1v51 */
    /* JADX WARNING: type inference failed for: r1v52 */
    /* JADX WARNING: type inference failed for: r1v53 */
    /* JADX WARNING: type inference failed for: r1v54 */
    /* JADX WARNING: type inference failed for: r1v55 */
    /* JADX WARNING: type inference failed for: r1v56 */
    /* JADX WARNING: type inference failed for: r1v57 */
    /* JADX WARNING: type inference failed for: r1v58 */
    /* JADX WARNING: type inference failed for: r1v59 */
    /* JADX WARNING: type inference failed for: r1v60 */
    /* JADX WARNING: type inference failed for: r1v61 */
    /* JADX WARNING: type inference failed for: r1v62 */
    /* JADX WARNING: type inference failed for: r1v63 */
    /* JADX WARNING: type inference failed for: r1v64 */
    /* JADX WARNING: type inference failed for: r1v65 */
    /* JADX WARNING: type inference failed for: r1v66 */
    /* JADX WARNING: type inference failed for: r1v67 */
    /* JADX WARNING: type inference failed for: r1v68 */
    /* JADX WARNING: type inference failed for: r1v69 */
    /* JADX WARNING: type inference failed for: r1v70 */
    /* JADX WARNING: type inference failed for: r1v71 */
    /* JADX WARNING: type inference failed for: r1v72 */
    /* JADX WARNING: type inference failed for: r1v73 */
    /* JADX WARNING: type inference failed for: r1v74 */
    /* JADX WARNING: type inference failed for: r1v75 */
    /* JADX WARNING: type inference failed for: r1v76 */
    /* JADX WARNING: type inference failed for: r1v77 */
    /* JADX WARNING: type inference failed for: r1v78 */
    /* JADX WARNING: type inference failed for: r1v79 */
    /* JADX WARNING: type inference failed for: r1v80 */
    /* JADX WARNING: type inference failed for: r1v81 */
    /* JADX WARNING: type inference failed for: r1v82 */
    /* JADX WARNING: type inference failed for: r1v83 */
    /* JADX WARNING: type inference failed for: r1v84 */
    /* JADX WARNING: type inference failed for: r1v85 */
    /* JADX WARNING: type inference failed for: r1v86 */
    /* JADX WARNING: type inference failed for: r1v87 */
    /* JADX WARNING: type inference failed for: r1v88 */
    /* JADX WARNING: type inference failed for: r1v89 */
    /* JADX WARNING: type inference failed for: r1v90 */
    /* JADX WARNING: type inference failed for: r1v91 */
    /* JADX WARNING: type inference failed for: r1v92 */
    /* JADX WARNING: type inference failed for: r1v93 */
    /* JADX WARNING: type inference failed for: r1v94 */
    /* JADX WARNING: type inference failed for: r1v95 */
    /* JADX WARNING: type inference failed for: r1v96 */
    /* JADX WARNING: type inference failed for: r1v97 */
    /* JADX WARNING: type inference failed for: r1v98 */
    /* JADX WARNING: type inference failed for: r1v99 */
    /* JADX WARNING: type inference failed for: r1v100 */
    /* JADX WARNING: type inference failed for: r1v101 */
    /* JADX WARNING: type inference failed for: r1v102 */
    /* JADX WARNING: type inference failed for: r1v103 */
    /* JADX WARNING: type inference failed for: r1v104 */
    /* JADX WARNING: type inference failed for: r1v105 */
    /* JADX WARNING: type inference failed for: r1v106 */
    /* JADX WARNING: type inference failed for: r1v107 */
    /* JADX WARNING: type inference failed for: r1v108 */
    /* JADX WARNING: type inference failed for: r1v109 */
    /* JADX WARNING: type inference failed for: r1v110 */
    /* JADX WARNING: type inference failed for: r1v111 */
    /* JADX WARNING: type inference failed for: r1v112 */
    /* JADX WARNING: type inference failed for: r1v113 */
    /* JADX WARNING: type inference failed for: r1v114 */
    /* JADX WARNING: type inference failed for: r1v115 */
    /* JADX WARNING: type inference failed for: r1v116 */
    /* JADX WARNING: type inference failed for: r1v117 */
    /* JADX WARNING: type inference failed for: r1v118 */
    /* JADX WARNING: type inference failed for: r1v119 */
    /* JADX WARNING: type inference failed for: r1v120 */
    /* JADX WARNING: type inference failed for: r1v121 */
    /* JADX WARNING: type inference failed for: r1v122 */
    /* JADX WARNING: type inference failed for: r1v123 */
    /* JADX WARNING: type inference failed for: r1v124 */
    /* JADX WARNING: type inference failed for: r1v125 */
    /* JADX WARNING: type inference failed for: r1v126 */
    /* JADX WARNING: type inference failed for: r1v127 */
    /* JADX WARNING: type inference failed for: r1v128 */
    /* JADX WARNING: type inference failed for: r1v129 */
    /* JADX WARNING: type inference failed for: r1v130 */
    /* JADX WARNING: type inference failed for: r1v131 */
    /* JADX WARNING: type inference failed for: r1v132 */
    /* JADX WARNING: type inference failed for: r1v133 */
    /* JADX WARNING: type inference failed for: r1v134 */
    /* JADX WARNING: type inference failed for: r1v135 */
    /* JADX WARNING: type inference failed for: r1v136 */
    /* JADX WARNING: type inference failed for: r1v137 */
    /* JADX WARNING: type inference failed for: r1v138 */
    /* JADX WARNING: type inference failed for: r1v139 */
    /* JADX WARNING: type inference failed for: r1v140 */
    /* JADX WARNING: type inference failed for: r1v141 */
    /* JADX WARNING: type inference failed for: r1v142 */
    /* JADX WARNING: type inference failed for: r1v143 */
    /* JADX WARNING: type inference failed for: r1v144 */
    /* JADX WARNING: type inference failed for: r1v145 */
    /* JADX WARNING: type inference failed for: r1v146 */
    /* JADX WARNING: type inference failed for: r1v147 */
    /* JADX WARNING: type inference failed for: r1v148 */
    /* JADX WARNING: type inference failed for: r1v149 */
    /* JADX WARNING: type inference failed for: r1v150 */
    /* JADX WARNING: type inference failed for: r1v151 */
    /* JADX WARNING: type inference failed for: r1v152 */
    /* JADX WARNING: type inference failed for: r1v153 */
    /* JADX WARNING: type inference failed for: r1v154 */
    /* JADX WARNING: type inference failed for: r1v155 */
    /* JADX WARNING: type inference failed for: r1v156 */
    /* JADX WARNING: type inference failed for: r1v157 */
    /* JADX WARNING: type inference failed for: r1v158 */
    /* JADX WARNING: type inference failed for: r1v159 */
    /* JADX WARNING: type inference failed for: r1v160 */
    /* JADX WARNING: type inference failed for: r1v161 */
    /* JADX WARNING: type inference failed for: r1v162 */
    /* JADX WARNING: type inference failed for: r1v163 */
    /* JADX WARNING: type inference failed for: r1v164 */
    /* JADX WARNING: type inference failed for: r1v165 */
    /* JADX WARNING: type inference failed for: r1v166 */
    /* JADX WARNING: type inference failed for: r1v167 */
    /* JADX WARNING: type inference failed for: r1v168 */
    /* JADX WARNING: type inference failed for: r1v169 */
    /* JADX WARNING: type inference failed for: r1v170 */
    /* JADX WARNING: type inference failed for: r1v171 */
    /* JADX WARNING: type inference failed for: r1v172 */
    /* JADX WARNING: type inference failed for: r1v173 */
    /* JADX WARNING: type inference failed for: r1v174 */
    /* JADX WARNING: type inference failed for: r1v175 */
    /* JADX WARNING: type inference failed for: r1v176 */
    /* JADX WARNING: type inference failed for: r1v177 */
    /* JADX WARNING: type inference failed for: r1v178 */
    /* JADX WARNING: type inference failed for: r1v179 */
    /* JADX WARNING: type inference failed for: r1v180 */
    /* JADX WARNING: type inference failed for: r1v181 */
    /* JADX WARNING: type inference failed for: r1v182 */
    /* JADX WARNING: type inference failed for: r1v183 */
    /* JADX WARNING: type inference failed for: r1v184 */
    /* JADX WARNING: type inference failed for: r1v185 */
    /* JADX WARNING: type inference failed for: r1v186 */
    /* JADX WARNING: type inference failed for: r1v187 */
    /* JADX WARNING: type inference failed for: r1v188 */
    /* JADX WARNING: type inference failed for: r1v189 */
    /* JADX WARNING: type inference failed for: r1v190 */
    /* JADX WARNING: type inference failed for: r1v191 */
    /* JADX WARNING: type inference failed for: r1v192 */
    /* JADX WARNING: type inference failed for: r1v193 */
    /* JADX WARNING: type inference failed for: r1v194 */
    /* JADX WARNING: type inference failed for: r1v195 */
    /* JADX WARNING: type inference failed for: r1v196 */
    /* JADX WARNING: type inference failed for: r1v197 */
    /* JADX WARNING: type inference failed for: r1v198 */
    /* JADX WARNING: type inference failed for: r1v199 */
    /* JADX WARNING: type inference failed for: r1v200 */
    /* JADX WARNING: type inference failed for: r1v201 */
    /* JADX WARNING: type inference failed for: r1v202 */
    /* JADX WARNING: type inference failed for: r1v203 */
    /* JADX WARNING: type inference failed for: r1v204 */
    /* JADX WARNING: type inference failed for: r1v205 */
    /* JADX WARNING: type inference failed for: r1v206 */
    /* JADX WARNING: type inference failed for: r1v207 */
    /* JADX WARNING: type inference failed for: r1v208 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static String A06(String str) {
        if (str != null) {
            ? r1 = -1;
            switch (str.hashCode()) {
                case -2137336791:
                    if (str.equals("mentioned_comment")) {
                        r1 = 31;
                        break;
                    }
                    break;
                case -2102919056:
                    if (str.equals("first_bestie_post")) {
                        r1 = 72;
                        break;
                    }
                    break;
                case -2087444809:
                    if (str.equals("live_broadcast_revoke")) {
                        r1 = 78;
                        break;
                    }
                    break;
                case -2047271981:
                    if (str.equals("story_mentions")) {
                        r1 = 45;
                        break;
                    }
                    break;
                case -2022783564:
                    if (str.equals("story_daily_digest")) {
                        r1 = 95;
                        break;
                    }
                    break;
                case -1953611308:
                    if (str.equals("password_change")) {
                        r1 = 169;
                        break;
                    }
                    break;
                case -1933150048:
                    if (str.equals("story_poll_vote")) {
                        r1 = 192;
                        break;
                    }
                    break;
                case -1885162274:
                    if (str.equals("new_business_follower")) {
                        r1 = 52;
                        break;
                    }
                    break;
                case -1857721452:
                    if (str.equals("twitter_contact_joined")) {
                        r1 = 67;
                        break;
                    }
                    break;
                case -1842994800:
                    if (str.equals("direct_v2_business_unread_reminder")) {
                        r1 = 7;
                        break;
                    }
                    break;
                case -1813565398:
                    if (str.equals("business_profile")) {
                        r1 = 131;
                        break;
                    }
                    break;
                case -1774504636:
                    if (str.equals("recap_digest")) {
                        r1 = 176;
                        break;
                    }
                    break;
                case -1757346357:
                    if (str.equals("hide_preview")) {
                        r1 = 158;
                        break;
                    }
                    break;
                case -1731345665:
                    if (str.equals("set_profile_photo")) {
                        r1 = 100;
                        break;
                    }
                    break;
                case -1695377065:
                    if (str.equals("direct_share_received")) {
                        r1 = 6;
                        break;
                    }
                    break;
                case -1677115218:
                    if (str.equals("promote_account")) {
                        r1 = 94;
                        break;
                    }
                    break;
                case -1674386166:
                    if (str.equals("find_friend_activity")) {
                        r1 = 150;
                        break;
                    }
                    break;
                case -1660159711:
                    if (str.equals("tagged_in_bio")) {
                        r1 = 46;
                        break;
                    }
                    break;
                case -1574027804:
                    if (str.equals("promote_first_photo")) {
                        r1 = 111;
                        break;
                    }
                    break;
                case -1569021109:
                    if (str.equals("follower_media_activity")) {
                        r1 = 151;
                        break;
                    }
                    break;
                case -1540609647:
                    if (str.equals("verification_code")) {
                        r1 = 204;
                        break;
                    }
                    break;
                case -1526685094:
                    if (str.equals("unseen_activity")) {
                        r1 = 101;
                        break;
                    }
                    break;
                case -1524232326:
                    if (str.equals("introduction_share")) {
                        r1 = 107;
                        break;
                    }
                    break;
                case -1486374397:
                    if (str.equals("copyright_video")) {
                        r1 = 139;
                        break;
                    }
                    break;
                case -1472568428:
                    if (str.equals("verify_email_for_recovery")) {
                        r1 = 206;
                        break;
                    }
                    break;
                case -1453616659:
                    if (str.equals("fb_ig_followee_on_fb_recently_joined")) {
                        r1 = 66;
                        break;
                    }
                    break;
                case -1386866553:
                    if (str.equals("story_producer_expire_media")) {
                        r1 = 96;
                        break;
                    }
                    break;
                case -1372693202:
                    if (str.equals("live_broadcast")) {
                        r1 = 79;
                        break;
                    }
                    break;
                case -1330197520:
                    if (str.equals("unsettled_ad_account")) {
                        r1 = 201;
                        break;
                    }
                    break;
                case -1307214883:
                    if (str.equals("new_follower")) {
                        r1 = 51;
                        break;
                    }
                    break;
                case -1306514533:
                    if (str.equals("introduction_confirm")) {
                        r1 = 104;
                        break;
                    }
                    break;
                case -1301259932:
                    if (str.equals("accounts_you_may_follow")) {
                        r1 = 117;
                        break;
                    }
                    break;
                case -1289541294:
                    if (str.equals("shopping_onboarding")) {
                        r1 = 184;
                        break;
                    }
                    break;
                case -1267790293:
                    if (str.equals("fb_contact_joined")) {
                        r1 = 64;
                        break;
                    }
                    break;
                case -1267331802:
                    if (str.equals("contact_point_changed")) {
                        r1 = 138;
                        break;
                    }
                    break;
                case -1265246962:
                    if (str.equals("ad_finished")) {
                        r1 = 122;
                        break;
                    }
                    break;
                case -1236050907:
                    if (str.equals("fb_ig_friend_request_pending_non_ig_followee")) {
                        r1 = 50;
                        break;
                    }
                    break;
                case -1217082036:
                    if (str.equals("vkontakte_contact_joined")) {
                        r1 = 68;
                        break;
                    }
                    break;
                case -1200082662:
                    if (str.equals("ad_rejected")) {
                        r1 = 124;
                        break;
                    }
                    break;
                case -1178005012:
                    if (str.equals("account_reactivated")) {
                        r1 = 119;
                        break;
                    }
                    break;
                case -1162687579:
                    if (str.equals("credit_card_expiring")) {
                        r1 = 87;
                        break;
                    }
                    break;
                case -1135564092:
                    if (str.equals("fb_ig_friend_request_pending")) {
                        r1 = 49;
                        break;
                    }
                    break;
                case -1126816384:
                    if (str.equals("nearby_business")) {
                        r1 = 167;
                        break;
                    }
                    break;
                case -1123646841:
                    if (str.equals("multi_author_story")) {
                        r1 = 166;
                        break;
                    }
                    break;
                case -1121527489:
                    if (str.equals("download_your_data")) {
                        r1 = 142;
                        break;
                    }
                    break;
                case -1106313727:
                    if (str.equals("bestie_added")) {
                        r1 = 59;
                        break;
                    }
                    break;
                case -1096306741:
                    if (str.equals("fb_friend_connected")) {
                        r1 = 65;
                        break;
                    }
                    break;
                case -971609053:
                    if (str.equals("video_call_incoming")) {
                        r1 = 27;
                        break;
                    }
                    break;
                case -954201959:
                    if (str.equals("account_privacy_change")) {
                        r1 = 118;
                        break;
                    }
                    break;
                case -925467783:
                    if (str.equals("two_factor_disabled")) {
                        r1 = 198;
                        break;
                    }
                    break;
                case -913036636:
                    if (str.equals("story_views")) {
                        r1 = 39;
                        break;
                    }
                    break;
                case -885025563:
                    if (str.equals("contact_joined_email")) {
                        r1 = 61;
                        break;
                    }
                    break;
                case -875002185:
                    if (str.equals("contact_joined_phone")) {
                        r1 = 62;
                        break;
                    }
                    break;
                case -818980110:
                    if (str.equals("follower_follow")) {
                        r1 = 91;
                        break;
                    }
                    break;
                case -808068321:
                    if (str.equals("follower_activity_with_location")) {
                        r1 = 90;
                        break;
                    }
                    break;
                case -769340174:
                    if (str.equals("comment_subscribed_on_like")) {
                        r1 = 34;
                        break;
                    }
                    break;
                case -756875122:
                    if (str.equals("branded_content_unwhitelisted")) {
                        r1 = 129;
                        break;
                    }
                    break;
                case -734481234:
                    if (str.equals("churn_reminders")) {
                        r1 = 85;
                        break;
                    }
                    break;
                case -697224731:
                    if (str.equals("hello_world")) {
                        r1 = 92;
                        break;
                    }
                    break;
                case -687634452:
                    if (str.equals("direct_v2_highlights_share")) {
                        r1 = 12;
                        break;
                    }
                    break;
                case -672464592:
                    if (str.equals("direct_v2_user_reaction")) {
                        r1 = 24;
                        break;
                    }
                    break;
                case -660535410:
                    if (str.equals("stories_question_response")) {
                        r1 = 187;
                        break;
                    }
                    break;
                case -632526634:
                    if (str.equals("first_reel_post")) {
                        r1 = 71;
                        break;
                    }
                    break;
                case -625626430:
                    if (str.equals("direct_v2_location")) {
                        r1 = 15;
                        break;
                    }
                    break;
                case -593662069:
                    if (str.equals("direct_raven_screenshot")) {
                        r1 = 5;
                        break;
                    }
                    break;
                case -591387640:
                    if (str.equals("contact_invite")) {
                        r1 = 137;
                        break;
                    }
                    break;
                case -562217912:
                    if (str.equals("contact_joined")) {
                        r1 = 60;
                        break;
                    }
                    break;
                case -547519719:
                    if (str.equals("direct_media_share_mention")) {
                        r1 = 2;
                        break;
                    }
                    break;
                case -511002940:
                    if (str.equals("post_first_photo")) {
                        r1 = 73;
                        break;
                    }
                    break;
                case -488751509:
                    if (str.equals("story_highlight_added")) {
                        r1 = 76;
                        break;
                    }
                    break;
                case -471625048:
                    if (str.equals("fb_ig_outstanding_fb_notifications")) {
                        r1 = 147;
                        break;
                    }
                    break;
                case -469118703:
                    if (str.equals("password_reset_phished")) {
                        r1 = 172;
                        break;
                    }
                    break;
                case -459046805:
                    if (str.equals("two_factor_enable_or_disable")) {
                        r1 = 199;
                        break;
                    }
                    break;
                case -445062908:
                    if (str.equals("media_comment")) {
                        r1 = 35;
                        break;
                    }
                    break;
                case -444918457:
                    if (str.equals("direct_v2_reel_share")) {
                        r1 = 22;
                        break;
                    }
                    break;
                case -420332607:
                    if (str.equals("direct_v2_reel_reaction")) {
                        r1 = 21;
                        break;
                    }
                    break;
                case -418198198:
                    if (str.equals("tag_follow_based_on_engagement")) {
                        r1 = 57;
                        break;
                    }
                    break;
                case -417336616:
                    if (str.equals("reinstate_after_appeal")) {
                        r1 = 179;
                        break;
                    }
                    break;
                case -390364013:
                    if (str.equals("password_reset_optimized")) {
                        r1 = 171;
                        break;
                    }
                    break;
                case -371953802:
                    if (str.equals("introduction_follow")) {
                        r1 = 106;
                        break;
                    }
                    break;
                case -366906995:
                    if (str.equals("media_created")) {
                        r1 = 163;
                        break;
                    }
                    break;
                case -323422923:
                    if (str.equals("follow_request_approved")) {
                        r1 = 47;
                        break;
                    }
                    break;
                case -307187846:
                    if (str.equals("gdpr_consent")) {
                        r1 = 153;
                        break;
                    }
                    break;
                case -290495150:
                    if (str.equals("hot_post")) {
                        r1 = 159;
                        break;
                    }
                    break;
                case -280283050:
                    if (str.equals("verify_email")) {
                        r1 = 205;
                        break;
                    }
                    break;
                case -267850458:
                    if (str.equals("resurrected_reel_post")) {
                        r1 = 74;
                        break;
                    }
                    break;
                case -224909781:
                    if (str.equals("direct_raven_replayed")) {
                        r1 = 4;
                        break;
                    }
                    break;
                case -198720596:
                    if (str.equals("ad_preview")) {
                        r1 = 123;
                        break;
                    }
                    break;
                case -187786581:
                    if (str.equals("password_reset")) {
                        r1 = 170;
                        break;
                    }
                    break;
                case -160912177:
                    if (str.equals("first_post")) {
                        r1 = 70;
                        break;
                    }
                    break;
                case -147112977:
                    if (str.equals("usertag")) {
                        r1 = 203;
                        break;
                    }
                    break;
                case -139282336:
                    if (str.equals("user_tagged")) {
                        r1 = 44;
                        break;
                    }
                    break;
                case -103857933:
                    if (str.equals("story_poll_result_share")) {
                        r1 = 191;
                        break;
                    }
                    break;
                case -97124431:
                    if (str.equals("school_email_confirmed")) {
                        r1 = 180;
                        break;
                    }
                    break;
                case -89002897:
                    if (str.equals("delta_checkpoint")) {
                        r1 = 141;
                        break;
                    }
                    break;
                case -84075461:
                    if (str.equals("live_with_broadcast")) {
                        r1 = 81;
                        break;
                    }
                    break;
                case -74123313:
                    if (str.equals("explore_video")) {
                        r1 = 144;
                        break;
                    }
                    break;
                case -48829670:
                    if (str.equals("comment_on_tag")) {
                        r1 = 38;
                        break;
                    }
                    break;
                case -19085772:
                    if (str.equals("school_invite")) {
                        r1 = 181;
                        break;
                    }
                    break;
                case 3009503:
                    if (str.equals("aymt")) {
                        r1 = 126;
                        break;
                    }
                    break;
                case 3321751:
                    if (str.equals("like")) {
                        r1 = 29;
                        break;
                    }
                    break;
                case 3446944:
                    if (str.equals("post")) {
                        r1 = 174;
                        break;
                    }
                    break;
                case 3556498:
                    if (str.equals("test")) {
                        r1 = 196;
                        break;
                    }
                    break;
                case 61791015:
                    if (str.equals("igtv_video_post_success")) {
                        r1 = 115;
                        break;
                    }
                    break;
                case 92664121:
                    if (str.equals("adhoc")) {
                        r1 = 120;
                        break;
                    }
                    break;
                case 103149417:
                    if (str.equals("login")) {
                        r1 = 162;
                        break;
                    }
                    break;
                case 118807481:
                    if (str.equals("fb_ig_content_sharing_non_ig_followee")) {
                        r1 = 146;
                        break;
                    }
                    break;
                case 152565738:
                    if (str.equals("addressbook_contact_joined")) {
                        r1 = 58;
                        break;
                    }
                    break;
                case 184250114:
                    if (str.equals("story_poll_close")) {
                        r1 = 190;
                        break;
                    }
                    break;
                case 206566848:
                    if (str.equals("claim_unconfirmed_email")) {
                        r1 = 135;
                        break;
                    }
                    break;
                case 295987376:
                    if (str.equals("report_updated")) {
                        r1 = 113;
                        break;
                    }
                    break;
                case 296104144:
                    if (str.equals("gdpr_parental_consent")) {
                        r1 = 154;
                        break;
                    }
                    break;
                case 324171375:
                    if (str.equals("school_unlock")) {
                        r1 = 182;
                        break;
                    }
                    break;
                case 344285418:
                    if (str.equals("direct_v2_pending")) {
                        r1 = 1;
                        break;
                    }
                    break;
                case 352352772:
                    if (str.equals("user_followed")) {
                        r1 = 54;
                        break;
                    }
                    break;
                case 393866503:
                    if (str.equals("branded_content_whitelisted")) {
                        r1 = 43;
                        break;
                    }
                    break;
                case 435144458:
                    if (str.equals("live_with_broadcast_revoke")) {
                        r1 = 82;
                        break;
                    }
                    break;
                case 538043614:
                    if (str.equals("platform_test")) {
                        r1 = 173;
                        break;
                    }
                    break;
                case 552567418:
                    if (str.equals("captcha")) {
                        r1 = 134;
                        break;
                    }
                    break;
                case 557357479:
                    if (str.equals("underage_appeal")) {
                        r1 = 200;
                        break;
                    }
                    break;
                case 565256046:
                    if (str.equals("follower_media_activity_with_owner")) {
                        r1 = 152;
                        break;
                    }
                    break;
                case 566036496:
                    if (str.equals("direct_v2_shared_archived_post")) {
                        r1 = 25;
                        break;
                    }
                    break;
                case 568982331:
                    if (str.equals("email_was_changed")) {
                        r1 = 143;
                        break;
                    }
                    break;
                case 593658707:
                    if (str.equals("ad_approved")) {
                        r1 = 121;
                        break;
                    }
                    break;
                case 601899204:
                    if (str.equals("silent_push")) {
                        r1 = 186;
                        break;
                    }
                    break;
                case 626712134:
                    if (str.equals("promote_fb_connect")) {
                        r1 = 110;
                        break;
                    }
                    break;
                case 641814964:
                    if (str.equals("fb_ig_followee_on_fb_recently_followed")) {
                        r1 = 48;
                        break;
                    }
                    break;
                case 659030007:
                    if (str.equals("direct_v2_media")) {
                        r1 = 16;
                        break;
                    }
                    break;
                case 663545635:
                    if (str.equals("direct_v2_raven")) {
                        r1 = 19;
                        break;
                    }
                    break;
                case 711754413:
                    if (str.equals("copyright_violation")) {
                        r1 = 140;
                        break;
                    }
                    break;
                case 713969956:
                    if (str.equals("direct_v2_like")) {
                        r1 = 14;
                        break;
                    }
                    break;
                case 714204858:
                    if (str.equals("direct_v2_text")) {
                        r1 = 26;
                        break;
                    }
                    break;
                case 717447420:
                    if (str.equals("direct_v2_profile")) {
                        r1 = 18;
                        break;
                    }
                    break;
                case 728186734:
                    if (str.equals("introduction_explore")) {
                        r1 = 105;
                        break;
                    }
                    break;
                case 781807631:
                    if (str.equals("activation_promote_fb_connect")) {
                        r1 = 83;
                        break;
                    }
                    break;
                case 787249496:
                    if (str.equals("remind_follow_requests")) {
                        r1 = 55;
                        break;
                    }
                    break;
                case 789211672:
                    if (str.equals("top_post_monthly")) {
                        r1 = 197;
                        break;
                    }
                    break;
                case 795385207:
                    if (str.equals("comment_like")) {
                        r1 = 36;
                        break;
                    }
                    break;
                case 826222930:
                    if (str.equals("direct_v2_reel_mention")) {
                        r1 = 20;
                        break;
                    }
                    break;
                case 830269490:
                    if (str.equals("fb_first_post")) {
                        r1 = 69;
                        break;
                    }
                    break;
                case 835198941:
                    if (str.equals("video_call_ended")) {
                        r1 = 28;
                        break;
                    }
                    break;
                case 842386606:
                    if (str.equals("igtv_video_post_failure")) {
                        r1 = 116;
                        break;
                    }
                    break;
                case 846433253:
                    if (str.equals("story_polling_sticker_result")) {
                        r1 = 189;
                        break;
                    }
                    break;
                case 847566336:
                    if (str.equals("subscribed_reel_post")) {
                        r1 = 194;
                        break;
                    }
                    break;
                case 848058770:
                    if (str.equals("direct_raven_pending")) {
                        r1 = 0;
                        break;
                    }
                    break;
                case 936938451:
                    if (str.equals("new_user_password_set")) {
                        r1 = 168;
                        break;
                    }
                    break;
                case 946725162:
                    if (str.equals("direct_v2_generic")) {
                        r1 = 9;
                        break;
                    }
                    break;
                case 950398559:
                    if (str.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT)) {
                        r1 = 32;
                        break;
                    }
                    break;
                case 951117504:
                    if (str.equals("confirm")) {
                        r1 = 136;
                        break;
                    }
                    break;
                case 957743319:
                    if (str.equals("set_fullname")) {
                        r1 = 99;
                        break;
                    }
                    break;
                case 982500120:
                    if (str.equals("ad_report_update")) {
                        r1 = 125;
                        break;
                    }
                    break;
                case 983344450:
                    if (str.equals("geo_ip_block_by_third_party")) {
                        r1 = 157;
                        break;
                    }
                    break;
                case 1007573942:
                    if (str.equals("promote_story")) {
                        r1 = 112;
                        break;
                    }
                    break;
                case 1020129289:
                    if (str.equals("recommend_accounts")) {
                        r1 = 178;
                        break;
                    }
                    break;
                case 1054299071:
                    if (str.equals("geo_ip_block_by_court")) {
                        r1 = 156;
                        break;
                    }
                    break;
                case 1086965870:
                    if (str.equals("reply_to_comment_with_threading")) {
                        r1 = 30;
                        break;
                    }
                    break;
                case 1126829305:
                    if (str.equals("business_message_request_reminder")) {
                        r1 = 84;
                        break;
                    }
                    break;
                case 1133147624:
                    if (str.equals("direct_raven_mark_seen")) {
                        r1 = 3;
                        break;
                    }
                    break;
                case 1136414394:
                    if (str.equals("direct_v2_item_seen")) {
                        r1 = 13;
                        break;
                    }
                    break;
                case 1189340826:
                    if (str.equals("fb_invite_accepted")) {
                        r1 = 148;
                        break;
                    }
                    break;
                case 1206711977:
                    if (str.equals("live_likes")) {
                        r1 = 77;
                        break;
                    }
                    break;
                case 1209368341:
                    if (str.equals("tag_followed")) {
                        r1 = 56;
                        break;
                    }
                    break;
                case 1215941979:
                    if (str.equals("live_views")) {
                        r1 = 80;
                        break;
                    }
                    break;
                case 1226409732:
                    if (str.equals("branded_content_untagged")) {
                        r1 = 41;
                        break;
                    }
                    break;
                case 1233099618:
                    if (str.equals("welcome")) {
                        r1 = 102;
                        break;
                    }
                    break;
                case 1252973282:
                    if (str.equals("find_facebook_friends")) {
                        r1 = 149;
                        break;
                    }
                    break;
                case 1271059305:
                    if (str.equals("contactjoined")) {
                        r1 = 63;
                        break;
                    }
                    break;
                case 1276331536:
                    if (str.equals("follower_activity")) {
                        r1 = 88;
                        break;
                    }
                    break;
                case 1280583649:
                    if (str.equals("canvas_preview")) {
                        r1 = 133;
                        break;
                    }
                    break;
                case 1314689267:
                    if (str.equals("user_data_policy")) {
                        r1 = 202;
                        break;
                    }
                    break;
                case 1316977209:
                    if (str.equals("private_user_follow_request")) {
                        r1 = 53;
                        break;
                    }
                    break;
                case 1342837379:
                    if (str.equals("direct_v2_sent_user_reaction")) {
                        r1 = 23;
                        break;
                    }
                    break;
                case 1350646482:
                    if (str.equals("follower_activity_reminders")) {
                        r1 = 89;
                        break;
                    }
                    break;
                case 1352201912:
                    if (str.equals("media_delete_on_content_violation")) {
                        r1 = 164;
                        break;
                    }
                    break;
                case 1381736685:
                    if (str.equals("branded_content_sponsor_boosted_ad_created")) {
                        r1 = 127;
                        break;
                    }
                    break;
                case 1400148999:
                    if (str.equals("suspicious_login")) {
                        r1 = 195;
                        break;
                    }
                    break;
                case 1494209082:
                    if (str.equals("comment_subscribed")) {
                        r1 = 33;
                        break;
                    }
                    break;
                case 1539594266:
                    if (str.equals("introduction")) {
                        r1 = 103;
                        break;
                    }
                    break;
                case 1545657058:
                    if (str.equals("like_on_tag")) {
                        r1 = 37;
                        break;
                    }
                    break;
                case 1552386812:
                    if (str.equals("direct_v2_highlights_reaction")) {
                        r1 = 11;
                        break;
                    }
                    break;
                case 1573587365:
                    if (str.equals("media_on_post")) {
                        r1 = 165;
                        break;
                    }
                    break;
                case 1574018455:
                    if (str.equals("direct_v2_media_share")) {
                        r1 = 17;
                        break;
                    }
                    break;
                case 1611387480:
                    if (str.equals("fb_ig_content_sharing")) {
                        r1 = 145;
                        break;
                    }
                    break;
                case 1623040524:
                    if (str.equals("page_likes")) {
                        r1 = 93;
                        break;
                    }
                    break;
                case 1665995718:
                    if (str.equals("shopping_user_media_featured")) {
                        r1 = 185;
                        break;
                    }
                    break;
                case 1677710649:
                    if (str.equals("video_view_count")) {
                        r1 = 40;
                        break;
                    }
                    break;
                case 1691996248:
                    if (str.equals("generic_confirm")) {
                        r1 = 155;
                        break;
                    }
                    break;
                case 1701036565:
                    if (str.equals("resurrected_user_post")) {
                        r1 = 75;
                        break;
                    }
                    break;
                case 1706406026:
                    if (str.equals("recent_follow_post")) {
                        r1 = 177;
                        break;
                    }
                    break;
                case 1715775127:
                    if (str.equals("product_announcement")) {
                        r1 = 108;
                        break;
                    }
                    break;
                case 1724420895:
                    if (str.equals("direct_v2_hashtag")) {
                        r1 = 10;
                        break;
                    }
                    break;
                case 1765823574:
                    if (str.equals("direct_v2_channel")) {
                        r1 = 8;
                        break;
                    }
                    break;
                case 1788917712:
                    if (str.equals("subscribed_highlight_post")) {
                        r1 = 193;
                        break;
                    }
                    break;
                case 1811698044:
                    if (str.equals("support_ticket")) {
                        r1 = 114;
                        break;
                    }
                    break;
                case 1831034768:
                    if (str.equals("ig_public_verification")) {
                        r1 = 160;
                        break;
                    }
                    break;
                case 1850301507:
                    if (str.equals("churned_find_friends")) {
                        r1 = 86;
                        break;
                    }
                    break;
                case 1864168171:
                    if (str.equals("branded_content_tagged")) {
                        r1 = 42;
                        break;
                    }
                    break;
                case 1868922880:
                    if (str.equals("campaign_logout_push")) {
                        r1 = 132;
                        break;
                    }
                    break;
                case 1894611782:
                    if (str.equals("branded_content_violation")) {
                        r1 = 130;
                        break;
                    }
                    break;
                case 1903645214:
                    if (str.equals("branded_content_sponsor_boosted_ad_deleted")) {
                        r1 = 128;
                        break;
                    }
                    break;
                case 1933086467:
                    if (str.equals("promote_contact_import")) {
                        r1 = 109;
                        break;
                    }
                    break;
                case 1955189143:
                    if (str.equals("settled_ad_account")) {
                        r1 = 183;
                        break;
                    }
                    break;
                case 1985308587:
                    if (str.equals("set_bio")) {
                        r1 = 98;
                        break;
                    }
                    break;
                case 1988196344:
                    if (str.equals("unseen_notification_reminders")) {
                        r1 = 97;
                        break;
                    }
                    break;
                case 2028508622:
                    if (str.equals("product_rejected")) {
                        r1 = 175;
                        break;
                    }
                    break;
                case 2137571325:
                    if (str.equals("instaversary")) {
                        r1 = 161;
                        break;
                    }
                    break;
                case 2144789231:
                    if (str.equals("story_ads_preview")) {
                        r1 = 188;
                        break;
                    }
                    break;
            }
            switch (r1) {
                case 0:
                case 1:
                    return "ig_direct_requests";
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                case C120125Dh.VIEW_TYPE_LINK /*14*/:
                case 15:
                case 16:
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                case 18:
                case 19:
                case 20:
                case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                case 23:
                case 24:
                case 25:
                case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                    return "ig_direct";
                case 27:
                case 28:
                    return "ig_direct_video_chat";
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                    return "ig_likes";
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                    return "ig_comments";
                case 36:
                    return "ig_comment_likes";
                case 37:
                case 38:
                    return "ig_likes_and_comments_on_photos_of_you";
                case 39:
                case 40:
                    return "ig_view_counts";
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                    return "ig_photos_of_you";
                case 46:
                    return "ig_mentions_in_bio";
                case 47:
                    return "ig_private_user_follow_request";
                case 48:
                case 49:
                case AMD.MAX_LIKES_PER_FETCH /*50*/:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    return "ig_new_followers";
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    return "ig_friends_on_instagram";
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                    return "ig_first_posts_and_stories";
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                    return "ig_live_videos";
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                    return "ig_reminders";
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                    return "ig_product_announcements";
                case 113:
                case 114:
                    return "ig_support_requests";
                case 115:
                case 116:
                    return "ig_igtv_video_updates";
            }
        }
        return "ig_other";
    }

    public static void A07(Context context) {
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        AnonymousClass0XM.A00().A0A().A04(intent, context);
    }

    public static void A0B(Context context, NotificationManager notificationManager) {
        if (C254818y.A01 == null) {
            C254818y.A01 = new C254818y(context);
        }
        C254818y r3 = C254818y.A01;
        int i = r3.A00.getInt("CHANNELS_VERSION", 1);
        if (i < 2) {
            notificationManager.deleteNotificationChannel(RealtimeProtocol.DIRECT_V2_REACTION_LIKES);
            notificationManager.deleteNotificationChannel("comments");
            notificationManager.deleteNotificationChannel("comment_likes");
            notificationManager.deleteNotificationChannel("likes_and_comments_on_photos_of_you");
            notificationManager.deleteNotificationChannel("view_counts");
            notificationManager.deleteNotificationChannel("photos_of_you");
            notificationManager.deleteNotificationChannel("mentions_in_bio");
            notificationManager.deleteNotificationChannel("private_user_follow_request");
            notificationManager.deleteNotificationChannel("new_followers");
            notificationManager.deleteNotificationChannel("friends_on_instagram");
            notificationManager.deleteNotificationChannel("first_posts_and_stories");
            notificationManager.deleteNotificationChannel("live_videos");
            notificationManager.deleteNotificationChannel("reminders");
            notificationManager.deleteNotificationChannel("product_announcements");
            notificationManager.deleteNotificationChannel("support_requests");
            notificationManager.deleteNotificationChannel("igtv_video_updates");
            notificationManager.deleteNotificationChannel("other");
        }
        if (i < 3) {
            notificationManager.deleteNotificationChannel("ig_direct_incoming_video_chat");
        }
        r3.A00.edit().putInt("CHANNELS_VERSION", 3).apply();
    }

    public static void A0E(Context context, NotificationManager notificationManager, C06590Pq r15) {
        List<NotificationChannel> list;
        String str;
        Integer num;
        try {
            list = notificationManager.getNotificationChannels();
        } catch (Exception unused) {
            AnonymousClass0QD.A01("NotificationChannelsHelper", "Unable to get notification channels");
            list = null;
        }
        if (list == null || list.isEmpty()) {
            AnonymousClass0QD.A01("NotificationChannelsHelper", "Unable to get notification channels");
            return;
        }
        C254618w r3 = new C254618w(new C06300On("NotificationChannelsHelper"));
        if (C254818y.A01 == null) {
            C254818y.A01 = new C254818y(context);
        }
        C254818y r4 = C254818y.A01;
        boolean A01 = C06100Nt.A01(context);
        boolean z = r4.A00.getBoolean("NOTIFICATIONS_ARE_ENABLED", true);
        boolean A0Q = A0Q(r4, r15);
        boolean z2 = false;
        if (A01 != z) {
            z2 = true;
        }
        if (z2 || A0Q) {
            if (A01) {
                num = Constants.ZERO;
            } else {
                num = Constants.ONE;
            }
            r3.A00(r15, num, (Map) null);
            r4.A00.edit().putBoolean("NOTIFICATIONS_ARE_ENABLED", A01).apply();
        }
        for (NotificationChannel next : list) {
            String id = next.getId();
            boolean z3 = r4.A00.getBoolean(AnonymousClass000.A0E(id, "_IS_ENABLED"), false);
            boolean z4 = false;
            if (!(next == null || next.getImportance() == 0)) {
                z4 = true;
            }
            if (!A0Q && z3 == z4) {
                int i = r4.A00.getInt(AnonymousClass000.A0E(id, "_IMPORTANCE"), 3);
                boolean z5 = r4.A00.getBoolean(AnonymousClass000.A0E(id, "_SHOULD_SHOW_LIGHT"), false);
                boolean z6 = r4.A00.getBoolean(AnonymousClass000.A0E(id, "_SHOULD_VIBRATE"), false);
                int i2 = r4.A00.getInt(AnonymousClass000.A0E(id, "_LOCKSCREEN_VISIBILITY"), 1);
                String string = r4.A00.getString(AnonymousClass000.A0E(id, "_SOUND"), (String) null);
                boolean z7 = false;
                AnonymousClass0P4 A002 = AnonymousClass0P4.A00("notification_channel_settings_changed", r3.A00);
                A002.A0G("channel_id", id);
                boolean z8 = true;
                if (i != next.getImportance()) {
                    int importance = next.getImportance();
                    A002.A0E("old_importance", Integer.valueOf(i));
                    A002.A0E("new_importance", Integer.valueOf(importance));
                    z7 = true;
                }
                if (z5 != next.shouldShowLights()) {
                    A002.A0A("should_show_light", Boolean.valueOf(next.shouldShowLights()));
                    z7 = true;
                }
                if (z6 != next.shouldVibrate()) {
                    A002.A0A("should_vibrate", Boolean.valueOf(next.shouldVibrate()));
                    z7 = true;
                }
                if (i2 != next.getLockscreenVisibility()) {
                    int lockscreenVisibility = next.getLockscreenVisibility();
                    A002.A0E("old_lockscreen_visibility", Integer.valueOf(i2));
                    A002.A0E("new_lockscreen_visibility", Integer.valueOf(lockscreenVisibility));
                    z7 = true;
                }
                Uri sound = next.getSound();
                if (sound == null || TextUtils.equals(string, sound.toString())) {
                    z8 = z7;
                } else {
                    A002.A0A("sound_changed", true);
                }
                if (z8) {
                    AnonymousClass0WN.A01(r15).BcG(A002);
                }
            } else if (z4) {
                AnonymousClass2EK r2 = new AnonymousClass2EK(AnonymousClass0QT.A00(r15, r3.A00).A02("notification_channel_enabled"));
                r2.A08("channel_id", id);
                r2.A01();
            } else {
                C91093wz r22 = new C91093wz(AnonymousClass0QT.A00(r15, r3.A00).A02("notification_channel_disabled"));
                r22.A08("channel_id", id);
                r22.A01();
            }
            SharedPreferences.Editor edit = r4.A00.edit();
            String id2 = next.getId();
            String A0E = AnonymousClass000.A0E(id2, "_IS_ENABLED");
            boolean z9 = false;
            if (!(next == null || next.getImportance() == 0)) {
                z9 = true;
            }
            edit.putBoolean(A0E, z9);
            edit.putInt(AnonymousClass000.A0E(id2, "_IMPORTANCE"), next.getImportance());
            edit.putBoolean(AnonymousClass000.A0E(id2, "_SHOULD_SHOW_LIGHT"), next.shouldShowLights());
            edit.putBoolean(AnonymousClass000.A0E(id2, "_SHOULD_VIBRATE"), next.shouldVibrate());
            edit.putInt(AnonymousClass000.A0E(id2, "_LOCKSCREEN_VISIBILITY"), next.getLockscreenVisibility());
            Uri sound2 = next.getSound();
            if (sound2 != null) {
                str = sound2.toString();
            } else {
                str = "";
            }
            edit.putString(AnonymousClass000.A0E(id2, "_SOUND"), str);
            edit.apply();
        }
        if (A0Q) {
            r4.A00.edit().putLong(AnonymousClass000.A0E("LAST_FULL_LOGGING_TS_FOR_", r15.getToken()), System.currentTimeMillis()).apply();
        }
    }

    public static void A0G(Context context, Uri uri, C06590Pq r8, boolean z) {
        if (z) {
            A0H(context, r8, (Map) null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                AnonymousClass0QD.A01("NotificationChannelsHelper", "Unable to fetch the Notification Manager Service");
                return;
            }
            A0E(context, notificationManager, r8);
            A0B(context, notificationManager);
            boolean A07 = C06080Nr.A07(context);
            boolean A06 = C06080Nr.A06(context);
            boolean A09 = C06080Nr.A09(context);
            if (A07 || A09) {
                A0L(context, "DIRECT", C0003R.string.notif_group_direct, notificationManager);
                A0C(context, notificationManager, uri);
            }
            if (A09) {
                A0L(context, "THREADSAPP", C0003R.string.notif_group_threadsapp, notificationManager);
                A0D(context, notificationManager, uri);
            }
            if (A07 || A06) {
                A0L(context, "IG", C0003R.string.notif_group_ig, notificationManager);
                A0A(context, notificationManager);
                A0L(context, "IGTV", C0003R.string.notif_group_igtv, notificationManager);
                A09(context, notificationManager);
                A08(context, notificationManager);
            }
            A0F(context, notificationManager, A03(context, notificationManager, A06));
        }
    }

    public static void A0H(Context context, C06590Pq r5, Map map) {
        Integer num;
        if (C254818y.A01 == null) {
            C254818y.A01 = new C254818y(context);
        }
        C254818y r3 = C254818y.A01;
        boolean A01 = C06100Nt.A01(context);
        C254618w r1 = A00;
        if (A01) {
            num = Constants.ZERO;
        } else {
            num = Constants.ONE;
        }
        r1.A00(r5, num, map);
        r3.A00.edit().putBoolean("NOTIFICATIONS_ARE_ENABLED", A01).apply();
    }

    public static void A0I(Context context, C06590Pq r3, boolean z) {
        if (z) {
            A0H(context, r3, (Map) null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                AnonymousClass0QD.A01("NotificationChannelsHelper", "Unable to fetch the Notification Manager Service");
            } else {
                A0E(context, notificationManager, r3);
            }
        }
    }

    public static void A0J(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                AnonymousClass0QD.A01("NotificationChannelsHelper", "Unable to fetch the Notification Manager Service");
            } else {
                notificationManager.deleteNotificationChannel(str);
            }
        }
    }

    public static void A0K(Context context, String str) {
        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        intent.putExtra("android.provider.extra.CHANNEL_ID", str);
        AnonymousClass0XM.A00().A0A().A04(intent, context);
    }

    public static void A0M(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                AnonymousClass0QD.A01("NotificationChannelsHelper", "Unable to fetch the Notification Manager Service");
            } else {
                A0N(str, "DIRECT", str2, 4, 0, true, true, (Uri) null, 1, notificationManager);
            }
        }
    }

    public static void A0N(String str, String str2, String str3, int i, int i2, boolean z, boolean z2, Uri uri, int i3, NotificationManager notificationManager) {
        AudioAttributes audioAttributes;
        NotificationChannel notificationChannel = new NotificationChannel(str, str3, i);
        boolean z3 = false;
        if (i2 != 0) {
            z3 = true;
        }
        notificationChannel.enableLights(z3);
        if (i2 != 0) {
            notificationChannel.setLightColor(i2);
        }
        notificationChannel.enableVibration(z);
        notificationChannel.setShowBadge(z2);
        notificationChannel.setLockscreenVisibility(i3);
        notificationChannel.setGroup(str2);
        if (uri == null) {
            audioAttributes = null;
        } else {
            audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        }
        notificationChannel.setSound(uri, audioAttributes);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static boolean A0P(Context context, C06590Pq r7) {
        if (C254818y.A01 == null) {
            C254818y.A01 = new C254818y(context);
        }
        C254818y r5 = C254818y.A01;
        boolean A01 = C06100Nt.A01(context);
        boolean z = r5.A00.getBoolean("NOTIFICATIONS_ARE_ENABLED", true);
        boolean A0Q = A0Q(r5, r7);
        boolean z2 = false;
        if (A01 != z) {
            z2 = true;
        }
        if (z2 || A0Q) {
            return true;
        }
        return false;
    }

    public static String A04(Context context, String str, String str2, String str3, String str4) {
        String A06 = A06(str2);
        if ("ig_other".equals(A06)) {
            if (str3 != null) {
                char c = 65535;
                A06 = "ig_shopping_drops";
                switch (str3.hashCode()) {
                    case -2087444809:
                        if (str3.equals("live_broadcast_revoke")) {
                            c = 11;
                            break;
                        }
                        break;
                    case -1372693202:
                        if (str3.equals("live_broadcast")) {
                            c = 10;
                            break;
                        }
                        break;
                    case -971609053:
                        if (str3.equals("video_call_incoming")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -393940263:
                        if (str3.equals("popular")) {
                            c = 13;
                            break;
                        }
                        break;
                    case -307187846:
                        if (str3.equals("gdpr_consent")) {
                            c = 15;
                            break;
                        }
                        break;
                    case -147112977:
                        if (str3.equals("usertag")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 3321751:
                        if (str3.equals("like")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3446944:
                        if (str3.equals("post")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 557357479:
                        if (str3.equals("underage_appeal")) {
                            c = 14;
                            break;
                        }
                        break;
                    case 835198941:
                        if (str3.equals("video_call_ended")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 950398559:
                        if (str3.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT)) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1227036430:
                        if (str3.equals(A06)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1271059305:
                        if (str3.equals("contactjoined")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1316977209:
                        if (str3.equals("private_user_follow_request")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 1544803905:
                        if (str3.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
                            c = 16;
                            break;
                        }
                        break;
                    case 1981798234:
                        if (str3.equals("direct_v2_message")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 2026707488:
                        if (str3.equals("explore_hashtag")) {
                            c = 12;
                            break;
                        }
                        break;
                }
                String str5 = "ig_direct_video_chat";
                switch (c) {
                    case 0:
                        str5 = null;
                        if (!TextUtils.isEmpty(str4)) {
                            AnonymousClass0a4.A06(context);
                            if (Build.VERSION.SDK_INT >= 26 && A00(context, str4) != null) {
                                str5 = str4;
                            }
                        }
                        if (str5 == null) {
                            A06 = "ig_direct";
                            break;
                        }
                    case 1:
                    case 2:
                        A06 = str5;
                        break;
                    case 3:
                        break;
                    case 4:
                        A06 = "ig_likes";
                        break;
                    case 5:
                        A06 = "ig_comments";
                        break;
                    case 6:
                        A06 = "ig_friends_on_instagram";
                        break;
                    case 7:
                        A06 = "ig_photos_of_you";
                        break;
                    case 8:
                        A06 = "ig_first_posts_and_stories";
                        break;
                    case 9:
                        A06 = "ig_private_user_follow_request";
                        break;
                    case 10:
                    case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                        A06 = "ig_live_videos";
                        break;
                }
            }
            A06 = "ig_other";
            if ("ig_other".equals(A06)) {
                if (str != null) {
                    char c2 = 65535;
                    A06 = "ig_shopping_drops";
                    switch (str.hashCode()) {
                        case -1331586071:
                            if (str.equals(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING)) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -1287306546:
                            if (str.equals("threads_app_auto_status")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case -1190461686:
                            if (str.equals("iglive")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -971609053:
                            if (str.equals("video_call_incoming")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 3168159:
                            if (str.equals("gdpr")) {
                                c2 = 7;
                                break;
                            }
                            break;
                        case 601899204:
                            if (str.equals("silent_push")) {
                                c2 = 8;
                                break;
                            }
                            break;
                        case 1227036430:
                            if (str.equals(A06)) {
                                c2 = 5;
                                break;
                            }
                            break;
                        case 1846140898:
                            if (str.equals("newstab")) {
                                c2 = 6;
                                break;
                            }
                            break;
                        case 1948868747:
                            if (str.equals("threads_app")) {
                                c2 = 4;
                                break;
                            }
                            break;
                    }
                    if (c2 == 0) {
                        return "ig_direct";
                    }
                    if (c2 == 1) {
                        return "ig_direct_video_chat";
                    }
                    if (c2 == 2) {
                        return "ig_live_videos";
                    }
                    if (c2 == 3) {
                        return "ig_threads_app_auto_status";
                    }
                    if (c2 == 4) {
                        return "ig_threads_app";
                    }
                    if (c2 != 5) {
                        return "ig_other";
                    }
                }
                return "ig_other";
            }
        }
        return A06;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008c, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a2, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b9, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d2, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00df, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ec, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r0 == false) goto L_0x0007;
     */
    public static String A05(String str) {
        char c;
        switch (str.hashCode()) {
            case -1660159711:
                boolean equals = str.equals("tagged_in_bio");
                c = 16;
                break;
            case -1618365534:
                boolean equals2 = str.equals("video_call");
                c = 18;
                break;
            case -1534353675:
                boolean equals3 = str.equals("view_count");
                c = 13;
                break;
            case -1461524499:
                boolean equals4 = str.equals("notification_reminders");
                c = 10;
                break;
            case -1372693202:
                boolean equals5 = str.equals("live_broadcast");
                c = 15;
                break;
            case -1307214883:
                boolean equals6 = str.equals("new_follower");
                c = 4;
                break;
            case -1112862244:
                boolean equals7 = str.equals("comment_likes");
                c = 2;
                break;
            case -602415628:
                boolean equals8 = str.equals("comments");
                c = 1;
                break;
            case -562217912:
                boolean equals9 = str.equals("contact_joined");
                c = 6;
                break;
            case -160912177:
                boolean equals10 = str.equals("first_post");
                c = 11;
                break;
            case -139282336:
                boolean equals11 = str.equals("user_tagged");
                c = 9;
                break;
            case 102974396:
                boolean equals12 = str.equals(RealtimeProtocol.DIRECT_V2_REACTION_LIKES);
                c = 0;
                break;
            case 106069776:
                boolean equals13 = str.equals("other");
                c = 19;
                break;
            case 295987376:
                boolean equals14 = str.equals("report_updated");
                c = 14;
                break;
            case 536242609:
                boolean equals15 = str.equals("pending_direct_share");
                c = 7;
                break;
            case 565271564:
                boolean equals16 = str.equals("announcements");
                c = 12;
                break;
            case 639774245:
                boolean equals17 = str.equals("follow_request_accepted");
                c = 5;
                break;
            case 718888547:
                boolean equals18 = str.equals("like_and_comment_on_photo_user_tagged");
                c = 3;
                break;
            case 1134925464:
                boolean equals19 = str.equals("felix_upload_result");
                c = 17;
                break;
            case 1752343173:
                boolean equals20 = str.equals("direct_share_activity");
                c = 8;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return "ig_likes";
            case 1:
                return "ig_comments";
            case 2:
                return "ig_comment_likes";
            case 3:
                return "ig_likes_and_comments_on_photos_of_you";
            case 4:
                return "ig_new_followers";
            case 5:
                return "ig_private_user_follow_request";
            case 6:
                return "ig_friends_on_instagram";
            case 7:
                return "ig_direct_requests";
            case 8:
                return "ig_direct";
            case 9:
                return "ig_photos_of_you";
            case 10:
                return "ig_reminders";
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                return "ig_first_posts_and_stories";
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                return "ig_product_announcements";
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                return "ig_view_counts";
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                return "ig_support_requests";
            case 15:
                return "ig_live_videos";
            case 16:
                return "ig_mentions_in_bio";
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                return "ig_igtv_video_updates";
            case 18:
                return "ig_direct_video_chat";
            case 19:
                return "ig_other";
            default:
                return "";
        }
    }

    public static void A08(Context context, NotificationManager notificationManager) {
        A0N("ig_shopping_drops", "IG", context.getResources().getString(C0003R.string.notif_group_ig_shopping_drops), 4, C019000b.A00(context, C0003R.color.blueteal_5), true, true, (Uri) null, 0, notificationManager);
    }

    public static void A09(Context context, NotificationManager notificationManager) {
        A0N("ig_igtv_video_updates", "IGTV", context.getResources().getString(C0003R.string.notif_channel_igtv_video_updates_name), 3, 0, false, true, (Uri) null, 1, notificationManager);
    }

    public static void A0A(Context context, NotificationManager notificationManager) {
        NotificationManager notificationManager2 = notificationManager;
        A0N("ig_likes", "IG", context.getResources().getString(C0003R.string.notif_channel_likes_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_comments", "IG", context.getResources().getString(C0003R.string.notif_channel_comments_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_comment_likes", "IG", context.getResources().getString(C0003R.string.notif_channel_comment_likes_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_likes_and_comments_on_photos_of_you", "IG", context.getResources().getString(C0003R.string.notif_channel_likes_and_comments_on_photos_of_you_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_view_counts", "IG", context.getResources().getString(C0003R.string.notif_channel_view_counts_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_photos_of_you", "IG", context.getResources().getString(C0003R.string.notif_channel_photos_of_you_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_mentions_in_bio", "IG", context.getResources().getString(C0003R.string.notif_channel_mentions_in_bio_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_private_user_follow_request", "IG", context.getResources().getString(C0003R.string.notif_channel_accepted_follow_requests_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_new_followers", "IG", context.getResources().getString(C0003R.string.notif_channel_new_followers_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_friends_on_instagram", "IG", context.getResources().getString(C0003R.string.notif_channel_friends_on_instagram_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_first_posts_and_stories", "IG", context.getResources().getString(C0003R.string.notif_channel_first_posts_and_stories_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_posting_status", "IG", context.getResources().getString(C0003R.string.notif_channel_posting_status), 2, 0, true, true, (Uri) null, 1, notificationManager2);
        A0N("ig_live_videos", "IG", context.getResources().getString(C0003R.string.notif_channel_live_videos_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_reminders", "IG", context.getResources().getString(C0003R.string.notif_channel_reminders_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_product_announcements", "IG", context.getResources().getString(C0003R.string.notif_channel_product_announcements_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_support_requests", "IG", context.getResources().getString(C0003R.string.notif_channel_support_requests_name), 3, 0, false, true, (Uri) null, 1, notificationManager);
    }

    public static void A0C(Context context, NotificationManager notificationManager, Uri uri) {
        Context context2 = context;
        int A002 = C019000b.A00(context2, C0003R.color.blueteal_5);
        NotificationManager notificationManager2 = notificationManager;
        Uri uri2 = uri;
        A0N("ig_direct_requests", "DIRECT", context2.getResources().getString(C0003R.string.notif_channel_instagram_direct_requests_name), 4, A002, true, true, uri2, 0, notificationManager2);
        A0N("ig_direct", "DIRECT", context2.getResources().getString(C0003R.string.notif_channel_instagram_direct_name), 4, A002, true, true, uri2, 0, notificationManager2);
        A0N("ig_direct_video_chat", "DIRECT", context2.getResources().getString(C0003R.string.notif_channel_instagram_direct_video_chat_name), 4, C019000b.A00(context2, C0003R.color.yellow_5), true, true, uri2, 0, notificationManager2);
    }

    public static void A0F(Context context, NotificationManager notificationManager, String str) {
        NotificationManager notificationManager2 = notificationManager;
        String str2 = str;
        A0N("uploads", str2, context.getResources().getString(C0003R.string.notif_channel_uploads_name), 2, 0, false, true, (Uri) null, 1, notificationManager2);
        A0N("ig_other", str2, context.getResources().getString(C0003R.string.notif_channel_other_name), 3, 0, false, true, (Uri) null, 1, notificationManager2);
    }

    public static void A0L(Context context, String str, int i, NotificationManager notificationManager) {
        notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(str, context.getString(i)));
    }

    public static boolean A0Q(C254818y r6, C06590Pq r7) {
        boolean z = false;
        if (System.currentTimeMillis() - r6.A00.getLong(AnonymousClass000.A0E("LAST_FULL_LOGGING_TS_FOR_", r7.getToken()), 0) > C254818y.A02) {
            z = true;
        }
        if (!z || !r7.AgN()) {
            return false;
        }
        return true;
    }
}
