public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newww = "";
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            newww= newww + (char)(str.charAt(i)+32);
        else
            newww= newww + str.charAt(i);
       }
        return newww;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int count =0;
            for(int i = 0; i<str1.length(); i++){
                if(str1.charAt(i)==str2.charAt(0)){
                    for(int j = 1 ; j<str2.length();j++){
                   if (i + j >= str1.length() || str1.charAt(i + j) != str2.charAt(j)) {
                    count = 0;
                    break;
                }
                        if(str1.charAt(i+j)==str2.charAt(j))
                            count++;
                    }
                    if(count+1==str2.length())
                        return true; 
                }
                 count =0;
            }
        return false;
    }
}
