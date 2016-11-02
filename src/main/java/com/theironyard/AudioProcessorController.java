//package com.theironyard;
//
//
//import javax.sound.sampled.AudioFileFormat;
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Mixer;
//import java.io.File;
//import java.io.SequenceInputStream;
//import java.util.ArrayList;
//import java.util.Collection;
//
//public class AudioProcessorController {
//    public static void main(String[] args) {
//        String bass = "/Users/WesleyLewis/workspace/AudioProcessingSandbox/PlayMeIn/Bass.wav";
//        String harmony1 = "/Users/WesleyLewis/workspace/AudioProcessingSandbox/PlayMeIn/Harmony1.wav";
//        String harmony2 = "/Users/WesleyLewis/workspace/AudioProcessingSandbox/PlayMeIn/Harmony2.wav";
//        String melody = "/Users/WesleyLewis/workspace/AudioProcessingSandbox/PlayMeIn/Melody.wav";
//        String percussion = "/Users/WesleyLewis/workspace/AudioProcessingSandbox/PlayMeIn/Percussion.wav";
//        String percussionAccent = "/Users/WesleyLewis/workspace/AudioProcessingSandbox/PlayMeIn/PercussionAccent.wav";
//        String vox = "/Users/WesleyLewis/workspace/AudioProcessingSandbox/PlayMeIn/Vocal.wav";
//
//        Collection list = new ArrayList();
//        list.add(bass);
//        list.add(harmony1);
//        list.add(harmony2);
//        list.add(melody);
//        list.add(percussion);
//        list.add(percussionAccent);
//        list.add(vox);
//
//        Mixer mixer;
//
//
//        try {
//            AudioInputStream clip1 = AudioSystem.getAudioInputStream(new File(bass));
//            AudioInputStream clip2 = AudioSystem.getAudioInputStream(new File(harmony1));
//            AudioInputStream clip3 = AudioSystem.getAudioInputStream(new File(harmony2));
//            AudioInputStream clip4 = AudioSystem.getAudioInputStream(new File(melody));
//            AudioInputStream clip5 = AudioSystem.getAudioInputStream(new File(percussion));
//            AudioInputStream clip6 = AudioSystem.getAudioInputStream(new File(percussionAccent));
//            AudioInputStream clip7 = AudioSystem.getAudioInputStream(new File(vox));
//
//            AudioInputStream combinedFiles =
//                    new AudioInputStream(
//                            new SequenceInputStream(clip1, clip2), clip1.getFormat(), clip1.getFrameLength() + clip2.getFrameLength());
//
//
//            AudioSystem.write(combinedFiles, AudioFileFormat.Type.WAVE, new File("combinedFiles.wav"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
