package androidx.lifecycle;

import androidx.lifecycle.C0988f;
import androidx.lifecycle.LegacySavedStateHandleController;
import p041f3.C1924k;
import p065j0.C2312c;

public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements C1002j {

    /* renamed from: d */
    final /* synthetic */ C0988f f3343d;

    /* renamed from: e */
    final /* synthetic */ C2312c f3344e;

    LegacySavedStateHandleController$tryToAddRecreator$1(C0988f fVar, C2312c cVar) {
        this.f3343d = fVar;
        this.f3344e = cVar;
    }

    /* renamed from: j */
    public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
        C1924k.m9141g(mVar, "source");
        C1924k.m9141g(aVar, "event");
        if (aVar == C0988f.C0989a.ON_START) {
            this.f3343d.mo3777d(this);
            this.f3344e.mo8632i(LegacySavedStateHandleController.C0959a.class);
        }
    }
}
