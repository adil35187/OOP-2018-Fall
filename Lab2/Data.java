public class Data {
    private double Average;
    private double Maximum;
    private int Div_val;
    public int Re;
    Data(){
        Average = 0;
        Maximum = 0;
        Div_val = 0;
        Re = 0;
    }
    void Add(int value){
        if(Re == 0){
            Maximum = value;
            Re++;
        }
        Average+=value;
        Div_val++;
        if(value > Maximum){
            Maximum = value;
        }
    }
    double get_max(){
        return Maximum;
    }
    double get_average(){
        return (Average/(Div_val*1.0));
    }
}