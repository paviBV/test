package com.officem.dao;

import com.officem.datastore.DataStore;
import com.officem.entities.OfficeMain;

import java.util.List;

public class Dao {
    DataStore dataStore = new DataStore();

    public void setOfficeMain(int id, String name, int rank){
        dataStore.setOfficeMain(id,name,rank);
    }

    public List<OfficeMain> officeMainList(){
       return dataStore.officeMainList();
    }
}
