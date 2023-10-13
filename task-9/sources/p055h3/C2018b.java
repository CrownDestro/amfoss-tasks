package p055h3;

import java.util.Random;
import p041f3.C1924k;

/* renamed from: h3.b */
public final class C2018b extends C2017a {

    /* renamed from: f */
    private final C2019a f7095f = new C2019a();

    /* renamed from: h3.b$a */
    public static final class C2019a extends ThreadLocal<Random> {
        C2019a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    /* renamed from: c */
    public Random mo7757c() {
        Object obj = this.f7095f.get();
        C1924k.m9140f(obj, "implStorage.get()");
        return (Random) obj;
    }
}
