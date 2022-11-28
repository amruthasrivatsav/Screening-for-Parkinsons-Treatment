public class DifferenceConstant {
    static int maxHBD =3;
    static int maxHBA=7;
    static double maxMW = 600.0;
    static double minlogP = 2.0;
    static double maxlogP = 5.0;
    static double maxpKa = 10.5;
    static double minpKa = 4.0;
    double difference_constant=0.0;
  public static double getConstant(Molecule inputMol) 
    
    {
        double difference_constant=0.0; 
            if(compareHBD(inputMol))
    {
    difference_constant = difference_constant + ((inputMol.getHBD() - maxHBD)/maxHBD);
    } 
    if(compareHBA(inputMol)) 
    {
    difference_constant = difference_constant + ((inputMol.getHBA() - maxHBA)/maxHBA);
    } 
    if(compareMW(inputMol)) 
    {
    difference_constant = difference_constant + ((inputMol.getMW() - maxMW)/maxMW);
    } 
    if(comparelogP(inputMol)) {
    if(inputMol.getlogP() > maxlogP) {
    difference_constant = difference_constant + ((inputMol.getlogP() - maxlogP)/maxlogP);
    }
    if(inputMol.getlogP() < minlogP) {
    difference_constant = difference_constant + (( minlogP- inputMol.getlogP())/minlogP);
    } 
    }
    if(comparepKa(inputMol)) {
    if(inputMol.getpKa() > maxpKa) {
    difference_constant = difference_constant + ((inputMol.getpKa() - maxpKa)/maxpKa); }
    if(inputMol.getpKa() < minpKa) {
    difference_constant = difference_constant + (( minpKa- inputMol.getpKa())/minpKa); }
    }
return difference_constant; }
public static boolean compareHBD(Molecule inputHBD) {
if (inputHBD.getHBD()>maxHBD) return true;
return false;
}
public static boolean compareHBA(Molecule inputHBA) {
if (inputHBA.getHBA()>maxHBA) return true;
return false;
}
public static boolean compareMW(Molecule inputMW) {
if (inputMW.getMW()>maxMW) return true;
return false;
}
public static boolean comparelogP(Molecule inputlogP) {
if (inputlogP.getlogP()>maxlogP|| inputlogP.getlogP()<minlogP) return true;
return false; 
}

public static boolean comparepKa(Molecule inputKa) {
if (inputKa.getpKa()>maxpKa || inputKa.getpKa()<minpKa) return true;
return false; 
}
 }