package com.instagram.debug.quickexperiment.storage;

import com.instagram.debug.quickexperiment.storage.QuickExperimentBisectStoreModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import p000X.Constants;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0QD;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C13460iZ;

public class QuickExperimentBisectStore {
    public static final String TAG = "QuickExperimentBisectStore";
    public static QuickExperimentBisectStore sBisectStore;
    public File mFile;
    public QuickExperimentBisectStoreModel mModel;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0020 */
    public synchronized void persist() {
        this.mModel.generateOrdering();
        try {
            C13460iZ A02 = C12890hY.A00.A02(this.mFile, Constants.ZERO);
            QuickExperimentBisectStoreModel__JsonHelper.serializeToJson(A02, this.mModel, true);
            A02.close();
        } catch (IOException e) {
            AnonymousClass0QD.A05(TAG, "Error while writing to cache file", e);
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
    public static QuickExperimentBisectStoreModel fromFile(File file) {
        try {
            C13080hr A07 = C12890hY.A00.A07(file);
            A07.A0p();
            QuickExperimentBisectStoreModel parseFromJson = QuickExperimentBisectStoreModel__JsonHelper.parseFromJson(A07);
            A07.close();
            return parseFromJson;
        } catch (FileNotFoundException unused) {
            return null;
        } catch (IOException e) {
            AnonymousClass0QD.A05(TAG, "Error while reading file - not loading cache", e);
            return null;
        } catch (Throwable ) {
            throw th;
        }
    }

    public static synchronized QuickExperimentBisectStore getBisectStore(File file) {
        QuickExperimentBisectStore quickExperimentBisectStore;
        synchronized (QuickExperimentBisectStore.class) {
            if (sBisectStore == null) {
                sBisectStore = create(new File(file, "qe_user_bisect"));
            }
            quickExperimentBisectStore = sBisectStore;
        }
        return quickExperimentBisectStore;
    }

    public void clear() {
        this.mModel.clear();
    }

    public String getExperimentStringByIndex(int i) {
        try {
            return ((QuickExperimentBisectStoreModel.ExperimentModel) this.mModel.mBisectExperiments.get(i)).toString();
        } catch (IndexOutOfBoundsException e) {
            AnonymousClass0DB.A0P(TAG, e, "Could not get experiment at index: %d", Integer.valueOf(i));
            return "Bisect in error state, please restart.";
        }
    }

    public String getParameter(String str, String str2) {
        return this.mModel.getParameter(str, str2);
    }

    public int getQeCount() {
        return this.mModel.mBisectExperiments.size();
    }

    public Integer getUniverseIndex(String str) {
        try {
            return this.mModel.getUniverseIndex(str);
        } catch (NullPointerException e) {
            AnonymousClass0DB.A0G(TAG, "Auto-unboxing error", e);
            return null;
        }
    }

    public void putParameters(String str, HashMap hashMap) {
        this.mModel.putQuickExperiment(str, hashMap);
    }

    public QuickExperimentBisectStore(File file, QuickExperimentBisectStoreModel quickExperimentBisectStoreModel) {
        this.mFile = file;
        this.mModel = quickExperimentBisectStoreModel;
    }

    public static QuickExperimentBisectStore create(File file) {
        QuickExperimentBisectStoreModel fromFile = fromFile(file);
        if (fromFile == null) {
            fromFile = new QuickExperimentBisectStoreModel();
        }
        return new QuickExperimentBisectStore(file, fromFile);
    }
}
