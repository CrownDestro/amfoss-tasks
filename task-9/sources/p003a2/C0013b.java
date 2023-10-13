package p003a2;

import java.nio.ByteBuffer;
import p003a2.C0014c;

/* renamed from: a2.b */
public final /* synthetic */ class C0013b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C0014c f85d;

    /* renamed from: e */
    public final /* synthetic */ String f86e;

    /* renamed from: f */
    public final /* synthetic */ int f87f;

    /* renamed from: g */
    public final /* synthetic */ C0014c.C0018d f88g;

    /* renamed from: h */
    public final /* synthetic */ ByteBuffer f89h;

    /* renamed from: i */
    public final /* synthetic */ long f90i;

    public /* synthetic */ C0013b(C0014c cVar, String str, int i, C0014c.C0018d dVar, ByteBuffer byteBuffer, long j) {
        this.f85d = cVar;
        this.f86e = str;
        this.f87f = i;
        this.f88g = dVar;
        this.f89h = byteBuffer;
        this.f90i = j;
    }

    public final void run() {
        this.f85d.m73j(this.f86e, this.f87f, this.f88g, this.f89h, this.f90i);
    }
}
