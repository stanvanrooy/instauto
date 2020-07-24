package p000X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Uri;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.0jX  reason: invalid class name and case insensitive filesystem */
public final class C13960jX {
    public static final Set A0E = new HashSet(Arrays.asList(new String[]{"access_token", "accesstoken", "access-token"}));
    public WeakHashMap A00;
    public WeakHashMap A01;
    public final ConnectivityManager A02;
    public final AnonymousClass18F A03;
    public final AnonymousClass0RU A04;
    public final C14010jc A05;
    public final C116514zQ A06;
    public final Object A07;
    public final String A08;
    public final String A09;
    public final Random A0A;
    public final boolean A0B;
    public final C06180Ob A0C;
    public final boolean A0D;

    public synchronized AnonymousClass1CW getOpenNetworkTrace(AnonymousClass1C4 r2) {
        return (AnonymousClass1CW) this.A00.get(r2);
    }

    public static String A00(C13960jX r5, String str) {
        Uri build;
        if (r5.A0D) {
            build = Uri.parse(str).buildUpon().clearQuery().build();
        } else {
            Uri parse = Uri.parse(str);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (String next : queryParameterNames) {
                boolean z = true;
                Iterator it = A0E.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (next.contains((String) it.next())) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    for (String appendQueryParameter : parse.getQueryParameters(next)) {
                        clearQuery.appendQueryParameter(next, appendQueryParameter);
                    }
                }
            }
            build = clearQuery.build();
        }
        return build.toString();
    }

    public C13960jX(C06180Ob r3, ConnectivityManager connectivityManager, C14010jc r5, String str, String str2) {
        this.A07 = new Object();
        this.A0A = new Random();
        this.A0C = r3;
        this.A02 = connectivityManager;
        this.A05 = r5;
        this.A00 = new WeakHashMap();
        this.A0B = false;
        this.A06 = null;
        this.A08 = str;
        this.A09 = str2;
        this.A0D = false;
        this.A03 = null;
        this.A04 = AnonymousClass0WN.A00();
    }

    public C13960jX(Context context, C116514zQ r9, String str, C13980jZ r11) {
        this.A07 = new Object();
        boolean z = false;
        boolean z2 = new Random().nextDouble() <= 0.01d;
        AnonymousClass0RU A002 = AnonymousClass0WN.A00();
        this.A04 = A002;
        C14010jc r1 = new C14010jc(z2, new C13990ja(), A002);
        C14010jc.A05 = r1;
        this.A0A = new Random();
        this.A0C = C06190Oc.A00;
        this.A02 = (ConnectivityManager) context.getSystemService("connectivity");
        this.A05 = r1;
        if (r9 == null) {
            this.A00 = new WeakHashMap();
        } else {
            this.A01 = new WeakHashMap();
        }
        this.A06 = r9;
        this.A0B = r9 != null ? true : z;
        this.A08 = "567067343352427";
        this.A09 = str;
        this.A0D = r11.A01;
        if (r11.A00) {
            this.A03 = new AnonymousClass18F(100);
        } else {
            this.A03 = null;
        }
    }
}
