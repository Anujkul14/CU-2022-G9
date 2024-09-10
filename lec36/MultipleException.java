package lec36;

public class MultipleException {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        try
        {

            System.out.println(arr[4]);
            //normal flow
            System.out.println(arr[2]);
            //ArithmaticException
            int val = 10 / 0;

            String s = null;
            System.out.println(s);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.toString());
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
