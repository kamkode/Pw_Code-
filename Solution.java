class Solution {
    public List<String> letterCombinations(String digits) {
        // list of all possible letter combinations with empty 
        List<String> result = new ArrayList<>();

        if(digits == null || digits.length()==0){ 
            return result;
        }
        String[] mapping  ={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(result,mapping,digits,0,new StringBuilder());
        return result;
    }
    
    private void backtrack(List<String> result, String[] mapping, String digits, int index ,StringBuilder combination){
        if (index == digits.length()){
            result.add(combination.toString());
            return;
        }
        int digit = Character.getNumericValue(digits.charAt(index));
        String letters = mapping[digit];
        for (int i = 0;i<letters.length();i++){
            combination.append(letters.charAt(i));
            backtrack(result,mapping,digits,index + 1,combination);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
