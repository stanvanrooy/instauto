package com.instagram.business.instantexperiences;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.business.instantexperiences.p028ui.InstantExperiencesBrowserActivity;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass2UD;
import p000X.AnonymousClass7BX;
import p000X.B1q;

public class InstantExperiencesLibImpl extends AnonymousClass7BX {
    public Intent getInstantExperiencesIntent(Context context, String str, AnonymousClass0C1 r7, String str2, String str3, AnonymousClass2UD r10, String str4) {
        Intent intent = new Intent(context, InstantExperiencesBrowserActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r7.getToken());
        bundle.putString(B1q.BUSINESS_ID.toString(), str);
        bundle.putString(B1q.WEBSITE_URL.toString(), str2);
        bundle.putString(B1q.SOURCE.toString(), str3);
        bundle.putString(B1q.APP_ID.toString(), str4);
        bundle.putString(B1q.SURFACE.toString(), r10.toString());
        intent.putExtras(bundle);
        return intent;
    }
}
