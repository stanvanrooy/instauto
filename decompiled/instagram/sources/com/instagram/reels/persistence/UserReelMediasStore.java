package com.instagram.reels.persistence;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p000X.AnonymousClass000;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0IY;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0O1;
import p000X.AnonymousClass0O3;
import p000X.AnonymousClass0O9;
import p000X.AnonymousClass0OT;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass16T;
import p000X.AnonymousClass2CO;
import p000X.C06570Po;
import p000X.C12890hY;
import p000X.C248316e;
import p000X.C248516g;
import p000X.C475324k;
import p000X.C475524m;

public final class UserReelMediasStore implements C06570Po {
    public static final AnonymousClass0OT A05;
    public final int A00;
    public final long A01;
    public final C475324k A02;
    public final AnonymousClass0C1 A03;
    public final Set A04;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static synchronized UserReelMediasStore A01(AnonymousClass0C1 r8) {
        UserReelMediasStore userReelMediasStore;
        Class<UserReelMediasStore> cls = UserReelMediasStore.class;
        synchronized (cls) {
            userReelMediasStore = (UserReelMediasStore) r8.AV9(cls);
            if (userReelMediasStore == null) {
                AnonymousClass0L7 r3 = AnonymousClass0L7.STORIES_SEND_CLIENT_REELS_ON_TRAY_FETCH;
                userReelMediasStore = new UserReelMediasStore(r8, (C475324k) r8.AVA(C475324k.class, new C475524m(r8)), ((Integer) AnonymousClass0L6.A02(r8, r3, "user_reel_persist_hours_ttl", 12, (AnonymousClass04H) null)).intValue(), ((Integer) AnonymousClass0L6.A02(r8, r3, "user_reel_persist_max_rows", 100, (AnonymousClass04H) null)).intValue());
                r8.BYi(cls, userReelMediasStore);
            }
        }
        return userReelMediasStore;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r1 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0033 */
    private List A02() {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor BYk = this.A02.A00.ATd().BYk(A00());
            while (BYk.moveToNext()) {
                arrayList.add(BYk.getString(0));
            }
            arrayList.size();
            BYk.close();
            return arrayList;
        } catch (Exception e) {
            AnonymousClass0DB.A0G("com.instagram.reels.persistence.UserReelMediasStore", "Failed to load user reel ids from sqlite", e);
            AnonymousClass0QD.A02("com.instagram.reels.persistence.UserReelMediasStore", "Failed to load user reel ids from sqlite");
            return arrayList;
        } catch (Throwable ) {
            throw th;
        }
    }

    public static void A03(AnonymousClass0O9 r4, AnonymousClass0C1 r5, long j) {
        if (((Boolean) AnonymousClass0L6.A02(r5, AnonymousClass0L7.STORIES_SEND_CLIENT_REELS_ON_TRAY_FETCH, "use_serial_executor", false, (AnonymousClass04H) null)).booleanValue()) {
            A05.ADc(r4);
        } else {
            AnonymousClass0O3.A00().A01(r4, j);
        }
    }

    public static void A04(UserReelMediasStore userReelMediasStore) {
        AnonymousClass16T Aap;
        try {
            Aap = userReelMediasStore.A02.Aap();
            Aap.A6P();
            if (Aap.ABb("user_reel_medias", AnonymousClass000.A0J("reel_id not in (", userReelMediasStore.A00().AWU(), ")"), new Object[]{Long.valueOf(System.currentTimeMillis() - userReelMediasStore.A01), Integer.valueOf(userReelMediasStore.A00)}) > 0) {
                userReelMediasStore.A04.clear();
                userReelMediasStore.A04.addAll(userReelMediasStore.A02());
            }
            Aap.BlP();
            Aap.ADF();
        } catch (Exception e) {
            AnonymousClass0DB.A0G("com.instagram.reels.persistence.UserReelMediasStore", "Failed to prune sqlite", e);
            AnonymousClass0QD.A02("com.instagram.reels.persistence.UserReelMediasStore", "Failed to prune sqlite");
        } catch (Throwable th) {
            Aap.ADF();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b9, code lost:
        if (r4 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00be */
    public final Map A05(Set set) {
        HashMap hashMap = new HashMap();
        HashSet<String> hashSet = new HashSet<>(set);
        hashSet.retainAll(this.A04);
        if (hashSet.isEmpty()) {
            return hashMap;
        }
        try {
            AnonymousClass16T ATd = this.A02.A00.ATd();
            C248316e r8 = new C248316e("user_reel_medias");
            r8.A03 = new String[]{"reel_id", "data"};
            String A0P = AnonymousClass000.A0P("reel_id IN (", TextUtils.join(",", hashSet), ")", " AND ", "stored_time", " > ?");
            Object[] objArr = {Long.valueOf(System.currentTimeMillis() - this.A01)};
            r8.A01 = A0P;
            r8.A02 = objArr;
            Cursor BYk = ATd.BYk(r8.A01());
            hashSet.size();
            while (BYk.moveToNext()) {
                String string = BYk.getString(0);
                AnonymousClass0IY r6 = new AnonymousClass0IY(this.A03, C12890hY.A00.A0B(BYk.getBlob(1)));
                r6.A0p();
                ArrayList arrayList = AnonymousClass2CO.parseFromJson(r6).A00;
                arrayList.size();
                hashMap.put(string, arrayList);
            }
            for (String str : hashSet) {
                if (!hashMap.containsKey(str)) {
                    this.A04.remove(str);
                }
            }
            BYk.close();
            return hashMap;
        } catch (Exception e) {
            AnonymousClass0DB.A0G("com.instagram.reels.persistence.UserReelMediasStore", "Failed to load user reel from sqlite", e);
            AnonymousClass0QD.A02("com.instagram.reels.persistence.UserReelMediasStore", "Failed to load user reel from sqlite");
            return hashMap;
        } catch (Throwable ) {
            throw th;
        }
    }

    static {
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = "com.instagram.reels.persistence.UserReelMediasStore";
        A05 = A002.A01();
    }

    public UserReelMediasStore(AnonymousClass0C1 r6, C475324k r7, int i, int i2) {
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        this.A04 = newSetFromMap;
        this.A03 = r6;
        this.A01 = ((long) i) * 3600000;
        this.A00 = i2;
        this.A02 = r7;
        newSetFromMap.addAll(A02());
        A04(this);
    }

    private C248516g A00() {
        C248316e r7 = new C248316e("user_reel_medias");
        r7.A03 = new String[]{"reel_id"};
        Object[] objArr = {Long.valueOf(System.currentTimeMillis() - this.A01), Integer.valueOf(this.A00)};
        r7.A01 = "stored_time > ? order by stored_time desc limit ?";
        r7.A02 = objArr;
        return r7.A01();
    }
}
