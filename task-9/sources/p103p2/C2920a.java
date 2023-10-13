package p103p2;

import android.annotation.TargetApi;
import android.view.PointerIcon;
import java.util.HashMap;
import p085m2.C2580g;

@TargetApi(24)
/* renamed from: p2.a */
public class C2920a {

    /* renamed from: c */
    private static HashMap<String, Integer> f9665c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2923c f9666a;

    /* renamed from: b */
    private final C2580g f9667b;

    /* renamed from: p2.a$a */
    class C2921a implements C2580g.C2582b {
        C2921a() {
        }

        /* renamed from: a */
        public void mo9278a(String str) {
            C2920a.this.f9666a.setPointerIcon(C2920a.this.m13233d(str));
        }
    }

    /* renamed from: p2.a$b */
    class C2922b extends HashMap<String, Integer> {
        C2922b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    /* renamed from: p2.a$c */
    public interface C2923c {
        /* renamed from: c */
        PointerIcon mo8189c(int i);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public C2920a(C2923c cVar, C2580g gVar) {
        this.f9666a = cVar;
        this.f9667b = gVar;
        gVar.mo9277b(new C2921a());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public PointerIcon m13233d(String str) {
        if (f9665c == null) {
            f9665c = new C2922b();
        }
        return this.f9666a.mo8189c(f9665c.getOrDefault(str, 1000).intValue());
    }

    /* renamed from: c */
    public void mo10092c() {
        this.f9667b.mo9277b((C2580g.C2582b) null);
    }
}
