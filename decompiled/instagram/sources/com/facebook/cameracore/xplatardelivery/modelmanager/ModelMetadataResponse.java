package com.facebook.cameracore.xplatardelivery.modelmanager;

import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.xplatardelivery.models.RemoteAssetAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ModelMetadataResponse {
    public final ArrayList mRemoteAssetAdapters;
    public final int mRequestId;
    public final int mVersion;
    public final VersionedCapability mVersionedCapability;

    public int getVersionedCapability() {
        return this.mVersionedCapability.getXplatValue();
    }

    public ModelMetadataResponse(int i, VersionedCapability versionedCapability, int i2, List list) {
        this.mRequestId = i;
        this.mVersionedCapability = versionedCapability;
        this.mVersion = i2;
        this.mRemoteAssetAdapters = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.mRemoteAssetAdapters.add(new RemoteAssetAdapter((ARRequestAsset) it.next()));
        }
    }

    public List getRemoteAssetAdapters() {
        return this.mRemoteAssetAdapters;
    }

    public int getRequestId() {
        return this.mRequestId;
    }

    public int getVersion() {
        return this.mVersion;
    }
}
