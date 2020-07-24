package com.instagram.debug.devoptions.sandboxselector;

import android.content.Context;
import com.facebook.C0003R;
import p000X.AnonymousClass2GT;
import p000X.C13150hy;
import p000X.C253518l;
import p000X.C50622Ha;
import p000X.C63022ol;
import p000X.C63052oo;

public final class SandboxSelectorInteractor$onStart$2 implements C253518l {
    public final /* synthetic */ SandboxSelectorInteractor this$0;

    public SandboxSelectorInteractor$onStart$2(SandboxSelectorInteractor sandboxSelectorInteractor) {
        this.this$0 = sandboxSelectorInteractor;
    }

    public final void accept(Sandbox sandbox) {
        SandboxSelectorInteractor sandboxSelectorInteractor = this.this$0;
        sandboxSelectorInteractor.toastLiveData.A0A(sandboxSelectorInteractor.resources.getString(C0003R.string.dev_options_sandbox_selector_switch_message, new Object[]{sandbox.type, sandbox.url}));
        SandboxSelectorInteractor sandboxSelectorInteractor2 = this.this$0;
        sandboxSelectorInteractor2.invokeWithContextLiveData.A09(new AnonymousClass2GT(sandboxSelectorInteractor2.overlayIndicatorUpdater) {
            public final String getName() {
                return "updateOverlayIndicator";
            }

            public final C63052oo getOwner() {
                return C63022ol.A00(SandboxOverlayIndicatorUpdater.class);
            }

            public final String getSignature() {
                return "updateOverlayIndicator(Landroid/content/Context;)V";
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Context) obj);
                return C50622Ha.A00;
            }

            public final void invoke(Context context) {
                C13150hy.A02(context, "p1");
                ((SandboxOverlayIndicatorUpdater) this.receiver).updateOverlayIndicator(context);
            }
        });
    }
}
