package Practice;

public class RemoveCharacter {

	public static void main(String[] args) {
		// WAP to remove given characters from a string. For example String s1= “Appzlogic”, given char ch = ‘p’ | The output would be ‘Azlogic’

		String s1= "Appzlogic";
		String ress="";
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='p');
			{
				ress=s1.replace("p","");
			}
		}
		System.out.println(ress);
	}

}
