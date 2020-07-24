package com.facebook.android.instantexperiences.autofill;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass0DB;

public class RequestAutofillJSBridgeCallResult extends InstantExperiencesCallResult {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(10);

    public RequestAutofillJSBridgeCallResult(Parcel parcel) {
        super(parcel);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public RequestAutofillJSBridgeCallResult(List list) {
        super(Arrays.asList(new String[]{r4.toString()}));
        JSONObject jSONObject = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((FbAutofillData) it.next()).AGO().entrySet()) {
                try {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                } catch (JSONException e) {
                    AnonymousClass0DB.A0G("RequestAutofillJSBridgeCallResult", StringFormatUtil.formatStrLocaleSafe("Autocomplete data can't be added to JSONObject "), e);
                }
            }
        }
    }
}
