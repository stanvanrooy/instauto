package com.facebook.video.heroplayer.common;

import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.exoplayer2.Format;
import java.util.Map;
import java.util.TreeMap;
import p000X.AnonymousClass000;

public final class MosScoreCalculation {
    public static float A00(Format format, int i) {
        Object value;
        TreeMap treeMap = new TreeMap();
        String str = format.A0N;
        if (str != null) {
            String[] split = str.split(",");
            try {
                int length = split.length;
                int i2 = 0;
                while (i2 < length) {
                    String str2 = split[i2];
                    String[] split2 = str2.split(":");
                    if (split2.length == 2) {
                        treeMap.put(Integer.valueOf(Integer.parseInt(split2[0])), Float.valueOf(Float.parseFloat(split2[1])));
                        i2++;
                    } else {
                        throw new IllegalArgumentException(AnonymousClass000.A0E("Ill formatted string:", str2));
                    }
                }
            } catch (IllegalArgumentException | NumberFormatException unused) {
                treeMap.clear();
            }
        }
        if (treeMap.isEmpty()) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        Integer valueOf = Integer.valueOf(i);
        if (treeMap.containsKey(valueOf)) {
            value = treeMap.get(valueOf);
        } else {
            Map.Entry lowerEntry = treeMap.lowerEntry(valueOf);
            Map.Entry higherEntry = treeMap.higherEntry(valueOf);
            if (lowerEntry == null) {
                value = higherEntry.getValue();
            } else if (higherEntry != null) {
                return ((Float) higherEntry.getValue()).floatValue() + ((((float) (((Integer) higherEntry.getKey()).intValue() - i)) * (((Float) lowerEntry.getValue()).floatValue() - ((Float) higherEntry.getValue()).floatValue())) / ((float) (((Integer) higherEntry.getKey()).intValue() - ((Integer) lowerEntry.getKey()).intValue())));
            } else {
                value = lowerEntry.getValue();
            }
        }
        return ((Float) value).floatValue();
    }
}
