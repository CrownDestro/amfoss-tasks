package p108q1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p108q1.C2978f;
import p108q1.C2988k;
import p114r1.C3064a;

/* renamed from: q1.t */
final class C3012t {

    /* renamed from: a */
    public static final C2978f.C2983e f9883a = new C3015c();

    /* renamed from: b */
    static final C2978f<Boolean> f9884b = new C3016d();

    /* renamed from: c */
    static final C2978f<Byte> f9885c = new C3017e();

    /* renamed from: d */
    static final C2978f<Character> f9886d = new C3018f();

    /* renamed from: e */
    static final C2978f<Double> f9887e = new C3019g();

    /* renamed from: f */
    static final C2978f<Float> f9888f = new C3020h();

    /* renamed from: g */
    static final C2978f<Integer> f9889g = new C3021i();

    /* renamed from: h */
    static final C2978f<Long> f9890h = new C3022j();

    /* renamed from: i */
    static final C2978f<Short> f9891i = new C3023k();

    /* renamed from: j */
    static final C2978f<String> f9892j = new C3013a();

    /* renamed from: q1.t$a */
    class C3013a extends C2978f<String> {
        C3013a() {
        }

        /* renamed from: g */
        public String mo10197b(C2988k kVar) {
            return kVar.mo10228G();
        }

        /* renamed from: h */
        public void mo10198f(C2995p pVar, String str) {
            pVar.mo10256b0(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* renamed from: q1.t$b */
    static /* synthetic */ class C3014b {

        /* renamed from: a */
        static final /* synthetic */ int[] f9893a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                q1.k$b[] r0 = p108q1.C2988k.C2990b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9893a = r0
                q1.k$b r1 = p108q1.C2988k.C2990b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9893a     // Catch:{ NoSuchFieldError -> 0x001d }
                q1.k$b r1 = p108q1.C2988k.C2990b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9893a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q1.k$b r1 = p108q1.C2988k.C2990b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9893a     // Catch:{ NoSuchFieldError -> 0x0033 }
                q1.k$b r1 = p108q1.C2988k.C2990b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9893a     // Catch:{ NoSuchFieldError -> 0x003e }
                q1.k$b r1 = p108q1.C2988k.C2990b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9893a     // Catch:{ NoSuchFieldError -> 0x0049 }
                q1.k$b r1 = p108q1.C2988k.C2990b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p108q1.C3012t.C3014b.<clinit>():void");
        }
    }

    /* renamed from: q1.t$c */
    class C3015c implements C2978f.C2983e {
        C3015c() {
        }

        /* renamed from: a */
        public C2978f<?> mo10200a(Type type, Set<? extends Annotation> set, C3008s sVar) {
            C2978f lVar;
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C3012t.f9884b;
            }
            if (type == Byte.TYPE) {
                return C3012t.f9885c;
            }
            if (type == Character.TYPE) {
                return C3012t.f9886d;
            }
            if (type == Double.TYPE) {
                return C3012t.f9887e;
            }
            if (type == Float.TYPE) {
                return C3012t.f9888f;
            }
            if (type == Integer.TYPE) {
                return C3012t.f9889g;
            }
            if (type == Long.TYPE) {
                return C3012t.f9890h;
            }
            if (type == Short.TYPE) {
                return C3012t.f9891i;
            }
            if (type == Boolean.class) {
                lVar = C3012t.f9884b;
            } else if (type == Byte.class) {
                lVar = C3012t.f9885c;
            } else if (type == Character.class) {
                lVar = C3012t.f9886d;
            } else if (type == Double.class) {
                lVar = C3012t.f9887e;
            } else if (type == Float.class) {
                lVar = C3012t.f9888f;
            } else if (type == Integer.class) {
                lVar = C3012t.f9889g;
            } else if (type == Long.class) {
                lVar = C3012t.f9890h;
            } else if (type == Short.class) {
                lVar = C3012t.f9891i;
            } else if (type == String.class) {
                lVar = C3012t.f9892j;
            } else if (type == Object.class) {
                lVar = new C3025m(sVar);
            } else {
                Class<?> f = C3026u.m13680f(type);
                C2978f<?> d = C3064a.m13763d(sVar, type, f);
                if (d != null) {
                    return d;
                }
                if (!f.isEnum()) {
                    return null;
                }
                lVar = new C3024l(f);
            }
            return lVar.mo10217d();
        }
    }

    /* renamed from: q1.t$d */
    class C3016d extends C2978f<Boolean> {
        C3016d() {
        }

        /* renamed from: g */
        public Boolean mo10197b(C2988k kVar) {
            return Boolean.valueOf(kVar.mo10247w());
        }

        /* renamed from: h */
        public void mo10198f(C2995p pVar, Boolean bool) {
            pVar.mo10258c0(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* renamed from: q1.t$e */
    class C3017e extends C2978f<Byte> {
        C3017e() {
        }

        /* renamed from: g */
        public Byte mo10197b(C2988k kVar) {
            return Byte.valueOf((byte) C3012t.m13630a(kVar, "a byte", -128, 255));
        }

        /* renamed from: h */
        public void mo10198f(C2995p pVar, Byte b) {
            pVar.mo10253T((long) (b.intValue() & 255));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* renamed from: q1.t$f */
    class C3018f extends C2978f<Character> {
        C3018f() {
        }

        /* renamed from: g */
        public Character mo10197b(C2988k kVar) {
            String G = kVar.mo10228G();
            if (G.length() <= 1) {
                return Character.valueOf(G.charAt(0));
            }
            throw new C2985h(String.format("Expected %s but was %s at path %s", new Object[]{"a char", '\"' + G + '\"', kVar.mo10244k()}));
        }

        /* renamed from: h */
        public void mo10198f(C2995p pVar, Character ch) {
            pVar.mo10256b0(ch.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* renamed from: q1.t$g */
    class C3019g extends C2978f<Double> {
        C3019g() {
        }

        /* renamed from: g */
        public Double mo10197b(C2988k kVar) {
            return Double.valueOf(kVar.mo10224B());
        }

        /* renamed from: h */
        public void mo10198f(C2995p pVar, Double d) {
            pVar.mo10252Q(d.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* renamed from: q1.t$h */
    class C3020h extends C2978f<Float> {
        C3020h() {
        }

        /* renamed from: g */
        public Float mo10197b(C2988k kVar) {
            float B = (float) kVar.mo10224B();
            if (kVar.mo10246s() || !Float.isInfinite(B)) {
                return Float.valueOf(B);
            }
            throw new C2985h("JSON forbids NaN and infinities: " + B + " at path " + kVar.mo10244k());
        }

        /* renamed from: h */
        public void mo10198f(C2995p pVar, Float f) {
            Objects.requireNonNull(f);
            pVar.mo10255a0(f);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* renamed from: q1.t$i */
    class C3021i extends C2978f<Integer> {
        C3021i() {
        }

        /* renamed from: g */
        public Integer mo10197b(C2988k kVar) {
            return Integer.valueOf(kVar.mo10225C());
        }

        /* renamed from: h */
        public void mo10198f(C2995p pVar, Integer num) {
            pVar.mo10253T((long) num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* renamed from: q1.t$j */
    class C3022j extends C2978f<Long> {
        C3022j() {
        }

        /* renamed from: g */
        public Long mo10197b(C2988k kVar) {
            return Long.valueOf(kVar.mo10226D());
        }

        /* renamed from: h */
        public void mo10198f(C2995p pVar, Long l) {
            pVar.mo10253T(l.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* renamed from: q1.t$k */
    class C3023k extends C2978f<Short> {
        C3023k() {
        }

        /* renamed from: g */
        public Short mo10197b(C2988k kVar) {
            return Short.valueOf((short) C3012t.m13630a(kVar, "a short", -32768, 32767));
        }

        /* renamed from: h */
        public void mo10198f(C2995p pVar, Short sh) {
            pVar.mo10253T((long) sh.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* renamed from: q1.t$l */
    static final class C3024l<T extends Enum<T>> extends C2978f<T> {

        /* renamed from: a */
        private final Class<T> f9894a;

        /* renamed from: b */
        private final String[] f9895b;

        /* renamed from: c */
        private final T[] f9896c;

        /* renamed from: d */
        private final C2988k.C2989a f9897d;

        C3024l(Class<T> cls) {
            this.f9894a = cls;
            try {
                T[] tArr = (Enum[]) cls.getEnumConstants();
                this.f9896c = tArr;
                this.f9895b = new String[tArr.length];
                int i = 0;
                while (true) {
                    T[] tArr2 = this.f9896c;
                    if (i < tArr2.length) {
                        T t = tArr2[i];
                        C2977e eVar = (C2977e) cls.getField(t.name()).getAnnotation(C2977e.class);
                        this.f9895b[i] = eVar != null ? eVar.name() : t.name();
                        i++;
                    } else {
                        this.f9897d = C2988k.C2989a.m13501a(this.f9895b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError("Missing field in " + cls.getName(), e);
            }
        }

        /* renamed from: g */
        public T mo10197b(C2988k kVar) {
            int a0 = kVar.mo10234a0(this.f9897d);
            if (a0 != -1) {
                return this.f9896c[a0];
            }
            String k = kVar.mo10244k();
            String G = kVar.mo10228G();
            throw new C2985h("Expected one of " + Arrays.asList(this.f9895b) + " but was " + G + " at path " + k);
        }

        /* renamed from: h */
        public void mo10198f(C2995p pVar, T t) {
            pVar.mo10256b0(this.f9895b[t.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f9894a.getName() + ")";
        }
    }

    /* renamed from: q1.t$m */
    static final class C3025m extends C2978f<Object> {

        /* renamed from: a */
        private final C3008s f9898a;

        /* renamed from: b */
        private final C2978f<List> f9899b;

        /* renamed from: c */
        private final C2978f<Map> f9900c;

        /* renamed from: d */
        private final C2978f<String> f9901d;

        /* renamed from: e */
        private final C2978f<Double> f9902e;

        /* renamed from: f */
        private final C2978f<Boolean> f9903f;

        C3025m(C3008s sVar) {
            this.f9898a = sVar;
            this.f9899b = sVar.mo10323c(List.class);
            this.f9900c = sVar.mo10323c(Map.class);
            this.f9901d = sVar.mo10323c(String.class);
            this.f9902e = sVar.mo10323c(Double.class);
            this.f9903f = sVar.mo10323c(Boolean.class);
        }

        /* renamed from: g */
        private Class<?> m13672g(Class<?> cls) {
            return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        /* renamed from: b */
        public Object mo10197b(C2988k kVar) {
            C2978f fVar;
            switch (C3014b.f9893a[kVar.mo10229J().ordinal()]) {
                case 1:
                    fVar = this.f9899b;
                    break;
                case 2:
                    fVar = this.f9900c;
                    break;
                case 3:
                    fVar = this.f9901d;
                    break;
                case 4:
                    fVar = this.f9902e;
                    break;
                case 5:
                    fVar = this.f9903f;
                    break;
                case 6:
                    return kVar.mo10227F();
                default:
                    throw new IllegalStateException("Expected a value but was " + kVar.mo10229J() + " at path " + kVar.mo10244k());
            }
            return fVar.mo10197b(kVar);
        }

        /* renamed from: f */
        public void mo10198f(C2995p pVar, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                pVar.mo10257c();
                pVar.mo10262i();
                return;
            }
            this.f9898a.mo10325e(m13672g(cls), C3064a.f9979a).mo10198f(pVar, obj);
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* renamed from: a */
    static int m13630a(C2988k kVar, String str, int i, int i2) {
        int C = kVar.mo10225C();
        if (C >= i && C <= i2) {
            return C;
        }
        throw new C2985h(String.format("Expected %s but was %s at path %s", new Object[]{str, Integer.valueOf(C), kVar.mo10244k()}));
    }
}
