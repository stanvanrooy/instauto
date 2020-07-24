package com.instagram.debug.devoptions.sandboxselector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.AnonymousClass10K;
import p000X.AnonymousClass10M;
import p000X.AnonymousClass10N;
import p000X.AnonymousClass10U;
import p000X.AnonymousClass7BR;
import p000X.C13150hy;
import p000X.C63262p9;

public final class SandboxDataModelConverter {
    public static final Companion Companion = new Companion();
    public static final String SUBDOMAIN_DEDICATED = ".devvm";
    public static final String SUBDOMAIN_ON_DEMAND = ".od";
    public final SandboxUrlHelper urlHelper;

    public SandboxDataModelConverter() {
        this((SandboxUrlHelper) null, 1, (AnonymousClass7BR) null);
    }

    public final List convert(List list, String str) {
        C13150hy.A02(list, "devServers");
        C13150hy.A01("i.instagram.com", "urlHelper.getDefaultInstagramHost()");
        List A06 = AnonymousClass10M.A06(new Sandbox("i.instagram.com", SandboxType.PRODUCTION));
        ArrayList arrayList = new ArrayList(AnonymousClass10K.A00(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DevServerInfo devServerInfo = (DevServerInfo) it.next();
            arrayList.add(new Sandbox(devServerInfo.getUrl(), getSandboxType(devServerInfo)));
        }
        return AnonymousClass10N.A0D(AnonymousClass10N.A0D(A06, AnonymousClass10N.A0C(arrayList, new SandboxDataModelConverter$convert$$inlined$sortedBy$1())), nonOwnerSandboxes(list, str));
    }

    public final Sandbox convertHostNameToSandbox(String str) {
        SandboxType sandboxType;
        C13150hy.A02(str, "hostName");
        if (C63262p9.A0A(str, SUBDOMAIN_ON_DEMAND)) {
            sandboxType = SandboxType.ON_DEMAND;
        } else if (C63262p9.A0A(str, SUBDOMAIN_DEDICATED)) {
            sandboxType = SandboxType.DEDICATED;
        } else if (C13150hy.A05(str, "i.instagram.com")) {
            sandboxType = SandboxType.PRODUCTION;
        } else {
            sandboxType = SandboxType.OTHER;
        }
        return new Sandbox(str, sandboxType);
    }

    public final CorpnetStatus convertIsInternalToCorpnetStatus(boolean z) {
        if (z) {
            return CorpnetStatus.ON_CORPNET;
        }
        return CorpnetStatus.OFF_CORPNET;
    }

    public final SandboxMetadata convertSandboxMetadata(List list, String str, boolean z) {
        List list2;
        if (list == null || (list2 = convert(list, str)) == null) {
            list2 = AnonymousClass10U.A00;
        }
        return new SandboxMetadata(list2, convertIsInternalToCorpnetStatus(z));
    }

    public final List nonOwnerSandboxes(List list, String str) {
        List A06;
        C13150hy.A02(list, "devServers");
        if (str != null) {
            ArrayList arrayList = new ArrayList(AnonymousClass10K.A00(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((DevServerInfo) it.next()).getUrl());
            }
            if (arrayList.contains(str)) {
                str = null;
            }
            if (!(str == null || (A06 = AnonymousClass10M.A06(new Sandbox(str, SandboxType.OTHER))) == null)) {
                return A06;
            }
        }
        return AnonymousClass10U.A00;
    }

    private final SandboxType getSandboxType(DevServerInfo devServerInfo) {
        String hostType = devServerInfo.getHostType();
        int hashCode = hostType.hashCode();
        if (hashCode != 313757592) {
            if (hashCode != 1753018553) {
                if (hashCode == 1979110634 && hostType.equals("ondemand")) {
                    return SandboxType.ON_DEMAND;
                }
            } else if (hostType.equals("production")) {
                return SandboxType.PRODUCTION;
            }
        } else if (hostType.equals("devserver")) {
            return SandboxType.DEDICATED;
        }
        return SandboxType.OTHER;
    }

    public SandboxDataModelConverter(SandboxUrlHelper sandboxUrlHelper) {
        C13150hy.A02(sandboxUrlHelper, "urlHelper");
        this.urlHelper = sandboxUrlHelper;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SandboxDataModelConverter(SandboxUrlHelper sandboxUrlHelper, int i, AnonymousClass7BR r4) {
        this((i & 1) != 0 ? new SandboxUrlHelper() : sandboxUrlHelper);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(AnonymousClass7BR r1) {
        }
    }
}
