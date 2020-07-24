package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Set;
import p000X.A44;
import p000X.AG4;
import p000X.AG6;
import p000X.AG7;
import p000X.AGA;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0CH;
import p000X.AnonymousClass0FY;
import p000X.AnonymousClass0ZA;
import p000X.C2102594w;
import p000X.C228039ra;

@ReactModule(name = "HeadlessJsTaskSupport")
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    public static final String NAME = "HeadlessJsTaskSupport";

    public String getName() {
        return NAME;
    }

    public void notifyTaskFinished(double d) {
        Integer valueOf;
        boolean contains;
        int i = (int) d;
        AG6 A00 = AG6.A00(getReactApplicationContext());
        synchronized (A00) {
            Set set = A00.A04;
            valueOf = Integer.valueOf(i);
            contains = set.contains(valueOf);
        }
        if (contains) {
            A00.A01(i);
            return;
        }
        AnonymousClass0CH.A04(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", valueOf);
    }

    public void notifyTaskRetry(double d, C2102594w r17) {
        Integer valueOf;
        boolean contains;
        boolean z;
        boolean z2;
        int i = (int) d;
        AG6 A00 = AG6.A00(getReactApplicationContext());
        synchronized (A00) {
            Set set = A00.A04;
            valueOf = Integer.valueOf(i);
            contains = set.contains(valueOf);
        }
        if (contains) {
            synchronized (A00) {
                AG7 ag7 = (AG7) A00.A03.get(valueOf);
                boolean z3 = false;
                if (ag7 != null) {
                    z3 = true;
                }
                AnonymousClass0FY.A03(z3, AnonymousClass000.A06("Tried to retrieve non-existent task config with id ", i, "."));
                AGA aga = ag7.A02;
                if (!aga.canRetry()) {
                    z2 = false;
                } else {
                    Runnable runnable = (Runnable) A00.A01.get(i);
                    if (runnable != null) {
                        AnonymousClass0ZA.A08(A00.A00, runnable);
                        A00.A01.remove(i);
                    }
                    C228039ra.A02(new AG4(A00, new AG7(ag7.A03, ag7.A01, ag7.A00, ag7.A04, aga.update()), i), (long) aga.getDelay());
                    z2 = true;
                }
            }
            z = Boolean.valueOf(z2);
        } else {
            AnonymousClass0CH.A04(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", valueOf);
            z = false;
        }
        r17.resolve(z);
    }

    public HeadlessJsTaskSupportModule(A44 a44) {
        super(a44);
    }
}
