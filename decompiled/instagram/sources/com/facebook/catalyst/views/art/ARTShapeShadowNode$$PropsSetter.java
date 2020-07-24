package com.facebook.catalyst.views.art;

import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter;
import java.util.Map;
import p000X.A1e;

public class ARTShapeShadowNode$$PropsSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    public final void ATE(Map map) {
        map.put("d", "Array");
        map.put("fill", "Array");
        map.put("opacity", "number");
        map.put("stroke", "Array");
        map.put("strokeCap", "number");
        map.put("strokeDash", "Array");
        map.put("strokeJoin", "number");
        map.put("strokeWidth", "number");
        map.put("transform", "Array");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r5.equals("strokeDash") == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r5.equals("strokeJoin") == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r5.equals("strokeCap") == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r5.equals("d") == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r5.equals("fill") == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r5.equals("transform") == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (r5.equals("strokeWidth") == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r5.equals("opacity") == false) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r5.equals("stroke") == false) goto L_0x000a;
     */
    public final void Bjr(ReactShadowNode reactShadowNode, String str, Object obj) {
        char c;
        ARTShapeShadowNode aRTShapeShadowNode = (ARTShapeShadowNode) reactShadowNode;
        int i = 1;
        switch (str.hashCode()) {
            case -1267206133:
                c = 2;
                break;
            case -891980232:
                c = 3;
                break;
            case -631243286:
                c = 5;
                break;
            case -631051390:
                c = 6;
                break;
            case -20363654:
                c = 4;
                break;
            case 100:
                c = 0;
                break;
            case 3143043:
                c = 1;
                break;
            case 1052666732:
                c = 8;
                break;
            case 1924065902:
                c = 7;
                break;
            default:
                c = 65535;
                break;
        }
        float f = 1.0f;
        switch (c) {
            case 0:
                aRTShapeShadowNode.setShapePath((A1e) obj);
                return;
            case 1:
                aRTShapeShadowNode.setFill((A1e) obj);
                return;
            case 2:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                aRTShapeShadowNode.setOpacity(f);
                return;
            case 3:
                aRTShapeShadowNode.setStroke((A1e) obj);
                return;
            case 4:
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                aRTShapeShadowNode.setStrokeCap(i);
                return;
            case 5:
                aRTShapeShadowNode.setStrokeDash((A1e) obj);
                return;
            case 6:
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                aRTShapeShadowNode.setStrokeJoin(i);
                return;
            case 7:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                aRTShapeShadowNode.setStrokeWidth(f);
                return;
            case 8:
                aRTShapeShadowNode.setTransform((A1e) obj);
                return;
            default:
                return;
        }
    }
}
