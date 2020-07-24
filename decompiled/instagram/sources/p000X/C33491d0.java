package p000X;

import android.content.Intent;
import android.net.Uri;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.1d0  reason: invalid class name and case insensitive filesystem */
public final class C33491d0 implements C11180eY {
    public ImmutableSet A00;
    public String A01 = "";

    public C33491d0(Intent intent) {
        ImmutableSet immutableSet;
        Uri data = intent.getData();
        if (data != null) {
            this.A01 = data.toString();
        }
        if (intent.getCategories() != null) {
            immutableSet = ImmutableSet.A02(intent.getCategories());
        } else {
            immutableSet = null;
        }
        this.A00 = immutableSet;
    }
}
