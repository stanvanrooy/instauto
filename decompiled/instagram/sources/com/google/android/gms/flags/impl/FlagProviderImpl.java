package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.flags.zzd;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass94S;
import p000X.B7T;
import p000X.B7V;
import p000X.B7W;
import p000X.B7X;
import p000X.B7Y;
import p000X.B7Z;

public class FlagProviderImpl extends zzd {
    public SharedPreferences A00;
    public boolean A01 = false;

    public FlagProviderImpl() {
        int A03 = AnonymousClass0Z0.A03(-1741199633);
        AnonymousClass0Z0.A0A(-1023645763, A03);
    }

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        Boolean bool;
        String str2;
        int A03 = AnonymousClass0Z0.A03(-2070042418);
        if (!this.A01) {
            AnonymousClass0Z0.A0A(1788763518, A03);
            return z;
        }
        SharedPreferences sharedPreferences = this.A00;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            bool = (Boolean) AnonymousClass94S.A00(new B7T(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
            bool = valueOf;
        }
        boolean booleanValue = bool.booleanValue();
        AnonymousClass0Z0.A0A(1630667707, A03);
        return booleanValue;
    }

    public int getIntFlagValue(String str, int i, int i2) {
        Integer num;
        String str2;
        int A03 = AnonymousClass0Z0.A03(2065136014);
        if (!this.A01) {
            AnonymousClass0Z0.A0A(-697527951, A03);
            return i;
        }
        SharedPreferences sharedPreferences = this.A00;
        Integer valueOf = Integer.valueOf(i);
        try {
            num = (Integer) AnonymousClass94S.A00(new B7W(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
            num = valueOf;
        }
        int intValue = num.intValue();
        AnonymousClass0Z0.A0A(716281568, A03);
        return intValue;
    }

    public long getLongFlagValue(String str, long j, int i) {
        Long l;
        String str2;
        int A03 = AnonymousClass0Z0.A03(-2136135437);
        if (!this.A01) {
            AnonymousClass0Z0.A0A(1634664166, A03);
            return j;
        }
        SharedPreferences sharedPreferences = this.A00;
        Long valueOf = Long.valueOf(j);
        try {
            l = (Long) AnonymousClass94S.A00(new B7V(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Flag value not available, returning default: ".concat(valueOf2);
            } else {
                str2 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str2);
            l = valueOf;
        }
        long longValue = l.longValue();
        AnonymousClass0Z0.A0A(-2105866292, A03);
        return longValue;
    }

    public String getStringFlagValue(String str, String str2, int i) {
        String str3;
        String str4;
        int A03 = AnonymousClass0Z0.A03(-1939083101);
        if (!this.A01) {
            AnonymousClass0Z0.A0A(440927957, A03);
            return str2;
        }
        try {
            str3 = (String) AnonymousClass94S.A00(new B7X(this.A00, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str4 = "Flag value not available, returning default: ".concat(valueOf);
            } else {
                str4 = new String("Flag value not available, returning default: ");
            }
            Log.w("FlagDataUtils", str4);
            str3 = str2;
        }
        AnonymousClass0Z0.A0A(-1556420234, A03);
        return str3;
    }

    public void init(IObjectWrapper iObjectWrapper) {
        String str;
        int i;
        SharedPreferences sharedPreferences;
        int A03 = AnonymousClass0Z0.A03(-1400581887);
        Context context = (Context) ObjectWrapper.A00(iObjectWrapper);
        if (this.A01) {
            i = 1138904607;
        } else {
            try {
                Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
                synchronized (SharedPreferences.class) {
                    if (B7Z.A00 == null) {
                        B7Z.A00 = (SharedPreferences) AnonymousClass94S.A00(new B7Y(createPackageContext));
                    }
                    sharedPreferences = B7Z.A00;
                }
                this.A00 = sharedPreferences;
                this.A01 = true;
                i = -752775161;
            } catch (PackageManager.NameNotFoundException unused) {
                AnonymousClass0Z0.A0A(190901158, A03);
                return;
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str = "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf);
                } else {
                    str = new String("Could not retrieve sdk flags, continuing with defaults: ");
                }
                Log.w("FlagProviderImpl", str);
                i = -537315490;
            }
        }
        AnonymousClass0Z0.A0A(i, A03);
    }
}
