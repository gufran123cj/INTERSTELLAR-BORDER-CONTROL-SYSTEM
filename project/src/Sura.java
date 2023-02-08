public class Sura extends Alien {
    //Sura's are very strong, intelligent, some has bad temper, some sura's deal with dark magic, some sura's does mercenary work
    private boolean hasBadTemper;
    private String magicType;
    public Sura(String name, int height, int intelligence, int strength, int weight, City hometown, int age,int reputation, String criminalRecord, boolean accepted, 
    String bodyTemperature, String[] knownLanguages, String suitableAtmosphere, Ship ship, String gender, String magicType,boolean hasBadTemper,
    String[] documents, int money,String moneyCurrency) {
        super(name, height, reputation, intelligence, strength, weight, hometown, age, criminalRecord, accepted, bodyTemperature, knownLanguages, suitableAtmosphere, ship, 
        gender,documents,money,moneyCurrency);
        this.magicType = magicType; 
        this.hasBadTemper = hasBadTemper;
        
    }

    public boolean hasBadTemper() {
        return this.hasBadTemper;
    }

    public void setHasBadTemper(boolean hasBadTemper) {
        this.hasBadTemper = hasBadTemper;
    }

    public String getMagicType() {
        return this.magicType;
    }

    public void setMagicType(String magicType) {
        this.magicType = magicType;
    }
    public String arrayToString(String[] array){
        String mainString = "";
        for (String string : array) {
            if(string != null)mainString += string + " ";
        }
        return mainString;
    }
    @Override
    public String toString() {
        return 
        "=> Name: " + getName() + "\n" +
        "=> Race: " + this.getClass().getCanonicalName() + "\n" +
            "=> Height: " + getHeight() + "\n" +
            "=> Intelligence: " + getIntelligence() + "\n" +
            "=> Strength: " + getStrength() + "\n" +
            "=> Weight: " + getWeight() + "\n" +
            "=> Hometown: " + getHometown().getName() + "\n" +
            "=> Age: " + getAge() + "\n" +
            "=> Criminal Record: " + getCriminalRecord() + "\n" +
            "=> Body Temperature: " + getBodyTemperature() + "\n" +
            "=> Known Languages: " + arrayToString(getKnownLanguages()) + "\n" +
            "=> Documents: " + arrayToString(getDocuments()) + "\n" +
            "=> Suitable Atmosphere: " + getSuitableAtmosphere() + "\n" +
            "=> Ship: " + getShip().toString() + "\n" +
            "=> Gender: " + getGender() + "\n" +
            "=> Has Bad Temper: " + hasBadTemper() + "\n" +
            "=> Magic Type: " + getMagicType() + "\n" + 
            "=> Money: " + getMoney() + "\n";
    }

}
