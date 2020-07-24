package com.facebook.secure.fileprovider.common;

import java.util.Locale;

public class StatInfo {
    public long device;
    public long inode;
    public int ownerGid;
    public int ownerUid;

    public static StatInfo newInstance(int i, int i2, long j, long j2) {
        return new StatInfo(i, i2, j, j2);
    }

    public StatInfo(int i, int i2, long j, long j2) {
        this.ownerUid = i;
        this.ownerGid = i2;
        this.inode = j;
        this.device = j2;
    }

    public String toString() {
        return String.format(Locale.getDefault(), "Stat{ownerUid=%d,ownerGid=%d,inode=%d,device=%d}", new Object[]{Integer.valueOf(this.ownerUid), Integer.valueOf(this.ownerGid), Long.valueOf(this.inode), Long.valueOf(this.device)});
    }
}
