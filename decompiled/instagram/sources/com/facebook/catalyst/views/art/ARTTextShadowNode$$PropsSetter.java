package com.facebook.catalyst.views.art;

import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter;
import java.util.Map;
import p000X.A1e;
import p000X.C23043A0y;

public class ARTTextShadowNode$$PropsSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    public final void ATE(Map map) {
        map.put("alignment", "number");
        map.put("d", "Array");
        map.put("fill", "Array");
        map.put("frame", "Map");
        map.put("opacity", "number");
        map.put("stroke", "Array");
        map.put("strokeCap", "number");
        map.put("strokeDash", "Array");
        map.put("strokeJoin", "number");
        map.put("strokeWidth", "number");
        map.put("transform", "Array");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r6.equals("strokeDash") == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r6.equals("strokeJoin") == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r6.equals("strokeCap") == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r6.equals("d") == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r6.equals("fill") == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r6.equals("frame") == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r6.equals("transform") == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (r6.equals("alignment") == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        if (r6.equals("strokeWidth") == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r6.equals("opacity") == false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r6.equals("stroke") == false) goto L_0x000b;
     */
    public final void Bjr(ReactShadowNode reactShadowNode, String str, Object obj) {
        char c;
        ARTTextShadowNode aRTTextShadowNode = (ARTTextShadowNode) reactShadowNode;
        int i = 0;
        int i2 = 1;
        switch (str.hashCode()) {
            case -1267206133:
                c = 4;
                break;
            case -891980232:
                c = 5;
                break;
            case -631243286:
                c = 7;
                break;
            case -631051390:
                c = 8;
                break;
            case -20363654:
                c = 6;
                break;
            case 100:
                c = 1;
                break;
            case 3143043:
                c = 2;
                break;
            case 97692013:
                c = 3;
                break;
            case 1052666732:
                c = 10;
                break;
            case 1767875043:
                c = 0;
                break;
            case 1924065902:
                c = 9;
                break;
            default:
                c = 65535;
                break;
        }
        float f = 1.0f;
        switch (c) {
            case 0:
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                aRTTextShadowNode.A00 = i;
                return;
            case 1:
                aRTTextShadowNode.setShapePath((A1e) obj);
                return;
            case 2:
                aRTTextShadowNode.setFill((A1e) obj);
                return;
            case 3:
                aRTTextShadowNode.A01 = (C23043A0y) obj;
                return;
            case 4:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                aRTTextShadowNode.setOpacity(f);
                return;
            case 5:
                aRTTextShadowNode.setStroke((A1e) obj);
                return;
            case 6:
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                aRTTextShadowNode.setStrokeCap(i2);
                return;
            case 7:
                aRTTextShadowNode.setStrokeDash((A1e) obj);
                return;
            case 8:
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                aRTTextShadowNode.setStrokeJoin(i2);
                return;
            case 9:
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                aRTTextShadowNode.setStrokeWidth(f);
                return;
            case 10:
                aRTTextShadowNode.setTransform((A1e) obj);
                return;
            default:
                return;
        }
    }
}
