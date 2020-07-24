package com.facebook.react.views.slider;

import android.view.View;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ViewManagerSetter;
import java.util.Map;
import p000X.A15;
import p000X.A1e;
import p000X.C120125Dh;
import p000X.C206578th;
import p000X.C23043A0y;

public class ReactSliderManager$$PropsSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
    public final void ATE(Map map) {
        map.put("accessibilityActions", "Array");
        map.put("accessibilityHint", "String");
        map.put("accessibilityLabel", "String");
        map.put("accessibilityLiveRegion", "String");
        map.put("accessibilityRole", "String");
        map.put("accessibilityState", "Map");
        map.put("accessibilityValue", "Map");
        map.put("backgroundColor", "Color");
        map.put("elevation", "number");
        map.put("enabled", "boolean");
        map.put("importantForAccessibility", "String");
        map.put("maximumTrackTintColor", "Color");
        map.put("maximumValue", "number");
        map.put("minimumTrackTintColor", "Color");
        map.put("minimumValue", "number");
        map.put("nativeID", "String");
        map.put("opacity", "number");
        map.put("renderToHardwareTextureAndroid", "boolean");
        map.put("rotation", "number");
        map.put("scaleX", "number");
        map.put("scaleY", "number");
        map.put("step", "number");
        map.put("testID", "String");
        map.put("thumbTintColor", "Color");
        map.put("transform", "Array");
        map.put("translateX", "number");
        map.put("translateY", "number");
        map.put("value", "number");
        map.put("zIndex", "number");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: boolean} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r11.equals("translateY") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r11.equals("enabled") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r11.equals("opacity") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r11.equals("minimumTrackTintColor") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (r11.equals("scaleX") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (r11.equals("scaleY") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r11.equals("testID") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r11.equals("zIndex") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        if (r11.equals("accessibilityHint") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        if (r11.equals("accessibilityRole") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        if (r11.equals("renderToHardwareTextureAndroid") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b0, code lost:
        if (r11.equals("rotation") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        if (r11.equals("elevation") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c8, code lost:
        if (r11.equals("step") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
        if (r11.equals("accessibilityLiveRegion") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        if (r11.equals("value") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00eb, code lost:
        if (r11.equals("maximumValue") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        if (r11.equals("importantForAccessibility") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0103, code lost:
        if (r11.equals("transform") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (r11.equals("accessibilityLabel") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0119, code lost:
        if (r11.equals("accessibilityState") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0124, code lost:
        if (r11.equals("accessibilityValue") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0130, code lost:
        if (r11.equals("minimumValue") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013b, code lost:
        if (r11.equals("backgroundColor") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0146, code lost:
        if (r11.equals("accessibilityActions") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0152, code lost:
        if (r11.equals("thumbTintColor") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015e, code lost:
        if (r11.equals("nativeID") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r11.equals("maximumTrackTintColor") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r11.equals("translateX") == false) goto L_0x000d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void Bjs(ViewManager viewManager, View view, String str, Object obj) {
        char c;
        double doubleValue;
        ReactSliderManager reactSliderManager = (ReactSliderManager) viewManager;
        A15 a15 = (A15) view;
        boolean z = true;
        boolean z2 = false;
        switch (str.hashCode()) {
            case -1900655011:
                c = 11;
                break;
            case -1721943862:
                c = 25;
                break;
            case -1721943861:
                c = 26;
                break;
            case -1609594047:
                c = 9;
                break;
            case -1267206133:
                c = 16;
                break;
            case -1021497397:
                c = 13;
                break;
            case -908189618:
                c = 19;
                break;
            case -908189617:
                c = 20;
                break;
            case -877170387:
                c = 22;
                break;
            case -731417480:
                c = 28;
                break;
            case -101663499:
                c = 1;
                break;
            case -101359900:
                c = 4;
                break;
            case -80891667:
                c = 17;
                break;
            case -40300674:
                c = 18;
                break;
            case -4379043:
                c = 8;
                break;
            case 3540684:
                c = 21;
                break;
            case 36255470:
                c = 3;
                break;
            case 111972721:
                c = 27;
                break;
            case 718061361:
                c = 12;
                break;
            case 746986311:
                c = 10;
                break;
            case 1052666732:
                c = 24;
                break;
            case 1146842694:
                c = 2;
                break;
            case 1153872867:
                c = 5;
                break;
            case 1156088003:
                c = 6;
                break;
            case 1192487427:
                c = 14;
                break;
            case 1287124693:
                c = 7;
                break;
            case 1505602511:
                c = 0;
                break;
            case 1912319986:
                c = 23;
                break;
            case 2045685618:
                c = 15;
                break;
            default:
                c = 65535;
                break;
        }
        float f = 1.0f;
        double d = 0.0d;
        Integer num = null;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        switch (c) {
            case 0:
                reactSliderManager.setAccessibilityActions(a15, (A1e) obj);
                return;
            case 1:
                reactSliderManager.setAccessibilityHint(a15, (String) obj);
                return;
            case 2:
                reactSliderManager.setAccessibilityLabel(a15, (String) obj);
                return;
            case 3:
                reactSliderManager.setAccessibilityLiveRegion(a15, (String) obj);
                return;
            case 4:
                reactSliderManager.setAccessibilityRole(a15, (String) obj);
                return;
            case 5:
                reactSliderManager.setViewState(a15, (C23043A0y) obj);
                return;
            case 6:
                reactSliderManager.setAccessibilityValue(a15, (C23043A0y) obj);
                return;
            case 7:
                if (obj != null) {
                    z2 = C206578th.A00(obj, a15.getContext()).intValue();
                }
                reactSliderManager.setBackgroundColor(a15, z2);
                return;
            case 8:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactSliderManager.setElevation(a15, f2);
                return;
            case 9:
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                a15.setEnabled(z);
                return;
            case 10:
                reactSliderManager.setImportantForAccessibility(a15, (String) obj);
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj, a15.getContext()).intValue());
                }
                reactSliderManager.setMaximumTrackTintColor(a15, num);
                return;
            case C120125Dh.VIEW_TYPE_SPINNER:
                if (obj == null) {
                    doubleValue = 1.0d;
                } else {
                    doubleValue = ((Double) obj).doubleValue();
                }
                a15.setMaxValue(doubleValue);
                return;
            case C120125Dh.VIEW_TYPE_BADGE:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj, a15.getContext()).intValue());
                }
                reactSliderManager.setMinimumTrackTintColor(a15, num);
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                if (obj != null) {
                    d = ((Double) obj).doubleValue();
                }
                a15.setMinValue(d);
                return;
            case 15:
                reactSliderManager.setNativeId(a15, (String) obj);
                return;
            case 16:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                reactSliderManager.setOpacity(a15, f);
                return;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactSliderManager.setRenderToHardwareTexture(a15, z2);
                return;
            case 18:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                a15.setRotation(f2);
                return;
            case 19:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                a15.setScaleX(f);
                return;
            case 20:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                a15.setScaleY(f);
                return;
            case C120125Dh.VIEW_TYPE_BRANDING:
                if (obj != null) {
                    d = ((Double) obj).doubleValue();
                }
                a15.setStep(d);
                return;
            case C120125Dh.NUM_VIEW_TYPES:
                reactSliderManager.setTestId(a15, (String) obj);
                return;
            case 23:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj, a15.getContext()).intValue());
                }
                reactSliderManager.setThumbTintColor(a15, num);
                return;
            case 24:
                reactSliderManager.setTransform(a15, (A1e) obj);
                return;
            case 25:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactSliderManager.setTranslateX(a15, f2);
                return;
            case OdexSchemeArtXdex.OREO_SDK_INT:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactSliderManager.setTranslateY(a15, f2);
                return;
            case 27:
                if (obj != null) {
                    d = ((Double) obj).doubleValue();
                }
                reactSliderManager.setValue(a15, d);
                return;
            case 28:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactSliderManager.setZIndex(a15, f2);
                return;
            default:
                return;
        }
    }
}
