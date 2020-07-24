package com.instagram.business.instantexperiences;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.android.instantexperiences.core.IGInstantExperiencesFeatureEnabledList;
import com.facebook.android.instantexperiences.core.InstantExperiencesFeatureEnabledList;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass1BX;

public class IGInstantExperiencesParameters implements InstantExperiencesParameters {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(265);
    public String A00;
    public String A01;
    public String A02;
    public final String A03;
    public final long A04;
    public final Uri A05;
    public final InstantExperiencesFeatureEnabledList A06 = new IGInstantExperiencesFeatureEnabledList();
    public final String A07;
    public final Set A08;

    public final Boolean AFo() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeLong(this.A04);
    }

    public IGInstantExperiencesParameters(String str, Long l) {
        this.A07 = str;
        this.A04 = l.longValue();
        JSONObject jSONObject = new JSONObject(str);
        String A002 = A00(jSONObject, "whitelisted_domains");
        this.A08 = new HashSet();
        for (String parse : A002.split(",")) {
            Uri parse2 = Uri.parse(parse);
            if (parse2 != null && !AnonymousClass1BX.A00(parse2.getHost())) {
                this.A08.add(parse2.getHost());
            }
        }
        A00(jSONObject, AnonymousClass0C5.$const$string(272));
        AnonymousClass1BX.A00(jSONObject.optString("app_name"));
        this.A03 = A00(jSONObject, AnonymousClass0C5.$const$string(199));
        this.A05 = Uri.parse(A00(jSONObject, "website_uri"));
    }

    public static String A00(JSONObject jSONObject, String str) {
        String string = jSONObject.getString(str);
        if (!string.equals("")) {
            return string;
        }
        throw new JSONException(AnonymousClass000.A0E("Empty strings are not allowed for parameter key: ", str));
    }

    public final String AG1() {
        return this.A00;
    }

    public final InstantExperiencesFeatureEnabledList ALc() {
        return this.A06;
    }

    public final long ANs() {
        return this.A04;
    }

    public final Uri AZY() {
        return this.A05;
    }

    public final boolean AiI(String str) {
        Uri parse;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || parse.getHost() == null || parse.getScheme() == null) {
            return false;
        }
        return true;
    }
}
