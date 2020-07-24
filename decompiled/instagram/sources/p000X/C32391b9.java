package p000X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: X.1b9  reason: invalid class name and case insensitive filesystem */
public class C32391b9 extends AccessibilityNodeProvider {
    public final C32371b7 A00;

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C49532Cp A002 = this.A00.A00(i);
        if (A002 == null) {
            return null;
        }
        return A002.A02;
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.A00.A01(i, i2, bundle);
    }

    public C32391b9(C32371b7 r1) {
        this.A00 = r1;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }
}
