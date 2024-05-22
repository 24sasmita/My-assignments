package javapratice;

class Assignment24{
	
	

	      void sumof(String str){
			  int evensum=0;
			  int oddsum=0;
			  for(int i=0; i<str.length();i++){
				  char ch= str.charAt(i);
				  int charch= Character.getNumericValue(ch);
				  if(Character.isDigit(ch)){
					  if(charch%2 ==0){
						  evensum= evensum+charch;
	//System.out.println(sum);
					  }else
						  oddsum= oddsum+charch;
				  }
				   //System.out.println(sum);
			  }
			 if(evensum>oddsum) {
				 System.out.println(evensum-oddsum);
			 }else if(evensum<oddsum)
				 System.out.println(oddsum-evensum);
			
	      }
					  	
	
	public static void main(String[] args){
		Assignment24 assignment24= new Assignment24();
		assignment24.sumof("te3ch4noc7re9d8its");
	}
}