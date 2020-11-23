package basicsyntax;
class Test{
public Test(){
    int x=5;
    int y=10;
    int sum=add(5,10);
    int[] arr={2,1,3,4,5};
    System.out.println("Sum Is : "+sum);
    System.out.println("Average Is : "+average(arr));
    System.out.println("Minimum Is : "+min(arr));
    System.out.println("Minimum Is : "+minimum(arr));
    
} 
public int minimum(int[] arr){
    int minimum=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++)
        minimum=Math.min(minimum, arr[i]);
    return minimum;
}
public int min(int[] arr){
    int minimum=arr[0];
    for(int i=1;i<arr.length;i++)
        minimum=Math.min(minimum, arr[i]);
    return minimum;
}
public double average(int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
    return (double)sum/arr.length;
}
public int add(int x,int y){
    int sum=x+y;
    return sum;
}
}
public class BasicSyntax {

    public static void main(String[] args) {
       new Test();
    }
    
}
