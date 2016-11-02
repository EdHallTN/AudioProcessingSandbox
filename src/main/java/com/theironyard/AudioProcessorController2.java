package com.theironyard;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class AudioProcessorController2 {
    public static void main(String[] args) throws Exception {
        Path bass = Paths.get("/Users/WesleyLewis/workspace/AudioProcessingSandbox/PlayMeIn/Bass1.wav");
        Path harmony1 = Paths.get("/Users/WesleyLewis/workspace/AudioProcessingSandbox/PlayMeIn/Harmony11.wav");
        Path harmony2 = Paths.get("/Users/WesleyLewis/workspace/AudioProcessingSandbox/PlayMeIn/Harmony21.wav");
        Path melody = Paths.get("/Users/WesleyLewis/workspace/AudioProcessingSandbox/PlayMeIn/Melody1.wav");
        Path percussion = Paths.get("/Users/WesleyLewis/workspace/AudioProcessingSandbox/PlayMeIn/Percussion1.wav");
        Path percussionAccent = Paths.get("/Users/WesleyLewis/workspace/AudioProcessingSandbox/PlayMeIn/PercussionAccent1.wav");
        Path vox = Paths.get("/Users/WesleyLewis/workspace/AudioProcessingSandbox/PlayMeIn/Vocal1.wav");

        byte[] byte1 = Files.readAllBytes(bass);
        byte[] byte2 = Files.readAllBytes(harmony1);
        byte[] byte3 = Files.readAllBytes(harmony2);
        byte[] byte4 = Files.readAllBytes(melody);
        byte[] byte5 = Files.readAllBytes(percussion);
        byte[] byte6 = Files.readAllBytes(percussionAccent);
        byte[] byte7 = Files.readAllBytes(vox);
        byte[] out = new byte[byte1.length];

        for (int i = 0; i < byte1.length; i++) {
            out[i] = (byte) (((int) byte1[i]) + (int) byte2[i] + (int) byte3[i] +
                    (int) byte4[i] + (int) byte5[i] + (int) byte6[i] + (int) byte7[i] >> 2);
        }
        ByteArrayInputStream bais = new ByteArrayInputStream(out);
S
        AudioFormat format = new AudioFormat(44100, 16, 2, true, false);
        AudioInputStream stream = new AudioInputStream(bais, format,
                out.length / format.getFrameSize());
        File file = new File("file.wav");
        AudioSystem.write(stream, AudioFileFormat.Type.WAVE, file);


    }
}