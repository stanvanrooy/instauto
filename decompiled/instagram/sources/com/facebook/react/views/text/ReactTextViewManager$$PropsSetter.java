package com.facebook.react.views.text;

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
import p000X.C230129zH;
import p000X.C23043A0y;

public class ReactTextViewManager$$PropsSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
    public final void ATE(Map map) {
        map.put("accessibilityActions", "Array");
        map.put("accessibilityHint", "String");
        map.put("accessibilityLabel", "String");
        map.put("accessibilityLiveRegion", "String");
        map.put("accessibilityRole", "String");
        map.put("accessibilityState", "Map");
        map.put("accessibilityValue", "Map");
        map.put("adjustsFontSizeToFit", "boolean");
        map.put("backgroundColor", "Color");
        map.put("borderBottomColor", "Color");
        map.put("borderBottomLeftRadius", "number");
        map.put("borderBottomRightRadius", "number");
        map.put("borderBottomWidth", "number");
        map.put("borderColor", "Color");
        map.put("borderLeftColor", "Color");
        map.put("borderLeftWidth", "number");
        map.put("borderRadius", "number");
        map.put("borderRightColor", "Color");
        map.put("borderRightWidth", "number");
        map.put("borderStyle", "String");
        map.put("borderTopColor", "Color");
        map.put("borderTopLeftRadius", "number");
        map.put("borderTopRightRadius", "number");
        map.put("borderTopWidth", "number");
        map.put("borderWidth", "number");
        map.put("dataDetectorType", "String");
        map.put("disabled", "boolean");
        map.put("elevation", "number");
        map.put("ellipsizeMode", "String");
        map.put("importantForAccessibility", "String");
        map.put("includeFontPadding", "boolean");
        map.put("nativeID", "String");
        map.put("numberOfLines", "number");
        map.put("onInlineViewLayout", "boolean");
        map.put("opacity", "number");
        map.put("renderToHardwareTextureAndroid", "boolean");
        map.put("rotation", "number");
        map.put("scaleX", "number");
        map.put("scaleY", "number");
        map.put("selectable", "boolean");
        map.put("selectionColor", "Color");
        map.put("testID", "String");
        map.put("textAlignVertical", "String");
        map.put("transform", "Array");
        map.put("translateX", "number");
        map.put("translateY", "number");
        map.put("zIndex", "number");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: boolean} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r13.equals("translateX") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r13.equals("translateY") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r13.equals("selectable") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r13.equals("borderTopColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r13.equals("borderTopWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r13.equals("adjustsFontSizeToFit") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r13.equals("numberOfLines") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (r13.equals("borderBottomColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r13.equals("borderBottomWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        if (r13.equals("opacity") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        if (r13.equals("borderTopLeftRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        if (r13.equals("dataDetectorType") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c0, code lost:
        if (r13.equals("scaleX") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (r13.equals("scaleY") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d8, code lost:
        if (r13.equals("testID") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e4, code lost:
        if (r13.equals("zIndex") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f0, code lost:
        if (r13.equals("borderLeftColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fc, code lost:
        if (r13.equals("borderLeftWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0108, code lost:
        if (r13.equals("onInlineViewLayout") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0113, code lost:
        if (r13.equals("accessibilityHint") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011e, code lost:
        if (r13.equals("accessibilityRole") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012a, code lost:
        if (r13.equals("renderToHardwareTextureAndroid") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0136, code lost:
        if (r13.equals("rotation") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0142, code lost:
        if (r13.equals("elevation") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014d, code lost:
        if (r13.equals("accessibilityLiveRegion") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0159, code lost:
        if (r13.equals("disabled") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0165, code lost:
        if (r13.equals("borderTopRightRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0171, code lost:
        if (r13.equals("borderBottomLeftRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017d, code lost:
        if (r13.equals("borderBottomRightRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0189, code lost:
        if (r13.equals("borderColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0195, code lost:
        if (r13.equals("borderStyle") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a1, code lost:
        if (r13.equals("borderWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ad, code lost:
        if (r13.equals("importantForAccessibility") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b9, code lost:
        if (r13.equals("transform") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c4, code lost:
        if (r13.equals("accessibilityLabel") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r13.equals("borderRightColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01cf, code lost:
        if (r13.equals("accessibilityState") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01da, code lost:
        if (r13.equals("accessibilityValue") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e6, code lost:
        if (r13.equals("backgroundColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f2, code lost:
        if (r13.equals("borderRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01fd, code lost:
        if (r13.equals("accessibilityActions") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0209, code lost:
        if (r13.equals("ellipsizeMode") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0215, code lost:
        if (r13.equals("textAlignVertical") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0221, code lost:
        if (r13.equals("includeFontPadding") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022d, code lost:
        if (r13.equals("nativeID") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0239, code lost:
        if (r13.equals("selectionColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r13.equals("borderRightWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void Bjs(ViewManager viewManager, View view, String str, Object obj) {
        char c;
        int intValue;
        ReactTextViewManager reactTextViewManager = (ReactTextViewManager) viewManager;
        C230129zH r12 = (C230129zH) view;
        boolean z = true;
        boolean z2 = false;
        switch (str.hashCode()) {
            case -1989576717:
                c = 17;
                break;
            case -1971292586:
                c = 18;
                break;
            case -1721943862:
                c = ',';
                break;
            case -1721943861:
                c = '-';
                break;
            case -1655575466:
                c = '\'';
                break;
            case -1470826662:
                c = 20;
                break;
            case -1452542531:
                c = 23;
                break;
            case -1386887134:
                c = 7;
                break;
            case -1329887265:
                c = ' ';
                break;
            case -1308858324:
                c = 9;
                break;
            case -1290574193:
                c = 12;
                break;
            case -1267206133:
                c = '\"';
                break;
            case -1228066334:
                c = 21;
                break;
            case -1020011286:
                c = 25;
                break;
            case -908189618:
                c = '%';
                break;
            case -908189617:
                c = '&';
                break;
            case -877170387:
                c = ')';
                break;
            case -731417480:
                c = '.';
                break;
            case -242276144:
                c = 14;
                break;
            case -223992013:
                c = 15;
                break;
            case -136947289:
                c = '!';
                break;
            case -101663499:
                c = 1;
                break;
            case -101359900:
                c = 4;
                break;
            case -80891667:
                c = '#';
                break;
            case -40300674:
                c = '$';
                break;
            case -4379043:
                c = 27;
                break;
            case 36255470:
                c = 3;
                break;
            case 270940796:
                c = 26;
                break;
            case 333432965:
                c = 22;
                break;
            case 581268560:
                c = 10;
                break;
            case 588239831:
                c = 11;
                break;
            case 722830999:
                c = 13;
                break;
            case 737768677:
                c = 19;
                break;
            case 741115130:
                c = 24;
                break;
            case 746986311:
                c = 29;
                break;
            case 1052666732:
                c = '+';
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
                c = 8;
                break;
            case 1349188574:
                c = 16;
                break;
            case 1505602511:
                c = 0;
                break;
            case 1806129616:
                c = 28;
                break;
            case 1869416814:
                c = '*';
                break;
            case 2020113146:
                c = 30;
                break;
            case 2045685618:
                c = 31;
                break;
            case 2142299447:
                c = '(';
                break;
            default:
                c = 65535;
                break;
        }
        float f = 1.0f;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        Integer num = null;
        float f3 = Float.NaN;
        switch (c) {
            case 0:
                reactTextViewManager.setAccessibilityActions(r12, (A1e) obj);
                return;
            case 1:
                reactTextViewManager.setAccessibilityHint(r12, (String) obj);
                return;
            case 2:
                reactTextViewManager.setAccessibilityLabel(r12, (String) obj);
                return;
            case 3:
                reactTextViewManager.setAccessibilityLiveRegion(r12, (String) obj);
                return;
            case 4:
                reactTextViewManager.setAccessibilityRole(r12, (String) obj);
                return;
            case 5:
                reactTextViewManager.setViewState(r12, (C23043A0y) obj);
                return;
            case 6:
                reactTextViewManager.setAccessibilityValue(r12, (C23043A0y) obj);
                return;
            case 7:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                r12.A05 = z2;
                return;
            case 8:
                if (obj != null) {
                    z2 = C206578th.A00(obj, r12.getContext()).intValue();
                }
                reactTextViewManager.setBackgroundColor(r12, z2);
                return;
            case 9:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextViewManager.setBorderColor(r12, 4, num);
                return;
            case 10:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextViewManager.setBorderRadius(r12, 4, f3);
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextViewManager.setBorderRadius(r12, 3, f3);
                return;
            case C120125Dh.VIEW_TYPE_SPINNER:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextViewManager.setBorderWidth(r12, 4, f3);
                return;
            case C120125Dh.VIEW_TYPE_BADGE:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextViewManager.setBorderColor(r12, 0, num);
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextViewManager.setBorderColor(r12, 1, num);
                return;
            case 15:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextViewManager.setBorderWidth(r12, 1, f3);
                return;
            case 16:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextViewManager.setBorderRadius(r12, 0, f3);
                return;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextViewManager.setBorderColor(r12, 2, num);
                return;
            case 18:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextViewManager.setBorderWidth(r12, 2, f3);
                return;
            case 19:
                r12.setBorderStyle((String) obj);
                return;
            case 20:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextViewManager.setBorderColor(r12, 3, num);
                return;
            case C120125Dh.VIEW_TYPE_BRANDING:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextViewManager.setBorderRadius(r12, 1, f3);
                return;
            case C120125Dh.NUM_VIEW_TYPES:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextViewManager.setBorderRadius(r12, 2, f3);
                return;
            case 23:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextViewManager.setBorderWidth(r12, 3, f3);
                return;
            case 24:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactTextViewManager.setBorderWidth(r12, 0, f3);
                return;
            case 25:
                reactTextViewManager.setDataDetectorType(r12, (String) obj);
                return;
            case OdexSchemeArtXdex.OREO_SDK_INT:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                r12.setEnabled(!z2);
                return;
            case 27:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactTextViewManager.setElevation(r12, f2);
                return;
            case 28:
                reactTextViewManager.setEllipsizeMode(r12, (String) obj);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                reactTextViewManager.setImportantForAccessibility(r12, (String) obj);
                return;
            case 30:
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                r12.setIncludeFontPadding(z);
                return;
            case 31:
                reactTextViewManager.setNativeId(r12, (String) obj);
                return;
            case ' ':
                if (obj == null) {
                    intValue = Integer.MAX_VALUE;
                } else {
                    intValue = ((Double) obj).intValue();
                }
                r12.setNumberOfLines(intValue);
                return;
            case '!':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                r12.A06 = z2;
                return;
            case '\"':
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                reactTextViewManager.setOpacity(r12, f);
                return;
            case '#':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactTextViewManager.setRenderToHardwareTexture(r12, z2);
                return;
            case '$':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                r12.setRotation(f2);
                return;
            case '%':
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                r12.setScaleX(f);
                return;
            case '&':
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                r12.setScaleY(f);
                return;
            case '\'':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                r12.setTextIsSelectable(z2);
                return;
            case '(':
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj, r12.getContext()).intValue());
                }
                reactTextViewManager.setSelectionColor(r12, num);
                return;
            case ')':
                reactTextViewManager.setTestId(r12, (String) obj);
                return;
            case '*':
                reactTextViewManager.setTextAlignVertical(r12, (String) obj);
                return;
            case '+':
                reactTextViewManager.setTransform(r12, (A1e) obj);
                return;
            case ',':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactTextViewManager.setTranslateX(r12, f2);
                return;
            case '-':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactTextViewManager.setTranslateY(r12, f2);
                return;
            case '.':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactTextViewManager.setZIndex(r12, f2);
                return;
            default:
                return;
        }
    }
}
