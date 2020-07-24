package com.facebook.react.bridge;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000X.AnonymousClass0CH;
import p000X.C228119rm;

public class ReactSoftException {
    public static final List A00 = new CopyOnWriteArrayList();

    public static void addListener(C228119rm r1) {
        if (!A00.contains(r1)) {
            A00.add(r1);
        }
    }

    public static void clearListeners() {
        A00.clear();
    }

    public static void logSoftException(String str, Throwable th) {
        if (A00.size() > 0) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        AnonymousClass0CH.A09(str, "Unhandled SoftException", th);
    }

    public static void removeListener(C228119rm r1) {
        A00.remove(r1);
    }
}
