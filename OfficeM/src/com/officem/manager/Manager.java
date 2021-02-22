package com.officem.manager;

import com.officem.dao.Dao;

public class Manager {
    Dao dao = new Dao();


    public void setOfficeMain(int id, String name, int rank){

        dao.setOfficeMain(id,name,rank);
    }

    public void fetch(){
        System.out.println("Total records in Table");
        for (int i = 0; i < dao.officeMainList().size(); i++) {
            System.out.println(dao.officeMainList().get(i));
        }
    }
    public void fetchSingleRecord(int id){
//        System.out.println("Single"      );
        for (int i = 0; i < dao.officeMainList().size(); i++) {
            if (dao.officeMainList().get(i).getId()==id) {
                System.out.println(dao.officeMainList().get(i));
            }
        }
    }
    public void updateRecord(int id, String name, int rank){
//        System.out.println("up");
        for (int i = 0; i < dao.officeMainList().size(); i++) {
            if (dao.officeMainList().get(i).getId()==id) {
                dao.officeMainList().get(i).setName(name);
                dao.officeMainList().get(i).setRank(rank);
                System.out.println(dao.officeMainList().get(i));
            }
        }
    }
    public void deleteRecord(int id){
//        System.out.println("delete"      );
        for (int i = 0; i < dao.officeMainList().size(); i++) {
            if (dao.officeMainList().get(i).getId()==id) {
                dao.officeMainList().remove(i);
            }
        }

        for (int i = 0; i < dao.officeMainList().size(); i++) {
            if (dao.officeMainList().get(i).getId()==id) {
                System.out.println("Not deleted");
                break;
            }else{
                System.out.println(" File deleted");
                break;
            }
        }
    }
}
