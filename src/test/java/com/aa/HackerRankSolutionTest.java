package com.aa;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.aa.HackerRankSolution.*;

public class HackerRankSolutionTest {

    @Test
    public void howManyWords1(){
        String str = "I         ;i;i;i   I;";
        howManyWords(str);
    }

    @Test
    public void howManyWords2(){
        String str = "Hi my name is Amit, and! here go. to count 109;";
        howManyWords(str);
    }

    @Test
    public void howManyWords3(){
        String str = "asda,! 333 ; asdasd;;;;; 4444, ttt";
        howManyWords(str);
    }

    @Test
    public void funWithAnagrams1(){
        List<String> arr = Arrays.asList("geeks", "keegs", "code", "doce");
        funWithAnagrams(arr);
    }

    @Test
    public void funWithAnagrams2(){
        List<String> arr = Arrays.asList("code", "doce", "ecod", "framer", "frame");
        funWithAnagrams(arr);
    }

    @Test
    public void funWithAnagrams3(){
        List<String> arr = Arrays.asList("code", "aaagmnrs", "anagrams", "doce");
        funWithAnagrams(arr);
    }

    @Test
    public void funWithAnagrams4(){
        List<String> arr = Arrays.asList("poke", "pkoe", "okpe", "ekop");
        funWithAnagrams(arr);
    }

    @Test
    public void countDuplicateElements1(){
        int nums[] = {1,1,2,2,2,3,3,3,3,3,3,4};
        countDuplicateElements(nums);
    }

    @Test
    public void countDuplicateElements2(){
        int nums[] = {2,3,4,5,4,5,7,2};
        countDuplicateElements(nums);
    }

    @Test
    public void simpleCipher1(){
        String text = "VtaOg";
        int s = 2;
        simpleCipher(text,s);
    }

    @Test
    public void simpleCipher2(){
        String text = "CDEF";
        int s = 2;
        simpleCipher(text,s);
    }

    @Test
    public void simpleCipher3(){
        String text = "DGEO";
        int s = 3;
        simpleCipher(text,s);
    }

    @Test
    public void simpleCipher4(){
        String text = "AASDCASDokasdoakADSaoksdasdokasdmaksdaskdaksdasdaseSADASOKKKPLWJUAIUFNUICasfnAIONFacnsaj";
        int s = 4;
        simpleCipher(text,s);
    }

    @Test
    public void arrayChallenge1(){
        int nums[] = {2,1,3};
        arrayChallenge(nums);
    }

    @Test
    public void arrayChallenge2(){
        int nums[] = {1,2,2,3};
        arrayChallenge(nums);
    }

    @Test
    public void arrayChallenge3(){
        int nums[] = {111,222,234,773,123,67,876,1,3,5,8,3,1,5,7,9,54,2,2,6,89,7};
        arrayChallenge(nums);
    }
}
