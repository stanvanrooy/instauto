package com.facebook.msys.mci;

import java.util.List;
import java.util.Map;

public class NoOpAnalytics implements Analytics {
    public static final Analytics A00 = new NoOpAnalytics();

    public void log(int i, int i2, boolean z, String str, String str2, long j, Map map, Map map2, List list) {
    }
}
