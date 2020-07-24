package p000X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.1zD  reason: invalid class name and case insensitive filesystem */
public final class C46151zD extends C29121Or {
    public float A00 = -1.0f;
    public AnonymousClass3BX A01;
    public final AnonymousClass1LO A02;
    public final AnonymousClass0RN A03;
    public final C63532pd A04;
    public final UserDetailFragment A05;
    public final AnonymousClass0C1 A06;
    public final AnonymousClass2NV A07;
    public final Context A08;
    public final C71983Cy A09 = new C71983Cy();

    public final int getViewTypeCount() {
        return 1;
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0Z0.A03(-58385462);
        C68202yc r3 = (C68202yc) obj2;
        int A033 = AnonymousClass0Z0.A03(-534647498);
        C71703Bv.A01(this.A06, (C36381hx) view.getTag(), (C68192yb) obj, r3.A03, r3.A00, this.A00, false, r3.A01, this.A04, this.A02, this.A05, this.A01, this.A03);
        AnonymousClass0Z0.A0A(-936910299, A033);
        AnonymousClass0Z0.A0A(-1830958056, A032);
    }

    public final /* bridge */ /* synthetic */ void A72(C29491Qc r6, Object obj, Object obj2) {
        C68192yb r7 = (C68192yb) obj;
        C68202yc r8 = (C68202yc) obj2;
        r6.A00(0);
        if (this.A01 != null) {
            for (int i = 0; i < r7.A00(); i++) {
                this.A01.A4t((AnonymousClass1NJ) r7.A01(i), (r8.A00 * this.A07.A00) + i);
            }
        }
    }

    public final int ANH(int i, Object obj, Object obj2) {
        return ((C68192yb) obj).A02().hashCode();
    }

    public final int AaQ(int i, Object obj, Object obj2) {
        C68192yb r8 = (C68192yb) obj;
        int[] iArr = new int[r8.A00()];
        for (int i2 = 0; i2 < r8.A00(); i2++) {
            AnonymousClass1NJ r3 = (AnonymousClass1NJ) r8.A01(i2);
            iArr[i2] = Objects.hash(new Object[]{r3.getId(), r3.APx()});
        }
        return Arrays.hashCode(iArr);
    }

    public C46151zD(Context context, AnonymousClass0C1 r3, C63532pd r4, UserDetailFragment userDetailFragment, AnonymousClass1LO r6, AnonymousClass2NV r7, AnonymousClass0RN r8) {
        this.A08 = context;
        this.A06 = r3;
        this.A04 = r4;
        this.A05 = userDetailFragment;
        this.A02 = r6;
        this.A07 = r7;
        this.A03 = r8;
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0Z0.A03(843436170);
        View A002 = C71703Bv.A00(viewGroup.getContext(), viewGroup, this.A07.A00, this.A09);
        AnonymousClass0Z0.A0A(-171088753, A032);
        return A002;
    }
}
