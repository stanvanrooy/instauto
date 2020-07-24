package com.facebook.common.locale;

import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import p000X.AnonymousClass000;
import p000X.C2098092v;
import p000X.C211559An;

public class Country extends LocaleMember {
    public static final Country A00 = A00("IN");
    public static final Country A01 = A00("US");
    public static final C211559An A02 = new C211559An();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(49);

    public static Country A00(String str) {
        LocaleMember localeMember;
        C211559An r2 = A02;
        if (str != null) {
            int length = str.length();
            if (length == 2) {
                try {
                    localeMember = (LocaleMember) r2.A01.A00(str);
                } catch (ExecutionException e) {
                    C2098092v.A01(e);
                    throw new RuntimeException(e);
                }
            } else if (length == 3) {
                localeMember = (LocaleMember) ((ImmutableMap) r2.A00.get()).get(str);
            }
            return (Country) localeMember;
        }
        throw new IllegalArgumentException(AnonymousClass000.A0E("Not a legal code: ", str));
    }

    public Country(Locale locale) {
        super(locale);
    }
}
