package com.instagram.debug.devoptions.sandboxselector;

import java.util.Comparator;
import p000X.AnonymousClass742;

public final class SandboxDataModelConverter$convert$$inlined$sortedBy$1 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return AnonymousClass742.A00(Integer.valueOf(((Sandbox) obj).type.ordinal()), Integer.valueOf(((Sandbox) obj2).type.ordinal()));
    }
}
