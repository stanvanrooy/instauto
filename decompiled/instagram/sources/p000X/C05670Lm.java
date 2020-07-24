package p000X;

import java.util.Comparator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Lm  reason: invalid class name and case insensitive filesystem */
public final class C05670Lm implements Comparator {
    public final /* synthetic */ C05650Lk A00;

    public C05670Lm(C05650Lk r1) {
        this.A00 = r1;
    }

    public final int compare(Object obj, Object obj2) {
        try {
            return ((JSONObject) obj).getString("1. Name").compareTo(((JSONObject) obj2).getString("1. Name"));
        } catch (JSONException e) {
            AnonymousClass0DB.A0G("ConfigurationsValueLogger", "Unable to create log", e);
            return 0;
        }
    }
}
