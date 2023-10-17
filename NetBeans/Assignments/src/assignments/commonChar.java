/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignments;

public class commonChar {
    public static void main(String[] args) {
        String str1 = "Vaibhav Mohote";
        String str2 = "Akashayei ParamM";
        
        String commonChars = findchar(str1, str2);
        System.out.println("Common characters: " + commonChars);
    }
    
    public static String findchar(String str1, String str2) {
        StringBuilder commonChars = new StringBuilder();
        
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (str2.indexOf(c) != -1 && commonChars.indexOf(String.valueOf(c)) == -1) {
                commonChars.append(c);
            }
        }
        
        return commonChars.toString();
    }
}
