package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.core.util.C0605b;
import androidx.lifecycle.C0972b0;
import androidx.lifecycle.C0974c0;
import androidx.lifecycle.C0985d0;
import androidx.lifecycle.C0994f0;
import androidx.lifecycle.C1005m;
import androidx.lifecycle.C1012r;
import androidx.lifecycle.C1013s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p038f0.C1899a;
import p045g0.C1960a;
import p070k.C2349h;

/* renamed from: androidx.loader.app.b */
class C1036b extends C1035a {

    /* renamed from: c */
    static boolean f3473c = false;

    /* renamed from: a */
    private final C1005m f3474a;

    /* renamed from: b */
    private final C1038b f3475b;

    /* renamed from: androidx.loader.app.b$a */
    public static class C1037a<D> extends C1012r<D> {

        /* renamed from: l */
        private final int f3476l;

        /* renamed from: m */
        private final Bundle f3477m;

        /* renamed from: n */
        private C1005m f3478n;

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo3741f() {
            if (C1036b.f3473c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo3742g() {
            if (C1036b.f3473c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* renamed from: h */
        public void mo3743h(C1013s<? super D> sVar) {
            super.mo3743h(sVar);
            this.f3478n = null;
        }

        /* renamed from: i */
        public void mo3744i(D d) {
            super.mo3744i(d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C1960a<D> mo3843j(boolean z) {
            if (C1036b.f3473c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        /* renamed from: k */
        public void mo3844k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3476l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3477m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo3845l() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3476l);
            sb.append(" : ");
            C0605b.m2651a((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b */
    static class C1038b extends C0972b0 {

        /* renamed from: f */
        private static final C0974c0.C0978b f3479f = new C1039a();

        /* renamed from: d */
        private C2349h<C1037a> f3480d = new C2349h<>();

        /* renamed from: e */
        private boolean f3481e = false;

        /* renamed from: androidx.loader.app.b$b$a */
        static class C1039a implements C0974c0.C0978b {
            C1039a() {
            }

            /* renamed from: a */
            public <T extends C0972b0> T mo3728a(Class<T> cls) {
                return new C1038b();
            }

            /* renamed from: b */
            public /* synthetic */ C0972b0 mo3729b(Class cls, C1899a aVar) {
                return C0985d0.m4448b(this, cls, aVar);
            }
        }

        C1038b() {
        }

        /* renamed from: f */
        static C1038b m4556f(C0994f0 f0Var) {
            return (C1038b) new C0974c0(f0Var, f3479f).mo3770a(C1038b.class);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo3713d() {
            super.mo3713d();
            int o = this.f3480d.mo8812o();
            for (int i = 0; i < o; i++) {
                this.f3480d.mo8813p(i).mo3843j(true);
            }
            this.f3480d.mo8805d();
        }

        /* renamed from: e */
        public void mo3847e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3480d.mo8812o() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f3480d.mo8812o(); i++) {
                    C1037a p = this.f3480d.mo8813p(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3480d.mo8810l(i));
                    printWriter.print(": ");
                    printWriter.println(p.toString());
                    p.mo3844k(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3848g() {
            int o = this.f3480d.mo8812o();
            for (int i = 0; i < o; i++) {
                this.f3480d.mo8813p(i).mo3845l();
            }
        }
    }

    C1036b(C1005m mVar, C0994f0 f0Var) {
        this.f3474a = mVar;
        this.f3475b = C1038b.m4556f(f0Var);
    }

    @Deprecated
    /* renamed from: a */
    public void mo3840a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3475b.mo3847e(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: c */
    public void mo3841c() {
        this.f3475b.mo3848g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0605b.m2651a(this.f3474a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
