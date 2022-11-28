public class Scores {
public static void main(String[]args) 
{
    
ArrayList<Molecule> highestScoring = new ArrayList<Molecule>(); highestScoring.add(new Molecule("Telmisartan", 1,4,514.6,3.2,4.45)); highestScoring.add(new Molecule("Pyrivinium Pamoate",2,8,1151.4,1.41,1.48)); highestScoring.add(new Molecule("Eltrombopag",3,7,442.5,6.03,3.97)); highestScoring.add(new Molecule("Imatinib",2,7,493.6,3.0,11.71)); highestScoring.add(new Molecule("Irinotecan",1,8,586.7,3.2,12.45)); highestScoring.add(new Molecule("Tadalafil",1,4,389.4,1.7,15.17)); highestScoring.add(new Molecule("Ibrutinib",1,6,440.5,3.97,3.74)); highestScoring.add(new Molecule("Clofazimine",1,4,473.4,7.66,8.51)); highestScoring.add(new Molecule("Baicalein",3,7,270.24,2.71,6.76)); highestScoring.add(new Molecule("Rifabutin",5,14,847.0,4.1,6.9)); highestScoring.add(new Molecule("Tolvaptan",2,3,448.9,4.75,11.76)); highestScoring.add(new Molecule("Sorafenib",3,7,464.8,3.8,11.55)); highestScoring.add(new Molecule("Autovaquone",1,3,366.8,5.8,5.53)); highestScoring.add(new Molecule("SynuClean-D",1,9,354.2,1.29,4.18)); highestScoring.add(new Molecule("Itraconazole",0,9,705.6,5.66,3.70));
for(int x =0; x<highestScoring.size(); x++) 
{
System.out.println(highestScoring.get(x).getName() + ": " + DifferenceConstant.getConstant(highestScoring.get(x)));
}

} 
}