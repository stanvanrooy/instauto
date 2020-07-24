package p000X;

import com.facebook.react.uimanager.ViewManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.A8E */
public final class A8E {
    public static Map A00(ViewManager viewManager, Map map, Map map2) {
        HashMap hashMap = new HashMap();
        Map exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            A01(map, exportedCustomBubblingEventTypeConstants);
            A01(exportedCustomBubblingEventTypeConstants, (Map) null);
            hashMap.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        }
        Map exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants != null) {
            A01(map2, exportedCustomDirectEventTypeConstants);
            A01(exportedCustomDirectEventTypeConstants, (Map) null);
            hashMap.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        }
        Map exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            hashMap.put("Constants", exportedViewConstants);
        }
        Map commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            hashMap.put("Commands", commandsMap);
        }
        Map nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            hashMap.put("NativeProps", nativeProps);
        }
        return hashMap;
    }

    public static void A01(Map map, Map map2) {
        if (map != null && map2 != null && !map2.isEmpty()) {
            for (Object next : map2.keySet()) {
                Object obj = map2.get(next);
                Object obj2 = map.get(next);
                if (obj2 == null || !(obj instanceof Map) || !(obj2 instanceof Map)) {
                    map.put(next, obj);
                } else {
                    A01((Map) obj2, (Map) obj);
                }
            }
        }
    }
}
