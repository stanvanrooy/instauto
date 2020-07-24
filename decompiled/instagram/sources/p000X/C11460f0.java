package p000X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.0f0  reason: invalid class name and case insensitive filesystem */
public final class C11460f0 implements C11330en {
    public static final Set A01 = new HashSet(Arrays.asList(new String[]{"about", "about-ads", "account", "accounts", "blog", "business", "client_error", "community", "componentexplorer", "developer", "developers", "download", "getapp", "help", "instameets", "invites", "nametag", "press", "research", "security", "support", "terms", "xwoiynko"}));
    public static final Set A02 = new HashSet(Arrays.asList(new String[]{"ads", "android", "dyi", "emails", "enoozer", "internal", "legal", "media", "mixi", "oauth", "weibo"}));
    public static final Pattern A03 = Pattern.compile("[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*");
    public final C11410ev A00;

    public final boolean BdY() {
        return false;
    }

    public C11460f0(C11410ev r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a7, code lost:
        if (p000X.AnonymousClass1DW.A01(p000X.Constants.A0u).equalsIgnoreCase(r1) == false) goto L_0x01a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0248  */
    public final Bundle A7i(String str, C06590Pq r19) {
        Bundle bundle;
        String str2;
        String str3;
        String str4;
        boolean z;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if ("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) {
            bundle = null;
            if (AnonymousClass2C2.A00(parse)) {
                Bundle bundle2 = new Bundle();
                List<String> pathSegments = parse.getPathSegments();
                if (!pathSegments.isEmpty()) {
                    String lowerCase = pathSegments.get(0).toLowerCase(Locale.US);
                    if (pathSegments.size() >= 2 && "invites".equalsIgnoreCase(pathSegments.get(0)) && "contact".equalsIgnoreCase(pathSegments.get(1))) {
                        bundle2.putBoolean("should_land_on_web", false);
                        bundle2.putParcelable("uri", parse);
                        if (parse.getQueryParameterNames().contains("utm_content")) {
                            bundle2.putString("InstagramUrlLaunchConstants.EXTRA_USER_ID", new BigInteger(parse.getQueryParameter("utm_content"), 36).toString());
                        }
                        return bundle2;
                    } else if (A01.contains(lowerCase) || (A02.contains(lowerCase) && pathSegments.size() > 1)) {
                        bundle2.putBoolean("should_land_on_web", true);
                        bundle2.putParcelable("uri", parse);
                        return bundle2;
                    } else {
                        if (pathSegments.size() == 1) {
                            String str5 = pathSegments.get(0);
                            if (!AnonymousClass1DW.A01(Constants.ONE).equalsIgnoreCase(str5) && !"_n".equalsIgnoreCase(str5) && !"_u".equalsIgnoreCase(str5)) {
                                if (A03.matcher(str5).matches()) {
                                    bundle2.putParcelable("uri", parse);
                                    bundle2.putString("InstagramUrlLaunchConstants.EXTRA_USER_NAME", pathSegments.get(0));
                                    return bundle2;
                                }
                                str4 = "Explore url contains invalid username: ";
                            }
                            if ("stories".equalsIgnoreCase(pathSegments.get(0)) && (pathSegments.size() >= 2 || r19 != null)) {
                                bundle2.putString("InstagramUrlLaunchConstants.EXTRA_USER_NAME", pathSegments.get(1));
                                AnonymousClass6KD r2 = new AnonymousClass6KD(C145496Jw.USER_STORY, (String) null);
                                r2.A04 = true;
                                r2.A05 = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(parse.getQueryParameter("story-show-report"));
                                r2.A03 = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(parse.getQueryParameter("story-show-fact-check"));
                                if (pathSegments.size() > 2) {
                                    r2.A01 = pathSegments.get(2);
                                }
                                bundle2.putParcelable("InstagramUrlLaunchConstants.EXTRA_AUTO_LAUNCH_REEL_PARAMS", new AutoLaunchReelParams(r2));
                                return bundle2;
                            }
                        } else {
                            if (pathSegments.size() == 2) {
                                String str6 = pathSegments.get(0);
                                String str7 = pathSegments.get(1);
                                if (AnonymousClass1DW.A01(Constants.A0j).equalsIgnoreCase(str6)) {
                                    z = true;
                                }
                                z = false;
                                boolean equalsIgnoreCase = AnonymousClass1DW.A01(Constants.A12).equalsIgnoreCase(str6);
                                if (z || equalsIgnoreCase) {
                                    bundle2.putParcelable("uri", parse);
                                    bundle2.putBoolean("EXTRA_STORY_CAMERA", true);
                                    if (!equalsIgnoreCase) {
                                        str7 = parse.getQueryParameter("effect_id");
                                    }
                                    bundle2.putString("effect_id_key", str7);
                                    bundle2.putString("ch_key", parse.getQueryParameter("ch"));
                                    str2 = parse.getQueryParameter("revision_id");
                                    str3 = "revisionID_key";
                                    bundle2.putString(str3, str2);
                                    return bundle2;
                                } else if ("_u".equalsIgnoreCase(pathSegments.get(0))) {
                                    if (A03.matcher(str7).matches()) {
                                        bundle2.putString("InstagramUrlLaunchConstants.EXTRA_USER_NAME", str7);
                                        return bundle2;
                                    }
                                    str4 = "Url contains invalid username: ";
                                } else if ("_uid".equalsIgnoreCase(pathSegments.get(0))) {
                                    bundle2.putString("InstagramUrlLaunchConstants.EXTRA_USER_ID", pathSegments.get(1));
                                    return bundle2;
                                }
                            }
                            bundle2.putString("InstagramUrlLaunchConstants.EXTRA_USER_NAME", pathSegments.get(1));
                            AnonymousClass6KD r22 = new AnonymousClass6KD(C145496Jw.USER_STORY, (String) null);
                            r22.A04 = true;
                            r22.A05 = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(parse.getQueryParameter("story-show-report"));
                            r22.A03 = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(parse.getQueryParameter("story-show-fact-check"));
                            if (pathSegments.size() > 2) {
                            }
                            bundle2.putParcelable("InstagramUrlLaunchConstants.EXTRA_AUTO_LAUNCH_REEL_PARAMS", new AutoLaunchReelParams(r22));
                            return bundle2;
                        }
                        AnonymousClass0QD.A01("url_handler_user", AnonymousClass000.A0E(str4, parse.getPath()));
                        bundle2.putString("InstagramUrlLaunchConstants.EXTRA_USER_NAME", pathSegments.get(1));
                        AnonymousClass6KD r222 = new AnonymousClass6KD(C145496Jw.USER_STORY, (String) null);
                        r222.A04 = true;
                        r222.A05 = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(parse.getQueryParameter("story-show-report"));
                        r222.A03 = RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(parse.getQueryParameter("story-show-fact-check"));
                        if (pathSegments.size() > 2) {
                        }
                        bundle2.putParcelable("InstagramUrlLaunchConstants.EXTRA_AUTO_LAUNCH_REEL_PARAMS", new AutoLaunchReelParams(r222));
                        return bundle2;
                    }
                }
                bundle2.putParcelable("uri", parse);
                bundle2.putString("destination_id", AnonymousClass1DW.A01(Constants.ZERO));
                str2 = parse.getEncodedQuery();
                str3 = "encoded_query";
                bundle2.putString(str3, str2);
                return bundle2;
            }
        } else if (!"instagram".equalsIgnoreCase(scheme)) {
            return null;
        } else {
            bundle = null;
            if ("user".equalsIgnoreCase(parse.getHost())) {
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames.contains("username")) {
                    String queryParameter = parse.getQueryParameter("username");
                    if (!A03.matcher(queryParameter).matches()) {
                        AnonymousClass0QD.A01("url_handler_user", AnonymousClass000.A0E("Ig-scheme url contains invalid username: ", parse.getPath()));
                    } else {
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("InstagramUrlLaunchConstants.EXTRA_USER_NAME", queryParameter);
                        if (parse.getQueryParameterNames().contains("launch_reel")) {
                            AnonymousClass6KD r23 = new AnonymousClass6KD(C145496Jw.USER_STORY, (String) null);
                            r23.A06 = parse.getQueryParameterNames().contains("include_viewers");
                            r23.A01 = parse.getQueryParameter("media_id");
                            bundle3.putParcelable("InstagramUrlLaunchConstants.EXTRA_AUTO_LAUNCH_REEL_PARAMS", new AutoLaunchReelParams(r23));
                        }
                        bundle3.putBoolean("InstagramUrlLaunchConstants.EXTRA_SHOULD_INCLUDE_BACK_STACK", queryParameterNames.contains("back_stack"));
                        return bundle3;
                    }
                }
            }
        }
        return bundle;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r5) {
        Uri uri = (Uri) bundle.getParcelable("uri");
        if (uri != null && bundle.getBoolean("should_land_on_web")) {
            C140125yt.A02(fragmentActivity, r5, uri, bundle.getString("com.instagram.url.constants.ARGUMENTS_KEY_ANALYTICS_MODULE_NAME"));
            fragmentActivity.finish();
        } else if (uri == null) {
            C140125yt.A06(r5, fragmentActivity, bundle);
        } else {
            if (bundle.containsKey("EXTRA_STORY_CAMERA")) {
                this.A00.AbA(bundle, fragmentActivity, r5);
            }
            if (bundle.containsKey("InstagramUrlLaunchConstants.EXTRA_USER_NAME") || bundle.containsKey("InstagramUrlLaunchConstants.EXTRA_USER_ID")) {
                C140125yt.A06(r5, fragmentActivity, bundle);
            } else {
                C140125yt.A01(fragmentActivity, bundle);
            }
        }
    }
}
