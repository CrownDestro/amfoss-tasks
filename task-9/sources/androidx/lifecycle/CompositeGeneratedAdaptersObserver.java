package androidx.lifecycle;

import androidx.lifecycle.C0988f;
import p041f3.C1924k;

public final class CompositeGeneratedAdaptersObserver implements C1002j {

    /* renamed from: d */
    private final C0984d[] f3338d;

    public CompositeGeneratedAdaptersObserver(C0984d[] dVarArr) {
        C1924k.m9141g(dVarArr, "generatedAdapters");
        this.f3338d = dVarArr;
    }

    /* renamed from: j */
    public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
        C1924k.m9141g(mVar, "source");
        C1924k.m9141g(aVar, "event");
        C1011q qVar = new C1011q();
        for (C0984d a : this.f3338d) {
            a.mo3773a(mVar, aVar, false, qVar);
        }
        for (C0984d a2 : this.f3338d) {
            a2.mo3773a(mVar, aVar, true, qVar);
        }
    }
}
