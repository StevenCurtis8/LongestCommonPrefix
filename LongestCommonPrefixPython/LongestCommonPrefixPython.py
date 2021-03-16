def longestCommonPrefix(strs):
    if(strs==[]):
        return ""
    minLen=len(min(strs, key=len))
    
    ans=""
    i=0
    j=0
    done=False
    while(i<minLen and done==False):
        while j<len(strs)-1 and done==False:
            done=True
            j=j+1
            if(strs[0][i]==strs[j][i]):
                done=False
            
            
        if done==False:
            ans=ans+strs[j][i]
        i=i+1
        j=0
        
    return ans

    
allTestInput = [
                ["flower","flow","flight"],
                ["dog","racecar","car"],
                ["geeksforgeeks", "geeks", "geek", "geezer"],
                ["apple", "ape", "april"],
                ["interspecies", "interstellar", "interstate"],
                ["technique", "technician", "technology", "technical"],
                ["techie delight", "tech", "techi", "technology"]
                ]


correctOutput = ["fl","","gee","ap","inters","techn","tech"]

for i in range(len(allTestInput)):
    testInput= allTestInput[i]
    
    result = longestCommonPrefix(testInput)
    
    if(result == correctOutput[i]):
        print(testInput,", Result: ",result,"\t\t Correct result:",correctOutput[i],"\t\t therefore ",True,"\n")

    else:
        print(testInput,", Result: ",result,"\t\t Correct result:"+correctOutput[i],"\t\t therefore ",False,"\n")
  