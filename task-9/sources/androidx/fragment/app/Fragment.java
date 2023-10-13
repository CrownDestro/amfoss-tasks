package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.C0466l;
import androidx.core.view.C0675g;
import androidx.lifecycle.C0974c0;
import androidx.lifecycle.C0986e;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C0994f0;
import androidx.lifecycle.C0996g0;
import androidx.lifecycle.C0998h0;
import androidx.lifecycle.C1001i0;
import androidx.lifecycle.C1002j;
import androidx.lifecycle.C1005m;
import androidx.lifecycle.C1006n;
import androidx.lifecycle.C1012r;
import androidx.lifecycle.C1028y;
import androidx.lifecycle.LiveData;
import androidx.loader.app.C1035a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p017c0.C1283d;
import p038f0.C1899a;
import p038f0.C1904d;
import p065j0.C2312c;
import p065j0.C2316d;
import p065j0.C2318e;
import p065j0.C2319f;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C1005m, C0996g0, C0986e, C2318e {

    /* renamed from: e0 */
    static final Object f2936e0 = new Object();

    /* renamed from: A */
    int f2937A;

    /* renamed from: B */
    int f2938B;

    /* renamed from: C */
    String f2939C;

    /* renamed from: D */
    boolean f2940D;

    /* renamed from: E */
    boolean f2941E;

    /* renamed from: F */
    boolean f2942F;

    /* renamed from: G */
    boolean f2943G;

    /* renamed from: H */
    boolean f2944H;

    /* renamed from: I */
    boolean f2945I = true;

    /* renamed from: J */
    private boolean f2946J;

    /* renamed from: K */
    ViewGroup f2947K;

    /* renamed from: L */
    View f2948L;

    /* renamed from: M */
    boolean f2949M;

    /* renamed from: N */
    boolean f2950N = true;

    /* renamed from: O */
    C0851f f2951O;

    /* renamed from: P */
    Runnable f2952P = new C0846a();

    /* renamed from: Q */
    boolean f2953Q;

    /* renamed from: R */
    LayoutInflater f2954R;

    /* renamed from: S */
    boolean f2955S;

    /* renamed from: T */
    public String f2956T;

    /* renamed from: U */
    C0988f.C0993b f2957U = C0988f.C0993b.RESUMED;

    /* renamed from: V */
    C1006n f2958V;

    /* renamed from: W */
    C0908j0 f2959W;

    /* renamed from: X */
    C1012r<C1005m> f2960X = new C1012r<>();

    /* renamed from: Y */
    C0974c0.C0978b f2961Y;

    /* renamed from: Z */
    C2316d f2962Z;

    /* renamed from: a0 */
    private int f2963a0;

    /* renamed from: b0 */
    private final AtomicInteger f2964b0 = new AtomicInteger();

    /* renamed from: c0 */
    private final ArrayList<C0854i> f2965c0 = new ArrayList<>();

    /* renamed from: d */
    int f2966d = -1;

    /* renamed from: d0 */
    private final C0854i f2967d0 = new C0847b();

    /* renamed from: e */
    Bundle f2968e;

    /* renamed from: f */
    SparseArray<Parcelable> f2969f;

    /* renamed from: g */
    Bundle f2970g;

    /* renamed from: h */
    Boolean f2971h;

    /* renamed from: i */
    String f2972i = UUID.randomUUID().toString();

    /* renamed from: j */
    Bundle f2973j;

    /* renamed from: k */
    Fragment f2974k;

    /* renamed from: l */
    String f2975l = null;

    /* renamed from: m */
    int f2976m;

    /* renamed from: n */
    private Boolean f2977n = null;

    /* renamed from: o */
    boolean f2978o;

    /* renamed from: p */
    boolean f2979p;

    /* renamed from: q */
    boolean f2980q;

    /* renamed from: r */
    boolean f2981r;

    /* renamed from: s */
    boolean f2982s;

    /* renamed from: t */
    boolean f2983t;

    /* renamed from: u */
    boolean f2984u;

    /* renamed from: v */
    int f2985v;

    /* renamed from: w */
    C0937w f2986w;

    /* renamed from: x */
    C0927o<?> f2987x;

    /* renamed from: y */
    C0937w f2988y = new C0953x();

    /* renamed from: z */
    Fragment f2989z;

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C0846a implements Runnable {
        C0846a() {
        }

        public void run() {
            Fragment.this.mo3316w1();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C0847b extends C0854i {
        C0847b() {
            super((C0846a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3324a() {
            Fragment.this.f2962Z.mo8634c();
            C1028y.m4535a(Fragment.this);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class C0848c implements Runnable {
        C0848c() {
        }

        public void run() {
            Fragment.this.mo3254c(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    class C0849d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0914l0 f2994d;

        C0849d(C0914l0 l0Var) {
            this.f2994d = l0Var;
        }

        public void run() {
            this.f2994d.mo3556g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    class C0850e extends C0913l {
        C0850e() {
        }

        /* renamed from: h */
        public View mo3327h(int i) {
            View view = Fragment.this.f2948L;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        /* renamed from: j */
        public boolean mo3328j() {
            return Fragment.this.f2948L != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    static class C0851f {

        /* renamed from: a */
        View f2997a;

        /* renamed from: b */
        boolean f2998b;

        /* renamed from: c */
        int f2999c;

        /* renamed from: d */
        int f3000d;

        /* renamed from: e */
        int f3001e;

        /* renamed from: f */
        int f3002f;

        /* renamed from: g */
        int f3003g;

        /* renamed from: h */
        ArrayList<String> f3004h;

        /* renamed from: i */
        ArrayList<String> f3005i;

        /* renamed from: j */
        Object f3006j = null;

        /* renamed from: k */
        Object f3007k;

        /* renamed from: l */
        Object f3008l;

        /* renamed from: m */
        Object f3009m;

        /* renamed from: n */
        Object f3010n;

        /* renamed from: o */
        Object f3011o;

        /* renamed from: p */
        Boolean f3012p;

        /* renamed from: q */
        Boolean f3013q;

        /* renamed from: r */
        float f3014r;

        /* renamed from: s */
        View f3015s;

        /* renamed from: t */
        boolean f3016t;

        C0851f() {
            Object obj = Fragment.f2936e0;
            this.f3007k = obj;
            this.f3008l = null;
            this.f3009m = obj;
            this.f3010n = null;
            this.f3011o = obj;
            this.f3014r = 1.0f;
            this.f3015s = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    static class C0852g {
        /* renamed from: a */
        static void m3877a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    public static class C0853h extends RuntimeException {
        public C0853h(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    private static abstract class C0854i {
        private C0854i() {
        }

        /* synthetic */ C0854i(C0846a aVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo3324a();
    }

    public Fragment() {
        m3749T();
    }

    /* renamed from: A */
    private int m3747A() {
        C0988f.C0993b bVar = this.f2957U;
        return (bVar == C0988f.C0993b.INITIALIZED || this.f2989z == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f2989z.m3747A());
    }

    /* renamed from: Q */
    private Fragment m3748Q(boolean z) {
        String str;
        if (z) {
            C1283d.m6159j(this);
        }
        Fragment fragment = this.f2974k;
        if (fragment != null) {
            return fragment;
        }
        C0937w wVar = this.f2986w;
        if (wVar == null || (str = this.f2975l) == null) {
            return null;
        }
        return wVar.mo3659f0(str);
    }

    /* renamed from: T */
    private void m3749T() {
        this.f2958V = new C1006n(this);
        this.f2962Z = C2316d.m10779a(this);
        this.f2961Y = null;
        if (!this.f2965c0.contains(this.f2967d0)) {
            m3752i1(this.f2967d0);
        }
    }

    @Deprecated
    /* renamed from: V */
    public static Fragment m3750V(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C0925n.m4180d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo3297q1(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C0853h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0853h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0853h("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0853h("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: f */
    private C0851f m3751f() {
        if (this.f2951O == null) {
            this.f2951O = new C0851f();
        }
        return this.f2951O;
    }

    /* renamed from: i1 */
    private void m3752i1(C0854i iVar) {
        if (this.f2966d >= 0) {
            iVar.mo3324a();
        } else {
            this.f2965c0.add(iVar);
        }
    }

    /* renamed from: n1 */
    private void m3753n1() {
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f2948L != null) {
            mo3288o1(this.f2968e);
        }
        this.f2968e = null;
    }

    /* renamed from: A0 */
    public void mo3202A0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int mo3203B() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return 0;
        }
        return fVar.f3003g;
    }

    @Deprecated
    /* renamed from: B0 */
    public void mo3204B0(Menu menu) {
    }

    /* renamed from: C */
    public final Fragment mo3205C() {
        return this.f2989z;
    }

    /* renamed from: C0 */
    public void mo3206C0(boolean z) {
    }

    /* renamed from: D */
    public final C0937w mo3207D() {
        C0937w wVar = this.f2986w;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Deprecated
    /* renamed from: D0 */
    public void mo3208D0(int i, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo3209E() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return false;
        }
        return fVar.f2998b;
    }

    /* renamed from: E0 */
    public void mo3210E0() {
        this.f2946J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public int mo3211F() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return 0;
        }
        return fVar.f3001e;
    }

    /* renamed from: F0 */
    public void mo3212F0(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public int mo3213G() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return 0;
        }
        return fVar.f3002f;
    }

    /* renamed from: G0 */
    public void mo3214G0() {
        this.f2946J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public float mo3215H() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return 1.0f;
        }
        return fVar.f3014r;
    }

    /* renamed from: H0 */
    public void mo3216H0() {
        this.f2946J = true;
    }

    /* renamed from: I */
    public Object mo3217I() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.f3009m;
        return obj == f2936e0 ? mo3311v() : obj;
    }

    /* renamed from: I0 */
    public void mo3218I0(View view, Bundle bundle) {
    }

    /* renamed from: J */
    public final Resources mo3219J() {
        return mo3279k1().getResources();
    }

    /* renamed from: J0 */
    public void mo3220J0(Bundle bundle) {
        this.f2946J = true;
    }

    /* renamed from: K */
    public Object mo3221K() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.f3007k;
        return obj == f2936e0 ? mo3301s() : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void mo3222K0(Bundle bundle) {
        this.f2988y.mo3647V0();
        this.f2966d = 3;
        this.f2946J = false;
        mo3258d0(bundle);
        if (this.f2946J) {
            m3753n1();
            this.f2988y.mo3690y();
            return;
        }
        throw new C0926n0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: L */
    public Object mo3223L() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return null;
        }
        return fVar.f3010n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void mo3224L0() {
        Iterator<C0854i> it = this.f2965c0.iterator();
        while (it.hasNext()) {
            it.next().mo3324a();
        }
        this.f2965c0.clear();
        this.f2988y.mo3672m(this.f2987x, mo3257d(), this);
        this.f2966d = 0;
        this.f2946J = false;
        mo3267g0(this.f2987x.mo3595p());
        if (this.f2946J) {
            this.f2986w.mo3629I(this);
            this.f2988y.mo3692z();
            return;
        }
        throw new C0926n0("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* renamed from: M */
    public Object mo3225M() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.f3011o;
        return obj == f2936e0 ? mo3223L() : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void mo3226M0(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f3004h;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> mo3227N() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$f r0 = r1.f2951O
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f3004h
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3227N():java.util.ArrayList");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public boolean mo3228N0(MenuItem menuItem) {
        if (this.f2940D) {
            return false;
        }
        if (mo3274i0(menuItem)) {
            return true;
        }
        return this.f2988y.mo3617B(menuItem);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f3005i;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> mo3229O() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$f r0 = r1.f2951O
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f3005i
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3229O():java.util.ArrayList");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo3230O0(Bundle bundle) {
        this.f2988y.mo3647V0();
        this.f2966d = 1;
        this.f2946J = false;
        this.f2958V.mo3774a(new C1002j() {
            /* renamed from: j */
            public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
                View view;
                if (aVar == C0988f.C0989a.ON_STOP && (view = Fragment.this.f2948L) != null) {
                    C0852g.m3877a(view);
                }
            }
        });
        this.f2962Z.mo8635d(bundle);
        mo3276j0(bundle);
        this.f2955S = true;
        if (this.f2946J) {
            this.f2958V.mo3787i(C0988f.C0989a.ON_CREATE);
            return;
        }
        throw new C0926n0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: P */
    public final String mo3231P(int i) {
        return mo3219J().getString(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public boolean mo3232P0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f2940D) {
            return false;
        }
        if (this.f2944H && this.f2945I) {
            z = true;
            mo3283m0(menu, menuInflater);
        }
        return z | this.f2988y.mo3620D(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo3233Q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2988y.mo3647V0();
        this.f2984u = true;
        this.f2959W = new C0908j0(this, mo113o());
        View n0 = mo3286n0(layoutInflater, viewGroup, bundle);
        this.f2948L = n0;
        if (n0 != null) {
            this.f2959W.mo3540d();
            C0998h0.m4467a(this.f2948L, this.f2959W);
            C1001i0.m4469a(this.f2948L, this.f2959W);
            C2319f.m10786a(this.f2948L, this.f2959W);
            this.f2960X.mo3744i(this.f2959W);
        } else if (!this.f2959W.mo3541e()) {
            this.f2959W = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: R */
    public View mo3234R() {
        return this.f2948L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void mo3235R0() {
        this.f2988y.mo3622E();
        this.f2958V.mo3787i(C0988f.C0989a.ON_DESTROY);
        this.f2966d = 0;
        this.f2946J = false;
        this.f2955S = false;
        mo3287o0();
        if (!this.f2946J) {
            throw new C0926n0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* renamed from: S */
    public LiveData<C1005m> mo3236S() {
        return this.f2960X;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public void mo3237S0() {
        this.f2988y.mo3624F();
        if (this.f2948L != null && this.f2959W.mo102a().mo3775b().mo3782b(C0988f.C0993b.CREATED)) {
            this.f2959W.mo3539c(C0988f.C0989a.ON_DESTROY);
        }
        this.f2966d = 1;
        this.f2946J = false;
        mo3296q0();
        if (this.f2946J) {
            C1035a.m4544b(this).mo3841c();
            this.f2984u = false;
            return;
        }
        throw new C0926n0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void mo3238T0() {
        this.f2966d = -1;
        this.f2946J = false;
        mo3299r0();
        this.f2954R = null;
        if (!this.f2946J) {
            throw new C0926n0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f2988y.mo3627G0()) {
            this.f2988y.mo3622E();
            this.f2988y = new C0953x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo3239U() {
        m3749T();
        this.f2956T = this.f2972i;
        this.f2972i = UUID.randomUUID().toString();
        this.f2978o = false;
        this.f2979p = false;
        this.f2981r = false;
        this.f2982s = false;
        this.f2983t = false;
        this.f2985v = 0;
        this.f2986w = null;
        this.f2988y = new C0953x();
        this.f2987x = null;
        this.f2937A = 0;
        this.f2938B = 0;
        this.f2939C = null;
        this.f2940D = false;
        this.f2941E = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public LayoutInflater mo3240U0(Bundle bundle) {
        LayoutInflater s0 = mo3302s0(bundle);
        this.f2954R = s0;
        return s0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public void mo3241V0() {
        onLowMemory();
    }

    /* renamed from: W */
    public final boolean mo3242W() {
        return this.f2987x != null && this.f2978o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo3243W0(boolean z) {
        mo3315w0(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f2986w;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3244X() {
        /*
            r2 = this;
            boolean r0 = r2.f2940D
            if (r0 != 0) goto L_0x0013
            androidx.fragment.app.w r0 = r2.f2986w
            if (r0 == 0) goto L_0x0011
            androidx.fragment.app.Fragment r1 = r2.f2989z
            boolean r0 = r0.mo3632K0(r1)
            if (r0 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3244X():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public boolean mo3245X0(MenuItem menuItem) {
        if (this.f2940D) {
            return false;
        }
        if (!this.f2944H || !this.f2945I || !mo3318x0(menuItem)) {
            return this.f2988y.mo3631K(menuItem);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final boolean mo3246Y() {
        return this.f2985v > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo3247Y0(Menu menu) {
        if (!this.f2940D) {
            if (this.f2944H && this.f2945I) {
                mo3320y0(menu);
            }
            this.f2988y.mo3633L(menu);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f2986w;
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3248Z() {
        /*
            r2 = this;
            boolean r0 = r2.f2945I
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.w r0 = r2.f2986w
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.f2989z
            boolean r0 = r0.mo3634L0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo3248Z():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public void mo3249Z0() {
        this.f2988y.mo3636N();
        if (this.f2948L != null) {
            this.f2959W.mo3539c(C0988f.C0989a.ON_PAUSE);
        }
        this.f2958V.mo3787i(C0988f.C0989a.ON_PAUSE);
        this.f2966d = 6;
        this.f2946J = false;
        mo3322z0();
        if (!this.f2946J) {
            throw new C0926n0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* renamed from: a */
    public C0988f mo102a() {
        return this.f2958V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public boolean mo3250a0() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return false;
        }
        return fVar.f3016t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a1 */
    public void mo3251a1(boolean z) {
        mo3202A0(z);
    }

    /* renamed from: b */
    public C1899a mo104b() {
        Application application;
        Context applicationContext = mo3279k1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + mo3279k1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C1904d dVar = new C1904d();
        if (application != null) {
            dVar.mo7622b(C0974c0.C0975a.f3410e, application);
        }
        dVar.mo7622b(C1028y.f3464a, this);
        dVar.mo7622b(C1028y.f3465b, this);
        if (mo3285n() != null) {
            dVar.mo7622b(C1028y.f3466c, mo3285n());
        }
        return dVar;
    }

    /* renamed from: b0 */
    public final boolean mo3252b0() {
        C0937w wVar = this.f2986w;
        if (wVar == null) {
            return false;
        }
        return wVar.mo3639O0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public boolean mo3253b1(Menu menu) {
        boolean z = false;
        if (this.f2940D) {
            return false;
        }
        if (this.f2944H && this.f2945I) {
            z = true;
            mo3204B0(menu);
        }
        return z | this.f2988y.mo3640P(menu);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3254c(boolean z) {
        ViewGroup viewGroup;
        C0937w wVar;
        C0851f fVar = this.f2951O;
        if (fVar != null) {
            fVar.f3016t = false;
        }
        if (this.f2948L != null && (viewGroup = this.f2947K) != null && (wVar = this.f2986w) != null) {
            C0914l0 n = C0914l0.m4130n(viewGroup, wVar);
            n.mo3561p();
            if (z) {
                this.f2987x.mo3596t().post(new C0849d(n));
            } else {
                n.mo3556g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo3255c0() {
        this.f2988y.mo3647V0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo3256c1() {
        boolean M0 = this.f2986w.mo3635M0(this);
        Boolean bool = this.f2977n;
        if (bool == null || bool.booleanValue() != M0) {
            this.f2977n = Boolean.valueOf(M0);
            mo3206C0(M0);
            this.f2988y.mo3641Q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0913l mo3257d() {
        return new C0850e();
    }

    @Deprecated
    /* renamed from: d0 */
    public void mo3258d0(Bundle bundle) {
        this.f2946J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public void mo3259d1() {
        this.f2988y.mo3647V0();
        this.f2988y.mo3655b0(true);
        this.f2966d = 7;
        this.f2946J = false;
        mo3210E0();
        if (this.f2946J) {
            C1006n nVar = this.f2958V;
            C0988f.C0989a aVar = C0988f.C0989a.ON_RESUME;
            nVar.mo3787i(aVar);
            if (this.f2948L != null) {
                this.f2959W.mo3539c(aVar);
            }
            this.f2988y.mo3642R();
            return;
        }
        throw new C0926n0("Fragment " + this + " did not call through to super.onResume()");
    }

    /* renamed from: e */
    public void mo3260e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2937A));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2938B));
        printWriter.print(" mTag=");
        printWriter.println(this.f2939C);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2966d);
        printWriter.print(" mWho=");
        printWriter.print(this.f2972i);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2985v);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2978o);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2979p);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2981r);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2982s);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f2940D);
        printWriter.print(" mDetached=");
        printWriter.print(this.f2941E);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f2945I);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f2944H);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f2942F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f2950N);
        if (this.f2986w != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2986w);
        }
        if (this.f2987x != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2987x);
        }
        if (this.f2989z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2989z);
        }
        if (this.f2973j != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2973j);
        }
        if (this.f2968e != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2968e);
        }
        if (this.f2969f != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2969f);
        }
        if (this.f2970g != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2970g);
        }
        Fragment Q = m3748Q(false);
        if (Q != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(Q);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2976m);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(mo3209E());
        if (mo3298r() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(mo3298r());
        }
        if (mo3308u() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(mo3308u());
        }
        if (mo3211F() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(mo3211F());
        }
        if (mo3213G() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(mo3213G());
        }
        if (this.f2947K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f2947K);
        }
        if (this.f2948L != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f2948L);
        }
        if (mo3282m() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo3282m());
        }
        if (mo3295q() != null) {
            C1035a.m4544b(this).mo3840a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2988y + ":");
        C0937w wVar = this.f2988y;
        wVar.mo3649X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    /* renamed from: e0 */
    public void mo3261e0(int i, int i2, Intent intent) {
        if (C0937w.m4207H0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void mo3262e1(Bundle bundle) {
        mo3212F0(bundle);
        this.f2962Z.mo8636e(bundle);
        Bundle i1 = this.f2988y.m4211P0();
        if (i1 != null) {
            bundle.putParcelable("android:support:fragments", i1);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Deprecated
    /* renamed from: f0 */
    public void mo3264f0(Activity activity) {
        this.f2946J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f1 */
    public void mo3265f1() {
        this.f2988y.mo3647V0();
        this.f2988y.mo3655b0(true);
        this.f2966d = 5;
        this.f2946J = false;
        mo3214G0();
        if (this.f2946J) {
            C1006n nVar = this.f2958V;
            C0988f.C0989a aVar = C0988f.C0989a.ON_START;
            nVar.mo3787i(aVar);
            if (this.f2948L != null) {
                this.f2959W.mo3539c(aVar);
            }
            this.f2988y.mo3643S();
            return;
        }
        throw new C0926n0("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo3266g(String str) {
        return str.equals(this.f2972i) ? this : this.f2988y.mo3666j0(str);
    }

    /* renamed from: g0 */
    public void mo3267g0(Context context) {
        this.f2946J = true;
        C0927o<?> oVar = this.f2987x;
        Activity n = oVar == null ? null : oVar.mo3594n();
        if (n != null) {
            this.f2946J = false;
            mo3264f0(n);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public void mo3268g1() {
        this.f2988y.mo3644U();
        if (this.f2948L != null) {
            this.f2959W.mo3539c(C0988f.C0989a.ON_STOP);
        }
        this.f2958V.mo3787i(C0988f.C0989a.ON_STOP);
        this.f2966d = 4;
        this.f2946J = false;
        mo3216H0();
        if (!this.f2946J) {
            throw new C0926n0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* renamed from: h */
    public final C0906j mo3269h() {
        C0927o<?> oVar = this.f2987x;
        if (oVar == null) {
            return null;
        }
        return (C0906j) oVar.mo3594n();
    }

    @Deprecated
    /* renamed from: h0 */
    public void mo3270h0(Fragment fragment) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public void mo3271h1() {
        mo3218I0(this.f2948L, this.f2968e);
        this.f2988y.mo3646V();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public boolean mo3273i() {
        Boolean bool;
        C0851f fVar = this.f2951O;
        if (fVar == null || (bool = fVar.f3013q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: i0 */
    public boolean mo3274i0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: j */
    public boolean mo3275j() {
        Boolean bool;
        C0851f fVar = this.f2951O;
        if (fVar == null || (bool = fVar.f3012p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: j0 */
    public void mo3276j0(Bundle bundle) {
        this.f2946J = true;
        mo3284m1(bundle);
        if (!this.f2988y.mo3637N0(1)) {
            this.f2988y.mo3618C();
        }
    }

    /* renamed from: j1 */
    public final C0906j mo3277j1() {
        C0906j h = mo3269h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* renamed from: k0 */
    public Animation mo3278k0(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: k1 */
    public final Context mo3279k1() {
        Context q = mo3295q();
        if (q != null) {
            return q;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: l */
    public final C2312c mo111l() {
        return this.f2962Z.mo8633b();
    }

    /* renamed from: l0 */
    public Animator mo3280l0(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: l1 */
    public final View mo3281l1() {
        View R = mo3234R();
        if (R != null) {
            return R;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public View mo3282m() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return null;
        }
        return fVar.f2997a;
    }

    @Deprecated
    /* renamed from: m0 */
    public void mo3283m0(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void mo3284m1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f2988y.mo3660g1(parcelable);
            this.f2988y.mo3618C();
        }
    }

    /* renamed from: n */
    public final Bundle mo3285n() {
        return this.f2973j;
    }

    /* renamed from: n0 */
    public View mo3286n0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f2963a0;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* renamed from: o */
    public C0994f0 mo113o() {
        if (this.f2986w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (m3747A() != C0988f.C0993b.INITIALIZED.ordinal()) {
            return this.f2986w.mo3619C0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    /* renamed from: o0 */
    public void mo3287o0() {
        this.f2946J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o1 */
    public final void mo3288o1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2969f;
        if (sparseArray != null) {
            this.f2948L.restoreHierarchyState(sparseArray);
            this.f2969f = null;
        }
        if (this.f2948L != null) {
            this.f2959W.mo3542f(this.f2970g);
            this.f2970g = null;
        }
        this.f2946J = false;
        mo3220J0(bundle);
        if (!this.f2946J) {
            throw new C0926n0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f2948L != null) {
            this.f2959W.mo3539c(C0988f.C0989a.ON_CREATE);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f2946J = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo3277j1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f2946J = true;
    }

    /* renamed from: p */
    public final C0937w mo3292p() {
        if (this.f2987x != null) {
            return this.f2988y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Deprecated
    /* renamed from: p0 */
    public void mo3293p0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public void mo3294p1(int i, int i2, int i3, int i4) {
        if (this.f2951O != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            m3751f().f2999c = i;
            m3751f().f3000d = i2;
            m3751f().f3001e = i3;
            m3751f().f3002f = i4;
        }
    }

    /* renamed from: q */
    public Context mo3295q() {
        C0927o<?> oVar = this.f2987x;
        if (oVar == null) {
            return null;
        }
        return oVar.mo3595p();
    }

    /* renamed from: q0 */
    public void mo3296q0() {
        this.f2946J = true;
    }

    /* renamed from: q1 */
    public void mo3297q1(Bundle bundle) {
        if (this.f2986w == null || !mo3252b0()) {
            this.f2973j = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo3298r() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return 0;
        }
        return fVar.f2999c;
    }

    /* renamed from: r0 */
    public void mo3299r0() {
        this.f2946J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public void mo3300r1(View view) {
        m3751f().f3015s = view;
    }

    /* renamed from: s */
    public Object mo3301s() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return null;
        }
        return fVar.f3006j;
    }

    /* renamed from: s0 */
    public LayoutInflater mo3302s0(Bundle bundle) {
        return mo3321z(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public void mo3303s1(int i) {
        if (this.f2951O != null || i != 0) {
            m3751f();
            this.f2951O.f3003g = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C0466l mo3304t() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return null;
        }
        Objects.requireNonNull(fVar);
        return null;
    }

    /* renamed from: t0 */
    public void mo3305t0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public void mo3306t1(boolean z) {
        if (this.f2951O != null) {
            m3751f().f2998b = z;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f2972i);
        if (this.f2937A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2937A));
        }
        if (this.f2939C != null) {
            sb.append(" tag=");
            sb.append(this.f2939C);
        }
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public int mo3308u() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return 0;
        }
        return fVar.f3000d;
    }

    @Deprecated
    /* renamed from: u0 */
    public void mo3309u0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f2946J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public void mo3310u1(float f) {
        m3751f().f3014r = f;
    }

    /* renamed from: v */
    public Object mo3311v() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return null;
        }
        return fVar.f3008l;
    }

    /* renamed from: v0 */
    public void mo3312v0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f2946J = true;
        C0927o<?> oVar = this.f2987x;
        Activity n = oVar == null ? null : oVar.mo3594n();
        if (n != null) {
            this.f2946J = false;
            mo3309u0(n, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v1 */
    public void mo3313v1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m3751f();
        C0851f fVar = this.f2951O;
        fVar.f3004h = arrayList;
        fVar.f3005i = arrayList2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C0466l mo3314w() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return null;
        }
        Objects.requireNonNull(fVar);
        return null;
    }

    /* renamed from: w0 */
    public void mo3315w0(boolean z) {
    }

    /* renamed from: w1 */
    public void mo3316w1() {
        if (this.f2951O != null && m3751f().f3016t) {
            if (this.f2987x == null) {
                m3751f().f3016t = false;
            } else if (Looper.myLooper() != this.f2987x.mo3596t().getLooper()) {
                this.f2987x.mo3596t().postAtFrontOfQueue(new C0848c());
            } else {
                mo3254c(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public View mo3317x() {
        C0851f fVar = this.f2951O;
        if (fVar == null) {
            return null;
        }
        return fVar.f3015s;
    }

    @Deprecated
    /* renamed from: x0 */
    public boolean mo3318x0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: y */
    public final Object mo3319y() {
        C0927o<?> oVar = this.f2987x;
        if (oVar == null) {
            return null;
        }
        return oVar.mo3536x();
    }

    @Deprecated
    /* renamed from: y0 */
    public void mo3320y0(Menu menu) {
    }

    @Deprecated
    /* renamed from: z */
    public LayoutInflater mo3321z(Bundle bundle) {
        C0927o<?> oVar = this.f2987x;
        if (oVar != null) {
            LayoutInflater y = oVar.mo3537y();
            C0675g.m2910b(y, this.f2988y.mo3685v0());
            return y;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: z0 */
    public void mo3322z0() {
        this.f2946J = true;
    }
}
