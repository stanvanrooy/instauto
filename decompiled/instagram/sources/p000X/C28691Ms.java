package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Ms  reason: invalid class name and case insensitive filesystem */
public class C28691Ms extends C28701Mt {
    public C139215xF mCheckpoint;
    public String mCheckpointUrl;
    public C30762DjK mConsentData;
    public String mErrorBody;
    public String mErrorMessage;
    public String mErrorSource;
    public List mErrorStrings;
    public String mErrorTitle;
    public String mErrorType;
    public String mFeedbackAction;
    public String mFeedbackAppealLabel;
    public String mFeedbackIgnoreLabel;
    public String mFeedbackMessage;
    public boolean mFeedbackRequired;
    public String mFeedbackTitle;
    public String mFeedbackUrl;
    public String mLocalizedErrorMessage;
    public boolean mLockCheckpointDialog;
    public String mLogoutReason;
    public Integer mRetryCooldownTimeInSec;
    public String mStatus;
    public List mSystemMessages;

    public C139215xF getCheckpoint() {
        return this.mCheckpoint;
    }

    public String getCheckpointUrl() {
        return this.mCheckpointUrl;
    }

    public C30762DjK getConsentData() {
        return this.mConsentData;
    }

    public String getErrorBody() {
        return this.mErrorBody;
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public String getErrorSource() {
        return this.mErrorSource;
    }

    public List getErrorStrings() {
        return this.mErrorStrings;
    }

    public String getErrorTitle() {
        return this.mErrorTitle;
    }

    public String getErrorType() {
        return this.mErrorType;
    }

    public String getFeedbackAction() {
        return this.mFeedbackAction;
    }

    public String getFeedbackAppealLabel() {
        return this.mFeedbackAppealLabel;
    }

    public String getFeedbackIgnoreLabel() {
        return this.mFeedbackIgnoreLabel;
    }

    public String getFeedbackMessage() {
        return this.mFeedbackMessage;
    }

    public String getFeedbackTitle() {
        return this.mFeedbackTitle;
    }

    public String getFeedbackUrl() {
        return this.mFeedbackUrl;
    }

    public String getLocalizedErrorMessage() {
        return this.mLocalizedErrorMessage;
    }

    public String getLogoutReason() {
        return this.mLogoutReason;
    }

    public int getRetryCooldownTimeInMs() {
        Integer num = this.mRetryCooldownTimeInSec;
        if (num == null) {
            return 0;
        }
        return num.intValue() * 1000;
    }

    public boolean getShouldShowWebviewCancelButton() {
        return !this.mLockCheckpointDialog;
    }

    public String getStatus() {
        return this.mStatus;
    }

    public List getSystemMessages() {
        return this.mSystemMessages;
    }

    public boolean isCheckpointRequired() {
        String str = this.mErrorMessage;
        if ("checkpoint_required".equals(str) || "challenge_required".equals(str)) {
            return true;
        }
        return false;
    }

    public boolean isConsentRequired() {
        return "consent_required".equals(this.mErrorMessage);
    }

    public boolean isFeedbackRequired() {
        if (this.mFeedbackRequired || "feedback_required".equals(this.mErrorMessage)) {
            return true;
        }
        return false;
    }

    public boolean isLoginRequired() {
        return "login_required".equals(this.mErrorMessage);
    }

    public boolean isNoContent() {
        if (this.mStatusCode == 204) {
            return true;
        }
        return false;
    }

    public boolean isViolatingBrandedContentPolicy() {
        return "branded_content_policy_violated".equals(this.mErrorMessage);
    }

    public boolean isOk() {
        return "ok".equals(getStatus());
    }

    public void parseError(C13080hr r4) {
        C13120hv A0g = r4.A0g();
        if (A0g == C13120hv.START_OBJECT) {
            ArrayList arrayList = new ArrayList();
            while (r4.A0p() != C13120hv.END_OBJECT) {
                if (r4.A0i().equals("errors")) {
                    r4.A0p();
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            arrayList.add(r4.A0t());
                        }
                    }
                } else {
                    r4.A0f();
                }
            }
            this.mErrorStrings = arrayList;
        } else if (A0g == C13120hv.START_ARRAY) {
            r4.A0f();
        } else {
            this.mErrorMessage = r4.A0t();
        }
    }

    public boolean hasErrorType() {
        return this.mErrorType != null;
    }

    public boolean hasErrorType(String str) {
        return hasErrorType() && this.mErrorType.equals(str);
    }
}
