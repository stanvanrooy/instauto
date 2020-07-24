package p000X;

import android.net.Uri;
import android.os.Handler;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BVk */
public final class BVk {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public int A04;
    public long A05;
    public C25699BVu A06;
    public String A07;
    public boolean A08 = false;
    public final long A09 = TimeUnit.SECONDS.toNanos(7);
    public final Handler A0A = new Handler();

    public static Uri A00(double d, double d2, double d3, double d4, String str, int i) {
        return Uri.parse("https://www.facebook.com/maps/provider_by_viewport?").buildUpon().appendQueryParameter("swlat", String.valueOf(d)).appendQueryParameter("swlon", String.valueOf(d2)).appendQueryParameter("nelat", String.valueOf(d3)).appendQueryParameter("nelon", String.valueOf(d4)).appendQueryParameter("v", str).appendQueryParameter("zoom", String.valueOf(i)).build();
    }

    public static void A01(BVk bVk) {
        try {
            URL url = new URL(A00(bVk.A02, bVk.A03, bVk.A00, bVk.A01, bVk.A07, bVk.A04).toString());
            bVk.A05 = System.nanoTime();
            bVk.A08 = false;
            C25694BVp.A01(new C25691BVm(bVk, url));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public BVk(C25699BVu bVu) {
        this.A06 = bVu;
    }
}
