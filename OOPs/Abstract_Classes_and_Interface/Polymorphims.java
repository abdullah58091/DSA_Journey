package com.company.OOPs.Abstract_Classes_and_Interface;

interface Camera2 {
    void takeSnap();
    void recordVideo();
}

interface MusicPlayer2 {
    void playMusic();
    void stopMusic();
}

interface GPS2 {
    void getLocation();
}

// 📌 Base Class
class CellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

// 📌 SmartPhone Class implementing multiple interfaces
class SmartPhone extends CellPhone2 implements Camera2, MusicPlayer2, GPS2 {

    // Camera methods
    public void takeSnap() {
        System.out.println("Taking snap 📸");
    }

    public void recordVideo() {
        System.out.println("Recording video 🎥");
    }

    // MusicPlayer methods
    public void playMusic() {
        System.out.println("Playing music 🎵");
    }

    public void stopMusic() {
        System.out.println("Music stopped ⏹️");
    }

    // GPS methods
    public void getLocation() {
        System.out.println("Getting location 📍");
    }

    // SmartPhone specific method
    public void usePhoneFeatures() {
        System.out.println("Using smartphone features...");
    }
}

// 📌 Main Class - Polymorphism in Action
public class Polymorphims {
    public static void main(String[] args) {

        System.out.println("=== Case 1: Object as itself ===");
        SmartPhone myPhone = new SmartPhone();
        myPhone.takeSnap();
        myPhone.playMusic();
        myPhone.getLocation();
        myPhone.usePhoneFeatures();  // ✅ Specific method available

        System.out.println("\n=== Case 2: Polymorphism with Camera ===");
        // 🔥 Important: Using interface reference
        Camera2 cam = new SmartPhone();  // SmartPhone as a Camera
        cam.takeSnap();
        cam.recordVideo();
        //cam.playMusic();  // ❌ Error! Camera reference can't access MusicPlayer methods

        System.out.println("\n=== Case 3: Polymorphism with MusicPlayer ===");
        MusicPlayer2 player = new SmartPhone();  // SmartPhone as a MusicPlayer
        player.playMusic();
        player.stopMusic();
        // player.takeSnap();  // ❌ Error! MusicPlayer reference can't access Camera methods

        System.out.println("\n=== Case 4: Passing interface references to methods ===");
        useCamera(new SmartPhone());
        useGPS(new SmartPhone());
    }

    // 📌 Methods expecting interface types
    static void useCamera(Camera2 camera) {
        camera.takeSnap();
        camera.recordVideo();
        // camera.getLocation();  // ❌ Not accessible
    }

    static void useGPS(GPS2 gps) {
        gps.getLocation();
        // gps.playMusic();  // ❌ Not accessible
    }
}



