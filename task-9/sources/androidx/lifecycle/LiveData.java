package androidx.lifecycle;

import androidx.lifecycle.C0988f;
import java.util.Map;
import p051h.C1993c;
import p057i.C2080b;

public abstract class LiveData<T> {

    /* renamed from: k */
    static final Object f3350k = new Object();

    /* renamed from: a */
    final Object f3351a = new Object();

    /* renamed from: b */
    private C2080b<C1013s<? super T>, LiveData<T>.c> f3352b = new C2080b<>();

    /* renamed from: c */
    int f3353c = 0;

    /* renamed from: d */
    private boolean f3354d;

    /* renamed from: e */
    private volatile Object f3355e;

    /* renamed from: f */
    volatile Object f3356f;

    /* renamed from: g */
    private int f3357g;

    /* renamed from: h */
    private boolean f3358h;

    /* renamed from: i */
    private boolean f3359i;

    /* renamed from: j */
    private final Runnable f3360j;

    class LifecycleBoundObserver extends LiveData<T>.c implements C1002j {

        /* renamed from: h */
        final C1005m f3361h;

        /* renamed from: i */
        final /* synthetic */ LiveData f3362i;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3745b() {
            this.f3361h.mo102a().mo3777d(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo3746c() {
            return this.f3361h.mo102a().mo3775b().mo3782b(C0988f.C0993b.STARTED);
        }

        /* renamed from: j */
        public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
            C0988f.C0993b b = this.f3361h.mo102a().mo3775b();
            if (b == C0988f.C0993b.DESTROYED) {
                this.f3362i.mo3743h(this.f3365d);
                return;
            }
            C0988f.C0993b bVar = null;
            while (bVar != b) {
                mo3748a(mo3746c());
                bVar = b;
                b = this.f3361h.mo102a().mo3775b();
            }
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C0961a implements Runnable {
        C0961a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f3351a) {
                obj = LiveData.this.f3356f;
                LiveData.this.f3356f = LiveData.f3350k;
            }
            LiveData.this.mo3744i(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private class C0962b extends LiveData<T>.c {
        C0962b(C1013s<? super T> sVar) {
            super(sVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo3746c() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    private abstract class C0963c {

        /* renamed from: d */
        final C1013s<? super T> f3365d;

        /* renamed from: e */
        boolean f3366e;

        /* renamed from: f */
        int f3367f = -1;

        C0963c(C1013s<? super T> sVar) {
            this.f3365d = sVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3748a(boolean z) {
            if (z != this.f3366e) {
                this.f3366e = z;
                LiveData.this.mo3738b(z ? 1 : -1);
                if (this.f3366e) {
                    LiveData.this.mo3739d(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3745b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo3746c();
    }

    public LiveData() {
        Object obj = f3350k;
        this.f3356f = obj;
        this.f3360j = new C0961a();
        this.f3355e = obj;
        this.f3357g = -1;
    }

    /* renamed from: a */
    static void m4387a(String str) {
        if (!C1993c.m9238f().mo7739b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: c */
    private void m4388c(LiveData<T>.c cVar) {
        if (cVar.f3366e) {
            if (!cVar.mo3746c()) {
                cVar.mo3748a(false);
                return;
            }
            int i = cVar.f3367f;
            int i2 = this.f3357g;
            if (i < i2) {
                cVar.f3367f = i2;
                cVar.f3365d.mo3448a(this.f3355e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3738b(int i) {
        int i2 = this.f3353c;
        this.f3353c = i + i2;
        if (!this.f3354d) {
            this.f3354d = true;
            while (true) {
                try {
                    int i3 = this.f3353c;
                    if (i2 != i3) {
                        boolean z = i2 == 0 && i3 > 0;
                        boolean z2 = i2 > 0 && i3 == 0;
                        if (z) {
                            mo3741f();
                        } else if (z2) {
                            mo3742g();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.f3354d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3739d(LiveData<T>.c cVar) {
        if (this.f3358h) {
            this.f3359i = true;
            return;
        }
        this.f3358h = true;
        do {
            this.f3359i = false;
            if (cVar == null) {
                C2080b<K, V>.d z = this.f3352b.mo7847z();
                while (z.hasNext()) {
                    m4388c((C0963c) ((Map.Entry) z.next()).getValue());
                    if (this.f3359i) {
                        break;
                    }
                }
            } else {
                m4388c(cVar);
                cVar = null;
            }
        } while (this.f3359i);
        this.f3358h = false;
    }

    /* renamed from: e */
    public void mo3740e(C1013s<? super T> sVar) {
        m4387a("observeForever");
        C0962b bVar = new C0962b(sVar);
        C0963c C = this.f3352b.mo7833C(sVar, bVar);
        if (C instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (C == null) {
            bVar.mo3748a(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo3741f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo3742g() {
    }

    /* renamed from: h */
    public void mo3743h(C1013s<? super T> sVar) {
        m4387a("removeObserver");
        C0963c D = this.f3352b.mo7834D(sVar);
        if (D != null) {
            D.mo3745b();
            D.mo3748a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo3744i(T t) {
        m4387a("setValue");
        this.f3357g++;
        this.f3355e = t;
        mo3739d((LiveData<T>.c) null);
    }
}
