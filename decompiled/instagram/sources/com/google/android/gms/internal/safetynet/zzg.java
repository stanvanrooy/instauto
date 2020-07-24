package com.google.android.gms.internal.safetynet;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;
import com.google.android.gms.safetynet.zzh;

public interface zzg extends IInterface {
    void BvF(Status status);

    void BvG(Status status, SafeBrowsingData safeBrowsingData);

    void BvH(Status status, zza zza);

    void BvI(Status status, zzd zzd);

    void BvJ(Status status, zzf zzf);

    void BvK(Status status, zzh zzh);

    void BvL(Status status, boolean z);

    void BvQ(String str);

    void BvX(Status status, boolean z);
}
