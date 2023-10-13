package p017c0;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p041f3.C1924k;

/* renamed from: c0.e */
public final class C1288e extends C1291h {

    /* renamed from: e */
    private final ViewGroup f4613e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1288e(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        C1924k.m9141g(fragment, "fragment");
        this.f4613e = viewGroup;
    }
}
