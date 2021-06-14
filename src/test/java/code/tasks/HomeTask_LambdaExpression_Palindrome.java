package code.tasks;

@FunctionalInterface
interface Palindrome
{
    void checkPelindrome(int num);
}
public class HomeTask_LambdaExpression_Palindrome {

    public static void main(String[] arg)
    {

        Palindrome palindrome =(int num)-> {
            int r,sum=0;
            int temp=num;
            while(num>0){
                r=num%10;
                sum=(sum*10)+r;
                num=num/10;
            }
            if(temp==sum)
                System.out.println("palindrome number ");
            else
                System.out.println("Not palindrome");

        };
        palindrome.checkPelindrome(38831);
        palindrome.checkPelindrome(6336);
    }
}
