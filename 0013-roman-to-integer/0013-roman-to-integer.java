class Solution {
    public int romanToInt(String s) {
        int ans = 0, num =0, prev = 0;
        for(int j = s.length()-1;j >= 0; j--){
            switch(s.charAt(j)){
                case 'M' -> num = 1000;
                case 'D' -> num = 500;
                case 'C' -> num = 100;
                case 'L' -> num = 50;
                case 'X' -> num = 10;
                case 'V' -> num = 5;
                case 'I' -> num = 1;
            }
            if(num < prev){
                ans -= num;
            }
            else {
                ans +=num;
            }
            prev = num;
            }
            return ans;
        }
        
    }
