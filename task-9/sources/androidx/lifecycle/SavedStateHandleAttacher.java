package androidx.lifecycle;

import androidx.lifecycle.C0988f;
import p041f3.C1924k;

public final class SavedStateHandleAttacher implements C1002j {

    /* renamed from: d */
    private final C1033z f3386d;

    public SavedStateHandleAttacher(C1033z zVar) {
        C1924k.m9141g(zVar, "provider");
        this.f3386d = zVar;
    }

    /* renamed from: j */
    public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
        C1924k.m9141g(mVar, "source");
        C1924k.m9141g(aVar, "event");
        if (aVar == C0988f.C0989a.ON_CREATE) {
            mVar.mo102a().mo3777d(this);
            this.f3386d.mo3837c();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
