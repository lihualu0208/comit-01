package arrayexample;

import java.util.Arrays;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
  //1st way to create an array know the initial value
	
    int[] a= {4,5,61,7};
     
    for (int i:a) {
      // System.out.println(i);
       System.out.print(i +"/n");
    }
    a[2]=100;
    for (int i=0;i<a.length;i++) {
    	int j=a[i];
    	System.out.println(j);
    }
    
    //2nd way to create an array when i don't know the initial value
    int []c=new int[10];    
    c[c.length-1]=107;
    //prints out of memory
    System.out.println(a);
    //java library array prints out element in one line
	String [] brands= {"tokyo","ford","bmw","dasauto"};
    System.out.println(Arrays.toString(c));
    System.out.println(Arrays.toString(brands));
    System.out.println("a.lengths打发打发dads= "+ a.length);
	}

	
	
   
}