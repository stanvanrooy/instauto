package com.facebook.catalyst.views.art;

import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter;
import java.util.Map;
import p000X.A1e;

public class ARTGroupShadowNode$$PropsSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    public final void ATE(Map map) {
        map.put("clipping", "Array");
        map.put("opacity", "number");
        map.put("transform", "Array");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r6.equals("clipping") == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r6.equals("opacity") == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r6.equals("transform") == false) goto L_0x0020;
     */
    public final void Bjr(ReactShadowNode reactShadowNode, String str, Object obj) {
        char c;
        float floatValue;
        ARTGroupShadowNode aRTGroupShadowNode = (ARTGroupShadowNode) reactShadowNode;
        int hashCode = str.hashCode();
        if (hashCode == -1267206133) {
            c = 1;
        } else if (hashCode == 918617282) {
            c = 0;
        } else if (hashCode == 1052666732) {
            c = 2;
        }
        c = 65535;
        if (c == 0) {
            aRTGroupShadowNode.setClipping((A1e) obj);
        } else if (c == 1) {
            if (obj == null) {
                floatValue = 1.0f;
            } else {
                floatValue = ((Double) obj).floatValue();
            }
            aRTGroupShadowNode.setOpacity(floatValue);
        } else if (c == 2) {
            aRTGroupShadowNode.setTransform((A1e) obj);
        }
    }
}
