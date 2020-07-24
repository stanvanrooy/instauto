package com.instagram.debug.devoptions.sandboxselector;

import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import p000X.C13150hy;

public final class Sandbox {
    public final SandboxType type;
    public final String url;

    public static /* synthetic */ Sandbox copy$default(Sandbox sandbox, String str, SandboxType sandboxType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sandbox.url;
        }
        if ((i & 2) != 0) {
            sandboxType = sandbox.type;
        }
        return sandbox.copy(str, sandboxType);
    }

    public final String component1() {
        return this.url;
    }

    public final SandboxType component2() {
        return this.type;
    }

    public final Sandbox copy(String str, SandboxType sandboxType) {
        C13150hy.A02(str, IgReactNavigatorModule.URL);
        C13150hy.A02(sandboxType, "type");
        return new Sandbox(str, sandboxType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sandbox)) {
            return false;
        }
        Sandbox sandbox = (Sandbox) obj;
        return C13150hy.A05(this.url, sandbox.url) && C13150hy.A05(this.type, sandbox.type);
    }

    public int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        SandboxType sandboxType = this.type;
        if (sandboxType != null) {
            i = sandboxType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Sandbox(url=" + this.url + ", type=" + this.type + ")";
    }

    public Sandbox(String str, SandboxType sandboxType) {
        C13150hy.A02(str, IgReactNavigatorModule.URL);
        C13150hy.A02(sandboxType, "type");
        this.url = str;
        this.type = sandboxType;
    }

    public final SandboxType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }
}
