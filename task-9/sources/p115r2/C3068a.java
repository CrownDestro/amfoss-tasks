package p115r2;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import p091n2.C2701p;

/* renamed from: r2.a */
public class C3068a {

    /* renamed from: r2.a$a */
    public static class C3069a extends RuntimeException {

        /* renamed from: d */
        public final String f9987d;

        /* renamed from: e */
        public final Object f9988e;

        public C3069a(String str, String str2, Object obj) {
            super(str2);
            this.f9987d = str;
            this.f9988e = obj;
        }
    }

    /* renamed from: r2.a$b */
    public interface C3070b {
        /* renamed from: a */
        void mo10396a();

        /* renamed from: b */
        Boolean mo10397b(String str, Map<String, String> map);

        /* renamed from: c */
        Boolean mo10398c(String str);

        /* renamed from: d */
        Boolean mo10399d(String str, C3072d dVar);
    }

    /* renamed from: r2.a$c */
    private static class C3071c extends C2701p {

        /* renamed from: d */
        public static final C3071c f9989d = new C3071c();

        private C3071c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public Object mo9441g(byte b, ByteBuffer byteBuffer) {
            return b != Byte.MIN_VALUE ? super.mo9441g(b, byteBuffer) : C3072d.m13782a((ArrayList) mo9440f(byteBuffer));
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public void mo9442p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof C3072d) {
                byteArrayOutputStream.write(128);
                mo9442p(byteArrayOutputStream, ((C3072d) obj).mo10406h());
                return;
            }
            super.mo9442p(byteArrayOutputStream, obj);
        }
    }

    /* renamed from: r2.a$d */
    public static final class C3072d {

        /* renamed from: a */
        private Boolean f9990a;

        /* renamed from: b */
        private Boolean f9991b;

        /* renamed from: c */
        private Map<String, String> f9992c;

        C3072d() {
        }

        /* renamed from: a */
        static C3072d m13782a(ArrayList<Object> arrayList) {
            C3072d dVar = new C3072d();
            dVar.mo10404f((Boolean) arrayList.get(0));
            dVar.mo10403e((Boolean) arrayList.get(1));
            dVar.mo10405g((Map) arrayList.get(2));
            return dVar;
        }

        /* renamed from: b */
        public Boolean mo10400b() {
            return this.f9991b;
        }

        /* renamed from: c */
        public Boolean mo10401c() {
            return this.f9990a;
        }

        /* renamed from: d */
        public Map<String, String> mo10402d() {
            return this.f9992c;
        }

        /* renamed from: e */
        public void mo10403e(Boolean bool) {
            if (bool != null) {
                this.f9991b = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }

        /* renamed from: f */
        public void mo10404f(Boolean bool) {
            if (bool != null) {
                this.f9990a = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }

        /* renamed from: g */
        public void mo10405g(Map<String, String> map) {
            if (map != null) {
                this.f9992c = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public ArrayList<Object> mo10406h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f9990a);
            arrayList.add(this.f9991b);
            arrayList.add(this.f9992c);
            return arrayList;
        }
    }

    /* renamed from: a */
    protected static ArrayList<Object> m13775a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof C3069a) {
            C3069a aVar = (C3069a) th;
            arrayList.add(aVar.f9987d);
            arrayList.add(aVar.getMessage());
            obj = aVar.f9988e;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
