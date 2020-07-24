package p000X;

import android.os.Bundle;

/* renamed from: X.DMV */
public final class DMV implements C30007DMj {
    public final C30013DMp A00;

    private void A00(Bundle bundle) {
        C26818Bt3 A002 = this.A00.A00("ccu_contacts_upload_failed_event");
        A002.A02("failure_reason", bundle.getString("failure_reason"));
        A002.A02("failure_message", bundle.getString("failure_message"));
        A002.A00.A0A("full_upload", Boolean.valueOf(bundle.getBoolean("full_upload")));
        A002.A01("last_upload_success_time", Long.valueOf(bundle.getLong("last_upload_success_time")));
        A002.A01("time_spent", Long.valueOf(bundle.getLong("time_spent")));
        A002.A01("num_of_retries", Integer.valueOf(bundle.getInt("num_of_retries")));
        A002.A02("ccu_session_id", bundle.getString("ccu_session_id"));
        A002.A02("source", bundle.getString("source"));
        A002.A00();
    }

    public final void A01(String str) {
        if (!"CCU_BACKGROUND_PING".equals("TEST_UPLOAD_SOURCE")) {
            C26818Bt3 A002 = this.A00.A00("mlite_ccu_background_job_funnel");
            A002.A02("background_event_name", str);
            A002.A02("family_device_id", "");
            A002.A00();
        }
    }

    public final void A02(String str, String str2) {
        if (!"CCU_BACKGROUND_PING".equals("TEST_UPLOAD_SOURCE")) {
            C26818Bt3 A002 = this.A00.A00("contact_upload_entry_event");
            A002.A02("entry_point", "background_job_new_protocol");
            A002.A02("action", str);
            if (str2 != null) {
                A002.A02("failure_reason", str2);
            }
            A002.A02("fdid", "");
            A002.A00();
        }
    }

    public final void At7(Bundle bundle) {
        C26818Bt3 A002 = this.A00.A00("ccu_contacts_upload_information_event");
        A002.A02("upload_step", "batch_upload_succeed");
        A002.A00.A0A("full_upload", Boolean.valueOf(bundle.getBoolean("full_upload")));
        A002.A01("batch_index", Integer.valueOf(bundle.getInt("batch_index")));
        A002.A01("batch_size", Integer.valueOf(bundle.getInt("batch_size")));
        A002.A01("contacts_upload_count", Integer.valueOf(bundle.getInt("contacts_upload_count")));
        A002.A01("add_count", Integer.valueOf(bundle.getInt("add_count")));
        A002.A01("remove_count", Integer.valueOf(bundle.getInt("remove_count")));
        A002.A01("update_count", Integer.valueOf(bundle.getInt("update_count")));
        A002.A01("time_spent", Long.valueOf(bundle.getLong("time_spent")));
        A002.A01("num_of_retries", Integer.valueOf(bundle.getInt("num_of_retries")));
        A002.A02("ccu_session_id", bundle.getString("ccu_session_id"));
        A002.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C26818Bt3 A003 = this.A00.A00("ccu_upload_contacts_event");
        A003.A02("action", "batch_upload_succeed");
        if (string != null) {
            A003.A02("family_device_id", string);
        }
        if (string2 != null) {
            A003.A02("ccu_session_id", string2);
        }
        A003.A00();
    }

    public final void Awz(Bundle bundle) {
        C26818Bt3 A002 = this.A00.A00("ccu_contacts_upload_succeeded_event");
        A002.A00.A0A("full_upload", Boolean.valueOf(bundle.getBoolean("full_upload")));
        A002.A01("last_upload_success_time", Long.valueOf(bundle.getLong("last_upload_success_time")));
        A002.A01("time_spent", Long.valueOf(bundle.getLong("time_spent")));
        A002.A01("num_of_retries", Integer.valueOf(bundle.getInt("num_of_retries")));
        A002.A02("ccu_session_id", bundle.getString("ccu_session_id"));
        A002.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C26818Bt3 A003 = this.A00.A00("ccu_upload_contacts_event");
        if (string2 != null) {
            A003.A02("ccu_session_id", string2);
        }
        A003.A02("action", "close_session_success");
        if (string != null) {
            A003.A02("family_device_id", string);
        }
        A003.A00();
    }

    public final void Ayg(Bundle bundle) {
        C26818Bt3 A002 = this.A00.A00("ccu_create_session_check_sync_event");
        A002.A00.A0A("in_sync", Boolean.valueOf(bundle.getBoolean("in_sync")));
        A002.A02("root_hash", bundle.getString("root_hash"));
        A002.A01("last_upload_success_time", Long.valueOf(bundle.getLong("last_upload_success_time")));
        A002.A01("time_spent", Long.valueOf(bundle.getLong("time_spent")));
        A002.A01("num_of_retries", Integer.valueOf(bundle.getInt("num_of_retries")));
        A002.A02("ccu_session_id", bundle.getString("ccu_session_id"));
        A002.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C26818Bt3 A003 = this.A00.A00("ccu_upload_contacts_event");
        if (string2 != null) {
            A003.A02("ccu_session_id", string2);
        }
        A003.A02("action", "create_session_success");
        if (string != null) {
            A003.A02("family_device_id", string);
        }
        A003.A00();
    }

    public final void BF7(Bundle bundle) {
        C26818Bt3 A002 = this.A00.A00("ccu_contacts_upload_information_event");
        A002.A02("upload_step", "batch_upload");
        A002.A00.A0A("full_upload", Boolean.valueOf(bundle.getBoolean("full_upload")));
        A002.A01("batch_index", Integer.valueOf(bundle.getInt("batch_index")));
        A002.A01("batch_size", Integer.valueOf(bundle.getInt("batch_size")));
        A002.A01("contacts_upload_count", Integer.valueOf(bundle.getInt("contacts_upload_count")));
        A002.A01("add_count", Integer.valueOf(bundle.getInt("add_count")));
        A002.A01("remove_count", Integer.valueOf(bundle.getInt("remove_count")));
        A002.A01("update_count", Integer.valueOf(bundle.getInt("update_count")));
        A002.A01("time_spent", Long.valueOf(bundle.getLong("time_spent")));
        A002.A01("num_of_retries", Integer.valueOf(bundle.getInt("num_of_retries")));
        A002.A02("ccu_session_id", bundle.getString("ccu_session_id"));
        A002.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C26818Bt3 A003 = this.A00.A00("ccu_upload_contacts_event");
        A003.A02("action", "batch_upload_start");
        if (string != null) {
            A003.A02("family_device_id", string);
        }
        if (string2 != null) {
            A003.A02("ccu_session_id", string2);
        }
        A003.A00();
    }

    public final void BF8(Bundle bundle) {
        C26818Bt3 A002 = this.A00.A00("ccu_contacts_upload_information_event");
        A002.A02("upload_step", "close_session");
        A002.A00.A0A("full_upload", Boolean.valueOf(bundle.getBoolean("full_upload")));
        A002.A01("total_batch_count", Integer.valueOf(bundle.getInt("total_batch_count")));
        A002.A01("contacts_upload_count", Integer.valueOf(bundle.getInt("contacts_upload_count")));
        A002.A01("add_count", Integer.valueOf(bundle.getInt("add_count")));
        A002.A01("remove_count", Integer.valueOf(bundle.getInt("remove_count")));
        A002.A01("update_count", Integer.valueOf(bundle.getInt("update_count")));
        A002.A01("phonebook_size", Integer.valueOf(bundle.getInt("phonebook_size")));
        A002.A01("max_contacts_to_upload", Long.valueOf(bundle.getLong("max_contacts_to_upload")));
        A002.A01("time_spent", Long.valueOf(bundle.getLong("time_spent")));
        A002.A01("num_of_retries", Integer.valueOf(bundle.getInt("num_of_retries")));
        A002.A02("ccu_session_id", bundle.getString("ccu_session_id"));
        A002.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C26818Bt3 A003 = this.A00.A00("ccu_upload_contacts_event");
        A003.A02("action", "close_session_start");
        if (string != null) {
            A003.A02("family_device_id", string);
        }
        if (string2 != null) {
            A003.A02("ccu_session_id", string2);
        }
        A003.A00();
    }

    public final void BF9(Bundle bundle) {
        String string = bundle.getString("family_device_id");
        C26818Bt3 A002 = this.A00.A00("ccu_upload_contacts_event");
        A002.A02("action", "pre_ccu_check");
        if (string != null) {
            A002.A02("family_device_id", string);
        }
        A002.A00();
    }

    public final void BOh(Bundle bundle) {
        C26818Bt3 A002 = this.A00.A00("ccu_contacts_upload_information_event");
        A002.A02("upload_step", "create_session");
        A002.A00.A0A("full_upload", Boolean.valueOf(bundle.getBoolean("full_upload")));
        A002.A02("source", bundle.getString("source"));
        A002.A01("batch_size", Integer.valueOf(bundle.getInt("batch_size")));
        A002.A01("num_of_retries", Integer.valueOf(bundle.getInt("num_of_retries")));
        A002.A01("contacts_upload_count", Integer.valueOf(bundle.getInt("contacts_upload_count")));
        A002.A01("time_spent", Long.valueOf(bundle.getLong("time_spent")));
        A002.A00();
        String string = bundle.getString("family_device_id");
        C26818Bt3 A003 = this.A00.A00("ccu_upload_contacts_event");
        A003.A02("action", "create_session_start");
        if (string != null) {
            A003.A02("family_device_id", string);
        }
        A003.A00();
    }

    public final void BTd(Bundle bundle) {
        C26818Bt3 A002 = this.A00.A00("ccu_contacts_upload_failed_event");
        A002.A02("failure_reason", bundle.getString("failure_reason"));
        A002.A00();
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("failure_reason");
        C26818Bt3 A003 = this.A00.A00("ccu_upload_contacts_event");
        A003.A02("action", "pre_ccu_check_failed");
        if (string != null) {
            A003.A02("family_device_id", string);
        }
        if (string2 != null) {
            A003.A02("failure_reason", string2);
        }
        A003.A00();
    }

    public DMV(C30013DMp dMp) {
        this.A00 = dMp;
    }

    public final void At6(Bundle bundle) {
        A00(bundle);
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C26818Bt3 A002 = this.A00.A00("ccu_upload_contacts_event");
        A002.A02("action", "batch_upload_failure");
        if (string != null) {
            A002.A02("family_device_id", string);
        }
        if (string2 != null) {
            A002.A02("ccu_session_id", string2);
        }
        A002.A00();
    }

    public final void Awy(Bundle bundle) {
        A00(bundle);
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        C26818Bt3 A002 = this.A00.A00("ccu_upload_contacts_event");
        A002.A02("action", "close_session_failure");
        if (string != null) {
            A002.A02("family_device_id", string);
        }
        if (string2 != null) {
            A002.A02("ccu_session_id", string2);
        }
        A002.A00();
    }

    public final void Ayf(Bundle bundle) {
        A00(bundle);
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("failure_reason");
        String string3 = bundle.getString("ccu_session_id");
        C26818Bt3 A002 = this.A00.A00("ccu_upload_contacts_event");
        A002.A02("action", "create_session_failure");
        if (string2 != null) {
            A002.A02("failure_reason", string2);
        }
        if (string != null) {
            A002.A02("family_device_id", string);
        }
        if (string3 != null) {
            A002.A02("ccu_session_id", string3);
        }
        A002.A00();
    }
}
