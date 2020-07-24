package p000X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.react.modules.camera.CameraRollManager;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.business.insights.controller.InsightsStoryViewerController;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.modal.ModalActivity;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import com.instagram.reels.fragment.ReelViewerFragment;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.viewads.fragment.ViewAdsHomeFragment;
import com.instagram.wellbeing.restrict.fragment.RestrictHomeFragment;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0n0  reason: invalid class name and case insensitive filesystem */
public final class C15460n0 implements C15440my {
    public C15470n1 A00 = new C15470n1();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v1, types: [X.2Dd] */
    /* JADX WARNING: type inference failed for: r15v8, types: [X.2Dd] */
    /* JADX WARNING: type inference failed for: r15v11, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: type inference failed for: r15v13, types: [X.2Dd] */
    /* JADX WARNING: type inference failed for: r15v17, types: [X.2Dd] */
    /* JADX WARNING: type inference failed for: r15v20 */
    /* JADX WARNING: type inference failed for: r15v21 */
    /* JADX WARNING: type inference failed for: r15v22 */
    /* JADX WARNING: type inference failed for: r15v23 */
    /* JADX WARNING: type inference failed for: r15v24 */
    /* JADX WARNING: type inference failed for: r15v25 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0254, code lost:
        if (r6.equals("bk.action.flipper.SendData") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0260, code lost:
        if (r6.equals("ig.action.navigation.OpenInsightsStoryViewer") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x026c, code lost:
        if (r6.equals("ig.action.navigation.UpdateTagsSetting") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0278, code lost:
        if (r6.equals("ig.action.navigation.OpenUserDetail") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0283, code lost:
        if (r6.equals("bk.action.bloks.OpenScreen") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (r6.equals("bk.action.io.CurrentTimeMillis") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x028f, code lost:
        if (r6.equals("ig.action.navigation.OpenDialog") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x029b, code lost:
        if (r6.equals("ig.action.quickpromotion.HandleQuickPromotionActionClick") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02a7, code lost:
        if (r6.equals("ig.action.viewpoint_extension_context.GetPercentVisible") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b3, code lost:
        if (r6.equals("ig.action.navigation.OpenSingleMedia") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02bf, code lost:
        if (r6.equals("ig.action.navigation.OpenPageSelection") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02cb, code lost:
        if (r6.equals("ig.action.imbe.LogFunnelEvent") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d7, code lost:
        if (r6.equals("ig.action.facebook_account.GetFbAccessToken") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e3, code lost:
        if (r6.equals("ig.action.quickpromotion.DismissQuickPromotion") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02ef, code lost:
        if (r6.equals("ig.action.media.UploadMedia") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02fb, code lost:
        if (r6.equals("ig.action.navigation.OpenCreatePostFlowOnMainScreen") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r6.equals("ig.action.navigation.OpenItemDetails") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0307, code lost:
        if (r6.equals("ig.action.navigation.OpenInsightsIGTVViewer") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0313, code lost:
        if (r6.equals("ig.action.navigation.OpenOrderDisputeStatus") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x031f, code lost:
        if (r6.equals("bk.action.visibility_context.HasSeenBefore") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x032b, code lost:
        if (r6.equals("ig.action.navigation.OpenScreen") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0337, code lost:
        if (r6.equals("ig.action.navigation.OpenUrlSupportsDfa") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0342, code lost:
        if (r6.equals("ig.action.navigation.IGToast") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x034e, code lost:
        if (r6.equals("ig.action.facebook_account.HasFbPermissions") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0359, code lost:
        if (r6.equals("bk.action.bloks.AsyncAction") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0365, code lost:
        if (r6.equals("ig.action.navigation.UpdateMentionsSetting") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0371, code lost:
        if (r6.equals("bk.action.hcollection.SetOffset") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (r6.equals("bk.action.visibility_context.GetTimeSinceLastImpressionInMS") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x037d, code lost:
        if (r6.equals("bk.action.search_bar.Unfocus") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0389, code lost:
        if (r6.equals("ig.action.navigation.CloseShoppingSignupWithParam") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0395, code lost:
        if (r6.equals("ig.action.navigation.OpenReelViewerSettings") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03a1, code lost:
        if (r6.equals("ig.action.navigation.OpenAvatarUpdater") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ac, code lost:
        if (r6.equals("ig.action.io.ShowSnackbar") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b8, code lost:
        if (r6.equals("bk.action.hcollection.GetOffset") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03c3, code lost:
        if (r6.equals("bk.action.bloks.AsyncLoadV2") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03cf, code lost:
        if (r6.equals("ig.action.quickpromotion.HandleQuickPromotionButtonClick") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03db, code lost:
        if (r6.equals("ig.action.navigation.ResumeStoryPlayback") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03e7, code lost:
        if (r6.equals("ig.action.navigation.OpenInsightsStoryViewerV2") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        if (r6.equals("ig.action.navigation.PresentModalWithResult") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03f3, code lost:
        if (r6.equals("ig.action.navigation.OpenBottomSheet") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03ff, code lost:
        if (r6.equals("bk.action.session_store.Get") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x040b, code lost:
        if (r6.equals("ig.action.navigation.CloseToScreen") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0416, code lost:
        if (r6.equals("bk.action.io.Toast") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0422, code lost:
        if (r6.equals("ig.action.navigation.OpenOrderDetails") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x042e, code lost:
        if (r6.equals("ig.action.navigation.OpenShareSheet") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x043a, code lost:
        if (r6.equals("bk.action.visibility_context.GetLastImpressionTimeInMs") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0446, code lost:
        if (r6.equals("ig.action.navigation.OpenCatalogSelection") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0452, code lost:
        if (r6.equals("ig.action.navigation.OpenOrderCancellation") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x045e, code lost:
        if (r6.equals("ig.action.navigation.LaunchMediaPicker") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r6.equals("ig.action.navigation.OpenAccountInsightsSurvey") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x046a, code lost:
        if (r6.equals("ig.action.navigation.OpenShopManagement") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0476, code lost:
        if (r6.equals("ig.action.navigation.CloseModalWithResult") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0482, code lost:
        if (r6.equals("ig.action.navigation.OpenSupportInbox") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x048e, code lost:
        if (r6.equals("ig.action.navigation.Login") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x049a, code lost:
        if (r6.equals("ig.action.navigation.UpdateCustomTitle") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04a6, code lost:
        if (r6.equals("ig.action.navigation.LaunchCreateDonationStickerStory") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04b2, code lost:
        if (r6.equals("ig.action.perf.StartTTIEvent") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04be, code lost:
        if (r6.equals("ig.action.navigation.OpenCreatePromotionFlow") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04ca, code lost:
        if (r6.equals("ig.action.navigation.LaunchStoryDonationStickerCreation") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04d6, code lost:
        if (r6.equals("ig.action.navigation.OpenLiveAndIGTVNotificationSettings") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        if (r6.equals("bk.fx.action.ExitLinkingFlow") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04e2, code lost:
        if (r6.equals("ig.action.perf.EndTTIEvent") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04ee, code lost:
        if (r6.equals("ig.action.navigation.UpdateTitle") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04fa, code lost:
        if (r6.equals("ig.action.navigation.OpenAdsManager") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0506, code lost:
        if (r6.equals("ig.action.navigation.OpenCreateStoryFlow") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0512, code lost:
        if (r6.equals("bk.fx.action.FetchFacebookAccountAuthData") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x051e, code lost:
        if (r6.equals("ig.action.viewpoint_extension_context.GetElapsedScreenTimeInMs") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x052a, code lost:
        if (r6.equals("bk.fx.action.FetchIGAccountAuthProof") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0536, code lost:
        if (r6.equals("ig.action.perf.EndTTIEventV2") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0542, code lost:
        if (r6.equals("ig.action.search.MergeResults") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x054e, code lost:
        if (r6.equals("ig.action.navigation.DismissBottomSheet") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
        if (r6.equals("ig.action.navigation.CloseShoppingSignup") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x055a, code lost:
        if (r6.equals("ig.action.navigation.OpenCreateIGTVFlow") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0566, code lost:
        if (r6.equals("ig.action.navigation.OpenNelsonHome") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0572, code lost:
        if (r6.equals("ig.action.navigation.IsHostBottomSheet") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x057e, code lost:
        if (r6.equals("bk.fx.action.LoadingOverlay") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x058a, code lost:
        if (r6.equals("ig.action.branded_content.UpdatePartnerRequestCount") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0596, code lost:
        if (r6.equals("mini.action.MaybeShowShopsNux") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05a2, code lost:
        if (r6.equals("ig.action.navigation.CloseScreen") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05ae, code lost:
        if (r6.equals("mini.action.OpenProductDetails") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05ba, code lost:
        if (r6.equals("ig.action.navigation.ExitApp") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        if (r6.equals("ig.action.navigation.OpenLocationPage") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0650, code lost:
        if (r3.equals("long-live") == false) goto L_0x0652;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        if (r6.equals("ig.action.string.EncryptPassword") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        if (r6.equals("bk.action.navigation.SetNavBar") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x07d8, code lost:
        throw new java.lang.RuntimeException("Cannot getScroll off the main thread!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b1, code lost:
        if (r6.equals("ig.action.navigation.SetNavBarButtonEnabled") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bd, code lost:
        if (r6.equals("ig.action.navigation.NativeScreenDemo") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c9, code lost:
        if (r6.equals("ig.action.navigation.OpenActionSheet") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d5, code lost:
        if (r6.equals("ig.action.navigation.OpenOrderReturn") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e1, code lost:
        if (r6.equals("bk.fx.action.GetFamilyDeviceId") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ed, code lost:
        if (r6.equals("bk.fx.action.FetchWebAuthData") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0d3b, code lost:
        return p000X.C53602Tl.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f9, code lost:
        if (r6.equals("bk.action.insights.SetTimeframeHeader") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0dc0, code lost:
        r1 = p000X.AnonymousClass2U3.A02((p000X.AnonymousClass2Tw) r3.A00(1));
        r0 = p000X.AnonymousClass2Tg.A00(r0).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0dd0, code lost:
        if (r0 == null) goto L_0x23b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0dd2, code lost:
        r0.A0u(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0105, code lost:
        if (r6.equals("ig.action.navigation.OpenHashtagFeedWithMediaFocus") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0111, code lost:
        if (r6.equals("ig.action.navigation.OpenManuallyApproveTags") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011d, code lost:
        if (r6.equals("ig.action.navigation.PopBottomSheet") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0129, code lost:
        if (r6.equals("ig.action.navigation.OpenOrderContactMerchant") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x136a, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r5, p000X.AnonymousClass0L7.BIZ_POST_APPROVAL_NUX, "is_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x136c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0135, code lost:
        if (r6.equals("ig.action.linechart.ClearSelection") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0141, code lost:
        if (r6.equals("ig.action.navigation.OpenCountryCodeDialog") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x1630, code lost:
        if (r1 == false) goto L_0x1632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x163f, code lost:
        if (r1 == false) goto L_0x1641;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014d, code lost:
        if (r6.equals("ig.action.logging.LogEvent") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x164e, code lost:
        if (r0.booleanValue() == false) goto L_0x1650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0159, code lost:
        if (r6.equals("ig.action.navigation.CloseToScreenV2") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0165, code lost:
        if (r6.equals("ig.action.navigation.OpenCreatePostFlow") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x184b, code lost:
        return new p000X.C53692Tv(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0171, code lost:
        if (r6.equals("bk.action.io.clipboard.SetString") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017c, code lost:
        if (r6.equals("bk.action.logging.LogEvent") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0188, code lost:
        if (r6.equals("ig.action.challenges.HandleSuccess") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0194, code lost:
        if (r6.equals("ig.action.perf.AnnotateTTIEvent") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a0, code lost:
        if (r6.equals("ig.action.navigation.LaunchFRXReportingFlow") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ac, code lost:
        if (r6.equals("ig.action.navigation.PushBottomSheet") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b8, code lost:
        if (r6.equals("bk.action.vcollection.GetOffset") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:769:0x1f02, code lost:
        if (r5.A03 != false) goto L_0x23b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c4, code lost:
        if (r6.equals("ig.action.navigation.OpenHashtagFeed") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:771:0x1f0d, code lost:
        if (r9.equals("imbe_producer_nux_details_impression") == false) goto L_0x1ef1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:773:0x1f15, code lost:
        if (r9.equals("imbe_producer_nux_details_dismiss") == false) goto L_0x1ef1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:775:0x1f1f, code lost:
        if (r9.equals("imbe_producer_nux_details_learn_more_click") == false) goto L_0x1ef1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:777:0x1f29, code lost:
        if (r9.equals("imbe_producer_opt_out_setting_click") == false) goto L_0x1ef1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:779:0x1f31, code lost:
        if (r9.equals("imbe_producer_opt_out_setting_dismiss") == false) goto L_0x1ef1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d0, code lost:
        if (r6.equals("ig.action.navigation.OpenPurchaseOptionAddUrl") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:796:0x1f74, code lost:
        if ("story_setting".equals(r1) == false) goto L_0x23b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01dc, code lost:
        if (r6.equals("ig.action.netego_extension_context.GetPercentVisible") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e8, code lost:
        if (r6.equals("ig.action.facebook_account.AuthorizeFb") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f4, code lost:
        if (r6.equals("ig.action.navigation.DismissBottomSheetV2") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0200, code lost:
        if (r6.equals("bk.action.core.Delay") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020c, code lost:
        if (r6.equals("ig.action.challenges.BackToLogin") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r6.equals("ig.action.navigation.OpenViewAds") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:909:0x23b2, code lost:
        return p000X.C53602Tl.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0218, code lost:
        if (r6.equals("ig.action.navigation.OpenCommentsV2") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0224, code lost:
        if (r6.equals("bk.action.navigation.OpenUrl") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0230, code lost:
        if (r6.equals("ig.action.shopping.UpdateShoppingOnboardingState") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x023c, code lost:
        if (r6.equals("ig.action.navigation.ClearChallenge") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0248, code lost:
        if (r6.equals("ig.action.ad4ad.PresentBoostPostV2") == false) goto L_0x0019;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final C53542Te ADQ(C53522Tc r20, C51422Kp r21, C53532Td r22) {
        char c;
        String str;
        String str2;
        String str3;
        String str4;
        C213969Km A0R;
        char c2;
        C49662Dc r9;
        C53542Te r5;
        AnonymousClass6MW r14;
        AnonymousClass6MX r2;
        C52362Om r1;
        AnonymousClass1HD A01;
        C26351Cx r0;
        AnonymousClass2VQ r3;
        FrameLayout frameLayout;
        C53702Tx r8;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        FragmentActivity fragmentActivity;
        int dimensionPixelSize;
        String str5;
        Object obj;
        Integer num;
        Integer num2;
        String str6;
        String str7;
        AnonymousClass0RN r02;
        String str8;
        char c3;
        C12830hS r32;
        String str9 = r20.A00;
        boolean z5 = true;
        switch (str9.hashCode()) {
            case -2127943921:
                c = 'M';
                break;
            case -2117986441:
                c = 6;
                break;
            case -2081136397:
                c = '6';
                break;
            case -2056543270:
                c = 13;
                break;
            case -1949829337:
                c = 'p';
                break;
            case -1866049818:
                c = 'd';
                break;
            case -1842996649:
                c = 16;
                break;
            case -1831559258:
                c = '&';
                break;
            case -1822302432:
                c = '1';
                break;
            case -1738221045:
                c = 'T';
                break;
            case -1604504565:
                c = 'v';
                break;
            case -1576388561:
                c = 'G';
                break;
            case -1558493256:
                c = '=';
                break;
            case -1532641779:
                c = 't';
                break;
            case -1516774558:
                c = '9';
                break;
            case -1481223638:
                c = 20;
                break;
            case -1473289651:
                c = 18;
                break;
            case -1470148149:
                c = 'a';
                break;
            case -1441855192:
                c = 31;
                break;
            case -1440018313:
                c = '^';
                break;
            case -1404814539:
                c = 29;
                break;
            case -1365414890:
                c = '7';
                break;
            case -1315138613:
                c = 'X';
                break;
            case -1310573553:
                c = '>';
                break;
            case -1238382739:
                c = 8;
                break;
            case -1196648023:
                c = '$';
                break;
            case -1194495162:
                c = 'Y';
                break;
            case -1182895194:
                c = 'E';
                break;
            case -1174424168:
                c = 7;
                break;
            case -1110256763:
                c = 'q';
                break;
            case -1085131462:
                c = '@';
                break;
            case -1048817963:
                c = 'g';
                break;
            case -1037784984:
                c = 25;
                break;
            case -1014172836:
                c = 10;
                break;
            case -980898610:
                c = 30;
                break;
            case -975389504:
                c = 'u';
                break;
            case -923308739:
                c = 'R';
                break;
            case -911880941:
                c = '/';
                break;
            case -895354888:
                c = 27;
                break;
            case -882687321:
                c = 12;
                break;
            case -879974383:
                c = ')';
                break;
            case -863558196:
                c = 'F';
                break;
            case -809454050:
                c = '!';
                break;
            case -801187481:
                c = ';';
                break;
            case -741381912:
                c = '(';
                break;
            case -721835802:
                c = 'S';
                break;
            case -703852509:
                c = 'W';
                break;
            case -660984368:
                c = '_';
                break;
            case -643521060:
                c = 'm';
                break;
            case -613837256:
                c = '0';
                break;
            case -606722934:
                c = 2;
                break;
            case -584096380:
                c = 'D';
                break;
            case -577196604:
                c = 'I';
                break;
            case -566455384:
                c = 'N';
                break;
            case -558774848:
                c = '3';
                break;
            case -493437951:
                c = '<';
                break;
            case -489388481:
                c = 'k';
                break;
            case -464489707:
                c = '.';
                break;
            case -423301232:
                c = 'K';
                break;
            case -418412463:
                c = 'i';
                break;
            case -323210966:
                c = 'Z';
                break;
            case -279438679:
                c = 'c';
                break;
            case -259802268:
                c = '8';
                break;
            case -192998245:
                c = 15;
                break;
            case -159700824:
                c = 22;
                break;
            case -109169080:
                c = ' ';
                break;
            case -68639817:
                c = 4;
                break;
            case -28311584:
                c = '-';
                break;
            case 3413278:
                c = 1;
                break;
            case 58145196:
                c = 'l';
                break;
            case 107264602:
                c = 11;
                break;
            case 174306336:
                c = 'w';
                break;
            case 227196513:
                c = '\'';
                break;
            case 234651467:
                c = 'j';
                break;
            case 297160052:
                c = 'P';
                break;
            case 315565602:
                c = 5;
                break;
            case 321881678:
                c = 9;
                break;
            case 328844522:
                c = 0;
                break;
            case 374620744:
                c = 'J';
                break;
            case 413036017:
                c = 'H';
                break;
            case 449184876:
                c = 's';
                break;
            case 569627448:
                c = 23;
                break;
            case 610178701:
                c = 'L';
                break;
            case 682552909:
                c = '#';
                break;
            case 683144274:
                c = 3;
                break;
            case 683874896:
                c = '5';
                break;
            case 732830460:
                c = 'Q';
                break;
            case 738164084:
                c = 14;
                break;
            case 756058799:
                c = '4';
                break;
            case 759380405:
                c = ':';
                break;
            case 801192525:
                c = 'h';
                break;
            case 909172757:
                c = '`';
                break;
            case 914832586:
                c = '%';
                break;
            case 966100787:
                c = 'r';
                break;
            case 987147991:
                c = 24;
                break;
            case 1012234060:
                c = ',';
                break;
            case 1014730603:
                c = 'f';
                break;
            case 1099564086:
                c = '?';
                break;
            case 1119373849:
                c = ']';
                break;
            case 1124573498:
                c = 'e';
                break;
            case 1136914941:
                c = '2';
                break;
            case 1297695855:
                c = 'A';
                break;
            case 1325728765:
                c = '+';
                break;
            case 1353118489:
                c = 'b';
                break;
            case 1355735403:
                c = '[';
                break;
            case 1394265600:
                c = 17;
                break;
            case 1406429093:
                c = 'O';
                break;
            case 1501619878:
                c = 19;
                break;
            case 1545203531:
                c = 'B';
                break;
            case 1637255772:
                c = 'V';
                break;
            case 1639289948:
                c = 26;
                break;
            case 1730083494:
                c = '\\';
                break;
            case 1736658072:
                c = 'C';
                break;
            case 1773406992:
                c = 28;
                break;
            case 1801657397:
                c = 21;
                break;
            case 1852449097:
                c = 'U';
                break;
            case 1967173784:
                c = 'o';
                break;
            case 2066949490:
                c = '\"';
                break;
            case 2087475006:
                c = 'n';
                break;
            case 2098653201:
                c = '*';
                break;
            default:
                c = 65535;
                break;
        }
        ? r15 = 0;
        C51422Kp r33 = r21;
        C53532Td r03 = r22;
        switch (c) {
            case 0:
                String str10 = (String) C51412Ko.A02(r33.A00(0));
                C49662Dc A002 = C53552Tf.A00(r33.A00(2));
                C49662Dc A003 = C53552Tf.A00(r33.A00(3));
                C15540n8 A004 = AnonymousClass2Tg.A00(r03);
                C12830hS r4 = A004.A04;
                C53562Th r23 = new C53562Th(C53572Ti.A01(A004.A03, str10, AnonymousClass2Tg.A02((Map) C51412Ko.A02(r33.A00(1)))));
                r23.A00 = new C53582Tj(r03, A002, A003, str10, A004);
                r4.schedule(r23);
                break;
            case 1:
                String str11 = (String) C51412Ko.A02(r33.A00(0));
                Map map = (Map) C51412Ko.A02(r33.A00(1));
                C49662Dc A005 = C53552Tf.A00(r33.A00(2));
                C49662Dc A006 = C53552Tf.A00(r33.A00(3));
                if (r33.A00.size() > 4) {
                    str8 = (String) C51412Ko.A02(r33.A00(4));
                } else {
                    str8 = "current-screen";
                }
                C15540n8 A007 = AnonymousClass2Tg.A00(r03);
                if (str8.hashCode() == 81705373) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                if (c3 != 0) {
                    r32 = A007.A04;
                    if ((A007 instanceof AnonymousClass1OP) && !((AnonymousClass1OP) A007).A00.isAdded()) {
                        AnonymousClass0QD.A01("bloks_stale_async_action", AnonymousClass000.A0J("Async action tried to schedule app ID ", str11, " but host is already detached."));
                        break;
                    }
                } else {
                    r32 = new C53612Tm();
                }
                C53562Th A008 = C53572Ti.A00(A007.A03, str11, AnonymousClass2Tg.A02(map));
                A008.A00 = new AnonymousClass2Tn(r03, A005, A006, str11, A007);
                r32.schedule(A008);
                break;
            case 2:
                return C53622To.A00(r03, (String) C51412Ko.A02(r33.A00(0)), (Map) C51412Ko.A02(r33.A00(1)), (AnonymousClass2DA) null, (C53632Tp) null, (String) null, false, (Integer) null, (Integer) null);
            case 3:
                String str12 = (String) C51412Ko.A01(r33.A00(0));
                C15470n1 r24 = this.A00;
                Toast toast = r24.A00;
                if (toast != null) {
                    toast.cancel();
                }
                Toast makeText = Toast.makeText(C15500n4.A00().A00, str12, 0);
                r24.A00 = makeText;
                makeText.show();
                break;
            case 4:
                String str13 = (String) C51412Ko.A01(r33.A00(0));
                C15470n1 r25 = this.A00;
                C53642Tq r04 = r25.A01;
                if (r04 != null) {
                    r04.cancel();
                }
                C53642Tq A012 = C53642Tq.A01(C15500n4.A00().A00, str13, 0);
                r25.A01 = A012;
                A012.show();
                break;
            case 5:
                C53652Tr r34 = (C53652Tr) C51412Ko.A01(r33.A00(0));
                C15470n1 r52 = this.A00;
                C51512Ky r42 = new C51512Ky();
                r42.A09 = r34.A02;
                r42.A07 = r34.A01;
                C53662Ts r35 = r34.A00;
                if (r35 != null) {
                    r42.A0B = true;
                    r42.A08 = r35.A01;
                    r42.A05 = new C53672Tt(r52, r35, r03);
                }
                ((BaseFragmentActivity) AnonymousClass2Tg.A00(r03).A00).A0Q().A08(r42.A00());
                break;
            case 6:
                j = System.currentTimeMillis();
                break;
            case 7:
            case 8:
                String str14 = (String) C51412Ko.A01(r33.A00(0));
                String str15 = (String) C51412Ko.A01(r33.A00(1));
                Map map2 = (Map) C51412Ko.A01(r33.A00(2));
                C15540n8 A009 = AnonymousClass2Tg.A00(r03);
                if (str15 != null) {
                    r02 = new AnonymousClass2Tz(str15);
                } else {
                    r02 = A009.A02;
                }
                AnonymousClass0P4 A0010 = AnonymousClass0P4.A00(str14, r02);
                A0010.A04(C15470n1.A00(map2));
                AnonymousClass0WN.A01(A009.A03).BcG(A0010);
                break;
            case 9:
                AnonymousClass2U0 r26 = (AnonymousClass2U0) C51412Ko.A01(r33.A00(0));
                Context context = C15500n4.A00().A00;
                if (AnonymousClass2U1.A00()) {
                    return AnonymousClass2U3.A01((int) C06220Of.A01(context, (float) r26.A0G.A03));
                }
                break;
            case 10:
                AnonymousClass2U0 r27 = (AnonymousClass2U0) C51412Ko.A01(r33.A00(0));
                Context context2 = C15500n4.A00().A00;
                if (AnonymousClass2U1.A00()) {
                    return AnonymousClass2U3.A01((int) C06220Of.A01(context2, (float) r27.A0G.A04));
                }
                break;
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                AnonymousClass2U0 r6 = (AnonymousClass2U0) C51412Ko.A01(r33.A00(0));
                int A0011 = (int) C06220Of.A00(C15500n4.A00().A00, ((AnonymousClass2Tw) r33.A00(1)).floatValue());
                if (((AnonymousClass2Tw) r33.A00(2)).intValue() != 1) {
                    z5 = false;
                }
                if (!AnonymousClass2U1.A00()) {
                    throw new RuntimeException("setXOffset cannot be called from a background thread.");
                } else if (AnonymousClass2U1.A00()) {
                    AnonymousClass2U2 r12 = r6.A0G;
                    RecyclerView recyclerView = r12.A06;
                    if (recyclerView != null) {
                        if (!z5) {
                            recyclerView.scrollBy(A0011, 0);
                            break;
                        } else {
                            recyclerView.A0l(A0011, 0);
                            break;
                        }
                    } else {
                        r12.A01 = A0011;
                        r12.A02 = 0;
                        r12.A08 = z5;
                        break;
                    }
                } else {
                    throw new RuntimeException("Cannot doScrollBy off the main thread!");
                }
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                AnonymousClass0ZA.A09(new Handler(Looper.getMainLooper()), new AnonymousClass2U4(r03, C53552Tf.A00(r33.A00(1))), ((AnonymousClass2Tw) r33.A00(0)).longValue(), -227471018);
                break;
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                return new C53692Tv(System.currentTimeMillis() - ((AnonymousClass2U5) C51412Ko.A01(r33.A00(0))).A02.longValue());
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                j = ((AnonymousClass2U5) C51412Ko.A01(r33.A00(0))).A02.longValue();
                break;
            case 15:
                return AnonymousClass2U3.A01(((AnonymousClass2U5) C51412Ko.A01(r33.A00(0))).A03);
            case 16:
                String str16 = (String) C51412Ko.A01(r33.A00(0));
                FragmentActivity fragmentActivity2 = AnonymousClass2Tg.A00(r03).A00;
                if (!fragmentActivity2.isFinishing()) {
                    HashMap hashMap = new HashMap();
                    if (str16 != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str16);
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                hashMap.put(next, (String) jSONObject.get(next));
                            }
                        } catch (JSONException e) {
                            hashMap.put("error", e.getMessage());
                        }
                    }
                    Intent intent = new Intent();
                    intent.putExtra("bloks_on_activity_result", hashMap);
                    if (((String) hashMap.get("tokenString")) != null) {
                        fragmentActivity2.setResult(-1, intent);
                    } else {
                        fragmentActivity2.setResult(0, intent);
                    }
                    fragmentActivity2.finish();
                    break;
                }
                break;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                C15540n8 A0012 = AnonymousClass2Tg.A00(r03);
                AnonymousClass2U9 A0013 = AnonymousClass2U8.A00(A0012.A00, C05210Iq.A02(A0012.A03), new AnonymousClass2U7());
                HashMap hashMap2 = new HashMap();
                if (A0013 != null) {
                    C53542Te A0014 = C51412Ko.A00(MemoryDumpUploadJob.EXTRA_USER_ID);
                    AnonymousClass2UA r05 = A0013.A00;
                    if (r05 != null) {
                        str7 = r05.A01;
                    } else {
                        str7 = null;
                    }
                    hashMap2.put(A0014, C51412Ko.A00(str7));
                    hashMap2.put(C51412Ko.A00("auth_token"), C51412Ko.A00(A0013.A02));
                }
                return C51412Ko.A00(hashMap2);
            case 18:
                String str17 = (String) C51412Ko.A01(r33.A00(0));
                String str18 = (String) C51412Ko.A01(r33.A00(1));
                C49662Dc A0015 = C53552Tf.A00(r33.A00(2));
                AnonymousClass1OP r53 = (AnonymousClass1OP) AnonymousClass2Tg.A00(r03);
                r53.registerLifecycleListener(new AnonymousClass2UB(r03, A0015, r53));
                AnonymousClass0C1 A02 = C05210Iq.A02(r53.A03);
                AnonymousClass2UC r36 = new AnonymousClass2UC(r53.A00, r53.A03, str17, AnonymousClass2UD.FX_CAL_WEB_AUTH);
                r36.A03(A02.A04());
                if (C06360Ot.A08((CharSequence) null) || C06360Ot.A08(str18)) {
                    r36.A02 = str17;
                    r36.A03 = str18;
                    r36.A07 = true;
                    r36.A04(r53.A02.getModuleName());
                    r36.A08 = true;
                    AnonymousClass2UC.A00(r36, r53.A00, 2884);
                    break;
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("IAB oAuth cannot have both redirectUrl and redirectScheme set");
                    AnonymousClass0QD.A09("ig_auth_not_supported_param", illegalArgumentException);
                    throw illegalArgumentException;
                }
                break;
            case 19:
                C49662Dc A0016 = C53552Tf.A00(r33.A00(1));
                C15540n8 A0017 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A022 = C05210Iq.A02(A0017.A03);
                if (A022.A04().equals((String) C51412Ko.A02(r33.A00(0)))) {
                    C12830hS r43 = A0017.A04;
                    C15890nh r37 = new C15890nh(A022);
                    r37.A09 = Constants.ONE;
                    r37.A0C = "fxcal/get_native_linking_auth_blob/";
                    r37.A06(AnonymousClass2UE.class, false);
                    C17850qu A03 = r37.A03();
                    A03.A00 = new AnonymousClass2UF(r03, A0016);
                    r43.schedule(A03);
                    break;
                } else {
                    C51432Kq r38 = new C51432Kq(r03);
                    ArrayList arrayList = new ArrayList();
                    if (arrayList.size() == 0) {
                        arrayList.add(C51412Ko.A00((Object) null));
                        r38.A00(A0016, new C51422Kp(arrayList));
                        break;
                    } else {
                        throw new IllegalArgumentException("arguments have to be continuous");
                    }
                }
            case 20:
                return C51412Ko.A00(AnonymousClass0OZ.A00(AnonymousClass2Tg.A00(r03).A03).AZO());
            case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                boolean A023 = AnonymousClass2U3.A02((AnonymousClass2Tw) r33.A00(0));
                boolean A024 = AnonymousClass2U3.A02((AnonymousClass2Tw) r33.A00(1));
                AnonymousClass1HD r06 = ((AnonymousClass1OP) AnonymousClass2Tg.A00(r03)).A00;
                FrameLayout frameLayout2 = (FrameLayout) r06.mView;
                Context context3 = r06.getContext();
                if (!(frameLayout2 == null || context3 == null)) {
                    if (!A023) {
                        View findViewById = frameLayout2.findViewById(C0003R.C0005id.spinner);
                        if (findViewById != null) {
                            frameLayout2.removeView(findViewById);
                        }
                        frameLayout2.setAlpha(1.0f);
                        break;
                    } else {
                        SpinnerImageView spinnerImageView = new SpinnerImageView(context3);
                        spinnerImageView.setImageResource(C0003R.C0004drawable.spinner_large);
                        spinnerImageView.setId(C0003R.C0005id.spinner);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.gravity = 17;
                        spinnerImageView.setOnTouchListener(new AnonymousClass2UI());
                        frameLayout2.addView(spinnerImageView, layoutParams);
                        if (A024) {
                            frameLayout2.setAlpha(0.6f);
                            break;
                        }
                    }
                }
                break;
            case C120125Dh.NUM_VIEW_TYPES /*22*/:
                AnonymousClass2UJ r92 = (AnonymousClass2UJ) C51412Ko.A01(r33.A00(0));
                Map map3 = (Map) C51412Ko.A02(r33.A00(1));
                Long l = r92.A04;
                if (l != null) {
                    str6 = l.toString();
                } else {
                    str6 = null;
                }
                return C53622To.A00(r03, r92.A05, map3, r92.A01, r92.A00, str6, r92.A06, r92.A02, r92.A03);
            case 23:
                C15540n8 A0018 = AnonymousClass2Tg.A00(r03);
                AnonymousClass2UK r28 = (AnonymousClass2UK) C51412Ko.A01(r33.A00(0));
                String str19 = r28.A04;
                if (str19 != null) {
                    num2 = Integer.valueOf(AnonymousClass2UL.A00(str19));
                } else {
                    num2 = null;
                }
                AnonymousClass2UN A0019 = AnonymousClass2UM.A00(A0018, r28, num2);
                AnonymousClass2TI A0020 = AnonymousClass2UM.A01(A0018.A03, r28, A0019).A00();
                A0019.A01 = A0020;
                C49672Dd r39 = r28.A01;
                if (r39 != null) {
                    FragmentActivity fragmentActivity3 = A0018.A00;
                    if (C31201Wx.A01(fragmentActivity3) != null) {
                        C31201Wx.A01(fragmentActivity3).A07(new AnonymousClass2UO(r03, r39));
                    }
                }
                A0020.A02(A0018.A00, A0019);
                break;
            case 24:
                C13300iJ r62 = ((AnonymousClass2UP) C51412Ko.A02(r33.A00(0))).A00;
                C15540n8 A0021 = AnonymousClass2Tg.A00(r03);
                AnonymousClass2UQ.A03(AnonymousClass2UQ.A01(C05210Iq.A01(A0021.A03), A0021.A00, r62, false, (String) null, A0021.A02), A0021.A00, A0021.A02);
                break;
            case 25:
                C15540n8 A0022 = AnonymousClass2Tg.A00(r03);
                AnonymousClass2UK r54 = (AnonymousClass2UK) C51412Ko.A01(r33.A00(0));
                boolean A025 = AnonymousClass2U3.A02((AnonymousClass2Tw) r33.A00(1));
                String str20 = r54.A04;
                if (str20 != null) {
                    num = Integer.valueOf(AnonymousClass2UL.A00(str20));
                } else {
                    num = null;
                }
                AnonymousClass2TI r29 = (AnonymousClass2TI) A0022.A00(C0003R.C0005id.bottom_sheet_id, AnonymousClass2TI.class);
                if (r29 != null) {
                    AnonymousClass2UN A0023 = AnonymousClass2UM.A00(A0022, r54, num);
                    A0023.A01 = r29;
                    r29.A09(AnonymousClass2UM.A01(A0022.A03, r54, A0023), A0023, A025);
                    break;
                } else {
                    AnonymousClass0QD.A02("BloksBottomSheetHelper", "Can't push bottom sheet outside of controller");
                    break;
                }
            case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
            case 27:
                C53542Te A0024 = r33.A00(0);
                C53542Te r55 = C53602Tl.A00;
                if (A0024 != r55) {
                    r15 = C53552Tf.A00(A0024);
                }
                AnonymousClass1OP r44 = (AnonymousClass1OP) AnonymousClass2Tg.A00(r03);
                AnonymousClass2TI r310 = (AnonymousClass2TI) r44.A00(C0003R.C0005id.bottom_sheet_id, AnonymousClass2TI.class);
                if (r310 == null) {
                    AnonymousClass0QD.A02("BloksBottomSheetHelper", "Can't dismiss bottom sheet outside of controller");
                    return r55;
                }
                if (r15 != 0) {
                    FragmentActivity fragmentActivity4 = r44.A00;
                    if (C31201Wx.A01(fragmentActivity4) != null) {
                        C31201Wx.A01(fragmentActivity4).A07(new AnonymousClass2UO(r03, r15));
                    }
                }
                r310.A04();
                return r55;
            case 28:
                AnonymousClass2TI r13 = (AnonymousClass2TI) AnonymousClass2Tg.A00(r03).A00(C0003R.C0005id.bottom_sheet_id, AnonymousClass2TI.class);
                int i = 0;
                if (r13 != null) {
                    i = 1;
                }
                return AnonymousClass2U3.A01(i);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                AnonymousClass2TI r07 = (AnonymousClass2TI) ((AnonymousClass1OP) AnonymousClass2Tg.A00(r03)).A00(C0003R.C0005id.bottom_sheet_id, AnonymousClass2TI.class);
                if (r07 != null) {
                    r07.A05();
                    break;
                } else {
                    AnonymousClass0QD.A02("BloksBottomSheetHelper", "Can't pop bottom sheet outside of controller");
                    break;
                }
            case 30:
                C15540n8 A0025 = AnonymousClass2Tg.A00(r03);
                C52362Om r311 = new C52362Om(A0025.A00, A0025.A03);
                r311.A02 = C17910r0.A00.A01().A01((Hashtag) C51412Ko.A02(r33.A00(0)), "blok_view", (String) null);
                r311.A02();
                break;
            case 31:
                Hashtag hashtag = (Hashtag) C51412Ko.A02(r33.A00(0));
                String str21 = (String) C51412Ko.A02(r33.A00(1));
                C15540n8 A0026 = AnonymousClass2Tg.A00(r03);
                String uuid = UUID.randomUUID().toString();
                Bundle bundle = new Bundle();
                AnonymousClass2US r210 = new AnonymousClass2US();
                r210.A01 = hashtag;
                AnonymousClass2UT r312 = new AnonymousClass2UT();
                AnonymousClass2UU r16 = new AnonymousClass2UU();
                r16.A00 = null;
                r16.A02 = new ArrayList();
                r16.A01 = null;
                r312.A02 = new SectionPagination(r16);
                r312.A03 = AnonymousClass2UW.TOP;
                r312.A01 = 0;
                r312.A05 = hashtag.A0A;
                r312.A00 = 10;
                r312.A06 = true;
                r210.A00 = new EntityContextualFeedConfig(r312);
                r210.A02 = uuid;
                bundle.putParcelable("contextual_feed_config", new HashtagContextualFeedConfig(r210));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str21);
                C52362Om r211 = new C52362Om(A0026.A00, A0026.A03);
                C53722Ua A0S = AnonymousClass2UZ.A00().A0S();
                A0S.A02 = "Hashtag";
                A0S.A08 = arrayList2;
                A0S.A04 = str21;
                A0S.A0B = true;
                A0S.A05 = "feed_contextual_hashtag";
                A0S.A00 = bundle;
                A0S.A07 = uuid;
                r211.A02 = A0S.A00();
                r211.A0B = true;
                r211.A02();
                break;
            case ' ':
            case '!':
                String str22 = (String) C51412Ko.A02(r33.A00(0));
                C15540n8 A0027 = AnonymousClass2Tg.A00(r03);
                FragmentActivity fragmentActivity5 = A0027.A00;
                C06590Pq r212 = A0027.A03;
                AnonymousClass0RN r17 = A0027.A02;
                Bundle bundle2 = new Bundle();
                bundle2.putString("original_url", str22);
                bundle2.putString("com.instagram.url.constants.ARGUMENTS_KEY_ANALYTICS_MODULE_NAME", r17.getModuleName());
                bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", r212.getToken());
                Intent A0028 = C53732Ub.A00(fragmentActivity5, str22);
                if (A0028 == null) {
                    AnonymousClass2MW A0029 = C11310el.A00.A00(str22, A0027.A03);
                    if (A0029 != null && (obj = A0029.A00) != null) {
                        C11330en r213 = (C11330en) obj;
                        Object obj2 = A0029.A01;
                        if (obj2 != null) {
                            bundle2.putAll((Bundle) obj2);
                        }
                        bundle2.putBoolean("InstagramUrlLaunchConstants.EXTRA_SHOULD_INCLUDE_BACK_STACK", true);
                        r213.AbA(bundle2, A0027.A00, A0027.A03);
                        break;
                    } else {
                        C06590Pq r313 = A0027.A03;
                        if (!r313.AgN()) {
                            FragmentActivity fragmentActivity6 = A0027.A00;
                            C53742Uc r08 = new C53742Uc(str22);
                            r08.A06 = true;
                            SimpleWebViewActivity.A04(fragmentActivity6, r313, r08.A00());
                            break;
                        } else {
                            AnonymousClass2UC r214 = new AnonymousClass2UC(A0027.A00, r313, str22, AnonymousClass2UD.BLOKS_OPEN_URL);
                            r214.A04(A0027.A02.getModuleName());
                            r214.A01();
                            break;
                        }
                    }
                } else {
                    A0028.putExtra("com.instagram.url.extra.BUNDLE", bundle2);
                    AnonymousClass1BH.A03(A0028, fragmentActivity5);
                    break;
                }
                break;
            case '\"':
                C15540n8 A0030 = AnonymousClass2Tg.A00(r03);
                AnonymousClass1AM r18 = A0030.A01;
                if (r18 != null && r18.A0I() > 0) {
                    r18.A0W();
                    break;
                } else {
                    A0030.A00.onBackPressed();
                    break;
                }
                break;
            case '#':
                str5 = ((Number) r33.A00(0)).toString();
                break;
            case '$':
                str5 = (String) C51412Ko.A02(r33.A00(0));
                break;
            case '%':
                return C53622To.A01(r03, AnonymousClass2Tg.A02((Map) C51412Ko.A02(r33.A00(1))));
            case '&':
                C15540n8 A0031 = AnonymousClass2Tg.A00(r03);
                FragmentActivity fragmentActivity7 = A0031.A00;
                if (!(fragmentActivity7 instanceof BusinessConversionActivity)) {
                    C53622To.A01(r03, (HashMap) null);
                    break;
                } else {
                    fragmentActivity7.setResult(-1);
                    A0031.A00.finish();
                    break;
                }
            case '\'':
                String obj3 = ((Number) r33.A00(0)).toString();
                C15540n8 A0032 = AnonymousClass2Tg.A00(r03);
                if (!(A0032.A00 instanceof BusinessConversionActivity)) {
                    AnonymousClass1AM r09 = AnonymousClass2Tg.A00(r03).A01;
                    if (r09 != null) {
                        r09.A0u(obj3, 1);
                        break;
                    }
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("EXTRA_SCREEN_ID", obj3);
                    A0032.A00.setResult(-1, intent2);
                    A0032.A00.finish();
                    break;
                }
                break;
            case '(':
                C15540n8 A0033 = AnonymousClass2Tg.A00(r03);
                C16960pS r010 = C16960pS.A00;
                FragmentActivity fragmentActivity8 = A0033.A00;
                if (r010.A02(fragmentActivity8)) {
                    fragmentActivity8.finish();
                    break;
                }
                break;
            case ')':
                C15540n8 A0034 = AnonymousClass2Tg.A00(r03);
                C52362Om r215 = new C52362Om(A0034.A00, A0034.A03);
                r215.A02 = C15940nm.A02().A03().A09("");
                r215.A02();
                break;
            case '*':
                C15540n8 A0035 = AnonymousClass2Tg.A00(r03);
                Intent intent3 = new Intent("android.intent.action.MAIN");
                intent3.addCategory("android.intent.category.HOME");
                intent3.setFlags(268435456);
                AnonymousClass1BH.A0F(intent3, A0035.A00);
                break;
            case '+':
                String str23 = (String) C51412Ko.A02(r33.A00(0));
                AnonymousClass1HD r19 = ((AnonymousClass1OP) AnonymousClass2Tg.A00(r03)).A00;
                if (r19 instanceof C53762Uf) {
                    C53762Uf r110 = (C53762Uf) r19;
                    r110.A03.A0F = str23;
                    AnonymousClass1EW.A03(r110.A05.A00).setTitle(str23);
                    break;
                }
                break;
            case ',':
                AnonymousClass2DA r111 = (AnonymousClass2DA) C51412Ko.A01(r33.A00(0));
                AnonymousClass1HD r45 = ((AnonymousClass1OP) AnonymousClass2Tg.A00(r03)).A00;
                if (r45 instanceof C53762Uf) {
                    C53762Uf r46 = (C53762Uf) r45;
                    AnonymousClass2DG A04 = C15500n4.A00().A04(r111);
                    IgBloksScreenConfig igBloksScreenConfig = r46.A03;
                    if (igBloksScreenConfig.A08 != null) {
                        C53772Uh.A00(igBloksScreenConfig.A05).A02(igBloksScreenConfig.A08.intValue());
                    }
                    igBloksScreenConfig.A02 = A04;
                    FrameLayout frameLayout3 = r46.A02;
                    if (frameLayout3 != null) {
                        C15500n4.A00();
                        C15500n4.A02(frameLayout3);
                        C15500n4.A03(C15500n4.A00(), r46.A05, A04, r46.A02, false);
                        break;
                    } else {
                        FrameLayout frameLayout4 = new FrameLayout(r46.getContext());
                        r46.A02 = frameLayout4;
                        C15500n4.A03(C15500n4.A00(), r46.A05, A04, frameLayout4, false);
                        FrameLayout frameLayout5 = r46.A02;
                        if (r46.A0C) {
                            dimensionPixelSize = 0;
                        } else {
                            dimensionPixelSize = r46.getResources().getDimensionPixelSize(C0003R.dimen.action_bar_item_padding);
                        }
                        AnonymousClass1EW.A03(r46.A05.A00).Bh0(frameLayout5, dimensionPixelSize, 0);
                        break;
                    }
                }
                break;
            case '-':
                return AnonymousClass2U3.A01(C12800hP.A0M(C05210Iq.A02(AnonymousClass2Tg.A00(r03).A03), C51412Ko.A03(r33.A00(0))));
            case '.':
                String A0036 = C14100jl.A00(C05210Iq.A02(AnonymousClass2Tg.A00(r03).A03));
                if (A0036 == null) {
                    A0036 = "";
                }
                return C51412Ko.A00(A0036);
            case '/':
                ArrayList A032 = C51412Ko.A03(r33.A00(0));
                C49662Dc A0037 = C53552Tf.A00(r33.A00(1));
                C49662Dc A0038 = C53552Tf.A00(r33.A00(2));
                C49662Dc A0039 = C53552Tf.A00(r33.A00(3));
                AnonymousClass1OP r47 = (AnonymousClass1OP) AnonymousClass2Tg.A00(r03);
                r47.registerLifecycleListener(new C53782Ui(r47, r03, A0037, A0038, A0039));
                C12800hP.A09(C05210Iq.A02(r47.A03), r47.A00, A032);
                break;
            case '0':
                C15540n8 A0040 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A026 = C05210Iq.A02(A0040.A03);
                C52362Om r216 = new C52362Om(A0040.A00, A026);
                r216.A02 = C18980sj.A00.A00().A02(C52902Qq.A01(A026, (String) C51412Ko.A02(r33.A00(0)), (String) C51412Ko.A02(r33.A00(1)), "bloks").A03());
                r216.A02();
                break;
            case '1':
                C15540n8 A0041 = AnonymousClass2Tg.A00(r03);
                C52362Om r112 = new C52362Om(A0041.A00, C05210Iq.A02(A0041.A03));
                r112.A02 = C16230oG.A00.getFragmentFactory().Apr((String) C51412Ko.A02(r33.A00(0)));
                r112.A02();
                break;
            case AMD.MAX_LIKES_PER_FETCH /*50*/:
                C15540n8 A0042 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A027 = C05210Iq.A02(A0042.A03);
                Bundle bundle3 = new Bundle();
                bundle3.putString("IgSessionManager.SESSION_TOKEN_KEY", A027.getToken());
                FragmentActivity fragmentActivity9 = A0042.A00;
                C52362Om r48 = new C52362Om(fragmentActivity9, A027);
                r48.A0B = true;
                r48.A08(C17480qJ.A00.A00().A01(A027.getToken(), "story_live_and_igtv", fragmentActivity9.getApplicationContext().getString(C0003R.string.live_and_igtv_notification_settings_title)), bundle3);
                r48.A02();
                break;
            case '3':
                C15540n8 A0043 = AnonymousClass2Tg.A00(r03);
                C52362Om r113 = new C52362Om(A0043.A00, C05210Iq.A02(A0043.A03));
                r113.A02 = AnonymousClass2UZ.A00().A0I((String) C51412Ko.A02(r33.A00(0)));
                r113.A02();
                break;
            case '4':
                int intValue = ((AnonymousClass2Tw) r33.A00(0)).intValue();
                int intValue2 = ((AnonymousClass2Tw) r33.A00(1)).intValue();
                C49662Dc A0044 = C53552Tf.A00(r33.A00(4));
                C15540n8 A0045 = AnonymousClass2Tg.A00(r03);
                C52362Om r217 = new C52362Om(A0045.A00, A0045.A03);
                C17510qM.A00.A0V();
                C53812Ul r114 = new C53812Ul(r03, A0044);
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("in_app_signup_flow", true);
                bundle4.putInt("in_app_signup_stepper_index", intValue);
                bundle4.putInt("in_app_signup_stepper_capacity", intValue2);
                bundle4.putString("in_app_signup_catalog_selection_title_text", (String) C51412Ko.A02(r33.A00(9)));
                bundle4.putString("in_app_signup_bottom_button_text", (String) C51412Ko.A02(r33.A00(2)));
                bundle4.putString("in_app_signup_bottom_button_route", (String) C51412Ko.A02(r33.A00(3)));
                bundle4.putString("waterfall_id", (String) C51412Ko.A02(r33.A00(5)));
                bundle4.putString("entry_point", (String) C51412Ko.A02(r33.A00(6)));
                bundle4.putString("presentation_style", (String) C51412Ko.A02(r33.A00(8)));
                bundle4.putString("prior_module_name", (String) C51412Ko.A02(r33.A00(7)));
                C53822Um r011 = new C53822Um();
                r011.A00 = r114;
                r011.setArguments(bundle4);
                r217.A02 = r011;
                r217.A02();
                break;
            case '5':
                C15540n8 A0046 = AnonymousClass2Tg.A00(r03);
                C52952Qw.A0A(C05210Iq.A02(A0046.A03), A0046.A00, (String) C51412Ko.A02(r33.A00(0)));
                break;
            case '6':
                C15540n8 A0047 = AnonymousClass2Tg.A00(r03);
                C52952Qw.A09(C05210Iq.A02(A0047.A03), A0047.A00, (String) C51412Ko.A02(r33.A00(0)));
                break;
            case '7':
                r33.A00(3);
                C15540n8 A0048 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A028 = C05210Iq.A02(A0048.A03);
                FragmentActivity fragmentActivity10 = A0048.A00;
                Bundle bundle5 = new Bundle();
                bundle5.putString("invoice_id", (String) C51412Ko.A02(r33.A00(0)));
                bundle5.putString("order_item_id", (String) C51412Ko.A02(r33.A00(1)));
                bundle5.putString("referrer", (String) C51412Ko.A02(r33.A00(2)));
                C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(A028);
                newReactNativeLauncher.BkI("IgOrderContactMerchantRoute");
                newReactNativeLauncher.BlH(fragmentActivity10.getString(C0003R.string.order_contact_merchant_title));
                newReactNativeLauncher.Bjt(bundle5);
                newReactNativeLauncher.BrT(fragmentActivity10).A02();
                break;
            case '8':
                r33.A00(3);
                C15540n8 A0049 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A029 = C05210Iq.A02(A0049.A03);
                FragmentActivity fragmentActivity11 = A0049.A00;
                Bundle bundle6 = new Bundle();
                bundle6.putString("invoice_id", (String) C51412Ko.A02(r33.A00(0)));
                bundle6.putString("order_item_id", (String) C51412Ko.A02(r33.A00(1)));
                bundle6.putString("referrer", (String) C51412Ko.A02(r33.A00(2)));
                C53832Un newReactNativeLauncher2 = C16920pO.getInstance().newReactNativeLauncher(A029);
                newReactNativeLauncher2.BkI("IgOrderDisputeStatusRoute");
                newReactNativeLauncher2.BlH(fragmentActivity11.getString(C0003R.string.order_dispute_status_title));
                newReactNativeLauncher2.Bjt(bundle6);
                newReactNativeLauncher2.BrT(fragmentActivity11).A02();
                break;
            case '9':
                r33.A00(3);
                C15540n8 A0050 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0210 = C05210Iq.A02(A0050.A03);
                FragmentActivity fragmentActivity12 = A0050.A00;
                Bundle bundle7 = new Bundle();
                bundle7.putString("invoice_id", (String) C51412Ko.A02(r33.A00(0)));
                bundle7.putString("order_item_id", (String) C51412Ko.A02(r33.A00(1)));
                bundle7.putString("referrer", (String) C51412Ko.A02(r33.A00(2)));
                C53832Un newReactNativeLauncher3 = C16920pO.getInstance().newReactNativeLauncher(A0210);
                newReactNativeLauncher3.BkI("IgOrderReturnRoute");
                newReactNativeLauncher3.BlH(fragmentActivity12.getString(C0003R.string.order_return_title));
                newReactNativeLauncher3.Bjt(bundle7);
                newReactNativeLauncher3.BrT(fragmentActivity12).A02();
                break;
            case ':':
                r33.A00(3);
                C15540n8 A0051 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0211 = C05210Iq.A02(A0051.A03);
                FragmentActivity fragmentActivity13 = A0051.A00;
                Bundle bundle8 = new Bundle();
                bundle8.putString("invoice_id", (String) C51412Ko.A02(r33.A00(0)));
                bundle8.putString("order_item_id", (String) C51412Ko.A02(r33.A00(1)));
                bundle8.putString("referrer", (String) C51412Ko.A02(r33.A00(2)));
                C53832Un newReactNativeLauncher4 = C16920pO.getInstance().newReactNativeLauncher(A0211);
                newReactNativeLauncher4.BkI("IgOrderCancellationRoute");
                newReactNativeLauncher4.BlH(fragmentActivity13.getString(C0003R.string.order_cancellation_title));
                newReactNativeLauncher4.Bjt(bundle8);
                newReactNativeLauncher4.BrT(fragmentActivity13).A02();
                break;
            case ';':
                AnonymousClass0C1 A0212 = C05210Iq.A02(AnonymousClass2Tg.A00(r03).A03);
                A0212.A06.A09 = (C468621e) C468621e.A01.get((String) C51412Ko.A02(r33.A00(0)));
                if (C52952Qw.A0F(A0212)) {
                    C26941Fw A0K = C17510qM.A00.A0K(A0212);
                    if (!A0K.A04) {
                        if (A0K.A05) {
                            AnonymousClass0C1 r56 = A0K.A06;
                            if (C52952Qw.A0F(r56)) {
                                z4 = true;
                                break;
                            }
                        }
                        z4 = false;
                        if (z4 && (fragmentActivity = A0K.A02) != null) {
                            C53842Uo r314 = new C53842Uo(fragmentActivity);
                            Drawable A033 = C019000b.A03(fragmentActivity, C0003R.C0004drawable.instagram_shopping_signup_assets_shopping_icon);
                            r314.A0B.setVisibility(0);
                            r314.A0B.setImageDrawable(A033);
                            r314.A03(C0003R.string.tagging_product_dialog_title);
                            r314.A02(C0003R.string.tagging_product_dialog_message);
                            r314.A05(C0003R.string.tagging_product_dialog_try_it, new C53852Up(A0K));
                            r314.A04(C0003R.string.influencers_nux_dialog_not_now, new C53862Uq(A0K));
                            r314.A00.show();
                            break;
                        }
                    } else {
                        C52952Qw.A08(A0K.A01, A0K.A06);
                        break;
                    }
                }
                break;
            case '<':
                C53872Ur r49 = (C53872Ur) C51412Ko.A01(r33.A00(0));
                AnonymousClass1OP r57 = (AnonymousClass1OP) AnonymousClass2Tg.A00(r03);
                FragmentActivity fragmentActivity14 = r57.A00;
                C53882Us.A01();
                Intent intent4 = new Intent(fragmentActivity14, BusinessConversionActivity.class);
                Bundle bundle9 = new Bundle();
                bundle9.putString("IgSessionManager.SESSION_TOKEN_KEY", C05210Iq.A02(r57.A03).getToken());
                bundle9.putParcelable("EXTRA_FB_OVERRIDE_DATA", new PageSelectionOverrideData(r49.A01.intValue(), r49.A00.intValue(), r49.A08, r49.A04, r49.A03, r49.A02, r49.A09, r49.A07, r49.A06));
                bundle9.putString("entry_point", r49.A05);
                bundle9.putInt("business_account_flow", C53892Uu.A00(Constants.A0j));
                bundle9.putBoolean("EXTRA_DISABLE_ACTIVITY_TRANSITION_ANIMATION", true);
                intent4.putExtras(bundle9);
                r57.registerLifecycleListener(new AnonymousClass2Uv(r03, r57));
                AnonymousClass1BH.A0B(intent4, 1000, r57.A00);
                fragmentActivity14.overridePendingTransition(0, 0);
                break;
            case '=':
                AnonymousClass2Tg.A00(r03);
                C53902Uw.A00(r03, C53552Tf.A00(r33.A00(0)));
                break;
            case '>':
                C06590Pq r58 = AnonymousClass2Tg.A00(r03).A03;
                C49662Dc A0052 = C53552Tf.A00(r33.A00(0));
                C15540n8 A0053 = AnonymousClass2Tg.A00(r03);
                AnonymousClass2Ux r218 = new AnonymousClass2Ux();
                Bundle bundle10 = new Bundle();
                C05230Is.A00(r58, bundle10);
                r218.setArguments(bundle10);
                r218.A01 = new AnonymousClass2Uy(r03, A0052);
                r218.A06(A0053.A01, (String) null);
                break;
            case '?':
                AnonymousClass2UL.A06((String) C51412Ko.A02(r33.A00(0)), ((AnonymousClass2Tw) r33.A00(1)).intValue());
                break;
            case '@':
                int intValue3 = ((AnonymousClass2Tw) r33.A00(1)).intValue();
                for (Map.Entry entry : AnonymousClass2Tg.A02((Map) C51412Ko.A02(r33.A00(0))).entrySet()) {
                    AnonymousClass2UL.A05(intValue3, (String) entry.getKey(), (String) entry.getValue());
                }
                break;
            case 'A':
                String str24 = (String) C51412Ko.A02(r33.A00(0));
                int intValue4 = ((AnonymousClass2Tw) r33.A00(1)).intValue();
                if (!str24.equals("success")) {
                    if (!str24.equals(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE)) {
                        if (str24.equals("cancel")) {
                            AnonymousClass2UL.A01(intValue4);
                            break;
                        }
                    } else {
                        AnonymousClass2UL.A02(intValue4);
                        break;
                    }
                } else {
                    AnonymousClass2UL.A03(intValue4);
                    break;
                }
                break;
            case 'B':
                AnonymousClass00B.A01.markerEnd(((AnonymousClass2Tw) r33.A00(0)).intValue(), ((AnonymousClass2Tw) r33.A00(1)).intValue(), (short) ((AnonymousClass2Tw) r33.A00(2)).intValue());
                break;
            case 'C':
                C15540n8 A0054 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0213 = C05210Iq.A02(A0054.A03);
                C52362Om r315 = new C52362Om(A0054.A00, A0213);
                C18320rf.A00.A04();
                Bundle bundle11 = new Bundle();
                bundle11.putString("IgSessionManager.SESSION_TOKEN_KEY", A0213.getToken());
                RestrictHomeFragment restrictHomeFragment = new RestrictHomeFragment();
                restrictHomeFragment.setArguments(bundle11);
                r315.A02 = restrictHomeFragment;
                r315.A02();
                break;
            case 'D':
                AnonymousClass2V2 r63 = (AnonymousClass2V2) C51412Ko.A01(r33.A00(0));
                AnonymousClass2OA r59 = new AnonymousClass2OA(AnonymousClass2Tg.A00(r03).A00);
                r59.A0U(r63.A07);
                r59.A0V(r63.A06);
                String str25 = r63.A05;
                if (str25 != null && !str25.isEmpty()) {
                    r59.A03 = str25;
                }
                String str26 = r63.A04;
                if (str26 != null && !str26.isEmpty()) {
                    r59.A0M(str26);
                }
                AnonymousClass2V3 r115 = r63.A02;
                if (r115 != null) {
                    r59.A0S(r115.A02, new AnonymousClass2V4(r03, r115), r115.A03, r115.A01);
                }
                AnonymousClass2V3 r116 = r63.A00;
                if (r116 != null) {
                    r59.A0Q(r116.A02, new AnonymousClass2V5(r03, r116), r116.A03, r116.A01);
                }
                AnonymousClass2V3 r117 = r63.A01;
                if (r117 != null) {
                    r59.A0R(r117.A02, new AnonymousClass2V6(r03, r117), r117.A03, r117.A01);
                }
                if (r63.A03 != null) {
                    r59.A0E(new AnonymousClass2V7(r03, r63));
                }
                r59.A03().show();
                break;
            case 'E':
                ((ClipboardManager) AnonymousClass2Tg.A00(r03).A00.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence) null, (String) C51412Ko.A02(r33.A00(0))));
                break;
            case 'F':
                AnonymousClass2V8 r64 = (AnonymousClass2V8) C51412Ko.A01(r33.A00(0));
                C15540n8 A0055 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0214 = C05210Iq.A02(A0055.A03);
                AnonymousClass2VA A0056 = C16980pU.A00.A00().A00(r64.A04);
                Boolean bool = r64.A02;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    z = true;
                    break;
                }
                z = false;
                A0056.A06(z);
                Boolean bool2 = r64.A01;
                if (bool2 != null) {
                    boolean booleanValue2 = bool2.booleanValue();
                    z2 = true;
                    break;
                }
                z2 = false;
                A0056.A05(z2);
                Boolean bool3 = r64.A00;
                if (bool3 != null) {
                    z3 = true;
                    break;
                }
                z3 = false;
                A0056.A00.putBoolean("CommentThreadFragment.HIDE_EMOJI_BAR", z3);
                A0056.A00.putBoolean("CommentThreadFragment.SHOW_SINGLE_MEDIA_TITLE", true);
                Integer num3 = r64.A03;
                if (num3 != null) {
                    A0056.A00.putInt("CommentThreadFragment.SCROLL_BEHAVIOR", num3.intValue());
                }
                C52362Om r118 = new C52362Om(A0055.A00, A0214);
                r118.A02 = A0056.A00();
                r118.A02();
                break;
            case 'G':
                String str27 = (String) C51412Ko.A02(r33.A00(0));
                if (!"start".equals(str27)) {
                    if ("end".equals(str27)) {
                        int intValue5 = ((AnonymousClass2Tw) r33.A00(1)).intValue();
                        boolean A0215 = AnonymousClass2U3.A02((AnonymousClass2Tw) r33.A00(2));
                        AnonymousClass1HD r316 = ((AnonymousClass1OP) AnonymousClass2Tg.A00(r03)).A00;
                        if (r316 instanceof C53762Uf) {
                            C53762Uf r317 = (C53762Uf) r316;
                            IgBloksScreenConfig igBloksScreenConfig2 = r317.A03;
                            if (igBloksScreenConfig2.A0H == null) {
                                igBloksScreenConfig2.A0H = new HashMap();
                            }
                            igBloksScreenConfig2.A0H.put(Integer.valueOf(intValue5), Boolean.valueOf(A0215));
                            AnonymousClass1EW.A03(r317.A05.A00).AD4(intValue5, A0215);
                            break;
                        }
                    }
                } else {
                    int intValue6 = ((AnonymousClass2Tw) r33.A00(1)).intValue();
                    boolean A0216 = AnonymousClass2U3.A02((AnonymousClass2Tw) r33.A00(2));
                    AnonymousClass1HD r318 = ((AnonymousClass1OP) AnonymousClass2Tg.A00(r03)).A00;
                    if (r318 instanceof C53762Uf) {
                        C53762Uf r319 = (C53762Uf) r318;
                        IgBloksScreenConfig igBloksScreenConfig3 = r319.A03;
                        if (igBloksScreenConfig3.A0G == null) {
                            igBloksScreenConfig3.A0G = new HashMap();
                        }
                        igBloksScreenConfig3.A0G.put(Integer.valueOf(intValue6), Boolean.valueOf(A0216));
                        AnonymousClass1EW.A03(r319.A05.A00).AD1(intValue6, A0216);
                        break;
                    }
                }
                break;
            case 'H':
                AnonymousClass2VB r012 = (AnonymousClass2VB) AnonymousClass2Tg.A00(r03).A00(C0003R.C0005id.story_playback_handler, AnonymousClass2VB.class);
                if (r012 != null) {
                    ReelViewerFragment.A0R(r012.A00.A01);
                    break;
                }
                break;
            case 'I':
                AnonymousClass2VD r410 = (AnonymousClass2VD) AnonymousClass2Tg.A00(r03).A00(C0003R.C0005id.bloks_action_listener, AnonymousClass2VD.class);
                if (r410 != null && r33.A00.size() > 1) {
                    Integer A0057 = AnonymousClass2OB.A00((String) C51412Ko.A01(r33.A00(1)));
                    if (A0057 != Constants.A0N) {
                        r410.A03.BGt(r410.A02, A0057, (Bundle) null);
                        break;
                    } else {
                        r410.A03.BGu(r410.A02);
                        break;
                    }
                }
            case 'J':
                AnonymousClass2VD r510 = (AnonymousClass2VD) AnonymousClass2Tg.A00(r03).A00(C0003R.C0005id.bloks_action_listener, AnonymousClass2VD.class);
                if (r510 != null && r33.A00.size() > 0) {
                    r510.A03.AbU(r510.A02, AnonymousClass2OB.A00((String) C51412Ko.A01(r33.A00(0))));
                    break;
                }
            case 'K':
                AnonymousClass2VD r013 = (AnonymousClass2VD) AnonymousClass2Tg.A00(r03).A00(C0003R.C0005id.bloks_action_listener, AnonymousClass2VD.class);
                if (r013 != null) {
                    r013.A03.A8X();
                    break;
                }
                break;
            case 'L':
                return C51412Ko.A00(((AnonymousClass2VE) AnonymousClass2Tg.A00(r03).A03.AVA(AnonymousClass2VE.class, new AnonymousClass2VF())).A00);
            case 'M':
                String obj4 = ((AnonymousClass2Tw) r33.A00(0)).toString();
                C15540n8 A0058 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0217 = C05210Iq.A02(A0058.A03);
                C52362Om r411 = new C52362Om(A0058.A00, A0217);
                C22140xu.A00.A00();
                String token = A0217.getToken();
                Bundle bundle12 = new Bundle();
                ViewAdsHomeFragment viewAdsHomeFragment = new ViewAdsHomeFragment();
                bundle12.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
                bundle12.putString("ViewAds.TARGET_USER_ID", obj4);
                viewAdsHomeFragment.setArguments(bundle12);
                r411.A02 = viewAdsHomeFragment;
                r411.A02();
                break;
            case 'N':
                return new AnonymousClass2VI(((AnonymousClass2U5) C51412Ko.A01(r33.A00(0))).A00);
            case 'O':
                j = ((AnonymousClass2U5) C51412Ko.A01(r33.A00(0))).A01;
                break;
            case 'P':
                C53542Te A0059 = r33.A00(0);
                if (A0059 instanceof C53552Tf) {
                    r15 = C53552Tf.A00(A0059);
                }
                AnonymousClass1OP r219 = (AnonymousClass1OP) AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0218 = C05210Iq.A02(r219.A03);
                if (r15 != 0) {
                    r8 = new C53702Tx(r03, r15, A0218);
                } else {
                    r8 = null;
                }
                C31121Wn r320 = new C31121Wn(A0218, r219.A00, r219.A01, A0218.A06, r8, (C52972Qy) null, Constants.A13);
                r219.registerLifecycleListener(new C53712Ty(r320, r219));
                Context context4 = r219.A00.getContext();
                if (context4 != null) {
                    r320.A06(context4);
                    break;
                }
                break;
            case 'Q':
                AnonymousClass2U6 r014 = (AnonymousClass2U6) AnonymousClass2Tg.A00(r03).A00(C0003R.C0005id.open_share_sheet_handler, AnonymousClass2U6.class);
                if (r014 != null) {
                    r014.BWg();
                    break;
                }
                break;
            case 'R':
                return new AnonymousClass2VI(((C51402Kn) C51412Ko.A01(r33.A00(0))).A00);
            case 'S':
                AnonymousClass2VJ r511 = (AnonymousClass2VJ) C51412Ko.A02(r33.A00(0));
                C15540n8 A0060 = AnonymousClass2Tg.A00(r03);
                C06590Pq r220 = A0060.A03;
                AnonymousClass1HD r119 = ((AnonymousClass1OP) A0060).A00;
                if (r220.AgN()) {
                    AnonymousClass2VK A013 = C18360rj.A00.A01(r511.A01, "bloks", C05210Iq.A02(r220), r119.getContext());
                    A013.A0B = r511.A02;
                    A013.A0C = r511.A03;
                    String str28 = r511.A00;
                    if (str28 != null) {
                        A013.A08 = str28;
                    }
                    A013.A01();
                    break;
                }
                break;
            case 'T':
                return C51412Ko.A00(new AnonymousClass2VL(AnonymousClass2Tg.A00(r03).A03).encodePassword((String) C51412Ko.A02(r33.A00(0))));
            case 'U':
                C16290oM.A00.A01(C05210Iq.A02(AnonymousClass2Tg.A00(r03).A03), ((AnonymousClass2Tw) r33.A00(0)).intValue());
                break;
            case 'V':
                C51382Kl A0061 = C15430mx.A00(r03);
                AnonymousClass2VM r412 = (AnonymousClass2VM) C51412Ko.A02(r33.A00(0));
                A0061.A00.A03(r412.AIE(), new AnonymousClass2VN(r412, A0061, C51412Ko.A03(r33.A00(1))));
                break;
            case 'W':
                break;
            case 'X':
                AnonymousClass2VP r015 = (AnonymousClass2VP) C51412Ko.A02(r33.A00(0));
                if (!(r015 == null || (r3 = (AnonymousClass2VQ) r015.getView()) == null || (frameLayout = r3.A02) == null)) {
                    AnonymousClass2VR r016 = r3.A03;
                    if (r016 != null) {
                        frameLayout.removeView(r016);
                        r3.A03 = null;
                    }
                    if (!r3.A08.isEmpty()) {
                        for (AnonymousClass2VS removeView : r3.A08) {
                            r3.A02.removeView(removeView);
                        }
                        r3.A08.clear();
                        break;
                    }
                }
                break;
            case 'Y':
                C15540n8 A0062 = AnonymousClass2Tg.A00(r03);
                C16330oQ.A00.A04(A0062.A00, new AnonymousClass2VT(A0062), C05210Iq.A02(A0062.A03)).BpO(Constants.ZERO, Constants.A0N);
                break;
            case 'Z':
                FragmentActivity fragmentActivity15 = AnonymousClass2Tg.A00(r03).A00;
                boolean z6 = false;
                if (fragmentActivity15 instanceof C26351Cx) {
                    r0 = (C26351Cx) fragmentActivity15;
                } else if (!(fragmentActivity15 instanceof ModalActivity) || C26421Df.A00() == null) {
                    r0 = null;
                } else {
                    r0 = (C26351Cx) C26421Df.A00();
                    z6 = true;
                }
                if (r0 != null) {
                    r0.AHp().BpO(Constants.ZERO, Constants.A0j);
                    if (z6) {
                        fragmentActivity15.finish();
                        break;
                    }
                }
                break;
            case '[':
                AnonymousClass1D1 r321 = (AnonymousClass1D1) AnonymousClass2Tg.A00(r03).A00;
                if (r321 != null) {
                    C27171Gt r221 = new C27171Gt();
                    r221.A00 = r321.AIZ().A05();
                    r221.A0B = true;
                    r221.A09 = "camera_action_organic_insights";
                    r221.A03 = AnonymousClass2TV.NORMAL;
                    r321.Bsx(r221);
                    break;
                }
                break;
            case '\\':
                C15540n8 A0063 = AnonymousClass2Tg.A00(r03);
                C17660qb.A00.A0B(A0063.A00, C05210Iq.A02(A0063.A03), AnonymousClass2VU.IG_INSIGHTS);
                break;
            case ']':
                String str29 = (String) C51412Ko.A02(r33.A00(0));
                C15540n8 A0064 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0219 = C05210Iq.A02(A0064.A03);
                AnonymousClass2VV.A02();
                AnonymousClass2VW.A03(A0219, str29, C14100jl.A01(A0219), (String) null);
                if (((Boolean) AnonymousClass0L6.A02(A0219, AnonymousClass0L7.PROMOTE_MEDIA_PICKER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    r1 = new C52362Om(A0064.A00, A0219);
                    A01 = C16310oO.A00.A03().A01(str29, (String) null);
                } else {
                    r1 = new C52362Om(A0064.A00, A0219);
                    A01 = C16310oO.A00.A00().A01(str29, (String) null);
                }
                r1.A02 = A01;
                r1.A02();
                break;
            case '^':
                C15540n8 A0065 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0220 = C05210Iq.A02(A0065.A03);
                C52362Om r413 = new C52362Om(A0065.A00, A0220);
                r413.A02 = C18980sj.A00.A00().A08(A0220.A04(), A0220.A06.AZn(), 0, false);
                r413.A02();
                break;
            case '_':
                C15540n8 A0066 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0221 = C05210Iq.A02(A0066.A03);
                FragmentActivity fragmentActivity16 = A0066.A00;
                C28341Li r414 = new C28341Li(fragmentActivity16, A0221, AnonymousClass1L8.A00(fragmentActivity16));
                InsightsStoryViewerController insightsStoryViewerController = new InsightsStoryViewerController(fragmentActivity16);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add((String) C51412Ko.A02(r33.A00(0)));
                r414.A02(InsightsStoryViewerController.A00(arrayList3, A0221), insightsStoryViewerController.A01(new C53922Va(A0221, insightsStoryViewerController, A0066), AnonymousClass1OY.BUSINESS_INSIGHTS));
                break;
            case '`':
                C49662Dc A0067 = C53552Tf.A00(r33.A00(0));
                String str30 = (String) C51412Ko.A01(r33.A00(1));
                String str31 = (String) C51412Ko.A01(r33.A00(2));
                String str32 = (String) C51412Ko.A01(r33.A00(3));
                String str33 = (String) C51412Ko.A01(r33.A00(4));
                AnonymousClass1OP r65 = (AnonymousClass1OP) AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0222 = C05210Iq.A02(r65.A03);
                r65.registerLifecycleListener(new C53942Vc(A0067, r03, r65));
                C53952Vd r415 = new C53952Vd(str31);
                String uuid2 = UUID.randomUUID().toString();
                if (!"add".equals(str30)) {
                    if ("edit".equals(str30)) {
                        C53962Ve.A01(A0222, r415, uuid2, str32, str33);
                        C17510qM.A00.A0p(r65.A00, A0222, uuid2, r415.getModuleName());
                        break;
                    }
                } else {
                    C53962Ve.A00(A0222, r415, uuid2, str32, str33);
                    C17510qM.A00.A0o(r65.A00, A0222, uuid2, str31);
                    break;
                }
                break;
            case 'a':
                String str34 = (String) C51412Ko.A02(r33.A00(0));
                String str35 = (String) C51412Ko.A02(r33.A00(1));
                C53542Te A0068 = r33.A00(2);
                C15540n8 A0069 = AnonymousClass2Tg.A00(r03);
                C53542Te r222 = C53602Tl.A00;
                if (A0068 != r222) {
                    r15 = new C53972Vf(this, A0068, r03);
                }
                AnonymousClass1HD r512 = ((AnonymousClass1OP) A0069).A00;
                if (r512 instanceof C53762Uf) {
                    C53762Uf r513 = (C53762Uf) r512;
                    View findViewById2 = AnonymousClass1EW.A03(r513.getActivity()).AYU().findViewById(C0003R.C0005id.timeframe_header_container);
                    boolean z7 = false;
                    if (findViewById2 != null) {
                        z7 = true;
                    }
                    if (findViewById2 == null) {
                        findViewById2 = LayoutInflater.from(r513.getRootActivity()).inflate(C0003R.layout.insights_timeframe_header, (ViewGroup) null);
                    }
                    ((TextView) findViewById2.requireViewById(C0003R.C0005id.timeframe_header_title)).setText(str34);
                    TextView textView = (TextView) findViewById2.requireViewById(C0003R.C0005id.timeframe_header_subtitle);
                    textView.setText(str35);
                    if (r15 != 0) {
                        findViewById2.setOnClickListener(r15);
                        textView.setCompoundDrawables((Drawable) null, (Drawable) null, C019000b.A03(r513.getContext(), C0003R.C0004drawable.instagram_chevron_down_outline_12), (Drawable) null);
                        textView.setCompoundDrawablePadding(4);
                    }
                    if (!z7) {
                        int A0223 = AnonymousClass1BA.A02(r513.getRootActivity(), C0003R.attr.actionBarButtonWidth);
                        FrameLayout frameLayout6 = r513.A02;
                        if (frameLayout6 != null) {
                            C15500n4.A00();
                            C15500n4.A02(frameLayout6);
                            r513.A02 = null;
                        }
                        AnonymousClass1EW.A03(r513.A05.A00).Bh0(findViewById2, 0, A0223);
                    }
                }
                return r222;
            case 'b':
                C15540n8 A0070 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0224 = C05210Iq.A02(A0070.A03);
                AnonymousClass2VW.A01(A0224, (String) C51412Ko.A02(r33.A00(0)));
                AnonymousClass609.A00(A0070.A00, A0224);
                break;
            case 'c':
                C15540n8 A0071 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0225 = C05210Iq.A02(A0071.A03);
                FragmentActivity fragmentActivity17 = A0071.A00;
                AnonymousClass3D6 A08 = C17660qb.A00.A08(A0225);
                C163646yV r322 = new C163646yV(new C28511Ma(Constants.ONE), System.currentTimeMillis());
                r322.A03 = C163666yX.INSIGHTS;
                r322.A0L = true;
                r322.A0A = (String) C51412Ko.A02(r33.A00(0));
                r322.A0M = true;
                r322.A0H = true;
                r322.A0I = true;
                r322.A00(fragmentActivity17, A0225, A08);
                break;
            case 'd':
                C15540n8 A0072 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0226 = C05210Iq.A02(A0072.A03);
                if (C16170o9.A00()) {
                    C16170o9.A00.A01(A0072.A00, A0226, "221413735630339");
                    break;
                }
                break;
            case 'e':
                C13300iJ r323 = ((AnonymousClass2UP) C51412Ko.A02(r33.A00(7))).A00;
                C15540n8 A0073 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0227 = C05210Iq.A02(A0073.A03);
                AnonymousClass7VD r66 = new AnonymousClass7VD();
                r66.A0A = (String) C51412Ko.A02(r33.A00(1));
                r66.A05 = AnonymousClass0OW.A09((String) C51412Ko.A02(r33.A00(2)), r66.A05);
                r66.A04 = AnonymousClass0OW.A09((String) C51412Ko.A02(r33.A00(3)), r66.A04);
                r66.A02 = AnonymousClass0OW.A09((String) C51412Ko.A02(r33.A00(4)), r66.A02);
                r66.A01 = AnonymousClass0OW.A09((String) C51412Ko.A02(r33.A00(5)), r66.A01);
                r66.A00 = AnonymousClass0OW.A09((String) C51412Ko.A02(r33.A00(6)), r66.A00);
                r66.A06 = r323;
                r66.A09 = "bloks";
                r66.A08 = AnonymousClass7VF.A00(Constants.ONE);
                C176627gW.A00(new AnonymousClass7VB(r66), A0227, "fundraiser_sticker_from_bloks", false, A0073.A00);
                break;
            case 'f':
                C15540n8 A0074 = AnonymousClass2Tg.A00(r03);
                C176627gW.A01(C05210Iq.A02(A0074.A03), "create_fundraiser_story_from_bloks", A0074.A00);
                break;
            case 'g':
                AnonymousClass0C1 A0228 = C05210Iq.A02(AnonymousClass2Tg.A00(r03).A03);
                FragmentActivity fragmentActivity18 = AnonymousClass2Tg.A00(r03).A00;
                String moduleName = AnonymousClass2Tg.A00(r03).A02.getModuleName();
                String str36 = (String) C51412Ko.A02(r33.A00(0));
                int intValue7 = ((AnonymousClass2Tw) r33.A00(1)).intValue();
                int intValue8 = ((AnonymousClass2Tw) r33.A00(2)).intValue();
                AnonymousClass0C1 r93 = A0228;
                AnonymousClass2TH r223 = new AnonymousClass2TH(A0228);
                r223.A0L = fragmentActivity18.getString(C0003R.string.report);
                r223.A0T = false;
                r223.A00 = 0.7f;
                AnonymousClass2TI A0075 = r223.A00();
                CJT A014 = C22200y0.A00.A01();
                C146056Mg r132 = C146056Mg.REPORT_BUTTON;
                String valueOf = String.valueOf(intValue8);
                AnonymousClass6MW[] values = AnonymousClass6MW.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        r14 = values[i2];
                        if (!r14.A00.equals(valueOf)) {
                            i2++;
                        }
                    } else {
                        r14 = null;
                    }
                }
                String valueOf2 = String.valueOf(intValue7);
                AnonymousClass6MX[] values2 = AnonymousClass6MX.values();
                int length2 = values2.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        r2 = values2[i3];
                        if (!r2.A00.equals(valueOf2)) {
                            i3++;
                        }
                    } else {
                        r2 = null;
                    }
                }
                A0075.A06(fragmentActivity18, A014.A01(A0075, r93, moduleName, (C13300iJ) null, str36, r132, r14, r2, new C941345g(), false, 0.7f));
                break;
            case 'h':
                if (!(r33.A00.size() == 0 || r33.A00(0) == (r5 = C53602Tl.A00))) {
                    C49662Dc A0076 = C53552Tf.A00(r33.A00(0));
                    C15540n8 A0077 = AnonymousClass2Tg.A00(r03);
                    AnonymousClass6WN r120 = new AnonymousClass6WN(A0077.A01, r03, A0076, A0077);
                    AnonymousClass6WQ r324 = new AnonymousClass6WQ();
                    r324.A00 = r120;
                    C52362Om r224 = new C52362Om(A0077.A00, A0077.A03);
                    r224.A09 = true;
                    r224.A02 = r324;
                    r224.A02();
                    return r5;
                }
            case 'i':
                if (r33.A00.size() >= 3) {
                    String str37 = (String) C51412Ko.A02(r33.A00(0));
                    if (r33.A00(1) != C53602Tl.A00) {
                        r9 = C53552Tf.A00(r33.A00(1));
                    } else {
                        r9 = null;
                    }
                    C53542Te A0078 = r33.A00(2);
                    C53542Te r225 = C53602Tl.A00;
                    if (A0078 != r225) {
                        r15 = C53552Tf.A00(r33.A00(2));
                    }
                    try {
                        String path = new URL(str37).getPath();
                        C15540n8 A0079 = AnonymousClass2Tg.A00(r03);
                        C184437uQ r416 = new C184437uQ(A0079.A00, C05210Iq.A02(A0079.A03), new C184457uS(r03, r9, r15));
                        AnonymousClass2MT r325 = new AnonymousClass2MT(664, new C184427uP(r416, path));
                        r325.A00 = new C184447uR(r416);
                        C12810hQ.A02(r325);
                        return r225;
                    } catch (MalformedURLException e2) {
                        AnonymousClass2Tg.A03(r03, r15, e2.getMessage());
                        return r225;
                    }
                }
                break;
            case 'j':
                C15540n8 A0080 = AnonymousClass2Tg.A00(r03);
                C52362Om r226 = new C52362Om(A0080.A00, A0080.A03);
                r226.A0B = true;
                C17020pY.A00();
                r226.A02 = new AnonymousClass58S();
                r226.A02();
                break;
            case 'k':
                AnonymousClass0C1 A0229 = C05210Iq.A02(AnonymousClass2Tg.A00(r03).A03);
                String str38 = (String) C51412Ko.A02(r33.A00(0));
                AnonymousClass5L4 A0081 = AnonymousClass5L4.A00(A0229);
                if (!str38.equals(A0081.A02)) {
                    int hashCode = str38.hashCode();
                    char c4 = 65535;
                    switch (hashCode) {
                        case -1585913079:
                            c2 = 3;
                            break;
                        case -1583021686:
                            c2 = 4;
                            break;
                        case -1434020359:
                            c2 = 2;
                            break;
                        case -54319353:
                            c2 = 1;
                            break;
                        case 149860425:
                            c2 = 0;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 0) {
                        A0081.A04 = false;
                    } else if (c2 == 1) {
                        A0081.A04 = true;
                    } else if (c2 == 2) {
                        A0081.A03 = true;
                    } else if (c2 != 3) {
                        if (c2 == 4) {
                            if (!A0081.A04) {
                                break;
                            }
                        }
                    } else {
                        A0081.A04 = false;
                        A0081.A03 = false;
                    }
                    C22790z0 r10 = A0081.A05.A00;
                    C35071fl r417 = C35051fj.A0R;
                    r10.A5H(r417, A0081.A00, str38);
                    A0081.A02 = str38;
                    if (hashCode != -1583021686) {
                        if (hashCode == 149860425 && str38.equals("imbe_producer_opt_out_setting_dismiss")) {
                            c4 = 1;
                        }
                    } else if (str38.equals("imbe_producer_nux_details_dismiss")) {
                        c4 = 0;
                    }
                    if (c4 != 0) {
                        if (c4 == 1) {
                            String str39 = A0081.A01;
                            if (!"megaphone_turnoff".equals(str39)) {
                                break;
                            }
                        }
                    }
                    A0081.A05.A00.ADC(r417, A0081.A00);
                    break;
                }
                break;
            case 'l':
                C05210Iq.A02(AnonymousClass2Tg.A00(r03).A03).A06.A2S = (String) C51412Ko.A02(r33.A00(0));
                break;
            case 'm':
                C05210Iq.A02(AnonymousClass2Tg.A00(r03).A03).A06.A2k = (String) C51412Ko.A02(r33.A00(0));
                break;
            case 'n':
                C215579Qv r418 = (C215579Qv) C51412Ko.A01(r33.A00(2));
                if (r33.A00.size() > 3) {
                    str3 = (String) C51412Ko.A01(r33.A00(3));
                } else {
                    str3 = null;
                }
                if (r33.A00.size() > 4) {
                    str4 = (String) C51412Ko.A01(r33.A00(4));
                } else {
                    str4 = null;
                }
                if (r33.A00.size() > 5) {
                    r15 = (String) C51412Ko.A01(r33.A00(5));
                }
                AnonymousClass1OP r514 = (AnonymousClass1OP) AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0230 = C05210Iq.A02(r514.A03);
                C98574Nq r133 = new C98574Nq(str3, r514);
                Product A0082 = C215579Qv.A00(r418);
                String str40 = "product_collection_page";
                if (((Boolean) AnonymousClass0L6.A02(A0230, AnonymousClass0L7.MINI_SHOP_BLOKS, "open_pdp_with_product_object", false, (AnonymousClass04H) null)).booleanValue()) {
                    C17510qM r94 = C17510qM.A00;
                    FragmentActivity fragmentActivity19 = r514.A00;
                    if (str4 != null) {
                        str40 = str4;
                    }
                    A0R = r94.A0Q(fragmentActivity19, A0082, A0230, r133, str40, r15);
                } else {
                    C17510qM r7 = C17510qM.A00;
                    FragmentActivity fragmentActivity20 = r514.A00;
                    String id = A0082.getId();
                    Merchant merchant = A0082.A02;
                    String str41 = merchant.A02;
                    String str42 = merchant.A03;
                    if (str4 != null) {
                        str40 = str4;
                    }
                    A0R = r7.A0R(fragmentActivity20, id, str41, str42, A0230, r133, str40, r15);
                }
                A0R.A03();
                break;
            case 'o':
                String str43 = (String) C51412Ko.A01(r33.A00(0));
                String str44 = (String) C51412Ko.A01(r33.A00(1));
                String str45 = (String) C51412Ko.A01(r33.A00(2));
                String str46 = (String) C51412Ko.A01(r33.A00(3));
                String str47 = (String) C51412Ko.A01(r33.A00(4));
                String str48 = (String) C51412Ko.A01(r33.A00(5));
                AnonymousClass0C1 A0231 = C05210Iq.A02(AnonymousClass2Tg.A00(r03).A03);
                if (!A0231.A04().equals(str43) && !C27665CMj.A00(A0231).getBoolean("has_shown_mini_shop_legal_dialog", false)) {
                    AnonymousClass9WT.A00(AnonymousClass2Tg.A00(r03).A00, A0231, new C930340l(this, str44), str45, str46, str47, str43, str48);
                    C27665CMj.A00(A0231).edit().putBoolean("has_shown_mini_shop_legal_dialog", true).apply();
                    break;
                }
            case 'p':
                AnonymousClass2UJ r67 = (AnonymousClass2UJ) C51412Ko.A01(r33.A00(0));
                HashMap A0232 = AnonymousClass2Tg.A02((Map) C51412Ko.A02(r33.A00(1)));
                C53542Te A0083 = r33.A00(2);
                C53542Te r227 = C53602Tl.A00;
                if (A0083 != r227) {
                    r15 = C53552Tf.A00(r33.A00(2));
                }
                C15540n8 A0084 = AnonymousClass2Tg.A00(r03);
                C06590Pq r72 = A0084.A03;
                C53632Tp r121 = r67.A00;
                C139165x9 r515 = new C139165x9(r72, r121);
                if (r121 != null) {
                    str2 = r121.A03;
                } else {
                    str2 = null;
                }
                IgBloksScreenConfig igBloksScreenConfig4 = r515.A00;
                igBloksScreenConfig4.A0E = str2;
                r515.A03(r67.A05);
                r515.A05(A0232);
                r515.A01 = r67.A01;
                igBloksScreenConfig4.A0N = r67.A06;
                igBloksScreenConfig4.A0C = r67.A02;
                igBloksScreenConfig4.A0K = true;
                igBloksScreenConfig4.A0J = A0084.A06;
                igBloksScreenConfig4.A0B = A0084.A05;
                Integer num4 = r67.A03;
                if (num4 != null) {
                    igBloksScreenConfig4.A00 = num4.intValue();
                }
                FragmentActivity fragmentActivity21 = A0084.A00;
                C139165x9.A00(r515);
                Bundle bundle13 = new Bundle();
                bundle13.putParcelable("screen_config", r515.A00);
                bundle13.putString("IgSessionManager.SESSION_TOKEN_KEY", r515.A06.getToken());
                C59032gv r68 = new C59032gv(r72, ModalActivity.class, "bloks", bundle13, fragmentActivity21);
                if (A0084 instanceof AnonymousClass1OP) {
                    AnonymousClass1OP r419 = (AnonymousClass1OP) A0084;
                    if (r15 != 0) {
                        r419.registerLifecycleListener(new C224989mP(r15, r03, r419));
                    }
                    r68.A07(r419.A00, 11);
                    return r227;
                }
                if (r15 != 0) {
                    AnonymousClass0QD.A01("bloks_present_modal", "Callback ignored because we're presenting modal from a native surface");
                }
                r68.A05(fragmentActivity21, 11);
                return r227;
            case 'q':
                if (((String) C51412Ko.A02(r33.A00(0))).equals("escalation_appeal")) {
                    C23300zv.A00(C05210Iq.A02(AnonymousClass2Tg.A00(r03).A03)).BXT(new C25856Bb4());
                    break;
                }
                break;
            case 'r':
                C15540n8 A0085 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0233 = C05210Iq.A02(A0085.A03);
                C52362Om r326 = new C52362Om(A0085.A00, A0085.A03);
                r326.A0B = true;
                r326.A02 = C17480qJ.A00.A00().A00(A0233.getToken(), "bloks_challenge");
                r326.A02();
                break;
            case 's':
                C15540n8 A0086 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0234 = C05210Iq.A02(A0086.A03);
                FragmentActivity fragmentActivity22 = A0086.A00;
                C28341Li r420 = new C28341Li(fragmentActivity22, A0234, AnonymousClass1L8.A00(fragmentActivity22));
                InsightsStoryViewerController insightsStoryViewerController2 = new InsightsStoryViewerController(fragmentActivity22);
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add((String) C51412Ko.A02(r33.A00(0)));
                r420.A02(InsightsStoryViewerController.A00(arrayList4, A0234), insightsStoryViewerController2.A01(new C23174ABc(A0234, (AnonymousClass2DA) C51412Ko.A02(r33.A00(1)), insightsStoryViewerController2, A0086), AnonymousClass1OY.BUSINESS_INSIGHTS));
                break;
            case 't':
                BXD bxd = (BXD) C51412Ko.A01(r33.A00(0));
                C15540n8 A0087 = AnonymousClass2Tg.A00(r03);
                AnonymousClass0C1 A0235 = C05210Iq.A02(A0087.A03);
                FragmentActivity fragmentActivity23 = A0087.A00;
                AnonymousClass5EO r69 = new AnonymousClass5EO(A0235, fragmentActivity23);
                for (int i4 = 0; i4 < bxd.A02.size(); i4++) {
                    C225049mW r421 = (C225049mW) bxd.A02.get(i4);
                    C225039mV r327 = new C225039mV(r421, r03);
                    Integer num5 = r421.A01;
                    if (num5 == Constants.ZERO) {
                        r69.A05(r421.A02, r327);
                    } else if (num5 == Constants.ONE) {
                        r69.A04(r421.A02, r327);
                    }
                }
                BXE bxe = bxd.A00;
                if (bxe != null) {
                    String str49 = bxe.A00;
                    BXE bxe2 = bxd.A01;
                    if (bxe2 == null) {
                        str = null;
                    } else {
                        str = bxe2.A00;
                    }
                    if (str == null) {
                        r69.A03(str49);
                    } else {
                        r69.A03 = new AnonymousClass2NW((CharSequence) str49, (CharSequence) str);
                    }
                }
                r69.A00().A00(fragmentActivity23);
                break;
            case 'u':
                C108344lf r328 = (C108344lf) C51412Ko.A01(r33.A00(0));
                C15540n8 A0088 = AnonymousClass2Tg.A00(r03);
                C52362Om r228 = new C52362Om(A0088.A00, A0088.A03);
                r228.A02 = C16310oO.A00.A00().A05(r328.A04, r328.A00, r328.A02, r328.A05, (String) null, r328.A01, r328.A03);
                r228.A02();
                break;
            case 'v':
                AnonymousClass1HD r229 = ((AnonymousClass1OP) AnonymousClass2Tg.A00(r03)).A00;
                C53632Tp r610 = (C53632Tp) C51412Ko.A01(r33.A00(0));
                if (r229 instanceof C53762Uf) {
                    C53762Uf r230 = (C53762Uf) r229;
                    FrameLayout frameLayout7 = r230.A02;
                    if (frameLayout7 != null) {
                        C15500n4.A00();
                        C15500n4.A02(frameLayout7);
                    }
                    IgBloksScreenConfig igBloksScreenConfig5 = r230.A03;
                    igBloksScreenConfig5.A0F = r610.A04;
                    igBloksScreenConfig5.A0M = !r610.A08;
                    igBloksScreenConfig5.A0L = r610.A06;
                    igBloksScreenConfig5.A0O = !r610.A07;
                    C53772Uh A0089 = C53772Uh.A00(igBloksScreenConfig5.A05);
                    C49672Dd r329 = r610.A02;
                    if (r329 != null) {
                        igBloksScreenConfig5.A04 = r329;
                        Integer num6 = igBloksScreenConfig5.A06;
                        if (num6 != null) {
                            A0089.A01.put(num6.intValue(), r329);
                        } else {
                            igBloksScreenConfig5.A06 = Integer.valueOf(A0089.A01(r329));
                        }
                    }
                    AnonymousClass2DA r122 = r610.A01;
                    if (r122 != null) {
                        AnonymousClass2DG A042 = C15500n4.A00().A04(r122);
                        igBloksScreenConfig5.A02 = A042;
                        Integer num7 = igBloksScreenConfig5.A08;
                        if (num7 != null) {
                            A0089.A01.put(num7.intValue(), A042);
                        } else {
                            igBloksScreenConfig5.A08 = Integer.valueOf(A0089.A01(A042));
                        }
                    }
                    C146586Oj r330 = r610.A00;
                    if (r330 != null) {
                        igBloksScreenConfig5.A01 = r330;
                        if (igBloksScreenConfig5.A07 != null) {
                            A0089.A01.put(igBloksScreenConfig5.A08.intValue(), r330);
                        } else {
                            igBloksScreenConfig5.A07 = Integer.valueOf(A0089.A01(r330));
                        }
                    }
                    List list = r610.A05;
                    if (list != null) {
                        igBloksScreenConfig5.A0I = list;
                        Integer num8 = igBloksScreenConfig5.A0D;
                        if (num8 != null) {
                            A0089.A01.put(num8.intValue(), list);
                        } else {
                            igBloksScreenConfig5.A0D = Integer.valueOf(C53772Uh.A00(igBloksScreenConfig5.A05).A01(igBloksScreenConfig5.A0I));
                        }
                    }
                    AnonymousClass1EW.A03(r230.A05.A00).A0E();
                    break;
                }
                break;
            case 'w':
                InlineSearchBox inlineSearchBox = (InlineSearchBox) ((C23259AEy) C51412Ko.A01(r33.A00(0))).getView();
                inlineSearchBox.clearFocus();
                inlineSearchBox.A04();
                break;
            default:
                throw new IllegalStateException(AnonymousClass000.A0E("unknown function ", str9));
        }
    }
}
