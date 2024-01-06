public class ReverseWords {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            arr[i] = sb.toString();
        }
        for(int i = 0; i < arr.length - 1; i++) {
            str.append(arr[i]).append(" ");
        }
        str.append(arr[arr.length-1]);
        return str.toString();
    }
}
