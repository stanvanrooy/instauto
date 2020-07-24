package p000X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.Objects;

/* renamed from: X.1zE  reason: invalid class name and case insensitive filesystem */
public final class C46161zE extends C29121Or {
    public float A00 = -1.0f;
    public AnonymousClass3BX A01;
    public final AnonymousClass1LO A02;
    public final AnonymousClass0RN A03;
    public final C63532pd A04;
    public final UserDetailFragment A05;
    public final AnonymousClass0C1 A06;

    public final void A72(C29491Qc r2, Object obj, Object obj2) {
        r2.A00(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        int i2;
        int A032 = AnonymousClass0Z0.A03(-960674067);
        C30784Djy djy = (C30784Djy) obj2;
        IgMultiImageButton igMultiImageButton = (IgMultiImageButton) view;
        C71703Bv.A02(this.A06, igMultiImageButton, (AnonymousClass1NJ) obj, djy.A01, djy.A02, djy.A00, 0, this.A00, this.A04, this.A02, this.A05, this.A01, this.A03, false);
        Context context = view.getContext();
        boolean z = djy.A03;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) igMultiImageButton.getLayoutParams();
        if (z) {
            i2 = context.getResources().getDimensionPixelSize(C0003R.dimen.photo_grid_spacing);
        } else {
            i2 = 0;
        }
        AnonymousClass1X6.A00(marginLayoutParams, i2);
        igMultiImageButton.setLayoutParams(marginLayoutParams);
        AnonymousClass0Z0.A0A(-1278073905, A032);
    }

    public final int ANH(int i, Object obj, Object obj2) {
        return ((AnonymousClass1NJ) obj).APo().hashCode();
    }

    public final int AaQ(int i, Object obj, Object obj2) {
        AnonymousClass1NJ r5 = (AnonymousClass1NJ) obj;
        return Objects.hash(new Object[]{r5.getId(), r5.APx()});
    }

    public C46161zE(AnonymousClass0C1 r2, C63532pd r3, UserDetailFragment userDetailFragment, AnonymousClass1LO r5, AnonymousClass0RN r6) {
        this.A06 = r2;
        this.A04 = r3;
        this.A05 = userDetailFragment;
        this.A02 = r5;
        this.A03 = r6;
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0Z0.A03(-1011094440);
        Context context = viewGroup.getContext();
        IgMultiImageButton igMultiImageButton = new IgMultiImageButton(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(C0003R.dimen.photo_grid_spacing);
        igMultiImageButton.setLayoutParams(marginLayoutParams);
        AnonymousClass0Z0.A0A(-1490480955, A032);
        return igMultiImageButton;
    }
}
