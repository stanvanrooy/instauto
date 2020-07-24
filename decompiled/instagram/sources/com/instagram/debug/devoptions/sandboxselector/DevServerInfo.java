package com.instagram.debug.devoptions.sandboxselector;

import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import p000X.C13150hy;

public final class DevServerInfo {
    public String description;
    public String hostType;
    public String url;

    public final String getDescription() {
        String str = this.description;
        if (str == null) {
            C13150hy.A03("description");
        }
        return str;
    }

    public final String getHostType() {
        String str = this.hostType;
        if (str == null) {
            C13150hy.A03("hostType");
        }
        return str;
    }

    public final String getUrl() {
        String str = this.url;
        if (str == null) {
            C13150hy.A03(IgReactNavigatorModule.URL);
        }
        return str;
    }

    public final void setDescription(String str) {
        C13150hy.A02(str, "<set-?>");
        this.description = str;
    }

    public final void setHostType(String str) {
        C13150hy.A02(str, "<set-?>");
        this.hostType = str;
    }

    public final void setUrl(String str) {
        C13150hy.A02(str, "<set-?>");
        this.url = str;
    }
}
