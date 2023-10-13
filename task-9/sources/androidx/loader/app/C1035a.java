package androidx.loader.app;

import androidx.lifecycle.C0996g0;
import androidx.lifecycle.C1005m;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.loader.app.a */
public abstract class C1035a {
    /* renamed from: b */
    public static <T extends C1005m & C0996g0> C1035a m4544b(T t) {
        return new C1036b(t, ((C0996g0) t).mo113o());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo3840a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract void mo3841c();
}
