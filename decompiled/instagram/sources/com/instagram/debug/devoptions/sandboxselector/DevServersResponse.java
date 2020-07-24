package com.instagram.debug.devoptions.sandboxselector;

import java.util.List;
import p000X.C28691Ms;

public final class DevServersResponse extends C28691Ms {
    public List devServers;
    public boolean isInternal;

    public final List getDevServers() {
        return this.devServers;
    }

    public final boolean isInternal() {
        return this.isInternal;
    }

    public final void setDevServers(List list) {
        this.devServers = list;
    }

    public final void setInternal(boolean z) {
        this.isInternal = z;
    }
}
