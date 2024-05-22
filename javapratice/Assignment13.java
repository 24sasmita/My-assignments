package javapratice;

class Assignment13{

    void lastnumber(int startRange, int endRange){
		 for(int i=endRange; i>=startRange; i--){
			 if(i%5==0 && i%9==0){
				 System.out.println(i);
				 break;
				 
			 }
		 }
	 }
	 public static void main(String[] args){
		 Assignment13 assignment13 = new Assignment13();
		 assignment13.lastnumber(5, 100);
	
	 }

}