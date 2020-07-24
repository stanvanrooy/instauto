package com.facebook.react.views.webview;

import android.view.View;
import android.webkit.WebView;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ViewManagerSetter;
import java.util.Map;
import p000X.A1e;
import p000X.C120125Dh;
import p000X.C206578th;
import p000X.C23043A0y;

public class ReactWebViewManager$$PropsSetter implements ViewManagerPropertyUpdater$ViewManagerSetter {
    public final void ATE(Map map) {
        map.put("accessibilityActions", "Array");
        map.put("accessibilityHint", "String");
        map.put("accessibilityLabel", "String");
        map.put("accessibilityLiveRegion", "String");
        map.put("accessibilityRole", "String");
        map.put("accessibilityState", "Map");
        map.put("accessibilityValue", "Map");
        map.put("allowFileAccess", "boolean");
        map.put("allowUniversalAccessFromFileURLs", "boolean");
        map.put("alwaysReloadOnSourceChange", "boolean");
        map.put("backgroundColor", "Color");
        map.put("domStorageEnabled", "boolean");
        map.put("elevation", "number");
        map.put("geolocationEnabled", "boolean");
        map.put("hardwareAccelerationEnabledExperimental", "boolean");
        map.put("importantForAccessibility", "String");
        map.put("injectedJavaScript", "String");
        map.put("javaScriptEnabled", "boolean");
        map.put("mediaPlaybackRequiresUserAction", "boolean");
        map.put("messagingEnabled", "boolean");
        map.put("mixedContentMode", "String");
        map.put("nativeID", "String");
        map.put("opacity", "number");
        map.put("originWhitelist", "Array");
        map.put("renderToHardwareTextureAndroid", "boolean");
        map.put("reportContentSizeChanges", "boolean");
        map.put("rotation", "number");
        map.put("saveFormDataDisabled", "boolean");
        map.put("scaleX", "number");
        map.put("scaleY", "number");
        map.put("scalesPageToFit", "boolean");
        map.put("source", "Map");
        map.put("testID", "String");
        map.put("thirdPartyCookiesEnabled", "boolean");
        map.put("transform", "Array");
        map.put("translateX", "number");
        map.put("translateY", "number");
        map.put("urlPrefixesForDefaultIntent", "Array");
        map.put("userAgent", "String");
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: boolean} */
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: boolean} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r8.equals("translateX") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r8.equals("translateY") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r8.equals("javaScriptEnabled") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r8.equals("messagingEnabled") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r8.equals("opacity") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (r8.equals("domStorageEnabled") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        if (r8.equals("scaleX") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r8.equals("scaleY") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r8.equals("source") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r8.equals("testID") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
        if (r8.equals("zIndex") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        if (r8.equals("allowUniversalAccessFromFileURLs") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
        if (r8.equals("reportContentSizeChanges") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        if (r8.equals("accessibilityHint") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d0, code lost:
        if (r8.equals("accessibilityRole") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dc, code lost:
        if (r8.equals("renderToHardwareTextureAndroid") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e8, code lost:
        if (r8.equals("hardwareAccelerationEnabledExperimental") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f4, code lost:
        if (r8.equals("rotation") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0100, code lost:
        if (r8.equals("elevation") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010b, code lost:
        if (r8.equals("accessibilityLiveRegion") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0117, code lost:
        if (r8.equals("injectedJavaScript") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
        if (r8.equals("userAgent") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012f, code lost:
        if (r8.equals("importantForAccessibility") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013b, code lost:
        if (r8.equals("mixedContentMode") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0147, code lost:
        if (r8.equals("alwaysReloadOnSourceChange") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0153, code lost:
        if (r8.equals("transform") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015e, code lost:
        if (r8.equals("allowFileAccess") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0169, code lost:
        if (r8.equals("accessibilityLabel") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0174, code lost:
        if (r8.equals("accessibilityState") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017f, code lost:
        if (r8.equals("accessibilityValue") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018b, code lost:
        if (r8.equals("backgroundColor") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0197, code lost:
        if (r8.equals("geolocationEnabled") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a2, code lost:
        if (r8.equals("accessibilityActions") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ae, code lost:
        if (r8.equals("mediaPlaybackRequiresUserAction") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ba, code lost:
        if (r8.equals("thirdPartyCookiesEnabled") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r8.equals("originWhitelist") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c6, code lost:
        if (r8.equals("urlPrefixesForDefaultIntent") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d2, code lost:
        if (r8.equals("nativeID") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01de, code lost:
        if (r8.equals("scalesPageToFit") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r8.equals("saveFormDataDisabled") == false) goto L_0x000d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void Bjs(ViewManager viewManager, View view, String str, Object obj) {
        char c;
        ReactWebViewManager reactWebViewManager = (ReactWebViewManager) viewManager;
        WebView webView = (WebView) view;
        boolean z = true;
        boolean z2 = false;
        switch (str.hashCode()) {
            case -1789371455:
                c = 23;
                break;
            case -1725560121:
                c = 27;
                break;
            case -1721943862:
                c = '#';
                break;
            case -1721943861:
                c = '$';
                break;
            case -1607633676:
                c = 17;
                break;
            case -1562001507:
                c = 19;
                break;
            case -1267206133:
                c = 22;
                break;
            case -1146673624:
                c = 11;
                break;
            case -908189618:
                c = 28;
                break;
            case -908189617:
                c = 29;
                break;
            case -896505829:
                c = 31;
                break;
            case -877170387:
                c = ' ';
                break;
            case -731417480:
                c = '\'';
                break;
            case -728016272:
                c = 8;
                break;
            case -141225571:
                c = 25;
                break;
            case -101663499:
                c = 1;
                break;
            case -101359900:
                c = 4;
                break;
            case -80891667:
                c = 24;
                break;
            case -79996127:
                c = 14;
                break;
            case -40300674:
                c = 26;
                break;
            case -4379043:
                c = 12;
                break;
            case 36255470:
                c = 3;
                break;
            case 215255965:
                c = 16;
                break;
            case 311430650:
                c = '&';
                break;
            case 746986311:
                c = 15;
                break;
            case 760962753:
                c = 20;
                break;
            case 857041362:
                c = 9;
                break;
            case 1052666732:
                c = '\"';
                break;
            case 1138246185:
                c = 7;
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
                c = 10;
                break;
            case 1344414299:
                c = 13;
                break;
            case 1505602511:
                c = 0;
                break;
            case 1774874798:
                c = 18;
                break;
            case 1812525393:
                c = '!';
                break;
            case 1873176931:
                c = '%';
                break;
            case 2045685618:
                c = 21;
                break;
            case 2074641374:
                c = 30;
                break;
            default:
                c = 65535;
                break;
        }
        float f = 1.0f;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        switch (c) {
            case 0:
                reactWebViewManager.setAccessibilityActions(webView, (A1e) obj);
                return;
            case 1:
                reactWebViewManager.setAccessibilityHint(webView, (String) obj);
                return;
            case 2:
                reactWebViewManager.setAccessibilityLabel(webView, (String) obj);
                return;
            case 3:
                reactWebViewManager.setAccessibilityLiveRegion(webView, (String) obj);
                return;
            case 4:
                reactWebViewManager.setAccessibilityRole(webView, (String) obj);
                return;
            case 5:
                reactWebViewManager.setViewState(webView, (C23043A0y) obj);
                return;
            case 6:
                reactWebViewManager.setAccessibilityValue(webView, (C23043A0y) obj);
                return;
            case 7:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactWebViewManager.setAllowFileAccess(webView, z2);
                return;
            case 8:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactWebViewManager.setAllowUniversalAccessFromFileURLs(webView, z2);
                return;
            case 9:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactWebViewManager.mAlwaysReloadOnSourceChange = z2;
                return;
            case 10:
                if (obj != null) {
                    z2 = C206578th.A00(obj, webView.getContext()).intValue();
                }
                reactWebViewManager.setBackgroundColor(webView, z2);
                return;
            case C120125Dh.VIEW_TYPE_BANNER:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactWebViewManager.setDomStorageEnabled(webView, z2);
                return;
            case C120125Dh.VIEW_TYPE_SPINNER:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactWebViewManager.setElevation(webView, f2);
                return;
            case C120125Dh.VIEW_TYPE_BADGE:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactWebViewManager.setGeolocationEnabled(webView, z2);
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                reactWebViewManager.setHardwareAccelerationEnabledExperimental(webView, z);
                return;
            case 15:
                reactWebViewManager.setImportantForAccessibility(webView, (String) obj);
                return;
            case 16:
                reactWebViewManager.setInjectedJavaScript(webView, (String) obj);
                return;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactWebViewManager.setJavaScriptEnabled(webView, z2);
                return;
            case 18:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactWebViewManager.setMediaPlaybackRequiresUserAction(webView, z2);
                return;
            case 19:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactWebViewManager.setMessagingEnabled(webView, z2);
                return;
            case 20:
                reactWebViewManager.setMixedContentMode(webView, (String) obj);
                return;
            case C120125Dh.VIEW_TYPE_BRANDING:
                reactWebViewManager.setNativeId(webView, (String) obj);
                return;
            case C120125Dh.NUM_VIEW_TYPES:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                reactWebViewManager.setOpacity(webView, f);
                return;
            case 23:
                reactWebViewManager.setOriginWhitelist(webView, (A1e) obj);
                return;
            case 24:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactWebViewManager.setRenderToHardwareTexture(webView, z2);
                return;
            case 25:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactWebViewManager.setReportContentSizeChanges(webView, z2);
                return;
            case OdexSchemeArtXdex.OREO_SDK_INT:
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                webView.setRotation(f2);
                return;
            case 27:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactWebViewManager.setSaveFormDataDisabled(webView, z2);
                return;
            case 28:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                webView.setScaleX(f);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                webView.setScaleY(f);
                return;
            case 30:
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactWebViewManager.setScalesPageToFit(webView, z2);
                return;
            case 31:
                reactWebViewManager.setSource(webView, (C23043A0y) obj);
                return;
            case ' ':
                reactWebViewManager.setTestId(webView, (String) obj);
                return;
            case '!':
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                reactWebViewManager.setThirdPartyCookiesEnabled(webView, z2);
                return;
            case '\"':
                reactWebViewManager.setTransform(webView, (A1e) obj);
                return;
            case '#':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactWebViewManager.setTranslateX(webView, f2);
                return;
            case '$':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactWebViewManager.setTranslateY(webView, f2);
                return;
            case '%':
                reactWebViewManager.setUrlPrefixesForDefaultIntent(webView, (A1e) obj);
                return;
            case '&':
                reactWebViewManager.setUserAgent(webView, (String) obj);
                return;
            case '\'':
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                reactWebViewManager.setZIndex(webView, f2);
                return;
            default:
                return;
        }
    }
}
