package p000X;

import android.app.DialogFragment;
import android.content.Context;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.AUJ */
public final class AUJ implements View.OnTouchListener {
    public Integer A00 = Constants.A0N;
    public final DialogFragment A01;
    public final View A02;
    public final GestureDetector A03;
    public final AnonymousClass1EG A04;

    public static void A00(AUJ auj, double d) {
        int i;
        auj.A04.A05((double) auj.A02.getTranslationY(), true);
        if (auj.A00 == Constants.ZERO) {
            AnonymousClass1EG r4 = auj.A04;
            r4.A07(new AUO(auj));
            r4.A04(d);
            Resources resources = auj.A01.getActivity().getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 150;
            }
            r4.A03((double) (i + auj.A02.getHeight()));
            return;
        }
        AnonymousClass1EG r2 = auj.A04;
        r2.A04(d);
        r2.A03(0.0d);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer num;
        double d;
        if (this.A03.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() != 1 || (num = this.A00) == Constants.A0N) {
            return false;
        }
        if (num == Constants.A0C) {
            d = -2000.0d;
        } else {
            d = 2000.0d;
        }
        A00(this, d);
        return true;
    }

    public AUJ(Context context, DialogFragment dialogFragment, View view) {
        this.A01 = dialogFragment;
        this.A02 = view;
        AnonymousClass1EG A002 = new AnonymousClass1EB(AnonymousClass7OW.A00()).A00();
        A002.A06 = true;
        this.A04 = A002;
        A002.A07(new AUL(this));
        this.A03 = new GestureDetector(context, new AUK(this));
    }
}
