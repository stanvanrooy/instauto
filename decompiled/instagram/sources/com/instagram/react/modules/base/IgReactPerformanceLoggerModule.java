package com.instagram.react.modules.base;

import com.facebook.fbreact.specs.NativeReactPerformanceLoggerSpec;
import com.facebook.react.module.annotations.ReactModule;
import p000X.A44;
import p000X.A56;
import p000X.B5B;
import p000X.C06590Pq;
import p000X.C16920pO;
import p000X.C23043A0y;

@ReactModule(name = "ReactPerformanceLogger", needsEagerInit = true)
public class IgReactPerformanceLoggerModule extends NativeReactPerformanceLoggerSpec {
    public static final String MODULE_NAME = "ReactPerformanceLogger";
    public final A56 mPerformanceLogger;

    public String getName() {
        return MODULE_NAME;
    }

    public void logEvents(C23043A0y a0y) {
        double d;
        double d2;
        double d3;
        double d4;
        C23043A0y map = a0y.getMap("timespans");
        if (map != null) {
            double d5 = 0.0d;
            if (map.hasKey("JSAppRequireTime")) {
                C23043A0y map2 = map.getMap("JSAppRequireTime");
                A56 a56 = this.mPerformanceLogger;
                if (map2.hasKey("startTime")) {
                    d3 = map2.getDouble("startTime");
                } else {
                    d3 = 0.0d;
                }
                a56.BlF((long) d3);
                A56 a562 = this.mPerformanceLogger;
                if (map2.hasKey("totalTime")) {
                    d4 = map2.getDouble("totalTime");
                } else {
                    d4 = 0.0d;
                }
                a562.BiJ((long) d4);
            } else {
                this.mPerformanceLogger.BiJ(0);
                this.mPerformanceLogger.BlF(0);
            }
            if (map.hasKey("JSTime")) {
                C23043A0y map3 = map.getMap("JSTime");
                A56 a563 = this.mPerformanceLogger;
                if (map3.hasKey("totalTime")) {
                    d2 = map3.getDouble("totalTime");
                } else {
                    d2 = 0.0d;
                }
                a563.BiK((long) d2);
            } else {
                this.mPerformanceLogger.BiK(0);
            }
            if (map.hasKey("IdleTime")) {
                C23043A0y map4 = map.getMap("IdleTime");
                A56 a564 = this.mPerformanceLogger;
                if (map4.hasKey("totalTime")) {
                    d = map4.getDouble("totalTime");
                } else {
                    d = 0.0d;
                }
                a564.Bhy((long) d);
            } else {
                this.mPerformanceLogger.Bhy(0);
            }
            if (map.hasKey("fetchRelayQuery")) {
                C23043A0y map5 = map.getMap("fetchRelayQuery");
                A56 a565 = this.mPerformanceLogger;
                if (map5.hasKey("totalTime")) {
                    d5 = map5.getDouble("totalTime");
                }
                a565.BhY((long) d5);
            } else {
                this.mPerformanceLogger.BhY(0);
            }
        }
        C23043A0y map6 = a0y.getMap(B5B.INTENT_PARAM_EXTRAS);
        if (map6 != null) {
            if (map6.hasKey("JscBlockSize")) {
                this.mPerformanceLogger.BiL((long) map6.getDouble("JscBlockSize"));
            }
            if (map6.hasKey("JscMallocSize")) {
                this.mPerformanceLogger.BiM((long) map6.getDouble("JscMallocSize"));
            }
            if (map6.hasKey("JscObjectSize")) {
                this.mPerformanceLogger.BiN((long) map6.getDouble("JscObjectSize"));
            }
            if (map6.hasKey("usedRelayModern")) {
                this.mPerformanceLogger.BlZ(map6.getBoolean("usedRelayModern") ? 1 : 0);
            }
            if (map6.hasKey("usedRelayPrefetcher")) {
                this.mPerformanceLogger.Bla(map6.getBoolean("usedRelayPrefetcher") ? 1 : 0);
            }
        }
        if (a0y.hasKey(B5B.INTENT_PARAM_TAG)) {
            this.mPerformanceLogger.Bl3(a0y.getString(B5B.INTENT_PARAM_TAG));
        }
        this.mPerformanceLogger.Ame();
    }

    public IgReactPerformanceLoggerModule(A44 a44, C06590Pq r3) {
        super(a44);
        this.mPerformanceLogger = C16920pO.getInstance().getPerformanceLogger(r3);
    }
}
