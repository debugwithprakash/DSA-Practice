class Solution 
{
    public List<Integer> getRow(int rowIndex) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++)
        {
            List<Integer> a = new ArrayList<>();
            for(int j = 0; j <= i; j++)
            {
                if(j==0 || j==i) a.add(1);
                else
                {
                    a.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(a);
        }
        return ans.get(rowIndex);
    }
}