package p017c0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.C0937w;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p041f3.C1920g;
import p041f3.C1924k;

/* renamed from: c0.d */
public final class C1283d {

    /* renamed from: a */
    public static final C1283d f4597a = new C1283d();

    /* renamed from: b */
    private static C1286c f4598b = C1286c.f4609e;

    /* renamed from: c0.d$a */
    public enum C1284a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: c0.d$b */
    public interface C1285b {
        /* renamed from: a */
        void mo5110a(C1291h hVar);
    }

    /* renamed from: c0.d$c */
    public static final class C1286c {

        /* renamed from: d */
        public static final C1287a f4608d = new C1287a((C1920g) null);

        /* renamed from: e */
        public static final C1286c f4609e = new C1286c(C3258h0.m14331b(), (C1285b) null, C3248c0.m14286d());

        /* renamed from: a */
        private final Set<C1284a> f4610a;

        /* renamed from: b */
        private final C1285b f4611b;

        /* renamed from: c */
        private final Map<String, Set<Class<? extends C1291h>>> f4612c;

        /* renamed from: c0.d$c$a */
        public static final class C1287a {
            private C1287a() {
            }

            public /* synthetic */ C1287a(C1920g gVar) {
                this();
            }
        }

        public C1286c(Set<? extends C1284a> set, C1285b bVar, Map<String, ? extends Set<Class<? extends C1291h>>> map) {
            C1924k.m9141g(set, "flags");
            C1924k.m9141g(map, "allowedViolations");
            this.f4610a = set;
            this.f4611b = bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                linkedHashMap.put((String) next.getKey(), (Set) next.getValue());
            }
            this.f4612c = linkedHashMap;
        }

        /* renamed from: a */
        public final Set<C1284a> mo5111a() {
            return this.f4610a;
        }

        /* renamed from: b */
        public final C1285b mo5112b() {
            return this.f4611b;
        }

        /* renamed from: c */
        public final Map<String, Set<Class<? extends C1291h>>> mo5113c() {
            return this.f4612c;
        }
    }

    private C1283d() {
    }

    /* renamed from: c */
    private final C1286c m6152c(Fragment fragment) {
        while (fragment != null) {
            if (fragment.mo3242W()) {
                C0937w D = fragment.mo3207D();
                C1924k.m9140f(D, "declaringFragment.parentFragmentManager");
                if (D.mo3616A0() != null) {
                    C1286c A0 = D.mo3616A0();
                    C1924k.m9138d(A0);
                    return A0;
                }
            }
            fragment = fragment.mo3205C();
        }
        return f4598b;
    }

    /* renamed from: d */
    private final void m6153d(C1286c cVar, C1291h hVar) {
        Fragment a = hVar.mo5114a();
        String name = a.getClass().getName();
        if (cVar.mo5111a().contains(C1284a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, hVar);
        }
        if (cVar.mo5112b() != null) {
            m6161l(a, new C1281b(cVar, hVar));
        }
        if (cVar.mo5111a().contains(C1284a.PENALTY_DEATH)) {
            m6161l(a, new C1282c(name, hVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m6154e(C1286c cVar, C1291h hVar) {
        C1924k.m9141g(cVar, "$policy");
        C1924k.m9141g(hVar, "$violation");
        cVar.mo5112b().mo5110a(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m6155f(String str, C1291h hVar) {
        C1924k.m9141g(hVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, hVar);
        throw hVar;
    }

    /* renamed from: g */
    private final void m6156g(C1291h hVar) {
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + hVar.mo5114a().getClass().getName(), hVar);
        }
    }

    /* renamed from: h */
    public static final void m6157h(Fragment fragment, String str) {
        C1924k.m9141g(fragment, "fragment");
        C1924k.m9141g(str, "previousFragmentId");
        C1280a aVar = new C1280a(fragment, str);
        C1283d dVar = f4597a;
        dVar.m6156g(aVar);
        C1286c c = dVar.m6152c(fragment);
        if (c.mo5111a().contains(C1284a.DETECT_FRAGMENT_REUSE) && dVar.m6162m(c, fragment.getClass(), aVar.getClass())) {
            dVar.m6153d(c, aVar);
        }
    }

    /* renamed from: i */
    public static final void m6158i(Fragment fragment, ViewGroup viewGroup) {
        C1924k.m9141g(fragment, "fragment");
        C1288e eVar = new C1288e(fragment, viewGroup);
        C1283d dVar = f4597a;
        dVar.m6156g(eVar);
        C1286c c = dVar.m6152c(fragment);
        if (c.mo5111a().contains(C1284a.DETECT_FRAGMENT_TAG_USAGE) && dVar.m6162m(c, fragment.getClass(), eVar.getClass())) {
            dVar.m6153d(c, eVar);
        }
    }

    /* renamed from: j */
    public static final void m6159j(Fragment fragment) {
        C1924k.m9141g(fragment, "fragment");
        C1289f fVar = new C1289f(fragment);
        C1283d dVar = f4597a;
        dVar.m6156g(fVar);
        C1286c c = dVar.m6152c(fragment);
        if (c.mo5111a().contains(C1284a.DETECT_TARGET_FRAGMENT_USAGE) && dVar.m6162m(c, fragment.getClass(), fVar.getClass())) {
            dVar.m6153d(c, fVar);
        }
    }

    /* renamed from: k */
    public static final void m6160k(Fragment fragment, ViewGroup viewGroup) {
        C1924k.m9141g(fragment, "fragment");
        C1924k.m9141g(viewGroup, "container");
        C1292i iVar = new C1292i(fragment, viewGroup);
        C1283d dVar = f4597a;
        dVar.m6156g(iVar);
        C1286c c = dVar.m6152c(fragment);
        if (c.mo5111a().contains(C1284a.DETECT_WRONG_FRAGMENT_CONTAINER) && dVar.m6162m(c, fragment.getClass(), iVar.getClass())) {
            dVar.m6153d(c, iVar);
        }
    }

    /* renamed from: l */
    private final void m6161l(Fragment fragment, Runnable runnable) {
        if (fragment.mo3242W()) {
            Handler t = fragment.mo3207D().mo3684u0().mo3596t();
            C1924k.m9140f(t, "fragment.parentFragmentManager.host.handler");
            if (!C1924k.m9136b(t.getLooper(), Looper.myLooper())) {
                t.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    /* renamed from: m */
    private final boolean m6162m(C1286c cVar, Class<? extends Fragment> cls, Class<? extends C1291h> cls2) {
        Set set = cVar.mo5113c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (C1924k.m9136b(cls2.getSuperclass(), C1291h.class) || !C3271t.m14404x(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
