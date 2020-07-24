package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Lg  reason: invalid class name and case insensitive filesystem */
public class C28321Lg implements C28331Lh {
    public SharedPreferences A00;
    public final int A01;
    public final List A02 = new ArrayList(50);
    public final Set A03 = new AnonymousClass003(50);
    public final Context A04;
    public final String A05;

    public final synchronized boolean A2Y(String str) {
        A00();
        this.A02.add(str);
        return this.A03.add(str);
    }

    public final synchronized boolean AhY(String str) {
        A00();
        return this.A03.contains(str);
    }

    private void A00() {
        if (this.A01 >= 1 && this.A00 == null) {
            synchronized (this) {
                SharedPreferences sharedPreferences = this.A04.getSharedPreferences(this.A05, 0);
                this.A00 = sharedPreferences;
                this.A03.addAll(sharedPreferences.getStringSet("seen_ids", new HashSet()));
                this.A02.addAll(this.A03);
            }
        }
    }

    public static void A01(Context context, AnonymousClass0C1 r3, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            context.deleteSharedPreferences(AnonymousClass000.A0J(r3.A04(), "_", str));
        } else {
            context.getSharedPreferences(AnonymousClass000.A0J(r3.A04(), "_", str), 0).edit().clear().apply();
        }
    }

    public final void BE0() {
        HashSet hashSet;
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            synchronized (this) {
                hashSet = new HashSet(Math.min(this.A03.size(), this.A01));
                for (int size = this.A02.size() - 1; size >= 0 && hashSet.size() < this.A01; size--) {
                    hashSet.add(this.A02.get(size));
                }
            }
            edit.putStringSet("seen_ids", hashSet).apply();
        }
    }

    public C28321Lg(Context context, AnonymousClass0C1 r4, String str, int i) {
        this.A04 = context.getApplicationContext();
        this.A05 = AnonymousClass000.A0J(r4.A04(), "_", str);
        this.A01 = i;
    }
}
