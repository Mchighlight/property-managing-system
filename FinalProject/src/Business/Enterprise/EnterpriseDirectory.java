package Business.Enterprise;


import Business.Network.Network;
import java.util.ArrayList;

public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type, String networkName){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Finance){
            enterprise=new FinanceEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Furnishing){
            enterprise=new FurnishingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.InvestmentManager){
            enterprise=new InvestmentManagerEnterprise(name);
            enterpriseList.add(enterprise);
        }
       else if(type==Enterprise.EnterpriseType.RealEstate){
            enterprise=new RealEstateEnterprise(name);
            enterpriseList.add(enterprise);
        }
        enterprise.setNetworkName(networkName);
        return enterprise;
    }
    
    
    public Enterprise findenterprise(String name) {

        for (Enterprise enterprise : enterpriseList) {
            if (enterprise.getName().equals(name)) {
                return enterprise;
            }
        }
        return null;
    }
    
    
}
