package p000X;

import android.net.Uri;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* 'enum' modifier removed */
/* renamed from: X.1No  reason: invalid class name and case insensitive filesystem */
public final class C28871No extends C28841Nk {
    public final boolean A01(String str, AnonymousClass0C1 r5) {
        try {
            return super.A01(str, r5) && Uri.parse(str).getQueryParameter(IgReactNavigatorModule.URL) != null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return false;
        }
    }

    public C28871No() {
        super("OPEN_WEBVIEW", 3, "instagram://webview");
    }
}
