package com.instagram.debug.network;

import java.lang.ref.WeakReference;
import p000X.C05770Lw;
import p000X.C06590Pq;

public class DebugNetworkShapingConfigurationFactory {
    public static NetworkShapingConfiguration createNetworkShapingCallbackConfiguration() {
        return new NetworkShapingConfiguration() {
            public int getFailNetworkRequestAfterBytesCount() {
                return -1;
            }

            public int getFailNetworkRequestProbability() {
                return 1;
            }

            public long getSleepTimePerChunk() {
                return 0;
            }
        };
    }

    public static NetworkShapingConfiguration createNetworkShapingServiceLayerConfiguration(C06590Pq r1) {
        return new NetworkShapingConfiguration() {
            public WeakReference mSessionRef;

            public int getFailNetworkRequestAfterBytesCount() {
                return -1;
            }

            public int getFailNetworkRequestProbability() {
                return 1;
            }

            {
                this.mSessionRef = new WeakReference(C06590Pq.this);
            }

            public long getSleepTimePerChunk() {
                long j;
                C06590Pq r0 = (C06590Pq) this.mSessionRef.get();
                if (r0 != null) {
                    j = DebugNetworkShapingServerOverrideHelper.getSleepPerChunkOverride(r0);
                } else {
                    j = 0;
                }
                if (j != 0) {
                    return j;
                }
                return (long) C05770Lw.A00().A00.getInt("debug_network_shaping_delay_per_chunk", 0);
            }
        };
    }

    public static NetworkShapingConfiguration createStaticConfiguration(final long j, final int i, final int i2) {
        return new NetworkShapingConfiguration() {
            public int getFailNetworkRequestAfterBytesCount() {
                return i;
            }

            public int getFailNetworkRequestProbability() {
                return i2;
            }

            public long getSleepTimePerChunk() {
                return j;
            }
        };
    }
}
