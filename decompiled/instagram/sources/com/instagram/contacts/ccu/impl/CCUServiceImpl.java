package com.instagram.contacts.ccu.impl;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0OZ;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass287;
import p000X.BGQ;
import p000X.BUE;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C193418Ps;
import p000X.C26818Bt3;
import p000X.C30001DMc;
import p000X.C30003DMe;
import p000X.C30004DMf;
import p000X.C30007DMj;
import p000X.C30011DMn;
import p000X.C30013DMp;
import p000X.C30019DMw;
import p000X.CN4;
import p000X.DMO;
import p000X.DMR;
import p000X.DMV;
import p000X.DMX;
import p000X.DN7;
import p000X.DNC;
import p000X.DND;

public class CCUServiceImpl extends BUE {
    /* JADX WARNING: Removed duplicated region for block: B:55:0x020b A[Catch:{ Exception -> 0x0319, all -> 0x0322 }] */
    public boolean onStart(Context context, DND dnd) {
        String str;
        C30003DMe dMe;
        DMO dmo;
        Cursor cursor;
        DND dnd2 = dnd;
        try {
            C06590Pq A01 = AnonymousClass0J1.A01(this);
            if (A01.AgN()) {
                AnonymousClass0C1 A02 = C05210Iq.A02(A01);
                AnonymousClass0P4 A00 = AnonymousClass0P4.A00("continuous_contact_upload_attempt", (AnonymousClass0RN) null);
                if (AnonymousClass0OZ.A00(A02).ARp() != null) {
                    A00.A0G("phone_id", AnonymousClass0OZ.A00(A02).ARp().A01);
                }
                AnonymousClass0WN.A01(A02).BcG(A00);
                Context context2 = context;
                C30004DMf dMf = new C30004DMf(context2);
                dMf.A03 = new BGQ(this, context2);
                dMf.A01 = new CN4(context2, A02);
                dMf.A00 = new C30013DMp(A02);
                dMf.A02 = new DN7(context2, A02);
                dMf.A06.add(new C30019DMw(this, dnd2));
                DMX dmx = new DMX(dMf);
                boolean z = false;
                if (dmx.A0A.checkCallingOrSelfPermission(AnonymousClass0C5.$const$string(187)) == 0) {
                    z = true;
                }
                CN4 cn4 = dmx.A07;
                boolean A002 = AnonymousClass287.A00(cn4.A00, cn4.A02);
                long A003 = dmx.A07.A00();
                DMV dmv = dmx.A06;
                if (A002) {
                    str = "on";
                } else {
                    str = "off";
                }
                long j = dmx.A04;
                long j2 = A003;
                boolean equals = "CCU_BACKGROUND_PING".equals("TEST_UPLOAD_SOURCE");
                if (!equals) {
                    C26818Bt3 A004 = dmv.A00.A00("contact_upload_ccu_setting_check");
                    A004.A02("ccu_setting", str);
                    A004.A00.A0A("has_os_permission", Boolean.valueOf(z));
                    A004.A01("upload_interval_in_ms", Long.valueOf(j));
                    A004.A01("last_upload_success_time", Long.valueOf(j2));
                    A004.A01("now_in_ms", Long.valueOf(System.currentTimeMillis()));
                    A004.A02("family_device_id", "");
                    A004.A00();
                }
                dmx.A06.A02("start_background_job", (String) null);
                DMV dmv2 = dmx.A06;
                if (!equals) {
                    C26818Bt3 A005 = dmv2.A00.A00("mlite_ccu_background_job_funnel");
                    A005.A02("background_event_name", "start_background_job");
                    A005.A02("family_device_id", "");
                    A005.A00();
                }
                if (dmx.A05.A0L) {
                    dmx.A06.A02("exit_background_job", "ccu_is_running");
                    dmx.A06.A01("ccu_is_running");
                    return false;
                } else if (!z) {
                    dmx.A06.A02("exit_background_job", "no_os_permission");
                    dmx.A06.A01("no_os_permission");
                    return false;
                } else if (!A002) {
                    dmx.A06.A02("exit_background_job", "no_app_permission");
                    dmx.A06.A01("no_app_permission");
                    return false;
                } else if (System.currentTimeMillis() - A003 < dmx.A04) {
                    dmx.A06.A02("exit_background_job", "time_interval");
                    dmx.A06.A01("time_interval");
                    return false;
                } else {
                    dmx.A06.A02("start_contact_upload", "time_interval");
                    DMV dmv3 = dmx.A06;
                    if (!equals) {
                        C26818Bt3 A006 = dmv3.A00.A00("mlite_ccu_background_job_funnel");
                        A006.A02("background_event_name", "start_contact_upload");
                        A006.A02("family_device_id", "");
                        A006.A00();
                    }
                    DMR dmr = dmx.A05;
                    dmr.A0L = true;
                    dmr.A0B = System.currentTimeMillis();
                    dmr.A0F = "CCU_BACKGROUND_PING";
                    dmr.A0G = null;
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "CCU_BACKGROUND_PING");
                    bundle.putBoolean("full_upload", false);
                    bundle.putString("family_device_id", (String) null);
                    for (C30007DMj BF9 : dmr.A0R.A01) {
                        BF9.BF9(bundle);
                    }
                    dmr.A0H = new ArrayList();
                    dmr.A0C = dmr.A0Q.A00();
                    C30011DMn dMn = dmr.A0T;
                    try {
                        cursor = dMn.A01.AEx().query(C193418Ps.$const$string(92), C30011DMn.A02, (String) null, (String[]) null, (String) null, (String) null, "local_contact_id");
                        try {
                            dMe = new C30003DMe(cursor);
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        cursor = null;
                        if (cursor != null) {
                            cursor.close();
                        }
                        Bundle bundle2 = new Bundle(1);
                        bundle2.putString("failure_reason", "snapshot_iterator_cursor_null");
                        dMn.A00.A00(bundle2);
                        dMe = null;
                        dmr.A0D = dMe;
                        dmo = dmr.A0C;
                        int i = 0;
                        if (dmo != null) {
                        }
                        dmr.A0L = false;
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("failure_reason", "create_session_get_iterator_fail");
                        bundle3.putString("family_device_id", (String) null);
                        dmr.A0R.A00(bundle3);
                        return false;
                    }
                    dmr.A0D = dMe;
                    dmo = dmr.A0C;
                    int i2 = 0;
                    if (dmo != null) {
                        C30003DMe dMe2 = dMe;
                        if (dMe != null) {
                            dmr.A00 = 0;
                            dmr.A03 = 0;
                            dmr.A0A = 0;
                            dmr.A05 = 0;
                            dmr.A07 = 0;
                            dmr.A08 = 0;
                            dmr.A06 = 0;
                            dmr.A09 = 0;
                            dmr.A01 = 0;
                            dmr.A02 = 0;
                            dmr.A04 = dmr.A0O.A03;
                            dmr.A0E = new C30001DMc(DMR.A0a, dmo, dMe2, DMR.A0Y, DMR.A0Z);
                            String A012 = dmr.A0U.A01();
                            DNC dnc = new DNC();
                            dnc.A00 = A012;
                            dmr.A0P.A00();
                            dmr.A0N.getSimCountryIso();
                            dmr.A0N.getNetworkCountryIso();
                            ArrayList arrayList = new ArrayList();
                            DMO dmo2 = dmr.A0C;
                            if (dmo2 == null || dmo2.A00.isClosed()) {
                                DMO A007 = dmr.A0Q.A00();
                                dmr.A0C = A007;
                                int position = A007.A00.getPosition();
                                A007.A00.moveToPosition(-1);
                                int columnIndexOrThrow = A007.A00.getColumnIndexOrThrow("deleted");
                                int columnIndexOrThrow2 = A007.A00.getColumnIndexOrThrow("contact_id");
                                long j3 = -1;
                                while (A007.A00.moveToNext()) {
                                    if (A007.A00.getInt(columnIndexOrThrow) == 0) {
                                        long j4 = A007.A00.getLong(columnIndexOrThrow2);
                                        if (j4 != j3) {
                                            i2++;
                                            j3 = j4;
                                        }
                                    }
                                }
                                A007.A00.moveToPosition(position);
                            }
                            Bundle bundle4 = new Bundle();
                            bundle4.putBoolean("full_upload", false);
                            bundle4.putString("source", dmr.A0F);
                            bundle4.putInt("batch_size", dmr.A0O.A00);
                            bundle4.putInt("num_of_retries", dmr.A04);
                            bundle4.putInt("contacts_upload_count", dmr.A05);
                            bundle4.putLong("time_spent", System.currentTimeMillis() - dmr.A0B);
                            bundle4.putInt("phonebook_size", i2);
                            bundle4.putString("family_device_id", (String) null);
                            for (C30007DMj BOh : dmr.A0R.A01) {
                                BOh.BOh(bundle4);
                            }
                            DMR.A05(dmr, dnc, Collections.unmodifiableList(arrayList), 0);
                            return false;
                        }
                    }
                    dmr.A0L = false;
                    Bundle bundle32 = new Bundle();
                    bundle32.putString("failure_reason", "create_session_get_iterator_fail");
                    bundle32.putString("family_device_id", (String) null);
                    dmr.A0R.A00(bundle32);
                }
            }
            return false;
        } catch (Exception e) {
            AnonymousClass0QD.A09("CCUJobService#onStartJob", e);
            dnd2.onFinish();
        } catch (Throwable unused3) {
        }
        return false;
    }
}
