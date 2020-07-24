package p000X;

import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0bI  reason: invalid class name and case insensitive filesystem */
public final class C09370bI extends AnonymousClass0aA {
    /* JADX WARNING: Can't wrap try/catch for region: R(3:50|51|52) */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0195, code lost:
        throw new java.lang.RuntimeException("Timeout waiting for Cold Start jobs in the background thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0196, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0197, code lost:
        android.os.Process.setThreadPriority(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019a, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x018e */
    public final void A00(C09790c1... r14) {
        if (C06530Pk.A00) {
            AnonymousClass0ZB.A01("buildDI", -618861960);
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C09790c1 r2 : r14) {
                Class<?> cls = r2.getClass();
                linkedHashMap.put(cls, r2);
                Class<? super Object> superclass = cls.getSuperclass();
                if (!superclass.equals(C09790c1.class) && !superclass.equals(C08680Yc.class)) {
                    linkedHashMap.put(superclass, r2);
                }
            }
            for (C09790c1 r3 : r14) {
                r3.A06();
                for (Class cls2 : r3.A04) {
                    r3.A03.add(linkedHashMap.get(cls2));
                }
            }
            for (C09790c1 A03 : r14) {
                A03.A03();
            }
            ArrayList<C09790c1> arrayList = new ArrayList<>(new HashSet(linkedHashMap.values()));
            ArrayList<C09790c1> arrayList2 = new ArrayList<>();
            for (C09790c1 r22 : arrayList) {
                if (r22.A05()) {
                    arrayList2.add(r22);
                }
            }
            HashSet hashSet = new HashSet();
            for (C09790c1 r0 : arrayList2) {
                hashSet.addAll(r0.A00);
            }
            arrayList2.addAll(hashSet);
            ArrayList arrayList3 = new ArrayList(arrayList);
            arrayList3.removeAll(arrayList2);
            List asList = Arrays.asList(new List[]{arrayList2, arrayList3});
            Collections.sort((List) asList.get(0));
            Collections.sort((List) asList.get(1));
            arrayList.clear();
            arrayList.addAll((Collection) asList.get(0));
            arrayList.addAll((Collection) asList.get(1));
            if (C05630Li.A03(new C05000Hl("is_serial", AnonymousClass0L7.CONCURRENT_COLDSTART_V2, false, (String[]) null, (AnonymousClass04H) null))) {
                for (C09790c1 A04 : arrayList) {
                    A04.A04();
                }
                return;
            }
            int threadPriority = Process.getThreadPriority(Process.myTid());
            String.format(Locale.US, "Initialization %d initializers concurrently", new Object[]{Integer.valueOf(arrayList.size())});
            int size = arrayList.size();
            int max = Math.max(Runtime.getRuntime().availableProcessors(), 2);
            AnonymousClass0aB r12 = new AnonymousClass0aB(threadPriority);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, max, 1, timeUnit, new LinkedBlockingDeque(size), r12);
            for (C09790c1 A032 : arrayList) {
                AnonymousClass0Z9.A03(threadPoolExecutor, A032, 1893640615);
            }
            Process.setThreadPriority(10);
            threadPoolExecutor.shutdown();
            threadPoolExecutor.awaitTermination(300, timeUnit);
            Process.setThreadPriority(threadPriority);
        } finally {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(1656549);
            }
        }
    }
}
