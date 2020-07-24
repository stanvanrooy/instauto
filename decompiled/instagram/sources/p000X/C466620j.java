package p000X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.textview.UpdatableButton;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.20j  reason: invalid class name and case insensitive filesystem */
public final class C466620j implements View.OnClickListener {
    public C13300iJ A00;
    public Integer A01;
    public final Activity A02;
    public final AnonymousClass0RN A03;
    public final C12830hS A04;
    public final AnonymousClass0C1 A05;
    public final UpdatableButton A06;

    public static void A00(C466620j r7) {
        C13300iJ r6 = r7.A00;
        AnonymousClass0a4.A06(r6);
        C12830hS r5 = r7.A04;
        C17850qu A022 = C25007Axz.A02(r7.A05, r7.A03, Constants.A0N, Collections.singletonList(r6.getId()), new ArrayList());
        A022.A00 = new CID(r7, r6);
        r5.schedule(A022);
        r7.A01 = Constants.A0C;
        A01(r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r3.A06.setText(com.facebook.C0003R.string.close_friends_button_added);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r3.A06.setText(com.facebook.C0003R.string.close_friends_button_add_to_list);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        return;
     */
    public static void A01(C466620j r3) {
        Integer num = r3.A01;
        if (num != null) {
            switch (num.intValue()) {
                case 0:
                    UpdatableButton updatableButton = r3.A06;
                    updatableButton.setIsBlueButton(false);
                    updatableButton.setEnabled(true);
                    break;
                case 1:
                    UpdatableButton updatableButton2 = r3.A06;
                    updatableButton2.setIsBlueButton(true);
                    updatableButton2.setEnabled(true);
                    break;
                case 2:
                    UpdatableButton updatableButton3 = r3.A06;
                    updatableButton3.setIsBlueButton(false);
                    updatableButton3.setEnabled(false);
                    break;
                case 3:
                    UpdatableButton updatableButton4 = r3.A06;
                    updatableButton4.setIsBlueButton(true);
                    updatableButton4.setEnabled(false);
                    break;
                default:
                    return;
            }
        }
    }

    public C466620j(Activity activity, AnonymousClass0RN r2, C12830hS r3, AnonymousClass0C1 r4, UpdatableButton updatableButton) {
        this.A02 = activity;
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = updatableButton;
        updatableButton.setOnClickListener(this);
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0Z0.A05(44176275);
        Integer num = this.A01;
        if (num == Constants.ZERO) {
            AnonymousClass0a4.A06(this.A00);
            UpdatableButton updatableButton = this.A06;
            Context context = updatableButton.getContext();
            Resources resources = updatableButton.getResources();
            String AZn = this.A00.AZn();
            String string = resources.getString(C0003R.string.close_friends_confirm_remove, new Object[]{AZn});
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            StyleSpan styleSpan = new StyleSpan(1);
            int indexOf = string.indexOf(AZn);
            spannableStringBuilder.setSpan(styleSpan, indexOf, indexOf + AZn.length(), 33);
            AnonymousClass2OA r3 = new AnonymousClass2OA(context);
            r3.A0L(this.A00.ASv());
            r3.A0M(spannableStringBuilder);
            r3.A0A(C0003R.string.remove, new CIB(this));
            r3.A09(C0003R.string.cancel, (DialogInterface.OnClickListener) null);
            r3.A03().show();
        } else if (num == Constants.ONE) {
            AnonymousClass0a4.A06(this.A00);
            if (C30571Uj.A01(this.A05)) {
                C30571Uj.A00(this.A02, new CIE(this));
            } else {
                A00(this);
            }
        }
        AnonymousClass0Z0.A0C(-609182515, A052);
    }
}
