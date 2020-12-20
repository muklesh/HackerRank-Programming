

    static boolean isAnagram(String a, String b) {
       String s=a.toUpperCase();
       String s1=b.toUpperCase();
        char ar[]=s.toCharArray();
        char br[]=s1.toCharArray();
       java.util.Arrays.sort(ar);
       java.util.Arrays.sort(br);
        boolean res=java.util.Arrays.equals(ar,br);
        return res;
    }

