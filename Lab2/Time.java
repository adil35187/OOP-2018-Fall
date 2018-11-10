public class Time {
    int hour;
    int minute;
    int second;
    Time(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        boolean check = false;
        if(minute>=0 && minute<60 && hour>=0 && hour<24 && second>=0 && second<60){
            check = true;
        }
        else{
            System.out.println("Not correct format, try again");
            System.exit(0);
        }
    }
    String toUniversal(){
        String s = "";
        if(hour < 10){
            s+="0"+Integer.toString(hour)+ ":" ;
        }
        else{
            s+=Integer.toString(hour)+ ":" ;
        }
        if(minute<10){
            s+="0"+Integer.toString(minute)+ ":" ;
        }
        else{
            s+=Integer.toString(minute)+ ":" ;
        }
        if(second<10){
            s+="0"+Integer.toString(second);
        }
        else{
            s+=Integer.toString(second) ;
        }
        return s;
    }
    String toStandard()
    {
        String s="";
        if(hour>=12 && minute>0 && hour<=23)
        {

            s+=Integer.toString(hour-12)+":";
            if(minute<10)
            {
                s+="0"+Integer.toString(minute)+":";
            }
            else
            {
                s+=Integer.toString(minute)+":";
            }
            if(second<10)
            {
                s+="0"+Integer.toString(second)+" PM";
            }
            else
            {
                s+=Integer.toString(second)+" PM";
            }
        }
        else
        {
            if(hour==24)
            {
                s+="00:";
            }
            else
            {
                s+=Integer.toString(hour)+":";
            }


            if(minute<10)
            {
                s+="0"+Integer.toString(minute)+":";
            }
            else
            {
                s+=Integer.toString(minute)+":";
            }
            if(second<10)
            {
                s+="0"+Integer.toString(second)+" AM";
            }
            else
            {
                s+=Integer.toString(second)+" AM";
            }

        }
        return s;


    }
    String add(Time x)
    {
        int total=(x.hour*3600+x.minute*60+x.second)+(hour*3600+minute*60+second);
        String s="";
        if((total/3600)%24<10)
        {

            s+="0"+Integer.toString((total/(3600))%24)+":";
        }
        else
        {
            s+=Integer.toString(total/(3600)%24)+":";
        }

        if((total%3600)/60<10)
        {
            s+="0"+Integer.toString((total%(3600))/60)+":";
        }
        else
        {
            s+=Integer.toString((total%(3600))/60)+":";
        }

        if((total%3600)%60<10)
        {
            s+="0"+Integer.toString((total%(3600))%60);
        }
        else
        {
            s+=Integer.toString((total%(3600))%60);
        }

        return s;
    }

    public static void main(String[] args) {

        Time t=new Time(1,36,6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2=new Time(4,24,33);
        System.out.println(t.add(t2));
    }
}