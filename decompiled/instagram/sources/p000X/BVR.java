package p000X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.text.BreakIterator;
import java.util.EnumSet;

/* renamed from: X.BVR */
public class BVR {
    public static final Uri A05 = Uri.parse("https://www.facebook.com/maps/report/?");
    public final Context A00;
    public final BVY A01;
    public final ADI A02;
    public final CharSequence A03;
    public final CharSequence A04;

    public static SpannableStringBuilder A00(String str, ClickableSpan clickableSpan) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        spannableStringBuilder.setSpan(clickableSpan, 0, characterInstance.last(), 33);
        return spannableStringBuilder;
    }

    public final Dialog A01(Dialog dialog) {
        BVV bvv = new BVV(this, dialog);
        BVT bvt = new BVT(this);
        BVU bvu = new BVU(this);
        String string = this.A00.getResources().getString(C0003R.string.maps_report_problem);
        String string2 = this.A00.getResources().getString(C0003R.string.maps_legal_notices_title);
        String string3 = this.A00.getResources().getString(C0003R.string.openstreetmap_copyright);
        SpannableStringBuilder A002 = A00(string, bvv);
        SpannableStringBuilder A003 = A00(string2, bvt);
        SpannableStringBuilder append = A002.append("\n").append(A003).append("\n").append(A00(string3, bvu));
        BVX AA0 = this.A02.AA0();
        AA0.BlG(this.A00.getResources().getString(C0003R.string.maps_information_title));
        AA0.Bix(append);
        AA0.Bjc(this.A00.getResources().getString(17039370), (DialogInterface.OnClickListener) null);
        Dialog A9x = AA0.A9x();
        A9x.show();
        BVZ.A00 = A9x;
        return A9x;
    }

    public final Dialog A02(Uri uri, boolean z) {
        BVX AA0 = this.A02.AA0();
        AA0.Bix(this.A03);
        AA0.Bjc(this.A04, new BVS(this, uri));
        if (z) {
            AA0.BjB(this.A00.getResources().getString(17039360), (DialogInterface.OnClickListener) null);
        }
        Dialog A9x = AA0.A9x();
        A9x.setOnCancelListener(new BVW(this, uri));
        return A9x;
    }

    public void A03(Context context, Uri uri, EnumSet enumSet) {
        Dialog dialog;
        int i;
        if (this instanceof B3X) {
            B3X b3x = (B3X) this;
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                dialog = b3x.A01(b3x.A02(uri, true));
                i = C0003R.C0005id.dialog_body;
            } else {
                return;
            }
        } else if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            dialog = A01(A02(uri, false));
            i = 16908299;
        } else {
            return;
        }
        TextView textView = (TextView) dialog.findViewById(i);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setLineSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.4f);
        }
    }

    public BVR(Context context, CharSequence charSequence, CharSequence charSequence2, ADI adi) {
        this.A00 = context;
        this.A04 = charSequence;
        this.A03 = charSequence2;
        this.A02 = adi == null ? new ACS(context) : adi;
        this.A01 = new BVY(this);
    }
}
