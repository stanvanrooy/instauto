package p000X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: X.A91 */
public final class A91 implements ComponentCallbacks2 {
    public final /* synthetic */ UIManagerModule A00;

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public A91(UIManagerModule uIManagerModule) {
        this.A00 = uIManagerModule;
    }

    public final void onTrimMemory(int i) {
        if (i >= 60) {
            A9N.A00().A00();
        }
    }
}
