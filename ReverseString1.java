//String input = "Pwskill java" output = java Pwskill

public class ReverseString1 {
    public static void main (String [] args){
        String str1 = "Pwskill java ";
        String str2 = " ";
        String sarr[] = str1.split(" ");
        
        for (int i = sarr.length-1;i>=0;i--){
            str2 = str2+sarr[i]+" ";
        }
        System.out.println("Before Revesing :"  + str1);
        System.out.println("After Revesing :"  + str2);
    }
}
