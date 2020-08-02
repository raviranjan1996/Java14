package midi;

import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.ShortMessage;
import static midi.Chord.Type.*;

public class PlayingNote {

	public static void main(String[] args)
			throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
		var receiver = MidiSystem.getReceiver();
		
		List<Chord> chord = List.of(
				new Chord(60 , MAJOR),
				new Chord(60 , SUS4),
				new Chord(55 , MAJOR),
				new Chord(55 , SUS4),
				new Chord(53 , MAJOR),
				new Chord(53 , SUS4)
	);
		
		int time=0 ; 
		for(Chord chords: chord) {
			for(int note:chords) {
				receiver.send(new ShortMessage(ShortMessage.NOTE_ON, 0, note, 127), time * 1_000_000);
				receiver.send(new ShortMessage(ShortMessage.NOTE_ON, 0, note, 127), (time+1) * 1_000_000);
				
			}
			time++;
			System.out.println(chords);
			
		}
			Thread.sleep(7000);
	}

}
