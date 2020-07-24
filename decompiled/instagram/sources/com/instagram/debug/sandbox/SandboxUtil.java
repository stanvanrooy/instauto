package com.instagram.debug.sandbox;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.searchedittext.SearchEditText;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass1BE;
import p000X.AnonymousClass1CF;
import p000X.AnonymousClass5F4;
import p000X.AnonymousClass5F9;
import p000X.C05770Lw;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C11860fn;
import p000X.C129585gb;

public class SandboxUtil {
    public static void initSearchText(SearchEditText searchEditText) {
        searchEditText.setSearchIconEnabled(false);
        searchEditText.setClearButtonEnabled(true);
        C129585gb.A00(searchEditText);
    }

    public static Dialog getSandboxDialog(final Context context, final C06590Pq r7, List list) {
        final C05770Lw A00 = C05770Lw.A00();
        final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C0003R.layout.layout_dev_host_options, (ViewGroup) null, false);
        SearchEditText searchEditText = (SearchEditText) viewGroup.findViewById(C0003R.C0005id.dev_server);
        SearchEditText searchEditText2 = (SearchEditText) viewGroup.findViewById(C0003R.C0005id.dev_mqtt_server);
        initSearchText(searchEditText);
        initSearchText(searchEditText2);
        if (A00.A0K()) {
            searchEditText.setText(A00.A04());
        }
        if (A00.A00.getBoolean("using_mqtt_sandbox", false)) {
            searchEditText2.setText(A00.A00.getString("mqtt_server_name", ""));
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                viewGroup.addView((View) it.next());
            }
        }
        AnonymousClass5F4 r3 = new AnonymousClass5F4(context);
        r3.A01(C0003R.string.dev_choose_hosts);
        r3.A02(viewGroup);
        r3.A08(true);
        r3.A07(r3.A01.getString(C0003R.string.done), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                SharedPreferences sharedPreferences;
                SharedPreferences.Editor putString;
                EditText editText = (EditText) viewGroup.findViewById(C0003R.C0005id.dev_server);
                String lowerCase = editText.getText().toString().trim().toLowerCase(Locale.US);
                if (TextUtils.isEmpty(lowerCase)) {
                    A00.A0C(false);
                } else {
                    A00.A0C(true);
                    A00.A00.edit().putString(AnonymousClass0C5.$const$string(85), AnonymousClass1BE.A02(lowerCase)).apply();
                }
                synchronized (AnonymousClass1BE.class) {
                    AnonymousClass1BE.A00 = null;
                }
                Context context = context;
                if (context instanceof C11860fn) {
                    ((C11860fn) context).Azn(A00);
                }
                String lowerCase2 = ((EditText) viewGroup.findViewById(C0003R.C0005id.dev_mqtt_server)).getText().toString().trim().toLowerCase(Locale.US);
                if (TextUtils.isEmpty(lowerCase2)) {
                    putString = A00.A00.edit().putBoolean("using_mqtt_sandbox", false);
                } else {
                    A00.A00.edit().putBoolean("using_mqtt_sandbox", true).apply();
                    if (lowerCase2.contains(".")) {
                        sharedPreferences = A00.A00;
                    } else {
                        C05770Lw r1 = A00;
                        lowerCase2 = AnonymousClass000.A0E(lowerCase2, ".sb.facebook.com:8883");
                        sharedPreferences = r1.A00;
                    }
                    putString = sharedPreferences.edit().putString("mqtt_server_name", lowerCase2);
                }
                putString.apply();
                C06220Of.A0E(editText);
                AnonymousClass5F9.A05(context.getString(C0003R.string.dev_hosts_set_to, new Object[]{AnonymousClass1BE.A00(), RealtimeClientManager.getLatestMqttHost(AnonymousClass1CF.A00(r7))}));
                dialogInterface.dismiss();
            }
        });
        return r3.A00();
    }
}
