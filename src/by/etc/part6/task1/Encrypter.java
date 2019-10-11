package by.etc.part6.task1;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Encrypter {

    public static String encryptPass(Client client) {
        String finalPassView = null;

        try {
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keygenerator.generateKey();

            Cipher desCipher;
            desCipher = Cipher.getInstance("DES");

            byte[] text = client.getPassword().getBytes("UTF8");

            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            byte[] textEncrypted = desCipher.doFinal(text);

            finalPassView = new String(textEncrypted);

        } catch(Exception e) {
            System.out.println("Exception");
        }

        return finalPassView;
    }
}
