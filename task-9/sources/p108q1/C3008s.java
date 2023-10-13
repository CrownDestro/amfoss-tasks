package p108q1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p108q1.C2978f;
import p114r1.C3064a;

/* renamed from: q1.s */
public final class C3008s {

    /* renamed from: d */
    static final List<C2978f.C2983e> f9870d;

    /* renamed from: a */
    private final List<C2978f.C2983e> f9871a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ThreadLocal<C3011c> f9872b = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<Object, C2978f<?>> f9873c = new LinkedHashMap();

    /* renamed from: q1.s$a */
    public static final class C3009a {

        /* renamed from: a */
        final List<C2978f.C2983e> f9874a = new ArrayList();

        @CheckReturnValue
        /* renamed from: a */
        public C3008s mo10327a() {
            return new C3008s(this);
        }
    }

    /* renamed from: q1.s$b */
    static final class C3010b<T> extends C2978f<T> {

        /* renamed from: a */
        final Type f9875a;
        @Nullable

        /* renamed from: b */
        final String f9876b;

        /* renamed from: c */
        final Object f9877c;
        @Nullable

        /* renamed from: d */
        C2978f<T> f9878d;

        C3010b(Type type, @Nullable String str, Object obj) {
            this.f9875a = type;
            this.f9876b = str;
            this.f9877c = obj;
        }

        /* renamed from: b */
        public T mo10197b(C2988k kVar) {
            C2978f<T> fVar = this.f9878d;
            if (fVar != null) {
                return fVar.mo10197b(kVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        /* renamed from: f */
        public void mo10198f(C2995p pVar, T t) {
            C2978f<T> fVar = this.f9878d;
            if (fVar != null) {
                fVar.mo10198f(pVar, t);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            C2978f<T> fVar = this.f9878d;
            return fVar != null ? fVar.toString() : super.toString();
        }
    }

    /* renamed from: q1.s$c */
    final class C3011c {

        /* renamed from: a */
        final List<C3010b<?>> f9879a = new ArrayList();

        /* renamed from: b */
        final Deque<C3010b<?>> f9880b = new ArrayDeque();

        /* renamed from: c */
        boolean f9881c;

        C3011c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <T> void mo10329a(C2978f<T> fVar) {
            this.f9880b.getLast().f9878d = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IllegalArgumentException mo10330b(IllegalArgumentException illegalArgumentException) {
            if (this.f9881c) {
                return illegalArgumentException;
            }
            this.f9881c = true;
            if (this.f9880b.size() == 1 && this.f9880b.getFirst().f9876b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<C3010b<?>> descendingIterator = this.f9880b.descendingIterator();
            while (descendingIterator.hasNext()) {
                C3010b next = descendingIterator.next();
                sb.append("\nfor ");
                sb.append(next.f9875a);
                if (next.f9876b != null) {
                    sb.append(' ');
                    sb.append(next.f9876b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo10331c(boolean z) {
            this.f9880b.removeLast();
            if (this.f9880b.isEmpty()) {
                C3008s.this.f9872b.remove();
                if (z) {
                    synchronized (C3008s.this.f9873c) {
                        int size = this.f9879a.size();
                        for (int i = 0; i < size; i++) {
                            C3010b bVar = this.f9879a.get(i);
                            C2978f<T> fVar = (C2978f) C3008s.this.f9873c.put(bVar.f9877c, bVar.f9878d);
                            if (fVar != null) {
                                bVar.f9878d = fVar;
                                C3008s.this.f9873c.put(bVar.f9877c, fVar);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <T> C2978f<T> mo10332d(Type type, @Nullable String str, Object obj) {
            int size = this.f9879a.size();
            for (int i = 0; i < size; i++) {
                C3010b bVar = this.f9879a.get(i);
                if (bVar.f9877c.equals(obj)) {
                    this.f9880b.add(bVar);
                    C2978f<T> fVar = bVar.f9878d;
                    return fVar != null ? fVar : bVar;
                }
            }
            C3010b bVar2 = new C3010b(type, str, obj);
            this.f9879a.add(bVar2);
            this.f9880b.add(bVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f9870d = arrayList;
        arrayList.add(C3012t.f9883a);
        arrayList.add(C2973d.f9781b);
        arrayList.add(C3006r.f9867c);
        arrayList.add(C2963a.f9761c);
        arrayList.add(C2970c.f9774d);
    }

    C3008s(C3009a aVar) {
        int size = aVar.f9874a.size();
        List<C2978f.C2983e> list = f9870d;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(aVar.f9874a);
        arrayList.addAll(list);
        this.f9871a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    private Object m13618g(Type type, Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(new Object[]{type, set});
    }

    @CheckReturnValue
    /* renamed from: c */
    public <T> C2978f<T> mo10323c(Class<T> cls) {
        return mo10325e(cls, C3064a.f9979a);
    }

    @CheckReturnValue
    /* renamed from: d */
    public <T> C2978f<T> mo10324d(Type type) {
        return mo10325e(type, C3064a.f9979a);
    }

    @CheckReturnValue
    /* renamed from: e */
    public <T> C2978f<T> mo10325e(Type type, Set<? extends Annotation> set) {
        return mo10326f(type, set, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r1 = new p108q1.C3008s.C3011c(r4);
        r4.f9872b.set(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r7 = r1.mo10332d(r5, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r7 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r1.mo10331c(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r7 = r4.f9871a.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r2 >= r7) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r3 = r4.f9871a.get(r2).mo10200a(r5, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r3 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        r1.mo10329a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        r1.mo10331c(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        throw new java.lang.IllegalArgumentException("No JsonAdapter for " + p114r1.C3064a.m13773n(r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
        throw r1.mo10330b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        r1.mo10331c(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r1 = r4.f9872b.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r1 != null) goto L_0x0036;
     */
    @javax.annotation.CheckReturnValue
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> p108q1.C2978f<T> mo10326f(java.lang.reflect.Type r5, java.util.Set<? extends java.lang.annotation.Annotation> r6, @javax.annotation.Nullable java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r5, r0)
            java.lang.String r0 = "annotations == null"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.reflect.Type r5 = p114r1.C3064a.m13760a(r5)
            java.lang.Object r0 = r4.m13618g(r5, r6)
            java.util.Map<java.lang.Object, q1.f<?>> r1 = r4.f9873c
            monitor-enter(r1)
            java.util.Map<java.lang.Object, q1.f<?>> r2 = r4.f9873c     // Catch:{ all -> 0x008a }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x008a }
            q1.f r2 = (p108q1.C2978f) r2     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x0021
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            return r2
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            java.lang.ThreadLocal<q1.s$c> r1 = r4.f9872b
            java.lang.Object r1 = r1.get()
            q1.s$c r1 = (p108q1.C3008s.C3011c) r1
            if (r1 != 0) goto L_0x0036
            q1.s$c r1 = new q1.s$c
            r1.<init>()
            java.lang.ThreadLocal<q1.s$c> r2 = r4.f9872b
            r2.set(r1)
        L_0x0036:
            q1.f r7 = r1.mo10332d(r5, r7, r0)
            r0 = 0
            if (r7 == 0) goto L_0x0041
            r1.mo10331c(r0)
            return r7
        L_0x0041:
            java.util.List<q1.f$e> r7 = r4.f9871a     // Catch:{ IllegalArgumentException -> 0x0080 }
            int r7 = r7.size()     // Catch:{ IllegalArgumentException -> 0x0080 }
            r2 = 0
        L_0x0048:
            if (r2 >= r7) goto L_0x0063
            java.util.List<q1.f$e> r3 = r4.f9871a     // Catch:{ IllegalArgumentException -> 0x0080 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ IllegalArgumentException -> 0x0080 }
            q1.f$e r3 = (p108q1.C2978f.C2983e) r3     // Catch:{ IllegalArgumentException -> 0x0080 }
            q1.f r3 = r3.mo10200a(r5, r6, r4)     // Catch:{ IllegalArgumentException -> 0x0080 }
            if (r3 != 0) goto L_0x005b
            int r2 = r2 + 1
            goto L_0x0048
        L_0x005b:
            r1.mo10329a(r3)     // Catch:{ IllegalArgumentException -> 0x0080 }
            r5 = 1
            r1.mo10331c(r5)
            return r3
        L_0x0063:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0080 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0080 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0080 }
            java.lang.String r3 = "No JsonAdapter for "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x0080 }
            java.lang.String r5 = p114r1.C3064a.m13773n(r5, r6)     // Catch:{ IllegalArgumentException -> 0x0080 }
            r2.append(r5)     // Catch:{ IllegalArgumentException -> 0x0080 }
            java.lang.String r5 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x0080 }
            r7.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x0080 }
            throw r7     // Catch:{ IllegalArgumentException -> 0x0080 }
        L_0x007e:
            r5 = move-exception
            goto L_0x0086
        L_0x0080:
            r5 = move-exception
            java.lang.IllegalArgumentException r5 = r1.mo10330b(r5)     // Catch:{ all -> 0x007e }
            throw r5     // Catch:{ all -> 0x007e }
        L_0x0086:
            r1.mo10331c(r0)
            throw r5
        L_0x008a:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            goto L_0x008e
        L_0x008d:
            throw r5
        L_0x008e:
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: p108q1.C3008s.mo10326f(java.lang.reflect.Type, java.util.Set, java.lang.String):q1.f");
    }
}
