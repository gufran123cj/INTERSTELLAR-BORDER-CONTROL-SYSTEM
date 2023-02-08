public class Piront extends Alien {
    public Piront(String name, int height, int reputation ,int intelligence, int strength, int weight, City hometown, 
    int age, String criminalRecord, boolean accepted, String bodyTemperature, String[] knownLanguages, String suitableAtmosphere, Ship ship, String gender,String[] documents,
    int money,String moneyCurreny) {
        super(name, height, reputation, intelligence, strength, weight, hometown, age, criminalRecord, accepted, bodyTemperature, knownLanguages, suitableAtmosphere, 
        ship, gender,documents,money,moneyCurreny);
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
        "=> Money: " + getMoney() + "\n";
    }

}
