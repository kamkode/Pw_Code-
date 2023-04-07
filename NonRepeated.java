public class NonRepeated{
    public static void main(String[] args){
        String str = "stress";
        boolean s = false;

        for(int i = 0; i<str.length();i++){

            s= false;

            for(int j = i+1; j<str.length();j++){

                if(str.charAt(i)==str.charAt(j)){
                    s=true;
                    break;
                }
            }
            
            if(!s){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
