class Sentence {
	public static void main(String[] args) {
		System.out.println("Enter Sentence Now \n------( type quit anywhere to exit the loop the sentence in which that sentence vowels is not counted)------");
		CountVowels countvowels =new CountVowels();
		while(true)
		{
			countvowels.setmethod();
			if(countvowels.str.contains("QUIT") || countvowels.str.contains("quit"))
				break;
			countvowels.counts();
			System.out.println("Count of Vowels is "+countvowels.countVowelNo);
			countvowels.countVowelNo=0;
		}
	}
}