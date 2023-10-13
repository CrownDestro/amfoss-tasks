package p091n2;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: n2.d */
public final class C2684d implements C2687g<Object> {

    /* renamed from: a */
    public static final C2684d f8999a = new C2684d();

    private C2684d() {
    }

    /* renamed from: a */
    public Object mo9422a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(C2704r.f9019b.mo9422a(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    /* renamed from: b */
    public ByteBuffer mo9423b(Object obj) {
        C2704r rVar;
        String obj2;
        if (obj == null) {
            return null;
        }
        Object a = C2686f.m12213a(obj);
        if (a instanceof String) {
            rVar = C2704r.f9019b;
            obj2 = JSONObject.quote((String) a);
        } else {
            rVar = C2704r.f9019b;
            obj2 = a.toString();
        }
        return rVar.mo9423b(obj2);
    }
}
