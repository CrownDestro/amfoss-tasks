package androidx.activity;

import android.annotation.SuppressLint;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.p008os.C0545a;
import androidx.core.util.C0604a;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C1002j;
import androidx.lifecycle.C1005m;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f180a;

    /* renamed from: b */
    final ArrayDeque<C0058g> f181b = new ArrayDeque<>();

    /* renamed from: c */
    private C0604a<Boolean> f182c;

    /* renamed from: d */
    private OnBackInvokedCallback f183d;

    /* renamed from: e */
    private OnBackInvokedDispatcher f184e;

    /* renamed from: f */
    private boolean f185f = false;

    private class LifecycleOnBackPressedCancellable implements C1002j, C0052a {

        /* renamed from: d */
        private final C0988f f186d;

        /* renamed from: e */
        private final C0058g f187e;

        /* renamed from: f */
        private C0052a f188f;

        LifecycleOnBackPressedCancellable(C0988f fVar, C0058g gVar) {
            this.f186d = fVar;
            this.f187e = gVar;
            fVar.mo3774a(this);
        }

        public void cancel() {
            this.f186d.mo3777d(this);
            this.f187e.mo168e(this);
            C0052a aVar = this.f188f;
            if (aVar != null) {
                aVar.cancel();
                this.f188f = null;
            }
        }

        /* renamed from: j */
        public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
            if (aVar == C0988f.C0989a.ON_START) {
                this.f188f = OnBackPressedDispatcher.this.mo147c(this.f187e);
            } else if (aVar == C0988f.C0989a.ON_STOP) {
                C0052a aVar2 = this.f188f;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == C0988f.C0989a.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    static class C0050a {
        /* renamed from: a */
        static OnBackInvokedCallback m189a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new C0061j(runnable);
        }

        /* renamed from: b */
        static void m190b(Object obj, int i, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        /* renamed from: c */
        static void m191c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$b */
    private class C0051b implements C0052a {

        /* renamed from: d */
        private final C0058g f190d;

        C0051b(C0058g gVar) {
            this.f190d = gVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f181b.remove(this.f190d);
            this.f190d.mo168e(this);
            if (C0545a.m2512c()) {
                this.f190d.mo170g((C0604a<Boolean>) null);
                OnBackPressedDispatcher.this.mo151h();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f180a = runnable;
        if (C0545a.m2512c()) {
            this.f182c = new C0059h(this);
            this.f183d = C0050a.m189a(new C0060i(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m181e(Boolean bool) {
        if (C0545a.m2512c()) {
            mo151h();
        }
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: b */
    public void mo146b(C1005m mVar, C0058g gVar) {
        C0988f a = mVar.mo102a();
        if (a.mo3775b() != C0988f.C0993b.DESTROYED) {
            gVar.mo164a(new LifecycleOnBackPressedCancellable(a, gVar));
            if (C0545a.m2512c()) {
                mo151h();
                gVar.mo170g(this.f182c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0052a mo147c(C0058g gVar) {
        this.f181b.add(gVar);
        C0051b bVar = new C0051b(gVar);
        gVar.mo164a(bVar);
        if (C0545a.m2512c()) {
            mo151h();
            gVar.mo170g(this.f182c);
        }
        return bVar;
    }

    /* renamed from: d */
    public boolean mo148d() {
        Iterator<C0058g> descendingIterator = this.f181b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().mo166c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo149f() {
        Iterator<C0058g> descendingIterator = this.f181b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0058g next = descendingIterator.next();
            if (next.mo166c()) {
                next.mo165b();
                return;
            }
        }
        Runnable runnable = this.f180a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: g */
    public void mo150g(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.f184e = onBackInvokedDispatcher;
        mo151h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo151h() {
        boolean d = mo148d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f184e;
        if (onBackInvokedDispatcher == null) {
            return;
        }
        if (d && !this.f185f) {
            C0050a.m190b(onBackInvokedDispatcher, 0, this.f183d);
            this.f185f = true;
        } else if (!d && this.f185f) {
            C0050a.m191c(onBackInvokedDispatcher, this.f183d);
            this.f185f = false;
        }
    }
}
