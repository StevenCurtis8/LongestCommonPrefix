package longestcommonprefixjava;

public class LongestCommonPrefixJava {

    public static int smallest(String strs[]) {
        String smallest = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < smallest.length()) {
                smallest = strs[i];
            }
        }
        return smallest.length();
    }
    public static String longestCommonPrefix(String[] strs) {
        
        if(strs.length==0){
            return "";
        }
        
        int minLen = smallest(strs);
        String ans="";
        int i=0;
        int j=0;
        boolean done=false;
        
        while(i<minLen && done==false){ //i loops through characters
            while(j<strs.length-1 && done==false){ //j loops through words
                done=true;
                j=j+1;
                if(strs[0].charAt(i)==strs[j].charAt(i)){
                    done=false;
                }
            }    
                
            if(done==false){
                ans=ans+strs[j].charAt(i);
            }
            i=i+1;
            j=0;
        }
            
        return ans;
    }

    public static void main(String[] args) {
        String[][] allTestInput = {
                            {"flower","flow","flight"},
                            {"dog","racecar","car"},
                            {"geeksforgeeks", "geeks", "geek", "geezer"},
                            {"apple", "ape", "april"},
                            {"interspecies", "interstellar", "interstate"},
                            {"technique", "technician", "technology", "technical"},
                            {"techie delight", "tech", "techi", "technology"},
                             };
        String[] correctOutput = {"fl","","gee","ap","inters","techn","tech"};

        String output="";
        
        for(int i=0; i<7;i++){
            String [] testInput= allTestInput[i];

            String result = longestCommonPrefix(testInput);

            for(int j=0;j<testInput.length;j++){
                output=output+testInput[j]+", ";
            }
            if(result.equals(correctOutput[i])){
                    System.out.println(output+"-- Result: "+result+"\t\t Correct result:"+correctOutput[i]+"\t\t therefore "+true+"\n");
                }
                else{
                    System.out.println(output+"-- Result: "+result+"\t\t Correct result:"+correctOutput[i]+"\t\t therefore "+false+"\n");
                }
            output="";
        }
    }
    
}
