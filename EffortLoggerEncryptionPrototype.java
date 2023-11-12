// Author: Daksh Diyora


import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

public class EffortLoggerEncryptionPrototype {

    private static SecretKey secretKey;

    public static void main(String[] args) {
        // Step 1: Initialize secret key
        initializeSecretKey();

        // Step 2: Get password from user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String userPassword = scanner.nextLine();

        // Step 3: Encrypt and display the encrypted data
        String encryptedData = encrypt(userPassword);
        System.out.println("\nEncrypted Data: " + encryptedData);

        // Step 4: Decrypt and display the decrypted data
        String decryptedData = decrypt(encryptedData);
        System.out.println("Decrypted Data: " + decryptedData);
    }

    private static void initializeSecretKey() {
        try {
            // Initialize KeyGenerator with AES algorithm
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            // Generate a secret key
            secretKey = keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    private static String encrypt(String data) {
        try {
            // Step 1: Initialize Cipher for encryption
            Cipher cipher = Cipher.getInstance("AES");
            // Step 2: Initialize Cipher with secret key for encryption
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            // Step 3: Encrypt the data
            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            // Step 4: Encode the encrypted bytes to Base64
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String decrypt(String encryptedData) {
        try {
            // Step 1: Initialize Cipher for decryption
            Cipher cipher = Cipher.getInstance("AES");
            // Step 2: Initialize Cipher with secret key for decryption
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            // Step 3: Decode Base64 and decrypt the data
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
            // Step 4: Convert decrypted bytes to string
            return new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
