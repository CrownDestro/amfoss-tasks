package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C0972b0;
import androidx.lifecycle.C0974c0;
import androidx.lifecycle.C0985d0;
import androidx.lifecycle.C0994f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p038f0.C1899a;

/* renamed from: androidx.fragment.app.z */
final class C0956z extends C0972b0 {

    /* renamed from: k */
    private static final C0974c0.C0978b f3330k = new C0957a();

    /* renamed from: d */
    private final HashMap<String, Fragment> f3331d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C0956z> f3332e = new HashMap<>();

    /* renamed from: f */
    private final HashMap<String, C0994f0> f3333f = new HashMap<>();

    /* renamed from: g */
    private final boolean f3334g;

    /* renamed from: h */
    private boolean f3335h = false;

    /* renamed from: i */
    private boolean f3336i = false;

    /* renamed from: j */
    private boolean f3337j = false;

    /* renamed from: androidx.fragment.app.z$a */
    class C0957a implements C0974c0.C0978b {
        C0957a() {
        }

        /* renamed from: a */
        public <T extends C0972b0> T mo3728a(Class<T> cls) {
            return new C0956z(true);
        }

        /* renamed from: b */
        public /* synthetic */ C0972b0 mo3729b(Class cls, C1899a aVar) {
            return C0985d0.m4448b(this, cls, aVar);
        }
    }

    C0956z(boolean z) {
        this.f3334g = z;
    }

    /* renamed from: h */
    private void m4351h(String str) {
        C0956z zVar = this.f3332e.get(str);
        if (zVar != null) {
            zVar.mo3713d();
            this.f3332e.remove(str);
        }
        C0994f0 f0Var = this.f3333f.get(str);
        if (f0Var != null) {
            f0Var.mo3783a();
            this.f3333f.remove(str);
        }
    }

    /* renamed from: k */
    static C0956z m4352k(C0994f0 f0Var) {
        return (C0956z) new C0974c0(f0Var, f3330k).mo3770a(C0956z.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3713d() {
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3335h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3714e(Fragment fragment) {
        if (this.f3337j) {
            if (C0937w.m4207H0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f3331d.containsKey(fragment.f2972i)) {
            this.f3331d.put(fragment.f2972i, fragment);
            if (C0937w.m4207H0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0956z.class != obj.getClass()) {
            return false;
        }
        C0956z zVar = (C0956z) obj;
        return this.f3331d.equals(zVar.f3331d) && this.f3332e.equals(zVar.f3332e) && this.f3333f.equals(zVar.f3333f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3716f(Fragment fragment) {
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        m4351h(fragment.f2972i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3717g(String str) {
        if (C0937w.m4207H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m4351h(str);
    }

    public int hashCode() {
        return (((this.f3331d.hashCode() * 31) + this.f3332e.hashCode()) * 31) + this.f3333f.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment mo3719i(String str) {
        return this.f3331d.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0956z mo3720j(Fragment fragment) {
        C0956z zVar = this.f3332e.get(fragment.f2972i);
        if (zVar != null) {
            return zVar;
        }
        C0956z zVar2 = new C0956z(this.f3334g);
        this.f3332e.put(fragment.f2972i, zVar2);
        return zVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Collection<Fragment> mo3721l() {
        return new ArrayList(this.f3331d.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C0994f0 mo3722m(Fragment fragment) {
        C0994f0 f0Var = this.f3333f.get(fragment.f2972i);
        if (f0Var != null) {
            return f0Var;
        }
        C0994f0 f0Var2 = new C0994f0();
        this.f3333f.put(fragment.f2972i, f0Var2);
        return f0Var2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo3723n() {
        return this.f3335h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3724o(Fragment fragment) {
        if (!this.f3337j) {
            if ((this.f3331d.remove(fragment.f2972i) != null) && C0937w.m4207H0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (C0937w.m4207H0(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo3725p(boolean z) {
        this.f3337j = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo3726q(Fragment fragment) {
        if (!this.f3331d.containsKey(fragment.f2972i)) {
            return true;
        }
        return this.f3334g ? this.f3335h : !this.f3336i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3331d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3332e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3333f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
