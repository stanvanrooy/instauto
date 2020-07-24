package p000X;

import com.facebook.analytics2.logger.PrivacyControlledUploader;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.util.Iterator;

/* renamed from: X.06j  reason: invalid class name and case insensitive filesystem */
public final class C032806j {
    public final Iterator A00;
    public final PrivacyControlledUploader A01;
    public final AnonymousClass03B A02;
    public final SamplingPolicyConfig A03;

    public C032806j(PrivacyControlledUploader privacyControlledUploader, Iterator it, AnonymousClass03B r3, SamplingPolicyConfig samplingPolicyConfig) {
        this.A01 = privacyControlledUploader;
        this.A00 = it;
        this.A02 = r3;
        this.A03 = samplingPolicyConfig;
    }
}
