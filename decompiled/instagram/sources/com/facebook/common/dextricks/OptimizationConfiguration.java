package com.facebook.common.dextricks;

public final class OptimizationConfiguration {
    public static final int OPTIMIZATION_IN_BACKGROUND = 1;
    public final int flags;
    public final boolean installDex2OatHooks;
    public final int maximumOptimizationAttempts;
    public final int optTimeSliceMs;
    public final Prio prio;
    public final int processPollMs;
    public final long requiredDiskSpaceForCompilation;
    public final int timeBetweenOptimizationAttemptsMs;
    public final int yieldTimeSliceMs;

    public final class Builder {
        public int mFlags;
        public boolean mInstallDex2OatHooks;
        public int mMaximumOptimizationAttempts;
        public int mOptTimeSliceMs;
        public Prio mPrio;
        public int mProcessPollMs;
        public long mRequiredDiskSpaceForCompilation;
        public int mTimeBetweenOptimizationAttemptsMs;
        public int mYieldTimeSliceMs;

        public OptimizationConfiguration build() {
            return new OptimizationConfiguration(this.mPrio, this.mFlags, this.mOptTimeSliceMs, this.mYieldTimeSliceMs, this.mProcessPollMs, this.mTimeBetweenOptimizationAttemptsMs, this.mMaximumOptimizationAttempts, this.mRequiredDiskSpaceForCompilation, this.mInstallDex2OatHooks);
        }

        public Builder setInBackground(boolean z) {
            if (z) {
                this.mFlags |= 1;
                return this;
            }
            this.mFlags &= -2;
            return this;
        }

        public Builder setInstallDex2OatHooks(boolean z) {
            this.mInstallDex2OatHooks = z;
            return this;
        }

        public Builder setMaximumOptimizationAttempts(int i) {
            this.mMaximumOptimizationAttempts = i;
            return this;
        }

        public Builder setOptTimeSliceMs(int i) {
            this.mOptTimeSliceMs = i;
            return this;
        }

        public Builder setPrio(Prio prio) {
            this.mPrio = prio;
            return this;
        }

        public Builder setProcessPollMs(int i) {
            this.mProcessPollMs = i;
            return this;
        }

        public Builder setRequiredDiskSpaceForCompilation(long j) {
            this.mRequiredDiskSpaceForCompilation = j;
            return this;
        }

        public Builder setTimeBetweenOptimizationAttemptsMs(int i) {
            this.mTimeBetweenOptimizationAttemptsMs = i;
            return this;
        }

        public Builder setYieldTimeSliceMs(int i) {
            this.mYieldTimeSliceMs = i;
            return this;
        }

        public Builder() {
            this.mPrio = Prio.unchanged();
            this.mFlags = 0;
            this.mOptTimeSliceMs = 1000;
            this.mYieldTimeSliceMs = 0;
            this.mProcessPollMs = 100;
            this.mTimeBetweenOptimizationAttemptsMs = 3600000;
            this.mMaximumOptimizationAttempts = 10;
            this.mRequiredDiskSpaceForCompilation = OdexSchemeArtXdex.MIN_DISK_FREE_FOR_MIXED_MODE;
            this.mInstallDex2OatHooks = false;
        }

        public Builder(OptimizationConfiguration optimizationConfiguration) {
            this.mPrio = optimizationConfiguration.prio;
            this.mFlags = optimizationConfiguration.flags;
            this.mOptTimeSliceMs = optimizationConfiguration.optTimeSliceMs;
            this.mYieldTimeSliceMs = optimizationConfiguration.yieldTimeSliceMs;
            this.mProcessPollMs = optimizationConfiguration.processPollMs;
            this.mTimeBetweenOptimizationAttemptsMs = optimizationConfiguration.timeBetweenOptimizationAttemptsMs;
            this.mMaximumOptimizationAttempts = optimizationConfiguration.maximumOptimizationAttempts;
            this.mInstallDex2OatHooks = optimizationConfiguration.installDex2OatHooks;
        }
    }

    public class Provider {
        public final OptimizationConfiguration baseline;

        public OptimizationConfiguration getInstantaneous() {
            return this.baseline;
        }

        public Provider(OptimizationConfiguration optimizationConfiguration) {
            this.baseline = optimizationConfiguration;
        }
    }

    public OptimizationConfiguration(Prio prio2, int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z) {
        this.prio = prio2;
        this.flags = i;
        this.optTimeSliceMs = i2;
        this.yieldTimeSliceMs = i3;
        this.processPollMs = i4;
        this.timeBetweenOptimizationAttemptsMs = i5;
        this.maximumOptimizationAttempts = i6;
        this.requiredDiskSpaceForCompilation = j;
        this.installDex2OatHooks = z;
    }
}
