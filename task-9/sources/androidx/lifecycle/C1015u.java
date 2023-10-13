package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C1020v;

/* renamed from: androidx.lifecycle.u */
public class C1015u implements C1005m {

    /* renamed from: l */
    private static final C1015u f3443l = new C1015u();

    /* renamed from: d */
    private int f3444d = 0;

    /* renamed from: e */
    private int f3445e = 0;

    /* renamed from: f */
    private boolean f3446f = true;

    /* renamed from: g */
    private boolean f3447g = true;

    /* renamed from: h */
    private Handler f3448h;

    /* renamed from: i */
    private final C1006n f3449i = new C1006n(this);

    /* renamed from: j */
    private Runnable f3450j = new C1016a();

    /* renamed from: k */
    C1020v.C1021a f3451k = new C1017b();

    /* renamed from: androidx.lifecycle.u$a */
    class C1016a implements Runnable {
        C1016a() {
        }

        public void run() {
            C1015u.this.mo3799g();
            C1015u.this.mo3800h();
        }
    }

    /* renamed from: androidx.lifecycle.u$b */
    class C1017b implements C1020v.C1021a {
        C1017b() {
        }

        /* renamed from: a */
        public void mo3802a() {
            C1015u.this.mo3795c();
        }

        /* renamed from: b */
        public void mo3803b() {
        }

        /* renamed from: c */
        public void mo3804c() {
            C1015u.this.mo3796d();
        }
    }

    /* renamed from: androidx.lifecycle.u$c */
    class C1018c extends C0973c {

        /* renamed from: androidx.lifecycle.u$c$a */
        class C1019a extends C0973c {
            C1019a() {
            }

            public void onActivityPostResumed(Activity activity) {
                C1015u.this.mo3795c();
            }

            public void onActivityPostStarted(Activity activity) {
                C1015u.this.mo3796d();
            }
        }

        C1018c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                C1020v.m4518e(activity).mo3808g(C1015u.this.f3451k);
            }
        }

        public void onActivityPaused(Activity activity) {
            C1015u.this.mo3794b();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C1019a());
        }

        public void onActivityStopped(Activity activity) {
            C1015u.this.mo3797e();
        }
    }

    private C1015u() {
    }

    /* renamed from: i */
    public static C1005m m4501i() {
        return f3443l;
    }

    /* renamed from: j */
    static void m4502j(Context context) {
        f3443l.mo3798f(context);
    }

    /* renamed from: a */
    public C0988f mo102a() {
        return this.f3449i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3794b() {
        int i = this.f3445e - 1;
        this.f3445e = i;
        if (i == 0) {
            this.f3448h.postDelayed(this.f3450j, 700);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3795c() {
        int i = this.f3445e + 1;
        this.f3445e = i;
        if (i != 1) {
            return;
        }
        if (this.f3446f) {
            this.f3449i.mo3787i(C0988f.C0989a.ON_RESUME);
            this.f3446f = false;
            return;
        }
        this.f3448h.removeCallbacks(this.f3450j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3796d() {
        int i = this.f3444d + 1;
        this.f3444d = i;
        if (i == 1 && this.f3447g) {
            this.f3449i.mo3787i(C0988f.C0989a.ON_START);
            this.f3447g = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3797e() {
        this.f3444d--;
        mo3800h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3798f(Context context) {
        this.f3448h = new Handler();
        this.f3449i.mo3787i(C0988f.C0989a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1018c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3799g() {
        if (this.f3445e == 0) {
            this.f3446f = true;
            this.f3449i.mo3787i(C0988f.C0989a.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3800h() {
        if (this.f3444d == 0 && this.f3446f) {
            this.f3449i.mo3787i(C0988f.C0989a.ON_STOP);
            this.f3447g = true;
        }
    }
}
