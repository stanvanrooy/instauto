package p000X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Bp  reason: invalid class name and case insensitive filesystem */
public final class C26081Bp {
    public static C26081Bp A08;
    public static final Set A09 = new HashSet();
    public List A00;
    public List A01;
    public boolean A02;
    public boolean A03 = false;
    public final C05450Ko A04;
    public final AnonymousClass14W A05;
    public final HashMap A06;
    public final Context A07;

    public final synchronized void A02(AnonymousClass0C1 r6) {
        if (this.A03) {
            HashSet hashSet = new HashSet();
            Iterator it = new ArrayList(this.A06.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (!((C22950zI) entry.getValue()).AgI(this.A07, r6, str)) {
                    if (A04(str)) {
                        AnonymousClass0P6.A06(str);
                    }
                    this.A06.remove(str);
                    hashSet.add(str);
                }
            }
            synchronized (this) {
                A09.addAll(hashSet);
                Context context = StoredPreferences.A00;
                if (context != null) {
                    context.getSharedPreferences("FileGcRegistry_Prefs", 0).edit().putStringSet("FileGcRegistry_DeletedFiles", A09).apply();
                }
            }
            this.A04.ADc(new C108104lH(this, hashSet));
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000a */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    public final synchronized void A03(String str, C22950zI r4) {
        str = new File(str).getCanonicalPath();
        C22950zI r0 = (C22950zI) this.A06.get(str);
        if (r0 == null || !r0.equals(r4)) {
            if (A04(str)) {
                this.A06.put(str, r4);
                this.A04.ADc(new C108084lF(this, str, r4));
            }
        }
    }

    public final boolean A04(String str) {
        boolean z;
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            if (canonicalPath != null) {
                Iterator it = this.A00.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (canonicalPath.startsWith((String) it.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        AnonymousClass0QD.A01("FileRegistry#isWithinAppScopedDirectory", AnonymousClass000.A0E("filepath outside of app scoped directories. parent folder: ", new File(canonicalPath).getParent()));
                        z = false;
                        break;
                    }
                }
            } else {
                AnonymousClass0QD.A02("FileRegistry#isWithinAppScopedDirectory", "invalid file path in registry");
                z = false;
            }
            if (!z) {
                return false;
            }
            for (String startsWith : this.A01) {
                if (canonicalPath.startsWith(startsWith)) {
                    return true;
                }
            }
            return false;
        } catch (IOException unused) {
        }
    }

    public static synchronized C26081Bp A00(Context context) {
        C26081Bp r0;
        Collection collection;
        synchronized (C26081Bp.class) {
            if (A08 == null) {
                AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
                A002.A01 = "PendingMediaStoreSerializer";
                C26081Bp r5 = new C26081Bp(context, A002.A01());
                A08 = r5;
                List asList = Arrays.asList(new File[]{C26101Br.A02(context), C26101Br.A06(context), C26101Br.A07(context), C26121Bt.A01(context), C26101Br.A01(context), C26101Br.A04(context), C26101Br.A03(context), new File(context.getFilesDir(), "pending_media_images"), new File(context.getFilesDir(), "pending_media_")});
                List asList2 = Arrays.asList(new File[]{context.getFilesDir(), context.getExternalFilesDir((String) null)});
                synchronized (r5) {
                    r5.A00 = A01(asList2);
                    r5.A01 = A01(asList);
                    Set set = A09;
                    synchronized (r5) {
                        Context context2 = StoredPreferences.A00;
                        if (context2 != null) {
                            collection = context2.getSharedPreferences("FileGcRegistry_Prefs", 0).getStringSet("FileGcRegistry_DeletedFiles", new HashSet());
                        } else {
                            collection = new HashSet();
                        }
                    }
                    set.addAll(collection);
                    if (!r5.A02) {
                        r5.A02 = true;
                        r5.A04.ADc(new AnonymousClass1CE(r5));
                    }
                }
            }
            r0 = A08;
        }
        return r0;
    }

    public static List A01(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null) {
                try {
                    arrayList.add(file.getCanonicalPath());
                } catch (IOException unused) {
                    AnonymousClass0QD.A01("canonicalization_failed", "File path failed to canonicalize");
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public C26081Bp(Context context, C05450Ko r7) {
        this.A07 = context.getApplicationContext();
        this.A04 = r7;
        this.A06 = new HashMap();
        this.A01 = Collections.emptyList();
        this.A00 = Collections.emptyList();
        Context context2 = this.A07;
        C26091Bq r0 = new C26091Bq();
        if (context2 != null) {
            this.A05 = new AnonymousClass14W(context2, new AnonymousClass14V(context2, "fileregistry.db", r0), new AnonymousClass14X(), true);
            return;
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }
}
