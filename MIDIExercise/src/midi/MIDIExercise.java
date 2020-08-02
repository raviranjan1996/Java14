package midi;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.ShortMessage;

public class MIDIExercise {

	public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
	var reciever = MidiSystem.getReceiver();
	
	ShortMessage mgs = new ShortMessage();
	mgs.setMessage(ShortMessage.NOTE_ON , 0 , 60 ,127);
	
	reciever.send(mgs, 1);
	Thread.sleep(3000);

	}

}
