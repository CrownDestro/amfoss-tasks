package androidx.lifecycle;

import androidx.lifecycle.C0988f;
import p041f3.C1924k;
import p065j0.C2312c;

public final class SavedStateHandleController implements C1002j {

    /* renamed from: d */
    private final String f3387d;

    /* renamed from: e */
    private final C1026x f3388e;

    /* renamed from: f */
    private boolean f3389f;

    /* renamed from: a */
    public final void mo3752a(C2312c cVar, C0988f fVar) {
        C1924k.m9141g(cVar, "registry");
        C1924k.m9141g(fVar, "lifecycle");
        if (!this.f3389f) {
            this.f3389f = true;
            fVar.mo3774a(this);
            cVar.mo8631h(this.f3387d, this.f3388e.mo3832c());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    /* renamed from: b */
    public final boolean mo3753b() {
        return this.f3389f;
    }

    /* renamed from: j */
    public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
        C1924k.m9141g(mVar, "source");
        C1924k.m9141g(aVar, "event");
        if (aVar == C0988f.C0989a.ON_DESTROY) {
            this.f3389f = false;
            mVar.mo102a().mo3777d(this);
        }
    }
}
