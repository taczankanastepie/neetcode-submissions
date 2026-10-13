class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();

        Character ch;
        for(int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            switch(ch) {
                case ']' -> {
                    if(stack.size() == 0 || !stack.removeLast().equals('[')) {
                        return false;
                    }
                }
                case '}' -> {
                    if(stack.size() == 0 || !stack.removeLast().equals('{')) {
                        return false;
                    }
                }
                case ')' -> {
                    if(stack.size() == 0 || !stack.removeLast().equals('(')) {
                        return false;
                    }
                }
                default -> {
                    stack.add(ch);
                }
            }
        }

        return stack.size() == 0 ? true : false;
    }
}
