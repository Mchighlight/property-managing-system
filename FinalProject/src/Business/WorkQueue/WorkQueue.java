/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<VisitRequest> VisitRequestList;
    private ArrayList<FurnishingRequest> furnishingRequestList;
    private ArrayList<BoardMemberRequest> boardmemberRequestList;
    private ArrayList<SignLeaseRequest> signLeaseRequestList;
    private ArrayList<MarketingRequest> marketingRequestList;
    private ArrayList<RepairRequest> repairRequestRequestList;
    private ArrayList<CustomerSupportRequest> customerSupportRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
        VisitRequestList = new ArrayList();
        furnishingRequestList = new ArrayList();
        boardmemberRequestList = new ArrayList();
        signLeaseRequestList = new ArrayList();
        marketingRequestList = new ArrayList();
        repairRequestRequestList = new ArrayList();
        customerSupportRequestList = new ArrayList();
    }

    public ArrayList<RepairRequest> getRepairRequestRequestList() {
        return repairRequestRequestList;
    }

    public void setRepairRequestRequestList(ArrayList<RepairRequest> repairRequestRequestList) {
        this.repairRequestRequestList = repairRequestRequestList;
    }

    public ArrayList<CustomerSupportRequest> getCustomerSupportRequestList() {
        return customerSupportRequestList;
    }

    public void setCustomerSupportRequestList(ArrayList<CustomerSupportRequest> customerSupportRequestList) {
        this.customerSupportRequestList = customerSupportRequestList;
    }

    public ArrayList<MarketingRequest> getMarketingRequestList() {
        return marketingRequestList;
    }

    public void setMarketingRequestList(ArrayList<MarketingRequest> marketingRequestList) {
        this.marketingRequestList = marketingRequestList;
    }

    public ArrayList<SignLeaseRequest> getSignLeaseRequestList() {
        return signLeaseRequestList;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public ArrayList<VisitRequest> getVisitRequestList() {
        return VisitRequestList;
    }

    public ArrayList<FurnishingRequest> getFurnishingRequestList() {
        return furnishingRequestList;
    }

    public ArrayList<BoardMemberRequest> getBoardmemberRequestList() {
        return boardmemberRequestList;
    }

    public BoardMemberRequest findBoardmemberRequest(int orderID) {
        for (BoardMemberRequest object : boardmemberRequestList) {
            if (object.getOrderID() == orderID) {
                return object;
            }
        }
        return null;

    }

    public FurnishingRequest findFurnishingrequest(int orderID) {
        for (FurnishingRequest object : furnishingRequestList) {
            if (object.getOrderID() == orderID) {
                return object;
            }
        }
        return null;

    }
    
    public FurnishingRequest findFurnishingrequest( String Property) {
        for (FurnishingRequest object : furnishingRequestList) {
            if (object.getRequirement() == Property) {
                return object;
            }
        }
        return null;

    }


    public WorkRequest findWorkRequestList(int orderID) {
        for (WorkRequest object : workRequestList) {
            if (object.getOrderID() == orderID) {
                return object;
            }
        }
        return null;

    }

    public SignLeaseRequest findSignLeaseRequest(int orderID) {
        for (SignLeaseRequest object : signLeaseRequestList) {
            if (object.getOrderID() == orderID) {
                return object;
            }
        }
        return null;

    }

    public MarketingRequest findMarketingRequest(int orderID) {
        for (MarketingRequest object : marketingRequestList) {
            if (object.getOrderID() == orderID) {
                return object;
            }
        }
        return null;

    }

    public void setSignLeaseRequestList(ArrayList<SignLeaseRequest> slr) {
        this.signLeaseRequestList = slr;
    }

}
