/*
Roman numerals:

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.
/*


/*
Idea:
recursively do:
    get the roman number of first symbol
    get the roman number of rest of the string

consider two conditions:
    1. symbols on the left are bigger then those on the right, add up all
    2. symbol on the right is bigger, then perform subtraction

*/

class Solution {
    public int romanToInt(String s) {

        if(s.equals("I")) return 1;
        if(s.equals("V")) return 5;
        if(s.equals("X")) return 10;
        if(s.equals("L")) return 50;

        if(s.equals("C")) return 100;
        if(s.equals("D")) return 500;
        if(s.equals("M")) return 1000;
        
        
        String firstSymbol = s.substring(0,1);    // first char of s
        String rest = s.substring(1,s.length());  // rest of s

        // if first char is bigger or equal to first char of "rest",
        // add up all symbols
        if(romanToInt(firstSymbol) >= romanToInt(rest.substring(0,1))){
            return romanToInt(firstSymbol) + romanToInt(rest) ;

        // if first char of "rest" is bigger than first char,
        // subtract first from "rest"
        // eg. IV = 5-1 = 4
        }else {
            return romanToInt(rest) - romanToInt(firstSymbol) ;
        }
        
        
    }
}
