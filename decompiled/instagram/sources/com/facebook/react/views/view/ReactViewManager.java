package com.facebook.react.views.view;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p000X.A0k;
import p000X.A1e;
import p000X.A64;
import p000X.A67;
import p000X.C228129rn;
import p000X.C230109zF;
import p000X.C230349zs;
import p000X.C23043A0y;
import p000X.C23053A3d;
import p000X.C23081A5s;

@ReactModule(name = "RCTView")
public class ReactViewManager extends ReactClippingViewManager {
    public static final int CMD_HOTSPOT_UPDATE = 1;
    public static final int CMD_SET_PRESSED = 2;
    public static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};

    public Map getCommandsMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(HOTSPOT_UPDATE_KEY, 1);
        hashMap.put("setPressed", 2);
        return hashMap;
    }

    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "collapsable")
    public void setCollapsable(C23081A5s a5s, boolean z) {
    }

    private void handleHotspotUpdate(C23081A5s a5s, A1e a1e) {
        if (a1e == null || a1e.size() != 2) {
            throw new A0k("Illegal number of arguments for 'updateHotspot' command");
        } else if (Build.VERSION.SDK_INT >= 21) {
            a5s.drawableHotspotChanged(C230109zF.A00((float) a1e.getDouble(0)), C230109zF.A00((float) a1e.getDouble(1)));
        }
    }

    private void handleSetPressed(C23081A5s a5s, A1e a1e) {
        if (a1e == null || a1e.size() != 1) {
            throw new A0k("Illegal number of arguments for 'setPressed' command");
        }
        a5s.setPressed(a1e.getBoolean(0));
    }

    @ReactPropGroup(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor"})
    public void setBorderColor(C23081A5s a5s, int i, Integer num) {
        float intValue;
        float f = Float.NaN;
        if (num == null) {
            intValue = Float.NaN;
        } else {
            intValue = (float) (num.intValue() & 16777215);
        }
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        a5s.A06(SPACING_TYPES[i], intValue, f);
    }

    @ReactProp(name = "focusable")
    public void setFocusable(C23081A5s a5s, boolean z) {
        if (z) {
            a5s.setOnClickListener(new A67(this, a5s));
            a5s.setFocusable(true);
            return;
        }
        a5s.setOnClickListener((View.OnClickListener) null);
        a5s.setClickable(false);
    }

    @ReactProp(name = "hitSlop")
    public void setHitSlop(C23081A5s a5s, C23043A0y a0y) {
        int i;
        int i2;
        int i3;
        if (a0y == null) {
            a5s.A04 = null;
            return;
        }
        int i4 = 0;
        if (a0y.hasKey("left")) {
            i = (int) C230109zF.A00((float) a0y.getDouble("left"));
        } else {
            i = 0;
        }
        if (a0y.hasKey("top")) {
            i2 = (int) C230109zF.A00((float) a0y.getDouble("top"));
        } else {
            i2 = 0;
        }
        if (a0y.hasKey("right")) {
            i3 = (int) C230109zF.A00((float) a0y.getDouble("right"));
        } else {
            i3 = 0;
        }
        if (a0y.hasKey("bottom")) {
            i4 = (int) C230109zF.A00((float) a0y.getDouble("bottom"));
        }
        a5s.A04 = new Rect(i, i2, i3, i4);
    }

    @ReactProp(name = "nativeBackgroundAndroid")
    public void setNativeBackground(C23081A5s a5s, C23043A0y a0y) {
        Drawable A00;
        if (a0y == null) {
            A00 = null;
        } else {
            A00 = C228129rn.A00(a5s.getContext(), a0y);
        }
        a5s.setTranslucentBackgroundDrawable(A00);
    }

    @ReactProp(name = "nativeForegroundAndroid")
    public void setNativeForeground(C23081A5s a5s, C23043A0y a0y) {
        Drawable A00;
        if (a0y == null) {
            A00 = null;
        } else {
            A00 = C228129rn.A00(a5s.getContext(), a0y);
        }
        a5s.setForeground(A00);
    }

    @ReactProp(name = "pointerEvents")
    public void setPointerEvents(C23081A5s a5s, String str) {
        if (str == null) {
            a5s.A05 = A64.AUTO;
        } else {
            a5s.A05 = A64.valueOf(str.toUpperCase(Locale.US).replace("-", "_"));
        }
    }

    @ReactProp(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(C23081A5s a5s, boolean z) {
        if (z) {
            a5s.setFocusable(true);
            a5s.setFocusableInTouchMode(true);
            a5s.requestFocus();
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius"})
    public void setBorderRadius(C23081A5s a5s, int i, float f) {
        if (!C230349zs.A00(f) && f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f = Float.NaN;
        }
        if (!C230349zs.A00(f)) {
            f = C230109zF.A00(f);
        }
        if (i == 0) {
            a5s.setBorderRadius(f);
        } else {
            a5s.A04(f, i - 1);
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(C23081A5s a5s, int i, float f) {
        if (!C230349zs.A00(f) && f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f = Float.NaN;
        }
        if (!C230349zs.A00(f)) {
            f = C230109zF.A00(f);
        }
        a5s.A05(SPACING_TYPES[i], f);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(C23081A5s a5s, int i) {
        a5s.setNextFocusDownId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(C23081A5s a5s, int i) {
        a5s.setNextFocusForwardId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(C23081A5s a5s, int i) {
        a5s.setNextFocusLeftId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(C23081A5s a5s, int i) {
        a5s.setNextFocusRightId(i);
    }

    @ReactProp(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(C23081A5s a5s, int i) {
        a5s.setNextFocusUpId(i);
    }

    @ReactProp(name = "accessible")
    public void setAccessible(C23081A5s a5s, boolean z) {
        a5s.setFocusable(z);
    }

    @ReactProp(name = "backfaceVisibility")
    public void setBackfaceVisibility(C23081A5s a5s, String str) {
        a5s.setBackfaceVisibility(str);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(C23081A5s a5s, String str) {
        a5s.setBorderStyle(str);
    }

    @ReactProp(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(C23081A5s a5s, boolean z) {
        a5s.A09 = z;
    }

    @ReactProp(name = "overflow")
    public void setOverflow(C23081A5s a5s, String str) {
        a5s.setOverflow(str);
    }

    public C23081A5s createViewInstance(C23053A3d a3d) {
        return new C23081A5s(a3d);
    }

    public void receiveCommand(C23081A5s a5s, int i, A1e a1e) {
        if (i == 1) {
            handleHotspotUpdate(a5s, a1e);
        } else if (i == 2) {
            handleSetPressed(a5s, a1e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r5.equals("setPressed") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r5.equals(HOTSPOT_UPDATE_KEY) == false) goto L_0x0018;
     */
    public void receiveCommand(C23081A5s a5s, String str, A1e a1e) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1639565984) {
            c = 1;
        } else if (hashCode == -399823752) {
            c = 0;
        }
        c = 65535;
        if (c == 0) {
            handleHotspotUpdate(a5s, a1e);
        } else if (c == 1) {
            handleSetPressed(a5s, a1e);
        }
    }

    public void setOpacity(C23081A5s a5s, float f) {
        a5s.setOpacityIfPossible(f);
    }

    public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
        ((C23081A5s) view).setOpacityIfPossible(f);
    }

    public void setTransform(C23081A5s a5s, A1e a1e) {
        super.setTransform(a5s, a1e);
        a5s.A03();
    }
}
