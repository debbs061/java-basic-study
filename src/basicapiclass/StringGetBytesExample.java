package basicapiclass;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "안녕하세요";

        // 시스템의 기본 문자셋으로 인코딩된 바이트 배열 리턴
        byte[] bytes1 = str.getBytes();
        String str1 = new String(bytes1);
        System.out.println("bytes1 -> String: " + str1);

        try {
            // 특정 문자셋으로 인코딩된 바이트 배열을 받으려는 경우
            byte[] bytes2 = str.getBytes("EUC-KR");
            System.out.println("bytes2.length");
            String str2 = new String(bytes2, "EUC-KR");
            System.out.println("bytes2 -> String: " + str2);
        } catch (UnsupportedEncodingException e) {

        }

    }
}
