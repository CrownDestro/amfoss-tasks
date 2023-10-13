package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.p008os.C0549e;
import androidx.core.util.C0612h;
import androidx.core.view.C0661c0;
import androidx.core.view.C0732w;
import androidx.core.view.C0735z;
import androidx.fragment.app.C0909k;
import androidx.fragment.app.C0914l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p070k.C2335a;

/* renamed from: androidx.fragment.app.d */
class C0865d extends C0914l0 {

    /* renamed from: androidx.fragment.app.d$a */
    static /* synthetic */ class C0866a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3059a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.l0$e$c[] r0 = androidx.fragment.app.C0914l0.C0919e.C0922c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3059a = r0
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C0914l0.C0919e.C0922c.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3059a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C0914l0.C0919e.C0922c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3059a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C0914l0.C0919e.C0922c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3059a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.l0$e$c r1 = androidx.fragment.app.C0914l0.C0919e.C0922c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0865d.C0866a.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    class C0867b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ List f3060d;

        /* renamed from: e */
        final /* synthetic */ C0914l0.C0919e f3061e;

        C0867b(List list, C0914l0.C0919e eVar) {
            this.f3060d = list;
            this.f3061e = eVar;
        }

        public void run() {
            if (this.f3060d.contains(this.f3061e)) {
                this.f3060d.remove(this.f3061e);
                C0865d.this.mo3389s(this.f3061e);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    class C0868c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3063a;

        /* renamed from: b */
        final /* synthetic */ View f3064b;

        /* renamed from: c */
        final /* synthetic */ boolean f3065c;

        /* renamed from: d */
        final /* synthetic */ C0914l0.C0919e f3066d;

        /* renamed from: e */
        final /* synthetic */ C0877k f3067e;

        C0868c(ViewGroup viewGroup, View view, boolean z, C0914l0.C0919e eVar, C0877k kVar) {
            this.f3063a = viewGroup;
            this.f3064b = view;
            this.f3065c = z;
            this.f3066d = eVar;
            this.f3067e = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3063a.endViewTransition(this.f3064b);
            if (this.f3065c) {
                this.f3066d.mo3570e().mo3578a(this.f3064b);
            }
            this.f3067e.mo3404a();
            if (C0937w.m4207H0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f3066d + " has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d */
    class C0869d implements C0549e.C0551b {

        /* renamed from: a */
        final /* synthetic */ Animator f3069a;

        /* renamed from: b */
        final /* synthetic */ C0914l0.C0919e f3070b;

        C0869d(Animator animator, C0914l0.C0919e eVar) {
            this.f3069a = animator;
            this.f3070b = eVar;
        }

        /* renamed from: a */
        public void mo2573a() {
            this.f3069a.end();
            if (C0937w.m4207H0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f3070b + " has been canceled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    class C0870e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C0914l0.C0919e f3072a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f3073b;

        /* renamed from: c */
        final /* synthetic */ View f3074c;

        /* renamed from: d */
        final /* synthetic */ C0877k f3075d;

        /* renamed from: androidx.fragment.app.d$e$a */
        class C0871a implements Runnable {
            C0871a() {
            }

            public void run() {
                C0870e eVar = C0870e.this;
                eVar.f3073b.endViewTransition(eVar.f3074c);
                C0870e.this.f3075d.mo3404a();
            }
        }

        C0870e(C0914l0.C0919e eVar, ViewGroup viewGroup, View view, C0877k kVar) {
            this.f3072a = eVar;
            this.f3073b = viewGroup;
            this.f3074c = view;
            this.f3075d = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3073b.post(new C0871a());
            if (C0937w.m4207H0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f3072a + " has ended.");
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            if (C0937w.m4207H0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f3072a + " has reached onAnimationStart.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$f */
    class C0872f implements C0549e.C0551b {

        /* renamed from: a */
        final /* synthetic */ View f3078a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f3079b;

        /* renamed from: c */
        final /* synthetic */ C0877k f3080c;

        /* renamed from: d */
        final /* synthetic */ C0914l0.C0919e f3081d;

        C0872f(View view, ViewGroup viewGroup, C0877k kVar, C0914l0.C0919e eVar) {
            this.f3078a = view;
            this.f3079b = viewGroup;
            this.f3080c = kVar;
            this.f3081d = eVar;
        }

        /* renamed from: a */
        public void mo2573a() {
            this.f3078a.clearAnimation();
            this.f3079b.endViewTransition(this.f3078a);
            this.f3080c.mo3404a();
            if (C0937w.m4207H0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f3081d + " has been cancelled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$g */
    class C0873g implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0914l0.C0919e f3083d;

        /* renamed from: e */
        final /* synthetic */ C0914l0.C0919e f3084e;

        /* renamed from: f */
        final /* synthetic */ boolean f3085f;

        /* renamed from: g */
        final /* synthetic */ C2335a f3086g;

        C0873g(C0914l0.C0919e eVar, C0914l0.C0919e eVar2, boolean z, C2335a aVar) {
            this.f3083d = eVar;
            this.f3084e = eVar2;
            this.f3085f = z;
            this.f3086g = aVar;
        }

        public void run() {
            C0894g0.m4024a(this.f3083d.mo3571f(), this.f3084e.mo3571f(), this.f3085f, this.f3086g, false);
        }
    }

    /* renamed from: androidx.fragment.app.d$h */
    class C0874h implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0904i0 f3088d;

        /* renamed from: e */
        final /* synthetic */ View f3089e;

        /* renamed from: f */
        final /* synthetic */ Rect f3090f;

        C0874h(C0904i0 i0Var, View view, Rect rect) {
            this.f3088d = i0Var;
            this.f3089e = view;
            this.f3090f = rect;
        }

        public void run() {
            this.f3088d.mo3518h(this.f3089e, this.f3090f);
        }
    }

    /* renamed from: androidx.fragment.app.d$i */
    class C0875i implements Runnable {

        /* renamed from: d */
        final /* synthetic */ ArrayList f3092d;

        C0875i(ArrayList arrayList) {
            this.f3092d = arrayList;
        }

        public void run() {
            C0894g0.m4027d(this.f3092d, 4);
        }
    }

    /* renamed from: androidx.fragment.app.d$j */
    class C0876j implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C0879m f3094d;

        /* renamed from: e */
        final /* synthetic */ C0914l0.C0919e f3095e;

        C0876j(C0879m mVar, C0914l0.C0919e eVar) {
            this.f3094d = mVar;
            this.f3095e = eVar;
        }

        public void run() {
            this.f3094d.mo3404a();
            if (C0937w.m4207H0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f3095e + "has completed");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$k */
    private static class C0877k extends C0878l {

        /* renamed from: c */
        private boolean f3097c;

        /* renamed from: d */
        private boolean f3098d = false;

        /* renamed from: e */
        private C0909k.C0910a f3099e;

        C0877k(C0914l0.C0919e eVar, C0549e eVar2, boolean z) {
            super(eVar, eVar2);
            this.f3097c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C0909k.C0910a mo3403e(Context context) {
            if (this.f3098d) {
                return this.f3099e;
            }
            C0909k.C0910a b = C0909k.m4120b(context, mo3405b().mo3571f(), mo3405b().mo3570e() == C0914l0.C0919e.C0922c.VISIBLE, this.f3097c);
            this.f3099e = b;
            this.f3098d = true;
            return b;
        }
    }

    /* renamed from: androidx.fragment.app.d$l */
    private static class C0878l {

        /* renamed from: a */
        private final C0914l0.C0919e f3100a;

        /* renamed from: b */
        private final C0549e f3101b;

        C0878l(C0914l0.C0919e eVar, C0549e eVar2) {
            this.f3100a = eVar;
            this.f3101b = eVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3404a() {
            this.f3100a.mo3569d(this.f3101b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0914l0.C0919e mo3405b() {
            return this.f3100a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0549e mo3406c() {
            return this.f3101b;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r2 = androidx.fragment.app.C0914l0.C0919e.C0922c.VISIBLE;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3407d() {
            /*
                r3 = this;
                androidx.fragment.app.l0$e r0 = r3.f3100a
                androidx.fragment.app.Fragment r0 = r0.mo3571f()
                android.view.View r0 = r0.f2948L
                androidx.fragment.app.l0$e$c r0 = androidx.fragment.app.C0914l0.C0919e.C0922c.m4161c(r0)
                androidx.fragment.app.l0$e r1 = r3.f3100a
                androidx.fragment.app.l0$e$c r1 = r1.mo3570e()
                if (r0 == r1) goto L_0x001d
                androidx.fragment.app.l0$e$c r2 = androidx.fragment.app.C0914l0.C0919e.C0922c.VISIBLE
                if (r0 == r2) goto L_0x001b
                if (r1 == r2) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r0 = 0
                goto L_0x001e
            L_0x001d:
                r0 = 1
            L_0x001e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0865d.C0878l.mo3407d():boolean");
        }
    }

    /* renamed from: androidx.fragment.app.d$m */
    private static class C0879m extends C0878l {

        /* renamed from: c */
        private final Object f3102c;

        /* renamed from: d */
        private final boolean f3103d;

        /* renamed from: e */
        private final Object f3104e;

        C0879m(C0914l0.C0919e eVar, C0549e eVar2, boolean z, boolean z2) {
            super(eVar, eVar2);
            boolean z3;
            Object obj;
            if (eVar.mo3570e() == C0914l0.C0919e.C0922c.VISIBLE) {
                Fragment f = eVar.mo3571f();
                this.f3102c = z ? f.mo3217I() : f.mo3301s();
                Fragment f2 = eVar.mo3571f();
                z3 = z ? f2.mo3275j() : f2.mo3273i();
            } else {
                Fragment f3 = eVar.mo3571f();
                this.f3102c = z ? f3.mo3221K() : f3.mo3311v();
                z3 = true;
            }
            this.f3103d = z3;
            if (z2) {
                Fragment f4 = eVar.mo3571f();
                obj = z ? f4.mo3225M() : f4.mo3223L();
            } else {
                obj = null;
            }
            this.f3104e = obj;
        }

        /* renamed from: f */
        private C0904i0 m3925f(Object obj) {
            if (obj == null) {
                return null;
            }
            C0904i0 i0Var = C0894g0.f3169a;
            if (i0Var != null && i0Var.mo3488e(obj)) {
                return i0Var;
            }
            C0904i0 i0Var2 = C0894g0.f3170b;
            if (i0Var2 != null && i0Var2.mo3488e(obj)) {
                return i0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + mo3405b().mo3571f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C0904i0 mo3408e() {
            C0904i0 f = m3925f(this.f3102c);
            C0904i0 f2 = m3925f(this.f3104e);
            if (f == null || f2 == null || f == f2) {
                return f != null ? f : f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mo3405b().mo3571f() + " returned Transition " + this.f3102c + " which uses a different Transition  type than its shared element transition " + this.f3104e);
        }

        /* renamed from: g */
        public Object mo3409g() {
            return this.f3104e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Object mo3410h() {
            return this.f3102c;
        }

        /* renamed from: i */
        public boolean mo3411i() {
            return this.f3104e != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3412j() {
            return this.f3103d;
        }
    }

    C0865d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m3910w(List<C0877k> list, List<C0914l0.C0919e> list2, boolean z, Map<C0914l0.C0919e, Boolean> map) {
        int i;
        boolean z2;
        StringBuilder sb;
        String str;
        C0909k.C0910a e;
        C0914l0.C0919e eVar;
        ViewGroup m = mo3560m();
        Context context = m.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<C0877k> it = list.iterator();
        boolean z3 = false;
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            C0877k next = it.next();
            if (!next.mo3407d() && (e = next.mo3403e(context)) != null) {
                Animator animator = e.f3206b;
                if (animator == null) {
                    arrayList.add(next);
                } else {
                    C0914l0.C0919e b = next.mo3405b();
                    Fragment f = b.mo3571f();
                    if (Boolean.TRUE.equals(map.get(b))) {
                        if (C0937w.m4207H0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + f + " as this Fragment was involved in a Transition.");
                        }
                        next.mo3404a();
                    } else {
                        boolean z4 = b.mo3570e() == C0914l0.C0919e.C0922c.GONE;
                        List<C0914l0.C0919e> list3 = list2;
                        if (z4) {
                            list3.remove(b);
                        }
                        View view = f.f2948L;
                        m.startViewTransition(view);
                        C0868c cVar = r0;
                        View view2 = view;
                        C0914l0.C0919e eVar2 = b;
                        Animator animator2 = animator;
                        C0877k kVar = next;
                        C0868c cVar2 = new C0868c(m, view2, z4, eVar2, kVar);
                        animator2.addListener(cVar2);
                        animator2.setTarget(view2);
                        animator2.start();
                        if (C0937w.m4207H0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Animator from operation ");
                            eVar = eVar2;
                            sb2.append(eVar);
                            sb2.append(" has started.");
                            Log.v("FragmentManager", sb2.toString());
                        } else {
                            eVar = eVar2;
                        }
                        kVar.mo3406c().mo2572b(new C0869d(animator2, eVar));
                        z3 = true;
                    }
                }
            } else {
                next.mo3404a();
            }
            Map<C0914l0.C0919e, Boolean> map2 = map;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0877k kVar2 = (C0877k) it2.next();
            C0914l0.C0919e b2 = kVar2.mo3405b();
            Fragment f2 = b2.mo3571f();
            if (z) {
                if (C0937w.m4207H0(i)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f2);
                    str = " as Animations cannot run alongside Transitions.";
                }
                kVar2.mo3404a();
            } else if (z3) {
                if (C0937w.m4207H0(i)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f2);
                    str = " as Animations cannot run alongside Animators.";
                }
                kVar2.mo3404a();
            } else {
                View view3 = f2.f2948L;
                Animation animation = (Animation) C0612h.m2670g(((C0909k.C0910a) C0612h.m2670g(kVar2.mo3403e(context))).f3205a);
                if (b2.mo3570e() != C0914l0.C0919e.C0922c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar2.mo3404a();
                    z2 = z3;
                } else {
                    m.startViewTransition(view3);
                    C0870e eVar3 = r0;
                    z2 = z3;
                    C0909k.C0911b bVar = new C0909k.C0911b(animation, m, view3);
                    C0870e eVar4 = new C0870e(b2, m, view3, kVar2);
                    bVar.setAnimationListener(eVar3);
                    view3.startAnimation(bVar);
                    if (C0937w.m4207H0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + b2 + " has started.");
                    }
                }
                C0549e c = kVar2.mo3406c();
                C0877k kVar3 = kVar2;
                C0872f fVar = r0;
                C0872f fVar2 = new C0872f(view3, m, kVar3, b2);
                c.mo2572b(fVar);
                i = 2;
                z3 = z2;
            }
            sb.append(str);
            Log.v("FragmentManager", sb.toString());
            kVar2.mo3404a();
        }
    }

    /* renamed from: x */
    private Map<C0914l0.C0919e, Boolean> m3911x(List<C0879m> list, List<C0914l0.C0919e> list2, boolean z, C0914l0.C0919e eVar, C0914l0.C0919e eVar2) {
        String str;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        View view;
        String str3;
        View view2;
        Object obj;
        HashMap hashMap;
        Object obj2;
        Object obj3;
        C2335a aVar;
        HashMap hashMap2;
        C0914l0.C0919e eVar3;
        C0904i0 i0Var;
        View view3;
        Rect rect;
        ArrayList arrayList3;
        C0914l0.C0919e eVar4;
        ArrayList arrayList4;
        View view4;
        boolean z2 = z;
        C0914l0.C0919e eVar5 = eVar;
        C0914l0.C0919e eVar6 = eVar2;
        HashMap hashMap3 = new HashMap();
        C0904i0 i0Var2 = null;
        for (C0879m next : list) {
            if (!next.mo3407d()) {
                C0904i0 e = next.mo3408e();
                if (i0Var2 == null) {
                    i0Var2 = e;
                } else if (!(e == null || i0Var2 == e)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + next.mo3405b().mo3571f() + " returned Transition " + next.mo3410h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (i0Var2 == null) {
            for (C0879m next2 : list) {
                hashMap3.put(next2.mo3405b(), Boolean.FALSE);
                next2.mo3404a();
            }
            return hashMap3;
        }
        View view5 = new View(mo3560m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C2335a aVar2 = new C2335a();
        Iterator<C0879m> it = list.iterator();
        Object obj4 = null;
        View view6 = null;
        boolean z3 = false;
        while (true) {
            str = "FragmentManager";
            if (!it.hasNext()) {
                break;
            }
            C0879m next3 = it.next();
            if (!next3.mo3411i() || eVar5 == null || eVar6 == null) {
                aVar = aVar2;
                arrayList4 = arrayList6;
                eVar4 = eVar5;
                arrayList3 = arrayList5;
                rect = rect2;
                i0Var = i0Var2;
                hashMap2 = hashMap3;
                View view7 = view5;
                eVar3 = eVar6;
                view3 = view7;
                view6 = view6;
            } else {
                Object u = i0Var2.mo3499u(i0Var2.mo3489f(next3.mo3409g()));
                ArrayList<String> N = eVar2.mo3571f().mo3227N();
                ArrayList<String> N2 = eVar.mo3571f().mo3227N();
                Object obj5 = u;
                ArrayList<String> O = eVar.mo3571f().mo3229O();
                View view8 = view6;
                int i = 0;
                while (i < O.size()) {
                    int indexOf = N.indexOf(O.get(i));
                    ArrayList<String> arrayList7 = O;
                    if (indexOf != -1) {
                        N.set(indexOf, N2.get(i));
                    }
                    i++;
                    O = arrayList7;
                }
                ArrayList<String> O2 = eVar2.mo3571f().mo3229O();
                Fragment f = eVar.mo3571f();
                if (!z2) {
                    f.mo3314w();
                    eVar2.mo3571f().mo3304t();
                } else {
                    f.mo3304t();
                    eVar2.mo3571f().mo3314w();
                }
                int i2 = 0;
                for (int size = N.size(); i2 < size; size = size) {
                    aVar2.put(N.get(i2), O2.get(i2));
                    i2++;
                }
                if (C0937w.m4207H0(2)) {
                    Log.v(str, ">>> entering view names <<<");
                    Iterator<String> it2 = O2.iterator();
                    while (it2.hasNext()) {
                        Iterator<String> it3 = it2;
                        Log.v(str, "Name: " + it2.next());
                        it2 = it3;
                    }
                    Log.v(str, ">>> exiting view names <<<");
                    Iterator<String> it4 = N.iterator();
                    while (it4.hasNext()) {
                        Iterator<String> it5 = it4;
                        Log.v(str, "Name: " + it4.next());
                        it4 = it5;
                    }
                }
                C2335a aVar3 = new C2335a();
                mo3391u(aVar3, eVar.mo3571f().f2948L);
                aVar3.mo8662o(N);
                aVar2.mo8662o(aVar3.keySet());
                C2335a aVar4 = new C2335a();
                mo3391u(aVar4, eVar2.mo3571f().f2948L);
                aVar4.mo8662o(O2);
                aVar4.mo8662o(aVar2.values());
                C0894g0.m4026c(aVar2, aVar4);
                mo3392v(aVar3, aVar2.keySet());
                mo3392v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList4 = arrayList6;
                    eVar4 = eVar5;
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    i0Var = i0Var2;
                    view6 = view8;
                    obj4 = null;
                    eVar3 = eVar2;
                    hashMap2 = hashMap3;
                } else {
                    C0894g0.m4024a(eVar2.mo3571f(), eVar.mo3571f(), z2, aVar3, true);
                    ArrayList<String> arrayList8 = N;
                    C0873g gVar = r0;
                    Object obj6 = obj5;
                    HashMap hashMap4 = hashMap3;
                    View view9 = view8;
                    ViewGroup m = mo3560m();
                    C2335a aVar5 = aVar4;
                    View view10 = view5;
                    aVar = aVar2;
                    ArrayList arrayList9 = arrayList6;
                    C0873g gVar2 = new C0873g(eVar2, eVar, z, aVar5);
                    C0732w.m3149a(m, gVar);
                    arrayList5.addAll(aVar3.values());
                    if (!arrayList8.isEmpty()) {
                        View view11 = (View) aVar3.get(arrayList8.get(0));
                        i0Var2.mo3495p(obj6, view11);
                        view6 = view11;
                    } else {
                        view6 = view9;
                    }
                    arrayList4 = arrayList9;
                    arrayList4.addAll(aVar5.values());
                    if (!O2.isEmpty()) {
                        View view12 = (View) aVar5.get(O2.get(0));
                        if (view12 != null) {
                            C0732w.m3149a(mo3560m(), new C0874h(i0Var2, view12, rect2));
                            view4 = view10;
                            z3 = true;
                            i0Var2.mo3497s(obj6, view4, arrayList5);
                            arrayList3 = arrayList5;
                            rect = rect2;
                            view3 = view4;
                            i0Var = i0Var2;
                            i0Var2.mo3493n(obj6, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj6, arrayList4);
                            Boolean bool = Boolean.TRUE;
                            eVar4 = eVar;
                            hashMap2 = hashMap4;
                            hashMap2.put(eVar4, bool);
                            eVar3 = eVar2;
                            hashMap2.put(eVar3, bool);
                            obj4 = obj6;
                        }
                    }
                    view4 = view10;
                    i0Var2.mo3497s(obj6, view4, arrayList5);
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    i0Var = i0Var2;
                    i0Var2.mo3493n(obj6, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj6, arrayList4);
                    Boolean bool2 = Boolean.TRUE;
                    eVar4 = eVar;
                    hashMap2 = hashMap4;
                    hashMap2.put(eVar4, bool2);
                    eVar3 = eVar2;
                    hashMap2.put(eVar3, bool2);
                    obj4 = obj6;
                }
            }
            eVar5 = eVar4;
            arrayList5 = arrayList3;
            rect2 = rect;
            hashMap3 = hashMap2;
            aVar2 = aVar;
            z2 = z;
            arrayList6 = arrayList4;
            i0Var2 = i0Var;
            C0914l0.C0919e eVar7 = eVar3;
            view5 = view3;
            eVar6 = eVar7;
        }
        View view13 = view6;
        C2335a aVar6 = aVar2;
        ArrayList arrayList10 = arrayList6;
        C0914l0.C0919e eVar8 = eVar5;
        ArrayList arrayList11 = arrayList5;
        Rect rect3 = rect2;
        C0904i0 i0Var3 = i0Var2;
        HashMap hashMap5 = hashMap3;
        View view14 = view5;
        C0914l0.C0919e eVar9 = eVar6;
        View view15 = view14;
        ArrayList arrayList12 = new ArrayList();
        Object obj7 = null;
        Object obj8 = null;
        for (C0879m next4 : list) {
            if (next4.mo3407d()) {
                hashMap5.put(next4.mo3405b(), Boolean.FALSE);
                next4.mo3404a();
            } else {
                Object f2 = i0Var3.mo3489f(next4.mo3410h());
                C0914l0.C0919e b = next4.mo3405b();
                boolean z4 = obj4 != null && (b == eVar8 || b == eVar9);
                if (f2 == null) {
                    if (!z4) {
                        hashMap5.put(b, Boolean.FALSE);
                        next4.mo3404a();
                    }
                    arrayList = arrayList10;
                    str3 = str;
                    arrayList2 = arrayList11;
                    view = view15;
                    obj = obj7;
                    hashMap = hashMap5;
                    view2 = view13;
                    List<C0914l0.C0919e> list3 = list2;
                } else {
                    str3 = str;
                    ArrayList arrayList13 = new ArrayList();
                    Object obj9 = obj7;
                    mo3390t(arrayList13, b.mo3571f().f2948L);
                    if (z4) {
                        if (b == eVar8) {
                            arrayList13.removeAll(arrayList11);
                        } else {
                            arrayList13.removeAll(arrayList10);
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        i0Var3.mo3485a(f2, view15);
                        List<C0914l0.C0919e> list4 = list2;
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        view = view15;
                        obj3 = obj8;
                        hashMap = hashMap5;
                        obj2 = obj9;
                    } else {
                        i0Var3.mo3486b(f2, arrayList13);
                        view = view15;
                        obj2 = obj9;
                        arrayList2 = arrayList11;
                        obj3 = obj8;
                        arrayList = arrayList10;
                        C0914l0.C0919e eVar10 = eVar9;
                        hashMap = hashMap5;
                        i0Var3.mo3493n(f2, f2, arrayList13, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (b.mo3570e() == C0914l0.C0919e.C0922c.GONE) {
                            list2.remove(b);
                            ArrayList arrayList14 = new ArrayList(arrayList13);
                            arrayList14.remove(b.mo3571f().f2948L);
                            i0Var3.mo3492m(f2, b.mo3571f().f2948L, arrayList14);
                            C0732w.m3149a(mo3560m(), new C0875i(arrayList13));
                        } else {
                            List<C0914l0.C0919e> list5 = list2;
                        }
                    }
                    if (b.mo3570e() == C0914l0.C0919e.C0922c.VISIBLE) {
                        arrayList12.addAll(arrayList13);
                        if (z3) {
                            i0Var3.mo3494o(f2, rect3);
                        }
                        view2 = view13;
                    } else {
                        view2 = view13;
                        i0Var3.mo3495p(f2, view2);
                    }
                    hashMap.put(b, Boolean.TRUE);
                    if (next4.mo3412j()) {
                        obj8 = i0Var3.mo3491k(obj3, f2, (Object) null);
                        obj = obj2;
                    } else {
                        obj = i0Var3.mo3491k(obj2, f2, (Object) null);
                        obj8 = obj3;
                    }
                }
                eVar9 = eVar2;
                hashMap5 = hashMap;
                obj7 = obj;
                view13 = view2;
                str = str3;
                view15 = view;
                arrayList11 = arrayList2;
                arrayList10 = arrayList;
            }
        }
        ArrayList arrayList15 = arrayList10;
        String str4 = str;
        ArrayList arrayList16 = arrayList11;
        HashMap hashMap6 = hashMap5;
        Object j = i0Var3.mo3490j(obj8, obj7, obj4);
        if (j == null) {
            return hashMap6;
        }
        for (C0879m next5 : list) {
            if (!next5.mo3407d()) {
                Object h = next5.mo3410h();
                C0914l0.C0919e b2 = next5.mo3405b();
                HashMap hashMap7 = hashMap6;
                boolean z5 = obj4 != null && (b2 == eVar8 || b2 == eVar2);
                if (h == null && !z5) {
                    str2 = str4;
                } else if (!C0735z.m3188V(mo3560m())) {
                    if (C0937w.m4207H0(2)) {
                        str2 = str4;
                        Log.v(str2, "SpecialEffectsController: Container " + mo3560m() + " has not been laid out. Completing operation " + b2);
                    } else {
                        str2 = str4;
                    }
                    next5.mo3404a();
                } else {
                    str2 = str4;
                    i0Var3.mo3496q(next5.mo3405b().mo3571f(), j, next5.mo3406c(), new C0876j(next5, b2));
                }
                hashMap6 = hashMap7;
                str4 = str2;
            }
        }
        HashMap hashMap8 = hashMap6;
        String str5 = str4;
        if (!C0735z.m3188V(mo3560m())) {
            return hashMap8;
        }
        C0894g0.m4027d(arrayList12, 4);
        ArrayList arrayList17 = arrayList15;
        ArrayList<String> l = i0Var3.mo3519l(arrayList17);
        if (C0937w.m4207H0(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it6 = arrayList16.iterator();
            while (it6.hasNext()) {
                View view16 = (View) it6.next();
                Log.v(str5, "View: " + view16 + " Name: " + C0735z.m3176M(view16));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            Iterator it7 = arrayList17.iterator();
            while (it7.hasNext()) {
                View view17 = (View) it7.next();
                Log.v(str5, "View: " + view17 + " Name: " + C0735z.m3176M(view17));
            }
        }
        i0Var3.mo3487c(mo3560m(), j);
        i0Var3.mo3520r(mo3560m(), arrayList16, arrayList17, l, aVar6);
        C0894g0.m4027d(arrayList12, 0);
        i0Var3.mo3498t(obj4, arrayList16, arrayList17);
        return hashMap8;
    }

    /* renamed from: y */
    private void m3912y(List<C0914l0.C0919e> list) {
        Fragment f = list.get(list.size() - 1).mo3571f();
        for (C0914l0.C0919e next : list) {
            next.mo3571f().f2951O.f2999c = f.f2951O.f2999c;
            next.mo3571f().f2951O.f3000d = f.f2951O.f3000d;
            next.mo3571f().f2951O.f3001e = f.f2951O.f3001e;
            next.mo3571f().f2951O.f3002f = f.f2951O.f3002f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3388f(List<C0914l0.C0919e> list, boolean z) {
        C0914l0.C0919e eVar = null;
        C0914l0.C0919e eVar2 = null;
        for (C0914l0.C0919e next : list) {
            C0914l0.C0919e.C0922c c = C0914l0.C0919e.C0922c.m4161c(next.mo3571f().f2948L);
            int i = C0866a.f3059a[next.mo3570e().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (c == C0914l0.C0919e.C0922c.VISIBLE && eVar == null) {
                    eVar = next;
                }
            } else if (i == 4 && c != C0914l0.C0919e.C0922c.VISIBLE) {
                eVar2 = next;
            }
        }
        if (C0937w.m4207H0(2)) {
            Log.v("FragmentManager", "Executing operations from " + eVar + " to " + eVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C0914l0.C0919e> arrayList3 = new ArrayList<>(list);
        m3912y(list);
        for (C0914l0.C0919e next2 : list) {
            C0549e eVar3 = new C0549e();
            next2.mo3575j(eVar3);
            arrayList.add(new C0877k(next2, eVar3, z));
            C0549e eVar4 = new C0549e();
            next2.mo3575j(eVar4);
            boolean z2 = false;
            if (z) {
                if (next2 != eVar) {
                    arrayList2.add(new C0879m(next2, eVar4, z, z2));
                    next2.mo3567a(new C0867b(arrayList3, next2));
                }
            } else if (next2 != eVar2) {
                arrayList2.add(new C0879m(next2, eVar4, z, z2));
                next2.mo3567a(new C0867b(arrayList3, next2));
            }
            z2 = true;
            arrayList2.add(new C0879m(next2, eVar4, z, z2));
            next2.mo3567a(new C0867b(arrayList3, next2));
        }
        Map<C0914l0.C0919e, Boolean> x = m3911x(arrayList2, arrayList3, z, eVar, eVar2);
        m3910w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        for (C0914l0.C0919e s : arrayList3) {
            mo3389s(s);
        }
        arrayList3.clear();
        if (C0937w.m4207H0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + eVar + " to " + eVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3389s(C0914l0.C0919e eVar) {
        eVar.mo3570e().mo3578a(eVar.mo3571f().f2948L);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo3390t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!C0661c0.m2854a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        mo3390t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3391u(Map<String, View> map, View view) {
        String M = C0735z.m3176M(view);
        if (M != null) {
            map.put(M, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    mo3391u(map, childAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo3392v(C2335a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C0735z.m3176M((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
