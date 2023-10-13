package p108q1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p108q1.C2988k;

/* renamed from: q1.f */
public abstract class C2978f<T> {

    /* renamed from: q1.f$a */
    class C2979a extends C2978f<T> {

        /* renamed from: a */
        final /* synthetic */ C2978f f9783a;

        C2979a(C2978f fVar) {
            this.f9783a = fVar;
        }

        @Nullable
        /* renamed from: b */
        public T mo10197b(C2988k kVar) {
            return this.f9783a.mo10197b(kVar);
        }

        /* renamed from: f */
        public void mo10198f(C2995p pVar, @Nullable T t) {
            boolean n = pVar.mo10274n();
            pVar.mo10271O(true);
            try {
                this.f9783a.mo10198f(pVar, t);
            } finally {
                pVar.mo10271O(n);
            }
        }

        public String toString() {
            return this.f9783a + ".serializeNulls()";
        }
    }

    /* renamed from: q1.f$b */
    class C2980b extends C2978f<T> {

        /* renamed from: a */
        final /* synthetic */ C2978f f9785a;

        C2980b(C2978f fVar) {
            this.f9785a = fVar;
        }

        @Nullable
        /* renamed from: b */
        public T mo10197b(C2988k kVar) {
            return kVar.mo10229J() == C2988k.C2990b.NULL ? kVar.mo10227F() : this.f9785a.mo10197b(kVar);
        }

        /* renamed from: f */
        public void mo10198f(C2995p pVar, @Nullable T t) {
            if (t == null) {
                pVar.mo10251B();
            } else {
                this.f9785a.mo10198f(pVar, t);
            }
        }

        public String toString() {
            return this.f9785a + ".nullSafe()";
        }
    }

    /* renamed from: q1.f$c */
    class C2981c extends C2978f<T> {

        /* renamed from: a */
        final /* synthetic */ C2978f f9787a;

        C2981c(C2978f fVar) {
            this.f9787a = fVar;
        }

        @Nullable
        /* renamed from: b */
        public T mo10197b(C2988k kVar) {
            boolean s = kVar.mo10246s();
            kVar.mo10237c0(true);
            try {
                return this.f9787a.mo10197b(kVar);
            } finally {
                kVar.mo10237c0(s);
            }
        }

        /* renamed from: f */
        public void mo10198f(C2995p pVar, @Nullable T t) {
            boolean s = pVar.mo10275s();
            pVar.mo10270J(true);
            try {
                this.f9787a.mo10198f(pVar, t);
            } finally {
                pVar.mo10270J(s);
            }
        }

        public String toString() {
            return this.f9787a + ".lenient()";
        }
    }

    /* renamed from: q1.f$d */
    class C2982d extends C2978f<T> {

        /* renamed from: a */
        final /* synthetic */ C2978f f9789a;

        C2982d(C2978f fVar) {
            this.f9789a = fVar;
        }

        @Nullable
        /* renamed from: b */
        public T mo10197b(C2988k kVar) {
            boolean i = kVar.mo10243i();
            kVar.mo10235b0(true);
            try {
                return this.f9789a.mo10197b(kVar);
            } finally {
                kVar.mo10235b0(i);
            }
        }

        /* renamed from: f */
        public void mo10198f(C2995p pVar, @Nullable T t) {
            this.f9789a.mo10198f(pVar, t);
        }

        public String toString() {
            return this.f9789a + ".failOnUnknown()";
        }
    }

    /* renamed from: q1.f$e */
    public interface C2983e {
        @CheckReturnValue
        @Nullable
        /* renamed from: a */
        C2978f<?> mo10200a(Type type, Set<? extends Annotation> set, C3008s sVar);
    }

    @CheckReturnValue
    /* renamed from: a */
    public final C2978f<T> mo10215a() {
        return new C2982d(this);
    }

    @CheckReturnValue
    @Nullable
    /* renamed from: b */
    public abstract T mo10197b(C2988k kVar);

    @CheckReturnValue
    /* renamed from: c */
    public final C2978f<T> mo10216c() {
        return new C2981c(this);
    }

    @CheckReturnValue
    /* renamed from: d */
    public final C2978f<T> mo10217d() {
        return new C2980b(this);
    }

    @CheckReturnValue
    /* renamed from: e */
    public final C2978f<T> mo10218e() {
        return new C2979a(this);
    }

    /* renamed from: f */
    public abstract void mo10198f(C2995p pVar, @Nullable T t);
}
