package com.instagram.react.modules.product;

import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGCommentModerationReactModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.model.comments.ParcelableCommenterDetails;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.A1e;
import p000X.A44;
import p000X.Constants;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass1N4;
import p000X.C06590Pq;
import p000X.C12810hQ;
import p000X.C15890nh;
import p000X.C168937Jj;
import p000X.C17850qu;
import p000X.C206618tn;
import p000X.C206628to;
import p000X.C206638tp;
import p000X.C2102594w;
import p000X.C228039ra;
import p000X.C23043A0y;

@ReactModule(name = "IGCommentModerationReactModule")
public class IgReactCommentModerationModule extends NativeIGCommentModerationReactModuleSpec {
    public static final String ERROR_SERVER_ERR = "E_SERVER_ERR";
    public static final String MODULE_NAME = "IGCommentModerationReactModule";
    public C06590Pq mSession;

    public void fetchBlockedCommenters(C2102594w r2) {
        r2.resolve((Object) null);
    }

    public void fetchCommentAudienceControlType(C2102594w r2) {
        r2.resolve((Object) null);
    }

    public void fetchCommentCategoryFilterDisabled(C2102594w r2) {
        r2.resolve((Object) null);
    }

    public void fetchCommentFilter(C2102594w r2) {
        r2.resolve((Object) null);
    }

    public void fetchCommentFilterKeywords(C2102594w r2) {
        r2.resolve((Object) null);
    }

    public void fetchCurrentUser(C2102594w r2) {
        r2.resolve((Object) null);
    }

    public String getName() {
        return MODULE_NAME;
    }

    public static ParcelableCommenterDetails getParcelableCommenterDetails(HashMap hashMap) {
        return new ParcelableCommenterDetails((Double) hashMap.get("pk"), ((Boolean) hashMap.get("is_verified")).booleanValue(), ((Boolean) hashMap.get("is_private")).booleanValue(), (String) hashMap.get("username"), (String) hashMap.get("full_name"), (String) hashMap.get("profile_pic_url"), (String) hashMap.get(AnonymousClass0C5.$const$string(115)));
    }

    private void scheduleTask(C17850qu r2, C2102594w r3) {
        r2.A00 = new C206628to(this, r3);
        C12810hQ.A02(r2);
    }

    public void setBlockedCommenters(C23043A0y a0y, C2102594w r7) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (a0y.hasKey("block")) {
                jSONObject.put("block", new JSONArray(a0y.getArray("block").toArrayList()));
            }
            if (a0y.hasKey("unblock")) {
                jSONObject.put("unblock", new JSONArray(a0y.getArray("unblock").toArrayList()));
            }
            C15890nh r2 = new C15890nh(this.mSession);
            r2.A09 = Constants.ONE;
            r2.A0C = "accounts/set_blocked_commenters/";
            r2.A0B("commenter_block_status", jSONObject.toString());
            r2.A06(AnonymousClass1N4.class, false);
            r2.A0G = true;
            scheduleTask(r2.A03(), r7);
        } catch (JSONException e) {
            AnonymousClass0QD.A05("IgReactCommentModerationModule", "Failed to send block commenter request", e);
        }
    }

    public void setCommentAudienceControlType(String str, C2102594w r5) {
        C15890nh r2 = new C15890nh(this.mSession);
        r2.A09 = Constants.ONE;
        r2.A0C = "accounts/set_comment_audience_control_type/";
        r2.A09("audience_control", str);
        r2.A06(AnonymousClass1N4.class, false);
        r2.A0G = true;
        C17850qu A03 = r2.A03();
        A03.A00 = new C206618tn(this, str, r5);
        C12810hQ.A02(A03);
    }

    public void setCommentCategoryFilterDisabled(boolean z, C2102594w r5) {
        String str;
        C15890nh r2 = new C15890nh(this.mSession);
        r2.A09 = Constants.ONE;
        r2.A0C = "accounts/set_comment_category_filter_disabled/";
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        r2.A09("disabled", str);
        r2.A06(AnonymousClass1N4.class, false);
        r2.A0G = true;
        scheduleTask(r2.A03(), r5);
    }

    public void setCustomKeywords(String str, C2102594w r5) {
        C15890nh r2 = new C15890nh(this.mSession);
        r2.A09 = Constants.ONE;
        r2.A0C = "accounts/set_comment_filter_keywords/";
        r2.A09("keywords", str);
        r2.A06(AnonymousClass1N4.class, false);
        r2.A0G = true;
        scheduleTask(r2.A03(), r5);
    }

    public void setUseDefaultKeywords(boolean z, C2102594w r5) {
        String str;
        C15890nh r2 = new C15890nh(this.mSession);
        r2.A09 = Constants.ONE;
        r2.A0C = "accounts/set_comment_filter/";
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        r2.A09("config_value", str);
        r2.A06(AnonymousClass1N4.class, false);
        r2.A0G = true;
        scheduleTask(r2.A03(), r5);
    }

    public IgReactCommentModerationModule(A44 a44, C06590Pq r2) {
        super(a44);
        this.mSession = r2;
    }

    public void openCommenterBlockingViewControllerWithReactTag(double d, A1e a1e, Callback callback) {
        FragmentActivity fragmentActivity = (FragmentActivity) getCurrentActivity();
        ArrayList arrayList = new ArrayList();
        Iterator it = a1e.toArrayList().iterator();
        while (it.hasNext()) {
            arrayList.add(getParcelableCommenterDetails((HashMap) it.next()));
        }
        C228039ra.A01(new C168937Jj(this, fragmentActivity, arrayList, new C206638tp(this, callback)));
    }
}
