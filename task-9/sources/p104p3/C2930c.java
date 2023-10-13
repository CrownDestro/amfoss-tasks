package p104p3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.C2399c0;
import kotlinx.coroutines.internal.C2417k;
import kotlinx.coroutines.internal.C2421n;
import kotlinx.coroutines.internal.C2423p;
import p034e3.C1780l;
import p041f3.C1920g;
import p041f3.C1924k;
import p092n3.C2763l0;
import p092n3.C2770n;
import p104p3.C2939i;
import p127t2.C3187s;

/* renamed from: p3.c */
public abstract class C2930c<E> implements C2953t<E> {

    /* renamed from: d */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9683d = AtomicReferenceFieldUpdater.newUpdater(C2930c.class, Object.class, "onCloseHandler");

    /* renamed from: b */
    protected final C1780l<E, C3187s> f9684b;

    /* renamed from: c */
    private final C2421n f9685c = new C2421n();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* renamed from: p3.c$a */
    public static final class C2931a<E> extends C2952s {

        /* renamed from: g */
        public final E f9686g;

        public C2931a(E e) {
            this.f9686g = e;
        }

        /* renamed from: C */
        public void mo10120C() {
        }

        /* renamed from: D */
        public Object mo10121D() {
            return this.f9686g;
        }

        /* renamed from: E */
        public C2399c0 mo10122E(C2423p.C2425b bVar) {
            return C2770n.f9071a;
        }

        public String toString() {
            return "SendBuffered@" + C2763l0.m12400b(this) + '(' + this.f9686g + ')';
        }
    }

    public C2930c(C1780l<? super E, C3187s> lVar) {
        this.f9684b = lVar;
    }

    /* renamed from: b */
    private final int m13260b() {
        C2421n nVar = this.f9685c;
        int i = 0;
        for (C2423p pVar = (C2423p) nVar.mo8995s(); !C1924k.m9136b(pVar, nVar); pVar = pVar.mo8996t()) {
            if (pVar instanceof C2423p) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: f */
    private final String m13261f() {
        String str;
        C2423p t = this.f9685c.mo8996t();
        if (t == this.f9685c) {
            return "EmptyQueue";
        }
        if (t instanceof C2943j) {
            str = t.toString();
        } else if (t instanceof C2948o) {
            str = "ReceiveQueued";
        } else if (t instanceof C2952s) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + t;
        }
        C2423p u = this.f9685c.mo8998u();
        if (u == t) {
            return str;
        }
        String str2 = str + ",queueSize=" + m13260b();
        if (!(u instanceof C2943j)) {
            return str2;
        }
        return str2 + ",closedForSend=" + u;
    }

    /* renamed from: g */
    private final void m13262g(C2943j<?> jVar) {
        Object b = C2417k.m11269b((Object) null, 1, (C1920g) null);
        while (true) {
            C2423p u = jVar.mo8998u();
            C2948o oVar = u instanceof C2948o ? (C2948o) u : null;
            if (oVar == null) {
                break;
            } else if (!oVar.mo9001y()) {
                oVar.mo8999v();
            } else {
                b = C2417k.m11270c(b, oVar);
            }
        }
        if (b != null) {
            if (!(b instanceof ArrayList)) {
                ((C2948o) b).mo10105D(jVar);
            } else {
                ArrayList arrayList = (ArrayList) b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((C2948o) arrayList.get(size)).mo10105D(jVar);
                }
            }
        }
        mo10116j(jVar);
    }

    /* renamed from: h */
    private final Throwable m13263h(C2943j<?> jVar) {
        m13262g(jVar);
        return jVar.mo10133J();
    }

    /* renamed from: a */
    public final Object mo10111a(E e) {
        C2943j<?> jVar;
        C2939i.C2941b bVar;
        Object i = mo10115i(e);
        if (i == C2929b.f9678b) {
            return C2939i.f9700a.mo10129c(C3187s.f10561a);
        }
        if (i == C2929b.f9679c) {
            jVar = mo10113d();
            if (jVar == null) {
                return C2939i.f9700a.mo10128b();
            }
            bVar = C2939i.f9700a;
        } else if (i instanceof C2943j) {
            bVar = C2939i.f9700a;
            jVar = (C2943j) i;
        } else {
            throw new IllegalStateException(("trySend returned " + i).toString());
        }
        return bVar.mo10127a(m13263h(jVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo10112c() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C2943j<?> mo10113d() {
        C2423p u = this.f9685c.mo8998u();
        C2943j<?> jVar = u instanceof C2943j ? (C2943j) u : null;
        if (jVar == null) {
            return null;
        }
        m13262g(jVar);
        return jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C2421n mo10114e() {
        return this.f9685c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Object mo10115i(E e) {
        C2950q l;
        do {
            l = mo10095l();
            if (l == null) {
                return C2929b.f9679c;
            }
        } while (l.mo10107g(e, (C2423p.C2425b) null) == null);
        l.mo10108i(e);
        return l.mo10134d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo10116j(C2423p pVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C2950q<?> mo10117k(E e) {
        C2423p u;
        C2421n nVar = this.f9685c;
        C2931a aVar = new C2931a(e);
        do {
            u = nVar.mo8998u();
            if (u instanceof C2950q) {
                return (C2950q) u;
            }
        } while (!u.mo8993m(aVar, nVar));
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C2950q<E> mo10095l() {
        C2423p pVar;
        C2423p z;
        C2421n nVar = this.f9685c;
        while (true) {
            pVar = (C2423p) nVar.mo8995s();
            if (pVar != nVar && (pVar instanceof C2950q)) {
                if (((((C2950q) pVar) instanceof C2943j) && !pVar.mo8991x()) || (z = pVar.mo9002z()) == null) {
                    break;
                }
                z.mo9000w();
            }
        }
        pVar = null;
        return (C2950q) pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C2952s mo10118m() {
        C2423p pVar;
        C2423p z;
        C2421n nVar = this.f9685c;
        while (true) {
            pVar = (C2423p) nVar.mo8995s();
            if (pVar != nVar && (pVar instanceof C2952s)) {
                if (((((C2952s) pVar) instanceof C2943j) && !pVar.mo8991x()) || (z = pVar.mo9002z()) == null) {
                    break;
                }
                z.mo9000w();
            }
        }
        pVar = null;
        return (C2952s) pVar;
    }

    public String toString() {
        return C2763l0.m12399a(this) + '@' + C2763l0.m12400b(this) + '{' + m13261f() + '}' + mo10112c();
    }
}
