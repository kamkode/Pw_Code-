//pwskill java //avaj llikswp



public class ReverseString2 {
    public static void main (String [] args){
        String str1 = "pwskill java ";
        String str2 = " ";
        // for(int i = str1.length()-1;i>=0;i--){
        //     str2 = str2+str1.charAt(i);
        String arr[] = str1.split(" ");
     
        for(String elem:arr){
            for(int i = elem.length()-1;i>=0;i--){
                str2 = str2+elem.charAt(i);
            }
            str2 = str2+" ";
        

        }
        
        System.out.println("Before Revesing :"  + str1);
        System.out.println("After Revesing :"  + str2);
    }

}
