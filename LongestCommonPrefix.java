class Solution {
    public String longestCommonPrefix(String[] strs)
    {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int p=0;
        while(p<s1.length())
        {
            if(s1.charAt(p)==s2.charAt(p))
            p++;
            else
            break;
        }
        if(p>0)
        return s1.substring(0,p);
        return "";

    }
}