package ru.vitaliy.task12;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@Component
public class Hasher {
    private byte[] text;

    @Value("${first-argument}")
    private String inputPath;

    @Value("${second-argument}")
    private String outputPath;

    @PostConstruct
    public void readFile() {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            if (Files.exists(Paths.get(inputPath))) {
                try {
                    InputStream is = Files.newInputStream(Paths.get(inputPath));
                    DigestInputStream dis = new DigestInputStream(is, md);
                    text = md.digest();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                text = "null".getBytes();
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    @PreDestroy
    public void writeFile() {
        try {
            OutputStream os = Files.newOutputStream(Paths.get(outputPath));
            os.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
