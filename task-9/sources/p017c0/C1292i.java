package p017c0;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p041f3.C1924k;

/* renamed from: c0.i */
public final class C1292i extends C1291h {

    /* renamed from: e */
    private final ViewGroup f4615e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1292i(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        C1924k.m9141g(fragment, "fragment");
        C1924k.m9141g(viewGroup, "container");
        this.f4615e = viewGroup;
    }
}
