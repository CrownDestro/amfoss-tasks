package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0988f;
import androidx.lifecycle.C1002j;
import androidx.lifecycle.C1005m;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import p041f3.C1920g;
import p041f3.C1924k;
import p065j0.C2312c;
import p065j0.C2318e;

public final class Recreator implements C1002j {

    /* renamed from: e */
    public static final C1160a f4059e = new C1160a((C1920g) null);

    /* renamed from: d */
    private final C2318e f4060d;

    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C1160a {
        private C1160a() {
        }

        public /* synthetic */ C1160a(C1920g gVar) {
            this();
        }
    }

    /* renamed from: androidx.savedstate.Recreator$b */
    public static final class C1161b implements C2312c.C2315c {

        /* renamed from: a */
        private final Set<String> f4061a = new LinkedHashSet();

        public C1161b(C2312c cVar) {
            C1924k.m9141g(cVar, "registry");
            cVar.mo8631h("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public Bundle mo153a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f4061a));
            return bundle;
        }

        /* renamed from: b */
        public final void mo4767b(String str) {
            C1924k.m9141g(str, "className");
            this.f4061a.add(str);
        }
    }

    public Recreator(C2318e eVar) {
        C1924k.m9141g(eVar, "owner");
        this.f4060d = eVar;
    }

    /* renamed from: a */
    private final void m5776a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C2312c.C2313a.class);
            C1924k.m9140f(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    C1924k.m9140f(newInstance, "{\n                constr…wInstance()\n            }");
                    ((C2312c.C2313a) newInstance).mo3730a(this.f4060d);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    /* renamed from: j */
    public void mo144j(C1005m mVar, C0988f.C0989a aVar) {
        C1924k.m9141g(mVar, "source");
        C1924k.m9141g(aVar, "event");
        if (aVar == C0988f.C0989a.ON_CREATE) {
            mVar.mo102a().mo3777d(this);
            Bundle b = this.f4060d.mo111l().mo8626b("androidx.savedstate.Restarter");
            if (b != null) {
                ArrayList<String> stringArrayList = b.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String a : stringArrayList) {
                        m5776a(a);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
