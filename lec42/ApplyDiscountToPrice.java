package lec42;

public class ApplyDiscountToPrice {
    class Solution {
        public String discountPrices(String sentence, int discount) {
            String[] arr = sentence.split(" ");
            StringBuilder sb = new StringBuilder();
            for(String word : arr)
            {
                if(word.startsWith("$") && word.length() > 1 && checkDigit(word.substring(1)))
                {
                    double price = Double.parseDouble(word.substring(1));
                    double disPrice = price * (1 - discount) / 100;
                    word = String.format("%.2f",disPrice);
                }
                sb.append(word);
                sb.append(" ");
            }
            return sb.toString().trim();
        }

        public static boolean checkDigit(String word)
        {
            for(int i = 0;i < word.length();i++)
            {
                if(!Character.isDigit(word.charAt(i)))
                    return false;
            }
            return true;
        }
    }
}
