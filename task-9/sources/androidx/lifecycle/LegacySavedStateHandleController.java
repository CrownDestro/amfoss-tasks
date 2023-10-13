package androidx.lifecycle;

import androidx.lifecycle.C0988f;
import p041f3.C1924k;
import p065j0.C2312c;
import p065j0.C2318e;

public final class LegacySavedStateHandleController {

    /* renamed from: a */
    public static final LegacySavedStateHandleController f3342a = new LegacySavedStateHandleController();

    /* renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    public static final class C0959a implements C2312c.C2313a {
        /* renamed from: a */
        public void mo3730a(C2318e eVar) {
            C1924k.m9141g(eVar, "owner");
            if (eVar instanceof C0996g0) {
                C0994f0 o = ((C0996g0) eVar).mo113o();
                C2312c l = eVar.mo111l();
                for (String b : o.mo3785c()) {
                    C0972b0 b2 = o.mo3784b(b);
                    C1924k.m9138d(b2);
                    LegacySavedStateHandleController.m4375a(b2, l, eVar.mo102a());
                }
                if (!o.mo3785c().isEmpty()) {
                    l.mo8632i(C0959a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    private LegacySavedStateHandleController() {
    }

    /* renamed from: a */
    public static final void m4375a(C0972b0 b0Var, C2312c cVar, C0988f fVar) {
        C1924k.m9141g(b0Var, "viewModel");
        C1924k.m9141g(cVar, "registry");
        C1924k.m9141g(fVar, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) b0Var.mo3762c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo3753b()) {
            savedStateHandleController.mo3752a(cVar, fVar);
            f3342a.m4376b(cVar, fVar);
        }
    }

    /* renamed from: b */
    private final void m4376b(C2312c cVar, C0988f fVar) {
        C0988f.C0993b b = fVar.mo3775b();
        if (b == C0988f.C0993b.INITIALIZED || b.mo3782b(C0988f.C0993b.STARTED)) {
            cVar.mo8632i(C0959a.class);
        } else {
            fVar.mo3774a(new LegacySavedStateHandleController$tryToAddRecreator$1(fVar, cVar));
        }
    }
}
