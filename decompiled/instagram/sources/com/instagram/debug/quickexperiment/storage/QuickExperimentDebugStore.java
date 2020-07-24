package com.instagram.debug.quickexperiment.storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p000X.Constants;
import p000X.AnonymousClass0QD;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13460iZ;

public class QuickExperimentDebugStore {
    public File mFile;
    public QuickExperimentDebugStoreModel mModel;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001b */
    public synchronized void persist() {
        try {
            C13460iZ A02 = C12890hY.A00.A02(this.mFile, Constants.ZERO);
            QuickExperimentDebugStoreModel__JsonHelper.serializeToJson(A02, this.mModel, true);
            A02.close();
        } catch (IOException e) {
            AnonymousClass0QD.A05("QuickExperimentDebugStore", "Error while writing to cache file", e);
        } catch (Throwable ) {
            throw th;
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r1 != null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0019 */
    public static QuickExperimentDebugStoreModel fromFile(File file) {
        try {
            C13080hr A07 = C12890hY.A00.A07(file);
            A07.A0p();
            QuickExperimentDebugStoreModel parseFromJson = QuickExperimentDebugStoreModel__JsonHelper.parseFromJson(A07);
            A07.close();
            return parseFromJson;
        } catch (FileNotFoundException unused) {
            return null;
        } catch (IOException e) {
            AnonymousClass0QD.A05("QuickExperimentDebugStore", "Error while reading file - not loading cache", e);
            return null;
        } catch (Throwable ) {
            throw th;
        }
    }

    public void clearAllTrackedParameters() {
        this.mModel.clearAllTrackedParameters();
        persist();
    }

    public String getOverriddenParameter(String str, String str2) {
        return this.mModel.getOverriddenParameter(str, str2);
    }

    public boolean isParameterOverridden(String str, String str2) {
        if (this.mModel.getOverriddenParameter(str, str2) != null) {
            return true;
        }
        return false;
    }

    public boolean isParameterTracked(String str, String str2) {
        return this.mModel.isParameterTracked(str, str2);
    }

    public void putOverriddenParameter(String str, String str2, String str3) {
        this.mModel.putOverriddenParameter(str, str2, str3);
    }

    public void putOverriddenParameterAndPersist(String str, String str2, String str3) {
        this.mModel.putOverriddenParameter(str, str2, str3);
        persist();
    }

    public void removeAll() {
        this.mModel.removeAll();
    }

    public String removeOverriddenParameter(String str, String str2) {
        return this.mModel.removeOverriddenParameter(str, str2);
    }

    public String removeOverriddenParameterAndPersist(String str, String str2) {
        String removeOverriddenParameter = this.mModel.removeOverriddenParameter(str, str2);
        if (removeOverriddenParameter != null) {
            persist();
        }
        return removeOverriddenParameter;
    }

    public boolean removeTrackedParameterAndPersist(String str, String str2) {
        boolean removeTrackedParameter = this.mModel.removeTrackedParameter(str, str2);
        if (removeTrackedParameter) {
            persist();
        }
        return removeTrackedParameter;
    }

    public void trackParameterAndPersist(String str, String str2) {
        this.mModel.trackParameter(str, str2);
        persist();
    }

    public QuickExperimentDebugStore(File file, QuickExperimentDebugStoreModel quickExperimentDebugStoreModel) {
        this.mFile = file;
        this.mModel = quickExperimentDebugStoreModel;
    }

    public static QuickExperimentDebugStore create(File file) {
        QuickExperimentDebugStoreModel fromFile = fromFile(file);
        if (fromFile == null) {
            fromFile = new QuickExperimentDebugStoreModel();
        }
        return new QuickExperimentDebugStore(file, fromFile);
    }
}
