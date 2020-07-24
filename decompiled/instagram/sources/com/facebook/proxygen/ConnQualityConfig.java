package com.facebook.proxygen;

public class ConnQualityConfig {
    public boolean mOverrideRtt;
    public int mRtt;
    public boolean mStripConnQuality;
    public boolean mUseHTTP2PingRtt;

    public class Builder {
        public boolean mOverrideRtt = false;
        public int mRtt = -1;
        public boolean mStripConnQuality = false;
        public boolean mUseHTTP2PingRtt = false;

        public ConnQualityConfig build() {
            return new ConnQualityConfig(this.mUseHTTP2PingRtt, this.mStripConnQuality, this.mOverrideRtt, this.mRtt);
        }

        public Builder setOverrideRtt(boolean z) {
            this.mOverrideRtt = z;
            return this;
        }

        public Builder setRtt(int i) {
            this.mRtt = i;
            return this;
        }

        public Builder setStripConnQuality(boolean z) {
            this.mStripConnQuality = z;
            return this;
        }

        public Builder setUseHTTP2PingRtt(boolean z) {
            this.mUseHTTP2PingRtt = z;
            return this;
        }
    }

    public ConnQualityConfig(boolean z, boolean z2, boolean z3, int i) {
        this.mUseHTTP2PingRtt = false;
        this.mStripConnQuality = false;
        this.mOverrideRtt = false;
        this.mRtt = -1;
        this.mUseHTTP2PingRtt = z;
        this.mStripConnQuality = z2;
        this.mOverrideRtt = z3;
        this.mRtt = i;
    }
}
