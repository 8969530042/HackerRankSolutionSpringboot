package com.aa;

import java.util.*;
import java.util.stream.Collectors;

public class HackerRankSolution {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("code", "cedo", "Anagrams", "doce");

        funWithAnagrams(arr);

    }


    public static String securingMessage(String encryptMsg){
        StringBuffer sbDecryptStr = new StringBuffer();
        sbDecryptStr.append(encryptMsg).reverse();
        System.out.println(sbDecryptStr.toString().toLowerCase());
        return sbDecryptStr.toString().toLowerCase();
    }

    public static int[] arrayChallenge(int[] arr){
        int n = arr.length;
        int[] ans= new int[n];
        int sum = arr[0];
        ans[0]=0;
        for(int i=1; i<n;i++){
            ans[i]=arr[i]*i-sum;
            sum+=arr[i];
        }
        Arrays.stream(ans).forEach(e -> System.out.println(e));
        return ans;
    }

    public static StringBuffer simpleCipher(String text, int s){
        StringBuffer result= new StringBuffer();
        for (int i=0; i<text.length(); i++){
            if (Character.isUpperCase(text.charAt(i))){
                // for right shift
                //char ch = (char)(((int)text.charAt(i) + s - 65)%26 + 65);
                // for left shift
                char ch = (char)(((int)text.charAt(i) - s - 90) % 26 + 90);
                result.append(ch);
            } else{
                // for right shift
                //char ch = (char)(((int)text.charAt(i) - s - 97) % 26 + 97);
                // for left shift
                char ch = (char)(((int)text.charAt(i) - s - 122) % 26 + 122);
                result.append(ch);
            }
        }

        System.out.println("Cipher: " + result);
        return result;
    }

    public static int countDuplicateElements(int nums[]) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> duplicate = new ArrayList<>();

        for(int i =0; i < nums.length; i++){
            int num = nums[i];
            if(duplicate.contains(num)){
                if(!answer.contains(num))
                    answer.add(num);
            }else{
                duplicate.add(num);
            }
        }
        System.out.println(answer.size());
        return answer.size();
    }

    public static List<String>  funWithAnagrams(List<String> arr)
    {
        List<String> answer = new ArrayList<>();
        List<String> found = new ArrayList<>();

        //for (int i = 0; i < arr.size(); i++) {
        for(String word: arr){
            char tempArray[] = word.toCharArray();
            Arrays.sort(tempArray);
            String tempword = String.valueOf(tempArray);

            if (!found.contains(tempword)) {
                answer.add(word);
                found.add(tempword);
            }
        }
        Collections.sort(answer, String.CASE_INSENSITIVE_ORDER);

        for(String s: answer){
            System.out.println(s);
        }
        return answer;
    }
    public static int howManyWords(String str){
        str = str.replace("?", " ")
                .replace("!", " ")
                .replace(",", "  ")
                .replace("."," ")
                .replace(";"," ");
        //
        String[] words = str.split("\\s+");
        boolean flag = false;
        int wordCount = 0;
        for(String word: words){
            char[] chr = word.toCharArray();
            for(int i =0; i< chr.length; i++){
                if((chr[i] >= 'a' && chr[i] <='z') || (chr[i] >= 'A' && chr[i] <='Z') || chr[i]=='-'){
                    flag = true;
                }else{
                    flag = false;
                }
            }
            if(flag){
                wordCount++;
            }
        }
        System.out.println(wordCount);
        return wordCount;
    }

    public static void priorityQueue(){
        PriorityQueue todo = new PriorityQueue();
        todo.add("dishes");
        todo.add("lau");
        todo.add("bills");
        todo.offer("bills");
        System.out.println(todo.size() + " " +todo.poll() );
        System.out.println(todo.peek() + " " +todo.poll() );
        System.out.println(todo.poll() + " " +todo.poll() );

    }
}

