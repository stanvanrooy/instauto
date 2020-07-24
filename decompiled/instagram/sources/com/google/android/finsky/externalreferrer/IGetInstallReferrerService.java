package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IInterface;

public interface IGetInstallReferrerService extends IInterface {
    Bundle ANr(Bundle bundle);
}
