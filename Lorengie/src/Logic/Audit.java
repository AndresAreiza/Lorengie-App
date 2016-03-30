package Logic;

import java.util.Date;

/**
 *
 * @author Andres
 */
public class Audit {
    private String idProcess;
    private int operation;
    private Date dateAudit;
    private String username;

    public Audit() {
    }

    public Audit(String idProcess, int operation, Date dateAudit, String username) {
        this.idProcess = idProcess;
        this.operation = operation;
        this.dateAudit = dateAudit;
        this.username = username;
    }

    public String getIdProcess() {
        return idProcess;
    }

    public void setIdProcess(String idProcess) {
        this.idProcess = idProcess;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public Date getDateAudit() {
        return dateAudit;
    }

    public void setDateAudit(Date dateAudit) {
        this.dateAudit = dateAudit;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
