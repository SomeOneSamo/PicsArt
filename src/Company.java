public class Company {
    private String companyName = "There is no company chosen";
    private String companyNameCopy = "There is no company chosen";
    private int numberOfEmployees = 1;
    private int numberOfEmployeesCopy = 1;
    private int budget = 1000;
    private int budgetCopy = 1000;
    private String headOfCompany = "This company has no CEO";
    private String headOfCompanyCopy = "This company has no CEO";
    private boolean isClosed = false;

    public void setCompanyName(String companyName) {
        if (!companyName.isEmpty()) {
            this.companyName = companyName;
            companyNameCopy = companyName;
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        if (numberOfEmployees > 0) {
            this.numberOfEmployees = numberOfEmployees;
            numberOfEmployeesCopy = numberOfEmployees;
        } else
            System.out.println("There should be at least one worker to run " + this.companyName + " company");
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setBudget(int budget) {
        if (budget > 0) {
            this.budget = budget;
            budgetCopy = budget;
        } else
            System.out.println(this.companyName + " company will have budget deficit");
    }

    public int getBudget() {
        return budget;
    }

    public void setHeadOfCompany(String headOfCompany) {
        if (!headOfCompany.isEmpty()) {
            this.headOfCompany = headOfCompany;
            headOfCompanyCopy = headOfCompany;
        }
    }

    public String getHeadOfCompany() {
        return headOfCompany;
    }

    public void closeCompany() {
        if (!isClosed) {
            budget = 0;
            numberOfEmployees = 0;
            headOfCompany = "No CEO";
            companyName = "This company no longer exists";
            isClosed = true;
        } else System.out.println("This company is already closed");
    }

    public void reopenCompany() {
        if (isClosed) {
            budget = budgetCopy;
            numberOfEmployees = numberOfEmployeesCopy;
            headOfCompany = headOfCompanyCopy;
            companyName = companyNameCopy;
            isClosed = false;
        } else
            System.out.println("This company is already open");
    }
}
