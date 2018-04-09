package xyz.wongs.es.utils;

import com.ailk.ods.main.Decode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Decoder;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;

/**
 * @author
 * @create 2017-12-14 17:48
 **/
public class DecryptStrUtil {

    static Logger logger = LoggerFactory.getLogger(DecryptStrUtil.class);

    public static String decrypt(String key, String srcStr) throws Exception {
        byte[] base64DecryptBytes = decryptBASE64(srcStr);
        String threeDesDecryptStr = new String(decryptTreeDes(key.getBytes(), base64DecryptBytes),"GBK");
        return threeDesDecryptStr;
    }

    /**
     *
     * @param srcStr
     * @return
     * @throws IOException
     */
    private static byte[] decryptBASE64(String srcStr) throws IOException {
        return (new BASE64Decoder()).decodeBuffer(srcStr);
    }


    private static byte[] decryptTreeDes(byte[] keyBytes, byte[] srcBytes) throws Exception {
        SecretKey deskey = new SecretKeySpec(keyBytes, "DESede");
        Cipher c1 = Cipher.getInstance("DESede");
        c1.init(2, deskey);
        return c1.doFinal(srcBytes);
    }

    /**
     *
     * @param keys
     * @param srcStr
     * @return
     */
    public static String decryptOut(String keys,String srcStr)  throws Exception{
        String decryptStr = null;
        String decryptKeyStr = Decode.decode(keys);
        decryptStr = DecryptStrUtil.decrypt(decryptKeyStr, srcStr);
        return decryptStr;
    }

    public static void main(String[] args) {
        try {
            String keyEncryptStr = "35978571415977990640790233606922b35612625856609431690706122531003b116946451507947624980923738977607b57604983527287888499789600301035ba158691117285651103031789930436719a115112825209397018941192450965271";
            String decryptKeyStr = Decode.decode(keyEncryptStr);
            String decryptStr = decrypt(decryptKeyStr, "fzbD0DtdbvI=");//fzbD0DtdbvI=    PuBgN8oftv0=
            System.out.println("==>"+decryptStr);

        } catch (Exception var4) {

        }
    }
}
