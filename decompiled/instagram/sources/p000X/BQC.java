package p000X;

import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BQC */
public final class BQC {
    public static String A00;

    public static float A00(float f) {
        return new BigDecimal((double) f).setScale(3, RoundingMode.HALF_UP).floatValue();
    }

    public static C25523BOh A01(String str, Throwable th) {
        if (th instanceof NullPointerException) {
            return new C25523BOh(SystemClock.elapsedRealtime(), new BR8(str), new C25522BOg(Constants.A0C));
        }
        if (th instanceof SecurityException) {
            return new C25523BOh(SystemClock.elapsedRealtime(), new BR8(str), new C25522BOg(Constants.ONE));
        }
        if ((th instanceof UnsupportedOperationException) || (th instanceof NoSuchAlgorithmException)) {
            return new C25523BOh(SystemClock.elapsedRealtime(), new BR8(str), new C25522BOg(Constants.A0N));
        }
        return new C25523BOh(SystemClock.elapsedRealtime(), new BR8(str), new C25522BOg(th));
    }

    public static String A02() {
        if (A00 == null) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                A00 = UUID.randomUUID().toString();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
        return A00;
    }

    public static String A03(byte[] bArr, Integer num) {
        if (bArr != null) {
            StringBuffer stringBuffer = new StringBuffer();
            byte[] digest = MessageDigest.getInstance(B8q.A00(num)).digest(bArr);
            for (int i = 0; i < digest.length; i++) {
                stringBuffer.append(String.format("%02x", new Object[]{Integer.valueOf(digest[i] & 255)}));
            }
            return stringBuffer.toString();
        }
        throw new NullPointerException("Byte Array is null");
    }

    public static void A04(BQH bqh, String str, String str2) {
        long j;
        BQJ bqj = bqh.A0B;
        if (bqj != null) {
            Integer num = Constants.ZERO;
            String A002 = C120515Ex.A00(num);
            HashMap hashMap = new HashMap();
            hashMap.put(C25583BQp.A00(num), A02());
            hashMap.put(C25583BQp.A00(Constants.ONE), Long.toString(TimeUnit.SECONDS.toMillis((long) bqh.A02)));
            String A003 = C25583BQp.A00(Constants.A0C);
            synchronized (BQL.class) {
                j = BQL.A01;
            }
            hashMap.put(A003, Long.toString(j));
            hashMap.put(C25583BQp.A00(Constants.A0N), Integer.toString(bqh.A01));
            hashMap.put(C25583BQp.A00(Constants.A0Y), Integer.toString(bqh.A04));
            hashMap.put(C25583BQp.A00(Constants.A0j), Integer.toString(bqh.A00));
            String A004 = C25583BQp.A00(Constants.A0u);
            String str3 = null;
            try {
                JSONObject jSONObject = new JSONObject(bqh.A0F);
                if (jSONObject.has("t")) {
                    str3 = Integer.toString(jSONObject.getInt("t"));
                }
            } catch (JSONException unused) {
            }
            hashMap.put(A004, str3);
            bqj.A00(A002, str, hashMap, str2, (String) null, (String) null, (String) null);
        }
    }

    public static boolean A05() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static boolean A06(BQK bqk) {
        int i = bqk.A00;
        if (i == BQK.PARANOID.A00 || i == BQK.SUSPICIOUS.A00 || i == BQK.RANDOM_SAMPLE.A00 || i == BQK.EMPLOYEES.A00) {
            return true;
        }
        return false;
    }
}
