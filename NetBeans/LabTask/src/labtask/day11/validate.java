/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask.day11;
 class validate {
    
    public static boolean ValidEmail(String email) {
        
        if (!email.contains("@") || !email.contains(".")) {
            return false;
        }
        
        
        if (email.startsWith(".") || email.startsWith("@") || email.endsWith(".") || email.endsWith("@")) {
            return false;
        }
        
        return true;
    }
    /*public static boolean ValidName(String name){
        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        
        return true;
        
    }
            */
    public static boolean ValidPhone(String pn) {
        if (pn.length() != 10) {
            return false;
        }
        
        for (char c : pn.toCharArray()) {
            int ascii = (int) c;
            if (ascii < 48 || ascii > 57) {
                return false;
            }
        }
       
        return true;
    }
    public static void main(String[] args) {
        String email1 = "dhoteharshal16@gmail.com";
        String email2 = "dhote.harshal";
        String email3="dhote.@";
        
        System.out.println(email1 + " is valid: " + ValidEmail(email1));
        System.out.println(email2 + " is valid: " + ValidEmail(email2));
        System.out.println(email3 + " is valid: " + ValidEmail(email3));
        
        
        
        //String name1 = "John Doe";
        //String name2 = "Jane123";
        
        //System.out.println(name1 + " is valid name: " + ValidName(name1));
        //System.out.println(name2 + " is valid name: " + ValidName(name2));
        
        String phone1 = "1234567a90";
        String phone2 = "9876543214";
        
        System.out.println(phone1 + " is valid phone number: " + ValidPhone(phone1));
        System.out.println(phone2 + " is valid phone number: " + ValidPhone(phone2));
    }
}
