package com.instagram.react.views.image;

import android.view.View;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ViewManagerSetter;
import java.util.Map;
import p000X.A1e;
import p000X.C120125Dh;
import p000X.C206578th;
import p000X.C206848uE;
import p000X.C23043A0y;

public class IgReactImageManager$$PropsSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
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
        map.put("elevation", "number");
        map.put("importantForAccessibility", "String");
        map.put("nativeID", "String");
        map.put("opacity", "number");
        map.put("renderToHardwareTextureAndroid", "boolean");
        map.put("resizeMode", "String");
        map.put("rotation", "number");
        map.put("scaleX", "number");
        map.put("scaleY", "number");
        map.put("shouldNotifyLoadEvents", "boolean");
        map.put("src", "Array");
        map.put("testID", "String");
        map.put("tintColor", "Color");
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
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r12.equals("opacity") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r12.equals("borderTopLeftRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r12.equals("scaleX") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r12.equals("scaleY") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r12.equals("testID") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r12.equals("zIndex") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r12.equals("accessibilityHint") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r12.equals("accessibilityRole") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        if (r12.equals("renderToHardwareTextureAndroid") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        if (r12.equals("rotation") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (r12.equals("elevation") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b1, code lost:
        if (r12.equals("src") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        if (r12.equals("accessibilityLiveRegion") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c8, code lost:
        if (r12.equals("shouldNotifyLoadEvents") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d4, code lost:
        if (r12.equals("borderTopRightRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e0, code lost:
        if (r12.equals("borderBottomLeftRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        if (r12.equals("borderBottomRightRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (r12.equals("importantForAccessibility") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0104, code lost:
        if (r12.equals("transform") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010f, code lost:
        if (r12.equals("accessibilityLabel") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011a, code lost:
        if (r12.equals("accessibilityState") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0125, code lost:
        if (r12.equals("accessibilityValue") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0130, code lost:
        if (r12.equals("backgroundColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013c, code lost:
        if (r12.equals("tintColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0148, code lost:
        if (r12.equals("borderRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0153, code lost:
        if (r12.equals("accessibilityActions") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015f, code lost:
        if (r12.equals("nativeID") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016b, code lost:
        if (r12.equals("resizeMode") == false) goto L_0x0010;
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
        Integer valueOf;
        IgReactImageManager igReactImageManager = (IgReactImageManager) viewManager;
        C206848uE r11 = (C206848uE) view;
        boolean z = false;
        switch (str.hashCode()) {
            case -1721943862:
                c = 27;
                break;
            case -1721943861:
                c = 28;
                break;
            case -1267206133:
                c = 16;
                break;
            case -1228066334:
                c = 11;
                break;
            case -908189618:
                c = 20;
                break;
            case -908189617:
                c = 21;
                break;
            case -877170387:
                c = 24;
                break;
            case -731417480:
                c = 29;
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
                c = 19;
                break;
            case -4379043:
                c = 13;
                break;
            case 114148:
                c = 23;
                break;
            case 36255470:
                c = 3;
                break;
            case 167841179:
                c = 22;
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
                c = 14;
                break;
            case 1052666732:
                c = 26;
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
            case 1327599912:
                c = 25;
                break;
            case 1349188574:
                c = 10;
                break;
            case 1505602511:
                c = 0;
                break;
            case 2045685618:
                c = 15;
                break;
            case 2049757303:
                c = 18;
                break;
            default:
                c = 65535;
                break;
        }
        float f = 1.0f;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        float f3 = Float.NaN;
        switch (c) {
            case 0:
                igReactImageManager.setAccessibilityActions(r11, (A1e) obj);
                return;
            case 1:
                igReactImageManager.setAccessibilityHint(r11, (String) obj);
                return;
            case 2:
                igReactImageManager.setAccessibilityLabel(r11, (String) obj);
                return;
            case 3:
                igReactImageManager.setAccessibilityLiveRegion(r11, (String) obj);
                return;
            case 4:
                igReactImageManager.setAccessibilityRole(r11, (String) obj);
                return;
            case 5:
                igReactImageManager.setViewState(r11, (C23043A0y) obj);
                return;
            case 6:
                igReactImageManager.setAccessibilityValue(r11, (C23043A0y) obj);
                return;
            case 7:
                if (obj != null) {
                    z = C206578th.A00(obj, r11.getContext()).intValue();
                }
                igReactImageManager.setBackgroundColor(r11, z);
                return;
            case 8:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                igReactImageManager.setBorderRadius(r11, 4, f3);
                return;
            case 9:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                igReactImageManager.setBorderRadius(r11, 3, f3);
                return;
            case 10:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                igReactImageManager.setBorderRadius(r11, 0, f3);
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                igReactImageManager.setBorderRadius(r11, 1, f3);
                return;
            case C120125Dh.VIEW_TYPE_SPINNER:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                igReactImageManager.setBorderRadius(r11, 2, f3);
                return;
            case C120125Dh.VIEW_TYPE_BADGE:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                igReactImageManager.setElevation(r11, f2);
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                igReactImageManager.setImportantForAccessibility(r11, (String) obj);
                return;
            case 15:
                igReactImageManager.setNativeId(r11, (String) obj);
                return;
            case 16:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                igReactImageManager.setOpacity(r11, f);
                return;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                igReactImageManager.setRenderToHardwareTexture(r11, z);
                return;
            case 18:
                igReactImageManager.setResizeMode(r11, (String) obj);
                return;
            case 19:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                r11.setRotation(f2);
                return;
            case 20:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                r11.setScaleX(f);
                return;
            case C120125Dh.VIEW_TYPE_BRANDING:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                r11.setScaleY(f);
                return;
            case C120125Dh.NUM_VIEW_TYPES:
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                r11.setShouldNotifyLoadEvents(z);
                return;
            case 23:
                r11.setSource((A1e) obj);
                return;
            case 24:
                igReactImageManager.setTestId(r11, (String) obj);
                return;
            case 25:
                if (obj == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(C206578th.A00(obj, r11.getContext()).intValue());
                }
                igReactImageManager.setTintColor(r11, valueOf);
                return;
            case OdexSchemeArtXdex.OREO_SDK_INT:
                igReactImageManager.setTransform(r11, (A1e) obj);
                return;
            case 27:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                igReactImageManager.setTranslateX(r11, f2);
                return;
            case 28:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                igReactImageManager.setTranslateY(r11, f2);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                igReactImageManager.setZIndex(r11, f2);
                return;
            default:
                return;
        }
    }
}
