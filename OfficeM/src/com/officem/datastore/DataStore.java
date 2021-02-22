package com.officem.datastore;

import com.officem.entities.OfficeMain;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    List<OfficeMain> officeMainList = new ArrayList<>();

    public void setOfficeMain(int id, String name, int rank){

        OfficeMain officeMain = new OfficeMain();
        officeMain.setId(id);
        officeMain.setName(name);
        officeMain.setRank(rank);
        officeMainList.add(officeMain);

    }
//    public void getOfficeMain(){
//        setOfficeMain(111,"dong", 5);
//        setOfficeMain(112, " kiyara", 8);
//        setOfficeMain(113,"Dramatic", 3);
//    }

    public List<OfficeMain> officeMainList(){
       return officeMainList;
    }

}
