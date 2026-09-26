class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        backtrack(nums,new ArrayList<Integer>(),new HashSet<Integer>());
        return res;
    }

        public void backtrack(int[] nums, List<Integer> curr, Set<Integer> added)
        {
            if(curr.size() == nums.length){
                res.add(new ArrayList<>(curr));
                return;

            }
        

        for(int i=0;i<nums.length;i++){
            if(!added.contains(i)){
                curr.add(nums[i]);
                added.add(i);
                backtrack(nums,curr,added);
                curr.remove(curr.size()-1);
                added.remove(i);
            }
        }

        }   
    }
