package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import p000X.A44;
import p000X.AnonymousClass0FY;

@ReactModule(name = "SourceCode")
public class SourceCodeModule extends NativeSourceCodeSpec {
    public static final String NAME = "SourceCode";

    public String getName() {
        return NAME;
    }

    public Map getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        String sourceURL = getReactApplicationContext().A00.getSourceURL();
        AnonymousClass0FY.A01(sourceURL, "No source URL loaded, have you initialised the instance?");
        hashMap.put("scriptURL", sourceURL);
        return hashMap;
    }

    public SourceCodeModule(A44 a44) {
        super(a44);
    }
}
