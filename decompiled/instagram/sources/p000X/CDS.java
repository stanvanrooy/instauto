package p000X;

import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CDS */
public final class CDS implements DialogInterface.OnClickListener {
    public final /* synthetic */ CDC A00;
    public final /* synthetic */ CCK A01;
    public final /* synthetic */ String A02;

    public CDS(CDC cdc, String str, CCK cck) {
        this.A00 = cdc;
        this.A02 = str;
        this.A01 = cck;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        AnonymousClass2OA r5 = new AnonymousClass2OA(this.A00.A01);
        r5.A0V(true);
        r5.A07(C0003R.string.promote_audience_delete_dialog_title);
        CDC cdc = this.A00;
        String str2 = this.A02;
        if (cdc.A03.A0v) {
            StringBuilder sb = new StringBuilder();
            List<C27481CEx> A002 = CDC.A00(cdc, str2);
            if (!AnonymousClass0OX.A00(A002)) {
                ArrayList arrayList = new ArrayList();
                for (C27481CEx cEx : A002) {
                    arrayList.add(cEx.A06);
                }
                Resources resources = cdc.A01.getResources();
                Object obj = cdc.A03.A0l.get(str2);
                AnonymousClass11J.A00(obj);
                FragmentActivity fragmentActivity = cdc.A01;
                sb.append(resources.getString(C0003R.string.quick_promote_delete_audience_name_text, new Object[]{((CFW) obj).A05, C180587nL.A00(fragmentActivity, CDX.A01(fragmentActivity), arrayList)}));
            }
            sb.append(cdc.A01.getResources().getString(C0003R.string.quick_promote_delete_audience_subtitle_text));
            str = sb.toString();
        } else {
            str = cdc.A01.getResources().getString(C0003R.string.promote_audience_delete_dialog_message);
        }
        r5.A0M(str);
        r5.A0D(C0003R.string.delete, new C27438CDg(this.A00, this.A01, this.A02), Constants.A0Y);
        r5.A08(C0003R.string.cancel, (DialogInterface.OnClickListener) null);
        r5.A03().show();
    }
}
