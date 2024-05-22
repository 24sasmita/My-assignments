package javapratice;

public class RemoveUpper {
	
	void removeUppercase(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			boolean flag=Character.isUpperCase(ch);
			if(flag==true) {
				String temp =String.valueOf(ch);
				str = str.replace(temp, "*");
			}
	}
	String str1 = str.replace("*","");
	System.out.print(str1);
}
	

	public static void main(String[] args) {
		RemoveUpper removeUpper= new RemoveUpper();
		removeUpper.removeUppercase("TechNoCREdits");

	}

}
