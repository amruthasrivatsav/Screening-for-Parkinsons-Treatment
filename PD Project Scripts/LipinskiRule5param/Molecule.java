public class Molecule {
private int HBD;
private int HBA;
private double MW;
private double logP;
private double pKa;
private String Name;
public Molecule(String name, int hbd, int hba, double mw, double logp, double pka) {
    Name = name; 
    HBD = hbd; 
    HBA = hba; 
    MW = mw; 
    logP = logp; 
    pKa=pka;
}
    public String getName() {
        return Name; }
    public int getHBD() {
        return HBD; }
    public int getHBA() {
        return HBA; }
    public double getMW() {
        return MW; }
    public double getlogP() {
        return logP; }
     public double getpKa() {
        return pKa;
    
    }     

}                  