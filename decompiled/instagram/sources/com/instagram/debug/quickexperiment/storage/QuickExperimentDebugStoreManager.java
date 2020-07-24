package com.instagram.debug.quickexperiment.storage;

import java.io.File;
import p000X.C05770Lw;

public class QuickExperimentDebugStoreManager {
    public static QuickExperimentDebugStore sConfiguratorDeviceSpoofStore;
    public static QuickExperimentDebugStore sConfiguratorUserSpoofStore;
    public static QuickExperimentDebugStore sDeviceSpoofStore;
    public static QuickExperimentDebugStore sOverrideStore;
    public static QuickExperimentDebugStore sUserSpoofStore;

    public static synchronized QuickExperimentDebugStore getDeviceConfiguratorSpoofStore(File file) {
        QuickExperimentDebugStore quickExperimentDebugStore;
        synchronized (QuickExperimentDebugStoreManager.class) {
            if (sConfiguratorDeviceSpoofStore == null) {
                sConfiguratorDeviceSpoofStore = QuickExperimentDebugStore.create(new File(file, "configuration_device_spoof"));
            }
            quickExperimentDebugStore = sConfiguratorDeviceSpoofStore;
        }
        return quickExperimentDebugStore;
    }

    public static synchronized QuickExperimentDebugStore getDeviceSpoofStore(File file) {
        QuickExperimentDebugStore quickExperimentDebugStore;
        synchronized (QuickExperimentDebugStoreManager.class) {
            if (sDeviceSpoofStore == null) {
                sDeviceSpoofStore = QuickExperimentDebugStore.create(new File(file, "qe_device_spoof"));
            }
            quickExperimentDebugStore = sDeviceSpoofStore;
        }
        return quickExperimentDebugStore;
    }

    public static synchronized QuickExperimentDebugStore getOverrideStore(File file) {
        QuickExperimentDebugStore quickExperimentDebugStore;
        synchronized (QuickExperimentDebugStoreManager.class) {
            if (sOverrideStore == null) {
                sOverrideStore = QuickExperimentDebugStore.create(new File(file, "qe_debugs"));
            }
            quickExperimentDebugStore = sOverrideStore;
        }
        return quickExperimentDebugStore;
    }

    public static synchronized QuickExperimentDebugStore getUserConfiguratorSpoofStore(File file) {
        QuickExperimentDebugStore quickExperimentDebugStore;
        synchronized (QuickExperimentDebugStoreManager.class) {
            if (sConfiguratorUserSpoofStore == null) {
                sConfiguratorUserSpoofStore = QuickExperimentDebugStore.create(new File(file, "configuration_user_spoof"));
            }
            quickExperimentDebugStore = sConfiguratorUserSpoofStore;
        }
        return quickExperimentDebugStore;
    }

    public static synchronized QuickExperimentDebugStore getUserSpoofStore(File file) {
        QuickExperimentDebugStore quickExperimentDebugStore;
        synchronized (QuickExperimentDebugStoreManager.class) {
            if (sUserSpoofStore == null) {
                sUserSpoofStore = QuickExperimentDebugStore.create(new File(file, "qe_user_spoof"));
            }
            quickExperimentDebugStore = sUserSpoofStore;
        }
        return quickExperimentDebugStore;
    }

    public static boolean isTrackingExperiments() {
        return C05770Lw.A00().A00.getBoolean("tracking_quick_experiments", false);
    }
}
