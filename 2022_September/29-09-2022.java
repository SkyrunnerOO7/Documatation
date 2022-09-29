Q1/- https://leetcode.com/problems/subsets/

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int i = 0;
    void fun(int index, ArrayList<Integer> list, int arr[], int n)
    {
        if(index == n)
        {
            ans.add(new ArrayList<>());
            for(Integer x: list)
            {
                ans.get(i).add(x);
            }
            //FOR {} 
             /*
             if(list.size() == 0)
             {
                 ans.get(i).add();
             }
             */
            i++;
            return;
        }
        
        fun(index+1, list, arr, n);
        
        list.add(arr[index]);
        fun(index+1, list, arr, n);
        list.remove(list.size()-1);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();
        fun(0, list, nums, nums.length);
        return ans;
        
    }
}
