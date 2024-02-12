/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public class Weekdays 
{
    ONE("Monday"),
    WO("Tuesday"),
    HREE("Wednesday"),
    FOUR("Thursday"),
    FIVE("Friday"),
    SIX("Saturday"),
    SEVEN("Sunday");
    
    private final String dayName;
    
    private Weekdays(String dayName) {
        this.dayName = dayName;
    }
    
    public String getName() {
        return name;
    }
  
}
}


