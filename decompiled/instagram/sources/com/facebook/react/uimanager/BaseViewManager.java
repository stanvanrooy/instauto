package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.facebook.C0003R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000X.A0k;
import p000X.A10;
import p000X.A1C;
import p000X.A1D;
import p000X.A1H;
import p000X.A1I;
import p000X.A1b;
import p000X.A1e;
import p000X.A1k;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0CH;
import p000X.AnonymousClass0FY;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass951;
import p000X.C230109zF;
import p000X.C230299zk;
import p000X.C23043A0y;
import p000X.C23044A0z;
import p000X.C23045A1a;

public abstract class BaseViewManager extends ViewManager {
    public static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = ((float) Math.sqrt(5.0d));
    public static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    public static final String STATE_BUSY = "busy";
    public static final String STATE_CHECKED = "checked";
    public static final String STATE_EXPANDED = "expanded";
    public static final String STATE_MIXED = "mixed";
    public static A1H sMatrixDecompositionContext = new A1H();
    public static final Map sStateDescription;
    public static double[] sTransformDecompositionArray = new double[16];

    private void logUnsupportedPropertyWarning(String str) {
        AnonymousClass0CH.A0C("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    public static void resetTransformProperty(View view) {
        view.setTranslationX(C230109zF.A00(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setTranslationY(C230109zF.A00(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setRotation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotationX(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotationY(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    @ReactProp(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(View view, boolean z) {
        int i = 0;
        if (z) {
            i = 2;
        }
        view.setLayerType(i, (Paint) null);
    }

    static {
        HashMap hashMap = new HashMap();
        sStateDescription = hashMap;
        hashMap.put(STATE_BUSY, Integer.valueOf(C0003R.string.state_busy_description));
        Map map = sStateDescription;
        map.put(STATE_EXPANDED, Integer.valueOf(C0003R.string.state_expanded_description));
        map.put("collapsed", Integer.valueOf(C0003R.string.state_collapsed_description));
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("topAccessibilityAction", C230299zk.A00("registrationName", "onAccessibilityAction"));
        return hashMap;
    }

    @ReactProp(name = "accessibilityActions")
    public void setAccessibilityActions(View view, A1e a1e) {
        if (a1e != null) {
            view.setTag(C0003R.C0005id.accessibility_actions, a1e);
        }
    }

    @ReactProp(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(View view, String str) {
        if (str == null || str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            view.setAccessibilityLiveRegion(0);
        } else if (str.equals("polite")) {
            view.setAccessibilityLiveRegion(1);
        } else if (str.equals("assertive")) {
            view.setAccessibilityLiveRegion(2);
        }
    }

    @ReactProp(name = "accessibilityRole")
    public void setAccessibilityRole(View view, String str) {
        if (str != null) {
            for (A10 a10 : A10.values()) {
                if (a10.name().equalsIgnoreCase(str)) {
                    view.setTag(C0003R.C0005id.accessibility_role, a10);
                    return;
                }
            }
            throw new IllegalArgumentException(AnonymousClass000.A0E("Invalid accessibility role value: ", str));
        }
    }

    @ReactProp(name = "accessibilityValue")
    public void setAccessibilityValue(View view, C23043A0y a0y) {
        if (a0y != null) {
            view.setTag(C0003R.C0005id.accessibility_value, a0y);
            if (a0y.hasKey("text")) {
                updateViewContentDescription(view);
            }
        }
    }

    public void setBorderBottomLeftRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    public void setBorderBottomRightRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    public void setBorderRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    public void setBorderTopLeftRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    public void setBorderTopRightRadius(View view, float f) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @ReactProp(name = "importantForAccessibility")
    public void setImportantForAccessibility(View view, String str) {
        if (str == null || str.equals("auto")) {
            AnonymousClass1E1.A0V(view, 0);
        } else if (str.equals("yes")) {
            AnonymousClass1E1.A0V(view, 1);
        } else if (str.equals("no")) {
            AnonymousClass1E1.A0V(view, 2);
        } else if (str.equals("no-hide-descendants")) {
            AnonymousClass1E1.A0V(view, 4);
        }
    }

    @ReactProp(name = "transform")
    public void setTransform(View view, A1e a1e) {
        if (a1e == null) {
            resetTransformProperty(view);
        } else {
            setTransformProperty(view, a1e);
        }
    }

    @ReactProp(name = "accessibilityState")
    public void setViewState(View view, C23043A0y a0y) {
        if (a0y != null) {
            view.setTag(C0003R.C0005id.accessibility_state, a0y);
            view.setSelected(false);
            view.setEnabled(true);
            ReadableMapKeySetIterator keySetIterator = a0y.keySetIterator();
            while (keySetIterator.Aby()) {
                String Aq1 = keySetIterator.Aq1();
                if (Aq1.equals(STATE_BUSY) || Aq1.equals(STATE_EXPANDED) || (Aq1.equals(STATE_CHECKED) && a0y.getType(STATE_CHECKED) == ReadableType.String)) {
                    updateViewContentDescription(view);
                    return;
                } else if (Build.VERSION.SDK_INT >= 21 && view.isAccessibilityFocused()) {
                    view.sendAccessibilityEvent(1);
                }
            }
        }
    }

    public static float sanitizeFloatPropertyValue(float f) {
        if (f >= -3.4028235E38f && f <= Float.MAX_VALUE) {
            return f;
        }
        if (f < -3.4028235E38f || f == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f > Float.MAX_VALUE || f == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f)) {
            return CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        throw new IllegalStateException(AnonymousClass000.A04("Invalid float property value: ", f));
    }

    private void updateViewAccessibility(View view) {
        boolean z = false;
        if (AnonymousClass1E1.A06(view) != null) {
            z = true;
        }
        if (z) {
            return;
        }
        if (view.getTag(C0003R.C0005id.accessibility_role) != null || view.getTag(C0003R.C0005id.accessibility_state) != null || view.getTag(C0003R.C0005id.accessibility_actions) != null) {
            AnonymousClass1E1.A0b(view, new C23044A0z());
        }
    }

    private void updateViewContentDescription(View view) {
        A1k dynamic;
        Context context;
        int i;
        String str = (String) view.getTag(C0003R.C0005id.accessibility_label);
        C23043A0y a0y = (C23043A0y) view.getTag(C0003R.C0005id.accessibility_state);
        String str2 = (String) view.getTag(C0003R.C0005id.accessibility_hint);
        ArrayList arrayList = new ArrayList();
        C23043A0y a0y2 = (C23043A0y) view.getTag(C0003R.C0005id.accessibility_value);
        if (str != null) {
            arrayList.add(str);
        }
        if (a0y != null) {
            ReadableMapKeySetIterator keySetIterator = a0y.keySetIterator();
            while (keySetIterator.Aby()) {
                String Aq1 = keySetIterator.Aq1();
                A1k dynamic2 = a0y.getDynamic(Aq1);
                if (Aq1.equals(STATE_CHECKED) && dynamic2.AZ8() == ReadableType.String && dynamic2.A5y().equals(STATE_MIXED)) {
                    context = view.getContext();
                    i = C0003R.string.state_mixed_description;
                } else if (Aq1.equals(STATE_BUSY) && dynamic2.AZ8() == ReadableType.Boolean && dynamic2.A5p()) {
                    context = view.getContext();
                    i = C0003R.string.state_busy_description;
                } else if (Aq1.equals(STATE_EXPANDED) && dynamic2.AZ8() == ReadableType.Boolean) {
                    context = view.getContext();
                    boolean A5p = dynamic2.A5p();
                    i = C0003R.string.state_collapsed_description;
                    if (A5p) {
                        i = C0003R.string.state_expanded_description;
                    }
                }
                arrayList.add(context.getString(i));
            }
        }
        if (a0y2 != null && a0y2.hasKey("text") && (dynamic = a0y2.getDynamic("text")) != null && dynamic.AZ8() == ReadableType.String) {
            arrayList.add(dynamic.A5y());
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (arrayList.size() > 0) {
            view.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    public void onAfterUpdateTransaction(View view) {
        super.onAfterUpdateTransaction(view);
        updateViewAccessibility(view);
    }

    @ReactProp(name = "accessibilityHint")
    public void setAccessibilityHint(View view, String str) {
        view.setTag(C0003R.C0005id.accessibility_hint, str);
        updateViewContentDescription(view);
    }

    @ReactProp(name = "accessibilityLabel")
    public void setAccessibilityLabel(View view, String str) {
        view.setTag(C0003R.C0005id.accessibility_label, str);
        updateViewContentDescription(view);
    }

    @ReactProp(name = "elevation")
    public void setElevation(View view, float f) {
        AnonymousClass1E1.A0O(view, C230109zF.A00(f));
    }

    @ReactProp(name = "nativeID")
    public void setNativeId(View view, String str) {
        String str2;
        view.setTag(C0003R.C0005id.view_tag_native_id, str);
        Object tag = view.getTag(C0003R.C0005id.view_tag_native_id);
        if (tag instanceof String) {
            str2 = (String) tag;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            Iterator it = A1I.A00.iterator();
            while (it.hasNext()) {
                if (str2.equals(((A1b) it.next()).getNativeId())) {
                    it.remove();
                }
            }
            for (Map.Entry entry : A1I.A01.entrySet()) {
                Set set = (Set) entry.getValue();
                if (set != null && set.contains(str2)) {
                    entry.getKey();
                }
            }
        }
    }

    @ReactProp(name = "testID")
    public void setTestId(View view, String str) {
        view.setTag(C0003R.C0005id.react_test_id, str);
        view.setTag(str);
    }

    @ReactProp(defaultFloat = 0.0f, name = "translateX")
    public void setTranslateX(View view, float f) {
        view.setTranslationX(C230109zF.A00(f));
    }

    @ReactProp(defaultFloat = 0.0f, name = "translateY")
    public void setTranslateY(View view, float f) {
        view.setTranslationY(C230109zF.A00(f));
    }

    @ReactProp(name = "zIndex")
    public void setZIndex(View view, float f) {
        ViewGroupManager.setViewZIndex(view, Math.round(f));
        ViewParent parent = view.getParent();
        if (parent instanceof C23045A1a) {
            ((C23045A1a) parent).Bsd();
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(View view, int i) {
        view.setBackgroundColor(i);
    }

    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(View view, float f) {
        view.setAlpha(f);
    }

    @ReactProp(name = "rotation")
    public void setRotation(View view, float f) {
        view.setRotation(f);
    }

    @ReactProp(defaultFloat = 1.0f, name = "scaleX")
    public void setScaleX(View view, float f) {
        view.setScaleX(f);
    }

    @ReactProp(defaultFloat = 1.0f, name = "scaleY")
    public void setScaleY(View view, float f) {
        view.setScaleY(f);
    }

    public static void setTransformProperty(View view, A1e a1e) {
        double d;
        A1H a1h = sMatrixDecompositionContext;
        A1H.A00(a1h.A00);
        A1H.A00(a1h.A02);
        A1H.A00(a1h.A03);
        A1H.A00(a1h.A04);
        A1H.A00(a1h.A01);
        double[] dArr = sTransformDecompositionArray;
        double[] dArr2 = (double[]) A1D.A00.get();
        A1C.A04(dArr);
        A1e a1e2 = a1e;
        if (a1e2.size() == 16 && a1e2.getType(0) == ReadableType.Number) {
            for (int i = 0; i < a1e2.size(); i++) {
                dArr[i] = a1e2.getDouble(i);
            }
        } else {
            int size = a1e2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C23043A0y map = a1e2.getMap(i2);
                String Aq1 = map.keySetIterator().Aq1();
                A1C.A04(dArr2);
                if ("matrix".equals(Aq1)) {
                    A1e array = map.getArray(Aq1);
                    for (int i3 = 0; i3 < 16; i3++) {
                        dArr2[i3] = array.getDouble(i3);
                    }
                } else if ("perspective".equals(Aq1)) {
                    dArr2[11] = -1.0d / map.getDouble(Aq1);
                } else if ("rotateX".equals(Aq1)) {
                    double A00 = A1D.A00(map, Aq1);
                    double cos = Math.cos(A00);
                    dArr2[5] = cos;
                    double sin = Math.sin(A00);
                    dArr2[6] = sin;
                    dArr2[9] = -sin;
                    dArr2[10] = cos;
                } else if ("rotateY".equals(Aq1)) {
                    double A002 = A1D.A00(map, Aq1);
                    double cos2 = Math.cos(A002);
                    dArr2[0] = cos2;
                    double sin2 = Math.sin(A002);
                    dArr2[2] = -sin2;
                    dArr2[8] = sin2;
                    dArr2[10] = cos2;
                } else if ("rotate".equals(Aq1) || "rotateZ".equals(Aq1)) {
                    double A003 = A1D.A00(map, Aq1);
                    double cos3 = Math.cos(A003);
                    dArr2[0] = cos3;
                    double sin3 = Math.sin(A003);
                    dArr2[1] = sin3;
                    dArr2[4] = -sin3;
                    dArr2[5] = cos3;
                } else {
                    if ("scale".equals(Aq1)) {
                        d = map.getDouble(Aq1);
                        dArr2[0] = d;
                    } else if ("scaleX".equals(Aq1)) {
                        dArr2[0] = map.getDouble(Aq1);
                    } else if ("scaleY".equals(Aq1)) {
                        d = map.getDouble(Aq1);
                    } else {
                        double d2 = 0.0d;
                        if ("translate".equals(Aq1)) {
                            A1e array2 = map.getArray(Aq1);
                            double d3 = array2.getDouble(0);
                            double d4 = array2.getDouble(1);
                            if (array2.size() > 2) {
                                d2 = array2.getDouble(2);
                            }
                            dArr2[12] = d3;
                            dArr2[13] = d4;
                            dArr2[14] = d2;
                        } else if ("translateX".equals(Aq1)) {
                            dArr2[12] = map.getDouble(Aq1);
                            dArr2[13] = 0.0d;
                        } else if ("translateY".equals(Aq1)) {
                            double d5 = map.getDouble(Aq1);
                            dArr2[12] = 0.0d;
                            dArr2[13] = d5;
                        } else if ("skewX".equals(Aq1)) {
                            dArr2[4] = Math.tan(A1D.A00(map, Aq1));
                        } else if ("skewY".equals(Aq1)) {
                            dArr2[1] = Math.tan(A1D.A00(map, Aq1));
                        } else {
                            throw new A0k(AnonymousClass000.A0E("Unsupported transform type: ", Aq1));
                        }
                    }
                    dArr2[5] = d;
                }
                double d6 = dArr[0];
                double d7 = dArr[1];
                double d8 = dArr[2];
                double d9 = dArr[3];
                double d10 = dArr[4];
                double d11 = dArr[5];
                double d12 = dArr[6];
                double d13 = dArr[7];
                double d14 = dArr[8];
                double d15 = dArr[9];
                double d16 = dArr[10];
                double d17 = dArr[11];
                double d18 = dArr[12];
                double d19 = dArr[13];
                double d20 = dArr[14];
                double d21 = dArr[15];
                double d22 = dArr2[0];
                double d23 = dArr2[1];
                double d24 = dArr2[2];
                double d25 = dArr2[3];
                dArr[0] = (d22 * d6) + (d23 * d10) + (d24 * d14) + (d25 * d18);
                dArr[1] = (d22 * d7) + (d23 * d11) + (d24 * d15) + (d25 * d19);
                dArr[2] = (d22 * d8) + (d23 * d12) + (d24 * d16) + (d25 * d20);
                dArr[3] = (d22 * d9) + (d23 * d13) + (d24 * d17) + (d25 * d21);
                double d26 = dArr2[4];
                double d27 = dArr2[5];
                double d28 = dArr2[6];
                double d29 = dArr2[7];
                dArr[4] = (d26 * d6) + (d27 * d10) + (d28 * d14) + (d29 * d18);
                dArr[5] = (d26 * d7) + (d27 * d11) + (d28 * d15) + (d29 * d19);
                dArr[6] = (d26 * d8) + (d27 * d12) + (d28 * d16) + (d29 * d20);
                dArr[7] = (d26 * d9) + (d27 * d13) + (d28 * d17) + (d29 * d21);
                double d30 = dArr2[8];
                double d31 = dArr2[9];
                double d32 = dArr2[10];
                double d33 = dArr2[11];
                dArr[8] = (d30 * d6) + (d31 * d10) + (d32 * d14) + (d33 * d18);
                dArr[9] = (d30 * d7) + (d31 * d11) + (d32 * d15) + (d33 * d19);
                dArr[10] = (d30 * d8) + (d31 * d12) + (d32 * d16) + (d33 * d20);
                dArr[11] = (d30 * d9) + (d31 * d13) + (d32 * d17) + (d33 * d21);
                double d34 = dArr2[12];
                double d35 = dArr2[13];
                double d36 = dArr2[14];
                double d37 = dArr2[15];
                dArr[12] = (d6 * d34) + (d10 * d35) + (d14 * d36) + (d18 * d37);
                dArr[13] = (d7 * d34) + (d11 * d35) + (d15 * d36) + (d19 * d37);
                dArr[14] = (d8 * d34) + (d12 * d35) + (d16 * d36) + (d20 * d37);
                dArr[15] = (d34 * d9) + (d35 * d13) + (d36 * d17) + (d37 * d21);
            }
        }
        double[] dArr3 = sTransformDecompositionArray;
        A1H a1h2 = sMatrixDecompositionContext;
        Class<double> cls = double.class;
        boolean z = false;
        if (dArr3.length == 16) {
            z = true;
        }
        AnonymousClass0FY.A02(z);
        double[] dArr4 = a1h2.A00;
        double[] dArr5 = a1h2.A02;
        double[] dArr6 = a1h2.A03;
        double[] dArr7 = a1h2.A04;
        double[] dArr8 = a1h2.A01;
        if (!A1C.A05(dArr3[15])) {
            double[][] dArr9 = (double[][]) Array.newInstance(cls, new int[]{4, 4});
            double[] dArr10 = new double[16];
            for (int i4 = 0; i4 < 4; i4++) {
                for (int i5 = 0; i5 < 4; i5++) {
                    int i6 = (i4 << 2) + i5;
                    double d38 = dArr3[i6] / dArr3[15];
                    dArr9[i4][i5] = d38;
                    if (i5 == 3) {
                        d38 = 0.0d;
                    }
                    dArr10[i6] = d38;
                }
            }
            dArr10[15] = 1.0d;
            if (!A1C.A05(A1C.A01(dArr10))) {
                double d39 = dArr9[0][3];
                if (!A1C.A05(d39) || !A1C.A05(dArr9[1][3]) || !A1C.A05(dArr9[2][3])) {
                    double[] dArr11 = {d39, dArr9[1][3], dArr9[2][3], dArr9[3][3]};
                    double A01 = A1C.A01(dArr10);
                    if (!A1C.A05(A01)) {
                        double d40 = dArr10[0];
                        double d41 = dArr10[1];
                        double d42 = dArr10[2];
                        double d43 = dArr10[3];
                        double d44 = dArr10[4];
                        double d45 = dArr10[5];
                        double d46 = dArr10[6];
                        double d47 = dArr10[7];
                        double d48 = dArr10[8];
                        double d49 = dArr10[9];
                        double d50 = dArr10[10];
                        double d51 = dArr10[11];
                        double d52 = dArr10[12];
                        double d53 = dArr10[13];
                        double d54 = dArr10[14];
                        double d55 = dArr10[15];
                        double d56 = d46 * d51;
                        double d57 = d47 * d50;
                        double d58 = d47 * d49;
                        double d59 = d45 * d51;
                        double d60 = d46 * d49;
                        double d61 = d45 * d50;
                        double d62 = d43 * d50;
                        double d63 = d42 * d51;
                        double d64 = d43 * d49;
                        double d65 = d41 * d51;
                        double d66 = d42 * d49;
                        double d67 = d41 * d50;
                        double d68 = d42 * d47;
                        double d69 = d43 * d46;
                        double d70 = d43 * d45;
                        double d71 = d41 * d47;
                        double d72 = d42 * d45;
                        double d73 = d41 * d46;
                        double d74 = d47 * d48;
                        double d75 = d44 * d51;
                        double d76 = d46 * d48;
                        double d77 = d44 * d50;
                        double d78 = d43 * d48;
                        double d79 = d40 * d51;
                        double d80 = d42 * d48;
                        double d81 = d40 * d50;
                        double d82 = d43 * d44;
                        double d83 = d47 * d40;
                        double d84 = d42 * d44;
                        double d85 = d46 * d40;
                        double d86 = d45 * d48;
                        double d87 = d44 * d49;
                        double d88 = d41 * d48;
                        double d89 = d40 * d49;
                        double d90 = d41 * d44;
                        double d91 = d40 * d45;
                        dArr10 = new double[]{((((((d56 * d53) - (d57 * d53)) + (d58 * d54)) - (d59 * d54)) - (d60 * d55)) + (d61 * d55)) / A01, ((((((d62 * d53) - (d63 * d53)) - (d64 * d54)) + (d65 * d54)) + (d66 * d55)) - (d67 * d55)) / A01, ((((((d68 * d53) - (d69 * d53)) + (d70 * d54)) - (d71 * d54)) - (d72 * d55)) + (d73 * d55)) / A01, ((((((d69 * d49) - (d68 * d49)) - (d70 * d50)) + (d71 * d50)) + (d72 * d51)) - (d73 * d51)) / A01, ((((((d57 * d52) - (d56 * d52)) - (d74 * d54)) + (d75 * d54)) + (d76 * d55)) - (d77 * d55)) / A01, ((((((d63 * d52) - (d62 * d52)) + (d78 * d54)) - (d79 * d54)) - (d80 * d55)) + (d81 * d55)) / A01, ((((((d69 * d52) - (d68 * d52)) - (d82 * d54)) + (d83 * d54)) + (d84 * d55)) - (d85 * d55)) / A01, ((((((d68 * d48) - (d69 * d48)) + (d82 * d50)) - (d83 * d50)) - (d84 * d51)) + (d85 * d51)) / A01, ((((((d59 * d52) - (d58 * d52)) + (d74 * d53)) - (d75 * d53)) - (d86 * d55)) + (d87 * d55)) / A01, ((((((d64 * d52) - (d65 * d52)) - (d78 * d53)) + (d79 * d53)) + (d88 * d55)) - (d89 * d55)) / A01, ((((((d71 * d52) - (d70 * d52)) + (d82 * d53)) - (d83 * d53)) - (d90 * d55)) + (d55 * d91)) / A01, ((((((d70 * d48) - (d71 * d48)) - (d82 * d49)) + (d83 * d49)) + (d90 * d51)) - (d51 * d91)) / A01, ((((((d60 * d52) - (d61 * d52)) - (d76 * d53)) + (d77 * d53)) + (d86 * d54)) - (d87 * d54)) / A01, ((((((d67 * d52) - (d66 * d52)) + (d80 * d53)) - (d81 * d53)) - (d88 * d54)) + (d89 * d54)) / A01, ((((((d72 * d52) - (d52 * d73)) - (d84 * d53)) + (d53 * d85)) + (d90 * d54)) - (d54 * d91)) / A01, ((((((d73 * d48) - (d72 * d48)) + (d84 * d49)) - (d85 * d49)) - (d90 * d50)) + (d91 * d50)) / A01};
                    }
                    double[] dArr12 = {dArr10[0], dArr10[4], dArr10[8], dArr10[12], dArr10[1], dArr10[5], dArr10[9], dArr10[13], dArr10[2], dArr10[6], dArr10[10], dArr10[14], dArr10[3], dArr10[7], dArr10[11], dArr10[15]};
                    double d92 = dArr11[0];
                    double d93 = dArr11[1];
                    double d94 = dArr11[2];
                    double d95 = dArr11[3];
                    dArr4[0] = (dArr12[0] * d92) + (dArr12[4] * d93) + (dArr12[8] * d94) + (dArr12[12] * d95);
                    dArr4[1] = (dArr12[1] * d92) + (dArr12[5] * d93) + (dArr12[9] * d94) + (dArr12[13] * d95);
                    dArr4[2] = (dArr12[2] * d92) + (dArr12[6] * d93) + (dArr12[10] * d94) + (dArr12[14] * d95);
                    dArr4[3] = (d92 * dArr12[3]) + (d93 * dArr12[7]) + (d94 * dArr12[11]) + (d95 * dArr12[15]);
                } else {
                    dArr4[2] = 0.0d;
                    dArr4[1] = 0.0d;
                    dArr4[0] = 0.0d;
                    dArr4[3] = 1.0d;
                }
                for (int i7 = 0; i7 < 3; i7++) {
                    dArr7[i7] = dArr9[3][i7];
                }
                double[][] dArr13 = (double[][]) Array.newInstance(cls, new int[]{3, 3});
                for (int i8 = 0; i8 < 3; i8++) {
                    double[] dArr14 = dArr13[i8];
                    double[] dArr15 = dArr9[i8];
                    dArr14[0] = dArr15[0];
                    dArr14[1] = dArr15[1];
                    dArr14[2] = dArr15[2];
                }
                double[] dArr16 = dArr13[0];
                double A02 = A1C.A02(dArr16);
                dArr5[0] = A02;
                double[] A06 = A1C.A06(dArr16, A02);
                dArr13[0] = A06;
                double[] dArr17 = dArr13[1];
                double A03 = A1C.A03(A06, dArr17);
                dArr6[0] = A03;
                double[] A07 = A1C.A07(dArr17, A06, -A03);
                dArr13[1] = A07;
                double A022 = A1C.A02(A07);
                dArr5[1] = A022;
                dArr13[1] = A1C.A06(A07, A022);
                dArr6[0] = dArr6[0] / dArr5[1];
                double[] dArr18 = dArr13[0];
                double[] dArr19 = dArr13[2];
                double A032 = A1C.A03(dArr18, dArr19);
                dArr6[1] = A032;
                double[] A072 = A1C.A07(dArr19, dArr18, -A032);
                dArr13[2] = A072;
                double[] dArr20 = dArr13[1];
                double A033 = A1C.A03(dArr20, A072);
                dArr6[2] = A033;
                double[] A073 = A1C.A07(A072, dArr20, -A033);
                dArr13[2] = A073;
                double A023 = A1C.A02(A073);
                dArr5[2] = A023;
                double[] A062 = A1C.A06(A073, A023);
                dArr13[2] = A062;
                dArr6[1] = dArr6[1] / dArr5[2];
                dArr6[2] = dArr6[2] / dArr5[2];
                double[] dArr21 = dArr13[1];
                double[] dArr22 = {(dArr21[1] * A062[2]) - (dArr21[2] * A062[1]), (dArr21[2] * A062[0]) - (dArr21[0] * A062[2]), (dArr21[0] * A062[1]) - (dArr21[1] * A062[0])};
                double[] dArr23 = dArr13[0];
                if (A1C.A03(dArr23, dArr22) < 0.0d) {
                    for (int i9 = 0; i9 < 3; i9++) {
                        dArr5[i9] = dArr5[i9] * -1.0d;
                        double[] dArr24 = dArr13[i9];
                        dArr24[0] = dArr24[0] * -1.0d;
                        dArr24[1] = dArr24[1] * -1.0d;
                        dArr24[2] = dArr24[2] * -1.0d;
                    }
                }
                dArr8[0] = A1C.A00((-Math.atan2(A062[1], A062[2])) * 57.29577951308232d);
                double d96 = -A062[0];
                double d97 = A062[1];
                double d98 = A062[2];
                dArr8[1] = A1C.A00((-Math.atan2(d96, Math.sqrt((d97 * d97) + (d98 * d98)))) * 57.29577951308232d);
                dArr8[2] = A1C.A00((-Math.atan2(dArr21[0], dArr23[0])) * 57.29577951308232d);
            }
        }
        View view2 = view;
        view2.setTranslationX(C230109zF.A00(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.A04[0])));
        view2.setTranslationY(C230109zF.A00(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.A04[1])));
        view2.setRotation(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.A01[2]));
        view2.setRotationX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.A01[0]));
        view2.setRotationY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.A01[1]));
        view2.setScaleX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.A02[0]));
        view2.setScaleY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.A02[1]));
        double[] dArr25 = sMatrixDecompositionContext.A00;
        if (dArr25.length > 2) {
            float f = (float) dArr25[2];
            if (f == CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = 7.8125E-4f;
            }
            float f2 = -1.0f / f;
            float f3 = AnonymousClass951.A00.density;
            view2.setCameraDistance(sanitizeFloatPropertyValue(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }
}
