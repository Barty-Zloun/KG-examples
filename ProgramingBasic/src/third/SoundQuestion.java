/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third;

/**
 *
 * @author Bartoloměj Sviták
 */
public class SoundQuestion {

    private static RandomNoteGenerator randomnote = new RandomNoteGenerator();
    String question;
    String note;
    int difficulty;
    int answer;
    int msecs;
    double vol;

    public void show() {
        System.out.println("pozorně poslouchej");
        for (int i = 0; i <= difficulty; i++) {
        SoundUtils.plays(note, msecs, vol);    
        }
        System.out.println("napis název/y tonu/ů");
    }

    public boolean checkAnswer(String tone) {
        if (tone.equals(note)) {
            return true;
        }
        return false;
    }

    public SoundQuestion(int difficulty) {
        this.difficulty = difficulty;
        note = randomnote.nextNote();
    }
    
}
