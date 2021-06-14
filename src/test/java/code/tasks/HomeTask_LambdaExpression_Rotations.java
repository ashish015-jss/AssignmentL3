package code.tasks;

@FunctionalInterface
interface Rotation
{
    boolean areRotation(String arg1,String arg2);
}
public class HomeTask_LambdaExpression_Rotations {

    public static void main(String[] arg)
    {
        Rotation rotation = (String str1,String str2) -> {
            return ((str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1));
        };

        System.out.println("Is Rotation string ?:: "+rotation.areRotation("ABCD","CDAB"));
    }
}
