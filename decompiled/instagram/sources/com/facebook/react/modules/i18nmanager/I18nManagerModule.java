package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@ReactModule(name = "I18nManager")
public class I18nManagerModule extends ContextBaseJavaModule {
    public static final String NAME = "I18nManager";
    public final I18nUtil sharedI18nUtilInstance = I18nUtil.A00();

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void allowRTL(boolean z) {
        I18nUtil.A01(this.mContext, "RCTI18nUtil_allowRTL", z);
    }

    @ReactMethod
    public void forceRTL(boolean z) {
        I18nUtil.A01(this.mContext, "RCTI18nUtil_forceRTL", z);
    }

    public Map getConstants() {
        Context context = this.mContext;
        Locale locale = context.getResources().getConfiguration().locale;
        HashMap hashMap = new HashMap();
        hashMap.put("isRTL", Boolean.valueOf(this.sharedI18nUtilInstance.A03(context)));
        hashMap.put("doLeftAndRightSwapInRTL", Boolean.valueOf(this.sharedI18nUtilInstance.A02(context)));
        hashMap.put("localeIdentifier", locale.toString());
        return hashMap;
    }

    @ReactMethod
    public void swapLeftAndRightInRTL(boolean z) {
        I18nUtil.A01(this.mContext, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }

    public I18nManagerModule(Context context) {
        super(context);
    }
}
