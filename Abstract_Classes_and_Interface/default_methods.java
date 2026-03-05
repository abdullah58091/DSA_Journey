package com.company.Abstract_Classes_and_Interface;


interface camera {
    void takesnap();
    void recordvoice();
}
interface  mywifi{
    String [] getnetwork();
    void  connectnetwork( String getnetwork);
}
class  samsung {
    void callnumber(int phonenunmber) {
        System.out.println("pick call " + phonenunmber);
    }

    void pickcall() {
        System.out.println("connecting");
    }
//    void takesnap()
//    {
//        System.out.println("takingsnap");
//    }
}
class iphone extends  samsung implements  mywifi ,camera{

         public void takesnap(){
             System.out.println("taking snap ");
         }

    @Override
    public void recordvoice() {
        System.out.println("recording voice ");
    }

    @Override
            public String[] getnetwork() {
                System.out.println("getting list of network");
                String [] networklist = { "abdullah ", "london" , " new yory"};
                return networklist;
            }

            @Override
            public void connectnetwork(String network) {
                System.out.println("connecting to " + network);
            }
        }

public class default_methods {
    public static void main(String[] args) {
        iphone s =new iphone();
        String [] ar = s.getnetwork();
        for(String item : ar) {
            System.out.println(item);

        }
    }
}

