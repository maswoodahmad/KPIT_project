//package inheritence;
//
//public class AdharTester {
//CEC cec = new CEC();
//Adhar AC = new Adhar();
//AC.set
//
//
//Wife  w = new Wife();
//
//}
//
//class Husband{
//    String name;
//    int age;
//    String add;
//    String guardianName;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getAdd() {
//        return add;
//    }
//
//    public void setAdd(String add) {
//        this.add = add;
//    }
//
//    public String getGuardianName() {
//        return guardianName;
//    }
//
//    public void setGuardianName(String guardianName) {
//        this.guardianName = guardianName;
//    }
//}
//class Wife{
//    String fName;
//    String lName;
//    int age;
//    String add;
//    String guardianName;
//
//    public boolean getIsMarried() {
//        return isMarried;
//    }
//
//    public void setMarried(boolean married) {
//        isMarried = married;
//    }
//
//    boolean isMarried;
//    public String getfName() {
//        return fName;
//    }
//
//    public void setfName(String fName) {
//        this.fName = fName;
//    }
//
//    public String getlName() {
//        return lName;
//    }
//
//    public void setlName(String lName) {
//        this.lName = lName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getAdd() {
//        return add;
//    }
//
//    public void setAdd(String add) {
//        this.add = add;
//    }
//
//    public String getGuardianName() {
//        return guardianName;
//    }
//
//    public void setGuardianName(String guardianName) {
//        this.guardianName = guardianName;
//    }
//}
//
//class Adhar{
//    public String getAdd() {
//        return add;
//    }
//
//    public void setAdd(String add) {
//        this.add = add;
//    }
//
//    public String getGuardian() {
//        return guardian;
//    }
//
//    public void setGuardian(String guardian) {
//        this.guardian = guardian;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    String adharType;
//
//    public String getfName() {
//        return fName;
//    }
//
//    public void setfName(String fName) {
//        this.fName = fName;
//    }
//
//    public String getlName() {
//        return lName;
//    }
//
//    public void setlName(String lName) {
//        this.lName = lName;
//    }
//
//    String fName;
// String lName;
// String add;
//  String guardian;
//  int age;
//
//    public String getAdharType() {
//        return adharType;
//    }
//
//    public void setAdharType(String adharType) {
//        this.adharType = adharType;
//    }
//
//    void showInfo()
//    {
//        System.out.println("first name"+ fName);
//        System.out.println("last name"+ lName);
//        System.out.println("age"+ age);
//        System.out.println("add"+ add);
//        System.out.println("guardian name"+ guardian);
//
//    }
//
//}
//
//class CEC{
//
//
//    Adhar makeAdhar( Husband h, Wife f )
//    {
//        Adhar ad = new Adhar();
//
//        if(h.getAge()>18)
//            ad.setAdharType("adult");
//        else ad.setAdharType("adult");
//
//        ad.setAdd(h.getAdd());
//        f.setMarried(true);
//        if(f.getIsMarried())
//        {
//            ad.setGuardian("Rohit shukla");
//            ad.setlName("shukla");
//
//        }else{
//            ad.setGuardian(f.guardianName);
//           ad.setGuardian(h.name);
//
//        }
//
//        if(f.getAge()>18)
//            ad.setAdharType("adult");
//        else ad.setAdharType("adult");
//
//
//return ad;
//
//
//
//    }
//
//
//}