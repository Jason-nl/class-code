package com.itheima.day16.base64;

import org.junit.Test;

import java.util.Base64;

/**
 * created by Ethan on 2020/10/27 3:17 下午
 */
public class Demo01 {

    @Test
    public void testDemo() {
        // base base64
        String str = "中国";
        String baseEncode = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(baseEncode);

        byte[] bytes = Base64.getDecoder().decode(baseEncode);
        String baseDecode = new String(bytes);
        System.out.println(baseDecode);

        // url base64
        String urlEncode = Base64.getUrlEncoder().encodeToString(str.getBytes());
        System.out.println(urlEncode);

        byte[] urlDecode = Base64.getUrlDecoder().decode(urlEncode);
        System.out.println(new String(urlDecode));

        // MIME base64
        String mimeEncode = Base64.getMimeEncoder().encodeToString(str.getBytes());
        System.out.println(mimeEncode);

        byte[] mimeDecode = Base64.getMimeDecoder().decode(mimeEncode);
        System.out.println(new String(mimeDecode));
    }
}
