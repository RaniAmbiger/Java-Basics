class  p46
{
	public static void main(String[] args) 
	{
		char character='I';
		switch(character)
		{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':{System.out.println(character+" is a vowel");
					break;
				   }
			default:{System.out.println(character+" is consontant");
					break;
				   }
		}
	}
}
