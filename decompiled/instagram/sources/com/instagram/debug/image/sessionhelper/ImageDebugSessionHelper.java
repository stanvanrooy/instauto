package com.instagram.debug.image.sessionhelper;

import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.debug.image.ImageDebugHelper;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C2;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass12C;
import p000X.AnonymousClass12E;
import p000X.C11590fD;
import p000X.C14090jk;

public class ImageDebugSessionHelper implements AnonymousClass0C2 {
    public final AnonymousClass0C1 mUserSession;

    public static ImageDebugSessionHelper getInstance(final AnonymousClass0C1 r2) {
        return (ImageDebugSessionHelper) r2.AVA(ImageDebugSessionHelper.class, new C11590fD() {
            public ImageDebugSessionHelper get() {
                return new ImageDebugSessionHelper(AnonymousClass0C1.this);
            }
        });
    }

    public static boolean shouldEnableImageDebug(AnonymousClass0C1 r1) {
        if (r1 == null || !C14090jk.A01(r1)) {
            return false;
        }
        return true;
    }

    public void onUserSessionWillEnd(boolean z) {
        updateModules(this.mUserSession);
    }

    public static void updateModules(AnonymousClass0C1 r3) {
        ImageDebugHelper instance = ImageDebugHelper.getInstance();
        if (shouldEnableImageDebug(r3)) {
            instance.setEnabled(true);
            AnonymousClass12C.A0d = true;
            AnonymousClass12E.A0I = instance.getDebugNetworkCallbackWrapper();
            IgImageView.setDebuggable(true);
            IgImageView.setDebugImageViewsTracker(instance.getDebugImageViewsTracker());
            IgImageView.setDebugOverlayDrawer(instance.getDebugOverlayDrawer());
            return;
        }
        instance.setEnabled(false);
        AnonymousClass12C.A0d = false;
        AnonymousClass12E.A0I = null;
        IgImageView.setDebuggable(false);
    }

    public void onUserSessionStart(boolean z) {
        int A03 = AnonymousClass0Z0.A03(-1668923453);
        updateModules(this.mUserSession);
        AnonymousClass0Z0.A0A(2037376528, A03);
    }

    public ImageDebugSessionHelper(AnonymousClass0C1 r1) {
        this.mUserSession = r1;
    }
}
