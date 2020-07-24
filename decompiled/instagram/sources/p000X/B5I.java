package p000X;

import android.os.Bundle;
import com.facebook.common.gcmcompat.Task;

/* renamed from: X.B5I */
public final class B5I {
    public final int A00;
    public final Task A01;
    public final String A02;

    public B5I(Bundle bundle) {
        String string = bundle.getString("job_tag", (String) null);
        if (string != null) {
            this.A02 = string;
            Task task = (Task) bundle.getParcelable("task");
            if (task != null) {
                int i = bundle.getInt("num_failures", -1);
                this.A00 = i;
                if (i > 0) {
                    this.A01 = task;
                    return;
                }
                throw new B5O(AnonymousClass000.A05("invalid num_failures: ", i));
            }
            throw new B5O("Missing task");
        }
        throw new B5O("Invalid job_tag: " + bundle.get("job_tag"));
    }

    public B5I(Task task, int i) {
        this.A02 = task.A01;
        this.A01 = task;
        this.A00 = i;
    }
}
