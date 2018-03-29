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
            String keyEncryptStr = "1693678899373163143220882243629595b1998606836654152381216395338149947b411389078515786266175667401547523b2129455291003437518750456524838933ba3229346867482050612360563651832679a2872224280157963879662400419830093";
//            System.out.println(keyEncryptStr.length());
            String decryptKeyStr = Decode.decode(keyEncryptStr);
            String decryptStr = decrypt(decryptKeyStr, "rKp7GvgdmLQ=");
            System.out.println("==>"+decryptStr);

        } catch (Exception var4) {

        }
    }
}
