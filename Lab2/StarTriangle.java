import java.util.Scanner;

public class StarTriangle {
    int Width;
    String s = "";

    public StarTriangle(int width) {
        this.Width = width;
    }

    public String toString() {
        String s = "";
        int cnt = 0;
        for (int i = 0; i < Width; ++i) {
            s = "";
            cnt++;
            for (int j = 0; j < cnt; ++j) {
                s += "[*]";
            }
        }
        return s + "";
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int w=input.nextInt();
        StarTriangle small = new StarTriangle(w);


        for(int i=0;i<=small.Width;++i){
            StarTriangle sm = new StarTriangle(i);
            System.out.println(sm.toString());
        }
    }
}