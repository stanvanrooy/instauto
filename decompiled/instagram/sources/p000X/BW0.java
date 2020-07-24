package p000X;

import android.graphics.Rect;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BW0 */
public final class BW0 extends C25695BVq {
    public int A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: org.json.JSONObject} */
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: type inference failed for: r13v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dc, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dd, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e5, code lost:
        if (r3 != null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0238, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc A[ExcHandler: IOException (e java.io.IOException), Splitter:B:20:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0238 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:20:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x023b A[SYNTHETIC, Splitter:B:83:0x023b] */
    public final void run() {
        Location location;
        InputStream inputStream;
        int i;
        Rect[] rectArr;
        String[] strArr;
        AnonymousClass26U[][] r5;
        String str;
        LocationManager locationManager;
        List<String> providers;
        this.A00++;
        ? r13 = 0;
        if (!C23198ACi.A00() || ((Build.VERSION.SDK_INT >= 23 && !(AnonymousClass19B.A02.checkSelfPermission(AnonymousClass0C5.$const$string(25)) == 0 && AnonymousClass19B.A02.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0)) || (providers = locationManager.getProviders(true)) == null)) {
            location = null;
        } else {
            location = null;
            for (String A002 : providers) {
                Location A003 = AnonymousClass0ZD.A00((locationManager = (LocationManager) AnonymousClass19B.A02.getSystemService("location")), A002);
                if (location == null || AC4.A00(A003, location)) {
                    location = A003;
                }
            }
        }
        try {
            byte[] bArr = new byte[512];
            String str2 = AnonymousClass19B.A0C;
            String str3 = AnonymousClass19B.A0B;
            if (location == null) {
                str = "";
            } else {
                str = "&latitude=" + location.getLatitude() + "&longitude=" + location.getLongitude();
            }
            inputStream = new URL(AnonymousClass000.A0J(str2, str3, str)).openStream();
            int i2 = 0;
            while (true) {
                try {
                    int length = bArr.length;
                    int read = inputStream.read(bArr, i2, length - i2);
                    if (read == -1) {
                        break;
                    }
                    i2 += read;
                    if (i2 >= length) {
                        byte[] bArr2 = new byte[(length << 1)];
                        System.arraycopy(bArr, 0, bArr2, 0, length);
                        bArr = bArr2;
                    }
                } catch (IOException e) {
                    e = e;
                    Log.e("MapConfig", "Unable to download config", e);
                } catch (Exception e2) {
                    e = e2;
                    try {
                        AnonymousClass17U.A09.A04(e);
                    } catch (Throwable th) {
                        th = th;
                        r13 = inputStream;
                    }
                }
            }
            r13 = new JSONObject(new String(bArr, 0, i2)).getJSONArray("data").getJSONObject(0);
        } catch (Exception e3) {
            throw new RuntimeException("Exception while loading map config", e3);
        } catch (IOException e4) {
        } catch (Exception e5) {
            e = e5;
            inputStream = null;
            AnonymousClass17U.A09.A04(e);
        } catch (Throwable th2) {
        }
        try {
            inputStream.close();
            r13 = r13;
        } catch (IOException unused) {
            r13 = r13;
        }
        if (r13 != 0) {
            String optString = r13.optString("base_url", AnonymousClass19B.A0A.A01);
            String optString2 = r13.optString("static_base_url", AnonymousClass19B.A0A.A03);
            try {
                JSONObject jSONObject = r13.getJSONObject("osm_config");
                i = jSONObject.getInt("zoom_threshold");
                JSONArray jSONArray = jSONObject.getJSONArray("rectangles");
                int length2 = jSONArray.length();
                rectArr = new Rect[length2];
                int i3 = 1 << i;
                for (int i4 = 0; i4 < length2; i4++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                    float f = (float) i3;
                    rectArr[i4] = new Rect((int) (C28728Clj.A02(jSONObject2.getDouble("west")) * f), (int) (C28728Clj.A01(jSONObject2.getDouble("north")) * f), (int) (C28728Clj.A02(jSONObject2.getDouble("east")) * f), (int) (f * C28728Clj.A01(jSONObject2.getDouble("south"))));
                }
            } catch (JSONException unused2) {
                i = AnonymousClass19B.A0A.A00;
                rectArr = AnonymousClass19B.A0A.A04;
            }
            try {
                JSONArray jSONArray2 = r13.getJSONArray("url_override_config");
                int length3 = jSONArray2.length();
                strArr = new String[length3];
                r5 = new AnonymousClass26U[length3][];
                for (int i5 = 0; i5 < length3; i5++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i5);
                    strArr[i5] = jSONObject3.getString("base_url");
                    JSONArray jSONArray3 = jSONObject3.getJSONArray("rectangles");
                    int length4 = jSONArray3.length();
                    r5[i5] = new AnonymousClass26U[length4];
                    for (int i6 = 0; i6 < length4; i6++) {
                        AnonymousClass26U r2 = new AnonymousClass26U();
                        JSONObject jSONObject4 = jSONArray3.getJSONObject(i6);
                        r2.A01 = (double) C28728Clj.A02(jSONObject4.getDouble("west"));
                        r2.A03 = (double) C28728Clj.A01(jSONObject4.getDouble("north"));
                        r2.A02 = (double) C28728Clj.A02(jSONObject4.getDouble("east"));
                        r2.A00 = (double) C28728Clj.A01(jSONObject4.getDouble("south"));
                        r5[i5][i6] = r2;
                    }
                }
            } catch (JSONException unused3) {
                strArr = AnonymousClass19B.A0A.A05;
                r5 = AnonymousClass19B.A0A.A06;
            }
            AnonymousClass19B.A0A = new AnonymousClass19C(optString, optString2, rectArr, i, strArr, r5);
            AnonymousClass19B.A00 = SystemClock.uptimeMillis();
            C25694BVp.A02(new BW2());
        } else if (this.A00 < 3) {
            int i7 = C25694BVp.A00;
            C25694BVp.A00 = i7 - 1;
            this.A00 = ((long) i7) << 32;
            this.A02 = "MapConfigUpdateDispatchable";
            this.A01 = SystemClock.uptimeMillis() + ArLinkScanControllerImpl.ERROR_DELAY_MS;
            C25694BVp.A00().A00.add(this);
            return;
        }
        this.A00 = 0;
        AnonymousClass19B.A08.release();
        return;
        if (r13 != 0) {
        }
        throw th;
        throw th;
    }

    public final void A00() {
        super.A00();
        AnonymousClass19B.A08.release();
    }
}
