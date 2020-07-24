package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0ql  reason: invalid class name and case insensitive filesystem */
public final class C17760ql implements AnonymousClass0Q6, CookieStore {
    public static final Set A05 = new HashSet(Arrays.asList(new String[]{"i.instagram.com", "upload.instagram.com", "www.instagram.com", "graph.instagram.com"}));
    public HashMap A00;
    public final SharedPreferences A01;
    public final String A02;
    public final Context A03;
    public final C06180Ob A04 = C06190Oc.A00;

    public static AnonymousClass1BQ igCookieFromJavaHttpCookie(C06180Ob r16, HttpCookie httpCookie) {
        Date date = null;
        int[] iArr = null;
        if (httpCookie == null) {
            return null;
        }
        String name = httpCookie.getName();
        String value = httpCookie.getValue();
        String domain = httpCookie.getDomain();
        String path = httpCookie.getPath();
        boolean secure = httpCookie.getSecure();
        String comment = httpCookie.getComment();
        String commentURL = httpCookie.getCommentURL();
        int version = httpCookie.getVersion();
        boolean discard = httpCookie.getDiscard();
        String portlist = httpCookie.getPortlist();
        if (portlist != null && portlist.length() > 0) {
            String[] split = portlist.split(",");
            int length = split.length;
            iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = Integer.valueOf(split[i]).intValue();
            }
        }
        long maxAge = httpCookie.getMaxAge();
        if (maxAge != -1) {
            date = new Date(System.currentTimeMillis() + (maxAge * 1000));
        }
        return new AnonymousClass1BQ(comment, name, value, commentURL, date, domain, path, iArr, secure, discard, version);
    }

    public final synchronized void A02(Iterable iterable) {
        HashMap A002 = A00(this);
        SharedPreferences.Editor edit = this.A01.edit();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!str.equals("mid")) {
                A002.remove(str);
                edit.remove(AnonymousClass000.A0E("cookie_", str));
            }
        }
        A01(this, edit);
        edit.apply();
    }

    public final synchronized List get(URI uri) {
        ArrayList arrayList;
        ArrayList<AnonymousClass1BQ> arrayList2;
        boolean z;
        Date date;
        arrayList = new ArrayList();
        String host = uri.getHost();
        Date date2 = new Date();
        if (host != null) {
            synchronized (this) {
                arrayList2 = new ArrayList<>(A00(this).values());
            }
            for (AnonymousClass1BQ r7 : arrayList2) {
                String str = r7.A03;
                if (A05.contains(str)) {
                    str = AnonymousClass000.A0E(".", str);
                }
                if (r7.A08 || ((date = r7.A07) != null && date.getTime() <= date2.getTime())) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && HttpCookie.domainMatches(str, host)) {
                    try {
                        arrayList.add(javaHttpCookieFromIgCookie(this.A04, r7));
                    } catch (IllegalArgumentException e) {
                        AnonymousClass0QD.A09("bad_cookie", e);
                    }
                }
            }
        } else {
            AnonymousClass0QD.A01("JavaCookieStoreAdapter_nullUriHost: ", uri.toString());
        }
        return arrayList;
    }

    public final synchronized List getCookies() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (AnonymousClass1BQ javaHttpCookieFromIgCookie : A00(this).values()) {
            try {
                HttpCookie javaHttpCookieFromIgCookie2 = javaHttpCookieFromIgCookie(this.A04, javaHttpCookieFromIgCookie);
                if (javaHttpCookieFromIgCookie2.getMaxAge() > 0) {
                    arrayList.add(javaHttpCookieFromIgCookie2);
                }
            } catch (IllegalArgumentException e) {
                AnonymousClass0QD.A09("bad_cookie", e);
            }
        }
        return arrayList;
    }

    public final synchronized boolean remove(URI uri, HttpCookie httpCookie) {
        AnonymousClass1BQ r1;
        boolean z;
        String name = httpCookie.getName();
        synchronized (this) {
            r1 = (AnonymousClass1BQ) A00(this).get(name);
        }
        if (r1 == null || !javaHttpCookieFromIgCookie(this.A04, r1).equals(httpCookie)) {
            z = false;
        } else {
            A02(Collections.singletonList(r1.A04));
            z = true;
        }
        return z;
    }

    public final boolean removeAll() {
        synchronized (this) {
            this.A00 = null;
            this.A01.edit().clear().apply();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x017d  */
    public static HashMap A00(C17760ql r12) {
        boolean z;
        Date date;
        boolean z2;
        long time;
        Date date2;
        AnonymousClass1BQ decodeCookie;
        if (r12.A00 == null) {
            SharedPreferences sharedPreferences = r12.A01;
            HashMap hashMap = new HashMap();
            SharedPreferences.Editor editor = null;
            String string = sharedPreferences.getString("names", (String) null);
            if (string != null) {
                for (String str : TextUtils.split(string, ",")) {
                    String string2 = sharedPreferences.getString(AnonymousClass000.A0E("cookie_", str), (String) null);
                    if (!(string2 == null || (decodeCookie = AnonymousClass1BF.decodeCookie(string2)) == null)) {
                        hashMap.put(str, decodeCookie);
                    }
                }
            }
            r12.A00 = hashMap;
            Date date3 = new Date(System.currentTimeMillis());
            Iterator it = A00(r12).values().iterator();
            while (it.hasNext()) {
                AnonymousClass1BQ r10 = (AnonymousClass1BQ) it.next();
                if (r10.A08 || ((date2 = r10.A07) != null && date2.getTime() <= date3.getTime())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    it.remove();
                    if (editor == null) {
                        editor = r12.A01.edit();
                    }
                    editor.remove(AnonymousClass000.A0E("cookie_", r10.A04));
                    if ("sessionid".equals(r10.A04)) {
                        Date date4 = r10.A07;
                        if (date4 == null) {
                            time = 0;
                        } else {
                            time = date4.getTime();
                        }
                        AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_session_cookie_expired", (AnonymousClass0RN) null);
                        A002.A0F("expiration_date", Long.valueOf(time));
                        A002.A0E("cookie_length", Integer.valueOf(r10.A06.length()));
                        AnonymousClass0WN.A01(AnonymousClass0J1.A01(r12)).BcG(A002);
                    }
                }
            }
            if (editor != null) {
                editor.putString("names", TextUtils.join(",", r12.A00.keySet()));
                editor.apply();
            }
            AnonymousClass1BQ r4 = (AnonymousClass1BQ) r12.A00.get("sessionid");
            if (!(r4 == null || (date = r4.A07) == null)) {
                int convert = (int) TimeUnit.DAYS.convert(Math.abs(date.getTime() - System.currentTimeMillis()), TimeUnit.MILLISECONDS);
                if (convert <= 60) {
                    AnonymousClass0P4 A003 = AnonymousClass0P4.A00("ig_session_cookie_expiring_soon", (AnonymousClass0RN) null);
                    A003.A0F("expiration_date", Long.valueOf(r4.A07.getTime()));
                    A003.A0E("days_until_expiration", Integer.valueOf(convert));
                    A003.A0E("cookie_length", Integer.valueOf(r4.A06.length()));
                    AnonymousClass0WN.A01(AnonymousClass0J1.A01(r12)).BcG(A003);
                }
            }
            AnonymousClass1BQ r3 = (AnonymousClass1BQ) r12.A00.get("ds_user_id");
            if (r3 != null) {
                String str2 = r3.A06;
                if (!AnonymousClass1BX.A00(str2) && !str2.equals(r12.A02)) {
                    AnonymousClass0P4 A004 = AnonymousClass0P4.A00("ig_session_cookie_user_id_mismatch", (AnonymousClass0RN) null);
                    A004.A0G(MemoryDumpUploadJob.EXTRA_USER_ID, r12.A02);
                    A004.A0G("ds_user_id", r3.A06);
                    AnonymousClass0WN.A01(AnonymousClass0J1.A01(r12)).BcG(A004);
                    z = true;
                    if (z) {
                        r12.A01.edit().clear().apply();
                        r12.A00 = new HashMap();
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return r12.A00;
    }

    public static HttpCookie javaHttpCookieFromIgCookie(C06180Ob r6, AnonymousClass1BQ r7) {
        int length;
        HttpCookie httpCookie = new HttpCookie(r7.A04, r7.A06);
        httpCookie.setDomain(r7.A03);
        httpCookie.setPath(r7.A05);
        httpCookie.setSecure(r7.A09);
        httpCookie.setComment(r7.A01);
        httpCookie.setCommentURL(r7.A02);
        httpCookie.setVersion(r7.A00);
        httpCookie.setDiscard(r7.A08);
        int[] iArr = r7.A0A;
        if (iArr != null && (length = iArr.length) > 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(iArr[0]));
            for (int i = 1; i < length; i++) {
                sb.append(",");
                sb.append(iArr[i]);
            }
            httpCookie.setPortlist(sb.toString());
        }
        Date date = r7.A07;
        if (date != null) {
            httpCookie.setMaxAge((long) ((int) Math.max(0, (date.getTime() - System.currentTimeMillis()) / 1000)));
        }
        return httpCookie;
    }

    public final void add(URI uri, HttpCookie httpCookie) {
        AnonymousClass1BQ igCookieFromJavaHttpCookie = igCookieFromJavaHttpCookie(this.A04, httpCookie);
        synchronized (this) {
            HashMap A002 = A00(this);
            AnonymousClass1BQ r2 = (AnonymousClass1BQ) A002.get(igCookieFromJavaHttpCookie.A04);
            A002.put(igCookieFromJavaHttpCookie.A04, igCookieFromJavaHttpCookie);
            if (r2 == null || AnonymousClass17M.A00(igCookieFromJavaHttpCookie.A04, "sessionid") || !AnonymousClass17M.A00(r2.A06, igCookieFromJavaHttpCookie.A06) || !AnonymousClass17M.A00(r2.A03, igCookieFromJavaHttpCookie.A03) || !AnonymousClass17M.A00(r2.A05, igCookieFromJavaHttpCookie.A05) || !AnonymousClass17M.A00(Integer.valueOf(r2.A00), Integer.valueOf(igCookieFromJavaHttpCookie.A00))) {
                this.A01.edit().putString(AnonymousClass000.A0E("cookie_", igCookieFromJavaHttpCookie.A04), AnonymousClass1BF.encodeCookie(igCookieFromJavaHttpCookie)).putString("names", TextUtils.join(",", A00(this).keySet())).apply();
            }
        }
    }

    public final List getURIs() {
        throw new UnsupportedOperationException("unnecessary for CookieManager");
    }

    public C17760ql(String str) {
        String A0E;
        Context context = StoredPreferences.A00;
        this.A03 = context;
        this.A02 = str;
        if (str == null) {
            A0E = "LoggedOutPrefsFile";
        } else {
            A0E = AnonymousClass000.A0E("UserCookiePrefsFile_", str);
        }
        this.A01 = C05790Ly.A01(context, A0E);
        AnonymousClass0Q7.A03().A0B(this);
    }

    public static void A01(C17760ql r4, SharedPreferences.Editor editor) {
        for (AnonymousClass1BQ r2 : A00(r4).values()) {
            editor.putString(AnonymousClass000.A0E("cookie_", r2.A04), AnonymousClass1BF.encodeCookie(r2));
        }
        editor.putString("names", TextUtils.join(",", A00(r4).keySet()));
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0Z0.A03(1902617172);
        synchronized (this) {
            SharedPreferences.Editor edit = this.A01.edit();
            A01(this, edit);
            edit.apply();
        }
        AnonymousClass0Z0.A0A(-1352223740, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0Z0.A0A(550583976, AnonymousClass0Z0.A03(-1909188695));
    }
}
