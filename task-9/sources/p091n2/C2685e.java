package p091n2;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: n2.e */
public final class C2685e implements C2695j {

    /* renamed from: a */
    public static final C2685e f9000a = new C2685e();

    private C2685e() {
    }

    /* renamed from: a */
    public ByteBuffer mo9424a(Object obj) {
        return C2684d.f8999a.mo9423b(new JSONArray().put(C2686f.m12213a(obj)));
    }

    /* renamed from: b */
    public C2688h mo9425b(ByteBuffer byteBuffer) {
        try {
            Object a = C2684d.f8999a.mo9422a(byteBuffer);
            if (a instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) a;
                Object obj = jSONObject.get("method");
                Object g = mo9430g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new C2688h((String) obj, g);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + a);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    /* renamed from: c */
    public Object mo9426c(ByteBuffer byteBuffer) {
        try {
            Object a = C2684d.f8999a.mo9422a(byteBuffer);
            if (a instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) a;
                if (jSONArray.length() == 1) {
                    return mo9430g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g = mo9430g(jSONArray.opt(1));
                    Object g2 = mo9430g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g == null || (g instanceof String))) {
                        throw new C2683c((String) obj, (String) g, g2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + a);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    /* renamed from: d */
    public ByteBuffer mo9427d(String str, String str2, Object obj, String str3) {
        return C2684d.f8999a.mo9423b(new JSONArray().put(str).put(C2686f.m12213a(str2)).put(C2686f.m12213a(obj)).put(C2686f.m12213a(str3)));
    }

    /* renamed from: e */
    public ByteBuffer mo9428e(C2688h hVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", hVar.f9001a);
            jSONObject.put("args", C2686f.m12213a(hVar.f9002b));
            return C2684d.f8999a.mo9423b(jSONObject);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    /* renamed from: f */
    public ByteBuffer mo9429f(String str, String str2, Object obj) {
        return C2684d.f8999a.mo9423b(new JSONArray().put(str).put(C2686f.m12213a(str2)).put(C2686f.m12213a(obj)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Object mo9430g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
