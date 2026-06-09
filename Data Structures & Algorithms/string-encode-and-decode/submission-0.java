class Solution {

   public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder(); 
        for (String str : strs) {
            int len = str.length();
            result.append(len).append("#").append(str); 
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> ans=new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
            int dindex=str.indexOf("#",i);
            int len=Integer.parseInt(str.substring(i,dindex));
            String s1=str.substring(dindex+1,dindex+1+len);
            ans.add(s1);
            i=dindex+1+len;
        }
        return ans;

    }
}
