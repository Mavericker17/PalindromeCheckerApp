import java.util.*;

public class UseCase1PalindromeApp {
    public static void main(String[] args) {


        //UC1
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Version : 1.0");
        System.out.println("System Initialized Successfully.\n");


        //UC2
        System.out.println("Input text : madam");
        String input = "madam";
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Is it a Palindrome? : true\n");
        } else {
            System.out.println("Is it a Palindrome? : false\n");
        }


        //UC3

        String input1 = "madam";
        String reversed = "";
        for (int i = input1.length() - 1; i >= 0; i--) {
            reversed += input1.charAt(i);
        }
        if (input1.equals(reversed)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }


        //UC4
        String input2 = "AlulA";
        char[] arr = input2.toCharArray();

        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Character Array Method : " +
                (isPalindrome ? "Palindrome\n" : "Not Palindrome\n"));


        //UC5
        String input3 = "Level";
        Stack<Character> stack = new Stack<>();

        for (char c : input3.toLowerCase().toCharArray()) {
            stack.push(c);
        }

        boolean stackCheck = true;
        for (char c : input3.toLowerCase().toCharArray()) {
            if (c != stack.pop()) {
                stackCheck = false;
                break;
            }
        }

        System.out.println("Stack Method: " +
                (stackCheck ? "Palindrome\n" : "Not Palindrome\n"));


        //UC6
        String input4 = "Racecar";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        for (char c : input4.toLowerCase().toCharArray()) {
            queue.add(c);
            stack2.push(c);
        }

        boolean queueStackCheck = true;
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack2.pop())) {
                queueStackCheck = false;
                break;
            }
        }

        System.out.println("Queue + Stack Method: " +
                (queueStackCheck ? "Palindrome\n" : "Not Palindrome\n"));


        //UC7
        String input5 = "Refer";
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input5.toLowerCase().toCharArray()) {
            deque.add(c);
        }

        boolean dequeCheck = true;
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                dequeCheck = false;
                break;
            }
        }

        System.out.println("Deque Method: " +
                (dequeCheck ? "Palindrome\n" : "Not Palindrome\n"));

        //UC8



    }
}