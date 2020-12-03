package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;


public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private String networkName ;
    
    public enum EnterpriseType{
        Finance("Finance"),
        Furnishing("Furnishing"),
        InvestmentManager("InvestmentManager"),
        RealEstate("RealEstate");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue(){
            return value;
        }
        @Override
        public String toString(){
            return value;
        }
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public void setNetworkName(String name ){
        this.networkName = name ;     
    }
    
    public String getNetworkName(){
        if ( this.networkName == null ){
            this.setNetworkName("henry");
        }
        return this.networkName;
    }
    
}
