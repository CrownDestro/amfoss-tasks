package p003a2;

import android.content.res.AssetManager;
import java.nio.ByteBuffer;
import java.util.List;
import p019c2.C1297d;
import p063io.flutter.embedding.engine.FlutterJNI;
import p091n2.C2679b;
import p091n2.C2704r;
import p121s2.C3115e;
import p162z1.C3623a;
import p162z1.C3627b;

/* renamed from: a2.a */
public class C0008a implements C2679b {

    /* renamed from: a */
    private final FlutterJNI f72a;

    /* renamed from: b */
    private final AssetManager f73b;

    /* renamed from: c */
    private final C0014c f74c;

    /* renamed from: d */
    private final C2679b f75d;

    /* renamed from: e */
    private boolean f76e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f77f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C0012d f78g;

    /* renamed from: h */
    private final C2679b.C2680a f79h;

    /* renamed from: a2.a$a */
    class C0009a implements C2679b.C2680a {
        C0009a() {
        }

        /* renamed from: a */
        public void mo47a(ByteBuffer byteBuffer, C2679b.C2681b bVar) {
            String unused = C0008a.this.f77f = C2704r.f9019b.mo9422a(byteBuffer);
            if (C0008a.this.f78g != null) {
                C0008a.this.f78g.mo51a(C0008a.this.f77f);
            }
        }
    }

    /* renamed from: a2.a$b */
    public static class C0010b {

        /* renamed from: a */
        public final String f81a;

        /* renamed from: b */
        public final String f82b;

        /* renamed from: c */
        public final String f83c;

        public C0010b(String str, String str2) {
            this.f81a = str;
            this.f82b = null;
            this.f83c = str2;
        }

        public C0010b(String str, String str2, String str3) {
            this.f81a = str;
            this.f82b = str2;
            this.f83c = str3;
        }

        /* renamed from: a */
        public static C0010b m64a() {
            C1297d c = C3623a.m16080e().mo11893c();
            if (c.mo5124h()) {
                return new C0010b(c.mo5123f(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0010b bVar = (C0010b) obj;
            if (!this.f81a.equals(bVar.f81a)) {
                return false;
            }
            return this.f83c.equals(bVar.f83c);
        }

        public int hashCode() {
            return (this.f81a.hashCode() * 31) + this.f83c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f81a + ", function: " + this.f83c + " )";
        }
    }

    /* renamed from: a2.a$c */
    private static class C0011c implements C2679b {

        /* renamed from: a */
        private final C0014c f84a;

        private C0011c(C0014c cVar) {
            this.f84a = cVar;
        }

        /* synthetic */ C0011c(C0014c cVar, C0009a aVar) {
            this(cVar);
        }

        /* renamed from: a */
        public void mo38a(String str, C2679b.C2680a aVar) {
            this.f84a.mo38a(str, aVar);
        }

        /* renamed from: c */
        public void mo39c(String str, C2679b.C2680a aVar, C2679b.C2682c cVar) {
            this.f84a.mo39c(str, aVar, cVar);
        }

        /* renamed from: d */
        public void mo40d(String str, ByteBuffer byteBuffer, C2679b.C2681b bVar) {
            this.f84a.mo40d(str, byteBuffer, bVar);
        }
    }

    /* renamed from: a2.a$d */
    public interface C0012d {
        /* renamed from: a */
        void mo51a(String str);
    }

    public C0008a(FlutterJNI flutterJNI, AssetManager assetManager) {
        C0009a aVar = new C0009a();
        this.f79h = aVar;
        this.f72a = flutterJNI;
        this.f73b = assetManager;
        C0014c cVar = new C0014c(flutterJNI);
        this.f74c = cVar;
        cVar.mo38a("flutter/isolate", aVar);
        this.f75d = new C0011c(cVar, (C0009a) null);
        if (flutterJNI.isAttached()) {
            this.f76e = true;
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo38a(String str, C2679b.C2680a aVar) {
        this.f75d.mo38a(str, aVar);
    }

    @Deprecated
    /* renamed from: c */
    public void mo39c(String str, C2679b.C2680a aVar, C2679b.C2682c cVar) {
        this.f75d.mo39c(str, aVar, cVar);
    }

    @Deprecated
    /* renamed from: d */
    public void mo40d(String str, ByteBuffer byteBuffer, C2679b.C2681b bVar) {
        this.f75d.mo40d(str, byteBuffer, bVar);
    }

    /* renamed from: g */
    public void mo41g(C0010b bVar, List<String> list) {
        if (this.f76e) {
            C3627b.m16093g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        C3115e.m13858a("DartExecutor#executeDartEntrypoint");
        try {
            C3627b.m16092f("DartExecutor", "Executing Dart entrypoint: " + bVar);
            this.f72a.runBundleAndSnapshotFromLibrary(bVar.f81a, bVar.f83c, bVar.f82b, this.f73b, list);
            this.f76e = true;
        } finally {
            C3115e.m13861d();
        }
    }

    /* renamed from: h */
    public String mo42h() {
        return this.f77f;
    }

    /* renamed from: i */
    public boolean mo43i() {
        return this.f76e;
    }

    /* renamed from: j */
    public void mo44j() {
        if (this.f72a.isAttached()) {
            this.f72a.notifyLowMemoryWarning();
        }
    }

    /* renamed from: k */
    public void mo45k() {
        C3627b.m16092f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f72a.setPlatformMessageHandler(this.f74c);
    }

    /* renamed from: l */
    public void mo46l() {
        C3627b.m16092f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f72a.setPlatformMessageHandler((C0021d) null);
    }
}
