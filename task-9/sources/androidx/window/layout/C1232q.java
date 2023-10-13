package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import p041f3.C1924k;
import p041f3.C1933t;
import p110q3.C3030b;

/* renamed from: androidx.window.layout.q */
public interface C1232q {

    /* renamed from: a */
    public static final C1233a f4259a = C1233a.f4260a;

    /* renamed from: androidx.window.layout.q$a */
    public static final class C1233a {

        /* renamed from: a */
        static final /* synthetic */ C1233a f4260a = new C1233a();

        /* renamed from: b */
        private static final boolean f4261b = false;

        /* renamed from: c */
        private static final String f4262c = C1933t.m9161b(C1232q.class).mo7656a();

        /* renamed from: d */
        private static C1234r f4263d = C1199f.f4207a;

        private C1233a() {
        }

        /* renamed from: a */
        public final C1232q mo5056a(Context context) {
            C1924k.m9141g(context, "context");
            return f4263d.mo5005a(new C1235s(C1243y.f4277a, mo5057b(context)));
        }

        /* renamed from: b */
        public final C1231p mo5057b(Context context) {
            C1924k.m9141g(context, "context");
            C1202h hVar = null;
            try {
                WindowLayoutComponent m = C1214l.f4233a.mo5026m();
                if (m != null) {
                    hVar = new C1202h(m);
                }
            } catch (Throwable unused) {
                if (f4261b) {
                    Log.d(f4262c, "Failed to load WindowExtensions");
                }
            }
            return hVar == null ? C1226n.f4247c.mo5047a(context) : hVar;
        }
    }

    /* renamed from: a */
    C3030b<C1240v> mo5055a(Activity activity);
}
