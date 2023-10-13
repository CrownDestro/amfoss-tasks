package p091n2;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: n2.f */
public class C2686f {
    /* renamed from: a */
    public static Object m12213a(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                for (Object a : (Collection) obj) {
                    jSONArray.put(m12213a(a));
                }
                return jSONArray;
            } else if (obj.getClass().isArray()) {
                JSONArray jSONArray2 = new JSONArray();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    jSONArray2.put(m12213a(Array.get(obj, i)));
                }
                return jSONArray2;
            } else if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    jSONObject.put((String) entry.getKey(), m12213a(entry.getValue()));
                }
                return jSONObject;
            } else if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short)) {
                return obj;
            } else {
                if (obj instanceof String) {
                    return obj;
                }
                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                    return obj.toString();
                }
                return null;
            }
        } catch (Exception unused) {
        }
    }
}
