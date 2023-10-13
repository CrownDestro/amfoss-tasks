package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.i */
class C0999i {

    /* renamed from: a */
    private static AtomicBoolean f3427a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.i$a */
    static class C1000a extends C0973c {
        C1000a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C1020v.m4519f(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m4468a(Context context) {
        if (!f3427a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1000a());
        }
    }
}
