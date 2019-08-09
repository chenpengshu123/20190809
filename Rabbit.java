import java.util.Scanner;
public class Rabbit {
    public static void main(String[] args) {
      // 方法一
      /*
	  int  f1 = 2;
      int  f2=2; 
      System.out.println("请输入月份");
      Scanner scanner=new Scanner(System.in);
      int mouth=scanner.nextInt();
      int temp = 0;
      for (int i = 3; i <=mouth; i++) {
         if (mouth==1||mouth==2) 
            f2=2;
         else 
            temp=f2;
            f2=f1+f2;
            f1=temp;
      }
      System.out.println(f2);
	  */
	  // 方法二
      System.out.println("请输入月份");
      Scanner scanner=new Scanner(System.in);
      int mouth=scanner.nextInt();
	  for(int i=1;i<=mouth;i++){
		  System.out.println("第"+i+"月的兔子为："+f(i));
	  }
   }


public static int f(int x){
	if(x==1||x==2)
		return 1;
	else
		return f(x-1)+f(x-2);
	
    }
}
