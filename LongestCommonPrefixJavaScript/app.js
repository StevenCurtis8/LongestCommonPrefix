const btn=document.getElementById('btn');

function longestCommonPrefix(strs) {
        
    if(strs.length==0){
        return ""
    }

    const minLen = Math.min.apply(Math, strs.map(function(str) { return str.length; }))

    let ans=""
    let i=0
    let j=0
    let done=false

    while(i<minLen && done==false){
        while(j<strs.length-1 && done==false){
            done=true
            j=j+1
            if(strs[0].charAt(i)==strs[j].charAt(i)){
                done=false
            }
        }    

        if(done==false){
            ans=ans+strs[j].charAt(i)
        }
        i=i+1
        j=0
    }

    return ans
};

btn.addEventListener('click',function(){ 
    const allTestInput = [
        ["flower","flow","flight"],
        ["dog","racecar","car"],
        ["geeksforgeeks", "geeks", "geek", "geezer"],
        ["apple", "ape", "april"],
        ["interspecies", "interstellar", "interstate"],
        ["technique", "technician", "technology", "technical"],
        ["techie delight", "tech", "techi", "technology"]
        ]


    const correctOutput = ["fl","","gee","ap","inters","techn","tech"]
    
    let text="<br/>"
    for(let i=0; i<7;i++){
        const testInput= allTestInput[i]

        let result = longestCommonPrefix(testInput)
        console.log(result)
        if(result == correctOutput[i]){
            text=text+("<h4>"+testInput+" ,-- Result: "+result+"&emsp; &emsp; Correct result:"+correctOutput[i]+"&emsp;&emsp; therefore "+true+"</h4> <br/>")
        }
        else{
            text=text+("<h4>"+testInput+",--  Result: "+result+"&emsp;&emsp; Correct result:"+correctOutput[i]+"&emsp;&emsp; therefore "+false+"</h4> <br/>")
        }


    }
    const area=document.getElementById("root")
    area.innerHTML = text
});
