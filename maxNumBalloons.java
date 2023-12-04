public class maxNumBalloons {
    public int maxNumberOfBalloons(String text) {
        int b = 0; int a = 0; int l = 0; int o = 0; int n = 0;
        for(char c: text.toCharArray()){
            if((int)c == (int)'b') b++;
            if((int)c == (int)'a') a++;
            if((int)c == (int)'l') l++;
            if((int)c == (int)'o') o++;
            if((int)c == (int)'n') n++;
        }
        return Math.min(b,Math.min(a, Math.min(l/2, Math.min(o/2, n))));
    }
}
