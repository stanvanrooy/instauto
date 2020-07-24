package com.instagram.debug.devoptions.sandboxselector;

import p000X.AnonymousClass0C1;
import p000X.AnonymousClass7BR;
import p000X.C05770Lw;
import p000X.C13150hy;
import p000X.C27791Jf;

public final class SandboxRepository {
    public final DevServerApi api;
    public final SandboxDataModelConverter converter;
    public final SandboxPreferences sandboxPrefs;
    public final AnonymousClass0C1 userSession;

    public static final C27791Jf observeServerHealth(SandboxRepository sandboxRepository) {
        C27791Jf A0D = sandboxRepository.api.createHealthCheckRequest(sandboxRepository.userSession).A0D(SandboxRepository$observeServerHealth$1.INSTANCE);
        C13150hy.A01(A0D, "api.createHealthCheckReq…on.UNKNOWN)\n      }\n    }");
        return A0D;
    }

    public final Sandbox getCurrentSandbox() {
        return this.converter.convertHostNameToSandbox(this.sandboxPrefs.getCurrentSandbox());
    }

    public final C27791Jf getSandboxMetadata() {
        C27791Jf A0D = this.api.createDevServersRequest(this.userSession).A0D(new SandboxRepository$getSandboxMetadata$1(this));
        C13150hy.A01(A0D, "api.createDevServersRequ….fromNullable(it) }\n    }");
        return A0D;
    }

    public final C27791Jf observeCurrentSandbox() {
        C27791Jf A0D = this.sandboxPrefs.observeCurrentSandbox().A0D(new SandboxRepository$sam$com_instagram_common_rx_Function$0(new SandboxRepository$observeCurrentSandbox$1(this.converter)));
        C13150hy.A01(A0D, "sandboxPrefs.observeCurr…convertHostNameToSandbox)");
        return A0D;
    }

    public final void resetToDefaultSandbox() {
        this.sandboxPrefs.resetToDefaultSandbox();
    }

    public final void setSandbox(Sandbox sandbox) {
        C13150hy.A02(sandbox, "sandbox");
        this.sandboxPrefs.setSandbox(sandbox.url);
    }

    public final C27791Jf observeHealthyConnection() {
        C27791Jf A0E = observeCurrentSandbox().A0E(new SandboxRepository$observeHealthyConnection$1(this));
        C13150hy.A01(A0E, "observeCurrentSandbox().…{ observeServerHealth() }");
        return A0E;
    }

    public SandboxRepository(AnonymousClass0C1 r2, DevServerApi devServerApi, SandboxPreferences sandboxPreferences, SandboxDataModelConverter sandboxDataModelConverter) {
        C13150hy.A02(r2, "userSession");
        C13150hy.A02(devServerApi, "api");
        C13150hy.A02(sandboxPreferences, "sandboxPrefs");
        C13150hy.A02(sandboxDataModelConverter, "converter");
        this.userSession = r2;
        this.api = devServerApi;
        this.sandboxPrefs = sandboxPreferences;
        this.converter = sandboxDataModelConverter;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SandboxRepository(AnonymousClass0C1 r3, DevServerApi devServerApi, SandboxPreferences sandboxPreferences, SandboxDataModelConverter sandboxDataModelConverter, int i, AnonymousClass7BR r8) {
        this(r3, (i & 2) != 0 ? new DevServerApi() : devServerApi, (i & 4) != 0 ? new SandboxPreferences((C05770Lw) null, (SandboxUrlHelper) null, 3, (AnonymousClass7BR) null) : sandboxPreferences, (i & 8) != 0 ? new SandboxDataModelConverter((SandboxUrlHelper) null, 1, (AnonymousClass7BR) null) : sandboxDataModelConverter);
    }
}
