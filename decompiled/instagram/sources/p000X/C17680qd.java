package p000X;

import android.content.Context;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0qd  reason: invalid class name and case insensitive filesystem */
public final class C17680qd implements C17690qe {
    public WeakReference A00;

    public final String ALl() {
        return "igtv_audio_report";
    }

    public final String ALm() {
        return ".json";
    }

    public final String AIl(Context context) {
        C162256wC r4;
        float f;
        String str;
        Float f2;
        WeakReference weakReference = this.A00;
        if (weakReference != null) {
            r4 = (C162256wC) weakReference.get();
        } else {
            r4 = null;
        }
        if (r4 == null) {
            return "";
        }
        try {
            C33191cW r5 = r4.A0F;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Has audio focus", r5.A02);
            jSONObject.put("Audio focus request result", r5.A01);
            jSONObject.put("Has toggled volume", r5.A03);
            jSONObject.put("Audio contoller current volume", (double) r5.A00);
            C162986xO A0Y = r4.A0Y(r4.A07.A05);
            if (A0Y != null) {
                C163046xV r0 = (C163046xV) r4.A0L.A05.get(A0Y);
                if (r0 != null) {
                    f2 = Float.valueOf(r0.A00);
                } else {
                    f2 = null;
                }
                f = f2.floatValue();
            } else {
                f = -2.0f;
            }
            jSONObject.put("On screen video player volume", (double) f);
            C162986xO A0Y2 = r4.A0Y(r4.A07.A05);
            if (A0Y2 != null) {
                C58442fx AaP = A0Y2.AaP();
                if (AaP.Agx()) {
                    str = "PendingMedia";
                } else {
                    str = AaP.AX7();
                }
            } else {
                str = "null";
            }
            jSONObject.put("Media id", str);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
