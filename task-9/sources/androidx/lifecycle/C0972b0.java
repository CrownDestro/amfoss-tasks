package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.b0 */
public abstract class C0972b0 {

    /* renamed from: a */
    private final Map<String, Object> f3403a = new HashMap();

    /* renamed from: b */
    private final Set<Closeable> f3404b = new LinkedHashSet();

    /* renamed from: c */
    private volatile boolean f3405c = false;

    /* renamed from: b */
    private static void m4437b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3761a() {
        this.f3405c = true;
        Map<String, Object> map = this.f3403a;
        if (map != null) {
            synchronized (map) {
                for (Object b : this.f3403a.values()) {
                    m4437b(b);
                }
            }
        }
        Set<Closeable> set = this.f3404b;
        if (set != null) {
            synchronized (set) {
                for (Closeable b2 : this.f3404b) {
                    m4437b(b2);
                }
            }
        }
        mo3713d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T mo3762c(String str) {
        T t;
        Map<String, Object> map = this.f3403a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f3403a.get(str);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3713d() {
    }
}
