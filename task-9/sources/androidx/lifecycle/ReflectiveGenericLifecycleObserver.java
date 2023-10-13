package androidx.lifecycle;

import androidx.lifecycle.C0967a;
import androidx.lifecycle.C0988f;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C1002j {

    /* renamed from: d */
    private final Object f3369d;

    /* renamed from: e */
    private final C0967a.C0968a f3370e;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3369d = obj;
        this.f3370e = C0967a.f3395c.mo3754c(obj.getClass());
    }

    /* renamed from: j */
    public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
        this.f3370e.mo3756a(mVar, aVar, this.f3369d);
    }
}
