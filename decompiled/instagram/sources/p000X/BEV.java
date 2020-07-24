package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.BEV */
public final class BEV implements AnonymousClass134 {
    public static final long A0D = TimeUnit.SECONDS.toMillis(1);
    public final Context A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C25322BEc A02;
    public final BEK A03;
    public final BET A04;
    public final Executor A05;
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final AtomicReference A07 = new AtomicReference();
    public final AnonymousClass9DS A08;
    public final BF0 A09;
    public final File A0A;
    public final Set A0B = Collections.synchronizedSet(new HashSet());
    public final Set A0C = Collections.synchronizedSet(new HashSet());

    public BEV(Context context, File file, Executor executor) {
        BEK bek = new BEK(context, context.getPackageName());
        AnonymousClass9DS r2 = new AnonymousClass9DS(context);
        BF0 bf0 = new BF0();
        this.A09 = bf0;
        this.A02 = new C25322BEc();
        this.A00 = context;
        this.A0A = file;
        this.A03 = bek;
        this.A08 = r2;
        this.A05 = executor;
        this.A04 = C25321BEa.A01;
    }

    private final C25325BEf A00(C25323BEd bEd) {
        C25325BEf bEf = (C25325BEf) this.A07.get();
        C25325BEf A24 = bEd.A24(bEf);
        if (!this.A07.compareAndSet(bEf, A24)) {
            return null;
        }
        return A24;
    }

    public static final void A01(BEV bev, int i, int i2, Long l, Long l2, List list, Integer num, List list2) {
        C25325BEf A002 = bev.A00(new BEZ(num, i, i2, l, l2, list, list2));
        if (A002 != null) {
            AnonymousClass0ZA.A0E(bev.A01, new BEW(bev, A002), 1795140958);
        }
    }

    public final BFP A27(List list) {
        BFb bFb = new BFb(-5);
        BFL bfl = new BFL();
        bfl.A07(bFb);
        return bfl;
    }

    public final BFP A84(int i) {
        try {
            C25325BEf A002 = A00(new BEY(i));
            if (A002 != null) {
                AnonymousClass0ZA.A0E(this.A01, new BEW(this, A002), 1795140958);
            }
            BFL bfl = new BFL();
            bfl.A08((Object) null);
            return bfl;
        } catch (BFb e) {
            BFL bfl2 = new BFL();
            bfl2.A07(e);
            return bfl2;
        }
    }

    public final BFP ABZ(List list) {
        BFb bFb = new BFb(-5);
        BFL bfl = new BFL();
        bfl.A07(bFb);
        return bfl;
    }

    public final BFP ABa(List list) {
        BFb bFb = new BFb(-5);
        BFL bfl = new BFL();
        bfl.A07(bFb);
        return bfl;
    }

    public final void BZg(BF1 bf1) {
        C25322BEc bEc = this.A02;
        synchronized (bEc) {
            bEc.A00.add(bf1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015a, code lost:
        if (r1.contains(r2) == false) goto L_0x015c;
     */
    public final BFP Bpn(C25333BEo bEo) {
        try {
            C25333BEo bEo2 = bEo;
            C25325BEf A002 = A00(new BEX(bEo2));
            if (A002 == null) {
                BFb bFb = new BFb(-100);
                BFL bfl = new BFL();
                bfl.A07(bFb);
                return bfl;
            }
            int A032 = A002.A03();
            ArrayList arrayList = new ArrayList();
            for (Locale language : bEo2.A01) {
                arrayList.add(language.getLanguage());
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            File[] listFiles = this.A0A.listFiles();
            if (listFiles == null) {
                Log.w("FakeSplitInstallManager", "Specified splits directory does not exist.");
                BFb bFb2 = new BFb(-5);
                BFL bfl2 = new BFL();
                bfl2.A07(bFb2);
                return bfl2;
            }
            int length = listFiles.length;
            long j = 0;
            long j2 = 0;
            int i = 0;
            while (i < length) {
                File file = listFiles[i];
                String A003 = BEL.A00(file);
                if (bEo2.A00.contains(A003.split("\\.config\\.", 2)[0])) {
                    String str = A003.split("\\.config\\.", 2)[0];
                    HashSet<String> hashSet2 = new HashSet<>(this.A08.A01());
                    AnonymousClass4YH A022 = this.A03.A02();
                    if (A022 != null) {
                        Map A004 = A022.A00(Arrays.asList(new String[]{str}));
                        HashSet hashSet3 = new HashSet();
                        for (Set addAll : A004.values()) {
                            hashSet3.addAll(addAll);
                        }
                        HashSet hashSet4 = new HashSet();
                        for (String str2 : hashSet2) {
                            if (str2.contains("_")) {
                                str2 = str2.split("_", -1)[0];
                            }
                            hashSet4.add(str2);
                        }
                        hashSet4.addAll(this.A0C);
                        hashSet4.addAll(arrayList);
                        HashSet hashSet5 = new HashSet();
                        for (Map.Entry entry : A004.entrySet()) {
                            if (hashSet4.contains(entry.getKey())) {
                                hashSet5.addAll((Collection) entry.getValue());
                            }
                        }
                        if (hashSet3.contains(A003)) {
                        }
                        j2 += file.length();
                        hashSet.add(BEL.A00(file));
                        arrayList2.add(file);
                        i++;
                        j = 0;
                    } else {
                        throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
                    }
                }
                List list = bEo2.A01;
                ArrayList arrayList3 = new ArrayList(this.A0B);
                arrayList3.addAll(Arrays.asList(new String[]{"", "base"}));
                AnonymousClass4YH A023 = this.A03.A02();
                if (A023 != null) {
                    Map A005 = A023.A00(arrayList3);
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Locale locale = (Locale) it.next();
                        if (A005.containsKey(locale.getLanguage()) && ((Set) A005.get(locale.getLanguage())).contains(A003)) {
                            break;
                        }
                    }
                    j2 += file.length();
                    hashSet.add(BEL.A00(file));
                    arrayList2.add(file);
                    i++;
                    j = 0;
                } else {
                    throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
                }
            }
            String.valueOf(hashSet);
            String.valueOf(bEo2.A00);
            if (!hashSet.containsAll(new HashSet(bEo2.A00))) {
                BFb bFb3 = new BFb(-2);
                BFL bfl3 = new BFL();
                bfl3.A07(bFb3);
                return bfl3;
            }
            Long valueOf = Long.valueOf(j);
            Long valueOf2 = Long.valueOf(j2);
            List list2 = bEo2.A00;
            Integer valueOf3 = Integer.valueOf(A032);
            A01(this, 1, 0, valueOf, valueOf2, list2, valueOf3, arrayList);
            AnonymousClass0Z9.A03(this.A05, new BER(this, arrayList2, arrayList), 2059643239);
            BFL bfl4 = new BFL();
            bfl4.A08(valueOf3);
            return bfl4;
        } catch (BFb e) {
            BFL bfl5 = new BFL();
            bfl5.A07(e);
            return bfl5;
        }
    }
}
