package base;

import java.util.Base64;

public class Encoderr {

    public static String decode64(String encodeValue) {

        Base64.Decoder decoder = Base64.getDecoder();
        return new String(decoder.decode(encodeValue.getBytes()));

    }

}
