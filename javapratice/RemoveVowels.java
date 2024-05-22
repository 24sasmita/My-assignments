package javapratice;

public class RemoveVowels {
	void removeVowels(String str){
	    for(int i=0; i<str.length();i++){
		char ch =str.charAt(i) ;
		if(ch== 'a' || ch== 'e' ||ch== 'i' ||ch== 'o' ||ch== 'u' ){
		str=str.replace(ch,'*');
		}
		}
		String str1= String.valueOf('*');
		str=str.replace(str1,"");
		System.out.println(str);
		}
		
		public static void main(String[] args) {
			new RemoveVowels().removeVowels("technocredits");
		}
		}
		

