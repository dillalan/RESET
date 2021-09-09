package com.reset;

public class Mario extends Character{

    private boolean mounted;

    public Mario(){
        setName("Mario");
        setHeight(1.5);
        setHatColor("red");
        setShirtColor("red");
        setJumpsuitColor("blue");
        setGlovesColor("white");
        setShoeColor("brown");
        setCapeColor("orange");
    }

    public boolean isMounted() {
        return mounted;
    }

    public void setMounted(boolean mounted) {
        this.mounted = mounted;
    }

    public void ride(){
        if (this.isHasYoshi()){
            System.out.println("Mario is riding Yoshi");
            setMounted(true);
        }
    }

    public void checkYoshi(){
        Yoshi yoshi = new Yoshi();
        if (isMounted()){
            System.out.println(yoshi);
        }
    }

}
