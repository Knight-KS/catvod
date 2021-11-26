package com.github.catvod.spider;

import android.content.Context;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.crawler.SpiderReq;
import com.github.catvod.crawler.SpiderUrl;
import com.github.catvod.spider.merge.C0065J;
import com.github.catvod.spider.merge.C0337cw;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

public class Rrm extends C0065J {

    /* renamed from: S */
    private String[] f23S = {C0337cw.m1497us(-91621112715366L), C0337cw.m1497us(-91638292584550L), C0337cw.m1497us(-91655472453734L), C0337cw.m1497us(-91672652322918L), C0337cw.m1497us(-91689832192102L), C0337cw.m1497us(-91707012061286L), C0337cw.m1497us(-91724191930470L), C0337cw.m1497us(-91741371799654L), C0337cw.m1497us(-91758551668838L), C0337cw.m1497us(-91775731538022L), C0337cw.m1497us(-91792911407206L), C0337cw.m1497us(-91810091276390L), C0337cw.m1497us(-91827271145574L), C0337cw.m1497us(-91840156047462L)};

    /* renamed from: bI */
    String f24bI = C0337cw.m1497us(-91616817748070L);

    public void init(Context context, String str) {
        Rrm.super.init(context, str);
        this.f24bI = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: jx */
    public String mo60jx() {
        return C0337cw.m1497us(-91853040949350L);
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(C0337cw.m1497us(-92170868529254L), C0337cw.m1497us(-92218113169510L));
            String str3 = SpiderReq.get(new SpiderUrl(C0337cw.m1497us(-92046314477670L) + str2, hashMap)).content;
            String us = C0337cw.m1497us(-92712034408550L);
            int indexOf = str3.indexOf(us) + us.length();
            String substring = str3.substring(indexOf, str3.indexOf(C0337cw.m1497us(-92785048852582L), indexOf));
            String us2 = C0337cw.m1497us(-92793638787174L);
            int indexOf2 = str3.indexOf(us2) + us2.length();
            String tC = mo62tC(str3.substring(indexOf2, str3.indexOf(C0337cw.m1497us(-92832293492838L), indexOf2)), this.f24bI, substring);
            if (tC.startsWith(C0337cw.m1497us(-92840883427430L))) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C0337cw.m1497us(-92862358263910L), 0);
                jSONObject.put(C0337cw.m1497us(-92888128067686L), C0337cw.m1497us(-92922487806054L));
                jSONObject.put(C0337cw.m1497us(-92926782773350L), tC);
                return jSONObject.toString();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0337cw.m1497us(-92943962642534L), 1);
            jSONObject2.put(C0337cw.m1497us(-92969732446310L), C0337cw.m1497us(-93004092184678L));
            jSONObject2.put(C0337cw.m1497us(-93128646236262L), str2);
            return jSONObject2.toString();
        } catch (Exception unused) {
            return C0337cw.m1497us(-93145826105446L);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: tC */
    public String mo62tC(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(C0337cw.m1497us(-93150121072742L)), C0337cw.m1497us(-93175890876518L));
            Cipher instance = Cipher.getInstance(C0337cw.m1497us(-93193070745702L));
            instance.init(2, secretKeySpec, new IvParameterSpec(str3.getBytes(C0337cw.m1497us(-93283265058918L))));
            return new String(instance.doFinal(Base64.decode(str, 0)), C0337cw.m1497us(-93309034862694L));
        } catch (Exception e) {
            SpiderDebug.log(e);
            return C0337cw.m1497us(-93334804666470L);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: us */
    public String[] mo63us() {
        return this.f23S;
    }
}


 Twitter  Facebook  Stumbleupon  LinkedIn
Select a decompiler
 Procyon - fast decompiler for modern Java
 CFR - very good and well-supported decompiler for modern Java
 JDCore (very fast)
 Jadx, fast and with Android support
 Fernflower
 JAD (very fast, but outdated)
Privacy Policy

