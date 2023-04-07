class calc {
    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public int add2(int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        return result;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        calc obj = new calc();
        int result = obj.add(4, 3);
        int res1 = obj.add2(4, 3, 4);
        System.out.println(result);
        System.out.println(res1);
    }
}
