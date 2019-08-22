
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
public class Driver {
	private static final String  VOICENAME = "kevin16";
	public static void main(String[] args) {
		Voice voice;
		VoiceManager voiceManager = VoiceManager.getInstance();
		voice = voiceManager.getVoice(VOICENAME);
		voice.allocate();
		
		try {
			String word = "Hello world";
			voice.speak(word);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
