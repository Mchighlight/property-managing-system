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

    public WorkQueue() {
        workRequestList = new ArrayList();
        VisitRequestList = new ArrayList();
        furnishingRequestList = new ArrayList();
        boardmemberRequestList = new ArrayList();
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

    public WorkRequest findWorkRequestList(int orderID) {
        for (WorkRequest object : workRequestList) {
            if (object.getOrderID() == orderID) {
                return object;
            }
        }
        return null;

    }

}
