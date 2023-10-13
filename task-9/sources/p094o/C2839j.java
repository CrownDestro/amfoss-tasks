package p094o;

import java.util.Arrays;

/* renamed from: o.j */
public class C2839j extends C2830e implements C2838i {

    /* renamed from: w0 */
    public C2830e[] f9345w0 = new C2830e[4];

    /* renamed from: x0 */
    public int f9346x0 = 0;

    /* renamed from: a */
    public void mo9794a(C2830e eVar) {
        if (eVar != this && eVar != null) {
            int i = this.f9346x0 + 1;
            C2830e[] eVarArr = this.f9345w0;
            if (i > eVarArr.length) {
                this.f9345w0 = (C2830e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            C2830e[] eVarArr2 = this.f9345w0;
            int i2 = this.f9346x0;
            eVarArr2[i2] = eVar;
            this.f9346x0 = i2 + 1;
        }
    }

    /* renamed from: b */
    public void mo9795b() {
        this.f9346x0 = 0;
        Arrays.fill(this.f9345w0, (Object) null);
    }

    /* renamed from: c */
    public void mo9796c(C2833f fVar) {
    }
}
