package p000X;

import android.view.View;

/* renamed from: X.A3o */
public interface A3o extends C23076A4w {
    int addRootView(View view, C228259s1 r2, String str);

    void addUIManagerEventListener(A9T a9t);

    void dispatchCommand(int i, int i2, A1e a1e);

    void dispatchCommand(int i, String str, A1e a1e);

    Object getEventDispatcher();

    void sendAccessibilityEvent(int i, int i2);

    int startSurface(View view, String str, C228259s1 r3, int i, int i2);

    void synchronouslyUpdateViewOnUIThread(int i, C23043A0y a0y);

    void updateRootLayoutSpecs(int i, int i2, int i3);
}
