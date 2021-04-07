public class Main {
    public static void main(String[] args) {
        Company company1, company2, company3, company4;
        company1 = new Company();
        company2 = new Company();
        company3 = new Company();
        company4 = new Company();

        company1.setCompanyName("Coca-Cola");
        System.out.println(company1.getCompanyName());
        company2.setCompanyName("Nike");
        System.out.println(company2.getCompanyName());
        company3.setCompanyName("Google");
        System.out.println(company3.getCompanyName());
        company4.setCompanyName("Apple");
        System.out.println(company4.getCompanyName());

        company1.setBudget(1200);
        company2.setBudget(800);
        company3.setBudget(1500);
        company4.setBudget(1800);

        System.out.println("Sort companies by their budget size (from lowest to highest)");
        Company[] array = {company1, company2, company3, company4};
        Company companyCopy;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++){
                if(array[i].getBudget()>array[j].getBudget())
                {
                    companyCopy = array[i];
                    array[i] = array[j];
                    array[j] = companyCopy;
                }
            }
        }

        for(Company i : array)
        {
            System.out.println(i.getCompanyName() + "'s budget is: " + i.getBudget());
        }

        System.out.println("Closing " + company4.getCompanyName() + "-------------------------");

        company4.setNumberOfEmployees(200);
        company4.setHeadOfCompany("Tim Cook");
        company4.closeCompany();
        System.out.println("Company name: " + company4.getCompanyName());
        System.out.println("Company budget: " + company4.getBudget());
        System.out.println("Number of employees: " + company4.getNumberOfEmployees());
        System.out.println("CEO of company: " + company4.getHeadOfCompany());

        System.out.println("Closing Apple (" + company4.getCompanyName() + ") again");

        company4.closeCompany();

        company4.reopenCompany();

        System.out.println("Reopening " + company4.getCompanyName());

        System.out.println("Company name: " + company4.getCompanyName());
        System.out.println("Company budget: " + company4.getBudget());
        System.out.println("Number of employees: " + company4.getNumberOfEmployees());
        System.out.println("CEO of company: " + company4.getHeadOfCompany());
    }
}
