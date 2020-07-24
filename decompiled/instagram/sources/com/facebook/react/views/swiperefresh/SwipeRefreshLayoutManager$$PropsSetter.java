package com.facebook.react.views.swiperefresh;

import android.view.View;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ViewManagerSetter;
import java.util.Map;
import p000X.A1P;
import p000X.A1e;
import p000X.A1k;
import p000X.C120125Dh;
import p000X.C206578th;
import p000X.C23043A0y;
import p000X.C23085A5y;

public class SwipeRefreshLayoutManager$$PropsSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
    public final void ATE(Map map) {
        map.put("accessibilityActions", "Array");
        map.put("accessibilityHint", "String");
        map.put("accessibilityLabel", "String");
        map.put("accessibilityLiveRegion", "String");
        map.put("accessibilityRole", "String");
        map.put("accessibilityState", "Map");
        map.put("accessibilityValue", "Map");
        map.put("backgroundColor", "Color");
        map.put("colors", "ColorArray");
        map.put("elevation", "number");
        map.put("enabled", "boolean");
        map.put("importantForAccessibility", "String");
        map.put("nativeID", "String");
        map.put("opacity", "number");
        map.put("progressBackgroundColor", "Color");
        map.put("progressViewOffset", "number");
        map.put("refreshing", "boolean");
        map.put("renderToHardwareTextureAndroid", "boolean");
        map.put("rotation", "number");
        map.put("scaleX", "number");
        map.put("scaleY", "number");
        map.put("size", "Dynamic");
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
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r8.equals("enabled") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r8.equals("colors") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r8.equals("opacity") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r8.equals("scaleX") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r8.equals("scaleY") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (r8.equals("progressBackgroundColor") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        if (r8.equals("testID") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r8.equals("zIndex") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r8.equals("progressViewOffset") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r8.equals("refreshing") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
        if (r8.equals("accessibilityHint") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ac, code lost:
        if (r8.equals("accessibilityRole") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b8, code lost:
        if (r8.equals("renderToHardwareTextureAndroid") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c4, code lost:
        if (r8.equals("rotation") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d0, code lost:
        if (r8.equals("elevation") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dc, code lost:
        if (r8.equals("size") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e7, code lost:
        if (r8.equals("accessibilityLiveRegion") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f3, code lost:
        if (r8.equals("importantForAccessibility") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ff, code lost:
        if (r8.equals("transform") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010a, code lost:
        if (r8.equals("accessibilityLabel") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0115, code lost:
        if (r8.equals("accessibilityState") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (r8.equals("accessibilityValue") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012b, code lost:
        if (r8.equals("backgroundColor") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0136, code lost:
        if (r8.equals("accessibilityActions") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0142, code lost:
        if (r8.equals("nativeID") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r8.equals("translateX") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r8.equals("translateY") == false) goto L_0x000d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void Bjs(ViewManager viewManager, View view, String str, Object obj) {
        char c;
        Integer valueOf;
        SwipeRefreshLayoutManager swipeRefreshLayoutManager = (SwipeRefreshLayoutManager) viewManager;
        C23085A5y a5y = (C23085A5y) view;
        boolean z = true;
        boolean z2 = false;
        switch (str.hashCode()) {
            case -1721943862:
                c = 24;
                break;
            case -1721943861:
                c = 25;
                break;
            case -1609594047:
                c = 10;
                break;
            case -1354842768:
                c = 8;
                break;
            case -1267206133:
                c = 13;
                break;
            case -908189618:
                c = 19;
                break;
            case -908189617:
                c = 20;
                break;
            case -885150488:
                c = 14;
                break;
            case -877170387:
                c = 22;
                break;
            case -731417480:
                c = 26;
                break;
            case -416037467:
                c = 15;
                break;
            case -321826009:
                c = 16;
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
                c = 9;
                break;
            case 3530753:
                c = 21;
                break;
            case 36255470:
                c = 3;
                break;
            case 746986311:
                c = 11;
                break;
            case 1052666732:
                c = 23;
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
                c = 12;
                break;
            default:
                c = 65535;
                break;
        }
        float f = 1.0f;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        switch (c) {
            case 0:
                swipeRefreshLayoutManager.setAccessibilityActions(a5y, (A1e) obj);
                return;
            case 1:
                swipeRefreshLayoutManager.setAccessibilityHint(a5y, (String) obj);
                return;
            case 2:
                swipeRefreshLayoutManager.setAccessibilityLabel(a5y, (String) obj);
                return;
            case 3:
                swipeRefreshLayoutManager.setAccessibilityLiveRegion(a5y, (String) obj);
                return;
            case 4:
                swipeRefreshLayoutManager.setAccessibilityRole(a5y, (String) obj);
                return;
            case 5:
                swipeRefreshLayoutManager.setViewState(a5y, (C23043A0y) obj);
                return;
            case 6:
                swipeRefreshLayoutManager.setAccessibilityValue(a5y, (C23043A0y) obj);
                return;
            case 7:
                if (obj != null) {
                    z2 = C206578th.A00(obj, a5y.getContext()).intValue();
                }
                swipeRefreshLayoutManager.setBackgroundColor(a5y, z2);
                return;
            case 8:
                swipeRefreshLayoutManager.setColors(a5y, (A1e) obj);
                return;
            case 9:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                swipeRefreshLayoutManager.setElevation(a5y, f2);
                return;
            case 10:
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                a5y.setEnabled(z);
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                swipeRefreshLayoutManager.setImportantForAccessibility(a5y, (String) obj);
                return;
            case C120125Dh.VIEW_TYPE_SPINNER:
                swipeRefreshLayoutManager.setNativeId(a5y, (String) obj);
                return;
            case C120125Dh.VIEW_TYPE_BADGE:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                swipeRefreshLayoutManager.setOpacity(a5y, f);
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                if (obj == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(C206578th.A00(obj, a5y.getContext()).intValue());
                }
                swipeRefreshLayoutManager.setProgressBackgroundColor(a5y, valueOf);
                return;
            case 15:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                a5y.setProgressViewOffset(f2);
                return;
            case 16:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                a5y.setRefreshing(z2);
                return;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                swipeRefreshLayoutManager.setRenderToHardwareTexture(a5y, z2);
                return;
            case 18:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                a5y.setRotation(f2);
                return;
            case 19:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                a5y.setScaleX(f);
                return;
            case 20:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                a5y.setScaleY(f);
                return;
            case C120125Dh.VIEW_TYPE_BRANDING:
                swipeRefreshLayoutManager.setSize(a5y, (A1k) new A1P(obj));
                return;
            case C120125Dh.NUM_VIEW_TYPES:
                swipeRefreshLayoutManager.setTestId(a5y, (String) obj);
                return;
            case 23:
                swipeRefreshLayoutManager.setTransform(a5y, (A1e) obj);
                return;
            case 24:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                swipeRefreshLayoutManager.setTranslateX(a5y, f2);
                return;
            case 25:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                swipeRefreshLayoutManager.setTranslateY(a5y, f2);
                return;
            case OdexSchemeArtXdex.OREO_SDK_INT:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                swipeRefreshLayoutManager.setZIndex(a5y, f2);
                return;
            default:
                return;
        }
    }
}
