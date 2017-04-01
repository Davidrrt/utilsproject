package mg.itu.utilproject.modele;

import java.util.Date;

public class SousTache {

    private long idSoustache;
    private String descriptionsoustache;
    private Date datesoutachedebut;
    private Date datesoutachefin;
    private int predecesseursoustache;
    private Date deadlinesoustache;

    public SousTache(long idSoustache, String descriptionsoustache, Date datesoutachedebut, Date datesoutachefin, int predecesseursoustache, Date deadlinesoustache) {
        this.idSoustache = idSoustache;
        this.descriptionsoustache = descriptionsoustache;
        this.datesoutachedebut = datesoutachedebut;
        this.datesoutachefin = datesoutachefin;
        this.predecesseursoustache = predecesseursoustache;
        this.deadlinesoustache = deadlinesoustache;
    }

    public long getIdSoustache() {
        return idSoustache;
    }

    public void setIdSoustache(long idSoustache) {
        this.idSoustache = idSoustache;
    }

    public String getDescriptionsoustache() {
        return descriptionsoustache;
    }

    public void setDescriptionsoustache(String descriptionsoustache) {
        this.descriptionsoustache = descriptionsoustache;
    }

    public Date getDatesoutachedebut() {
        return datesoutachedebut;
    }

    public void setDatesoutachedebut(Date datesoutachedebut) {
        this.datesoutachedebut = datesoutachedebut;
    }

    public Date getDatesoutachefin() {
        return datesoutachefin;
    }

    public void setDatesoutachefin(Date datesoutachefin) {
        this.datesoutachefin = datesoutachefin;
    }

    public int getPredecesseursoustache() {
        return predecesseursoustache;
    }

    public void setPredecesseursoustache(int predecesseursoustache) {
        this.predecesseursoustache = predecesseursoustache;
    }

    public Date getDeadlinesoustache() {
        return deadlinesoustache;
    }

    public void setDeadlinesoustache(Date deadlinesoustache) {
        this.deadlinesoustache = deadlinesoustache;
    }
    

}
