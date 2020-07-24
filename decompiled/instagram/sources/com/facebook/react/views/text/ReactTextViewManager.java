package com.facebook.react.views.text;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import p000X.A0G;
import p000X.A9Z;
import p000X.C230049z6;
import p000X.C230069z8;
import p000X.C230079z9;
import p000X.C230099zE;
import p000X.C230119zG;
import p000X.C230129zH;
import p000X.C230209zY;
import p000X.C230299zk;
import p000X.C230379zz;
import p000X.C23043A0y;
import p000X.C23053A3d;

@ReactModule(name = "RCTText")
public class ReactTextViewManager extends ReactTextAnchorViewManager implements A9Z {
    public static final String REACT_CLASS = "RCTText";
    public final A0G mReactTextViewManagerCallback;

    public String getName() {
        return REACT_CLASS;
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        Map A00 = C230299zk.A00("registrationName", "onTextLayout");
        Map A002 = C230299zk.A00("registrationName", "onInlineViewLayout");
        HashMap hashMap = new HashMap();
        hashMap.put("topTextLayout", A00);
        hashMap.put("topInlineViewLayout", A002);
        return hashMap;
    }

    public long measure(Context context, C23043A0y a0y, C23043A0y a0y2, C23043A0y a0y3, float f, C230049z6 r15, float f2, C230049z6 r17, float[] fArr) {
        return C230069z8.A00(context, a0y, a0y2, f, r15, f2, r17, this.mReactTextViewManagerCallback, fArr);
    }

    public Class getShadowNodeClass() {
        return ReactTextShadowNode.class;
    }

    public ReactTextShadowNode createShadowNodeInstance() {
        return new ReactTextShadowNode();
    }

    public ReactTextShadowNode createShadowNodeInstance(A0G a0g) {
        return new ReactTextShadowNode(a0g);
    }

    public C230129zH createViewInstance(C23053A3d a3d) {
        return new C230129zH(a3d);
    }

    public void onAfterUpdateTransaction(C230129zH r3) {
        TextUtils.TruncateAt truncateAt;
        super.onAfterUpdateTransaction(r3);
        if (r3.A01 == Integer.MAX_VALUE || r3.A05) {
            truncateAt = null;
        } else {
            truncateAt = r3.A03;
        }
        r3.setEllipsize(truncateAt);
    }

    public void setPadding(C230129zH r1, int i, int i2, int i3, int i4) {
        r1.setPadding(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setPadding(View view, int i, int i2, int i3, int i4) {
        ((C230129zH) view).setPadding(i, i2, i3, i4);
    }

    public void updateExtraData(C230129zH r5, Object obj) {
        C230209zY r6 = (C230209zY) obj;
        if (r6.A0C) {
            Spannable spannable = r6.A0B;
            for (int i = 0; i < ((C230119zG[]) spannable.getSpans(0, spannable.length(), C230119zG.class)).length; i++) {
            }
        }
        r5.setText(r6);
    }

    public Object updateState(C230129zH r19, C230099zE r20, C230379zz r21) {
        int i;
        ReadableNativeMap state = r21.getState();
        ReadableNativeMap map = state.getMap("attributedString");
        ReadableNativeMap map2 = state.getMap("paragraphAttributes");
        C230129zH r5 = r19;
        Spannable A01 = C230069z8.A01(r5.getContext(), map, this.mReactTextViewManagerCallback);
        r5.A02 = A01;
        int A03 = C230079z9.A03(map2.getString("textBreakStrategy"));
        if (state.hasKey("mostRecentEventCount")) {
            i = state.getInt("mostRecentEventCount");
        } else {
            i = -1;
        }
        C230099zE r1 = r20;
        return new C230209zY(A01, i, false, -1.0f, -1.0f, -1.0f, -1.0f, C230079z9.A02(r1, C230069z8.A02(map)), A03, C230079z9.A01(r1), -1, -1);
    }
}
