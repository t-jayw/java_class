abstract class AbstractMusicLibrary
{
	AbstractMusicLibrary()
	{
		System.out.println("We provide 99 midi voices, and you can add your own custom voices to the library");
	}
	int pianoVoice(String voiceName)
	{
		if(voiceName == "piano") return 1;
		else if(voiceName == "organ") return 2;
		else return 0;
	}
	int guitarVoice(String voiceName)
	{
		if (voiceName == "acousticGuitar") return 10;
		else if (voiceName == "electricGuitar") return 20;
		else return 0;
	}
	// we recommend a integer that is >= 100
	abstract int yourCustomInstrumentVoice(String voicename);
}
class CustomMusicLibrary extends AbstractMusicLibrary
{
	int yourCustomInstrumentVoice(String voicename) { return 100; }
}
class AbstractMusicLibraryDemo
{
   public static void main(String[] args)
   {
      CustomMusicLibrary cml = new CustomMusicLibrary();
   }
}