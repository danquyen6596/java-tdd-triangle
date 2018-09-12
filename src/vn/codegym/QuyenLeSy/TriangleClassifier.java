package vn.codegym.QuyenLeSy;

public class TriangleClassifier {
    public static String triangleTest(int a, int b, int c){
        if(((a+b)>c) && ((b+c)>a) && ((a+c)>b)){
            if((a==b) && (b==c)){
                return "3 cạnh vừa nhập là tam giác đều";
            }
            if(((a==b) && b != c) || ((c==b) && b != a) || ((a==c) && c != b)){
                return "3 cạnh vừa nhập là tam giác cân";
            }

            return "3 cạnh vừa nhập là tam giác";
        }
        else {
            return "3 cạnh vừa nhập không phải tam giác";
        }
    }

}
