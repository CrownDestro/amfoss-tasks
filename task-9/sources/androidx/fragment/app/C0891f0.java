package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.C0988f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p017c0.C1283d;

/* renamed from: androidx.fragment.app.f0 */
public abstract class C0891f0 {

    /* renamed from: a */
    private final C0925n f3140a;

    /* renamed from: b */
    private final ClassLoader f3141b;

    /* renamed from: c */
    ArrayList<C0892a> f3142c = new ArrayList<>();

    /* renamed from: d */
    int f3143d;

    /* renamed from: e */
    int f3144e;

    /* renamed from: f */
    int f3145f;

    /* renamed from: g */
    int f3146g;

    /* renamed from: h */
    int f3147h;

    /* renamed from: i */
    boolean f3148i;

    /* renamed from: j */
    boolean f3149j = true;

    /* renamed from: k */
    String f3150k;

    /* renamed from: l */
    int f3151l;

    /* renamed from: m */
    CharSequence f3152m;

    /* renamed from: n */
    int f3153n;

    /* renamed from: o */
    CharSequence f3154o;

    /* renamed from: p */
    ArrayList<String> f3155p;

    /* renamed from: q */
    ArrayList<String> f3156q;

    /* renamed from: r */
    boolean f3157r = false;

    /* renamed from: s */
    ArrayList<Runnable> f3158s;

    /* renamed from: androidx.fragment.app.f0$a */
    static final class C0892a {

        /* renamed from: a */
        int f3159a;

        /* renamed from: b */
        Fragment f3160b;

        /* renamed from: c */
        boolean f3161c;

        /* renamed from: d */
        int f3162d;

        /* renamed from: e */
        int f3163e;

        /* renamed from: f */
        int f3164f;

        /* renamed from: g */
        int f3165g;

        /* renamed from: h */
        C0988f.C0993b f3166h;

        /* renamed from: i */
        C0988f.C0993b f3167i;

        C0892a() {
        }

        C0892a(int i, Fragment fragment) {
            this.f3159a = i;
            this.f3160b = fragment;
            this.f3161c = false;
            C0988f.C0993b bVar = C0988f.C0993b.RESUMED;
            this.f3166h = bVar;
            this.f3167i = bVar;
        }

        C0892a(int i, Fragment fragment, boolean z) {
            this.f3159a = i;
            this.f3160b = fragment;
            this.f3161c = z;
            C0988f.C0993b bVar = C0988f.C0993b.RESUMED;
            this.f3166h = bVar;
            this.f3167i = bVar;
        }
    }

    C0891f0(C0925n nVar, ClassLoader classLoader) {
        this.f3140a = nVar;
        this.f3141b = classLoader;
    }

    /* renamed from: b */
    public C0891f0 mo3478b(int i, Fragment fragment, String str) {
        mo3352j(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0891f0 mo3479c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f2947K = viewGroup;
        return mo3478b(viewGroup.getId(), fragment, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3480d(C0892a aVar) {
        this.f3142c.add(aVar);
        aVar.f3162d = this.f3143d;
        aVar.f3163e = this.f3144e;
        aVar.f3164f = this.f3145f;
        aVar.f3165g = this.f3146g;
    }

    /* renamed from: e */
    public abstract int mo3348e();

    /* renamed from: f */
    public abstract int mo3349f();

    /* renamed from: g */
    public abstract void mo3350g();

    /* renamed from: h */
    public abstract void mo3351h();

    /* renamed from: i */
    public C0891f0 mo3481i() {
        if (!this.f3148i) {
            this.f3149j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3352j(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.f2956T;
        if (str2 != null) {
            C1283d.m6157h(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.f2939C;
            if (str3 == null || str.equals(str3)) {
                fragment.f2939C = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f2939C + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.f2937A;
                if (i3 == 0 || i3 == i) {
                    fragment.f2937A = i;
                    fragment.f2938B = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f2937A + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo3480d(new C0892a(i2, fragment));
    }

    /* renamed from: k */
    public C0891f0 mo3353k(Fragment fragment) {
        mo3480d(new C0892a(3, fragment));
        return this;
    }

    /* renamed from: l */
    public C0891f0 mo3482l(int i, Fragment fragment) {
        return mo3483m(i, fragment, (String) null);
    }

    /* renamed from: m */
    public C0891f0 mo3483m(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo3352j(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: n */
    public C0891f0 mo3484n(boolean z) {
        this.f3157r = z;
        return this;
    }
}
