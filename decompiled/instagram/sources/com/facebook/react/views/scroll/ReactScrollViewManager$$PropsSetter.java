package com.facebook.react.views.scroll;

import android.view.View;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ViewManagerSetter;
import java.util.Map;
import p000X.A1e;
import p000X.AA2;
import p000X.AMD;
import p000X.AnonymousClass1E1;
import p000X.C120125Dh;
import p000X.C206578th;
import p000X.C23043A0y;

public class ReactScrollViewManager$$PropsSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
    public final void ATE(Map map) {
        map.put("accessibilityActions", "Array");
        map.put("accessibilityHint", "String");
        map.put("accessibilityLabel", "String");
        map.put("accessibilityLiveRegion", "String");
        map.put("accessibilityRole", "String");
        map.put("accessibilityState", "Map");
        map.put("accessibilityValue", "Map");
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
        map.put("contentOffset", "Map");
        map.put("decelerationRate", "number");
        map.put("disableIntervalMomentum", "boolean");
        map.put("elevation", "number");
        map.put("endFillColor", "Color");
        map.put("fadingEdgeLength", "number");
        map.put("importantForAccessibility", "String");
        map.put("nativeID", "String");
        map.put("nestedScrollEnabled", "boolean");
        map.put("opacity", "number");
        map.put("overScrollMode", "String");
        map.put("overflow", "String");
        map.put("pagingEnabled", "boolean");
        map.put("persistentScrollbar", "boolean");
        map.put("removeClippedSubviews", "boolean");
        map.put("renderToHardwareTextureAndroid", "boolean");
        map.put("rotation", "number");
        map.put("scaleX", "number");
        map.put("scaleY", "number");
        map.put("scrollEnabled", "boolean");
        map.put("scrollPerfTag", "String");
        map.put("sendMomentumEvents", "boolean");
        map.put("showsVerticalScrollIndicator", "boolean");
        map.put("snapToEnd", "boolean");
        map.put("snapToInterval", "number");
        map.put("snapToOffsets", "Array");
        map.put("snapToStart", "boolean");
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: boolean} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0248, code lost:
        if (r13.equals("accessibilityState") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0253, code lost:
        if (r13.equals("accessibilityValue") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x025e, code lost:
        if (r13.equals("backgroundColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x026a, code lost:
        if (r13.equals("borderRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0275, code lost:
        if (r13.equals("accessibilityActions") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0281, code lost:
        if (r13.equals("persistentScrollbar") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x028d, code lost:
        if (r13.equals("snapToOffsets") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0299, code lost:
        if (r13.equals("nativeID") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02a5, code lost:
        if (r13.equals("decelerationRate") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r13.equals("disableIntervalMomentum") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r13.equals("snapToStart") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r13.equals("snapToInterval") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r13.equals("translateX") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r13.equals("translateY") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r13.equals("endFillColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (r13.equals("borderTopColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r13.equals("borderTopWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        if (r13.equals("overScrollMode") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        if (r13.equals("borderBottomColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
        if (r13.equals("borderBottomWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        if (r13.equals("opacity") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c1, code lost:
        if (r13.equals("borderTopLeftRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r13.equals("scrollEnabled") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        if (r13.equals("showsVerticalScrollIndicator") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        if (r13.equals("scaleX") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f1, code lost:
        if (r13.equals("scaleY") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fd, code lost:
        if (r13.equals("testID") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0109, code lost:
        if (r13.equals("zIndex") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0115, code lost:
        if (r13.equals("pagingEnabled") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0121, code lost:
        if (r13.equals("contentOffset") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012d, code lost:
        if (r13.equals("removeClippedSubviews") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0139, code lost:
        if (r13.equals("borderLeftColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0145, code lost:
        if (r13.equals("borderLeftWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0151, code lost:
        if (r13.equals("scrollPerfTag") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015d, code lost:
        if (r13.equals("nestedScrollEnabled") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0168, code lost:
        if (r13.equals("accessibilityHint") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0173, code lost:
        if (r13.equals("accessibilityRole") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017f, code lost:
        if (r13.equals("renderToHardwareTextureAndroid") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018b, code lost:
        if (r13.equals("rotation") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0197, code lost:
        if (r13.equals("elevation") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a2, code lost:
        if (r13.equals("accessibilityLiveRegion") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ae, code lost:
        if (r13.equals("snapToEnd") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ba, code lost:
        if (r13.equals("borderTopRightRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c6, code lost:
        if (r13.equals("overflow") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r13.equals("borderRightColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d2, code lost:
        if (r13.equals("borderBottomLeftRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01de, code lost:
        if (r13.equals("borderBottomRightRadius") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ea, code lost:
        if (r13.equals("fadingEdgeLength") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f6, code lost:
        if (r13.equals("sendMomentumEvents") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0202, code lost:
        if (r13.equals("borderColor") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020e, code lost:
        if (r13.equals("borderStyle") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x021a, code lost:
        if (r13.equals("borderWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0226, code lost:
        if (r13.equals("importantForAccessibility") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0232, code lost:
        if (r13.equals("transform") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023d, code lost:
        if (r13.equals("accessibilityLabel") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r13.equals("borderRightWidth") == false) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void Bjs(ViewManager viewManager, View view, String str, Object obj) {
        char c;
        ReactScrollViewManager reactScrollViewManager = (ReactScrollViewManager) viewManager;
        AA2 aa2 = (AA2) view;
        boolean z = true;
        boolean z2 = false;
        switch (str.hashCode()) {
            case -1989576717:
                c = 16;
                break;
            case -1971292586:
                c = 17;
                break;
            case -1952031867:
                c = 26;
                break;
            case -1736848515:
                c = '2';
                break;
            case -1729379382:
                c = '0';
                break;
            case -1721943862:
                c = '5';
                break;
            case -1721943861:
                c = '6';
                break;
            case -1553096443:
                c = 28;
                break;
            case -1470826662:
                c = 19;
                break;
            case -1452542531:
                c = 22;
                break;
            case -1321236988:
                c = '\"';
                break;
            case -1308858324:
                c = 8;
                break;
            case -1290574193:
                c = 11;
                break;
            case -1267206133:
                c = '!';
                break;
            case -1228066334:
                c = 20;
                break;
            case -1151046732:
                c = '+';
                break;
            case -922092170:
                c = '.';
                break;
            case -908189618:
                c = ')';
                break;
            case -908189617:
                c = '*';
                break;
            case -877170387:
                c = '3';
                break;
            case -731417480:
                c = '7';
                break;
            case -502352363:
                c = '$';
                break;
            case -454130068:
                c = 24;
                break;
            case -252105751:
                c = '&';
                break;
            case -242276144:
                c = 13;
                break;
            case -223992013:
                c = 14;
                break;
            case -220307356:
                c = ',';
                break;
            case -127745027:
                c = ' ';
                break;
            case -101663499:
                c = 1;
                break;
            case -101359900:
                c = 4;
                break;
            case -80891667:
                c = '\'';
                break;
            case -40300674:
                c = '(';
                break;
            case -4379043:
                c = 27;
                break;
            case 36255470:
                c = 3;
                break;
            case 212703926:
                c = '/';
                break;
            case 333432965:
                c = 21;
                break;
            case 529642498:
                c = '#';
                break;
            case 581268560:
                c = 9;
                break;
            case 588239831:
                c = 10;
                break;
            case 627277852:
                c = 29;
                break;
            case 692181369:
                c = '-';
                break;
            case 722830999:
                c = 12;
                break;
            case 737768677:
                c = 18;
                break;
            case 741115130:
                c = 23;
                break;
            case 746986311:
                c = 30;
                break;
            case 1052666732:
                c = '4';
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
                c = 15;
                break;
            case 1505602511:
                c = 0;
                break;
            case 1916735823:
                c = '%';
                break;
            case 1979636379:
                c = '1';
                break;
            case 2045685618:
                c = 31;
                break;
            case 2129019807:
                c = 25;
                break;
            default:
                c = 65535;
                break;
        }
        float f = 1.0f;
        Integer num = null;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        float f3 = Float.NaN;
        switch (c) {
            case 0:
                reactScrollViewManager.setAccessibilityActions(aa2, (A1e) obj);
                return;
            case 1:
                reactScrollViewManager.setAccessibilityHint(aa2, (String) obj);
                return;
            case 2:
                reactScrollViewManager.setAccessibilityLabel(aa2, (String) obj);
                return;
            case 3:
                reactScrollViewManager.setAccessibilityLiveRegion(aa2, (String) obj);
                return;
            case 4:
                reactScrollViewManager.setAccessibilityRole(aa2, (String) obj);
                return;
            case 5:
                reactScrollViewManager.setViewState(aa2, (C23043A0y) obj);
                return;
            case 6:
                reactScrollViewManager.setAccessibilityValue(aa2, (C23043A0y) obj);
                return;
            case 7:
                if (obj != null) {
                    z2 = C206578th.A00(obj, aa2.getContext()).intValue();
                }
                reactScrollViewManager.setBackgroundColor(aa2, z2);
                return;
            case 8:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj, aa2.getContext()).intValue());
                }
                reactScrollViewManager.setBorderColor(aa2, 4, num);
                return;
            case 9:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setBorderRadius(aa2, 4, f3);
                return;
            case 10:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setBorderRadius(aa2, 3, f3);
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setBorderWidth(aa2, 4, f3);
                return;
            case C120125Dh.VIEW_TYPE_SPINNER:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj, aa2.getContext()).intValue());
                }
                reactScrollViewManager.setBorderColor(aa2, 0, num);
                return;
            case C120125Dh.VIEW_TYPE_BADGE:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj, aa2.getContext()).intValue());
                }
                reactScrollViewManager.setBorderColor(aa2, 1, num);
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setBorderWidth(aa2, 1, f3);
                return;
            case 15:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setBorderRadius(aa2, 0, f3);
                return;
            case 16:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj, aa2.getContext()).intValue());
                }
                reactScrollViewManager.setBorderColor(aa2, 2, num);
                return;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setBorderWidth(aa2, 2, f3);
                return;
            case 18:
                aa2.setBorderStyle((String) obj);
                return;
            case 19:
                if (obj != null) {
                    num = Integer.valueOf(C206578th.A00(obj, aa2.getContext()).intValue());
                }
                reactScrollViewManager.setBorderColor(aa2, 3, num);
                return;
            case 20:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setBorderRadius(aa2, 1, f3);
                return;
            case C120125Dh.VIEW_TYPE_BRANDING:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setBorderRadius(aa2, 2, f3);
                return;
            case C120125Dh.NUM_VIEW_TYPES:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setBorderWidth(aa2, 3, f3);
                return;
            case 23:
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setBorderWidth(aa2, 0, f3);
                return;
            case 24:
                reactScrollViewManager.setContentOffset(aa2, (C23043A0y) obj);
                return;
            case 25:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                aa2.setDecelerationRate(f2);
                return;
            case OdexSchemeArtXdex.OREO_SDK_INT:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                aa2.A0B = z2;
                return;
            case 27:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setElevation(aa2, f2);
                return;
            case 28:
                if (obj != null) {
                    z2 = C206578th.A00(obj, aa2.getContext()).intValue();
                }
                aa2.setEndFillColor(z2);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                if (obj != null) {
                    z2 = ((Double) obj).intValue();
                }
                reactScrollViewManager.setFadingEdgeLength(aa2, z2);
                return;
            case 30:
                reactScrollViewManager.setImportantForAccessibility(aa2, (String) obj);
                return;
            case 31:
                reactScrollViewManager.setNativeId(aa2, (String) obj);
                return;
            case ' ':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                AnonymousClass1E1.A0h(aa2, z2);
                return;
            case '!':
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setOpacity(aa2, f);
                return;
            case '\"':
                reactScrollViewManager.setOverScrollMode(aa2, (String) obj);
                return;
            case '#':
                aa2.setOverflow((String) obj);
                return;
            case '$':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                aa2.A0C = z2;
                return;
            case '%':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                aa2.setScrollbarFadingEnabled(!z2);
                return;
            case '&':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                aa2.setRemoveClippedSubviews(z2);
                return;
            case '\'':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactScrollViewManager.setRenderToHardwareTexture(aa2, z2);
                return;
            case '(':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                aa2.setRotation(f2);
                return;
            case ')':
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                aa2.setScaleX(f);
                return;
            case '*':
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                aa2.setScaleY(f);
                return;
            case '+':
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                reactScrollViewManager.setScrollEnabled(aa2, z);
                return;
            case ',':
                aa2.A08 = (String) obj;
                return;
            case '-':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                aa2.A0E = z2;
                return;
            case '.':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                aa2.setVerticalScrollBarEnabled(z2);
                return;
            case '/':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                aa2.A0F = z2;
                return;
            case '0':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setSnapToInterval(aa2, f2);
                return;
            case '1':
                reactScrollViewManager.setSnapToOffsets(aa2, (A1e) obj);
                return;
            case AMD.MAX_LIKES_PER_FETCH:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                aa2.A0G = z2;
                return;
            case '3':
                reactScrollViewManager.setTestId(aa2, (String) obj);
                return;
            case '4':
                reactScrollViewManager.setTransform(aa2, (A1e) obj);
                return;
            case '5':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setTranslateX(aa2, f2);
                return;
            case '6':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setTranslateY(aa2, f2);
                return;
            case '7':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactScrollViewManager.setZIndex(aa2, f2);
                return;
            default:
                return;
        }
    }
}
