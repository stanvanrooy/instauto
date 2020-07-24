package com.facebook.react.modules.datepicker;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeDatePickerAndroidSpec;
import com.facebook.react.module.annotations.ReactModule;
import p000X.A44;
import p000X.AnonymousClass1AM;
import p000X.C157186nT;
import p000X.C157196nV;
import p000X.C2102594w;
import p000X.C23043A0y;
import p000X.C52352Ol;

@ReactModule(name = "DatePickerAndroid")
public class DatePickerDialogModule extends NativeDatePickerAndroidSpec {
    public static final String ACTION_DATE_SET = "dateSetAction";
    public static final String ACTION_DISMISSED = "dismissedAction";
    public static final String ARG_DATE = "date";
    public static final String ARG_MAXDATE = "maxDate";
    public static final String ARG_MINDATE = "minDate";
    public static final String ARG_MODE = "mode";
    public static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
    public static final String FRAGMENT_TAG = "DatePickerAndroid";

    public String getName() {
        return FRAGMENT_TAG;
    }

    private Bundle createFragmentArguments(C23043A0y a0y) {
        Bundle bundle = new Bundle();
        if (a0y.hasKey(ARG_DATE) && !a0y.isNull(ARG_DATE)) {
            bundle.putLong(ARG_DATE, (long) a0y.getDouble(ARG_DATE));
        }
        if (a0y.hasKey(ARG_MINDATE) && !a0y.isNull(ARG_MINDATE)) {
            bundle.putLong(ARG_MINDATE, (long) a0y.getDouble(ARG_MINDATE));
        }
        if (a0y.hasKey(ARG_MAXDATE) && !a0y.isNull(ARG_MAXDATE)) {
            bundle.putLong(ARG_MAXDATE, (long) a0y.getDouble(ARG_MAXDATE));
        }
        if (a0y.hasKey(ARG_MODE) && !a0y.isNull(ARG_MODE)) {
            bundle.putString(ARG_MODE, a0y.getString(ARG_MODE));
        }
        return bundle;
    }

    public DatePickerDialogModule(A44 a44) {
        super(a44);
    }

    public void open(C23043A0y a0y, C2102594w r6) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof FragmentActivity)) {
            r6.reject(ERROR_NO_ACTIVITY, "Tried to open a DatePicker dialog while not attached to a FragmentActivity");
            return;
        }
        AnonymousClass1AM A05 = ((FragmentActivity) currentActivity).A05();
        C52352Ol r0 = (C52352Ol) A05.A0N(FRAGMENT_TAG);
        if (r0 != null) {
            r0.A04();
        }
        C157186nT r1 = new C157186nT();
        if (a0y != null) {
            r1.setArguments(createFragmentArguments(a0y));
        }
        C157196nV r02 = new C157196nV(this, r6);
        r1.A01 = r02;
        r1.A00 = r02;
        r1.A06(A05, FRAGMENT_TAG);
    }
}
