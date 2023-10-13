package androidx.activity;

import androidx.core.util.C0604a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.g */
public abstract class C0058g {

    /* renamed from: a */
    private boolean f198a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0052a> f199b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private C0604a<Boolean> f200c;

    public C0058g(boolean z) {
        this.f198a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo164a(C0052a aVar) {
        this.f199b.add(aVar);
    }

    /* renamed from: b */
    public abstract void mo165b();

    /* renamed from: c */
    public final boolean mo166c() {
        return this.f198a;
    }

    /* renamed from: d */
    public final void mo167d() {
        Iterator<C0052a> it = this.f199b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo168e(C0052a aVar) {
        this.f199b.remove(aVar);
    }

    /* renamed from: f */
    public final void mo169f(boolean z) {
        this.f198a = z;
        C0604a<Boolean> aVar = this.f200c;
        if (aVar != null) {
            aVar.accept(Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo170g(C0604a<Boolean> aVar) {
        this.f200c = aVar;
    }
}
