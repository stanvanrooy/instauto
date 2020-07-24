package com.facebook.cameracore.xplatardelivery.modelmanager;

import android.text.TextUtils;
import java.util.List;
import p000X.C204868pk;
import p000X.C72563Fy;

public class ModelMetadataDownloaderAdapter {
    public static final String TAG = "ModelMetadataDownloaderAdapter";
    public C72563Fy mModelMetadataDownloader;

    public void executeRequests(List list, ModelMetadataDownloaderCompletionCallbackJNI modelMetadataDownloaderCompletionCallbackJNI) {
        TextUtils.join("|", list);
        this.mModelMetadataDownloader.ACW(list, "", new C204868pk(this, modelMetadataDownloaderCompletionCallbackJNI));
    }

    public ModelMetadataDownloaderAdapter(C72563Fy r1) {
        this.mModelMetadataDownloader = r1;
    }
}
