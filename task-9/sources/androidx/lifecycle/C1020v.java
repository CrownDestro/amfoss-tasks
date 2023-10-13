package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C0988f;
import p041f3.C1920g;
import p041f3.C1924k;

/* renamed from: androidx.lifecycle.v */
public class C1020v extends Fragment {

    /* renamed from: e */
    public static final C1022b f3454e = new C1022b((C1920g) null);

    /* renamed from: d */
    private C1021a f3455d;

    /* renamed from: androidx.lifecycle.v$a */
    public interface C1021a {
        /* renamed from: a */
        void mo3802a();

        /* renamed from: b */
        void mo3803b();

        /* renamed from: c */
        void mo3804c();
    }

    /* renamed from: androidx.lifecycle.v$b */
    public static final class C1022b {
        private C1022b() {
        }

        public /* synthetic */ C1022b(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo3815a(Activity activity, C0988f.C0989a aVar) {
            C1924k.m9141g(activity, "activity");
            C1924k.m9141g(aVar, "event");
            if (activity instanceof C1009o) {
                ((C1009o) activity).mo102a().mo3787i(aVar);
            } else if (activity instanceof C1005m) {
                C0988f a = ((C1005m) activity).mo102a();
                if (a instanceof C1006n) {
                    ((C1006n) a).mo3787i(aVar);
                }
            }
        }

        /* renamed from: b */
        public final C1020v mo3816b(Activity activity) {
            C1924k.m9141g(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            C1924k.m9139e(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (C1020v) findFragmentByTag;
        }

        /* renamed from: c */
        public final void mo3817c(Activity activity) {
            C1924k.m9141g(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                C1023c.Companion.mo3831a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new C1020v(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* renamed from: androidx.lifecycle.v$c */
    public static final class C1023c implements Application.ActivityLifecycleCallbacks {
        public static final C1024a Companion = new C1024a((C1920g) null);

        /* renamed from: androidx.lifecycle.v$c$a */
        public static final class C1024a {
            private C1024a() {
            }

            public /* synthetic */ C1024a(C1920g gVar) {
                this();
            }

            /* renamed from: a */
            public final void mo3831a(Activity activity) {
                C1924k.m9141g(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new C1023c());
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.mo3831a(activity);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C1924k.m9141g(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            C1924k.m9141g(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            C1924k.m9141g(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C1924k.m9141g(activity, "activity");
            C1020v.f3454e.mo3815a(activity, C0988f.C0989a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C1924k.m9141g(activity, "activity");
            C1020v.f3454e.mo3815a(activity, C0988f.C0989a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C1924k.m9141g(activity, "activity");
            C1020v.f3454e.mo3815a(activity, C0988f.C0989a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C1924k.m9141g(activity, "activity");
            C1020v.f3454e.mo3815a(activity, C0988f.C0989a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C1924k.m9141g(activity, "activity");
            C1020v.f3454e.mo3815a(activity, C0988f.C0989a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C1924k.m9141g(activity, "activity");
            C1020v.f3454e.mo3815a(activity, C0988f.C0989a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            C1924k.m9141g(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C1924k.m9141g(activity, "activity");
            C1924k.m9141g(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            C1924k.m9141g(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            C1924k.m9141g(activity, "activity");
        }
    }

    /* renamed from: a */
    private final void m4514a(C0988f.C0989a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            C1022b bVar = f3454e;
            Activity activity = getActivity();
            C1924k.m9140f(activity, "activity");
            bVar.mo3815a(activity, aVar);
        }
    }

    /* renamed from: b */
    private final void m4515b(C1021a aVar) {
        if (aVar != null) {
            aVar.mo3803b();
        }
    }

    /* renamed from: c */
    private final void m4516c(C1021a aVar) {
        if (aVar != null) {
            aVar.mo3802a();
        }
    }

    /* renamed from: d */
    private final void m4517d(C1021a aVar) {
        if (aVar != null) {
            aVar.mo3804c();
        }
    }

    /* renamed from: e */
    public static final C1020v m4518e(Activity activity) {
        return f3454e.mo3816b(activity);
    }

    /* renamed from: f */
    public static final void m4519f(Activity activity) {
        f3454e.mo3817c(activity);
    }

    /* renamed from: g */
    public final void mo3808g(C1021a aVar) {
        this.f3455d = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m4515b(this.f3455d);
        m4514a(C0988f.C0989a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m4514a(C0988f.C0989a.ON_DESTROY);
        this.f3455d = null;
    }

    public void onPause() {
        super.onPause();
        m4514a(C0988f.C0989a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m4516c(this.f3455d);
        m4514a(C0988f.C0989a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m4517d(this.f3455d);
        m4514a(C0988f.C0989a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m4514a(C0988f.C0989a.ON_STOP);
    }
}
