package com.facebook.analytics.appstatelogger;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicReference;
import p000X.AnonymousClass04F;
import p000X.AnonymousClass04W;
import p000X.AnonymousClass0Y1;

public class AppStateLogFile {
    public static final byte[] HEX_CHARACTERS = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
    public static final AtomicReference sInstance = new AtomicReference();
    public static volatile boolean sLibraryLoaded;
    public final FileChannel mAppStateLogFileChannel;
    public final FileLock mAppStateLogFileLock;
    public MessageDigest mDigest;
    public boolean mIsContentOutputStreamOpen;
    public final boolean mIsEnabled;
    public MappedByteBuffer mMappedByteBuffer;
    public boolean mNoMoreChangesToStatusByte = false;
    public final Object mPendingStopLock = new Object();
    public final Object mPositionLock = new Object();
    public final Object mStatusLock = new Object();

    public static void init() {
        AppStateLogFile appStateLogFile;
        try {
            AnonymousClass0Y1.A08("appstatelogger");
            appStateLogFile = (AppStateLogFile) sInstance.get();
            sLibraryLoaded = true;
            if (appStateLogFile == null) {
                return;
            }
        } catch (RuntimeException | UnsatisfiedLinkError unused) {
            appStateLogFile = (AppStateLogFile) sInstance.get();
            sLibraryLoaded = false;
            if (appStateLogFile == null) {
                return;
            }
        } catch (Throwable th) {
            AppStateLogFile appStateLogFile2 = (AppStateLogFile) sInstance.get();
            sLibraryLoaded = true;
            if (appStateLogFile2 != null) {
                appStateLogFile2.mlockBuffer();
            }
            throw th;
        }
        appStateLogFile.mlockBuffer();
    }

    public static native void mlockBuffer(ByteBuffer byteBuffer);

    public static native void munlockBuffer(ByteBuffer byteBuffer);

    public static void assertIsAscii(char c) {
        if (c < 0 || c > 127) {
            throw new IllegalStateException("Byte should be ASCII");
        }
    }

    public static void ensureMappedByteBufferSizeRemaining(AppStateLogFile appStateLogFile, int i) {
        if (appStateLogFile.mAppStateLogFileChannel != null) {
            synchronized (appStateLogFile.mPositionLock) {
                if (appStateLogFile.mMappedByteBuffer.remaining() < i) {
                    appStateLogFile.mMappedByteBuffer.force();
                    int position = appStateLogFile.mMappedByteBuffer.position();
                    int i2 = ((((position + i) - 1) / 1024) + 1) << 10;
                    if (appStateLogFile.mIsEnabled && sLibraryLoaded) {
                        munlockBuffer(appStateLogFile.mMappedByteBuffer);
                    }
                    appStateLogFile.mMappedByteBuffer = appStateLogFile.mAppStateLogFileChannel.map(FileChannel.MapMode.READ_WRITE, 0, (long) i2);
                    appStateLogFile.mlockBuffer();
                    appStateLogFile.mMappedByteBuffer.position(position);
                }
            }
            return;
        }
        throw new IllegalStateException("In bad state");
    }

    public void updateForegroundAnrState(boolean z, char c, char c2) {
        if (this.mIsEnabled) {
            MappedByteBuffer mappedByteBuffer = this.mMappedByteBuffer;
            int i = 48;
            if (z) {
                i = 49;
            }
            mappedByteBuffer.put(16, (byte) i);
            this.mMappedByteBuffer.put(17, (byte) c);
            this.mMappedByteBuffer.put(18, (byte) c2);
        }
    }

    public void updateForegroundEntityInfo(AnonymousClass04W r4, char c) {
        if (this.mIsEnabled) {
            char c2 = r4.A00;
            assertIsAscii(c2);
            this.mMappedByteBuffer.put(1, (byte) c2);
            assertIsAscii(c);
            this.mMappedByteBuffer.put(2, (byte) c);
        }
    }

    public void updatePendingStopTracking(char c) {
        if (this.mIsEnabled) {
            assertIsAscii(c);
            synchronized (this.mPendingStopLock) {
                this.mMappedByteBuffer.put(3, (byte) c);
            }
        }
    }

    public void updateProcessImportance(char c, byte[] bArr, byte[] bArr2) {
        if (this.mIsEnabled) {
            assertIsAscii(c);
            this.mMappedByteBuffer.put(4, (byte) c);
            if (bArr != null && bArr.length != 5) {
                throw new IllegalStateException("Invalid length for encodedLastSuccessfulQueryMs");
            } else if (bArr2 == null || bArr2.length == 5) {
                if (bArr != null) {
                    for (int i = 0; i < bArr.length; i++) {
                        this.mMappedByteBuffer.put(i + 5, bArr[i]);
                    }
                }
                if (bArr2 != null) {
                    for (int i2 = 0; i2 < bArr2.length; i2++) {
                        this.mMappedByteBuffer.put(i2 + 10, bArr2[i2]);
                    }
                }
            } else {
                throw new IllegalStateException("Invalid length for encodedLastQueryMs");
            }
        }
    }

    public void updateStatus(AnonymousClass04F r6) {
        if (this.mIsEnabled) {
            char c = r6.A00;
            assertIsAscii(c);
            synchronized (this.mStatusLock) {
                if (!this.mNoMoreChangesToStatusByte) {
                    this.mMappedByteBuffer.put(0, (byte) c);
                }
            }
        }
    }

    public AppStateLogFile(File file, boolean z) {
        this.mIsEnabled = z;
        if (!z) {
            this.mAppStateLogFileChannel = null;
            this.mAppStateLogFileLock = null;
            return;
        }
        FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
        this.mAppStateLogFileChannel = channel;
        this.mMappedByteBuffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED);
        FileLock tryLock = this.mAppStateLogFileChannel.tryLock();
        this.mAppStateLogFileLock = tryLock;
        if (tryLock != null) {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            this.mDigest = instance;
            int digestLength = instance.getDigestLength() << 1;
            if (digestLength == 32) {
                if (sInstance.compareAndSet((Object) null, this)) {
                    char c = AnonymousClass04W.BYTE_NOT_USED.A00;
                    assertIsAscii(c);
                    this.mMappedByteBuffer.put(1, (byte) c);
                    updatePendingStopTracking(' ');
                }
                mlockBuffer();
                return;
            }
            throw new IllegalArgumentException(String.format("Expected digest to have length %d; found %d", new Object[]{Integer.valueOf(digestLength), 32}));
        }
        throw new IOException(String.format("Unable to acquire lock for app state log file: %s", new Object[]{file.getAbsolutePath()}));
    }

    private void mlockBuffer() {
        if (this.mIsEnabled && sLibraryLoaded) {
            mlockBuffer(this.mMappedByteBuffer);
        }
    }
}
