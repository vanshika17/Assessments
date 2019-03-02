import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Implement Composite Design Pattern to maintaining the directories of employees on the basis of departments.
//component
interface Directory{
    void info();
}
//leaf
class Developer implements Directory{
    private int Dev_id;
    private String Competency;

    public Developer(int dev_id, String competency) {
        Dev_id = dev_id;
        Competency = competency;
    }

    public int getDev_id() {
        return Dev_id;
    }

    public void setDev_id(int dev_id) {
        Dev_id = dev_id;
    }

    public String getCompetency() {
        return Competency;
    }

    public void setCompetency(String competency) {
        Competency = competency;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "Dev_id=" + Dev_id +
                ", Competency='" + Competency + '\'' +
                '}';
    }

    @Override
    public void info() {
        System.out.println("Developer{" +
                "Dev_id=" + Dev_id +
                ", Competency='" + Competency + '\'' +
                '}');
    }
}
class Manager implements Directory{
    private int Manager_id;
    private String Department ;

    public Manager(int manager_id, String department) {
        Manager_id = manager_id;
        Department = department;
    }

    public int getManager_id() {
        return Manager_id;
    }

    public void setManager_id(int manager_id) {
        Manager_id = manager_id;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Manager_id=" + Manager_id +
                ", Department='" + Department + '\'' +
                '}';
    }

    @Override
    public void info() {
        System.out.println("Manager{" +
                "Manager_id=" + Manager_id +
                ", Department='" + Department + '\'' +
                '}');
    }
}

//composites
class DeveloperDir implements Directory{
    private List<Directory> developerList=new ArrayList<>();

    public DeveloperDir() {
    }

    public List<Directory> getDeveloperList() {
        return developerList;
    }

    public void setDeveloperList(List<Directory> developerList) {
        this.developerList = developerList;
    }

    @Override
    public void info() {
        System.out.println("In developer dir ");
        developerList.forEach(Directory::info);
    }
}

class ManagerDir implements Directory{
    private List<Directory> managerList=new ArrayList<>();

    public ManagerDir() {
    }

    public List<Directory> getManagerList() {
        return managerList;
    }

    public void setManagerList(List<Directory> managerList) {
        this.managerList = managerList;
    }

    @Override
    public void info() {
        System.out.println("In manager dir ");
        managerList.forEach(Directory::info);
    }
}
class Company implements Directory{
    private List<Directory> CompanyDirectory = new ArrayList<>();

    public Company() {
    }

    public List<Directory> getCompanyDirectory() {
        return CompanyDirectory;
    }

    public void setCompanyDirectory(List<Directory> companyDirectory) {
        CompanyDirectory = companyDirectory;
    }

    @Override
    public void info() {
        System.out.println("In company dir ");
        CompanyDirectory.forEach(Directory::info);
    }
}
//client
public class CompositePattern {
    public static void main(String[] args) {
        Developer developer1=new Developer(1,"Bigdata");
        Developer developer2=new Developer(2,"FEEN");
        Developer developer3=new Developer(3,"Java");

        Manager manager1=new Manager(1,"Sales");
        Manager manager2=new Manager(2,"Technical");

        DeveloperDir developerDir=new DeveloperDir();
        developerDir.getDeveloperList().add(developer1);
        developerDir.getDeveloperList().add(developer2);
        developerDir.getDeveloperList().add(developer3);

        ManagerDir managerDir=new ManagerDir();
        managerDir.getManagerList().add(manager1);
        managerDir.getManagerList().add(manager2);

        Company company=new Company();
        company.getCompanyDirectory().add(managerDir);
        company.getCompanyDirectory().add(developerDir);

        company.info();

    }
}
