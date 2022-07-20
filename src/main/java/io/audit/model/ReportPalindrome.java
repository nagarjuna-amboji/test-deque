package io.audit.model;

public class ReportPalindrome extends Report {

    public ReportPalindrome(String message) {
        super.message = message;
    }

    @Override
    public Boolean isViolation() {
        return isPalindrome();
    }

    private  Boolean isPalindrome() {
        boolean isPalindrome = false;

        String tempMsg = this.message.toLowerCase().replaceAll("\\s","");;

        char[] chars = tempMsg.toCharArray();
        int len = chars.length;

        for (int i = 0; i < len; i++) {
           isPalindrome = chars[i] == chars[len - (i + 1)];

           if(!isPalindrome) {
               break;
           }
        }

        return isPalindrome;
    }
}
