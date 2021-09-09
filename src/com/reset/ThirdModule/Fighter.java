package com.reset.ThirdModule;

public class Fighter {
    private String name;
    private String nationality;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int wins;
    private int losses;
    private int draws;

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        setCategory();
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public Fighter(String name, String nationality, int age, double height, double weight, int wins, int losses, int draws) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        setCategory();
    }

    private void setCategory() {
        if (this.weight>=94){
            this.category = "Heavyweight";
        } else if (weight >= 85 && weight<=93){
            this.category = "Light Heavyweight";
        } else if (this.weight>=78 && this.weight<=84){
            this.category = "Middleweight";
        } else if (this.weight>=71 && this.weight<=77){
            this.category = "Welterweight";
        } else if (this.weight>=67 && this.weight<=70){
            this.category = "Lightweight";
        }
    }

    public void presentFighter(){
        System.out.println("-_-_- F I G T H E R  C A R D -_-_-");
        System.out.println("\tName:        \t"+getName());
        System.out.println("\tNationality: \t"+getNationality());
        System.out.println("\tAge:         \t"+getAge());
        System.out.println("\tHeight:      \t"+getHeight());
        System.out.println("\tWeight:      \t"+getWeight());
        status();
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
    }

    public void status(){
        System.out.println("\tCategory:    \t"+getCategory());
        System.out.println("\tWins:        \t"+getWins());
        System.out.println("\tLosses:      \t"+ getLosses());
        System.out.println("\tDraws:       \t"+getDraws());
    }

    public void winMatch(){
        setWins(getWins()+1);
    }

    public void loseMatch(){
        setLosses(getLosses()+1);
    }

    public void drawMatch(){
        setDraws(getDraws()+1);
    }
}
