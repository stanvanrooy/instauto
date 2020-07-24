package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import com.facebook.C0003R;
import com.instagram.igds.components.form.IgFormField;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.CKU */
public final class CKU extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM {
    public static final CLW A06 = new CLW();
    public IgFormField A00;
    public CKE A01;
    public CKS A02;
    public final SimpleDateFormat A03 = new SimpleDateFormat(AnonymousClass40t.$const$string(38), Locale.US);
    public final Calendar A04 = Calendar.getInstance();
    public final C18750sM A05 = C18730sK.A00(new CL3(this));

    public final String getModuleName() {
        return "BirthDateInputFragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        C13150hy.A02(r2, "configurer");
        r2.BlI(C0003R.string.payout_date_of_birth);
        r2.Bo6(true);
    }

    public final /* bridge */ /* synthetic */ C06590Pq getSession() {
        return (AnonymousClass0C1) this.A05.getValue();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C13150hy.A02(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C0003R.C0005id.date_of_birth);
        IgFormField igFormField = (IgFormField) findViewById;
        SimpleDateFormat simpleDateFormat = this.A03;
        Calendar calendar = this.A04;
        C13150hy.A01(calendar, "selectedDate");
        igFormField.setText(simpleDateFormat.format(Long.valueOf(calendar.getTimeInMillis())));
        EditText editText = igFormField.A00;
        C13150hy.A01(editText, "editText");
        editText.setFocusable(false);
        EditText editText2 = igFormField.A00;
        C13150hy.A01(editText2, "editText");
        editText2.setClickable(true);
        String string = getString(C0003R.string.required_field);
        C13150hy.A01(string, "getString(R.string.required_field)");
        CKE cke = new CKE(string);
        this.A01 = cke;
        igFormField.setRuleChecker(cke);
        C13150hy.A01(findViewById, "findViewById<IgFormField…hDateChecker)\n          }");
        this.A00 = igFormField;
        ((DatePicker) view.findViewById(C0003R.C0005id.date_of_birth_picker)).init(this.A04.get(1), this.A04.get(2), this.A04.get(5), new C27615CKi(this));
    }

    public final boolean onBackPressed() {
        boolean z;
        Calendar instance = Calendar.getInstance();
        C13150hy.A01(instance, "dob");
        Calendar calendar = this.A04;
        C13150hy.A01(calendar, "selectedDate");
        instance.setTime(calendar.getTime());
        instance.set(1, this.A04.get(1) + 18);
        int compareTo = instance.compareTo(Calendar.getInstance());
        String str = null;
        if (compareTo > 0) {
            CKE cke = this.A01;
            if (cke == null) {
                C13150hy.A03("birthDateChecker");
            }
            Context context = getContext();
            if (context != null) {
                str = context.getString(C0003R.string.payout_birth_date_age_error, new Object[]{18});
            }
            cke.A00 = str;
            z = false;
        } else {
            CKE cke2 = this.A01;
            if (cke2 == null) {
                C13150hy.A03("birthDateChecker");
            }
            cke2.A00 = null;
            z = true;
        }
        if (z) {
            CKS cks = this.A02;
            if (cks == null) {
                C13150hy.A03("interactor");
            }
            SimpleDateFormat simpleDateFormat = this.A03;
            Calendar calendar2 = this.A04;
            C13150hy.A01(calendar2, "selectedDate");
            String format = simpleDateFormat.format(Long.valueOf(calendar2.getTimeInMillis()));
            C13150hy.A01(format, "dateFormat.format(selectedDate.timeInMillis)");
            C13150hy.A02(format, "dateOfBirth");
            AnonymousClass1HQ r2 = cks.A02;
            Object A022 = r2.A02();
            if (A022 == null) {
                C13150hy.A00();
            }
            ((CKX) A022).A0P = format;
            r2.A09(A022);
            getParentFragmentManager().A0W();
            return true;
        }
        IgFormField igFormField = this.A00;
        if (igFormField == null) {
            C13150hy.A03("birthDate");
        }
        igFormField.A04();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0Z0.A02(-1919921660);
        super.onCreate(bundle);
        C25941Az A002 = new C25921Ax((C11750fc) requireActivity(), (AnonymousClass1B1) new CKI(CLA.A00((AnonymousClass0C1) this.A05.getValue(), new C27611CKe((AnonymousClass0C1) this.A05.getValue())))).A00(CKS.class);
        C13150hy.A01(A002, "ViewModelProvider(\n     …ngInteractor::class.java]");
        CKS cks = (CKS) A002;
        this.A02 = cks;
        if (cks == null) {
            C13150hy.A03("interactor");
        }
        CKX ckx = (CKX) cks.A01.A02();
        if (!(ckx == null || (str = ckx.A0P) == null)) {
            Calendar calendar = this.A04;
            C13150hy.A01(calendar, "selectedDate");
            calendar.setTime(this.A03.parse(str));
        }
        AnonymousClass0Z0.A09(-299249842, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1675111259);
        C13150hy.A02(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0003R.layout.layout_birth_date, viewGroup, false);
        AnonymousClass0Z0.A09(-2106900534, A022);
        return inflate;
    }
}
