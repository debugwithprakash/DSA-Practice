class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        int n = digits.length;
        int carry = 1;
        for (int i = n-1; i >= 0; i--)
        {
            int sum = digits[i]+carry;
            if(sum <= 9)
            {
                list.add(sum);
                carry = 0;
            }
            else list.add(0);
        }
        if(carry == 1) list.add(1);
        Collections.reverse(list);

        int listSize = list.size();
        int[] ans = new int[listSize];
        for (int i = 0; i < listSize; i++)
        {
            ans[i] = list.get(i);
        }
        return ans;
    }
}