import java.util.*;
class RemoveFragment {
    static ArrayList<String> getWords(String s) {
        ArrayList<String> list = new ArrayList<>();
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (!word.equals("")) {
                    list.add(word);
                    word = "";
                }
            } else {
                word += ch;
            }
        }
        if (!word.equals("")) {
            list.add(word);
        }
        return list;
    }
    static void printAfterRemove(ArrayList<String> list, String fragment) {
        ArrayList<String> frag = getWords(fragment);
        for (int i = 0; i < list.size();) {
            if (i <= list.size() - 3 &&
                list.get(i).equals(frag.get(0)) &&
                list.get(i + 1).equals(frag.get(1)) &&
                list.get(i + 2).equals(frag.get(2))) {
                i += 3;
            } else {
                System.out.print(list.get(i) + " ");
                i++;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        ArrayList<String> a = getWords(s1);
        ArrayList<String> b = getWords(s2);
        ArrayList<String> c = getWords(s3);
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        for (int i = 0; i <= a.size() - 3; i++) {
            set1.add(a.get(i) + " " + a.get(i + 1) + " " + a.get(i + 2));
        }
        for (int i = 0; i <= b.size() - 3; i++) {
            String f = b.get(i) + " " + b.get(i + 1) + " " + b.get(i + 2);
            if (set1.contains(f)) {
                set2.add(f);
            }
        }
        String common = "";
        for (int i = 0; i <= c.size() - 3; i++) {
            String f = c.get(i) + " " + c.get(i + 1) + " " + c.get(i + 2);
            if (set2.contains(f)) {
                common = f;
                break;
            }
        }
        printAfterRemove(a, common);
        printAfterRemove(b, common);
        printAfterRemove(c, common);
        System.out.println("Common Fragment: "+common);
    }
}
