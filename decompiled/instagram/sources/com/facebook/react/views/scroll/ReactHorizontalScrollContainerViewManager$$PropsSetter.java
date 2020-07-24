package com.facebook.react.views.scroll;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ViewManagerSetter;
import java.util.Map;
import p000X.A1e;
import p000X.A39;
import p000X.C120125Dh;
import p000X.C206578th;
import p000X.C23043A0y;

public class ReactHorizontalScrollContainerViewManager$$PropsSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
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
        map.put("importantForAccessibility", "String");
        map.put("nativeID", "String");
        map.put("opacity", "number");
        map.put("removeClippedSubviews", "boolean");
        map.put("renderToHardwareTextureAndroid", "boolean");
        map.put("rotation", "number");
        map.put("scaleX", "number");
        map.put("scaleY", "number");
        map.put("testID", "String");
        map.put("transform", "Array");
        map.put("translateX", "number");
        map.put("translateY", "number");
        map.put("zIndex", "number");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r7.equals("opacity") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r7.equals("scaleX") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r7.equals("scaleY") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r7.equals("testID") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r7.equals("zIndex") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (r7.equals("removeClippedSubviews") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (r7.equals("accessibilityHint") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r7.equals("accessibilityRole") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r7.equals("renderToHardwareTextureAndroid") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        if (r7.equals("rotation") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        if (r7.equals("elevation") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        if (r7.equals("accessibilityLiveRegion") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b6, code lost:
        if (r7.equals("importantForAccessibility") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c2, code lost:
        if (r7.equals("transform") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        if (r7.equals("accessibilityLabel") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d8, code lost:
        if (r7.equals("accessibilityState") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        if (r7.equals("accessibilityValue") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ee, code lost:
        if (r7.equals("backgroundColor") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f9, code lost:
        if (r7.equals("accessibilityActions") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0105, code lost:
        if (r7.equals("nativeID") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r7.equals("translateX") == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r7.equals("translateY") == false) goto L_0x000c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void Bjs(ViewManager viewManager, View view, String str, Object obj) {
        char c;
        ReactHorizontalScrollContainerViewManager reactHorizontalScrollContainerViewManager = (ReactHorizontalScrollContainerViewManager) viewManager;
        A39 a39 = (A39) view;
        boolean z = false;
        switch (str.hashCode()) {
            case -1721943862:
                c = 19;
                break;
            case -1721943861:
                c = 20;
                break;
            case -1267206133:
                c = 11;
                break;
            case -908189618:
                c = 15;
                break;
            case -908189617:
                c = 16;
                break;
            case -877170387:
                c = 17;
                break;
            case -731417480:
                c = 21;
                break;
            case -252105751:
                c = 12;
                break;
            case -101663499:
                c = 1;
                break;
            case -101359900:
                c = 4;
                break;
            case -80891667:
                c = 13;
                break;
            case -40300674:
                c = 14;
                break;
            case -4379043:
                c = 8;
                break;
            case 36255470:
                c = 3;
                break;
            case 746986311:
                c = 9;
                break;
            case 1052666732:
                c = 18;
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
            case 1287124693:
                c = 7;
                break;
            case 1505602511:
                c = 0;
                break;
            case 2045685618:
                c = 10;
                break;
            default:
                c = 65535;
                break;
        }
        float f = 1.0f;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        switch (c) {
            case 0:
                reactHorizontalScrollContainerViewManager.setAccessibilityActions(a39, (A1e) obj);
                return;
            case 1:
                reactHorizontalScrollContainerViewManager.setAccessibilityHint(a39, (String) obj);
                return;
            case 2:
                reactHorizontalScrollContainerViewManager.setAccessibilityLabel(a39, (String) obj);
                return;
            case 3:
                reactHorizontalScrollContainerViewManager.setAccessibilityLiveRegion(a39, (String) obj);
                return;
            case 4:
                reactHorizontalScrollContainerViewManager.setAccessibilityRole(a39, (String) obj);
                return;
            case 5:
                reactHorizontalScrollContainerViewManager.setViewState(a39, (C23043A0y) obj);
                return;
            case 6:
                reactHorizontalScrollContainerViewManager.setAccessibilityValue(a39, (C23043A0y) obj);
                return;
            case 7:
                if (obj != null) {
                    z = C206578th.A00(obj, a39.getContext()).intValue();
                }
                reactHorizontalScrollContainerViewManager.setBackgroundColor(a39, z);
                return;
            case 8:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactHorizontalScrollContainerViewManager.setElevation(a39, f2);
                return;
            case 9:
                reactHorizontalScrollContainerViewManager.setImportantForAccessibility(a39, (String) obj);
                return;
            case 10:
                reactHorizontalScrollContainerViewManager.setNativeId(a39, (String) obj);
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                reactHorizontalScrollContainerViewManager.setOpacity(a39, f);
                return;
            case C120125Dh.VIEW_TYPE_SPINNER:
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                reactHorizontalScrollContainerViewManager.setRemoveClippedSubviews(a39, z);
                return;
            case C120125Dh.VIEW_TYPE_BADGE:
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                reactHorizontalScrollContainerViewManager.setRenderToHardwareTexture(a39, z);
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                a39.setRotation(f2);
                return;
            case 15:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                a39.setScaleX(f);
                return;
            case 16:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                a39.setScaleY(f);
                return;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                reactHorizontalScrollContainerViewManager.setTestId(a39, (String) obj);
                return;
            case 18:
                reactHorizontalScrollContainerViewManager.setTransform(a39, (A1e) obj);
                return;
            case 19:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactHorizontalScrollContainerViewManager.setTranslateX(a39, f2);
                return;
            case 20:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactHorizontalScrollContainerViewManager.setTranslateY(a39, f2);
                return;
            case C120125Dh.VIEW_TYPE_BRANDING:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactHorizontalScrollContainerViewManager.setZIndex(a39, f2);
                return;
            default:
                return;
        }
    }
}
