package p000X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.forker.Process;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0zR  reason: invalid class name and case insensitive filesystem */
public final class C23040zR {
    public static Pair A00(AnonymousClass0C1 r15) {
        String str;
        String jSONArray;
        AnonymousClass0L7 r4 = AnonymousClass0L7.CAMERA_ANDROID_DEVICE_CAPABILITIES_EXPERIMENT;
        if (((Boolean) AnonymousClass0L6.A02(r15, r4, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            str = "device_capabilities";
        } else {
            str = "supported_capabilities_new";
        }
        if (((Boolean) AnonymousClass0L6.A02(r15, r4, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            jSONArray = A01(r15).toString();
        } else {
            Map A00 = C23080zV.A00();
            AnonymousClass10G r14 = new AnonymousClass10G(r15);
            Map A002 = AnonymousClass10I.A00(StoredPreferences.A00, A00, r14);
            String join = TextUtils.join(",", Arrays.asList(C234810o.A01));
            try {
                JSONArray jSONArray2 = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", "SUPPORTED_SDK_VERSIONS");
                jSONObject.put("value", join);
                jSONArray2.put(jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("name", "FACE_TRACKER_VERSION");
                jSONObject2.put("value", String.valueOf(AnonymousClass12z.A00(r14.A00)));
                jSONArray2.put(jSONObject2);
                if ("segmentation_enabled".equals(A002.get("segmentation"))) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("name", "segmentation");
                    jSONObject3.put("value", "segmentation_enabled");
                    jSONArray2.put(jSONObject3);
                }
                for (String upperCase : A00.keySet()) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("name", "COMPRESSION");
                    jSONObject4.put("value", upperCase.toUpperCase(Locale.US));
                    jSONArray2.put(jSONObject4);
                }
                if ("world_tracker_enabled".equals(A002.get("world_tracker"))) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("name", "world_tracker");
                    jSONObject5.put("value", "world_tracker_enabled");
                    jSONArray2.put(jSONObject5);
                }
                if ("gyroscope_enabled".equals(A002.get("gyroscope"))) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("name", "gyroscope");
                    jSONObject6.put("value", "gyroscope_enabled");
                    jSONArray2.put(jSONObject6);
                }
                jSONArray = jSONArray2.toString();
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        return new Pair(str, jSONArray);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015c, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r14, p000X.AnonymousClass0L7.CAMERA_GYRO, "is_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() != false) goto L_0x015e;
     */
    public static JSONObject A01(AnonymousClass0C1 r14) {
        String str;
        Map A00 = C23080zV.A00();
        AnonymousClass10G r6 = new AnonymousClass10G(r14);
        Map A002 = AnonymousClass10I.A00(StoredPreferences.A00, A00, r6);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("model_type", "faceTracker");
            jSONObject2.put("max_version", AnonymousClass12z.A00(r6.A00));
            jSONArray.put(jSONObject2);
            if ("segmentation_enabled".equals(A002.get("segmentation"))) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("model_type", "segmentation");
                jSONObject3.put("max_version", AnonymousClass12R.A00(r6.A00));
                jSONArray.put(jSONObject3);
            }
            if ("hair_segmentation_enabled".equals(A002.get("hair_segmentation"))) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("model_type", "hairSegmentation");
                jSONObject4.put("max_version", 1);
                jSONArray.put(jSONObject4);
            }
            if ("body_tracking_enabled".equals(A002.get("body_tracking"))) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("model_type", "bodyTracking");
                jSONObject5.put("max_version", AnonymousClass12T.A00(r6.A00));
                jSONArray.put(jSONObject5);
            }
            JSONArray jSONArray2 = new JSONArray();
            Context context = StoredPreferences.A00;
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("faceTracker");
            if (r6.A02()) {
                arrayList.add("segmentation");
            }
            if (AnonymousClass12S.A01(r6.A00, false)) {
                arrayList.add("hairSegmentation");
            }
            if (r6.A00() != -1) {
                arrayList.add("targetRecognition");
            }
            boolean z = false;
            if (C12300gW.A00(StoredPreferences.A00) >= 2013) {
                z = true;
            }
            if (z) {
                arrayList.add("worldTracker");
            }
            if (r6.A03(context)) {
                arrayList.add("realScaleEstimation");
            }
            if (r6.A01()) {
                arrayList.add("bodyTracking");
            }
            AnonymousClass12U r1 = AnonymousClass12U.A05;
            AnonymousClass12U.A00(r1, true);
            if (r1.A01) {
                arrayList.add("halfFloatRenderPass");
            }
            for (String put : arrayList) {
                jSONArray2.put(put);
            }
            if (arrayList.contains("targetRecognition")) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("model_type", "targetRecognition");
                jSONObject6.put("max_version", r6.A00());
                jSONArray.put(jSONObject6);
            }
            jSONObject.put("models_max_supported_versions", jSONArray);
            if (!"gyroscope_enabled".equals(A002.get("gyroscope"))) {
            }
            jSONArray2.put("deviceMotion");
            jSONObject.put("manifest_capabilities", jSONArray2);
            Iterator it = A00.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str2.startsWith("etc")) {
                    str = "ETC";
                } else if (str2.startsWith("pvr")) {
                    str = "PVR";
                } else if (str2.startsWith("astc")) {
                    str = "ASTC";
                } else {
                    AnonymousClass0QD.A02("ArEffectSupportedCapabilities", "Unsupported texture compression.");
                    str = "";
                }
                if (!str.equals("")) {
                    jSONObject.put("texture_compression", str);
                    break;
                }
            }
            if (!jSONObject.has("texture_compression")) {
                jSONObject.put("texture_compression", "UNCOMPRESSED");
            }
            JSONObject jSONObject7 = new JSONObject();
            int i = Integer.MAX_VALUE;
            int i2 = Process.WAIT_RESULT_TIMEOUT;
            for (String str3 : C234810o.A01) {
                int intValue = Integer.valueOf(str3.substring(0, str3.indexOf(46))).intValue();
                i = Math.min(i, intValue);
                i2 = Math.max(i2, intValue);
            }
            jSONObject7.put("min_version", i);
            jSONObject7.put("max_version", i2);
            jSONObject.put("supported_sdk_versions", jSONObject7);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
