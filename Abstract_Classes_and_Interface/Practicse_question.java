/*
package com.company.Abstract_Classes_and_Interface;
abstract class pen{
     abstract void write();
     abstract  void refill();
}

class gelpen extends pen{
     void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changenib(){
        System.out.println("change the nib");
    }
}


public class Practicse_question {
    public static void main(String[] args) {

        // problem 1

        gelpen Pen = new gelpen();
        Pen.write();
        Pen.refill();
        Pen.changenib();

        Pen.write();
        Pen.refill();
    }
}

 */

/*
// problem 03

package com.company.Abstract_Classes_and_Interface;

class Monkey {
      void jump(){
        System.out.println("enjoying.......");
    }
     void bite (){
        System.out.println("bitting .......");
    }
}
interface  BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
     void speak(){
         System.out.println("hello sir.....");
     }

     public  void eat(){
         System.out.println(" Eating banana....");
     }
     public void sleep(){
         System.out.println(" sleep  good night .....");
     }

}


public class Practicse_question {
    public static void main(String[] args) {
        Monkey bander = new Monkey();
        Human life = new Human();
        //   childe  are  allowed to parents class   method
        bander.jump();
        life.jump();
        bander.bite();
        life.bite();
        life.sleep();
        life.speak();
        life.eat();
       // bander.sleep(); -- not allowed due to parent class are not allowed child class
       // bander. spek ();
    }
    }

 */

// problem 04
 /*
package com.company.Abstract_Classes_and_Interface;


abstract  class Telephone {
      void ring(){
         System.out.println("tununu ,tunun ,tunu ");
     }
     void disconnect(){
        System.out.println("recharge katam ");
    }


     void lift(){
        System.out.println(" helo.........helo.....");
    }
}

class Smartphone extends Telephone {
      public void ring(){
         System.out.println(" la,la,la,al,al,ala,la,la,la");
     }
      public void lift (){
         System.out.println("pickup the telephone");
     }
       public void disconnect(){
          super.disconnect();
         System.out.println("los signal");
     }
     public  void cameraon(){
         System.out.println("pic the my foto ");
     }
}


public class Practicse_question {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.ring();
        phone.cameraon();


        Telephone abdullah = new Smartphone();  // 131 When we call a child class object using a parent class reference, that is called polymorphism.
        abdullah.ring();
        abdullah.lift();
        abdullah.disconnect();
        //abdullah.cameraon();-- error due to same condition

    }

    }

  */



// problem 05
 /*
package com.company.Abstract_Classes_and_Interface;

class Monkey {
    void jump(){
        System.out.println("enjoying.......");
    }
    void bite (){
        System.out.println("bitting .......");
    }
}
interface  BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("hello sir.....");
    }

    public  void eat(){
        System.out.println(" Eating banana....");
    }
    public void sleep(){
        System.out.println(" sleep  good night .....");
    }

}


public class Practicse_question {
    public static void main(String[] args) {
        Monkey bander = new Human();
        bander.jump();
        bander.bite();
       // bander.speak(); can not speak  the referance  is monkey which does not have speak method
          BasicAnimal  lavish = new Human();
          lavish.eat();
          lavish.sleep();
          //lavish.speak(); error
    }


}
  */
/*

  //  problem 06
package com.company.Abstract_Classes_and_Interface;

interface TVRemote {
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    void channelUp();
    void channelDown();
}

interface SmartTVRemote extends TVRemote {
    void openApp(String appName);
    void voiceCommand(String command);
    void streamContent(String content);
    // Optional: void browseInternet(); // अगर यह चाहिए तो
}

// Basic TV implementation
class BasicTV implements TVRemote {
    // ... (same as your code)
}

// Smart TV implementation
class SmartTV implements SmartTVRemote {
    private boolean isOn = false;
    private int volume = 10;
    private int channel = 1;

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Smart TV is ON");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("Smart TV is OFF");
    }

    @Override
    public void volumeUp() {
        if (isOn) {
            volume++;
            System.out.println("Volume: " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (isOn) {
            volume--;
            System.out.println("Volume: " + volume);
        }
    }

    @Override
    public void channelUp() {
        if (isOn) {
            channel++;
            System.out.println("Channel: " + channel);
        }
    }

    @Override
    public void channelDown() {
        if (isOn) {
            channel--;
            System.out.println("Channel: " + channel);
        }
    }

    @Override
    public void openApp(String appName) {
        if (isOn) {
            System.out.println("Opening app: " + appName);
        }
    }

    @Override
    public void voiceCommand(String command) {
        if (isOn) {
            System.out.println("Voice command received: " + command);
        }
    }

    @Override
    public void streamContent(String content) {
        if (isOn) {
            System.out.println("Streaming: " + content);
        }
    }

    // Extra method - बिना @Override के
    public void browseInternet() {
        if (isOn) {
            System.out.println("Browsing the internet...");
        }
    }
}

public class Practicse_question {
    public static void main(String[] args) {
        // Using basic TV remote
        TVRemote basicRemote = new BasicTV();
        basicRemote.powerOn();
        basicRemote.volumeUp();
        basicRemote.channelUp();
        basicRemote.powerOff();

        System.out.println("\n--- Smart TV Demo ---");

        // Using Smart TV remote
        SmartTVRemote smartRemote = new SmartTV();
        smartRemote.powerOn();
        smartRemote.volumeUp();
        smartRemote.openApp("Netflix");
        smartRemote.streamContent("Movie");
        smartRemote.voiceCommand("Play next episode");
        smartRemote.powerOff();

        // अगर SmartTV type का object बनाएं तो browseInternet() use कर सकते हैं
        SmartTV smartTV = new SmartTV();
        smartTV.powerOn();
        smartTV.browseInternet();  // यह अब काम करेगा
        smartTV.powerOff();
    }
}

 */

