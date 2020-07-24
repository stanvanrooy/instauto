package com.instagram.pendingmedia.store;

import android.content.Context;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import com.instagram.model.mediatype.MediaType;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.PendingMedia;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0P6;
import p000X.AnonymousClass0QD;
import p000X.StoredPreferences;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass14J;
import p000X.AnonymousClass19M;
import p000X.AnonymousClass206;
import p000X.AnonymousClass20L;
import p000X.AnonymousClass2CZ;
import p000X.AnonymousClass72Z;
import p000X.AnonymousClass8GF;
import p000X.AnonymousClass8GG;
import p000X.AnonymousClass8GH;
import p000X.AnonymousClass8H7;
import p000X.C05700Lp;
import p000X.C06570Po;
import p000X.C103614do;
import p000X.C104954g5;
import p000X.C108634mB;
import p000X.C197368cU;
import p000X.C201718kD;
import p000X.C23010zO;
import p000X.C23290zu;
import p000X.C23300zv;
import p000X.C26081Bp;
import p000X.C26101Br;
import p000X.C26121Bt;
import p000X.C28261La;
import p000X.C35271g5;
import p000X.C42421sK;
import p000X.C42831tK;
import p000X.C91043wu;

public final class PendingMediaStore implements AnonymousClass0RN, C06570Po {
    public static final Set A05 = new HashSet();
    public static final AtomicBoolean A06 = new AtomicBoolean(true);
    public boolean A00;
    public final AnonymousClass0C1 A01;
    public final Map A02 = new ConcurrentHashMap();
    public final Set A03 = new HashSet();
    public final C23300zv A04 = C23300zv.A00(this.A01);

    public final synchronized boolean A0E() {
        return this.A00;
    }

    public final String getModuleName() {
        return "PendingMediaStore";
    }

    public static PendingMediaStore A01(AnonymousClass0C1 r2) {
        return (PendingMediaStore) r2.AVA(PendingMediaStore.class, new C23290zu(r2));
    }

    private void A02(long j, String str, String str2) {
        if (j > 0) {
            C91043wu r2 = new C91043wu(AnonymousClass0QT.A00(this.A01, this).A02("ig_disk_footprint_reclaimed_space"));
            r2.A08("file_extension", str2);
            r2.A08("file_path_fragment", str);
            r2.A07("file_size", Long.valueOf(j));
            r2.A08("reclaim_type", "deleted");
            r2.A08("reclaim_zone", "");
            r2.A01();
        }
    }

    public final PendingMedia A04(String str) {
        if (str != null) {
            return (PendingMedia) this.A02.get(str);
        }
        return null;
    }

    public final List A05() {
        Integer num = Constants.A14;
        ArrayList arrayList = new ArrayList(this.A02.size());
        for (PendingMedia pendingMedia : this.A02.values()) {
            if (C42831tK.A00(num, pendingMedia) && pendingMedia.A0l()) {
                arrayList.add(pendingMedia);
            }
        }
        Collections.sort(arrayList, new C35271g5(this));
        return arrayList;
    }

    public final List A06(Integer num) {
        ArrayList arrayList = new ArrayList(this.A02.size());
        for (PendingMedia pendingMedia : this.A02.values()) {
            if ((pendingMedia.A3F == C42421sK.CONFIGURED || pendingMedia.A2x) && C42831tK.A00(num, pendingMedia) && pendingMedia.A3A) {
                arrayList.add(pendingMedia);
            }
        }
        return arrayList;
    }

    public final List A07(Integer num) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (PendingMedia pendingMedia : this.A02.values()) {
            if (pendingMedia.A3F == C42421sK.DRAFT && !pendingMedia.A2t && !pendingMedia.A0s() && C42831tK.A00(num, pendingMedia)) {
                if (pendingMedia.A0g != MediaType.CAROUSEL) {
                    String str2 = pendingMedia.A1g;
                    if (str2 == null) {
                        str = "draft missing file path";
                    } else if (!new File(str2).exists()) {
                        str = "draft file missing on device";
                    }
                    AnonymousClass0QD.A01("PendingMediaStore", str);
                    A0C(pendingMedia.A1h);
                }
                arrayList.add(pendingMedia);
            }
        }
        Collections.sort(arrayList, new AnonymousClass72Z(this));
        return arrayList;
    }

    public final Set A08() {
        HashSet hashSet = new HashSet();
        for (PendingMedia pendingMedia : this.A02.values()) {
            if (pendingMedia.A0g == MediaType.VIDEO) {
                hashSet.add(pendingMedia.A28);
            }
        }
        return hashSet;
    }

    public final void A09() {
        this.A04.BXT(new AnonymousClass14J());
    }

    public final void A0A(Context context) {
        if (A06.compareAndSet(true, false)) {
            PendingMediaStoreSerializer.A00(this.A01).A03(new C103614do(this, context));
            C05700Lp.A00().ADc(new AnonymousClass8H7(new C197368cU(context, new ArrayList(this.A02.values()))));
        }
    }

    public final void A0B(MediaType mediaType) {
        Iterator it = this.A02.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!this.A03.contains(((PendingMedia) entry.getValue()).A1h) && ((PendingMedia) entry.getValue()).A0g == mediaType && ((PendingMedia) entry.getValue()).A3F != C42421sK.CONFIGURED && ((PendingMedia) entry.getValue()).A3F != C42421sK.DRAFT && !((PendingMedia) entry.getValue()).A2x) {
                entry.getValue();
                it.remove();
            }
        }
    }

    public final void A0C(String str) {
        if (((PendingMedia) this.A02.remove(str)) != null) {
            A09();
        }
    }

    public final void A0D(String str, PendingMedia pendingMedia) {
        this.A02.put(str, pendingMedia);
        pendingMedia.A3L = new C104954g5(this);
        A09();
    }

    public final void onUserSessionWillEnd(boolean z) {
        String str;
        String str2;
        if (((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.PENDING_MEDIA_FILE_REGISTRY, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            Context context = StoredPreferences.A00;
            C26081Bp A002 = C26081Bp.A00(context);
            for (PendingMedia pendingMedia : this.A02.values()) {
                File A022 = C26101Br.A02(context);
                File A07 = C26101Br.A07(context);
                HashSet<String> hashSet = new HashSet<>();
                String str3 = pendingMedia.A28;
                if (str3 != null) {
                    try {
                        hashSet.add(new File(A022, str3).getCanonicalPath());
                    } catch (IOException unused) {
                    }
                }
                String str4 = pendingMedia.A1t;
                if (str4 != null) {
                    hashSet.add(str4);
                }
                for (C201718kD r0 : pendingMedia.A0r.A01()) {
                    String str5 = r0.A06;
                    if (str5 != null) {
                        hashSet.add(str5);
                    }
                }
                String str6 = pendingMedia.A21;
                if (str6 != null) {
                    hashSet.add(str6);
                }
                ClipInfo clipInfo = pendingMedia.A0l;
                if (!(clipInfo == null || (str2 = clipInfo.A0F) == null || !A07.equals(new File(str2).getParentFile()))) {
                    hashSet.add(str2);
                }
                String str7 = pendingMedia.A1Z;
                if (str7 != null) {
                    hashSet.add(str7);
                }
                if (pendingMedia.A0p()) {
                    for (AnonymousClass206 r02 : pendingMedia.A2R) {
                        String str8 = r02.A02;
                        if (str8 != null) {
                            hashSet.add(str8);
                        }
                    }
                }
                AnonymousClass2CZ r03 = pendingMedia.A0i;
                if (!(r03 == null || (str = r03.A01) == null)) {
                    hashSet.add(str);
                }
                for (AnonymousClass20L r04 : pendingMedia.A14.A04) {
                    String str9 = r04.A04;
                    if (str9 != null) {
                        hashSet.add(str9);
                    }
                }
                String str10 = pendingMedia.A1g;
                if (str10 != null) {
                    hashSet.add(str10);
                }
                String str11 = pendingMedia.A1v;
                if (str11 != null) {
                    hashSet.add(str11);
                }
                String str12 = pendingMedia.A1N;
                if (str12 != null) {
                    hashSet.add(str12);
                }
                for (String A032 : hashSet) {
                    A002.A03(A032, new C23010zO(this.A01.A04(), pendingMedia.A1h));
                }
            }
        }
        A03(this, StoredPreferences.A00);
    }

    public PendingMediaStore(AnonymousClass0C1 r6) {
        Collection collection;
        this.A01 = r6;
        Set set = A05;
        synchronized (this) {
            Context context = StoredPreferences.A00;
            if (context != null) {
                collection = context.getSharedPreferences("PendingMediaStore_Prefs", 0).getStringSet("PendingMediaStore_DeletedFiles", new HashSet());
            } else {
                collection = new HashSet();
            }
        }
        set.addAll(collection);
    }

    private long A00(Set set, File file, C28261La r11, FilenameFilter filenameFilter) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.contains("/")) {
                AnonymousClass0QD.A01("not_simple_file_name", AnonymousClass000.A0E("should be simple file name :", str));
            }
        }
        File[] listFiles = file.listFiles(filenameFilter);
        long j = 0;
        if (!file.exists() || listFiles == null) {
            return 0;
        }
        HashSet hashSet = new HashSet();
        for (File file2 : listFiles) {
            if (!set.contains(file2.getName())) {
                j += AnonymousClass0P6.A03(file2.getPath(), r11, hashSet);
            }
        }
        file.getAbsolutePath();
        synchronized (this) {
            A05.addAll(hashSet);
            Context context = StoredPreferences.A00;
            if (context != null) {
                context.getSharedPreferences("PendingMediaStore_Prefs", 0).edit().putStringSet("PendingMediaStore_DeletedFiles", A05).apply();
            }
        }
        return j;
    }

    public static void A03(PendingMediaStore pendingMediaStore, Context context) {
        String str;
        C108634mB r8 = new C108634mB(pendingMediaStore, ((Integer) AnonymousClass0L6.A02(pendingMediaStore.A01, AnonymousClass0L7.PENDING_MEDIA_CLEANUP_CONFIG, "older_files_threshold_mins", Integer.valueOf(ArLinkScanControllerImpl.TARGET_IMAGE_SIZE), (AnonymousClass04H) null)).intValue(), C26081Bp.A00(context));
        pendingMediaStore.A00(pendingMediaStore.A08(), new File(context.getCacheDir(), "original_media"), r8, (FilenameFilter) null);
        pendingMediaStore.A00(pendingMediaStore.A08(), C26101Br.A02(context), r8, (FilenameFilter) null);
        HashSet hashSet = new HashSet(pendingMediaStore.A02.size());
        for (PendingMedia pendingMedia : pendingMediaStore.A02.values()) {
            String str2 = pendingMedia.A1t;
            if (str2 != null) {
                hashSet.add(new File(str2).getName());
            }
            for (C201718kD r0 : pendingMedia.A0r.A01()) {
                String str3 = r0.A06;
                if (str3 != null) {
                    hashSet.add(new File(str3).getName());
                }
            }
            String str4 = pendingMedia.A21;
            if (str4 != null) {
                hashSet.add(new File(str4).getName());
            }
        }
        pendingMediaStore.A00(hashSet, C26101Br.A06(context), r8, (FilenameFilter) null);
        File A07 = C26101Br.A07(context);
        HashSet hashSet2 = new HashSet(pendingMediaStore.A02.size());
        for (PendingMedia pendingMedia2 : pendingMediaStore.A02.values()) {
            ClipInfo clipInfo = pendingMedia2.A0l;
            if (!(clipInfo == null || (str = clipInfo.A0F) == null || !A07.equals(new File(str).getParentFile()))) {
                hashSet2.add(new File(str).getName());
            }
        }
        pendingMediaStore.A00(hashSet2, C26101Br.A07(context), r8, (FilenameFilter) null);
        HashSet hashSet3 = new HashSet();
        for (PendingMedia pendingMedia3 : pendingMediaStore.A02.values()) {
            String str5 = pendingMedia3.A1Z;
            if (str5 != null) {
                hashSet3.add(new File(str5).getName());
            }
            if (pendingMedia3.A0p()) {
                for (AnonymousClass206 r02 : pendingMedia3.A2R) {
                    String str6 = r02.A02;
                    String str7 = str6;
                    if (str6 != null) {
                        hashSet3.add(new File(str7).getName());
                    }
                }
            }
        }
        pendingMediaStore.A00(hashSet3, C26121Bt.A01(context), r8, (FilenameFilter) null);
        HashSet hashSet4 = new HashSet();
        for (PendingMedia pendingMedia4 : pendingMediaStore.A02.values()) {
            AnonymousClass2CZ r03 = pendingMedia4.A0i;
            if (r03 != null) {
                hashSet4.add(new File(r03.A01).getName());
            }
        }
        pendingMediaStore.A00(hashSet4, C26101Br.A01(context), r8, (FilenameFilter) null);
        HashSet hashSet5 = new HashSet();
        for (PendingMedia pendingMedia5 : pendingMediaStore.A02.values()) {
            for (AnonymousClass20L r04 : pendingMedia5.A14.A04) {
                hashSet5.add(new File(r04.A04).getName());
            }
        }
        pendingMediaStore.A00(hashSet5, C26101Br.A04(context), r8, (FilenameFilter) null);
        HashSet hashSet6 = new HashSet();
        for (PendingMedia pendingMedia6 : pendingMediaStore.A02.values()) {
            String str8 = pendingMedia6.A1g;
            if (str8 != null) {
                hashSet6.add(new File(str8).getName());
            }
            String str9 = pendingMedia6.A1v;
            String str10 = str9;
            if (str9 != null) {
                hashSet6.add(new File(str10).getName());
            }
        }
        pendingMediaStore.A00(hashSet6, C26101Br.A03(context), r8, (FilenameFilter) null);
        pendingMediaStore.A00(hashSet6, new File(context.getFilesDir(), "pending_media_images"), r8, (FilenameFilter) null);
        AnonymousClass0C1 r3 = pendingMediaStore.A01;
        AnonymousClass0L7 r2 = AnonymousClass0L7.LOW_DISK_SPACE_MONITOR_CONFIG;
        if (((Boolean) AnonymousClass0L6.A02(r3, r2, "tmp_file_cleanup_is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            if (((Boolean) AnonymousClass0L6.A02(pendingMediaStore.A01, r2, "clear_tmp_photo_is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                pendingMediaStore.A02(pendingMediaStore.A00(hashSet6, context.getCacheDir(), r8, new AnonymousClass8GF(pendingMediaStore)), "tmp_photo_", ".jpg");
            }
            if (((Boolean) AnonymousClass0L6.A02(pendingMediaStore.A01, AnonymousClass0L7.LOW_DISK_SPACE_MONITOR_CONFIG, "clear_original_images_is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                pendingMediaStore.A02(pendingMediaStore.A00(hashSet6, new File(AnonymousClass19M.A00), r8, (FilenameFilter) null), AnonymousClass19M.A01(), ".jpg");
            }
            if (((Boolean) AnonymousClass0L6.A02(pendingMediaStore.A01, AnonymousClass0L7.LOW_DISK_SPACE_MONITOR_CONFIG, "clear_share_content_is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                pendingMediaStore.A02(pendingMediaStore.A00(hashSet6, context.getCacheDir(), r8, new AnonymousClass8GG(pendingMediaStore)), "share_content_", "");
            }
            if (((Boolean) AnonymousClass0L6.A02(pendingMediaStore.A01, AnonymousClass0L7.LOW_DISK_SPACE_MONITOR_CONFIG, "clear_direct_share_content_is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                pendingMediaStore.A02(pendingMediaStore.A00(hashSet6, context.getCacheDir(), r8, new AnonymousClass8GH(pendingMediaStore)), "direct_share_content_", "");
            }
        }
        File[] listFiles = context.getFilesDir().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.getName().startsWith("pending_media_") && file.getName().endsWith(".jpg") && !hashSet6.contains(file.getName()) && r8.apply(file)) {
                    file.delete();
                }
            }
        }
    }
}
