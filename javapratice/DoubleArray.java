package javapratice;

public class DoubleArray {


		  void printdoubleArray(Double[] d){
		  double sum=0;
		  for(int i=0;i<d.length;i++){
		  sum= sum+ d[i];
		  }
		  System.out.println(sum);
		  }
		  public static void main(String[] args){
		  Double[] d={10.20, 45.50, 34.65, 20.60, 25.46, 78.90};
		  new DoubleArray ().printdoubleArray(d);
		  }
		  }


