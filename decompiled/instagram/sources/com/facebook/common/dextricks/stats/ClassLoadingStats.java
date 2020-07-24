package com.facebook.common.dextricks.stats;

import java.util.concurrent.atomic.AtomicReference;
import p000X.AnonymousClass0KI;

public abstract class ClassLoadingStats {
    public static final AtomicReference A00 = new AtomicReference();

    public abstract void decrementDexFileQueries();

    public abstract int getClassLoadsAttempted();

    public abstract int getClassLoadsFailed();

    public abstract int getDexFileQueries();

    public abstract int getIncorrectDfaGuesses();

    public abstract int getLocatorAssistedClassLoads();

    public abstract int getTurboLoaderClassLocationFailures();

    public abstract int getTurboLoaderClassLocationSuccesses();

    public abstract int getTurboLoaderMapGenerationFailures();

    public abstract int getTurboLoaderMapGenerationSuccesses();

    public abstract void incrementClassLoadsAttempted();

    public abstract void incrementClassLoadsFailed();

    public abstract void incrementDexFileQueries(int i);

    public abstract void incrementIncorrectDfaGuesses();

    public abstract void incrementTurboLoaderMapGenerationFailures();

    public abstract void incrementTurboLoaderMapGenerationSuccesses();

    public final class SnapshotStats {
        public final int A00;
        public final int A01;
        public final int A02;
        public final int A03;
        public final int A04;
        public final int A05;
        public final int A06;
        public final int A07;
        public final int A08;

        public final String toString() {
            return String.format("[ Class Load Attempts: %d, Class Loads Failed: %d, Dex Queries: %d, Locator-assisted Class Loads: %d, Incorrect DFA Guesses: %d ]", new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A04), Integer.valueOf(this.A03)});
        }

        public SnapshotStats(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.A00 = i;
            this.A01 = i2;
            this.A02 = i3;
            this.A04 = i4;
            this.A03 = i5;
            this.A08 = i6;
            this.A07 = i7;
            this.A06 = i8;
            this.A05 = i9;
        }
    }

    public static ClassLoadingStats A00() {
        if (A00.get() == null) {
            return new AnonymousClass0KI();
        }
        return (ClassLoadingStats) A00.get();
    }
}
