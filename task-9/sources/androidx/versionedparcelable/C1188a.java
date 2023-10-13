package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p070k.C2335a;
import p089n0.C2670a;

/* renamed from: androidx.versionedparcelable.a */
public abstract class C1188a {

    /* renamed from: a */
    protected final C2335a<String, Method> f4171a;

    /* renamed from: b */
    protected final C2335a<String, Method> f4172b;

    /* renamed from: c */
    protected final C2335a<String, Class> f4173c;

    public C1188a(C2335a<String, Method> aVar, C2335a<String, Method> aVar2, C2335a<String, Class> aVar3) {
        this.f4171a = aVar;
        this.f4172b = aVar2;
        this.f4173c = aVar3;
    }

    /* renamed from: N */
    private void m5874N(C2670a aVar) {
        try {
            mo4950I(m5875c(aVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(aVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private Class m5875c(Class<? extends C2670a> cls) {
        Class cls2 = this.f4173c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f4173c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m5876d(String str) {
        Class<C1188a> cls = C1188a.class;
        Method method = this.f4171a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f4171a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    private Method m5877e(Class cls) {
        Method method = this.f4172b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = m5875c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", new Class[]{cls, C1188a.class});
        this.f4172b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo4942A(byte[] bArr);

    /* renamed from: B */
    public void mo4943B(byte[] bArr, int i) {
        mo4974w(i);
        mo4942A(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo4944C(CharSequence charSequence);

    /* renamed from: D */
    public void mo4945D(CharSequence charSequence, int i) {
        mo4974w(i);
        mo4944C(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo4946E(int i);

    /* renamed from: F */
    public void mo4947F(int i, int i2) {
        mo4974w(i2);
        mo4946E(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo4948G(Parcelable parcelable);

    /* renamed from: H */
    public void mo4949H(Parcelable parcelable, int i) {
        mo4974w(i);
        mo4948G(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo4950I(String str);

    /* renamed from: J */
    public void mo4951J(String str, int i) {
        mo4974w(i);
        mo4950I(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public <T extends C2670a> void mo4952K(T t, C1188a aVar) {
        try {
            m5877e(t.getClass()).invoke((Object) null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo4953L(C2670a aVar) {
        if (aVar == null) {
            mo4950I((String) null);
            return;
        }
        m5874N(aVar);
        C1188a b = mo4956b();
        mo4952K(aVar, b);
        b.mo4955a();
    }

    /* renamed from: M */
    public void mo4954M(C2670a aVar, int i) {
        mo4974w(i);
        mo4953L(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4955a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1188a mo4956b();

    /* renamed from: f */
    public boolean mo4957f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo4958g();

    /* renamed from: h */
    public boolean mo4959h(boolean z, int i) {
        return !mo4964m(i) ? z : mo4958g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract byte[] mo4960i();

    /* renamed from: j */
    public byte[] mo4961j(byte[] bArr, int i) {
        return !mo4964m(i) ? bArr : mo4960i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract CharSequence mo4962k();

    /* renamed from: l */
    public CharSequence mo4963l(CharSequence charSequence, int i) {
        return !mo4964m(i) ? charSequence : mo4962k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo4964m(int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public <T extends C2670a> T mo4965n(String str, C1188a aVar) {
        try {
            return (C2670a) m5876d(str).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo4966o();

    /* renamed from: p */
    public int mo4967p(int i, int i2) {
        return !mo4964m(i2) ? i : mo4966o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract <T extends Parcelable> T mo4968q();

    /* renamed from: r */
    public <T extends Parcelable> T mo4969r(T t, int i) {
        return !mo4964m(i) ? t : mo4968q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract String mo4970s();

    /* renamed from: t */
    public String mo4971t(String str, int i) {
        return !mo4964m(i) ? str : mo4970s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends C2670a> T mo4972u() {
        String s = mo4970s();
        if (s == null) {
            return null;
        }
        return mo4965n(s, mo4956b());
    }

    /* renamed from: v */
    public <T extends C2670a> T mo4973v(T t, int i) {
        return !mo4964m(i) ? t : mo4972u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo4974w(int i);

    /* renamed from: x */
    public void mo4975x(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo4976y(boolean z);

    /* renamed from: z */
    public void mo4977z(boolean z, int i) {
        mo4974w(i);
        mo4976y(z);
    }
}
