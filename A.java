package Array;

public class A {

	public static void main(String[] args) {
      int a[]= new int [4];
      a[0]=1;
      a[1]=2;
      a[2]=3;
      a[3]=4;  
      System.out.println(a[1]);
      System.out.println();
      for (int m=0;m<3;m++) {
    	  System.out.println(a[m]);  }
      System.out.println();
      for (int j=3;j>=0;j--) {
    	  System.out.println(a[j]);
      }
      System.out.println();

      System.out.println(a.length);
      
	}

}
