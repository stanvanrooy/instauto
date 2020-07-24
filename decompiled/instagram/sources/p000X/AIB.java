package p000X;

import android.content.Context;
import android.view.ActionProvider;

/* renamed from: X.AIB */
public final class AIB extends AIA implements ActionProvider.VisibilityListener {
    public AnonymousClass99O A00;
    public final /* synthetic */ AI7 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AIB(AI7 ai7, Context context, ActionProvider actionProvider) {
        super(ai7, context, actionProvider);
        this.A01 = ai7;
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        AnonymousClass99O r0 = this.A00;
        if (r0 != null) {
            r0.onActionProviderVisibilityChanged(z);
        }
    }
}
