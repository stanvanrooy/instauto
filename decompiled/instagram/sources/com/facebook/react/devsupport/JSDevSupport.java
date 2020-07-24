package com.facebook.react.devsupport;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.fbreact.specs.NativeJSDevSupportSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import p000X.A44;
import p000X.A5B;
import p000X.A5H;

@ReactModule(name = "JSDevSupport")
public class JSDevSupport extends NativeJSDevSupportSpec {
    public static final int ERROR_CODE_EXCEPTION = 0;
    public static final int ERROR_CODE_VIEW_NOT_FOUND = 1;
    public static final String MODULE_NAME = "JSDevSupport";
    public volatile A5H mCurrentCallback = null;

    public interface JSDevSupportModule extends JavaScriptModule {
        void getJSHierarchy(int i);
    }

    public synchronized void computeDeepestJSHierarchy(View view, A5H a5h) {
        LinkedList linkedList = new LinkedList();
        Pair pair = new Pair(view, 1);
        linkedList.add(pair);
        while (!linkedList.isEmpty()) {
            Pair pair2 = (Pair) linkedList.poll();
            int intValue = ((Integer) pair2.second).intValue();
            if (intValue > ((Integer) pair.second).intValue()) {
                pair = pair2;
            }
            Object obj = pair2.first;
            if (obj instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) obj;
                Integer valueOf = Integer.valueOf(intValue + 1);
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    linkedList.add(new Pair(viewGroup.getChildAt(i), valueOf));
                }
            }
        }
        getJSHierarchy(Integer.valueOf(((View) pair.first).getId()).intValue(), a5h);
    }

    public synchronized void getJSHierarchy(int i, A5H a5h) {
        A44 reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        JSDevSupportModule jSDevSupportModule = null;
        if (reactApplicationContextIfActiveOrWarn != null) {
            jSDevSupportModule = (JSDevSupportModule) reactApplicationContextIfActiveOrWarn.A01(JSDevSupportModule.class);
        }
        if (jSDevSupportModule == null) {
            new A5B("JSDevSupport module not registered.");
        } else {
            this.mCurrentCallback = a5h;
            jSDevSupportModule.getJSHierarchy(i);
        }
    }

    public String getName() {
        return MODULE_NAME;
    }

    public synchronized void onFailure(double d, String str) {
        if (this.mCurrentCallback != null) {
            new RuntimeException(str);
        }
    }

    public synchronized void onSuccess(String str) {
    }

    public Map getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("ERROR_CODE_EXCEPTION", 0);
        hashMap.put("ERROR_CODE_VIEW_NOT_FOUND", 1);
        return hashMap;
    }

    public JSDevSupport(A44 a44) {
        super(a44);
    }
}
