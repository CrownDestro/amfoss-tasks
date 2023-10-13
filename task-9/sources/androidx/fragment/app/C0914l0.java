package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p008os.C0549e;
import androidx.core.view.C0735z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p010b0.C1250b;

/* renamed from: androidx.fragment.app.l0 */
abstract class C0914l0 {

    /* renamed from: a */
    private final ViewGroup f3214a;

    /* renamed from: b */
    final ArrayList<C0919e> f3215b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<C0919e> f3216c = new ArrayList<>();

    /* renamed from: d */
    boolean f3217d = false;

    /* renamed from: e */
    boolean f3218e = false;

    /* renamed from: androidx.fragment.app.l0$a */
    class C0915a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0918d f3219d;

        C0915a(C0918d dVar) {
            this.f3219d = dVar;
        }

        public void run() {
            if (C0914l0.this.f3215b.contains(this.f3219d)) {
                this.f3219d.mo3570e().mo3578a(this.f3219d.mo3571f().f2948L);
            }
        }
    }

    /* renamed from: androidx.fragment.app.l0$b */
    class C0916b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0918d f3221d;

        C0916b(C0918d dVar) {
            this.f3221d = dVar;
        }

        public void run() {
            C0914l0.this.f3215b.remove(this.f3221d);
            C0914l0.this.f3216c.remove(this.f3221d);
        }
    }

    /* renamed from: androidx.fragment.app.l0$c */
    static /* synthetic */ class C0917c {

        /* renamed from: a */
        static final /* synthetic */ int[] f3223a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3224b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.l0$e$b[] r0 = androidx.fragment.app.C0914l0.C0919e.C0921b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3224b = r0
                r1 = 1
                androidx.fragment.app.l0$e$b r2 = androidx.fragment.app.C0914l0.C0919e.C0921b.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3224b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.l0$e$b r3 = androidx.fragment.app.C0914l0.C0919e.C0921b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3224b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.l0$e$b r4 = androidx.fragment.app.C0914l0.C0919e.C0921b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.l0$e$c[] r3 = androidx.fragment.app.C0914l0.C0919e.C0922c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f3223a = r3
                androidx.fragment.app.l0$e$c r4 = androidx.fragment.app.C0914l0.C0919e.C0922c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f3223a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.l0$e$c r3 = androidx.fragment.app.C0914l0.C0919e.C0922c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f3223a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C0914l0.C0919e.C0922c.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f3223a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C0914l0.C0919e.C0922c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0914l0.C0917c.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.l0$d */
    private static class C0918d extends C0919e {

        /* renamed from: h */
        private final C0880d0 f3225h;

        C0918d(C0919e.C0922c cVar, C0919e.C0921b bVar, C0880d0 d0Var, C0549e eVar) {
            super(cVar, bVar, d0Var.mo3423k(), eVar);
            this.f3225h = d0Var;
        }

        /* renamed from: c */
        public void mo3565c() {
            super.mo3565c();
            this.f3225h.mo3424m();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo3566l() {
            if (mo3572g() == C0919e.C0921b.ADDING) {
                Fragment k = this.f3225h.mo3423k();
                View findFocus = k.f2948L.findFocus();
                if (findFocus != null) {
                    k.mo3300r1(findFocus);
                    if (C0937w.m4207H0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k);
                    }
                }
                View l1 = mo3571f().mo3281l1();
                if (l1.getParent() == null) {
                    this.f3225h.mo3414b();
                    l1.setAlpha(0.0f);
                }
                if (l1.getAlpha() == 0.0f && l1.getVisibility() == 0) {
                    l1.setVisibility(4);
                }
                l1.setAlpha(k.mo3215H());
            } else if (mo3572g() == C0919e.C0921b.REMOVING) {
                Fragment k2 = this.f3225h.mo3423k();
                View l12 = k2.mo3281l1();
                if (C0937w.m4207H0(2)) {
                    Log.v("FragmentManager", "Clearing focus " + l12.findFocus() + " on view " + l12 + " for Fragment " + k2);
                }
                l12.clearFocus();
            }
        }
    }

    /* renamed from: androidx.fragment.app.l0$e */
    static class C0919e {

        /* renamed from: a */
        private C0922c f3226a;

        /* renamed from: b */
        private C0921b f3227b;

        /* renamed from: c */
        private final Fragment f3228c;

        /* renamed from: d */
        private final List<Runnable> f3229d = new ArrayList();

        /* renamed from: e */
        private final HashSet<C0549e> f3230e = new HashSet<>();

        /* renamed from: f */
        private boolean f3231f = false;

        /* renamed from: g */
        private boolean f3232g = false;

        /* renamed from: androidx.fragment.app.l0$e$a */
        class C0920a implements C0549e.C0551b {
            C0920a() {
            }

            /* renamed from: a */
            public void mo2573a() {
                C0919e.this.mo3568b();
            }
        }

        /* renamed from: androidx.fragment.app.l0$e$b */
        enum C0921b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.l0$e$c */
        enum C0922c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: b */
            static C0922c m4160b(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            /* renamed from: c */
            static C0922c m4161c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m4160b(view.getVisibility());
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo3578a(View view) {
                int i;
                int i2 = C0917c.f3223a[ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (C0937w.m4207H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                        }
                        i = 0;
                    } else if (i2 == 3) {
                        if (C0937w.m4207H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        i = 8;
                    } else if (i2 == 4) {
                        if (C0937w.m4207H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    } else {
                        return;
                    }
                    view.setVisibility(i);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (C0937w.m4207H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        C0919e(C0922c cVar, C0921b bVar, Fragment fragment, C0549e eVar) {
            this.f3226a = cVar;
            this.f3227b = bVar;
            this.f3228c = fragment;
            eVar.mo2572b(new C0920a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3567a(Runnable runnable) {
            this.f3229d.add(runnable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo3568b() {
            if (!mo3573h()) {
                this.f3231f = true;
                if (this.f3230e.isEmpty()) {
                    mo3565c();
                    return;
                }
                Iterator it = new ArrayList(this.f3230e).iterator();
                while (it.hasNext()) {
                    ((C0549e) it.next()).mo2571a();
                }
            }
        }

        /* renamed from: c */
        public void mo3565c() {
            if (!this.f3232g) {
                if (C0937w.m4207H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f3232g = true;
                for (Runnable run : this.f3229d) {
                    run.run();
                }
            }
        }

        /* renamed from: d */
        public final void mo3569d(C0549e eVar) {
            if (this.f3230e.remove(eVar) && this.f3230e.isEmpty()) {
                mo3565c();
            }
        }

        /* renamed from: e */
        public C0922c mo3570e() {
            return this.f3226a;
        }

        /* renamed from: f */
        public final Fragment mo3571f() {
            return this.f3228c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0921b mo3572g() {
            return this.f3227b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public final boolean mo3573h() {
            return this.f3231f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final boolean mo3574i() {
            return this.f3232g;
        }

        /* renamed from: j */
        public final void mo3575j(C0549e eVar) {
            mo3566l();
            this.f3230e.add(eVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public final void mo3576k(C0922c cVar, C0921b bVar) {
            C0921b bVar2;
            int i = C0917c.f3224b[bVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (C0937w.m4207H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3228c + " mFinalState = " + this.f3226a + " -> REMOVED. mLifecycleImpact  = " + this.f3227b + " to REMOVING.");
                    }
                    this.f3226a = C0922c.REMOVED;
                    bVar2 = C0921b.REMOVING;
                } else if (i == 3 && this.f3226a != C0922c.REMOVED) {
                    if (C0937w.m4207H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3228c + " mFinalState = " + this.f3226a + " -> " + cVar + ". ");
                    }
                    this.f3226a = cVar;
                    return;
                } else {
                    return;
                }
            } else if (this.f3226a == C0922c.REMOVED) {
                if (C0937w.m4207H0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3228c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3227b + " to ADDING.");
                }
                this.f3226a = C0922c.VISIBLE;
                bVar2 = C0921b.ADDING;
            } else {
                return;
            }
            this.f3227b = bVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo3566l() {
        }

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.f3226a + "} " + "{" + "mLifecycleImpact = " + this.f3227b + "} " + "{" + "mFragment = " + this.f3228c + "}";
        }
    }

    C0914l0(ViewGroup viewGroup) {
        this.f3214a = viewGroup;
    }

    /* renamed from: a */
    private void m4127a(C0919e.C0922c cVar, C0919e.C0921b bVar, C0880d0 d0Var) {
        synchronized (this.f3215b) {
            C0549e eVar = new C0549e();
            C0919e h = m4128h(d0Var.mo3423k());
            if (h != null) {
                h.mo3576k(cVar, bVar);
                return;
            }
            C0918d dVar = new C0918d(cVar, bVar, d0Var, eVar);
            this.f3215b.add(dVar);
            dVar.mo3567a(new C0915a(dVar));
            dVar.mo3567a(new C0916b(dVar));
        }
    }

    /* renamed from: h */
    private C0919e m4128h(Fragment fragment) {
        Iterator<C0919e> it = this.f3215b.iterator();
        while (it.hasNext()) {
            C0919e next = it.next();
            if (next.mo3571f().equals(fragment) && !next.mo3573h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    private C0919e m4129i(Fragment fragment) {
        Iterator<C0919e> it = this.f3216c.iterator();
        while (it.hasNext()) {
            C0919e next = it.next();
            if (next.mo3571f().equals(fragment) && !next.mo3573h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: n */
    static C0914l0 m4130n(ViewGroup viewGroup, C0937w wVar) {
        return m4131o(viewGroup, wVar.mo3693z0());
    }

    /* renamed from: o */
    static C0914l0 m4131o(ViewGroup viewGroup, C0924m0 m0Var) {
        int i = C1250b.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof C0914l0) {
            return (C0914l0) tag;
        }
        C0914l0 a = m0Var.mo3592a(viewGroup);
        viewGroup.setTag(i, a);
        return a;
    }

    /* renamed from: q */
    private void m4132q() {
        Iterator<C0919e> it = this.f3215b.iterator();
        while (it.hasNext()) {
            C0919e next = it.next();
            if (next.mo3572g() == C0919e.C0921b.ADDING) {
                next.mo3576k(C0919e.C0922c.m4160b(next.mo3571f().mo3281l1().getVisibility()), C0919e.C0921b.NONE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3552b(C0919e.C0922c cVar, C0880d0 d0Var) {
        if (C0937w.m4207H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + d0Var.mo3423k());
        }
        m4127a(cVar, C0919e.C0921b.ADDING, d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3553c(C0880d0 d0Var) {
        if (C0937w.m4207H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + d0Var.mo3423k());
        }
        m4127a(C0919e.C0922c.GONE, C0919e.C0921b.NONE, d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3554d(C0880d0 d0Var) {
        if (C0937w.m4207H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + d0Var.mo3423k());
        }
        m4127a(C0919e.C0922c.REMOVED, C0919e.C0921b.REMOVING, d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3555e(C0880d0 d0Var) {
        if (C0937w.m4207H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + d0Var.mo3423k());
        }
        m4127a(C0919e.C0922c.VISIBLE, C0919e.C0921b.NONE, d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo3388f(List<C0919e> list, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3556g() {
        if (!this.f3218e) {
            if (!C0735z.m3187U(this.f3214a)) {
                mo3557j();
                this.f3217d = false;
                return;
            }
            synchronized (this.f3215b) {
                if (!this.f3215b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f3216c);
                    this.f3216c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0919e eVar = (C0919e) it.next();
                        if (C0937w.m4207H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.mo3568b();
                        if (!eVar.mo3574i()) {
                            this.f3216c.add(eVar);
                        }
                    }
                    m4132q();
                    ArrayList arrayList2 = new ArrayList(this.f3215b);
                    this.f3215b.clear();
                    this.f3216c.addAll(arrayList2);
                    if (C0937w.m4207H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C0919e) it2.next()).mo3566l();
                    }
                    mo3388f(arrayList2, this.f3217d);
                    this.f3217d = false;
                    if (C0937w.m4207H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3557j() {
        String str;
        String str2;
        if (C0937w.m4207H0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean U = C0735z.m3187U(this.f3214a);
        synchronized (this.f3215b) {
            m4132q();
            Iterator<C0919e> it = this.f3215b.iterator();
            while (it.hasNext()) {
                it.next().mo3566l();
            }
            Iterator it2 = new ArrayList(this.f3216c).iterator();
            while (it2.hasNext()) {
                C0919e eVar = (C0919e) it2.next();
                if (C0937w.m4207H0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (U) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f3214a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.mo3568b();
            }
            Iterator it3 = new ArrayList(this.f3215b).iterator();
            while (it3.hasNext()) {
                C0919e eVar2 = (C0919e) it3.next();
                if (C0937w.m4207H0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (U) {
                        str = "";
                    } else {
                        str = "Container " + this.f3214a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.mo3568b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3558k() {
        if (this.f3218e) {
            if (C0937w.m4207H0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f3218e = false;
            mo3556g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0919e.C0921b mo3559l(C0880d0 d0Var) {
        C0919e h = m4128h(d0Var.mo3423k());
        C0919e.C0921b g = h != null ? h.mo3572g() : null;
        C0919e i = m4129i(d0Var.mo3423k());
        return (i == null || !(g == null || g == C0919e.C0921b.NONE)) ? g : i.mo3572g();
    }

    /* renamed from: m */
    public ViewGroup mo3560m() {
        return this.f3214a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3561p() {
        synchronized (this.f3215b) {
            m4132q();
            this.f3218e = false;
            int size = this.f3215b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C0919e eVar = this.f3215b.get(size);
                C0919e.C0922c c = C0919e.C0922c.m4161c(eVar.mo3571f().f2948L);
                C0919e.C0922c e = eVar.mo3570e();
                C0919e.C0922c cVar = C0919e.C0922c.VISIBLE;
                if (e == cVar && c != cVar) {
                    this.f3218e = eVar.mo3571f().mo3250a0();
                    break;
                }
                size--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo3562r(boolean z) {
        this.f3217d = z;
    }
}
