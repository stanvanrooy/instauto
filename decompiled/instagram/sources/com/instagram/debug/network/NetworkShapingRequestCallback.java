package com.instagram.debug.network;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Random;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass12F;
import p000X.C33851db;

public class NetworkShapingRequestCallback implements AnonymousClass12F {
    public final NetworkShapingConfiguration mConfiguration;
    public final Random mRandom = new Random();
    public boolean mSimulateFailure = false;
    public final String mTag;
    public int mTotalData = 0;
    public final String mUri;
    public final AnonymousClass12F mWrappedCallback;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r5.mConfiguration;
     */
    private void maybeSimulateFailure() {
        NetworkShapingConfiguration networkShapingConfiguration;
        int failNetworkRequestAfterBytesCount;
        if (!this.mSimulateFailure && (failNetworkRequestAfterBytesCount = networkShapingConfiguration.getFailNetworkRequestAfterBytesCount()) != -1 && this.mTotalData >= failNetworkRequestAfterBytesCount && this.mRandom.nextInt(networkShapingConfiguration.getFailNetworkRequestProbability()) < 1) {
            this.mSimulateFailure = true;
            String.format(Locale.US, "Failing request after %d bytes: %s", new Object[]{Integer.valueOf(this.mTotalData), this.mUri});
        }
    }

    public NetworkShapingRequestCallback(AnonymousClass12F r2, NetworkShapingConfiguration networkShapingConfiguration, String str, String str2) {
        this.mWrappedCallback = r2;
        this.mConfiguration = networkShapingConfiguration;
        this.mUri = str;
        this.mTag = str2;
    }

    public void onComplete() {
        int A03 = AnonymousClass0Z0.A03(-1321704282);
        if (this.mSimulateFailure) {
            this.mWrappedCallback.onFailed(new IOException("IG Dev Tools: Simulated Network Failure"));
        } else {
            this.mWrappedCallback.onComplete();
        }
        AnonymousClass0Z0.A0A(895591926, A03);
    }

    public void onFailed(IOException iOException) {
        int A03 = AnonymousClass0Z0.A03(-1676323986);
        this.mWrappedCallback.onFailed(iOException);
        AnonymousClass0Z0.A0A(1289239163, A03);
    }

    public void onNewData(ByteBuffer byteBuffer) {
        int i;
        int A03 = AnonymousClass0Z0.A03(-1286795342);
        if (this.mSimulateFailure) {
            i = 1496705372;
        } else {
            maybeSimulateFailure();
            if (!this.mSimulateFailure) {
                long sleepTimePerChunk = (this.mConfiguration.getSleepTimePerChunk() * ((long) byteBuffer.limit())) / OdexSchemeArtXdex.STATE_PGO_NEEDED;
                if (sleepTimePerChunk > 0) {
                    String.format(Locale.US, "Slowing down network download by %dms: %s", new Object[]{Long.valueOf(sleepTimePerChunk), this.mUri});
                    try {
                        Thread.sleep(sleepTimePerChunk);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                this.mWrappedCallback.onNewData(byteBuffer);
                this.mTotalData += byteBuffer.limit();
                maybeSimulateFailure();
            }
            i = -2041593597;
        }
        AnonymousClass0Z0.A0A(i, A03);
    }

    public void onResponseStarted(C33851db r3) {
        int A03 = AnonymousClass0Z0.A03(1091428129);
        this.mWrappedCallback.onResponseStarted(r3);
        AnonymousClass0Z0.A0A(-92620017, A03);
    }
}
