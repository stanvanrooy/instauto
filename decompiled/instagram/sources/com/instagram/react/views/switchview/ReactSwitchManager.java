package com.instagram.react.views.switchview;

import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import p000X.A0c;
import p000X.A5P;
import p000X.A8M;
import p000X.C206888uI;
import p000X.C230049z6;
import p000X.C23040A0q;
import p000X.C23053A3d;

public class ReactSwitchManager extends SimpleViewManager {
    public static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new C206888uI();
    public static final String REACT_CLASS = "AndroidSwitch";

    public class ReactSwitchShadowNode extends LayoutShadowNode implements A5P {
        public int A00;
        public int A01;
        public boolean A02;

        public final long Ap5(A8M a8m, float f, C230049z6 r6, float f2, C230049z6 r8) {
            if (!this.A02) {
                C23040A0q a0q = new C23040A0q(AY1());
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                a0q.measure(makeMeasureSpec, makeMeasureSpec);
                this.A01 = a0q.getMeasuredWidth();
                this.A00 = a0q.getMeasuredHeight();
                this.A02 = true;
            }
            return A0c.A00((float) this.A01, (float) this.A00);
        }

        public ReactSwitchShadowNode() {
            this.A05.setMeasureFunction(this);
        }
    }

    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "on")
    public void setOn(C23040A0q a0q, boolean z) {
        a0q.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        a0q.setOn(z);
        a0q.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    public Class getShadowNodeClass() {
        return ReactSwitchShadowNode.class;
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(C23040A0q a0q, boolean z) {
        a0q.setEnabled(z);
    }

    public void addEventEmitters(C23053A3d a3d, C23040A0q a0q) {
        a0q.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new ReactSwitchShadowNode();
    }

    public C23040A0q createViewInstance(C23053A3d a3d) {
        return new C23040A0q(a3d);
    }
}
