package controllers;

import entities.Record;
import java.util.List;

public class RecordDAO extends BaseController
{
    public RecordDAO()
    {
        super();
    }
    
    public Record getRecord(Long id) 
    {
        return getEM().find(Record.class, id);
    }
    
    public List<Record> getRecords()
    {
        return getEM().createNativeQuery("SELECT * FROM Records r", Record.class).getResultList();
    }
}
