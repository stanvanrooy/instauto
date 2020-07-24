package p000X;

import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.BSY */
public final class BSY implements C157696oP {
    public final ReferenceQueue A00 = new ReferenceQueue();
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();
    public final String A03 = AnonymousClass954.A00().toString();

    public final void onLeaksDetected(Collection collection) {
        ArrayList<C25629BSk> arrayList;
        AtomicInteger atomicInteger;
        synchronized (this) {
            Reference poll = this.A00.poll();
            while (poll != null) {
                String str = (String) this.A02.remove(poll);
                if (!(str == null || (atomicInteger = (AtomicInteger) this.A01.get(str)) == null || atomicInteger.decrementAndGet() != 0)) {
                    this.A01.remove(str);
                }
                poll = this.A00.poll();
            }
        }
        synchronized (this) {
            for (Object next : collection) {
                String name = next.getClass().getName();
                AtomicInteger atomicInteger2 = (AtomicInteger) this.A01.get(name);
                if (atomicInteger2 == null) {
                    atomicInteger2 = new AtomicInteger();
                    this.A01.put(name, atomicInteger2);
                }
                atomicInteger2.incrementAndGet();
                this.A02.put(new WeakReference(next, this.A00), name);
            }
        }
        String str2 = (String) AnonymousClass184.A00().A0H.get();
        AnonymousClass184 A002 = AnonymousClass184.A00();
        synchronized (A002) {
            if (A002.A02 == null) {
                AnonymousClass0ZL.A01("MemoryManager.getMemoryLeakEventFactory", 1004821411);
                A002.A02 = (C05330Je) A002.A0G.get();
                AnonymousClass0ZL.A00(-1913443646);
            }
        }
        synchronized (this) {
            HashSet<String> hashSet = new HashSet<>();
            for (Object obj : collection) {
                hashSet.add(obj.getClass().getName());
            }
            arrayList = new ArrayList<>(hashSet.size());
            for (String str3 : hashSet) {
                AtomicInteger atomicInteger3 = (AtomicInteger) this.A01.get(str3);
                if (atomicInteger3 != null) {
                    arrayList.add(new C25629BSk(str3, atomicInteger3.get()));
                }
            }
        }
        for (C25629BSk bSk : arrayList) {
            AnonymousClass0MP r5 = C06550Pm.A00().A00;
            AnonymousClass0QV r2 = AnonymousClass0QV.A03;
            AnonymousClass0a4.A0C(true, AnonymousClass0C5.$const$string(35));
            C05340Jf r4 = new C05340Jf(new AnonymousClass0QT(r5, (AnonymousClass0RN) null, r2));
            r4.A01 = bSk.A01;
            r4.A00 = Integer.valueOf(bSk.A00);
            r4.A02 = this.A03;
            r4.A03 = str2;
            C25622BSd bSd = new C25622BSd(r4.A04.A02("android_memory_leak"));
            if (bSd.A0B()) {
                String str4 = r4.A01;
                AnonymousClass0a4.A06(str4);
                bSd.A08("leaked_classname", str4);
                Integer num = r4.A00;
                AnonymousClass0a4.A06(num);
                bSd.A07("leaked_instance_count", Long.valueOf(num.longValue()));
                String str5 = r4.A02;
                AnonymousClass0a4.A06(str5);
                bSd.A08("runtime_session_id", str5);
                bSd.A08(MemoryDumpUploadJob.EXTRA_USER_ID, r4.A03);
                bSd.A01();
            }
        }
    }

    public final boolean isEnabled() {
        return AnonymousClass184.A00().A04().A01();
    }
}
