package p094o;

import java.util.ArrayList;
import p088n.C2657c;

/* renamed from: o.m */
public class C2842m extends C2830e {

    /* renamed from: w0 */
    public ArrayList<C2830e> f9361w0 = new ArrayList<>();

    /* renamed from: K0 */
    public void mo9737K0() {
        ArrayList<C2830e> arrayList = this.f9361w0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C2830e eVar = this.f9361w0.get(i);
                if (eVar instanceof C2842m) {
                    ((C2842m) eVar).mo9737K0();
                }
            }
        }
    }

    /* renamed from: L0 */
    public void mo9817L0(C2830e eVar) {
        this.f9361w0.remove(eVar);
        eVar.mo9730w0((C2830e) null);
    }

    /* renamed from: M0 */
    public void mo9818M0() {
        this.f9361w0.clear();
    }

    /* renamed from: Y */
    public void mo9690Y() {
        this.f9361w0.clear();
        super.mo9690Y();
    }

    /* renamed from: a */
    public void mo9819a(C2830e eVar) {
        this.f9361w0.add(eVar);
        if (eVar.mo9669G() != null) {
            ((C2842m) eVar.mo9669G()).mo9817L0(eVar);
        }
        eVar.mo9730w0(this);
    }

    /* renamed from: a0 */
    public void mo9692a0(C2657c cVar) {
        super.mo9692a0(cVar);
        int size = this.f9361w0.size();
        for (int i = 0; i < size; i++) {
            this.f9361w0.get(i).mo9692a0(cVar);
        }
    }
}
