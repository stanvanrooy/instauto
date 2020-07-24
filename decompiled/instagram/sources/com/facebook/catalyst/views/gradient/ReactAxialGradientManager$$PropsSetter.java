package com.facebook.catalyst.views.gradient;

import android.view.View;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ViewManagerSetter;
import java.util.Map;
import p000X.A0L;
import p000X.A1e;
import p000X.C120125Dh;
import p000X.C206578th;
import p000X.C23043A0y;

public class ReactAxialGradientManager$$PropsSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
    public final void ATE(Map map) {
        map.put("accessibilityActions", "Array");
        map.put("accessibilityHint", "String");
        map.put("accessibilityLabel", "String");
        map.put("accessibilityLiveRegion", "String");
        map.put("accessibilityRole", "String");
        map.put("accessibilityState", "Map");
        map.put("accessibilityValue", "Map");
        map.put("backgroundColor", "Color");
        map.put("borderBottomLeftRadius", "number");
        map.put("borderBottomRightRadius", "number");
        map.put("borderRadius", "number");
        map.put("borderTopLeftRadius", "number");
        map.put("borderTopRightRadius", "number");
        map.put("colors", "ColorArray");
        map.put("elevation", "number");
        map.put("endX", "number");
        map.put("endY", "number");
        map.put("importantForAccessibility", "String");
        map.put("locations", "Array");
        map.put("nativeID", "String");
        map.put("opacity", "number");
        map.put("renderToHardwareTextureAndroid", "boolean");
        map.put("rotation", "number");
        map.put("scaleX", "number");
        map.put("scaleY", "number");
        map.put("startX", "number");
        map.put("startY", "number");
        map.put("testID", "String");
        map.put("transform", "Array");
        map.put("translateX", "number");
        map.put("translateY", "number");
        map.put("zIndex", "number");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: boolean} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r12.equals("colors") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r12.equals("opacity") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r12.equals("borderTopLeftRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r12.equals("locations") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r12.equals("scaleX") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r12.equals("scaleY") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r12.equals("startX") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (r12.equals("startY") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r12.equals("testID") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        if (r12.equals("zIndex") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        if (r12.equals("accessibilityHint") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b2, code lost:
        if (r12.equals("accessibilityRole") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        if (r12.equals("renderToHardwareTextureAndroid") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ca, code lost:
        if (r12.equals("rotation") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        if (r12.equals("elevation") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (r12.equals("endX") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ee, code lost:
        if (r12.equals("endY") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f9, code lost:
        if (r12.equals("accessibilityLiveRegion") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0105, code lost:
        if (r12.equals("borderTopRightRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0111, code lost:
        if (r12.equals("borderBottomLeftRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011d, code lost:
        if (r12.equals("borderBottomRightRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0129, code lost:
        if (r12.equals("importantForAccessibility") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0135, code lost:
        if (r12.equals("transform") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0140, code lost:
        if (r12.equals("accessibilityLabel") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014b, code lost:
        if (r12.equals("accessibilityState") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0156, code lost:
        if (r12.equals("accessibilityValue") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0161, code lost:
        if (r12.equals("backgroundColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016d, code lost:
        if (r12.equals("borderRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0178, code lost:
        if (r12.equals("accessibilityActions") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0184, code lost:
        if (r12.equals("nativeID") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r12.equals("translateX") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r12.equals("translateY") == false) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void Bjs(ViewManager viewManager, View view, String str, Object obj) {
        char c;
        ReactAxialGradientManager reactAxialGradientManager = (ReactAxialGradientManager) viewManager;
        A0L a0l = (A0L) view;
        boolean z = false;
        switch (str.hashCode()) {
            case -1721943862:
                c = 29;
                break;
            case -1721943861:
                c = 30;
                break;
            case -1354842768:
                c = 13;
                break;
            case -1267206133:
                c = 20;
                break;
            case -1228066334:
                c = 11;
                break;
            case -1197189282:
                c = 18;
                break;
            case -908189618:
                c = 23;
                break;
            case -908189617:
                c = 24;
                break;
            case -892483530:
                c = 25;
                break;
            case -892483529:
                c = 26;
                break;
            case -877170387:
                c = 27;
                break;
            case -731417480:
                c = 31;
                break;
            case -101663499:
                c = 1;
                break;
            case -101359900:
                c = 4;
                break;
            case -80891667:
                c = 21;
                break;
            case -40300674:
                c = 22;
                break;
            case -4379043:
                c = 14;
                break;
            case 3117789:
                c = 15;
                break;
            case 3117790:
                c = 16;
                break;
            case 36255470:
                c = 3;
                break;
            case 333432965:
                c = 12;
                break;
            case 581268560:
                c = 8;
                break;
            case 588239831:
                c = 9;
                break;
            case 746986311:
                c = 17;
                break;
            case 1052666732:
                c = 28;
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
            case 1349188574:
                c = 10;
                break;
            case 1505602511:
                c = 0;
                break;
            case 2045685618:
                c = 19;
                break;
            default:
                c = 65535;
                break;
        }
        float f = 1.0f;
        float f2 = Float.NaN;
        float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        switch (c) {
            case 0:
                reactAxialGradientManager.setAccessibilityActions(a0l, (A1e) obj);
                return;
            case 1:
                reactAxialGradientManager.setAccessibilityHint(a0l, (String) obj);
                return;
            case 2:
                reactAxialGradientManager.setAccessibilityLabel(a0l, (String) obj);
                return;
            case 3:
                reactAxialGradientManager.setAccessibilityLiveRegion(a0l, (String) obj);
                return;
            case 4:
                reactAxialGradientManager.setAccessibilityRole(a0l, (String) obj);
                return;
            case 5:
                reactAxialGradientManager.setViewState(a0l, (C23043A0y) obj);
                return;
            case 6:
                reactAxialGradientManager.setAccessibilityValue(a0l, (C23043A0y) obj);
                return;
            case 7:
                if (obj != null) {
                    z = C206578th.A00(obj, a0l.getContext()).intValue();
                }
                reactAxialGradientManager.setBackgroundColor(a0l, z);
                return;
            case 8:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactAxialGradientManager.setBorderRadius(a0l, 4, f2);
                return;
            case 9:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactAxialGradientManager.setBorderRadius(a0l, 3, f2);
                return;
            case 10:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactAxialGradientManager.setBorderRadius(a0l, 0, f2);
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactAxialGradientManager.setBorderRadius(a0l, 1, f2);
                return;
            case C120125Dh.VIEW_TYPE_SPINNER:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactAxialGradientManager.setBorderRadius(a0l, 2, f2);
                return;
            case C120125Dh.VIEW_TYPE_BADGE:
                reactAxialGradientManager.setColors(a0l, (A1e) obj);
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactAxialGradientManager.setElevation(a0l, f3);
                return;
            case 15:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                a0l.A01 = f3;
                return;
            case 16:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                a0l.A02 = f3;
                return;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                reactAxialGradientManager.setImportantForAccessibility(a0l, (String) obj);
                return;
            case 18:
                reactAxialGradientManager.setLocations(a0l, (A1e) obj);
                return;
            case 19:
                reactAxialGradientManager.setNativeId(a0l, (String) obj);
                return;
            case 20:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                reactAxialGradientManager.setOpacity(a0l, f);
                return;
            case C120125Dh.VIEW_TYPE_BRANDING:
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                reactAxialGradientManager.setRenderToHardwareTexture(a0l, z);
                return;
            case C120125Dh.NUM_VIEW_TYPES:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                a0l.setRotation(f3);
                return;
            case 23:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                a0l.setScaleX(f);
                return;
            case 24:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                a0l.setScaleY(f);
                return;
            case 25:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                a0l.A03 = f3;
                return;
            case OdexSchemeArtXdex.OREO_SDK_INT:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                a0l.A04 = f3;
                return;
            case 27:
                reactAxialGradientManager.setTestId(a0l, (String) obj);
                return;
            case 28:
                reactAxialGradientManager.setTransform(a0l, (A1e) obj);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactAxialGradientManager.setTranslateX(a0l, f3);
                return;
            case 30:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactAxialGradientManager.setTranslateY(a0l, f3);
                return;
            case 31:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactAxialGradientManager.setZIndex(a0l, f3);
                return;
            default:
                return;
        }
    }
}
