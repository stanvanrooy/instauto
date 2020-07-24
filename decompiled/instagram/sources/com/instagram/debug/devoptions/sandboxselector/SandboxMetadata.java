package com.instagram.debug.devoptions.sandboxselector;

import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.List;
import p000X.C13150hy;

public final class SandboxMetadata {
    public final List sandboxes;
    public final CorpnetStatus status;

    public static /* synthetic */ SandboxMetadata copy$default(SandboxMetadata sandboxMetadata, List list, CorpnetStatus corpnetStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sandboxMetadata.sandboxes;
        }
        if ((i & 2) != 0) {
            corpnetStatus = sandboxMetadata.status;
        }
        return sandboxMetadata.copy(list, corpnetStatus);
    }

    public final List component1() {
        return this.sandboxes;
    }

    public final CorpnetStatus component2() {
        return this.status;
    }

    public final SandboxMetadata copy(List list, CorpnetStatus corpnetStatus) {
        C13150hy.A02(list, "sandboxes");
        C13150hy.A02(corpnetStatus, RealtimeProtocol.USERS_ACCOUNT_STATUS);
        return new SandboxMetadata(list, corpnetStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SandboxMetadata)) {
            return false;
        }
        SandboxMetadata sandboxMetadata = (SandboxMetadata) obj;
        return C13150hy.A05(this.sandboxes, sandboxMetadata.sandboxes) && C13150hy.A05(this.status, sandboxMetadata.status);
    }

    public int hashCode() {
        List list = this.sandboxes;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        CorpnetStatus corpnetStatus = this.status;
        if (corpnetStatus != null) {
            i = corpnetStatus.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SandboxMetadata(sandboxes=" + this.sandboxes + ", status=" + this.status + ")";
    }

    public SandboxMetadata(List list, CorpnetStatus corpnetStatus) {
        C13150hy.A02(list, "sandboxes");
        C13150hy.A02(corpnetStatus, RealtimeProtocol.USERS_ACCOUNT_STATUS);
        this.sandboxes = list;
        this.status = corpnetStatus;
    }

    public final List getSandboxes() {
        return this.sandboxes;
    }

    public final CorpnetStatus getStatus() {
        return this.status;
    }
}
