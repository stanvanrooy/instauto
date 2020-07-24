package com.instagram.react.modules.base;

import com.facebook.C0003R;
import com.facebook.fbreact.specs.NativeIGNativeColorsSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import p000X.A44;
import p000X.C019000b;

@ReactModule(name = "IGNativeColors")
public class IgNativeColorsModule extends NativeIGNativeColorsSpec {
    public static final String MODULE_NAME = "IGNativeColors";

    public static String parseColorInteger(int i) {
        return String.format("#%06X", new Object[]{Integer.valueOf(i & 16777215)});
    }

    public String getName() {
        return MODULE_NAME;
    }

    public Map getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        A44 reactApplicationContext = getReactApplicationContext();
        hashMap.put("grey9", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.grey_9)));
        hashMap.put("grey8", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.grey_8)));
        hashMap.put("grey7", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.grey_7)));
        hashMap.put("grey6", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.grey_6)));
        hashMap.put("grey5", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.grey_5)));
        hashMap.put("grey4", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.grey_4)));
        hashMap.put("grey3", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.grey_3)));
        hashMap.put("grey2", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.grey_2)));
        hashMap.put("grey1", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.grey_1)));
        hashMap.put("grey0", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.grey_0)));
        hashMap.put("blue9", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.blue_9)));
        hashMap.put("blue8", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.blue_8)));
        hashMap.put("blue7", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.blue_7)));
        hashMap.put("blue6", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.blue_6)));
        hashMap.put("blue5", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.blue_5)));
        hashMap.put("blue4", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.blue_4)));
        hashMap.put("blue3", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.blue_3)));
        hashMap.put("blue2", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.blue_2)));
        hashMap.put("blue1", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.blue_1)));
        hashMap.put("blue0", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.blue_0)));
        hashMap.put("red9", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.red_9)));
        hashMap.put("red8", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.red_8)));
        hashMap.put("red7", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.red_7)));
        hashMap.put("red6", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.red_6)));
        hashMap.put("red5", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.red_5)));
        hashMap.put("red4", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.red_4)));
        hashMap.put("red3", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.red_3)));
        hashMap.put("red2", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.red_2)));
        hashMap.put("red1", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.red_1)));
        hashMap.put("red0", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.red_0)));
        hashMap.put("orange9", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.orange_9)));
        hashMap.put("orange8", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.orange_8)));
        hashMap.put("orange7", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.orange_7)));
        hashMap.put("orange6", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.orange_6)));
        hashMap.put("orange5", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.orange_5)));
        hashMap.put("orange4", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.orange_4)));
        hashMap.put("orange3", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.orange_3)));
        hashMap.put("orange2", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.orange_2)));
        hashMap.put("orange1", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.orange_1)));
        hashMap.put("orange0", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.orange_0)));
        hashMap.put("green9", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.green_9)));
        hashMap.put("green8", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.green_8)));
        hashMap.put("green7", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.green_7)));
        hashMap.put("green6", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.green_6)));
        hashMap.put("green5", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.green_5)));
        hashMap.put("green4", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.green_4)));
        hashMap.put("green3", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.green_3)));
        hashMap.put("green2", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.green_2)));
        hashMap.put("green1", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.green_1)));
        hashMap.put("green0", parseColorInteger(C019000b.A00(reactApplicationContext, C0003R.color.green_0)));
        return hashMap;
    }

    public IgNativeColorsModule(A44 a44) {
        super(a44);
    }
}
