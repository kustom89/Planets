package co.httpsswapi.planets2.models;

import com.orm.SugarRecord;

public class BaseSugar extends SugarRecord {

    public BaseSugar() {
    }

    private long server_id;

    public long getServer_id() {
        return server_id;
    }

    public void setServer_id(long server_id) {
        this.server_id = server_id;
    }

    public void creqte(){
        setServer_id(getId());
        setId(null);
        save();
    }

    @Override
    public long save() {
        return super.save();
    }
}
