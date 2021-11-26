package com.github.catvod.spider;

import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.crawler.SpiderReq;
import com.github.catvod.crawler.SpiderReqResult;
import com.github.catvod.crawler.SpiderUrl;
import com.github.catvod.spider.merge.C0111Nu;
import com.github.catvod.spider.merge.C0337cw;
import com.github.catvod.spider.merge.C0538uH;
import com.github.catvod.spider.merge.C0554wf;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class XPathSubb extends XPath {

    /* renamed from: jx */
    private String f37jx = C0337cw.m1497us(-100735033317478L);

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public String mo81B(String str) {
        try {
            return mo82BL(MessageDigest.getInstance(C0337cw.m1497us(-100773688023142L)).digest(str.getBytes(C0337cw.m1497us(-100790867892326L))));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: BL */
    public String mo82BL(byte[] bArr) {
        StringBuilder sb = new StringBuilder(C0337cw.m1497us(-100769393055846L));
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString().toLowerCase();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public String mo83K(String str) {
        String us = C0337cw.m1497us(-100816637696102L);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            us = us + (charAt + 1);
        }
        return us;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M4 */
    public HashMap<String, String> mo64M4(String str) {
        HashMap<String, String> M4 = super.mo64M4(str);
        if (this.f37jx.length() > 0) {
            M4.put(C0337cw.m1497us(-100739328284774L), this.f37jx);
        }
        return M4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public SpiderReqResult mo65S(String str) {
        SpiderDebug.log(str);
        SpiderReqResult spiderReqResult = SpiderReq.get(new SpiderUrl(str, mo64M4(str)));
        if (!spiderReqResult.content.contains(C0337cw.m1497us(-100820932663398L))) {
            return spiderReqResult;
        }
        C0554wf wI = C0538uH.m2218us(spiderReqResult.content).mo432wI(C0337cw.m1497us(-100859587369062L));
        for (int i = 0; i < wI.size(); i++) {
            C0111Nu nu = (C0111Nu) wI.get(i);
            if (nu.mo1382H(C0337cw.m1497us(-100889652140134L))) {
                String S = nu.mo223S(C0337cw.m1497us(-100906832009318L));
                if (S.startsWith(C0337cw.m1497us(-100924011878502L))) {
                    HashMap<String, String> M4 = mo64M4(str);
                    M4.put(C0337cw.m1497us(-100966961551462L), this.f25S.mo826m());
                    String str2 = SpiderReq.get(new SpiderUrl(this.f25S.mo826m() + S, M4)).content;
                    int indexOf = str2.indexOf(C0337cw.m1497us(-101001321289830L)) + 5;
                    String substring = str2.substring(indexOf, str2.indexOf(C0337cw.m1497us(-101027091093606L), indexOf));
                    int indexOf2 = str2.indexOf(C0337cw.m1497us(-101035681028198L)) + 7;
                    String substring2 = str2.substring(indexOf2, str2.indexOf(C0337cw.m1497us(-101070040766566L), indexOf2));
                    SpiderReqResult spiderReqResult2 = SpiderReq.get(new SpiderUrl(this.f25S.mo826m() + C0337cw.m1497us(-101078630701158L) + substring + C0337cw.m1497us(-101516717365350L) + mo81B(mo83K(substring2)), M4));
                    if (spiderReqResult2.headers.containsKey(C0337cw.m1497us(-101551077103718L))) {
                        this.f37jx = (String) ((List) spiderReqResult2.headers.get(C0337cw.m1497us(-101598321743974L))).get(0);
                    }
                    return SpiderReq.get(new SpiderUrl(str, mo64M4(str)));
                }
            }
        }
        return spiderReqResult;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bI */
    public void mo66bI(String str, JSONObject jSONObject) {
        super.mo66bI(str, jSONObject);
        try {
            String trim = jSONObject.optString(C0337cw.m1497us(-101778710370406L)).trim();
            if (trim.length() > 0) {
                String[] split = trim.split(C0337cw.m1497us(-101838839912550L));
                for (int i = 0; i < split.length; i++) {
                    if (split[i].trim().length() != 0) {
                        split[i] = split[i] + C0337cw.m1497us(-101868904683622L);
                    }
                }
                jSONObject.put(C0337cw.m1497us(-101933329193062L), TextUtils.join(C0337cw.m1497us(-101993458735206L), split));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fv */
    public String mo84fv(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(C0337cw.m1497us(-101645566384230L)), C0337cw.m1497us(-101671336188006L));
            Cipher instance = Cipher.getInstance(C0337cw.m1497us(-101688516057190L));
            instance.init(2, secretKeySpec, new IvParameterSpec(str3.getBytes()));
            try {
                return new String(instance.doFinal(Base64.decode(str, 0)));
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            mo74jx();
            C0554wf wI = C0538uH.m2218us(mo65S(this.f25S.mo778B8().isEmpty() ? str2 : this.f25S.mo778B8().replace(C0337cw.m1497us(-102010638604390L), str2)).content).mo432wI(C0337cw.m1497us(-102053588277350L));
            for (int i = 0; i < wI.size(); i++) {
                C0111Nu nu = (C0111Nu) wI.get(i);
                if (nu.mo411X().contains(C0337cw.m1497us(-102083653048422L))) {
                    String[] split = nu.mo411X().replaceAll(C0337cw.m1497us(-102173847361638L), C0337cw.m1497us(-102186732263526L)).split(C0337cw.m1497us(-102191027230822L));
                    String str3 = mo84fv(split[3], split[8], split[11]).split(C0337cw.m1497us(-102225386969190L))[1];
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C0337cw.m1497us(-102294106445926L), 0);
                    jSONObject.put(C0337cw.m1497us(-102319876249702L), C0337cw.m1497us(-102354235988070L));
                    jSONObject.put(C0337cw.m1497us(-102358530955366L), C0337cw.m1497us(-102388595726438L));
                    jSONObject.put(C0337cw.m1497us(-102689243437158L), str3);
                    return jSONObject.toString();
                }
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return super.playerContent(str, str2, list);
    }
}
