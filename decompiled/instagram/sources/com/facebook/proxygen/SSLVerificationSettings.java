package com.facebook.proxygen;

public class SSLVerificationSettings {
    public boolean enableTimestampVerification;
    public boolean enforceCertKeyLengthVerification;
    public long trustedReferenceTimestamp;

    public class Builder {
        public boolean enableTimestampVerification = false;
        public boolean enforceCertKeyLengthVerification = false;
        public long trustedReferenceTimestamp = 0;

        public SSLVerificationSettings build() {
            return new SSLVerificationSettings(this.enableTimestampVerification, this.enforceCertKeyLengthVerification, this.trustedReferenceTimestamp);
        }

        public Builder setEnableTimestampVerification(boolean z) {
            this.enableTimestampVerification = z;
            return this;
        }

        public Builder setEnforceCertKeyLengthVerification(boolean z) {
            this.enforceCertKeyLengthVerification = z;
            return this;
        }

        public Builder setTrustedReferenceTimestamp(long j) {
            this.trustedReferenceTimestamp = j;
            return this;
        }
    }

    public SSLVerificationSettings(boolean z, boolean z2, long j) {
        this.enableTimestampVerification = z;
        this.enforceCertKeyLengthVerification = z2;
        this.trustedReferenceTimestamp = j;
    }
}
