package xyz.wongs;

/**
 * Unit test for simple App.
 */

public class AppTest  {


    public static void main(String[] args) {
        String mId = "LDAPM_MPW_BD_PSNDOC.20171107.201711.00.001.001.815.DAT.gz";
        String monthId = (mId.split("\\."))[2];
        System.out.println(monthId);
    }

}
