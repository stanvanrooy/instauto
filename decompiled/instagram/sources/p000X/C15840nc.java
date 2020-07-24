package p000X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0nc  reason: invalid class name and case insensitive filesystem */
public final class C15840nc implements C15860ne {
    public AnonymousClass0C1 A00;
    public Context A01;

    public static File A00(Context context, AnonymousClass0C1 r4) {
        return new File(context.getCacheDir(), C06360Ot.formatString("MainFeed-%s-%s.json", r4.A04(), C06630Pu.A01(context)));
    }

    public final void BeQ(List list) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (p000X.C32101aY.A00(r2) != false) goto L_0x001e;
     */
    public static List A01(List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1NG r2 = (AnonymousClass1NG) it.next();
            if (r2 != null) {
                z = true;
            }
            z = false;
            if (z) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    public static void A02(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1NG r2 = (AnonymousClass1NG) it.next();
            if (r2.A0H == C29261Pf.GROUP_SET) {
                for (C150826ci r0 : Collections.unmodifiableList(((C474423y) r2.A0G).A03)) {
                    arrayList.addAll(Collections.unmodifiableList(r0.A05));
                }
            }
        }
        list.addAll(arrayList);
    }

    public final void BsL(AnonymousClass1NG r13) {
        if (r13.A0H == C29261Pf.MEDIA) {
            File A002 = A00(this.A01, this.A00);
            if (A002.exists()) {
                AnonymousClass1NJ A04 = r13.A04();
                boolean z = false;
                try {
                    JSONObject jSONObject = new JSONObject(AnonymousClass0P6.A05(A002, new StringBuilder()));
                    JSONArray jSONArray = jSONObject.getJSONArray("feed_items");
                    int i = 0;
                    while (true) {
                        if (i >= jSONArray.length()) {
                            break;
                        }
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2.has("media_or_ad")) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("media_or_ad");
                            if (jSONObject3.has("id") && jSONObject3.getString("id").equals(A04.getId())) {
                                boolean z2 = false;
                                if (A04.A1R == Constants.ZERO) {
                                    z2 = true;
                                }
                                jSONObject3.put("has_liked", z2);
                                jSONObject3.put("has_viewer_saved", A04.AhP());
                                z = true;
                            }
                        }
                        i++;
                    }
                    AnonymousClass0P6.A07(jSONObject.toString(), Charset.defaultCharset(), A002);
                } catch (IOException | JSONException e) {
                    AnonymousClass0QD.A00().Bp7("ColdStartFeedCache", "Exception on Updating Cache", e);
                }
                if (!z) {
                    AnonymousClass0QD.A00().Bp5("ColdStartFeedCache", "Cache Update Error: Item Not found");
                    return;
                }
                return;
            }
            AnonymousClass0QD.A00().Bp5("ColdStartFeedCache", "Cache File Not Found");
        }
    }

    public final void clear() {
        File A002 = A00(this.A01, this.A00);
        if (A002.exists() && !A002.delete()) {
            AnonymousClass0DB.A0J("ColdStartFeedCache", "fail to delete file: %s", A002.getName());
        }
    }

    public C15840nc(Context context, AnonymousClass0C1 r2) {
        this.A01 = context;
        this.A00 = r2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:23|24|25|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x004b */
    public final void Ain(AnonymousClass1LW r11) {
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        C28661Mp parseFromJson;
        long j2;
        String str5;
        String str6 = "ColdStartFeedCache";
        File A002 = A00(this.A01, this.A00);
        if (A002.exists()) {
            C28661Mp r4 = null;
            try {
                str2 = str6;
                str4 = str6;
                str2 = str6;
                str4 = str6;
                synchronized (this) {
                    AnonymousClass0IY r1 = new AnonymousClass0IY(this.A00, C12890hY.A00.A07(A002));
                    r1.A0p();
                    parseFromJson = C16110o3.parseFromJson(r1);
                    r1.close();
                    str2 = str6;
                    str4 = str6;
                }
                r4 = parseFromJson;
                try {
                    str5 = str6;
                    long lastModified = A002.lastModified();
                    str5 = lastModified;
                    j2 = lastModified;
                } catch (Exception e) {
                    str2 = str5;
                    str4 = str5;
                    AnonymousClass0DB.A0M(str5, e, "Error retrieving creation timestamp from file");
                    AnonymousClass0QD.A05(str5, e.getMessage(), e);
                    str2 = str5;
                    str4 = str5;
                    j2 = 0;
                }
                if (!(parseFromJson == null || r11 == null)) {
                    List A012 = parseFromJson.A01();
                    j = System.currentTimeMillis() - j2;
                    A02(A012);
                    r4.A0A = A01(A012);
                    if (j2 > 0 && j > TimeUnit.DAYS.toMillis(30)) {
                        str = "file older than thirty days";
                    }
                    r11.B7O(r4);
                    TimeUnit.MILLISECONDS.toMinutes(j);
                    return;
                }
            } catch (IOException e2) {
                try {
                    str3 = AnonymousClass0P6.A05(A002, new StringBuilder());
                } catch (IOException unused) {
                    str3 = "failed to read cached feed file";
                }
                if (e2.getCause() instanceof C184977vK) {
                    AnonymousClass0DB.A0M(str2, e2, "Error reading from cached file because of malformed feed.");
                    AnonymousClass0QD.A00().BYg("feed_item_parse_failure_file_dump", str3);
                    AnonymousClass0QD.A05("feed_item_parse_failure", e2.getMessage(), e2);
                } else {
                    AnonymousClass0DB.A0M(str2, e2, "Error reading from cached file.");
                    AnonymousClass0QD.A05(str2, e2.getMessage(), e2);
                }
                if (!(r4 == null || r11 == null)) {
                    List A013 = r4.A01();
                    j = System.currentTimeMillis() - 0;
                    A02(A013);
                    r4.A0A = A01(A013);
                    r11.B7O(r4);
                    TimeUnit.MILLISECONDS.toMinutes(j);
                    return;
                }
                r11.B7N("read fail");
                return;
            } catch (C45351xj e3) {
                try {
                    AnonymousClass0DB.A0M(str4, e3, "User ID does not exist in the user object.");
                    AnonymousClass0QD.A05(str4, e3.getMessage(), e3);
                    List A0132 = r4.A01();
                    j = System.currentTimeMillis() - 0;
                    A02(A0132);
                    r4.A0A = A01(A0132);
                    r11.B7O(r4);
                    TimeUnit.MILLISECONDS.toMinutes(j);
                    return;
                } catch (Throwable th) {
                    if (r4 == null || r11 == null) {
                        r11.B7N("read fail");
                    } else {
                        List A014 = r4.A01();
                        A02(A014);
                        r4.A0A = A01(A014);
                        r11.B7O(r4);
                        TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - 0);
                    }
                    throw th;
                }
            }
            r11.B7N("read fail");
            return;
        }
        str = "no file";
        r11.B7N(str);
        return;
        str2 = str6;
        str4 = str6;
    }
}
