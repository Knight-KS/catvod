package com.github.catvod.spider;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.crawler.SpiderReq;
import com.github.catvod.crawler.SpiderUrl;
import com.github.catvod.spider.merge.C0009B9;
import com.github.catvod.spider.merge.C0111Nu;
import com.github.catvod.spider.merge.C0329c;
import com.github.catvod.spider.merge.C0337cw;
import com.github.catvod.spider.merge.C0538uH;
import com.github.catvod.spider.merge.C0554wf;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class Zjdr extends C0329c {

    /* renamed from: S */
    private final Pattern f43S = Pattern.compile(C0337cw.m1497us(-114607777683558L));

    /* renamed from: o */
    private HashMap<String, String> m80o(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(C0337cw.m1497us(-114831115982950L), C0337cw.m1497us(-114861180754022L));
        hashMap.put(C0337cw.m1497us(-114878360623206L), C0337cw.m1497us(-114899835459686L));
        hashMap.put(C0337cw.m1497us(-114938490165350L), C0337cw.m1497us(-115050159315046L));
        hashMap.put(C0337cw.m1497us(-115058749249638L), C0337cw.m1497us(-115075929118822L));
        hashMap.put(C0337cw.m1497us(-115084519053414L), C0337cw.m1497us(-115131763693670L));
        hashMap.put(C0337cw.m1497us(-115655749703782L), C0337cw.m1497us(-115685814474854L));
        hashMap.put(C0337cw.m1497us(-116007937022054L), C0337cw.m1497us(-116076656498790L));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M4 */
    public boolean mo85M4(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public String mo86S() {
        return C0337cw.m1497us(-114779576375398L);
    }

    /* access modifiers changed from: protected */
    /* renamed from: jx */
    public String mo87jx() {
        return C0337cw.m1497us(-114710856898662L);
    }

    public String searchContent(String str, boolean z) {
        try {
            String str2 = mo87jx() + C0337cw.m1497us(-116334354536550L) + URLEncoder.encode(str);
            C0009B9 us = C0538uH.m2218us(SpiderReq.get(new SpiderUrl(str2, m80o(str2))).content);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            C0554wf wI = us.mo432wI(C0337cw.m1497us(-116424548849766L));
            for (int i = 0; i < wI.size(); i++) {
                C0111Nu nu = (C0111Nu) wI.get(i);
                String S = nu.mo223S(C0337cw.m1497us(-116613527410790L));
                String S2 = nu.mo427sn(C0337cw.m1497us(-116639297214566L)).mo223S(C0337cw.m1497us(-116686541854822L));
                String f = nu.mo427sn(C0337cw.m1497us(-116746671396966L)).mo419f();
                Matcher matcher = this.f43S.matcher(nu.mo223S(C0337cw.m1497us(-116806800939110L)));
                if (matcher.find()) {
                    String group = matcher.group(1);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C0337cw.m1497us(-116828275775590L), group);
                    jSONObject2.put(C0337cw.m1497us(-116858340546662L), S);
                    jSONObject2.put(C0337cw.m1497us(-116896995252326L), S2);
                    jSONObject2.put(C0337cw.m1497us(-116931354990694L), f);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put(C0337cw.m1497us(-116982894598246L), jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return C0337cw.m1497us(-117004369434726L);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: tC */
    public boolean mo89tC(String str) {
        return !str.equals(C0337cw.m1497us(-114818231081062L));
    }
}

