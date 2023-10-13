package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C0735z;
import androidx.fragment.app.C0914l0;
import androidx.lifecycle.C0996g0;
import p010b0.C1250b;
import p017c0.C1283d;

/* renamed from: androidx.fragment.app.d0 */
class C0880d0 {

    /* renamed from: a */
    private final C0930q f3105a;

    /* renamed from: b */
    private final C0889e0 f3106b;

    /* renamed from: c */
    private final Fragment f3107c;

    /* renamed from: d */
    private boolean f3108d = false;

    /* renamed from: e */
    private int f3109e = -1;

    /* renamed from: androidx.fragment.app.d0$a */
    class C0881a implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        final /* synthetic */ View f3110d;

        C0881a(View view) {
            this.f3110d = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f3110d.removeOnAttachStateChangeListener(this);
            C0735z.m3222o0(this.f3110d);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.d0$b */
    static /* synthetic */ class C0882b {

        /* renamed from: a */
        static final /* synthetic */ int[] f3112a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.f$b[] r0 = androidx.lifecycle.C0988f.C0993b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3112a = r0
                androidx.lifecycle.f$b r1 = androidx.lifecycle.C0988f.C0993b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3112a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.C0988f.C0993b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3112a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.C0988f.C0993b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3112a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.C0988f.C0993b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0880d0.C0882b.<clinit>():void");
        }
    }

    C0880d0(C0930q qVar, C0889e0 e0Var, Fragment fragment) {
        this.f3105a = qVar;
        this.f3106b = e0Var;
        this.f3107c = fragment;
    }

    C0880d0(C0930q qVar, C0889e0 e0Var, Fragment fragment, C0863c0 c0Var) {
        this.f3105a = qVar;
        this.f3106b = e0Var;
        this.f3107c = fragment;
        fragment.f2969f = null;
        fragment.f2970g = null;
        fragment.f2985v = 0;
        fragment.f2982s = false;
        fragment.f2978o = false;
        Fragment fragment2 = fragment.f2974k;
        fragment.f2975l = fragment2 != null ? fragment2.f2972i : null;
        fragment.f2974k = null;
        Bundle bundle = c0Var.f3058p;
        fragment.f2968e = bundle == null ? new Bundle() : bundle;
    }

    C0880d0(C0930q qVar, C0889e0 e0Var, ClassLoader classLoader, C0925n nVar, C0863c0 c0Var) {
        this.f3105a = qVar;
        this.f3106b = e0Var;
        Fragment a = c0Var.mo3380a(nVar, classLoader);
        this.f3107c = a;
        if (C0937w.m4207H0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    /* renamed from: l */
    private boolean m3931l(View view) {
        if (view == this.f3107c.f2948L) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3107c.f2948L) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m3932q() {
        Bundle bundle = new Bundle();
        this.f3107c.mo3262e1(bundle);
        this.f3105a.mo3610j(this.f3107c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3107c.f2948L != null) {
            mo3429s();
        }
        if (this.f3107c.f2969f != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3107c.f2969f);
        }
        if (this.f3107c.f2970g != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3107c.f2970g);
        }
        if (!this.f3107c.f2950N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3107c.f2950N);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3413a() {
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3107c);
        }
        Fragment fragment = this.f3107c;
        fragment.mo3222K0(fragment.f2968e);
        C0930q qVar = this.f3105a;
        Fragment fragment2 = this.f3107c;
        qVar.mo3601a(fragment2, fragment2.f2968e, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3414b() {
        int j = this.f3106b.mo3461j(this.f3107c);
        Fragment fragment = this.f3107c;
        fragment.f2947K.addView(fragment.f2948L, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3415c() {
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3107c);
        }
        Fragment fragment = this.f3107c;
        Fragment fragment2 = fragment.f2974k;
        C0880d0 d0Var = null;
        if (fragment2 != null) {
            C0880d0 n = this.f3106b.mo3465n(fragment2.f2972i);
            if (n != null) {
                Fragment fragment3 = this.f3107c;
                fragment3.f2975l = fragment3.f2974k.f2972i;
                fragment3.f2974k = null;
                d0Var = n;
            } else {
                throw new IllegalStateException("Fragment " + this.f3107c + " declared target fragment " + this.f3107c.f2974k + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f2975l;
            if (str != null && (d0Var = this.f3106b.mo3465n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3107c + " declared target fragment " + this.f3107c.f2975l + " that does not belong to this FragmentManager!");
            }
        }
        if (d0Var != null) {
            d0Var.mo3424m();
        }
        Fragment fragment4 = this.f3107c;
        fragment4.f2987x = fragment4.f2986w.mo3684u0();
        Fragment fragment5 = this.f3107c;
        fragment5.f2989z = fragment5.f2986w.mo3689x0();
        this.f3105a.mo3607g(this.f3107c, false);
        this.f3107c.mo3224L0();
        this.f3105a.mo3602b(this.f3107c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo3416d() {
        Fragment fragment = this.f3107c;
        if (fragment.f2986w == null) {
            return fragment.f2966d;
        }
        int i = this.f3109e;
        int i2 = C0882b.f3112a[fragment.f2957U.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(i, -1) : Math.min(i, 0) : Math.min(i, 1) : Math.min(i, 5);
        }
        Fragment fragment2 = this.f3107c;
        if (fragment2.f2981r) {
            if (fragment2.f2982s) {
                i = Math.max(this.f3109e, 2);
                View view = this.f3107c.f2948L;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f3109e < 4 ? Math.min(i, fragment2.f2966d) : Math.min(i, 1);
            }
        }
        if (!this.f3107c.f2978o) {
            i = Math.min(i, 1);
        }
        C0914l0.C0919e.C0921b bVar = null;
        Fragment fragment3 = this.f3107c;
        ViewGroup viewGroup = fragment3.f2947K;
        if (viewGroup != null) {
            bVar = C0914l0.m4130n(viewGroup, fragment3.mo3207D()).mo3559l(this);
        }
        if (bVar == C0914l0.C0919e.C0921b.ADDING) {
            i = Math.min(i, 6);
        } else if (bVar == C0914l0.C0919e.C0921b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f3107c;
            if (fragment4.f2979p) {
                i = fragment4.mo3246Y() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        Fragment fragment5 = this.f3107c;
        if (fragment5.f2949M && fragment5.f2966d < 5) {
            i = Math.min(i, 4);
        }
        if (C0937w.m4207H0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.f3107c);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3417e() {
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3107c);
        }
        Fragment fragment = this.f3107c;
        if (!fragment.f2955S) {
            this.f3105a.mo3608h(fragment, fragment.f2968e, false);
            Fragment fragment2 = this.f3107c;
            fragment2.mo3230O0(fragment2.f2968e);
            C0930q qVar = this.f3105a;
            Fragment fragment3 = this.f3107c;
            qVar.mo3603c(fragment3, fragment3.f2968e, false);
            return;
        }
        fragment.mo3284m1(fragment.f2968e);
        this.f3107c.f2966d = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3418f() {
        String str;
        if (!this.f3107c.f2981r) {
            if (C0937w.m4207H0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3107c);
            }
            Fragment fragment = this.f3107c;
            LayoutInflater U0 = fragment.mo3240U0(fragment.f2968e);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f3107c;
            ViewGroup viewGroup2 = fragment2.f2947K;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment2.f2938B;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fragment2.f2986w.mo3679q0().mo3327h(this.f3107c.f2938B);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f3107c;
                            if (!fragment3.f2983t) {
                                try {
                                    str = fragment3.mo3219J().getResourceName(this.f3107c.f2938B);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3107c.f2938B) + " (" + str + ") for fragment " + this.f3107c);
                            }
                        } else if (!(viewGroup instanceof FragmentContainerView)) {
                            C1283d.m6160k(this.f3107c, viewGroup);
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f3107c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.f3107c;
            fragment4.f2947K = viewGroup;
            fragment4.mo3233Q0(U0, viewGroup, fragment4.f2968e);
            View view = this.f3107c.f2948L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f3107c;
                fragment5.f2948L.setTag(C1250b.fragment_container_view_tag, fragment5);
                if (viewGroup != null) {
                    mo3414b();
                }
                Fragment fragment6 = this.f3107c;
                if (fragment6.f2940D) {
                    fragment6.f2948L.setVisibility(8);
                }
                if (C0735z.m3187U(this.f3107c.f2948L)) {
                    C0735z.m3222o0(this.f3107c.f2948L);
                } else {
                    View view2 = this.f3107c.f2948L;
                    view2.addOnAttachStateChangeListener(new C0881a(view2));
                }
                this.f3107c.mo3271h1();
                C0930q qVar = this.f3105a;
                Fragment fragment7 = this.f3107c;
                qVar.mo3613m(fragment7, fragment7.f2948L, fragment7.f2968e, false);
                int visibility = this.f3107c.f2948L.getVisibility();
                this.f3107c.mo3310u1(this.f3107c.f2948L.getAlpha());
                Fragment fragment8 = this.f3107c;
                if (fragment8.f2947K != null && visibility == 0) {
                    View findFocus = fragment8.f2948L.findFocus();
                    if (findFocus != null) {
                        this.f3107c.mo3300r1(findFocus);
                        if (C0937w.m4207H0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f3107c);
                        }
                    }
                    this.f3107c.f2948L.setAlpha(0.0f);
                }
            }
            this.f3107c.f2966d = 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3419g() {
        Fragment f;
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3107c);
        }
        Fragment fragment = this.f3107c;
        boolean z = true;
        boolean z2 = fragment.f2979p && !fragment.mo3246Y();
        if (z2) {
            Fragment fragment2 = this.f3107c;
            if (!fragment2.f2980q) {
                this.f3106b.mo3451B(fragment2.f2972i, (C0863c0) null);
            }
        }
        if (z2 || this.f3106b.mo3467p().mo3726q(this.f3107c)) {
            C0927o<?> oVar = this.f3107c.f2987x;
            if (oVar instanceof C0996g0) {
                z = this.f3106b.mo3467p().mo3723n();
            } else if (oVar.mo3595p() instanceof Activity) {
                z = true ^ ((Activity) oVar.mo3595p()).isChangingConfigurations();
            }
            if ((z2 && !this.f3107c.f2980q) || z) {
                this.f3106b.mo3467p().mo3716f(this.f3107c);
            }
            this.f3107c.mo3235R0();
            this.f3105a.mo3604d(this.f3107c, false);
            for (C0880d0 next : this.f3106b.mo3462k()) {
                if (next != null) {
                    Fragment k = next.mo3423k();
                    if (this.f3107c.f2972i.equals(k.f2975l)) {
                        k.f2974k = this.f3107c;
                        k.f2975l = null;
                    }
                }
            }
            Fragment fragment3 = this.f3107c;
            String str = fragment3.f2975l;
            if (str != null) {
                fragment3.f2974k = this.f3106b.mo3457f(str);
            }
            this.f3106b.mo3470s(this);
            return;
        }
        String str2 = this.f3107c.f2975l;
        if (!(str2 == null || (f = this.f3106b.mo3457f(str2)) == null || !f.f2942F)) {
            this.f3107c.f2974k = f;
        }
        this.f3107c.f2966d = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3420h() {
        View view;
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3107c);
        }
        Fragment fragment = this.f3107c;
        ViewGroup viewGroup = fragment.f2947K;
        if (!(viewGroup == null || (view = fragment.f2948L) == null)) {
            viewGroup.removeView(view);
        }
        this.f3107c.mo3237S0();
        this.f3105a.mo3614n(this.f3107c, false);
        Fragment fragment2 = this.f3107c;
        fragment2.f2947K = null;
        fragment2.f2948L = null;
        fragment2.f2959W = null;
        fragment2.f2960X.mo3744i(null);
        this.f3107c.f2982s = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3421i() {
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3107c);
        }
        this.f3107c.mo3238T0();
        boolean z = false;
        this.f3105a.mo3605e(this.f3107c, false);
        Fragment fragment = this.f3107c;
        fragment.f2966d = -1;
        fragment.f2987x = null;
        fragment.f2989z = null;
        fragment.f2986w = null;
        if (fragment.f2979p && !fragment.mo3246Y()) {
            z = true;
        }
        if (z || this.f3106b.mo3467p().mo3726q(this.f3107c)) {
            if (C0937w.m4207H0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3107c);
            }
            this.f3107c.mo3239U();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3422j() {
        Fragment fragment = this.f3107c;
        if (fragment.f2981r && fragment.f2982s && !fragment.f2984u) {
            if (C0937w.m4207H0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3107c);
            }
            Fragment fragment2 = this.f3107c;
            fragment2.mo3233Q0(fragment2.mo3240U0(fragment2.f2968e), (ViewGroup) null, this.f3107c.f2968e);
            View view = this.f3107c.f2948L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3107c;
                fragment3.f2948L.setTag(C1250b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f3107c;
                if (fragment4.f2940D) {
                    fragment4.f2948L.setVisibility(8);
                }
                this.f3107c.mo3271h1();
                C0930q qVar = this.f3105a;
                Fragment fragment5 = this.f3107c;
                qVar.mo3613m(fragment5, fragment5.f2948L, fragment5.f2968e, false);
                this.f3107c.f2966d = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Fragment mo3423k() {
        return this.f3107c;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3424m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f3108d) {
            try {
                this.f3108d = true;
                boolean z = false;
                while (true) {
                    int d = mo3416d();
                    Fragment fragment = this.f3107c;
                    int i = fragment.f2966d;
                    if (d != i) {
                        if (d <= i) {
                            switch (i - 1) {
                                case -1:
                                    mo3421i();
                                    break;
                                case 0:
                                    if (fragment.f2980q && this.f3106b.mo3468q(fragment.f2972i) == null) {
                                        mo3428r();
                                    }
                                    mo3419g();
                                    break;
                                case 1:
                                    mo3420h();
                                    this.f3107c.f2966d = 1;
                                    break;
                                case 2:
                                    fragment.f2982s = false;
                                    fragment.f2966d = 2;
                                    break;
                                case 3:
                                    if (C0937w.m4207H0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3107c);
                                    }
                                    Fragment fragment2 = this.f3107c;
                                    if (fragment2.f2980q) {
                                        mo3428r();
                                    } else if (fragment2.f2948L != null && fragment2.f2969f == null) {
                                        mo3429s();
                                    }
                                    Fragment fragment3 = this.f3107c;
                                    if (!(fragment3.f2948L == null || (viewGroup2 = fragment3.f2947K) == null)) {
                                        C0914l0.m4130n(viewGroup2, fragment3.mo3207D()).mo3554d(this);
                                    }
                                    this.f3107c.f2966d = 3;
                                    break;
                                case 4:
                                    mo3432v();
                                    break;
                                case 5:
                                    fragment.f2966d = 5;
                                    break;
                                case 6:
                                    mo3425n();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    mo3415c();
                                    break;
                                case 1:
                                    mo3417e();
                                    break;
                                case 2:
                                    mo3422j();
                                    mo3418f();
                                    break;
                                case 3:
                                    mo3413a();
                                    break;
                                case 4:
                                    if (!(fragment.f2948L == null || (viewGroup3 = fragment.f2947K) == null)) {
                                        C0914l0.m4130n(viewGroup3, fragment.mo3207D()).mo3552b(C0914l0.C0919e.C0922c.m4160b(this.f3107c.f2948L.getVisibility()), this);
                                    }
                                    this.f3107c.f2966d = 4;
                                    break;
                                case 5:
                                    mo3431u();
                                    break;
                                case 6:
                                    fragment.f2966d = 6;
                                    break;
                                case 7:
                                    mo3427p();
                                    break;
                            }
                        }
                        z = true;
                    } else {
                        if (!z && i == -1 && fragment.f2979p && !fragment.mo3246Y() && !this.f3107c.f2980q) {
                            if (C0937w.m4207H0(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f3107c);
                            }
                            this.f3106b.mo3467p().mo3716f(this.f3107c);
                            this.f3106b.mo3470s(this);
                            if (C0937w.m4207H0(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + this.f3107c);
                            }
                            this.f3107c.mo3239U();
                        }
                        Fragment fragment4 = this.f3107c;
                        if (fragment4.f2953Q) {
                            if (!(fragment4.f2948L == null || (viewGroup = fragment4.f2947K) == null)) {
                                C0914l0 n = C0914l0.m4130n(viewGroup, fragment4.mo3207D());
                                if (this.f3107c.f2940D) {
                                    n.mo3553c(this);
                                } else {
                                    n.mo3555e(this);
                                }
                            }
                            Fragment fragment5 = this.f3107c;
                            C0937w wVar = fragment5.f2986w;
                            if (wVar != null) {
                                wVar.mo3625F0(fragment5);
                            }
                            Fragment fragment6 = this.f3107c;
                            fragment6.f2953Q = false;
                            fragment6.mo3305t0(fragment6.f2940D);
                            this.f3107c.f2988y.mo3630J();
                        }
                        this.f3108d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f3108d = false;
                throw th;
            }
        } else if (C0937w.m4207H0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + mo3423k());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3425n() {
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3107c);
        }
        this.f3107c.mo3249Z0();
        this.f3105a.mo3606f(this.f3107c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3426o(ClassLoader classLoader) {
        Bundle bundle = this.f3107c.f2968e;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f3107c;
            fragment.f2969f = fragment.f2968e.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f3107c;
            fragment2.f2970g = fragment2.f2968e.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f3107c;
            fragment3.f2975l = fragment3.f2968e.getString("android:target_state");
            Fragment fragment4 = this.f3107c;
            if (fragment4.f2975l != null) {
                fragment4.f2976m = fragment4.f2968e.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f3107c;
            Boolean bool = fragment5.f2971h;
            if (bool != null) {
                fragment5.f2950N = bool.booleanValue();
                this.f3107c.f2971h = null;
            } else {
                fragment5.f2950N = fragment5.f2968e.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f3107c;
            if (!fragment6.f2950N) {
                fragment6.f2949M = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3427p() {
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3107c);
        }
        View x = this.f3107c.mo3317x();
        if (x != null && m3931l(x)) {
            boolean requestFocus = x.requestFocus();
            if (C0937w.m4207H0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(x);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f3107c);
                sb.append(" resulting in focused view ");
                sb.append(this.f3107c.f2948L.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f3107c.mo3300r1((View) null);
        this.f3107c.mo3259d1();
        this.f3105a.mo3609i(this.f3107c, false);
        Fragment fragment = this.f3107c;
        fragment.f2968e = null;
        fragment.f2969f = null;
        fragment.f2970g = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3428r() {
        C0863c0 c0Var = new C0863c0(this.f3107c);
        Fragment fragment = this.f3107c;
        if (fragment.f2966d <= -1 || c0Var.f3058p != null) {
            c0Var.f3058p = fragment.f2968e;
        } else {
            Bundle q = m3932q();
            c0Var.f3058p = q;
            if (this.f3107c.f2975l != null) {
                if (q == null) {
                    c0Var.f3058p = new Bundle();
                }
                c0Var.f3058p.putString("android:target_state", this.f3107c.f2975l);
                int i = this.f3107c.f2976m;
                if (i != 0) {
                    c0Var.f3058p.putInt("android:target_req_state", i);
                }
            }
        }
        this.f3106b.mo3451B(this.f3107c.f2972i, c0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3429s() {
        if (this.f3107c.f2948L != null) {
            if (C0937w.m4207H0(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + this.f3107c + " with view " + this.f3107c.f2948L);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3107c.f2948L.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3107c.f2969f = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f3107c.f2959W.mo3543g(bundle);
            if (!bundle.isEmpty()) {
                this.f3107c.f2970g = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3430t(int i) {
        this.f3109e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3431u() {
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3107c);
        }
        this.f3107c.mo3265f1();
        this.f3105a.mo3611k(this.f3107c, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3432v() {
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3107c);
        }
        this.f3107c.mo3268g1();
        this.f3105a.mo3612l(this.f3107c, false);
    }
}
