package androidx.lifecycle;

import android.content.Context;
import androidx.startup.C1162a;
import java.util.Collections;
import java.util.List;
import p071k0.C2350a;

public final class ProcessLifecycleInitializer implements C2350a<C1005m> {
    /* renamed from: a */
    public List<Class<? extends C2350a<?>>> mo3072a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public C1005m mo3073b(Context context) {
        if (C1162a.m5781e(context).mo4778g(ProcessLifecycleInitializer.class)) {
            C0999i.m4468a(context);
            C1015u.m4502j(context);
            return C1015u.m4501i();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
