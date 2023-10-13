package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.core.util.C0604a;
import androidx.window.layout.C1200g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p041f3.C1920g;
import p041f3.C1924k;
import p101p0.C2914h;
import p127t2.C3187s;

/* renamed from: androidx.window.layout.n */
public final class C1226n implements C1231p {

    /* renamed from: c */
    public static final C1227a f4247c = new C1227a((C1920g) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile C1226n f4248d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final ReentrantLock f4249e = new ReentrantLock();

    /* renamed from: a */
    private C1200g f4250a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<C1229c> f4251b = new CopyOnWriteArrayList<>();

    /* renamed from: androidx.window.layout.n$a */
    public static final class C1227a {
        private C1227a() {
        }

        public /* synthetic */ C1227a(C1920g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1226n mo5047a(Context context) {
            C1924k.m9141g(context, "context");
            if (C1226n.f4248d == null) {
                ReentrantLock d = C1226n.f4249e;
                d.lock();
                try {
                    if (C1226n.f4248d == null) {
                        C1226n.f4248d = new C1226n(C1226n.f4247c.mo5048b(context));
                    }
                    C3187s sVar = C3187s.f10561a;
                } finally {
                    d.unlock();
                }
            }
            C1226n c = C1226n.f4248d;
            C1924k.m9138d(c);
            return c;
        }

        /* renamed from: b */
        public final C1200g mo5048b(Context context) {
            C1924k.m9141g(context, "context");
            try {
                if (!mo5049c(SidecarCompat.f4184f.mo4991c())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (!sidecarCompat.mo4984l()) {
                    return null;
                }
                return sidecarCompat;
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: c */
        public final boolean mo5049c(C2914h hVar) {
            return hVar != null && hVar.compareTo(C2914h.f9654i.mo10089a()) >= 0;
        }
    }

    /* renamed from: androidx.window.layout.n$b */
    public final class C1228b implements C1200g.C1201a {

        /* renamed from: a */
        final /* synthetic */ C1226n f4252a;

        public C1228b(C1226n nVar) {
            C1924k.m9141g(nVar, "this$0");
            this.f4252a = nVar;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public void mo4992a(Activity activity, C1240v vVar) {
            C1924k.m9141g(activity, "activity");
            C1924k.m9141g(vVar, "newLayout");
            Iterator<C1229c> it = this.f4252a.mo5046h().iterator();
            while (it.hasNext()) {
                C1229c next = it.next();
                if (C1924k.m9136b(next.mo5051d(), activity)) {
                    next.mo5050b(vVar);
                }
            }
        }
    }

    /* renamed from: androidx.window.layout.n$c */
    public static final class C1229c {

        /* renamed from: a */
        private final Activity f4253a;

        /* renamed from: b */
        private final Executor f4254b;

        /* renamed from: c */
        private final C0604a<C1240v> f4255c;

        /* renamed from: d */
        private C1240v f4256d;

        public C1229c(Activity activity, Executor executor, C0604a<C1240v> aVar) {
            C1924k.m9141g(activity, "activity");
            C1924k.m9141g(executor, "executor");
            C1924k.m9141g(aVar, "callback");
            this.f4253a = activity;
            this.f4254b = executor;
            this.f4255c = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m6044c(C1229c cVar, C1240v vVar) {
            C1924k.m9141g(cVar, "this$0");
            C1924k.m9141g(vVar, "$newLayoutInfo");
            cVar.f4255c.accept(vVar);
        }

        /* renamed from: b */
        public final void mo5050b(C1240v vVar) {
            C1924k.m9141g(vVar, "newLayoutInfo");
            this.f4256d = vVar;
            this.f4254b.execute(new C1230o(this, vVar));
        }

        /* renamed from: d */
        public final Activity mo5051d() {
            return this.f4253a;
        }

        /* renamed from: e */
        public final C0604a<C1240v> mo5052e() {
            return this.f4255c;
        }

        /* renamed from: f */
        public final C1240v mo5053f() {
            return this.f4256d;
        }
    }

    public C1226n(C1200g gVar) {
        this.f4250a = gVar;
        C1200g gVar2 = this.f4250a;
        if (gVar2 != null) {
            gVar2.mo4978a(new C1228b(this));
        }
    }

    /* renamed from: f */
    private final void m6033f(Activity activity) {
        C1200g gVar;
        CopyOnWriteArrayList<C1229c> copyOnWriteArrayList = this.f4251b;
        boolean z = false;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C1924k.m9136b(((C1229c) it.next()).mo5051d(), activity)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (!z && (gVar = this.f4250a) != null) {
            gVar.mo4979b(activity);
        }
    }

    /* renamed from: i */
    private final boolean m6034i(Activity activity) {
        CopyOnWriteArrayList<C1229c> copyOnWriteArrayList = this.f4251b;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (C1229c d : copyOnWriteArrayList) {
            if (C1924k.m9136b(d.mo5051d(), activity)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo5006a(Activity activity, Executor executor, C0604a<C1240v> aVar) {
        C1240v vVar;
        T t;
        C1924k.m9141g(activity, "activity");
        C1924k.m9141g(executor, "executor");
        C1924k.m9141g(aVar, "callback");
        ReentrantLock reentrantLock = f4249e;
        reentrantLock.lock();
        try {
            C1200g g = mo5045g();
            if (g == null) {
                aVar.accept(new C1240v(C3263l.m14369f()));
                return;
            }
            boolean i = m6034i(activity);
            C1229c cVar = new C1229c(activity, executor, aVar);
            mo5046h().add(cVar);
            if (!i) {
                g.mo4980c(activity);
            } else {
                Iterator<T> it = mo5046h().iterator();
                while (true) {
                    vVar = null;
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C1924k.m9136b(activity, ((C1229c) t).mo5051d())) {
                        break;
                    }
                }
                C1229c cVar2 = (C1229c) t;
                if (cVar2 != null) {
                    vVar = cVar2.mo5053f();
                }
                if (vVar != null) {
                    cVar.mo5050b(vVar);
                }
            }
            C3187s sVar = C3187s.f10561a;
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public void mo5007b(C0604a<C1240v> aVar) {
        C1924k.m9141g(aVar, "callback");
        synchronized (f4249e) {
            if (mo5045g() != null) {
                ArrayList<C1229c> arrayList = new ArrayList<>();
                Iterator<C1229c> it = mo5046h().iterator();
                while (it.hasNext()) {
                    C1229c next = it.next();
                    if (next.mo5052e() == aVar) {
                        C1924k.m9140f(next, "callbackWrapper");
                        arrayList.add(next);
                    }
                }
                mo5046h().removeAll(arrayList);
                for (C1229c d : arrayList) {
                    m6033f(d.mo5051d());
                }
                C3187s sVar = C3187s.f10561a;
            }
        }
    }

    /* renamed from: g */
    public final C1200g mo5045g() {
        return this.f4250a;
    }

    /* renamed from: h */
    public final CopyOnWriteArrayList<C1229c> mo5046h() {
        return this.f4251b;
    }
}
