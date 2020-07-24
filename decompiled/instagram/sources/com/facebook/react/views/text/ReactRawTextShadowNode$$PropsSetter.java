package com.facebook.react.views.text;

import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter;
import java.util.Map;

public class ReactRawTextShadowNode$$PropsSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    public final void ATE(Map map) {
        map.put("text", "String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r4.equals("text") == false) goto L_0x0014;
     */
    public final void Bjr(ReactShadowNode reactShadowNode, String str, Object obj) {
        char c;
        ReactRawTextShadowNode reactRawTextShadowNode = (ReactRawTextShadowNode) reactShadowNode;
        if (str.hashCode() == 3556653) {
            c = 0;
        }
        c = 65535;
        if (c == 0) {
            reactRawTextShadowNode.setText((String) obj);
        }
    }
}
